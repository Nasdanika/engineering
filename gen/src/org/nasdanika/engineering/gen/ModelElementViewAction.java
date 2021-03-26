package org.nasdanika.engineering.gen;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.ConfigurationException;
import org.nasdanika.common.persistence.Marked;
import org.nasdanika.common.persistence.SourceResolver;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.OrderedListType;
import org.nasdanika.html.Tag;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.LabelImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.app.viewparts.ListOfActionsViewPart;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.emf.ViewAction;

/**
 * Base class for Core ViewAction adapters.
 * @author Pavel
 *
 * @param <T>
 */
public class ModelElementViewAction<T extends ModelElement> implements ViewAction {
	
	protected T target;
		
	protected ModelElementViewAction(T target) {
		this.target = target;		
	}
		
	@Override
	public ActionActivator getActivator() {
		String contextUri = (String) EObjectAdaptable.adaptTo(target, Context.class).get(Context.BASE_URI_PROPERTY);
		Marked marked = EObjectAdaptable.adaptTo(target, Marked.class);
		EReference eContainmentReference = target.eContainmentFeature();
		if (eContainmentReference == null) {
			return new PathNavigationActionActivator(this, contextUri, contextUri + "index.html", marked == null ? null : marked.getMarker());
		}
		
		StringBuilder path = new StringBuilder(Util.camelToKebab(eContainmentReference.getName()));
		if (eContainmentReference.isMany()) {
			path.append("/");			
			String localPath = target.getPath();
			if (Util.isBlank(localPath)) {
				EObject eContainer = target.eContainer();
				if (eContainer != null) {
					path.append(((List<?>) eContainer.eGet(eContainmentReference)).indexOf(target));
				}
			} else {
				path.append(localPath);
			}
			if (target.eClass().getEReferences().stream().filter(EReference::isContainment).findAny().isPresent()) {
				path.append("/index");
			}
			path.append(".html");				
		}			
		return new PathNavigationActionActivator(this, contextUri, path.toString(), marked == null ? null : marked.getMarker());			
	}

	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.get(BootstrapFactory.class, BootstrapFactory.INSTANCE);
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment();
		Object diagram = generateDiagram();
		if (diagram != null) {
			ret.content(diagram);
		}
		String id = target.getId();
		if (!Util.isBlank(id)) {
			Tag idAlert = bootstrapFactory.alert(Color.INFO, "ID: ", id);
			bootstrapFactory.wrap(idAlert).text().monospace().toBootstrapElement()._float().right();
			ret.content(idAlert);
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
	
	@Override
	public List<Action> getChildren() {
		ArrayList<Action> children = new ArrayList<Action>();
		Marked marked = EObjectAdaptable.adaptTo(target, Marked.class);
		Context context = EObjectAdaptable.adaptTo(target, Context.class);
		if (context != null && marked != null && marked.getMarker() != null) {
			SourceResolver sourceResolver = context.get(SourceResolver.class);
			if (sourceResolver != null) {
				String source = sourceResolver.getSource(marked.getMarker());
				if (!Util.isBlank(source)) {
					ActionImpl sourceAction = new ActionImpl();
					sourceAction.setIcon("fas fa-code-branch");
					sourceAction.setText("Source");
					sourceAction.getRoles().add(Action.Role.CONTEXT);
					sourceAction.setActivator(new NavigationActionActivator() {
						
						@Override
						public String getUrl(String base) {
							return source;
						}
						
					});
					children.add(sourceAction);
				}
			}
		}
		return children;
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
		return eContainer instanceof ModelElement ? ((ModelElement) eContainer).adaptTo(ViewAction.class) : null;
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
	 * @return Action context built from the resource set context plus "base-uri" properties containing relative URI's of the site root. 
	 */
	protected Context getContext() {
		URI thisUri = URI.createURI(((NavigationActionActivator) getActivator()).getUrl(null));
		Context targetContext = EObjectAdaptable.adaptTo(target, Context.class);
		URI baseUri = URI.createURI(targetContext.get(Context.BASE_URI_PROPERTY).toString());
		URI relativeBaseUri = baseUri.deresolve(thisUri, true, true, true);
		MutableContext ret = targetContext.fork();
		ret.put(Context.BASE_URI_PROPERTY, relativeBaseUri);
		return ret;
	}

	@Override
	public String getNotification() {
		return null;
	}

	@Override
	public Object getId() {
		return target.getId();
	}

	@Override
	public Label getCategory() {
		EReference cf = target.eContainmentFeature();
		if (cf == null) {
			return null;
		}
		LabelImpl category = new LabelImpl();
		category.setText(EmfUtil.getNasdanikaAnnotationDetail(cf, "label", Util.nameToLabel(cf.getName()))); 
		category.setIcon(EmfUtil.getNasdanikaAnnotationDetail(cf, "icon"));
		EObject ec = target.eContainer();
		if (ec instanceof ModelElement) {
			category.setId(((ModelElement) ec).getId() + "-" + cf.getName());
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
	
	protected static Object listOfActions(Collection<? extends EObject> elements, String header, boolean sort, boolean tooltip, int depth) { 
		if (elements.isEmpty()) {
			return null;
		}
		return new ListOfActionsViewPart(adaptToViewActionNonNullSorted(elements), header, tooltip, depth, OrderedListType.ROTATE);
	}
	
	protected static ViewAction adaptToViewActionNonNull(EObject obj) {
		ViewAction ret = EObjectAdaptable.adaptTo(obj, ViewAction.class); 
		if (ret == null) {
			Marked marked = EObjectAdaptable.adaptTo(obj, Marked.class);
			throw new ConfigurationException("ViewAction adapter not found for " + obj, marked);
		}
		
		return ret;
	}
	
	protected static List<Action> adaptToViewActionNonNull(Collection<? extends EObject> c) {
		return c.stream().map(ModelElementViewAction::adaptToViewActionNonNull).collect(Collectors.toList());
	}
	
	protected static List<Action> adaptToViewActionNonNullSorted(Collection<? extends EObject> c) {
		return c.stream().map(ModelElementViewAction::adaptToViewActionNonNull).sorted((a,b) -> a.getText().compareTo(b.getText())).collect(Collectors.toList());
	}
	
	@Override
	public String toString() {
		return super.toString() + " -> " + target;
	}	
		
}
