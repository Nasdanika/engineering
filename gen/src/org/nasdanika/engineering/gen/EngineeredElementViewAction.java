package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.SectionStyle;

public class EngineeredElementViewAction<T extends EngineeredElement> extends NamedElementViewAction<T> {
	
	protected EngineeredElementViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> children = super.collectChildren();
		
		EList<Issue> issues = getSemanticElement().getIssues();
		Action issuesSection = issuesSection(
				issues, 
				"Issues", 
				"issues", 
				getFeatureDiagnostic(EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES),
				EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
				EngineeringPackage.Literals.ISSUE__STATUS,
				EngineeringPackage.Literals.ISSUE__CATEGORY,				
				EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
				EngineeringPackage.Literals.ISSUE__EFFORT,
				EngineeringPackage.Literals.ISSUE__COST,
				EngineeringPackage.Literals.ISSUE__BENEFIT);
		
		if (issuesSection != null) {
			children.add(issuesSection);
		}
		
		
		List<Issue> allIssues = new ArrayList<>();
		getSemanticElement().eAllContents().forEachRemaining(e -> {
			if (e instanceof Issue) {
				allIssues.add((Issue) e);
			}
		});
		
		if (!issues.equals(allIssues)) {
			Action allIssuesSection = ModelElementViewAction.issuesSection(
					allIssues, 
					"All Issues", 
					"all-issues", 
					null,
					getActivator(),
					Collections.emptyList(),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ISSUE__ASSIGNEE,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ISSUE__BENEFIT);
			
			if (allIssuesSection != null) {
				children.add(allIssuesSection);
			}
		}
				
		return children;
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNERS) {
			return role == FeatureRole.PROPERTY;
		}
		if (feature == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES) {
			return role == FeatureRole.ELEMENT_ACTIONS;
		}
		return super.isFeatureInRole(feature, role);
	}
			
	@Override
	public SectionStyle getSectionStyle() {
		return getSectionChildren().size() > 1 ? SectionStyle.TAB : super.getSectionStyle();
	}
	
}
