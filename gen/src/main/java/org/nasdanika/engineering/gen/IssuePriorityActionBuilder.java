package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssuePriority;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.ncore.NcorePackage;

public class IssuePriorityActionBuilder extends NamedElementActionBuilder<IssuePriority> {
	
	public IssuePriorityActionBuilder(IssuePriority target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		List<Issue> issues = getTarget().getIssues();
		if (!issues.isEmpty()) {
			Table issuesTable = buildTable(
					issues, 
					action, 
					EngineeringPackage.Literals.ISSUE_CATEGORY__ISSUES, 
					context, 
					progressMonitor,
					createColumnBuilder("Issue"),
					createColumnBuilder(EcorePackage.Literals.EOBJECT___ECONTAINER, "Module"),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__INCREMENT),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE),
					createColumnBuilder(NcorePackage.Literals.PERIOD__START),
					createColumnBuilder(NcorePackage.Literals.PERIOD__END),
					createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
			
			Action section = AppFactory.eINSTANCE.createAction();
			section.setText("Issues");
			section.getContent().add(issuesTable);
		
			action.getSections().add(section);
		}			
	}
	
}
