package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Persona;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class PersonaActionProvider<T extends Persona> extends EngineeredElementActionProvider<T> {
	
	public PersonaActionProvider(T target, Context context) {
		super(target, context);		
	}
		
	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		
		action.getSections().addAll(createGoalActions(registry, resolveConsumer, progressMonitor));
		
		return action;
	}
	
	protected List<Action> createGoalActions(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Goal> goals = getTarget().getGoals();
		if (goals.isEmpty()) {
			return Collections.emptyList();
		}
		Action group = AppFactory.eINSTANCE.createAction();
		group.setText("Goals");
		EList<Action> groupAnonymous = group.getAnonymous();
		for (Goal goal: goals) {
			groupAnonymous.add(createChildAction(goal, registry, resolveConsumer, progressMonitor));
		}
		
		return Collections.singletonList(group);
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<Goal> goals = getTarget().getGoals();
		if (!goals.isEmpty()) {
			Action goalsAction = (Action) action.getSections().get(0);
			goalsAction.getContent().add(renderList(goals, true, createGoalChildrenListProvider(), goalsAction, EngineeringPackage.Literals.PERSONA__GOALS, context, progressMonitor));
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
