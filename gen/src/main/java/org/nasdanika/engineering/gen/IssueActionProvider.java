package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Note;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.ncore.NcorePackage;

public class IssueActionProvider extends EngineeredCapabilityActionProvider<Issue> {
	
	public IssueActionProvider(Issue target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.ISSUE__INCREMENT);
		properties.add(EngineeringPackage.Literals.ISSUE__CATEGORIES);
		properties.add(EngineeringPackage.Literals.ISSUE__PRIORITY);
		properties.add(EngineeringPackage.Literals.ISSUE__SEVERITY);
		properties.add(EngineeringPackage.Literals.ISSUE__STATUS);
		properties.add(EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO);
		properties.add(EngineeringPackage.Literals.ISSUE__RELEASES);
		properties.add(EngineeringPackage.Literals.ISSUE__COST);
		properties.add(EngineeringPackage.Literals.ISSUE__EFFORT);
		properties.add(EngineeringPackage.Literals.ISSUE__REMAINING_COST);
		properties.add(EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT);
		properties.add(EngineeringPackage.Literals.ISSUE__TARGET);
		properties.add(EngineeringPackage.Literals.ISSUE__WORKABLE);
		properties.add(EngineeringPackage.Literals.ISSUE__REQUIRES);
		return properties;
	}

	@Override
	protected Action createAction(
			BiConsumer<EObject, Action> registry,
			Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer,
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		
		createRequiresAction(action, registry, resolveConsumer, progressMonitor);		
		createChildrenActions(action, registry, resolveConsumer, progressMonitor);		
		createNotesActions(action, registry, resolveConsumer, progressMonitor);
		
		return action;
	}
	
	protected void createChildrenActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Issue> children = getTarget().getChildren();
		if (!children.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Children");
			group.setUuid(action.getUuid() + "-children");
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Issue child: children) {
				groupAnonymous.add(createChildAction(child, registry, resolveConsumer, progressMonitor));
			}
		
			action.getSections().add(group);
		}
	}
	
	protected void createNotesActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Note> notes = getTarget().getNotes();
		if (!notes.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Notes");
			group.setUuid(action.getUuid() + "-notes");
			action.getSections().add(group);
		}
	}
		
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		Issue issue = getTarget();
		
		EList<Capability> requires = getTarget().getRequires();
		if (!requires.isEmpty()) {
			String allIssuesGroupUUID = action.getUuid() + "-requires";
			Optional<Action> requiredByOptional = action.getSections().stream()
					.filter(a -> allIssuesGroupUUID.equals(a.getUuid()))
					.findFirst();
			Action issuesAction = requiredByOptional.get();
			Table requiredByTable = buildTable(
					requires, 
					action, 
					EngineeringPackage.Literals.ISSUE__REQUIRES, 
					context, 
					progressMonitor,
					createColumnBuilder("Capability"),
					createColumnBuilder(EngineeringPackage.Literals.CAPABILITY__AVAILABLE),
					createColumnBuilder(NcorePackage.Literals.PERIOD__START),
					createColumnBuilder(NcorePackage.Literals.PERIOD__END));
			
			issuesAction.getContent().add(requiredByTable);
		}
				
		EList<Issue> children = issue.getChildren();
		if (!children.isEmpty()) {
			String childrenGroupUUID = action.getUuid() + "-children";
			Optional<Action> childrenActionOptional = action.getSections().stream()
					.filter(a -> childrenGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			ContentProvider<Issue> issueChildrenListProvider = new ContentProvider<Issue>() {

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
			
			Action childrenAction = childrenActionOptional.get();
			childrenAction.getContent().add(renderList(children, false, issueChildrenListProvider, childrenAction, EngineeringPackage.Literals.ISSUE__CHILDREN, context, progressMonitor)); // Table?
		}
		
		EList<Note> notes = issue.getNotes();
		if (!notes.isEmpty()) {
			String featuresGroupUUID = action.getUuid() + "-notes";
			Optional<Action> featuresActionOptional = action.getSections().stream()
					.filter(a -> featuresGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Action featuresAction = featuresActionOptional.get();
			Table notesTable = buildTable(
					notes, 
					action, 
					EngineeringPackage.Literals.ISSUE__NOTES, 
					context, 
					progressMonitor, 
					createColumnBuilder(NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION),
					createColumnBuilder(EngineeringPackage.Literals.NOTE__AUTHOR),
					createColumnBuilder(EngineeringPackage.Literals.NOTE__DATE),
					createColumnBuilder(EngineeringPackage.Literals.NOTE__STATUS),
					createColumnBuilder(EngineeringPackage.Literals.NOTE__EFFORT),
					createColumnBuilder(EngineeringPackage.Literals.NOTE__COST),
					createColumnBuilder(EngineeringPackage.Literals.NOTE__REMAINING_EFFORT),
					createColumnBuilder(EngineeringPackage.Literals.NOTE__REMAINING_COST));
			featuresAction.getContent().add(notesTable);
		}		
	}

	protected void createRequiresAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Capability> requires = getTarget().getRequires();
		if (!requires.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Requires");
			group.setUuid(action.getUuid() + "-requires");
			group.setLocation("requires.html");
			action.getSections().add(group);
		}		
	}
	
}
