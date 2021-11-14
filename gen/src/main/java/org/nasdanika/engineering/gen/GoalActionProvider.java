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
import org.nasdanika.engineering.Goal;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class GoalActionProvider extends AimActionProvider<Goal> {
	
	public GoalActionProvider(Goal target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		
		createChildrenActions(action, registry, resolveConsumer, progressMonitor);
		
		return action;
	}
	
	protected void createChildrenActions(
			Action action, 
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Goal> children = getTarget().getChildren();
		if (!children.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Children");
			group.setUuid(action.getUuid() + "-children");
			action.getSections().add(group);
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Goal goal: children) {
				groupAnonymous.add(createChildAction(goal, registry, resolveConsumer, progressMonitor));
			}
		}
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<Goal> children = getTarget().getChildren();
		if (!children.isEmpty()) {
			String childrenGroupUUID = action.getUuid() + "-children";
			Optional<Action> childrenActionOptional = action.getSections().stream()
					.filter(a -> childrenGroupUUID.equals(a.getUuid()))
					.findFirst();
			childrenActionOptional.get().getContent().add(renderList(children, true, createGoalChildrenListProvider(), action, EngineeringPackage.Literals.PERSONA__GOALS, context, progressMonitor));
		}
	}

	protected ContentProvider<Goal> createGoalChildrenListProvider() {
		ContentProvider<Goal> goalChildrenListProvider = new ContentProvider<Goal>() {

			@Override
			public List<EObject> createContent(
					Goal element, 
					Action base, 
					ETypedElement typedElement,
					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
					ProgressMonitor progressMonitor) throws Exception {
				
				EList<Goal> children = element.getChildren();
				if (children.isEmpty()) {
					return null;
				}
				return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.GOAL__CHILDREN, context, progressMonitor));
			}
			
		};
		return goalChildrenListProvider;
	}
	
}
