package org.nasdanika.engineering.gen;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.html.app.Action;

public class FeatureViewAction extends EngineeredCapabilityViewAction<Feature> {
	
	protected FeatureViewAction(Feature value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.FEATURE__RELEASES) {
			return role == FeatureRole.PROPERTY;
		}
		if (feature == EngineeringPackage.Literals.FEATURE__ISSUES) {
			return role == FeatureRole.FEATURE_ACTION;
		}
		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	protected Action featureAction(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.FEATURE__ISSUES) {
			return issuesSection(
					target.getIssues(), 
					"Issues", 
					"issues", 
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ISSUE__BENEFIT);
		}

		return super.featureAction(feature);
	}
	
}
