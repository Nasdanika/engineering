package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.app.Action;

public class CapabilityViewAction<T extends Capability> extends NamedElementViewAction<T> {
	
	protected CapabilityViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.CAPABILITY__REQUIRED_BY) {
			return Collections.singleton(issuesSection(
					getSemanticElement().getRequiredBy(), 
					"Required By", 
					"required-by", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ISSUE__ASSIGNEE,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
					EngineeringPackage.Literals.ENDEAVOR__EFFORT,
					EngineeringPackage.Literals.ENDEAVOR__COST,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ENDEAVOR__REMAINING_EFFORT,
					EngineeringPackage.Literals.ENDEAVOR__REMAINING_COST,
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
		}
		return super.featureActions(feature);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.CAPABILITY__REQUIRED_BY) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}

		return super.isFeatureInRole(feature, role);
	}
	

}
