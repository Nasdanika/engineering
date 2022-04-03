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
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Issue;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.ncore.NcorePackage;

public class FeatureActionBuilder extends EngineeredCapabilityActionBuilder<Feature> {
	
	public FeatureActionBuilder(Feature target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		action.getSections().addAll(createChildrenActions(registry, resolveConsumer, progressMonitor));
		createIssuesAction(action, registry, resolveConsumer, progressMonitor);		
		
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
		
			action.getNavigation().add(group);
		}
		
	}
	
	protected List<Action> createChildrenActions(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Feature> children = getTarget().getChildren();
		if (children.isEmpty()) {
			return Collections.emptyList();
		}
		Action group = AppFactory.eINSTANCE.createAction();
		group.setText("Children");
		EList<Action> groupAnonymous = group.getAnonymous();
		for (Feature child: children) {
			groupAnonymous.add(createChildAction(child, registry, resolveConsumer, progressMonitor));
		}
		
		return Collections.singletonList(group);
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<Feature> children = getTarget().getChildren();
		if (!children.isEmpty()) {
			Action childrenAction = (Action) action.getSections().get(0);
			ContentProvider<Feature> issueCategoryChildrenListProvider = new ContentProvider<Feature>() {

				@Override
				public List<EObject> createContent(
						Feature element, 
						Action base, 
						ETypedElement typedElement,
						org.nasdanika.html.emf.EObjectActionResolver.Context context, 
						ProgressMonitor progressMonitor) throws Exception {
					
					EList<Feature> children = element.getChildren();
					if (children.isEmpty()) {
						return null;
					}
					return Collections.singletonList(renderList(children, false, this, base, EngineeringPackage.Literals.FEATURE__CHILDREN, context, progressMonitor));
				}
				
			};
			
			childrenAction.getContent().add(renderList(children, true, issueCategoryChildrenListProvider, action, EngineeringPackage.Literals.FEATURE__CHILDREN, context, progressMonitor));
		}
		
		EList<Issue> issues = getTarget().getIssues();
		if (!issues.isEmpty()) {
			String issuesGroupUUID = action.getUuid() + "-issues";
			Optional<Action> issuesActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> issuesGroupUUID.equals(a.getUuid()))
					.findFirst();
			Action issuesAction = issuesActionOptional.get();
			Table issuesTable = buildTable(
					issues, 
					action, 
					EngineeringPackage.Literals.FEATURE__ISSUES, 
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
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__INCREMENT),
					createColumnBuilder(NcorePackage.Literals.PERIOD__START),
					createColumnBuilder(NcorePackage.Literals.PERIOD__END),
					createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION));
			
			issuesAction.getContent().add(issuesTable);
		}
		
	}	
	
}
