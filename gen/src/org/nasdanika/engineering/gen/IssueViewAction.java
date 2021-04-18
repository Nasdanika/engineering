package org.nasdanika.engineering.gen;

import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.emf.ViewAction;

public class IssueViewAction extends CapabilityViewAction<Issue> {
	
	protected IssueViewAction(Issue value, Function<Resource, String> resourcePathResolver) {
		super(value, resourcePathResolver);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		ret.content(viewGenerator.processViewPart(ViewAction.listOfActions(target.getRequires(), "Requires", false, false, 1), progressMonitor));				
		return ret;
	}
	
	@Override
	public boolean isInRole(String role) {
		if (target.eContainmentFeature() == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES) {
			return false; // Anonymous actions - rendered in a table.
		}
		if (target.eContainmentFeature() == EngineeringPackage.Literals.ISSUE__CHILDREN) {
			return false; // Anonymous actions - rendered in a table.
		}
		return super.isInRole(role);
	}
	
	@Override
	public List<Action> getChildren() {
		List<Action> children = super.getChildren();
		
		Action childrenSection = issuesSection(
				target.getChildren(), 
				"Children", 
				"children", 
				EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
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
