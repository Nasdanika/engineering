package org.nasdanika.engineering.gen;

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
import java.util.Map.Entry;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.text.StringEscapeUtils;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.Context;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.Marker;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.FeatureAppearance;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.engineering.Release;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.RowContainer.Row.Cell;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.bootstrap.Text.Alignment;
import org.nasdanika.html.emf.HtmlEmfUtil;
import org.nasdanika.html.emf.SimpleEObjectViewAction;
import org.nasdanika.html.emf.ViewAction;

/**
 * Base class for Core ViewAction adapters.
 * @author Pavel
 *
 * @param <T>
 */
public class ModelElementViewAction<T extends ModelElement> extends SimpleEObjectViewAction<T> {
	
	private String id;
	protected EngineeringViewActionAdapterFactory factory;
		
	protected ModelElementViewAction(T target, EngineeringViewActionAdapterFactory factory) {
		super(target);		
		this.factory = factory;
		try {
			id = Hex.encodeHexString(MessageDigest.getInstance("SHA-256").digest(target.getUri().getBytes(StandardCharsets.UTF_8)));
		} catch (NoSuchAlgorithmException e) {
			throw new NasdanikaException(e);
		}
	}
	
	@Override
	protected String resolveResourcePath(Resource resource) {
		return factory.resolveResourcePath(resource);
	}
	
	@Override
	protected String getTargetPath() {
		return getSemanticElement().getPath();
	}
	
	@Override
	protected String getTargetDescription() {
		return getModelElementDescription(getSemanticElement());
	}
	
	/**
	 * Sorts features
	 */
	@Override
	protected List<EStructuralFeature> getFeatures() {
		return super.getFeatures().stream().sorted((Comparator<? super EStructuralFeature>) (a, b) -> featureLabelText(a).compareTo(featureLabelText(b))).collect(Collectors.toList());
	}
	
