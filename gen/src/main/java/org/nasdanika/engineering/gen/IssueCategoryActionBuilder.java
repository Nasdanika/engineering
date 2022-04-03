package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.ncore.NcorePackage;

public class IssueCategoryActionBuilder extends AimActionBuilder<IssueCategory> {
	
	public IssueCategoryActionBuilder(IssueCategory target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.ISSUE_CATEGORY__WEIGHT);
		return properties;
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		action.getSections().addAll(createChildrenActions(registry, resolveConsumer, progressMonitor));
		
		return action;
	}
	
	protected List<Action> createChildrenActions(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<IssueCategory> children = getTarget().getChildren();
		if (children.isEmpty()) {
			return Collections.emptyList();
		}
		Action group = AppFactory.eINSTANCE.createAction();
		group.setText("Sub-categories");
		EList<Action> groupAnonymous = group.getAnonymous();
		for (IssueCategory subCategory: children) {
			groupAnonymous.add(createChildAction(subCategory, registry, resolveConsumer, progressMonitor));
		}
		
		return Collections.singletonList(group);
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<IssueCategory> children = getTarget().getChildren();
		if (!children.isEmpty()) {
			Action childrenAction = (Action) action.getSections().get(0);
			ContentProvider<IssueCategory> issueCategoryChildrenListProvider = new ContentProvider<IssueCategory>() {

				@Override
				public List<EObject> createContent(
						IssueCategory element, 
						Action base, 
						ETypedElement typedElement,
						org.nasdanika.html.emf.EObjectActionResolver.Context context, 
						ProgressMonitor progressMonitor) throws Exception {
					
					EList<IssueCategory> children = element.getChildren();
					if (children.isEmpty()) {
						return null;
					}
					return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.ISSUE_CATEGORY__CHILDREN, context, progressMonitor));
				}
				
			};
			
			childrenAction.getContent().add(renderList(children, true, issueCategoryChildrenListProvider, action, EngineeringPackage.Literals.ENGINEER__ISSUE_CATEGORIES, context, progressMonitor));
		}
		
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
