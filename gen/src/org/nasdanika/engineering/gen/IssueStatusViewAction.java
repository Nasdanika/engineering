package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class IssueStatusViewAction extends NamedElementViewAction<IssueStatus> {
		
	public IssueStatusViewAction(IssueStatus value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}
		
	@Override
	public List<Action> getChildren() {
		List<Action> children = super.getChildren();
		
		Action issuesSection = issuesSection(
				target.getIssues(), 
				"Issues", 
				"Issues", 
				EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
				EngineeringPackage.Literals.ISSUE__CATEGORY,
				EngineeringPackage.Literals.ISSUE__TARGET,
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
		if (ref == EngineeringPackage.Literals.ISSUE_STATUS__ISSUES) {
			return false;
		}
		
		return super.isContentReference(ref);
	}
	
}
