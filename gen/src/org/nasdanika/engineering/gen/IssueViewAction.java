package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.emf.ViewAction;

public class IssueViewAction extends CapabilityViewAction<Issue> {
	
	protected IssueViewAction(Issue value) {
		super(value);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}
	
	@Override
	protected boolean isPropertyFeature(EStructuralFeature sf) {
		if (sf == EngineeringPackage.Literals.ISSUE__INCREMENT_ID) {
			return false;
		}
		return super.isPropertyFeature(sf);
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
		
		EList<Issue> issues = target.getChildren();
		if (!issues.isEmpty()) {
			ActionImpl issuesSection = new ActionImpl() {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) { 
					BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
					Table ret = bootstrapFactory.table().bordered();
					ret.header().headerRow("Summary" /*, "Status", "Increment" */).color(Color.INFO); 
					for (Issue issue: issues) {
						Row issueRow = ret.body().row();
						ViewAction issueAction = adaptToViewActionNonNull(issue); 
						issueRow.cell(viewGenerator.link(issueAction)); 
//						issueRow.cell("TODO");
//						issueRow.cell(issue.getIn.getDescription());
//						issueRow.cell(ListOfActions(input. getPayloadQ, null, true, false, 1));
					}
					return ret;
				};
				
				@Override
				public List<Action> getChildren() {
					return adaptToViewActionNonNull(issues);
				}
			};
			
			issuesSection.getRoles().add(Action.Role.SECTION); 
			issuesSection.setText("Children"); 			
			issuesSection.setActivator(new PathNavigationActionActivator(issuesSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#issues", getMarker()));
			children.add(issuesSection);			
		}
		
		return children;
	}	

}
