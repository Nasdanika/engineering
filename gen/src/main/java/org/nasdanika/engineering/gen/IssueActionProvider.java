package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;

public class IssueActionProvider extends EngineeredCapabilityActionProvider<Issue> {
	
	public IssueActionProvider(Issue target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.ISSUE__CATEGORIES);
		properties.add(EngineeringPackage.Literals.ISSUE__PRIORITY);
		properties.add(EngineeringPackage.Literals.ISSUE__SEVERITY);
		properties.add(EngineeringPackage.Literals.ISSUE__STATUS);
		return properties;
	}
		
}
