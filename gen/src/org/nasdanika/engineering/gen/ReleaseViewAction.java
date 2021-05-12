package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Release;
import org.nasdanika.html.app.Action;

public class ReleaseViewAction extends EngineeredCapabilityViewAction<Release> {
	
	protected ReleaseViewAction(Release value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.RELEASE__ISSUES) {
			return Collections.singleton(issuesSection(
					getSemanticElement().getIssues(), 
					"Issues", 
					"issues", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
					EngineeringPackage.Literals.ISSUE__TARGET,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ISSUE__BENEFIT));			
		}

		return super.featureActions(feature);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.RELEASE__ISSUES) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		return super.isFeatureInRole(feature, role);
	}

}
