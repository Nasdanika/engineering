package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeredElement;
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
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;

public class EngineeredElementViewAction<T extends EngineeredElement> extends NamedElementViewAction<T> {
	
	protected EngineeredElementViewAction(T value) {
		super(value);
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
			issuesSection.setText("Issues"); 			
			issuesSection.setActivator(new PathNavigationActionActivator(issuesSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#issues", getMarker()));
			children.add(issuesSection);			
		}
		
		return children;
	}
			
	@Override
	protected boolean isChildFeature(EReference ref) {
		if (ref == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES) {
			return false;
		}
		return super.isChildFeature(ref);
	}
	

}
