package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.Domain;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElementStatus;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssuePriority;
import org.nasdanika.engineering.IssueSeverity;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.Objective;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Product;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.ncore.NcorePackage;

public class EngineerActionBuilder<T extends Engineer> extends PersonaActionBuilder<T> {
	
	public EngineerActionBuilder(T target, Context context) {
		super(target, context);
	}
		
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		createDomainActions(action, registry, resolveConsumer, progressMonitor);		
		createModuleActions(action, registry, resolveConsumer, progressMonitor);		
		createIncrementActions(action, registry, resolveConsumer, progressMonitor);		
		createPersonaActions(action, registry, resolveConsumer, progressMonitor);
		createIssueGroupingActions(action, registry, resolveConsumer, progressMonitor);
		createObjectiveActions(action, registry, resolveConsumer, progressMonitor);
		createAssignmentsAction(action, registry, resolveConsumer, progressMonitor);		
		createEngineeredElementStatusAction(action, registry, resolveConsumer, progressMonitor);		
		
		return action;
	}
	
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.ENGINEER__RATE);
		properties.add(EngineeringPackage.Literals.ENGINEER__OWNS);
		properties.add(EngineeringPackage.Literals.ENGINEER__EXPERTISE);
		properties.add(EngineeringPackage.Literals.ENGINEER__REPRESENTS);
		properties.add(EngineeringPackage.Literals.ENGINEER__MANAGERS);
		properties.add(EngineeringPackage.Literals.ENGINEER__MANAGES);

		return properties;
	}
	
	protected void createEngineeredElementStatusAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		T engineer = getTarget();
		EList<EngineeredElementStatus> engineeredElementStatuses = engineer.getEngineeredElementStatuses();
		if (engineeredElementStatuses.isEmpty()) {
			return;
		}

		Action group = AppFactory.eINSTANCE.createAction();
		group.setText("Engineered Element Statuses");
		group.setUuid(action.getUuid() + "-engineered-element-statuses");
		group.setLocation("engineered-element-statuses.html");
		EList<Action> groupAnonymous = group.getAnonymous();
		for (EngineeredElementStatus status: engineeredElementStatuses) {
			groupAnonymous.add(createChildAction(status, registry, resolveConsumer, progressMonitor));
		}
	
		action.getNavigation().add(group);
	}	
	
	protected void createAssignmentsAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<Endeavor> assignments = getTarget().getAssignments();
		if (!assignments.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Assignments");
			group.setUuid(action.getUuid() + "-assignments");
			group.setLocation("assignments.html");
			action.getNavigation().add(group);
		}
		
	}
	
	protected void createDomainActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		List<Domain> domains = getTarget().getDomains();
		if (!domains.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Domains");
			EList<EObject> children = group.getChildren();
			for (Domain domain: domains) {
				children.add(createChildAction(domain, registry, resolveConsumer, progressMonitor));
			}
	
			action.getChildren().add(group);
		}
	}
	
	/**
	 * Creates a list of actions for modules. 
	 * @param progressMonitor
	 * @return An empty list if there are no modules. A singleton list containing a grouping action containing module actions otherwise.
	 */
	protected void createModuleActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		List<org.nasdanika.engineering.Module> modules = getTarget().getModules();
		if (!modules.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			Predicate<org.nasdanika.engineering.Module> isProduct = Product.class::isInstance;			
			group.setText(modules.stream().anyMatch(isProduct.negate()) ? "Modules" : "Products");
			group.setIcon("fas fa-cubes");
			EList<EObject> children = group.getChildren();
			for (org.nasdanika.engineering.Module module: modules) {
				children.add(createChildAction(module, registry, resolveConsumer, progressMonitor));
			}
	
			action.getChildren().add(group);
		}
	}
	
	protected void createIncrementActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		List<Increment> increments = getTarget().getIncrements();
		if (!increments.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Increments");
			group.setIcon("far fa-calendar-alt");
			EList<EObject> children = group.getChildren();
			for (Increment increment: increments) {
				children.add(createChildAction(increment, registry, resolveConsumer, progressMonitor));
			}
	
			action.getChildren().add(group);
		}
	}
	
	/**
	 * Creates a list of actions for personas and adds them to the list of group's anonymous actions. 
	 * @param progressMonitor
	 * @return An empty list if there are no personas. A singleton list containing a grouping action containing persona actions otherwise.
	 */
	protected void createPersonaActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<Persona> personas = getTarget().getPersonas();
		if (!personas.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Personas");
			group.setUuid(action.getUuid() + "-personas");
			group.setLocation("personas.html");
			// TODO - icon, ...
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Persona persona: personas) {
				groupAnonymous.add(createChildAction(persona, registry, resolveConsumer, progressMonitor));
			}
		
			action.getNavigation().add(group);
		}
	}
	
	protected void createObjectiveActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<Objective> objectives = getTarget().getObjectives();
		if (!objectives.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Objectives");
			group.setUuid(action.getUuid() + "-objectives");
			group.setLocation("objectives.html");
			// TODO - icon, ...
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Objective objective: objectives) {
				groupAnonymous.add(createChildAction(objective, registry, resolveConsumer, progressMonitor));
			}
		
			action.getNavigation().add(group);
		}
	}
	
	protected void createIssueGroupingActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		T engineer = getTarget();
		EList<IssueCategory> issueCategories = engineer.getIssueCategories();
		EList<IssuePriority> issuePriorities = engineer.getIssuePriorities();
		EList<IssueSeverity> issueSeverities = engineer.getIssueSeverities();
		EList<IssueStatus> issueStatuses = engineer.getIssueStatuses();
		
		if (issueCategories.isEmpty() 
				&& issuePriorities.isEmpty()
				&& issueSeverities.isEmpty()
				&& issueStatuses.isEmpty()) {
			return;
		}

		Action root = AppFactory.eINSTANCE.createAction();
		root.setText("Issue");
		root.setUuid(action.getUuid() + "-issue");
		action.getNavigation().add(root);
		
		if (!issueCategories.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Categories");
			group.setUuid(root.getUuid() + "-categories");
			group.setLocation("issue-categories.html");
			EList<Action> groupAnonymous = group.getAnonymous();
			for (IssueCategory issueCategory: issueCategories) {
				groupAnonymous.add(createChildAction(issueCategory, registry, resolveConsumer, progressMonitor));
			}
		
			root.getChildren().add(group);
		}
		
		if (!issuePriorities.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Priorities");
			group.setUuid(root.getUuid() + "-priorities");
			group.setLocation("issue-priorities.html");
			EList<Action> groupAnonymous = group.getAnonymous();
			for (IssuePriority issuePriority: issuePriorities) {
				groupAnonymous.add(createChildAction(issuePriority, registry, resolveConsumer, progressMonitor));
			}
		
			root.getChildren().add(group);
		}
		
		if (!issueSeverities.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Severities");
			group.setUuid(root.getUuid() + "-severities");
			group.setLocation("issue-severities.html");
			EList<Action> groupAnonymous = group.getAnonymous();
			for (IssueSeverity issueSeverity: issueSeverities) {
				groupAnonymous.add(createChildAction(issueSeverity, registry, resolveConsumer, progressMonitor));
			}
		
			root.getChildren().add(group);
		}
		
		if (!issueStatuses.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Statuses");
			group.setUuid(root.getUuid() + "-statuses");
			group.setLocation("issue-statuses.html");
			EList<Action> groupAnonymous = group.getAnonymous();
			for (IssueStatus issueStatus: issueStatuses) {
				groupAnonymous.add(createChildAction(issueStatus, registry, resolveConsumer, progressMonitor));
			}
		
			root.getChildren().add(group);
		}
	}
		
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {
		super.resolve(action, context, progressMonitor);
		
		T engineer = getTarget();
		
		EList<Objective> objectives = engineer.getObjectives();
		if (!objectives.isEmpty()) {
			String objectivesGroupUUID = action.getUuid() + "-objectives";
			Optional<Action> objectivesActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> objectivesGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Action objectivesAction = objectivesActionOptional.get();
			objectivesAction.getContent().add(renderList(objectives, true, null, objectivesAction, EngineeringPackage.Literals.ENGINEER__OBJECTIVES, context, progressMonitor)); // Table?
		}
		
		EList<Persona> personas = engineer.getPersonas();
		if (!personas.isEmpty()) {
			String personaGroupUUID = action.getUuid() + "-personas";
			Optional<Action> personasActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> personaGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Action personasAction = personasActionOptional.get();
			personasAction.getContent().add(renderList(personas, true, null, personasAction, EngineeringPackage.Literals.ENGINEER__PERSONAS, context, progressMonitor)); // Table?
		}
		
		String issueGroupUUID = action.getUuid() + "-issue";
		Optional<Action> issueGroupOptional = action.getNavigation().stream()
				.filter(Action.class::isInstance)					
				.map(Action.class::cast)
				.filter(a -> issueGroupUUID.equals(a.getUuid()))
				.findFirst();
		
		if (issueGroupOptional.isPresent()) {
			Action issueGroup = issueGroupOptional.get();
			
			EList<IssueCategory> issueCategories = engineer.getIssueCategories();
			if (!issueCategories.isEmpty()) {
				String issueCategoriesUUID = issueGroup.getUuid() + "-categories";
				Optional<Action> issueCategoriesActionOptional = issueGroup.getChildren().stream()
						.filter(Action.class::isInstance)					
						.map(Action.class::cast)
						.filter(a -> issueCategoriesUUID.equals(a.getUuid()))
						.findFirst();
								
				Action issueCategoriesAction = issueCategoriesActionOptional.get();
				issueCategoriesAction.getContent().add(renderList(issueCategories, false, createIssueCategoryChildrenProvider(), issueCategoriesAction, EngineeringPackage.Literals.ENGINEER__ISSUE_CATEGORIES, context, progressMonitor)); // Table?
			}
			
			EList<IssuePriority> issuePriorities = engineer.getIssuePriorities();
			if (!issuePriorities.isEmpty()) {
				String issuePrioritiesUUID = issueGroup.getUuid() + "-priorities";
				Optional<Action> issuePrioritiesActionOptional = issueGroup.getChildren().stream()
						.filter(Action.class::isInstance)					
						.map(Action.class::cast)
						.filter(a -> issuePrioritiesUUID.equals(a.getUuid()))
						.findFirst();
				
				Action issuePrioritiesAction = issuePrioritiesActionOptional.get();
				issuePrioritiesAction.getContent().add(renderList(issuePriorities, false, null, issuePrioritiesAction, EngineeringPackage.Literals.ENGINEER__ISSUE_PRIORITIES, context, progressMonitor)); // Table?
			}
			
			EList<IssueSeverity> issueSeverities = engineer.getIssueSeverities();
			if (!issueSeverities.isEmpty()) {
				String issueSeveritiesUUID = issueGroup.getUuid() + "-severities";
				Optional<Action> issueSeveritiesActionOptional = issueGroup.getChildren().stream()
						.filter(Action.class::isInstance)					
						.map(Action.class::cast)
						.filter(a -> issueSeveritiesUUID.equals(a.getUuid()))
						.findFirst();
				
				Action issueSeveritiesAction = issueSeveritiesActionOptional.get();
				issueSeveritiesAction.getContent().add(renderList(issueSeverities, false, null, issueSeveritiesAction, EngineeringPackage.Literals.ENGINEER__ISSUE_SEVERITIES, context, progressMonitor)); // Table?
			}
			
			EList<IssueStatus> issueStatuses = engineer.getIssueStatuses();
			if (!issueStatuses.isEmpty()) {
				String issueStatusesUUID = issueGroup.getUuid() + "-statuses";
				Optional<Action> issueStatusesActionOptional = issueGroup.getChildren().stream()
						.filter(Action.class::isInstance)					
						.map(Action.class::cast)
						.filter(a -> issueStatusesUUID.equals(a.getUuid()))
						.findFirst();
				
				Action issueStatusesAction = issueStatusesActionOptional.get();
				issueStatusesAction.getContent().add(renderList(issueStatuses, false, null, issueStatusesAction, EngineeringPackage.Literals.ENGINEER__ISSUE_STATUSES, context, progressMonitor)); // Table?
			}
		}
		
		// EngineeredElement statuses		
		EList<EngineeredElementStatus> engineeredElementStatuses = engineer.getEngineeredElementStatuses();
		if (!engineeredElementStatuses.isEmpty()) {
			String engineeredElementStatusesUUID = action.getUuid() + "-engineered-element-statuses";
			Optional<Action> engineeredElementStatusesActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> engineeredElementStatusesUUID.equals(a.getUuid()))
					.findFirst();
							
			Action engineeredElementStatusesAction = engineeredElementStatusesActionOptional.get();
			engineeredElementStatusesAction.getContent().add(renderList(engineeredElementStatuses, false, createEngineeredElementStatusChildrenProvider(), engineeredElementStatusesAction, EngineeringPackage.Literals.ENGINEER__ENGINEERED_ELEMENT_STATUSES, context, progressMonitor)); // Table?
		}
		
		// Assignments		
		EList<Endeavor> assignments = getTarget().getAssignments();
		if (!assignments.isEmpty()) {
			String assignmentsGroupUUID = action.getUuid() + "-assignments";
			Optional<Action> assignmentsActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> assignmentsGroupUUID.equals(a.getUuid()))
					.findFirst();
			Action assignmentsAction = assignmentsActionOptional.get();
			Map<EClass, List<Endeavor>> groupedAssignments = Util.groupBy(assignments, EObject::eClass);
			
			List<Endeavor> features = groupedAssignments.get(EngineeringPackage.Literals.FEATURE);
			if (features != null && !features.isEmpty()) {
				Table featuresTable = buildTable(
						features, 
						action, 
						EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS, 
						context, 
						progressMonitor,
						createColumnBuilder("Feature"),
						createColumnBuilder(EcorePackage.Literals.EOBJECT___ECONTAINER, "Product"),
						createColumnBuilder(EngineeringPackage.Literals.ENGINEERED_CAPABILITY__RELEASES),
						createColumnBuilder(NcorePackage.Literals.PERIOD__START),
						createColumnBuilder(NcorePackage.Literals.PERIOD__END),
						createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION),
						createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
				
				Action section = AppFactory.eINSTANCE.createAction();
				section.setText("Features");
				section.getContent().add(featuresTable);
			
				assignmentsAction.getSections().add(section);
			}
			
			List<Endeavor> increments = groupedAssignments.get(EngineeringPackage.Literals.INCREMENT);
			if (increments != null && !increments.isEmpty()) {
				Table incrementsTable = buildTable(
						increments, 
						action, 
						EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS, 
						context, 
						progressMonitor,
						createColumnBuilder("Increment"),
						createColumnBuilder(NcorePackage.Literals.PERIOD__START),
						createColumnBuilder(NcorePackage.Literals.PERIOD__END),
						createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION),
						createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
				
				Action section = AppFactory.eINSTANCE.createAction();
				section.setText("Increments");
				section.getContent().add(incrementsTable);
			
				assignmentsAction.getSections().add(section);
			}
			
			List<Endeavor> issues = groupedAssignments.get(EngineeringPackage.Literals.ISSUE);
			if (issues != null && !issues.isEmpty()) {
				Table issuesTable = buildTable(
						issues, 
						action, 
						EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS, 
						context, 
						progressMonitor,
						createColumnBuilder("Issue"),
						createColumnBuilder(EcorePackage.Literals.EOBJECT___ECONTAINER, "Module"),
						createColumnBuilder(EngineeringPackage.Literals.ISSUE__INCREMENT),
						createColumnBuilder(NcorePackage.Literals.PERIOD__START),
						createColumnBuilder(NcorePackage.Literals.PERIOD__END),
						createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION),
						createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
				
				Action section = AppFactory.eINSTANCE.createAction();
				section.setText("Issues");
				section.getContent().add(issuesTable);
			
				assignmentsAction.getSections().add(section);
			}
			
			List<Endeavor> releases = groupedAssignments.get(EngineeringPackage.Literals.RELEASE);
			if (releases != null && !releases.isEmpty()) {
				Table releasesTable = buildTable(
						releases, 
						action, 
						EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS, 
						context, 
						progressMonitor,
						createColumnBuilder("Release"),
						createColumnBuilder(EcorePackage.Literals.EOBJECT___ECONTAINER, "Product"),
						createColumnBuilder(EngineeringPackage.Literals.RELEASE__INCREMENT),
						createColumnBuilder(NcorePackage.Literals.PERIOD__START),
						createColumnBuilder(NcorePackage.Literals.PERIOD__END),
						createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION),
						createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
				
				Action section = AppFactory.eINSTANCE.createAction();
				section.setText("Releases");
				section.getContent().add(releasesTable);
			
				assignmentsAction.getSections().add(section);
			}			
		}		
	}

	private ContentProvider<EngineeredElementStatus> createEngineeredElementStatusChildrenProvider() {
		return new ContentProvider<EngineeredElementStatus>() {

			@Override
			public List<EObject> createContent(
					EngineeredElementStatus element, 
					Action base, 
					ETypedElement typedElement,
					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
					ProgressMonitor progressMonitor) {
				
				EList<EngineeredElementStatus> children = element.getChildren();
				if (children.isEmpty()) {
					return null;
				}
				return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS__CHILDREN, context, progressMonitor));
			}
			
		};
	}

	private ContentProvider<IssueCategory> createIssueCategoryChildrenProvider() {
		return new ContentProvider<IssueCategory>() {

			@Override
			public List<EObject> createContent(
					IssueCategory element, 
					Action base, 
					ETypedElement typedElement,
					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
					ProgressMonitor progressMonitor) {
				
				EList<IssueCategory> children = element.getChildren();
				if (children.isEmpty()) {
					return null;
				}
				return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.ISSUE_CATEGORY__CHILDREN, context, progressMonitor));
			}
			
		};
	}
		
}
