package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.html.app.Action;

public class IssueStatusViewAction extends NamedElementViewAction<IssueStatus> {
		
	public IssueStatusViewAction(IssueStatus value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
		
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ISSUE_STATUS__ISSUES) {
			return Collections.singleton(endeavorsSection(
					getSemanticElement().getIssues(), 
					null,
					"Issues", 
					"Issues", 
					getFeatureDiagnostic(feature),					
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ISSUE__CATEGORIES,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
					EngineeringPackage.Literals.ISSUE__REMAINING_COST,
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
		}

		return super.featureActions(feature);
	}
	
}
