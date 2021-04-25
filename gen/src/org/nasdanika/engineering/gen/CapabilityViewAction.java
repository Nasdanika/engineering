package org.nasdanika.engineering.gen;

import java.util.List;

import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.app.Action;

public class CapabilityViewAction<T extends Capability> extends NamedElementViewAction<T> {
	
	protected CapabilityViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
//	@Override
//	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
//		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
//		
//		// TODO - required by - list of actions, ...
//		
//		
//		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
//		return ret;
//	}
	
	@Override
	public List<Action> getChildren() {
		List<Action> children = super.getChildren();
		
		Action childrenSection = issuesSection(
				target.getRequiredBy(), 
				"Required By", 
				"required-by", 
				EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
				EngineeringPackage.Literals.ISSUE__ASSIGNEE,
				EngineeringPackage.Literals.ISSUE__STATUS,
				EngineeringPackage.Literals.ISSUE__CATEGORY,				
				EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
				EngineeringPackage.Literals.ISSUE__EFFORT,
				EngineeringPackage.Literals.ISSUE__COST,
				EngineeringPackage.Literals.ISSUE__BENEFIT);
		
		if (childrenSection != null) {
			children.add(childrenSection);
		}
		
		return children;
	}	
	

}
