package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.html.app.Action;

public class IssueViewAction extends EngineeredCapabilityViewAction<Issue> {
	
	protected IssueViewAction(Issue value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	public boolean isInRole(String role) {
		if (getSemanticElement().eContainmentFeature() == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES) {
			return false; // Anonymous actions - rendered in a table.
		}
		if (getSemanticElement().eContainmentFeature() == EngineeringPackage.Literals.ISSUE__CHILDREN) {
			return false; // Anonymous actions - rendered in a table.
		}
		return super.isInRole(role);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.ISSUE__RELEASES) {
			return role == FeatureRole.PROPERTY;
		}
		if (feature == EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO) {
			return role == FeatureRole.PROPERTY;
		}
		if (feature == EngineeringPackage.Literals.ISSUE__CHILDREN) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ISSUE__CHILDREN) {
			return Collections.singleton(issuesSection(
					getSemanticElement().getChildren(), 
					"Children", 
					"children", 
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ISSUE__BENEFIT));
		}
		return super.featureActions(feature);
	}

}
