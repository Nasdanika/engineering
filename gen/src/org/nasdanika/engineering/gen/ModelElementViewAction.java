package org.nasdanika.engineering.gen;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.PropertyComputer;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.ConfigurationException;
import org.nasdanika.common.persistence.Marked;
import org.nasdanika.common.persistence.Marker;
import org.nasdanika.common.persistence.SourceResolver;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionFilter;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.LabelImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.RowContainer.Row.Cell;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;

/**
 * Base class for Core ViewAction adapters.
 * @author Pavel
 *
 * @param <T>
 */
public class ModelElementViewAction<T extends ModelElement> implements ViewAction {
	
	protected T target;
	private String id;
	protected EngineeringViewActionAdapterFactory factory;
		
	protected ModelElementViewAction(T target, EngineeringViewActionAdapterFactory factory) {
		this.target = target;		
		this.factory = factory;
		try {
			id = Hex.encodeHexString(MessageDigest.getInstance("SHA-256").digest(target.getUri().getBytes(StandardCharsets.UTF_8)));
		} catch (NoSuchAlgorithmException e) {
			throw new NasdanikaException(e);
		}
	}
		
	@Override
	public ActionActivator getActivator() {
		String contextUri = (String) EObjectAdaptable.adaptTo(target, Context.class).get(Context.BASE_URI_PROPERTY);
		Marked marked = EObjectAdaptable.adaptTo(target, Marked.class);
		StringBuilder path = new StringBuilder();
		EReference eContainmentReference = target.eContainmentFeature();
		if (eContainmentReference == null) {
			path.append(contextUri);
			String resourcePath = factory.resolveResourcePath(target.eResource());			
			if (!Util.isBlank(resourcePath)) {
				path.append(resourcePath);
			}
			EList<EObject> resourceContents = target.eResource().getContents();
			if (resourceContents.size() > 1) {
				String localPath = target.getPath();
				if (Util.isBlank(localPath) && target.eResource() != null) {
					path.append(resourceContents.indexOf(target));
				} else {
					path.append(localPath);
				}
			} else if (path.toString().endsWith("/")) {
				path.replace(path.length()-1, path.length(), "");
			}
		} else {
			path.append(Util.camelToKebab(eContainmentReference.getName()));
			if (eContainmentReference.isMany()) {
				path.append("/");			
				String localPath = target.getPath();
				if (Util.isBlank(localPath)) {
					EObject eContainer = target.eContainer();
					if (eContainer != null) {
						path.append(getDefaultPath());
					}
				} else {
					path.append(localPath);
				}
			}	
		}		
		if (target.eClass().getEReferences().stream().filter(EReference::isContainment).findAny().isPresent()) {
			path.append("/index");
		}
		path.append(".html");				
		return new PathNavigationActionActivator(this, contextUri, path.toString(), marked == null ? null : marked.getMarker());			
	}
	
	protected String getDefaultPath() {
		return String.valueOf(((List<?>) target.eContainer().eGet(target.eContainmentFeature())).indexOf(this));
	}

	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.get(BootstrapFactory.class, BootstrapFactory.INSTANCE);
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment();
		ret.content(propertiesTable(viewGenerator, progressMonitor));
		Object diagram = generateDiagram();
		if (diagram != null) {
			ret.content(diagram);
		}
		
		String description = target.getDescription();
		if (!Util.isBlank(description)) {
			ret.content(getContext().interpolateToString(description));
		}
		
