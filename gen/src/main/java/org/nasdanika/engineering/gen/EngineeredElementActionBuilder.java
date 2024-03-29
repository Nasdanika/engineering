package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.Connection;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Topic;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.html.model.html.Tag;
import org.nasdanika.ncore.NcorePackage;

public class EngineeredElementActionBuilder<T extends EngineeredElement> extends ForumActionBuilder<T> {
	
	public EngineeredElementActionBuilder(T target, Context context) {
		super(target, context);		
	}
	
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.ENGINEERED_ELEMENT__STATUS);
		properties.add(EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNERS);
		properties.add(EngineeringPackage.Literals.ENGINEERED_ELEMENT__EXPERTS);
		properties.add(EngineeringPackage.Literals.ENGINEERED_ELEMENT__AFFECTED_BY);
		return properties;
	}	
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		createIssuesAction(action, registry, resolveConsumer, progressMonitor);		
		createAllIssuesAction(action, registry, resolveConsumer, progressMonitor);		
		createPrinciplesActions(action, registry, resolveConsumer, progressMonitor);
		createDiscussionAction(action, registry, resolveConsumer, progressMonitor);		
		
		createOutboundConnectionsActions(action, registry, resolveConsumer, progressMonitor);
		
		return action;
	}
	
	protected void createOutboundConnectionsActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		EList<Action> groupAnonymous = action.getAnonymous();
		for (Connection outboundConnection: getTarget().getOutboundConnections()) {
			groupAnonymous.add(createChildAction(outboundConnection, registry, resolveConsumer, progressMonitor));
		}
	}
	
	protected void createIssuesAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
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
			ProgressMonitor progressMonitor) {
		
		List<Issue> allIssues = getTarget().getAllIssues();
		if (!allIssues.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("All Issues");
			group.setUuid(action.getUuid() + "-all-issues");
			group.setLocation("all-issues.html");
			action.getNavigation().add(group);
		}
		
	}
	
	protected void createDiscussionAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<Forum> discussion = getTarget().getDiscussion();
		EList<Topic> topics = getTarget().getTopics();
		if (!discussion.isEmpty() || !topics.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Discussion");
			group.setIcon("far fa-comments");
			group.setUuid(action.getUuid() + "-discussion");
			group.setLocation("discussion.html");
			action.getNavigation().add(group);
		}		
	}
	
	private static int compareActions(Action a, Action b) {
		if (a == null) {
			if (b == null) {
				return 0;
			}
			return 1;
		}
		if (b == null) {
			return -1;
		}
		
		String aText = a.getText();
		String bText = b.getText();		
		if (Util.isBlank(aText)) {
			return Util.isBlank(bText) ? 0 : 1;
		}
		if (Util.isBlank(bText)) {
			return -1;
		}
		return aText.compareTo(bText);
	}
		
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {
		super.resolve(action, context, progressMonitor);
		
		// Outbound connections
		EList<Connection> outboundConnections = getTarget().getOutboundConnections();
		if (!outboundConnections.isEmpty()) {
			Action outboundConnectionsAction = AppFactory.eINSTANCE.createAction();
			outboundConnectionsAction.setText("Outbound connections");
			action.getSections().add(outboundConnectionsAction);
			
			Table outboundConnectionsTable = buildTable(
					outboundConnections, 
					action, 
					EngineeringPackage.Literals.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS, 
					context, 
					progressMonitor, 
					createColumnBuilder("Name"),
					createColumnBuilder(EngineeringPackage.Literals.CONNECTION__TARGET),
					createColumnBuilder(NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION));
			
			outboundConnectionsAction.getContent().add(outboundConnectionsTable);			
		}
				
		// Inbound connections
		Comparator<Connection> inboundConnectionComparator = (a, b) -> {
			if (a == b) {
				return 0;
			}
			
			// Connections
			int ret = compareActions(context.getAction(a), context.getAction(b));
			return ret == 0 ? compareActions(context.getAction(a.eContainer()), context.getAction(b.eContainer())) : ret;
		};
		List<Connection> inboundConnections = getTarget().getInboundConnections().stream().sorted(inboundConnectionComparator).collect(Collectors.toList());
		if (!inboundConnections.isEmpty()) {
			Action inboundConnectionsAction = AppFactory.eINSTANCE.createAction();
			inboundConnectionsAction.setText("Inbound connections");
			action.getSections().add(inboundConnectionsAction);
			
			Table inboundConnectionsTable = buildTable(
					inboundConnections, 
					action, 
					EngineeringPackage.Literals.CONNECTION_TARGET__INBOUND_CONNECTIONS, 
					context, 
					progressMonitor, 
					createColumnBuilder("Name"),
					createColumnBuilder(EcorePackage.Literals.EOBJECT___ECONTAINER, "Source"),
					createColumnBuilder(NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION));
			
			inboundConnectionsAction.getContent().add(inboundConnectionsTable);			
		}
		
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
			Optional<Action> allIssuesActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> allIssuesGroupUUID.equals(a.getUuid()))
					.findFirst();
			Action allIssuesAction = allIssuesActionOptional.get();
			Tag allIssuesTable = buildDynamicTable(
					allIssues, 
					action, 
					EngineeringPackage.Literals.ENGINEERED_ELEMENT__ALL_ISSUES,
					"engineered-element--all-issues",
					null,
					context, 
					progressMonitor,
					createDynamicColumnBuilder("Issue", true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__TARGET, true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE, true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__CATEGORIES, true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__PRIORITY, true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__SEVERITY, true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__STATUS, true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__WORKABLE, true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__BENEFIT, false),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__COST, false),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__EFFORT, false),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__REMAINING_COST, false),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT, false),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION, true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ENGINEERED_CAPABILITY__RELEASES, true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO, true),
					createDynamicColumnBuilder(EngineeringPackage.Literals.ISSUE__INCREMENT, true),
					createDynamicColumnBuilder(NcorePackage.Literals.PERIOD__START, true),
					createDynamicColumnBuilder(NcorePackage.Literals.PERIOD__END, true),
					createDynamicColumnBuilder(NcorePackage.Literals.PERIOD__DURATION, false));
			
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
					ProgressMonitor progressMonitor) {
				
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
					ProgressMonitor progressMonitor) {
				
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
			ProgressMonitor progressMonitor) {
		
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
