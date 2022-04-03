package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Principle;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class PrincipleActionBuilder extends AimActionBuilder<Principle> {
	
	public PrincipleActionBuilder(Principle target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		createChildrenActions(action, registry, resolveConsumer, progressMonitor);
		
		return action;
	}
	
	protected void createChildrenActions(
			Action action, 
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Principle> children = getTarget().getChildren();
		if (!children.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Children");
			group.setUuid(action.getUuid() + "-children");
			action.getSections().add(group);
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Principle goal: children) {
				groupAnonymous.add(createChildAction(goal, registry, resolveConsumer, progressMonitor));
			}
		}
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<Principle> children = getTarget().getChildren();
		if (!children.isEmpty()) {
			String childrenGroupUUID = action.getUuid() + "-children";
			Optional<Action> childrenActionOptional = action.getSections().stream()
					.filter(a -> childrenGroupUUID.equals(a.getUuid()))
					.findFirst();
			childrenActionOptional.get().getContent().add(renderList(children, true, createGoalChildrenListProvider(), action, EngineeringPackage.Literals.ENGINEERED_ELEMENT__PRINCIPLES, context, progressMonitor));
		}
	}

	protected ContentProvider<Principle> createGoalChildrenListProvider() {
		ContentProvider<Principle> principleChildrenListProvider = new ContentProvider<Principle>() {

			@Override
			public List<EObject> createContent(
					Principle element, 
					Action base, 
					ETypedElement typedElement,
					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
					ProgressMonitor progressMonitor) throws Exception {
				
				EList<Principle> children = element.getChildren();
				if (children.isEmpty()) {
					return null;
				}
				return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.PRINCIPLE__CHILDREN, context, progressMonitor));
			}
			
		};
		return principleChildrenListProvider;
	}
	
}
