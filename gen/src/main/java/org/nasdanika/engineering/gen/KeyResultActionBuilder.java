package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class KeyResultActionBuilder<T extends KeyResult> extends AimActionBuilder<T> {
	
	public KeyResultActionBuilder(T target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		createInitiativesAction(action, registry, resolveConsumer, progressMonitor);		
		
		return action;
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.KEY_RESULT__WEIGHT);
		properties.add(EngineeringPackage.Literals.KEY_RESULT__COMPLETION);
		
		return properties;
	}
	
	protected void createInitiativesAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Issue> initiatives = getTarget().getInitiatives();
		if (!initiatives.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Initiatives");
			group.setUuid(action.getUuid() + "-initatives");
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Issue issue: initiatives) {
				groupAnonymous.add(createChildAction(issue, registry, resolveConsumer, progressMonitor));
			}
		
			action.getSections().add(group);
		}
		
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<Issue> initiatives = getTarget().getInitiatives();
		if (!initiatives.isEmpty()) {
			String initiativesGroupUUID = action.getUuid() + "-initiatives";
			Optional<Action> initiativesActionOptional = action.getSections().stream()
					.filter(a -> initiativesGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Action initiativesAction = initiativesActionOptional.get();
			initiativesAction.getContent().add(renderList(initiatives, true, createIssueChildrenProvider(), initiativesAction, EngineeringPackage.Literals.KEY_RESULT__INITIATIVES, context, progressMonitor)); // Table?
		}
	}
	
	private ContentProvider<Issue> createIssueChildrenProvider() {
		return new ContentProvider<Issue>() {
	
			@Override
			public List<EObject> createContent(
					Issue element, 
					Action base, 
					ETypedElement typedElement,
					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
					ProgressMonitor progressMonitor) throws Exception {
				
				EList<Issue> children = element.getChildren();
				if (children.isEmpty()) {
					return null;
				}
				return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.ISSUE__CHILDREN, context, progressMonitor));
			}
			
		};
	}	
	
}
