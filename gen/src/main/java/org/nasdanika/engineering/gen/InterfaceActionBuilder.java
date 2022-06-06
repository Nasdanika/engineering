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
import org.nasdanika.engineering.Interface;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class InterfaceActionBuilder extends EngineeredElementActionBuilder<Interface> {
	
	public InterfaceActionBuilder(Interface target, Context context) {
		super(target, context);		
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
		
		List<Interface> children = getTarget().getChildren();
		if (children.isEmpty()) {
			return Collections.emptyList();
		}
		Action group = AppFactory.eINSTANCE.createAction();
		group.setText("Sub-interfaces");
		EList<Action> groupAnonymous = group.getAnonymous();
		for (Interface subInterface: children) {
			groupAnonymous.add(createChildAction(subInterface, registry, resolveConsumer, progressMonitor));
		}
		
		return Collections.singletonList(group);
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<Interface> children = getTarget().getChildren();
		if (!children.isEmpty()) {
			Action childrenAction = (Action) action.getSections().get(0);
			ContentProvider<Interface> interfaceChildrenListProvider = new ContentProvider<Interface>() {

				@Override
				public List<EObject> createContent(
						Interface element, 
						Action base, 
						ETypedElement typedElement,
						org.nasdanika.html.emf.EObjectActionResolver.Context context, 
						ProgressMonitor progressMonitor) throws Exception {
					
					EList<Interface> children = element.getChildren();
					if (children.isEmpty()) {
						return null;
					}
					return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.INTERFACE__CHILDREN, context, progressMonitor));
				}
				
			};
			
			childrenAction.getContent().add(renderList(children, true, interfaceChildrenListProvider, action, EngineeringPackage.Literals.INTERFACE__CHILDREN, context, progressMonitor));
		}
	}
	
}