	/**
	 * To render descriptions for model elements without view actions.
	 * @param modelElement
	 * @return
	 */
	protected String getModelElementDescription(ModelElement modelElement) {
		StringBuilder ret = new StringBuilder();
		String description = modelElement.getDescription();
		Context context = getContext();
		if (!Util.isBlank(description)) {
			ret.append(context.interpolateToString(description));		
		}
		String markdownDescription = modelElement.getMarkdownDescription();
		if (!Util.isBlank(markdownDescription)) {
			String markdown = context.interpolateToString(markdownDescription);
			MarkdownHelper markdownHelper = context.computingContext().get(MarkdownHelper.class, MarkdownHelper.INSTANCE);
			ret.append(markdownHelper.markdownToHtml(markdown));
		}
		return ret.toString();
	}
		
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			FeatureAppearance featureAppearance = appearance.getFeatures().get(Util.camelToKebab(feature.getName()));
			if (featureAppearance != null) {
				if (!featureAppearance.getRoles().isEmpty()) {
					return matchFeatureRole(role, featureAppearance);
				}
			}
		}
		
		List<EClass> eClasses = new ArrayList<>();
		eClasses.add(getSemanticElement().eClass());
		eClasses.addAll(getSemanticElement().eClass().getEAllSuperTypes());
		for (EClass eClass: eClasses) {
			ModelElementAppearance classAppearance = factory.getAppearance(eClass);
			if (classAppearance != null) {
				FeatureAppearance featureAppearance = classAppearance.getFeatures().get(Util.camelToKebab(feature.getName()));
				if (featureAppearance != null) {
					if (!featureAppearance.getRoles().isEmpty()) {
						return matchFeatureRole(role, featureAppearance);
					}
				}
			}
		}

		return super.isFeatureInRole(feature, role);
	}

	protected boolean matchFeatureRole(FeatureRole role, FeatureAppearance featureAppearance) {
		for (String featureRole: featureAppearance.getRoles()) {
			switch (role) {
			case CONTENT:
				return "content".equals(featureRole);
			case ELEMENT_ACTIONS:
				return "element-actions".equals(featureRole) || featureRole.startsWith("element-actions/");
			case ELEMENT_ACTIONS_SORTED:
				return "element-actions-sorted".equals(featureRole) || featureRole.startsWith("element-actions-sorted/");
			case FEATURE_ACTIONS:
				return "feature-actions".equals(featureRole) || featureRole.startsWith("feature-actions/");
			case PROPERTY:
				return "property".equals(featureRole);
			default:
				throw new UnsupportedOperationException("Unsupported feature role: " + role);
			}
		}
		return false;
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> children = super.collectChildren();
		children.addAll(HtmlEmfUtil.adaptToActionNonNull(getSemanticElement().getActions()));		
		return children;
	}
	
	@Override
	public Action getParent() {
		EObject eContainer = getSemanticElement().eContainer();
		if (eContainer == null) {
			return factory.getParent();
		}
		return super.getParent();
	}

	@Override
	public Object getId() {
		return id;
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
	
	protected static <E extends Endeavor> Table endeavorsTable(
			Collection<E> endeavors,
			Function<ETypedElement, ViewBuilder> headerBuilderProvider,			
			ViewGenerator viewGenerator, 
			ProgressMonitor progressMonitor,			
			ETypedElement... dataSources) {
		
		Function<E,ViewBuilder> rowBuilderProvider = endeavor -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				if ((endeavor instanceof Issue && ((Issue) endeavor).isAvailable()) || endeavor.getCompletion() > 0.9999) {
					((org.nasdanika.html.bootstrap.RowContainer.Row) target).color(Color.SUCCESS);
				}
				if (endeavor instanceof Issue && !((Issue) endeavor).isWorkable()) {
					((org.nasdanika.html.bootstrap.RowContainer.Row) target).color(Color.PRIMARY); // TODO - configurable.					
				}
			}
			
		};
		BiFunction<E, ETypedElement, ViewBuilder> cellBuilderProvider = (issue, dataSource) -> {
			if (dataSource == EngineeringPackage.Literals.NAMED_ELEMENT__NAME) {
				return (target, vg, pm) -> {
					((org.nasdanika.html.bootstrap.RowContainer.Row.Cell) target).toHTMLElement().content(vg.link(ViewAction.adaptToViewActionNonNull(issue)));
				};
			}
			if (dataSource == EngineeringPackage.Literals.ENDEAVOR__COMPLETION) {
				return (target, vg, pm) -> {
					double completion = issue.getCompletion();
					if (completion != Double.NaN && completion > 0.001) {
						((org.nasdanika.html.bootstrap.RowContainer.Row.Cell) target).toHTMLElement().content(viewGenerator.getBootstrapFactory().progressBar((int) (100 * completion)));
					}
				};
			}
			return null;
		};							
		
		return HtmlEmfUtil.table(
				endeavors, 
				headerBuilderProvider,
				rowBuilderProvider, 
				cellBuilderProvider, 
				viewGenerator, 
				progressMonitor, 
				dataSources);		
	}
		
	/**
	 * If issues collection is not empty creates a section action with issues grouped into increments with 
	 * specified features in the issue table. 
	 * @param endeavors
	 * @param features
	 * @return
	 */
	public <E extends Endeavor> Action endeavorsSection(
			Collection<E> endeavors, 
			Function<ETypedElement, ViewBuilder> headerBuilderProvider,
			String text, 
			String id, 
			Collection<Diagnostic> diagnostic,
			ETypedElement... dataSources) {
		
		return endeavorsSection(endeavors, headerBuilderProvider, text, id, getMarker(), getActivator(), diagnostic, dataSources);
	}
	
	private static Increment rootIncrement(Increment increment) {
		if (increment != null) {
			EObject ic = increment.eContainer();
			if (ic instanceof Increment) {
				return rootIncrement((Increment) ic);
			}
		}
		return increment;
	}
	
	/**
	 * If issues collection is not empty creates a section action with issues grouped into increments with 
	 * specified features in the issue table. 
	 * @param endeavors
	 * @param features
	 * @return
	 */
	public static <E extends Endeavor> Action endeavorsSection(
			Collection<E> endeavors, 
			Function<ETypedElement, ViewBuilder> headerBuilderProvider,			
			String text, 
			String id, 
			Marker marker, 
			ActionActivator activator,
			Collection<Diagnostic> diagnostic,
			ETypedElement... dataSources) {
		
		if (endeavors.isEmpty()) {
			return null;
		}
		
		Map<IncrementValueObject, List<E>> increments = Util.groupBy(endeavors, IncrementValueObject::from);
		boolean backlogOnly = increments.size() == 1 && increments.keySet().iterator().next() == null;
		
		ActionImpl endeavorsSection = new ActionImpl() {
			
			private Increment getIncrement(Endeavor endeavor) {
				if (endeavor instanceof Increment) {
					return (Increment) endeavor;
				}
				if (endeavor instanceof Issue) {
					return ((Issue) endeavor).getIncrement();
				}
				if (endeavor instanceof Release) {
					return ((Release) endeavor).getIncrement();
				}
				return null;
			}			
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Fragment ret = viewGenerator.getHTMLFactory().fragment();
				BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
				if (diagnostic != null) {
					for (Diagnostic diagnostic: diagnostic) {
						ret.content(bootstrapFactory.alert(HtmlEmfUtil.getSeverityColor(diagnostic.getSeverity()), StringEscapeUtils.escapeHtml4(diagnostic.getMessage())));
					}
				}
				
				List<Increment> rootIncrements = endeavors
						.stream()
						.map(this::getIncrement)
						.filter(Objects::nonNull)
						.map(ModelElementViewAction::rootIncrement)
						.collect(Collectors.toSet())
						.stream()
						.sorted(INCREMENT_COMPARATOR)
						.collect(Collectors.toList());
				
				if (!rootIncrements.isEmpty()) {
					Function<Increment, Collection<Endeavor>> endeavorSource = in -> endeavors.stream().filter(e -> getIncrement(e) == in).collect(Collectors.toList());
					ret.content(IncrementViewAction.incrementsTable(rootIncrements, endeavorSource, false, viewGenerator, progressMonitor));
				}
				
				Collection<Issue> issues = new ArrayList<>();
				endeavors.forEach(e -> issues.addAll(e.getAllIssues()));				
				ret.content(issueStatusSummaryTable(issues, viewGenerator, progressMonitor));
				
				if (backlogOnly) {
					ret.content(endeavorsTable(
							endeavors, 
							headerBuilderProvider,
							viewGenerator, 
							progressMonitor, 
							dataSources));
				}
				return ret;
			};
			
			@Override
			public List<Action> getChildren() {
				return backlogOnly ? Collections.emptyList() : increments.keySet().stream().filter(Objects::nonNull).sorted().map(i -> incrementValueObjectAction(i, increments.get(i))).collect(Collectors.toList());
			}
			
			private Action incrementValueObjectAction(IncrementValueObject incrementValueObject, List<E> incrementEndeavors) {
				ActionImpl incrementSection = new ActionImpl() {
					
					@Override
					public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
						Fragment ret = viewGenerator.getHTMLFactory().fragment();
						
						Collection<Issue> issues = new ArrayList<>();
						incrementEndeavors.forEach(e -> issues.addAll(e.getAllIssues()));				
						ret.content(issueStatusSummaryTable(issues, viewGenerator, progressMonitor));
						
						ret.content(endeavorsTable(
								incrementEndeavors, 
								headerBuilderProvider,
								viewGenerator, 
								progressMonitor, 
								dataSources));
						
						return ret;
					}
					
				};
				
				incrementSection.getRoles().add(Action.Role.SECTION); 
				incrementSection.setText(Util.isBlank(incrementValueObject.getName()) ? "Backlog" : incrementValueObject.getName()); 			
				incrementSection.setActivator(new PathNavigationActionActivator(incrementSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#" + id + "-" + incrementValueObject.hashCode(), marker));
				return incrementSection; 					
			}
		};
		
		endeavorsSection.getRoles().add(Action.Role.SECTION); 
		endeavorsSection.setSectionStyle(SectionStyle.DEFAULT);
		endeavorsSection.setText(text); 			
		endeavorsSection.setActivator(new PathNavigationActionActivator(endeavorsSection, ((NavigationActionActivator) activator).getUrl(null), "#" + id, marker));

		return endeavorsSection;
	}
	
	public static Object issueStatusSummaryTable(Collection<Issue> issues, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (issues.isEmpty()) {
			return null;
		}
		Map<Object, List<Issue>> groupedIssues = EmfUtil.groupBy(issues, EngineeringPackage.Literals.ISSUE__STATUS);
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table table = bootstrapFactory.table().bordered().striped();
		table.header().headerRow("Status", "Issues", "Effort", "Cost", "Benefit").color(Color.INFO);
		List<Entry<Object, List<Issue>>> entryList = new ArrayList<>(groupedIssues.entrySet());
		entryList.sort((a,b) -> {
			IssueStatus as = (IssueStatus) a.getKey();
			IssueStatus bs = (IssueStatus) b.getKey();
			if (as == bs) {
				return 0;
			}
			if (as == null) {
				return -1;
			}
			if (bs == null) {
				return 1;
			}
			int asi = ((List<?>) as.eContainer().eGet(as.eContainmentFeature())).indexOf(as);
			int bsi = ((List<?>) as.eContainer().eGet(as.eContainmentFeature())).indexOf(bs);
			if (asi != bsi) {
				return asi - bsi;
			}
			return as.getName().compareTo(bs.getName());
		});
		for (Entry<Object, List<Issue>> se: entryList) {
			Row sRow = table.row();
			if (se.getKey() == null) {
				sRow.cell("Blank");
			} else {
				ViewAction<?> statusAction = ViewAction.adaptToViewActionNonNull((EObject) se.getKey());
				sRow.cell(viewGenerator.link(statusAction));
			}
			List<Issue> statusIssues = se.getValue();
			if (statusIssues == null || statusIssues.isEmpty()) {
				sRow.cell();
				sRow.cell();
				sRow.cell();
				sRow.cell();
			} else {
				sRow.cell(statusIssues.size()).text().alignment(Alignment.RIGHT);
				double totalEffort = 0;
				double totalCost = 0;
				double totalBenefit = 0;
				for (Issue si: statusIssues) {
					totalEffort += si.getEffort();
					totalCost += si.getCost();
					totalBenefit += si.getBenefit();
				}
				sRow.cell(totalEffort).text().alignment(Alignment.RIGHT);
				sRow.cell(totalCost).text().alignment(Alignment.RIGHT);
				sRow.cell(totalBenefit).text().alignment(Alignment.RIGHT);
			}
			
		}
		return table;
	}
	
	// TODO - totals table, % completed - shared method for engineers, increments, releases, ... - in ModelElementView...
	// Generic table - takes a list of EObjects, BiConsumer of element and table row, BiFunction of element and feature to extract value, and var-arg of str features 

	@Override
	public Collection<Diagnostic> getDiagnostic() {		
		Collection<Diagnostic> ret = new ArrayList<>();
		Map<EObject, Diagnostic> diagnosticMap = factory.getDiagnosticMap();
		if (diagnosticMap != null) {
			for (Diagnostic diagnostic: diagnosticMap.values()) {
				collectDiagnostic(getSemanticElement(), diagnostic, ret);
			}
		}
		return ret;
	}

	@Override
	public Collection<Diagnostic> getFeatureDiagnostic(EStructuralFeature feature) {
		Collection<Diagnostic> ret = new ArrayList<>();
		Map<EObject, Diagnostic> diagnosticMap = factory.getDiagnosticMap();
		if (diagnosticMap != null) {
			for (Diagnostic diagnostic: diagnosticMap.values()) {
				collectFeatureDiagnostic(getSemanticElement(), feature, diagnostic, ret);
			}
		}
		return ret;
	}
		
	private static void collectDiagnostic(EObject eObject, Diagnostic diagnostic, Collection<Diagnostic> collector) {
		List<?> data = diagnostic.getData();
		if (data.size() == 1 && data.get(0) == eObject && matchSeverity(diagnostic) && diagnostic.getChildren().isEmpty()) {
			collector.add(diagnostic);
		}
		for (Diagnostic child: diagnostic.getChildren()) {
			collectDiagnostic(eObject, child, collector);
		}
	}
	
	private static void collectFeatureDiagnostic(EObject eObject, EStructuralFeature feature, Diagnostic diagnostic, Collection<Diagnostic> collector) {
		List<?> data = diagnostic.getData();
		if (data.size() > 1 && data.get(0) == eObject && data.get(1) == feature && matchSeverity(diagnostic) && diagnostic.getChildren().isEmpty()) {
			collector.add(diagnostic);
		}
		for (Diagnostic child: diagnostic.getChildren()) {
			collectFeatureDiagnostic(eObject, feature, child, collector);
		}
	}

	protected static boolean matchSeverity(Diagnostic diagnostic) {
		return diagnostic.getSeverity() == Diagnostic.ERROR ||diagnostic.getSeverity() == Diagnostic.WARNING;
	}
		
	@Override
	protected Object diagnosticSummary(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Map<EObject, Diagnostic> diagnosticMap = factory.getDiagnosticMap();
		if (diagnosticMap == null || diagnosticMap.isEmpty()) {
			return null;
		}
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table table = bootstrapFactory.table().bordered().striped();
		Row header = table.header().headerRow("Status", "Source", "Feature", "Message");
		header.color(Color.INFO);
		boolean hasDiagnostic = false;
		for (Entry<EObject, Diagnostic> de: diagnosticMap.entrySet()) {
			if (EcoreUtil.isAncestor(getSemanticElement(), de.getKey())) {
				if (diagnosticRow(de.getValue(), table, 0, viewGenerator)) {
					hasDiagnostic = true;
				}
				
			}
		}
		return hasDiagnostic ? "<h3>Diagnostic</h3>" + table : null;
	}
	
	protected boolean diagnosticRow(Diagnostic diagnostic, Table table, int depth, ViewGenerator viewGenerator) {
		if (matchSeverity(diagnostic)) {
			List<?> data = diagnostic.getData();
			if (diagnostic.getChildren().isEmpty()) {
				Color severityColor = HtmlEmfUtil.getSeverityColor(diagnostic.getSeverity());
				Row diagnosticRow = table.row().color(severityColor);
				Cell statusCell = diagnosticRow.header();
				statusCell.text().color(severityColor);
				switch (diagnostic.getSeverity()) {
				case Diagnostic.OK:
					statusCell.toHTMLElement().content("OK");
					break;
				case Diagnostic.CANCEL:
					statusCell.toHTMLElement().content("Cancel");
					break;
				case Diagnostic.ERROR:
					statusCell.toHTMLElement().content("Error");
					break;
				case Diagnostic.INFO:
					statusCell.toHTMLElement().content("Info");
					break;
				case Diagnostic.WARNING:
					statusCell.toHTMLElement().content("Warning");
					break;
				}
				
				Cell sourceCell = diagnosticRow.cell();
				//sourceCell.toHTMLElement().style().padding().left(depth + "em");
				if (data.size() > 0) {
					Object source = data.get(0);
					if (source instanceof EObject) {
						ViewAction<?> sva = EObjectAdaptable.adaptTo((EObject) source, ViewAction.class);
						sourceCell.toHTMLElement().content(sva == null ? source : viewGenerator.link(sva));
					} else {
						sourceCell.toHTMLElement().content(source);
					}
				}
				Cell featureCell = diagnosticRow.cell();
				if (data.size() > 1 && data.get(1) instanceof EStructuralFeature) {
					featureCell.toHTMLElement().content(viewGenerator.label(featureLabel((EStructuralFeature) data.get(1))));
				}			
				diagnosticRow.cell(StringEscapeUtils.escapeHtml4(diagnostic.getMessage()));
				
			}
			for (Diagnostic child: diagnostic.getChildren()) {
				diagnosticRow(child, table, depth + 1, viewGenerator);
			}			
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isInRole(String role) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			EList<String> roles = appearance.getRoles();
			if (!roles.isEmpty()) {
				return roles.contains(role);
			}
		}
		EObject container = getSemanticElement().eContainer();
		if (container instanceof ModelElement) {
			ModelElementAppearance cApp = ((ModelElement) container).getAppearance();
			if (cApp != null) {
				EReference containmentFeature = getSemanticElement().eContainmentFeature();
				if (containmentFeature != null) {
					FeatureAppearance featureAppearance = cApp.getFeatures().get(Util.camelToKebab(containmentFeature.getName()));
					if (featureAppearance != null) {
						for (String featureRole: featureAppearance.getRoles()) {
							if (featureRole.equals("element-actions/" + role) || featureRole.equals("element-actions-sorted/" + role)) {
								return true;
							}
						}
					}
				}
			}			
		}
		
		List<EClass> eClasses = new ArrayList<>();
		eClasses.add(getSemanticElement().eClass());
		eClasses.addAll(getSemanticElement().eClass().getEAllSuperTypes());
		for (EClass eClass: eClasses) {
			ModelElementAppearance classAppearance = factory.getAppearance(eClass);
			if (classAppearance != null) {
				EList<String> roles = classAppearance.getRoles();
				if (!roles.isEmpty()) {
					return roles.contains(role);
				}				
			}
		}
		
		if (container instanceof ModelElement) {
			List<EClass> cClasses = new ArrayList<>();
			cClasses.add(container.eClass());
			cClasses.addAll(container.eClass().getEAllSuperTypes());
			for (EClass cClass: cClasses) {
				ModelElementAppearance containerAppearance = factory.getAppearance(cClass);
				if (containerAppearance != null) {
					EReference containmentFeature = getSemanticElement().eContainmentFeature();
					if (containmentFeature != null) {
						FeatureAppearance featureAppearance = containerAppearance.getFeatures().get(Util.camelToKebab(containmentFeature.getName()));
						if (featureAppearance != null) {
							for (String featureRole: featureAppearance.getRoles()) {
								if (featureRole.equals("element-actions/" + role) || featureRole.equals("element-actions-sorted/" + role)) {
									return true;
								}
							}
						}
					}
				}
			}
		}
		
		return super.isInRole(role);
	}
	
	public EngineeringViewActionAdapterFactory getFactory() {
		return factory;
	}
	
	protected <F extends EStructuralFeature> ModelElementFeatureViewAction<T, F, ModelElementViewAction<T>> createFeatureViewAction(F feature, ViewPart contentPart) {
		return new ModelElementFeatureViewAction<T, F, ModelElementViewAction<T>>(this, feature) {
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				return contentPart.generate(viewGenerator, progressMonitor);
			}
			
		};
	}
	
}
