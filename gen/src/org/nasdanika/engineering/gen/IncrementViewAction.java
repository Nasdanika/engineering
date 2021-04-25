package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.emf.ViewAction;

public class IncrementViewAction extends NamedElementViewAction<Increment> {
	
	protected IncrementViewAction(Increment value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	public Label getCategory() {
		if (target.eContainmentFeature() == EngineeringPackage.Literals.INCREMENT__CHILDREN) {
			return null;
		}
		return super.getCategory();
	}
	
	@Override
	protected boolean isContentReference(EReference ref) {
		if (ref == EngineeringPackage.Literals.INCREMENT__ISSUES) {
			return false;
		}
		return super.isContentReference(ref);
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
		
		EList<Issue> issues = target.getIssues();
		if (!issues.isEmpty()) {
			ActionImpl issuesSection = new ActionImpl() {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) { 
					Fragment ret = viewGenerator.getHTMLFactory().fragment();
					
					ret.content(issueStatusSummaryTable(issues, viewGenerator, progressMonitor));
					
					ret.content(issuesTable(
							issues, 
							viewGenerator, 
							progressMonitor, 
							EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
							EngineeringPackage.Literals.ISSUE__STATUS,
							EngineeringPackage.Literals.ISSUE__TARGET,
							EngineeringPackage.Literals.ISSUE__CATEGORY,				
							EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
							EngineeringPackage.Literals.ISSUE__EFFORT,
							EngineeringPackage.Literals.ISSUE__COST,
							EngineeringPackage.Literals.ISSUE__BENEFIT));
					
					return ret;
				};
				
				@Override
				public List<Action> getChildren() {
					return ViewAction.adaptToViewActionNonNull(issues);
				}
			};
			
			issuesSection.getRoles().add(Action.Role.SECTION); 
			issuesSection.setText("Issues"); 			
			issuesSection.setActivator(new PathNavigationActionActivator(issuesSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#issues", getMarker()));
			children.add(issuesSection);			
		}
		
		return children;
	}
	

}