		return ret;
	}
	
	/**
	 * Override to generate a diagram to be displayed on the top of the page.
	 * @return
	 */
	protected Object generateDiagram() {
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Action> getChildren() {
		ArrayList<Action> children = new ArrayList<Action>();
		EClass targetClass = target.eClass();
		for (EReference ref: targetClass.getEAllReferences()) {
			if (isChildFeature(ref)) {
				children.addAll(ViewAction.adaptToViewActionNonNullSorted((Collection<ModelElement>) target.eGet(ref)));
			}
		}
		
		children.addAll(target.getActions().stream().map(ModelElementViewAction::adaptToActionNonNull).collect(Collectors.toList()));		
		
		return children;
	}
		
	protected boolean isChildFeature(EReference ref) {
		return ref.isContainment() && ref.isMany() && EngineeringPackage.Literals.MODEL_ELEMENT.isSuperTypeOf(ref.getEReferenceType());
	}

	protected boolean isPropertyFeature(EStructuralFeature sf) {
		if (sf instanceof EAttribute) {
			if (sf == EngineeringPackage.Literals.MODEL_ELEMENT__DESCRIPTION) {
				return false;
			}
			if (sf == EngineeringPackage.Literals.MODEL_ELEMENT__PATH) {
				return false;
			}
			if (sf == EngineeringPackage.Literals.NAMED_ELEMENT__NAME) {
				return false;
			}
			
			return true;
		}
		
		EReference ref = (EReference) sf;
		return !ref.isContainment() && !ref.isMany() && EngineeringPackage.Literals.MODEL_ELEMENT.isSuperTypeOf(ref.getEReferenceType());
	}

	@Override
	public boolean isDisabled() {
		return false;
	}

	@Override
	public String getConfirmation() {
		return null;
	}

	@Override
	public boolean isInRole(String role) {
		return Action.Role.NAVIGATION.equals(role);
	}

	@Override
	public Action getParent() {
		EObject eContainer = target.eContainer();
		if (eContainer == null) {
			return factory.getParent();
		}
		if (eContainer instanceof ModelElement) {
			return ((ModelElement) eContainer).adaptTo(ViewAction.class);
		}
		return null;
	}

	@Override
	public String getIcon() {
		return EmfUtil.getNasdanikaAnnotationDetail(target.eClass(), "icon");
	}

	@Override
	public String getText() {
		return target.toString();
	}

	@Override
	public String getTooltip() {
		return null;
	}

	@Override
	public Color getColor() {
		return null;
	}

	@Override
	public boolean isOutline() {
		return false;
	}

	@Override
	public String getDescription() {
		URL descriptionResource = getClass().getResource(Util.camelToKebab(target.eClass().getName())+".md");
		if (descriptionResource == null) {
			return null;
		}
		try {
			String descriptionString = DefaultConverter.INSTANCE.toString(descriptionResource.openStream());
			return getContext().get(MarkdownHelper.class, MarkdownHelper.INSTANCE).markdownToHtml(getContext().interpolateToString(descriptionString));
		} catch (Exception e) {
			return "Exception rendering description: " + e;
		}
	}

	/**
	 * @return Action context built from the resource set context plus link resolver and "base-uri" property containing relative URI's of the site root. 
	 */
	protected Context getContext() {
		URI thisUri = URI.createURI(((NavigationActionActivator) getActivator()).getUrl(null));
		Context targetContext = EObjectAdaptable.adaptTo(target, Context.class);
		URI baseUri = URI.createURI(targetContext.get(Context.BASE_URI_PROPERTY).toString());
		URI relativeBaseUri = baseUri.deresolve(thisUri, true, true, true);
		MutableContext ret = targetContext.fork();
		ret.put(Context.BASE_URI_PROPERTY, relativeBaseUri);
		
		ret.put("link", new PropertyComputer() {
			
			@SuppressWarnings("unchecked")
			@Override
			public <U> U compute(Context context, String key, String path, Class<U> type) {
				String prefix = "<a href=\"";
				if (path.startsWith(prefix)) {
					path = path.substring(prefix.length(), path.indexOf("\"", prefix.length() + 1));
				}
				int idx = path.indexOf(" ");
				String text = idx == -1 ? null : path.substring(idx + 1);
				URI uri = URI.createURI(idx == -1 ? path : path.substring(0, idx));
				EObject eObj = target.eResource().getResourceSet().getEObject(uri, false);
				if (eObj == null) {
					return null;
				}

				Action action = ViewAction.adaptToViewActionNonNull(eObj);
				String ref = ((NavigationActionActivator) action.getActivator()).getUrl(thisUri.toString());
				if (!Util.isBlank(text)) {
					action = new ActionFilter<Action>(action) {
						
						@Override
						public String getText() {
							return text;
						}
								
					};
				}

				ViewGenerator viewGenerator = new ViewGeneratorImpl(context, null, null);
				Tag label = viewGenerator.getHTMLFactory().tag(TagName.a);
				viewGenerator.label(action, label);
				label.attribute("href", ref);
				return (U) label.toString();
			}
		});
		
		return ret;
	}
	
	protected Table	propertiesTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table pTable = bootstrapFactory.table().bordered(); 
		pTable.toHTMLElement().style().width("auto") ;
		
		Marker marker = getMarker();
		if (marker != null) {
			Row locationRow = pTable.row(); 
			locationRow.header("Location");
			locationRow.cell(location(marker, viewGenerator, progressMonitor));			
		}
		
		for (EStructuralFeature sf: target.eClass().getEAllStructuralFeatures()) {
			if (isPropertyFeature(sf) && (sf.isDerived() || target.eIsSet(sf))) {
				Object fv = target.eGet(sf);
				if (fv == null || (fv instanceof String && Util.isBlank((String) fv))) {
					continue;
				}
				Object featureValue = featureValue(sf, fv, viewGenerator, progressMonitor);
				if (featureValue != null) {
					Row fRow = pTable.row(); 
					fRow.header(Util.nameToLabel(sf.getName()));
					fRow.cell(featureValue);
				}
			}
		}		
		
		return pTable;
	}	
	
	protected Object location(Marker marker, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Context context = getContext();
		if (context == null) {
			return marker;
		}
		
		SourceResolver sourceResolver = context.get(SourceResolver.class);
		if (sourceResolver == null) {
			return marker;
		}
		
		SourceResolver.Link source = sourceResolver.getSource(marker);
		if (source == null) {
			return marker;
		}
				
		if (Util.isBlank(source.getLocation())) {
			return source.getText();
		}
		
		return viewGenerator.getHTMLFactory().link(source.getLocation(), source.getText());
	}
	
	protected Object featureValue(EStructuralFeature feature, Object value, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {		
		if (value instanceof EObject) {
			Action va = EObjectAdaptable.adaptTo((EObject) value, ViewAction.class);
			if (va != null) {
				return viewGenerator.link(va);
			}
		} else if (value instanceof Collection) {
			Collection<?> vc = (Collection<?>) value;
			if (vc.isEmpty()) {
				return null;
			}
			if (vc.size() == 1) {
				return featureValue(feature, vc.iterator().next(), viewGenerator, progressMonitor);
			}			
			HTMLFactory htmlFactory = viewGenerator.getHTMLFactory();
			Tag ret = htmlFactory.tag(TagName.ol);
			for (Object e: (Iterable<?>) value) {
				ret.content(htmlFactory.tag(TagName.li, featureValue(feature, e, viewGenerator, progressMonitor)));
			}
			return ret;
		}
		return value;
	}

	@Override
	public String getNotification() {
		return null;
	}

	@Override
	public Object getId() {
		return id;
	}

	@Override
	public Label getCategory() {
		EReference cf = target.eContainmentFeature();
		if (cf == null) {
			return null;
		}
		
		EObject ec = target.eContainer();
		
		// not exactly valid approach - should use isChildFeature of the container view action, but need to "peel" proxy for that.
		if (ec.eClass().getEAllReferences().stream().filter(this::isChildFeature).count() == 1) {
			return null;
		}		
		
		LabelImpl category = new LabelImpl();
		category.setText(EmfUtil.getNasdanikaAnnotationDetail(cf, "label", Util.nameToLabel(cf.getName()))); 
		category.setIcon(EmfUtil.getNasdanikaAnnotationDetail(cf, "icon"));
		if (ec instanceof ModelElement) {
			category.setId(ViewAction.adaptToViewActionNonNull(ec).getId() + "-" + cf.getName());
		} else {
			category.setId(cf.getName());
		}
		return category;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((target == null) ? 0 : target.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;		
		ModelElementViewAction<?> other = (ModelElementViewAction<?>) obj;
		return target == other.target;
	}
	
	protected static Action adaptToActionNonNull(EObject obj) {
		Action ret = EObjectAdaptable.adaptTo(obj, Action.class); 
		if (ret == null) {
			Marked marked = EObjectAdaptable.adaptTo(obj, Marked.class);
			throw new ConfigurationException("Action adapter not found for " + obj, marked);
		}
		
		return ret;
	}
	
	@Override
	public String toString() {
		return super.toString() + " -> " + target;
	}
	
	protected Marker getMarker() {
		Marked marked = EObjectAdaptable.adaptTo(target, Marked.class);
		return marked == null ? null : marked.getMarker();
	}

	@Override
	public SectionStyle getSectionStyle() {
		return SectionStyle.DEFAULT;
	}
	
	protected static final Comparator<Increment> INCREMENT_COMPARATOR = (a,b) -> {
		if (a == b) {
			return 0;
		}
		
		if (a == null) {
			return 1;
		}
		
		if (b == null) {
			return -1;
		}
		
		if (EcoreUtil.isAncestor(a, b)) {
			return -1;
		}
		
		if (EcoreUtil.isAncestor(b, a)) {
			return 1;
		}
		
		Date aStart = a.getStart();
		Date bStart = b.getStart();
		
		if (Objects.equals(aStart, bStart)) {
			return containmentPath(a).compareTo(containmentPath(b));
		}

		if (aStart == null) {
			return 1;
		}
		
		if (bStart == null) {
			return -1;
		}
		
		return aStart.before(bStart) ? -1 : 1;
	};
	
	protected static String containmentPath(EObject obj) {
		if (obj == null) {
			return null;
		}
		EObject eContainer = obj.eContainer();
		String cPath = containmentPath(eContainer);
		if (cPath == null) {
			return "";
		}
		EReference eContainmentFeature = obj.eContainmentFeature();
		String ret = cPath + "/" +	eContainmentFeature.getName();
		return eContainmentFeature.isMany() ? ret + (((List<?>) eContainer.eGet(eContainmentFeature)).indexOf(obj)) : ret;
	}
	
	protected static <T extends EObject> Table table(
			Collection<T> elements,
			Function<T, ViewBuilder> rowBuilderProvider,
			BiFunction<T, EStructuralFeature, ViewBuilder> cellBuilderProvider, 
			ViewGenerator viewGenerator, 
			ProgressMonitor progressMonitor,
			EStructuralFeature... features) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table ret = bootstrapFactory.table().bordered();
		Row header = ret.header().row().color(Color.INFO);
		for (EStructuralFeature feature: features) {
			header.header(Util.nameToLabel(feature.getName()));
		}
		
		for (T element: elements) {
			Row row = ret.body().row();
			for (EStructuralFeature feature: features) {
				Cell cell = row.cell();
				ViewBuilder cellBuilder = cellBuilderProvider == null ? null : cellBuilderProvider.apply(element, feature);
				if (cellBuilder == null) {
					Object value = element.eGet(feature);
					if (value != null) {
						if (value instanceof EObject) {
							ViewAction va = EObjectAdaptable.adaptTo((EObject) value, ViewAction.class);
							cell.toHTMLElement().content(va == null ? value : viewGenerator.link(va));
						} else {
							cell.toHTMLElement().content(value);							
						}
					}
				} else {
					cellBuilder.build(cell, viewGenerator, progressMonitor);
				}
			}
			
			if (rowBuilderProvider != null) {
				ViewBuilder rowBuilder = rowBuilderProvider.apply(element);
				if (rowBuilder != null) {
					rowBuilder.build(row, viewGenerator, progressMonitor);
				}
			}
		}
		return ret;
	}
	
	protected static Table issuesTable(
			Collection<Issue> issues,
			ViewGenerator viewGenerator, 
			ProgressMonitor progressMonitor,
			EStructuralFeature... features) {
		
		Function<Issue,ViewBuilder> rowBuilderProvider = issue -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				if (issue.isAvailable()) {
					((org.nasdanika.html.bootstrap.RowContainer.Row) target).color(Color.SUCCESS);
				}
				if (!issue.isWorkable()) {
					((org.nasdanika.html.bootstrap.RowContainer.Row) target).color(Color.PRIMARY); // TODO - configurable.					
				}
			}
			
		};
		BiFunction<Issue, EStructuralFeature, ViewBuilder> cellBuilderProvider = (issue, feature) -> {
			if (feature == EngineeringPackage.Literals.NAMED_ELEMENT__NAME) {
				return (target, vg, pm) -> {
					((org.nasdanika.html.bootstrap.RowContainer.Row.Cell) target).toHTMLElement().content(vg.link(ViewAction.adaptToViewActionNonNull(issue)));
				};
			}
			return null;
		};							
		
		return table(
				issues, 
				rowBuilderProvider, 
				cellBuilderProvider, 
				viewGenerator, 
				progressMonitor, 
				features);		
	}
		
	/**
	 * If issues collection is not empty creates a section action with issues grouped into increments with 
	 * specified features in the issue table. 
	 * @param issues
	 * @param features
	 * @return
	 */
	public Action issuesSection(
			Collection<Issue> issues, 
			String text, 
			String id, 
			EStructuralFeature... features) {
		
		return issuesSection(issues, text, id, getMarker(), getActivator(), features);
	}
	
	/**
	 * If issues collection is not empty creates a section action with issues grouped into increments with 
	 * specified features in the issue table. 
	 * @param issues
	 * @param features
	 * @return
	 */
	public static Action issuesSection(
			Collection<Issue> issues, 
			String text, 
			String id, 
			Marker marker, 
			ActionActivator activator,			
			EStructuralFeature... features) {
		
		if (issues.isEmpty()) {
			return null;
		}
		
		Map<IncrementValueObject, List<Issue>> increments = Util.groupBy(issues, IncrementValueObject::new);
		boolean backlogOnly = increments.size() == 1 && increments.keySet().iterator().next() == null;
		
		ActionImpl issuesSection = new ActionImpl() {
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Fragment ret = viewGenerator.getHTMLFactory().fragment();
				
				ret.content("TODO: summary table");
				
				if (backlogOnly) {
					ret.content(issuesTable(
							issues, 
							viewGenerator, 
							progressMonitor, 
							features));
				}
				return ret;
			};
			
			@Override
			public List<Action> getChildren() {
				return backlogOnly ? Collections.emptyList() : increments.keySet().stream().sorted().map(i -> incrementValueObjectAction(i, increments.get(i))).collect(Collectors.toList());
			}
			
			private Action incrementValueObjectAction(IncrementValueObject incrementValueObject, List<Issue> incrementIssues) {
				ActionImpl incrementSection = new ActionImpl() {
					
					@Override
					public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
						Fragment ret = viewGenerator.getHTMLFactory().fragment();
						
						// TODO - summary
						
						ret.content(issuesTable(
								incrementIssues, 
								viewGenerator, 
								progressMonitor, 
								features));
						
						return ret;
					}
					
				};
				
				incrementSection.getRoles().add(Action.Role.SECTION); 
				incrementSection.setText(Util.isBlank(incrementValueObject.getName()) ? "Backlog" : incrementValueObject.getName()); 			
				incrementSection.setActivator(new PathNavigationActionActivator(incrementSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#" + id + "-" + incrementValueObject.hashCode(), marker));
				return incrementSection; 					
			}
		};
		
		issuesSection.getRoles().add(Action.Role.SECTION); 
		issuesSection.setSectionStyle(SectionStyle.DEFAULT);
		issuesSection.setText(text); 			
		issuesSection.setActivator(new PathNavigationActionActivator(issuesSection, ((NavigationActionActivator) activator).getUrl(null), "#" + id, marker));

		return issuesSection;
	}
	
	
	// TODO - totals table, % completed - shared method for engineers, increments, releases, ... - in ModelElementView...
	// Generic table - takes a list of EObjects, BiConsumer of element and table row, BiFunction of element and feature to extract value, and var-arg of str features 
	
}
