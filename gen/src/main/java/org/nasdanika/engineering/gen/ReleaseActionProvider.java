package org.nasdanika.engineering.gen;

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
import org.nasdanika.engineering.Release;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.ncore.NcorePackage;

public class ReleaseActionProvider extends EngineeredCapabilityActionProvider<Release> {
	
	public ReleaseActionProvider(Release target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.RELEASE__INCREMENT);
		return properties;
	}
	

	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		
		createIssuesAction(action, registry, resolveConsumer, progressMonitor);		
		createFeaturesAction(action, registry, resolveConsumer, progressMonitor);		
		
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
	protected void createFeaturesAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Feature> features = getTarget().getFeatures();
		if (!features.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Features");
			group.setUuid(action.getUuid() + "-features");
//			group.setLocation("issues.html");
			//group.setNotification(String.valueOf(issues.size()));
			// TODO - icon, ...
		
			action.getSections().add(group);
		}
		
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<Feature> features = getTarget().getFeatures();
		if (!features.isEmpty()) {
			String featuresGroupUUID = action.getUuid() + "-features";
			Optional<Action> featuresActionOptional = action.getSections().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> featuresGroupUUID.equals(a.getUuid()))
					.findFirst();
			Action featuresAction = featuresActionOptional.get();
			Table featuresTable = buildTable(
					features, 
					action, 
					EngineeringPackage.Literals.RELEASE__FEATURES, 
					context, 
					progressMonitor,
					createColumnBuilder("Feature"),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__BENEFIT),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION),
					createColumnBuilder(NcorePackage.Literals.PERIOD__START),
					createColumnBuilder(NcorePackage.Literals.PERIOD__END),
					createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION));
			
			featuresAction.getContent().add(featuresTable);
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
					EngineeringPackage.Literals.RELEASE__ISSUES, 
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
