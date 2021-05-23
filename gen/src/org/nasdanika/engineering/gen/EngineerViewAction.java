package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;

public class EngineerViewAction<T extends Engineer> extends PersonaViewAction<T> {
		
	public EngineerViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS) {
			return Collections.singleton(issuesSection(
					getSemanticElement().getAssignments(), 
					"Assignments", 
					"assignments", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ISSUE__START,
					EngineeringPackage.Literals.ISSUE__END,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
					EngineeringPackage.Literals.ISSUE__REMAINING_COST,
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
		}
		
		if (feature == EngineeringPackage.Literals.ENGINEER__CAPACITY) {
			// TODO
			return Collections.emptyList();
		}
		
		if (feature == EngineeringPackage.Literals.ENGINEER__DESIGNATIONS) {
			// TODO
			return Collections.emptyList();
		}

		return super.featureActions(feature);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		if (feature == EngineeringPackage.Literals.ENGINEER__INCREMENTS) {
			return role == FeatureRole.ELEMENT_ACTIONS || role == FeatureRole.CONTENT;
		}
		if (feature == EngineeringPackage.Literals.ENGINEER__CAPACITY) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		if (feature == EngineeringPackage.Literals.ENGINEER__DESIGNATIONS) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		
		return super.isFeatureInRole(feature, role);
	}
		
	@Override
	protected Object featureContent(EStructuralFeature feature, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (feature == EngineeringPackage.Literals.ENGINEER__INCREMENTS) {
			HTMLFactory htmlFactory = viewGenerator.getHTMLFactory();
			int headerLevel = viewGenerator.get(SectionStyle.HEADER_LEVEL, Integer.class, 3);
			Fragment ret = htmlFactory.fragment(htmlFactory.tag("h" + headerLevel, Util.nameToLabel(feature.getName())));
			Collection<Issue> scheduledIssues = new ArrayList<>();
			getSemanticElement().getIncrements().forEach(i -> collectAllIncrementIssues(i, scheduledIssues));		
			Function<Increment, Collection<Issue>> issueSource = in -> scheduledIssues.stream().filter(is -> is.getIncrement() == in).collect(Collectors.toList());
			ret.content(IncrementViewAction.incrementsTable(getSemanticElement().getIncrements(), issueSource, true, viewGenerator, progressMonitor));
			return ret.toString();
		}
		// TODO Auto-generated method stub
		return super.featureContent(feature, viewGenerator, progressMonitor);
	}
	
	private void collectAllIncrementIssues(Increment increment, Collection<Issue> collector) {
		collector.addAll(increment.getIssues());
		increment.getChildren().forEach(c -> collectAllIncrementIssues(c, collector));
	}

}
