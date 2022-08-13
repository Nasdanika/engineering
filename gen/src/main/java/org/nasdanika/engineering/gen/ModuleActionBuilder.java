package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Interface;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class ModuleActionBuilder<T extends org.nasdanika.engineering.Module> extends EngineeredElementActionBuilder<T> {
	
	public ModuleActionBuilder(T target, Context context) {
		super(target, context);		
	}
		
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {

		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		if (Util.isBlank(action.getIcon())) {
			action.setIcon("fas fa-cube");		
		}
		
		createModuleActions(action, registry, resolveConsumer, progressMonitor);
		createInterfaceActions(action, registry, resolveConsumer, progressMonitor);
		
		return action;
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.MODULE__DEPENDENCIES);
		properties.add(EngineeringPackage.Literals.MODULE__DEPENDANTS);
		
		return properties;
	}
	
	/**
	 * Creates a list of actions for sub-packages. 
	 * @param progressMonitor
	 * @return An empty list if there are no sub-packages. A singleton list containing a grouping action containing sub-package actions otherwise.
	 */
	protected void createModuleActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		EList<EObject> children = action.getChildren();
		for (org.nasdanika.engineering.Module module: getTarget().getModules()) {
			children.add(createChildAction(module, registry, resolveConsumer, progressMonitor));
		}
	}
		
	protected void createInterfaceActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		EList<Action> groupAnonymous = action.getAnonymous();
		for (Interface moduleInterface: getTarget().getInterfaces()) {
			groupAnonymous.add(createChildAction(moduleInterface, registry, resolveConsumer, progressMonitor));
		}		
	}
		
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {
		super.resolve(action, context, progressMonitor);

		// TODO - indented table with numbers of inbound connections?
		// Interfaces
		EList<Interface> interfaces = getTarget().getInterfaces();
		if (!interfaces.isEmpty()) {
			Action interfacesAction = AppFactory.eINSTANCE.createAction();
			interfacesAction.setText("Interfaces");
			action.getSections().add(interfacesAction);
			ContentProvider<Interface> interfaceChildrenListProvider = new ContentProvider<Interface>() {

				@Override
				public List<EObject> createContent(
						Interface element, 
						Action base, 
						ETypedElement typedElement,
						org.nasdanika.html.emf.EObjectActionResolver.Context context, 
						ProgressMonitor progressMonitor) {
					
					EList<Interface> children = element.getChildren();
					if (children.isEmpty()) {
						return null;
					}
					return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.INTERFACE__CHILDREN, context, progressMonitor));
				}
				
			};
			
			interfacesAction.getContent().add(renderList(interfaces, true, interfaceChildrenListProvider, action, EngineeringPackage.Literals.MODULE__INTERFACES, context, progressMonitor));
			
		}
				
	}	
	
}
