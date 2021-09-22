package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.IssuePriority;
import org.nasdanika.html.app.Action;

public class IssuePriorityViewAction extends NamedElementViewAction<IssuePriority> {
		
	public IssuePriorityViewAction(IssuePriority value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
		
	@Override
	protected Collection<Action> memberActions(ETypedElement member) {
		if (member == EngineeringPackage.Literals.ISSUE_STATUS__ISSUES) {
			return Collections.singleton(endeavorsAction(
					getSemanticElement().getIssues(), 
					null,
					"Issues", 
					"Issues", 
					getFeatureDiagnostic((EStructuralFeature) member),					
					role -> isMemberActionInRole(member, role),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.PERIOD__START,
					EngineeringPackage.Literals.PERIOD__END,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__SEVERITY,
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

		return super.memberActions(member);
	}
	
}
