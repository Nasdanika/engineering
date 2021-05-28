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
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Release;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.emf.EStructuralFeatureViewActionImpl;

public class EngineerViewAction<T extends Engineer> extends PersonaViewAction<T> {
		
	public EngineerViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS) {
			EStructuralFeatureViewActionImpl<T, EStructuralFeature> assignmentsAction = new EStructuralFeatureViewActionImpl<T, EStructuralFeature>(getSemanticElement(), feature);
			assignmentsAction.getRoles().add(Action.Role.SECTION);
			
			assignmentsAction.getChildren().add(endeavorsSection(
					getSemanticElement().getAssignments().stream().filter(e -> e instanceof Release && !e.getAllIssues().isEmpty()).collect(Collectors.toList()), 
					"Releases", 
					"assignments-releases", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST,					
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));			
			
			assignmentsAction.getChildren().add(endeavorsSection(
					getSemanticElement().getAssignments().stream().filter(e -> e instanceof Feature && !e.getAllIssues().isEmpty()).collect(Collectors.toList()), 
					"Features", 
					"assignments-features", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST,					
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));			
			
			assignmentsAction.getChildren().add(endeavorsSection(
					getSemanticElement().getAssignments().stream().filter(e -> e instanceof Increment && !e.getAllIssues().isEmpty()).collect(Collectors.toList()), 
					"Increments", 
					"assignments-increments", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST,					
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));			
			
			assignmentsAction.getChildren().add(endeavorsSection(
					getSemanticElement().getAssignments().stream().filter(e -> e instanceof Issue).collect(Collectors.toList()), 
					"Issues", 
					"assignments-issues", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
					EngineeringPackage.Literals.ISSUE__REMAINING_COST,
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));			
			
			assignmentsAction.setSectionStyle(assignmentsAction.getChildren().size() > 1 ? SectionStyle.CARD_PILL : SectionStyle.DEFAULT);
			return Collections.singleton(assignmentsAction);
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
			Collection<Issue> scheduledIssues = new ArrayList<>();
			getSemanticElement().getIncrements().forEach(i -> collectAllIncrementIssues(i, scheduledIssues));
			if (scheduledIssues.isEmpty()) {
				return null;
			}
			HTMLFactory htmlFactory = viewGenerator.getHTMLFactory();
			int headerLevel = viewGenerator.get(SectionStyle.HEADER_LEVEL, Integer.class, 3);
			Fragment ret = htmlFactory.fragment(htmlFactory.tag("h" + headerLevel, Util.nameToLabel(feature.getName())));
			Function<Increment, Collection<Issue>> issueSource = in -> scheduledIssues.stream().filter(is -> is.getIncrement() == in).collect(Collectors.toList());
			ret.content(IncrementViewAction.incrementsTable(getSemanticElement().getIncrements(), issueSource, true, viewGenerator, progressMonitor));
			return ret.toString();
		}
		return super.featureContent(feature, viewGenerator, progressMonitor);
	}
	
	private void collectAllIncrementIssues(Increment increment, Collection<Issue> collector) {
		collector.addAll(increment.getIssues());
		increment.getChildren().forEach(c -> collectAllIncrementIssues(c, collector));
	}

}
