package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.IssueStatus;

public class IssueStatusActionProvider extends NamedElementActionProvider<IssueStatus> {
	
	public IssueStatusActionProvider(IssueStatus target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.ISSUE_STATUS__DONE);
		return properties;
	}
		
	// Issues.
}
