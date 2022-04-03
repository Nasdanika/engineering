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
import org.nasdanika.engineering.Persona;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class PersonaActionBuilder<T extends Persona> extends EngineeredElementActionBuilder<T> {
	
	public PersonaActionBuilder(T target, Context context) {
		super(target, context);		
	}
		
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		createGoalActions(action, registry, resolveConsumer, progressMonitor);
		
		return action;
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.PERSONA__EXTENDS);
		properties.add(EngineeringPackage.Literals.PERSONA__EXTENSIONS);
		properties.add(EngineeringPackage.Literals.PERSONA__REPRESENTATIVES);
		return properties;
	}
	
	protected void createGoalActions(
			Action action, 
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Goal> goals = getTarget().getGoals();
		if (!goals.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Goals");
			group.setUuid(action.getUuid() + "-goals");
			action.getSections().add(group);
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Goal goal: goals) {
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
		
		EList<Goal> goals = getTarget().getGoals();
		if (!goals.isEmpty()) {
			String goalsGroupUUID = action.getUuid() + "-goals";
			Optional<Action> goalsActionOptional = action.getSections().stream()
					.filter(a -> goalsGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Action goalsAction = goalsActionOptional.get();
			goalsAction.getContent().add(renderList(goals, true, createGoalChildrenListProvider(), action, EngineeringPackage.Literals.PERSONA__GOALS, context, progressMonitor));
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
