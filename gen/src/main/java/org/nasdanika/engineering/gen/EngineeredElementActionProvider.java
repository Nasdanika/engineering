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
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Principle;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.ncore.NcorePackage;

public class EngineeredElementActionProvider<T extends EngineeredElement> extends ForumActionProvider<T> {
	
	public EngineeredElementActionProvider(T target, Context context) {
		super(target, context);		
	}
	
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNERS);
		properties.add(EngineeringPackage.Literals.ENGINEERED_ELEMENT__EXPERTS);
		return properties;
	}	
	
	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		
		createIssuesAction(action, registry, resolveConsumer, progressMonitor);		
		createAllIssuesAction(action, registry, resolveConsumer, progressMonitor);		
		createPrinciplesActions(action, registry, resolveConsumer, progressMonitor);
		
		return action;
	}
	
	protected void createIssuesAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Issue> issues = getTarget().getIssues();
		if (!issues.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Issues");
			group.setUuid(action.getUuid() + "-issues");
			group.setLocation("issues.html");
			//group.setNotification(String.valueOf(issues.size()));
			// TODO - icon, ...
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Issue issue: issues) {
				groupAnonymous.add(createChildAction(issue, registry, resolveConsumer, progressMonitor));
			}
		
			action.getNavigation().add(group);
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
		
		T engineeredElement = getTarget();
		EList<Issue> issues = engineeredElement.getIssues();
		if (!issues.isEmpty()) {
			String issuesGroupUUID = action.getUuid() + "-issues";
			Optional<Action> issuesActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> issuesGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Action issuesAction = issuesActionOptional.get();
			issuesAction.getContent().add(renderList(issues, true, createIssueChildrenProvider(), issuesAction, EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES, context, progressMonitor)); // Table?
		}
		
		EList<Issue> allIssues = engineeredElement.getAllIssues();
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
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__RELEASES),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__INCREMENT),
					createColumnBuilder(NcorePackage.Literals.PERIOD__START),
					createColumnBuilder(NcorePackage.Literals.PERIOD__END),
					createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION));
			
			allIssuesAction.getContent().add(allIssuesTable);
		}
		
		EList<Principle> principles = getTarget().getPrinciples();
		if (!principles.isEmpty()) {
			String principlesGroupUUID = action.getUuid() + "-principles";
			Optional<Action> principlesActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)
					.map(Action.class::cast)
					.filter(a -> principlesGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Action principlesAction = principlesActionOptional.get();
			principlesAction.getContent().add(renderList(principles, true, createPrincipleChildrenListProvider(), action, EngineeringPackage.Literals.ENGINEERED_ELEMENT__PRINCIPLES, context, progressMonitor));
		}
	}

	protected ContentProvider<Principle> createPrincipleChildrenListProvider() {
		ContentProvider<Principle> goalChildrenListProvider = new ContentProvider<Principle>() {

			@Override
			public List<EObject> createContent(
					Principle element, 
					Action base, 
					ETypedElement typedElement,
					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
					ProgressMonitor progressMonitor) throws Exception {
				
				EList<Principle> children = element.getChildren();
				if (children.isEmpty()) {
					return null;
				}
				return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.PRINCIPLE__CHILDREN, context, progressMonitor));
			}
			
		};
		return goalChildrenListProvider;
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
	
	protected void createPrinciplesActions(
			Action action, 
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Principle> principles = getTarget().getPrinciples();
		if (!principles.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Principles");
			group.setUuid(action.getUuid() + "-principles");
			group.setLocation("principles.html");
			action.getNavigation().add(group);
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Principle principle: principles) {
				groupAnonymous.add(createChildAction(principle, registry, resolveConsumer, progressMonitor));
			}
		}
	}

}
