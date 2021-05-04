package org.nasdanika.engineering.gen;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.html.app.Action;

public class IssueCategoryViewAction extends NamedElementViewAction<IssueCategory> {
		
	public IssueCategoryViewAction(IssueCategory value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Action featureAction(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ISSUE_CATEGORY__ISSUES) {
			return issuesSection(
					target.getIssues(), 
					"Issues", 
					"Issues", 
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ISSUE__BENEFIT);
		}

		return super.featureAction(feature);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.ISSUE_CATEGORY__ISSUES) {
			return role == FeatureRole.FEATURE_ACTION;
		}

		return super.isFeatureInRole(feature, role);
	}

}
