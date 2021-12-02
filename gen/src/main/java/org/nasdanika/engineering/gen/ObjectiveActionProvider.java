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
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.engineering.Objective;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class ObjectiveActionProvider extends KeyResultActionProvider<Objective> {
	
	public ObjectiveActionProvider(Objective target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.OBJECTIVE__PARENT);
		properties.add(EngineeringPackage.Literals.OBJECTIVE__ENDEAVOR);
		
		return properties;
	}
	
	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		
		createSubObjectiveActions(action, registry, resolveConsumer, progressMonitor);
		createKeyResultActions(action, registry, resolveConsumer, progressMonitor);
		
		return action;
	}
	
	protected void createSubObjectiveActions(
			Action action, 
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		if (!getTarget().getSubObjectives().isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Children");
			group.setUuid(action.getUuid() + "-sub-objectives");
			action.getSections().add(group);
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Objective objective: getTarget().getChildren()) {
				groupAnonymous.add(createChildAction(objective, registry, resolveConsumer, progressMonitor));
			}
		}
	}
	
	protected void createKeyResultActions(
			Action action, 
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		EList<KeyResult> keyResults = getTarget().getKeyResults();
		if (!keyResults.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Key Results");
			group.setUuid(action.getUuid() + "-key-results");
			action.getSections().add(group);
			EList<Action> groupAnonymous = group.getAnonymous();
			for (KeyResult keyResult: keyResults) {
				groupAnonymous.add(createChildAction(keyResult, registry, resolveConsumer, progressMonitor));
			}
		}
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<Objective> subObjectives = getTarget().getSubObjectives();
		if (!subObjectives.isEmpty()) {
			String subObjectivesGroupUUID = action.getUuid() + "-sub-objectives";
			Optional<Action> subObjectivesActionOptional = action.getSections().stream()
					.filter(a -> subObjectivesGroupUUID.equals(a.getUuid()))
					.findFirst();
			subObjectivesActionOptional.get().getContent().add(renderList(subObjectives, true, createObjectiveSubObjectiveListProvider(), action, EngineeringPackage.Literals.OBJECTIVE__SUB_OBJECTIVES, context, progressMonitor));
		}
		
		EList<KeyResult> keyResults = getTarget().getKeyResults();
		if (!keyResults.isEmpty()) {
			String keyResultsGroupUUID = action.getUuid() + "-key-results";
			Optional<Action> keyResultsActionOptional = action.getSections().stream()
					.filter(a -> keyResultsGroupUUID.equals(a.getUuid()))
					.findFirst();
			keyResultsActionOptional.get().getContent().add(renderList(keyResults, true, null, action, EngineeringPackage.Literals.OBJECTIVE__KEY_RESULTS, context, progressMonitor));
		}
	}

	protected ContentProvider<Objective> createObjectiveSubObjectiveListProvider() {
		ContentProvider<Objective> objectiveSubObjectiveListProvider = new ContentProvider<Objective>() {

			@Override
			public List<EObject> createContent(
					Objective element, 
					Action base, 
					ETypedElement typedElement,
					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
					ProgressMonitor progressMonitor) throws Exception {
				
				EList<Objective> subObjectives = element.getSubObjectives();
				if (subObjectives.isEmpty()) {
					return null;
				}
				return Collections.singletonList(renderList(subObjectives, true, this, base, EngineeringPackage.Literals.OBJECTIVE__SUB_OBJECTIVES, context, progressMonitor));
			}
			
		};
		return objectiveSubObjectiveListProvider;
	}
	
}
