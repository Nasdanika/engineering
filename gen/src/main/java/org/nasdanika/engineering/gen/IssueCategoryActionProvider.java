package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class IssueCategoryActionProvider extends AimActionProvider<IssueCategory> {
	
	public IssueCategoryActionProvider(IssueCategory target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		
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
		
		// TODO - issues
	}
	
}
