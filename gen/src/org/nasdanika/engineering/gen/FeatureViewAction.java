package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.html.app.Action;

public class FeatureViewAction extends EngineeredCapabilityViewAction<Feature> {
	
	protected FeatureViewAction(Feature value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected boolean isPropertyFeature(EStructuralFeature sf) {
		if (sf == EngineeringPackage.Literals.FEATURE__RELEASES) {
			return true;
		}
		return super.isPropertyFeature(sf);
	}
		
	@Override
	public List<Action> getChildren() {
		List<Action> children = super.getChildren();
		
		Action issuesSection = issuesSection(
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
		
		if (issuesSection != null) {
			children.add(issuesSection);
		}
				
		return children;
	}
	
	@Override
	protected boolean isContentReference(EReference ref) {
		if (ref == EngineeringPackage.Literals.FEATURE__ISSUES) {
			return false;
		}
		
		return super.isContentReference(ref);
	}
	
}
