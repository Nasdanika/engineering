package org.nasdanika.engineering.gen;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Objective;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.ncore.NcorePackage;

public class EngineeredCapabilityActionBuilder<T extends EngineeredCapability> extends CapabilityActionBuilder<T> {
	
	public EngineeredCapabilityActionBuilder(T target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		
		// Endeavor's
		properties.add(EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE);
		properties.add(EngineeringPackage.Literals.ENDEAVOR__COMPLETION);
		properties.add(EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST);
		properties.add(EngineeringPackage.Literals.ENDEAVOR__BENEFIT);
		properties.add(EngineeringPackage.Literals.ENDEAVOR__AFFECTS);

		// Engineered Capability
		properties.add(EngineeringPackage.Literals.ENGINEERED_CAPABILITY__RELEASES);
		
		return properties;
	}
		
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		createAlignsActions(action, registry, resolveConsumer, progressMonitor);
		createAllIssuesAction(action, registry, resolveConsumer, progressMonitor);		
		createAllObjectiveActions(action, registry, resolveConsumer, progressMonitor);
		
		return action;
	}
	
	protected void createAllObjectiveActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		if (!getTarget().getAllObjectives().isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Objectives");
			group.setUuid(action.getUuid() + "-all-objectives");
			// TODO - icon, ...
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Objective objective: getTarget().getObjectives()) {
				groupAnonymous.add(createChildAction(objective, registry, resolveConsumer, progressMonitor));
			}
		
			action.getSections().add(group);
		}
	}
	
	protected void createAlignsActions(
			Action action, 
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
	
		List<Alignment> alignments = getTarget().getAligns();
		if (!alignments.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Aligns");
			group.setUuid(action.getUuid() + "-aligns");
			action.getSections().add(group);
		}		
		
	}
	
	protected void createAllIssuesAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Issue> allIssues = getTarget().getAllIssues();
		if (!allIssues.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("All Issues");
			group.setUuid(action.getUuid() + "-all-issues");
			group.setLocation("all-issues.html");
			action.getNavigation().add(group);
		}
		
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		// Endeavor's - aligns, all objectives (objectives), all issues, capacity (TODO)
		EList<Alignment> alignments = getTarget().getAligns();
		if (!alignments.isEmpty()) {
			String alignsGroupUUID = action.getUuid() + "-aligns";
			Optional<Action> alignmentsActionOptional = action.getSections().stream()
					.filter(a -> alignsGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Table alignmentsTable = buildTable(
					alignments, 
					action, 
					EngineeringPackage.Literals.ALIGNABLE__ALIGNS, 
					context, 
					progressMonitor, 
					createColumnBuilder(EngineeringPackage.Literals.ALIGNMENT__AIM),
					createColumnBuilder(NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION),
					createColumnBuilder(EngineeringPackage.Literals.ALIGNMENT__WEIGHT));
			alignmentsActionOptional.get().getContent().add(alignmentsTable);
		}
		
		EList<Objective> allObjectives = getTarget().getAllObjectives();
		if (!allObjectives.isEmpty()) {
			String allObjectivesGroupUUID = action.getUuid() + "-all-objectives";
			Optional<Action> allObjectivesActionOptional = action.getSections().stream()
					.filter(a -> allObjectivesGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			allObjectivesActionOptional.get().getContent().add(renderList(allObjectives, true, null, action, EngineeringPackage.Literals.ENDEAVOR__ALL_OBJECTIVES, context, progressMonitor)); // Table?
		}
		
		// All Issues
		EList<Issue> allIssues = getTarget().getAllIssues();
		if (!allIssues.isEmpty()) {
			String allIssuesGroupUUID = action.getUuid() + "-all-issues";
			Optional<Action> issuesActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> allIssuesGroupUUID.equals(a.getUuid()))
					.findFirst();
			Action allIssuesAction = issuesActionOptional.get();
			Table allIssuesTable = buildTable(
					allIssues, 
					action, 
					EngineeringPackage.Literals.ENGINEERED_ELEMENT__ALL_ISSUES, 
					context, 
					progressMonitor,
					createColumnBuilder("Issue"),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__TARGET),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__CATEGORIES),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__PRIORITY),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__SEVERITY),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__STATUS),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__WORKABLE),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__BENEFIT),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__COST),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__EFFORT),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__REMAINING_COST),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
			
			allIssuesAction.getContent().add(allIssuesTable);
		}
		
	}	
		
}
