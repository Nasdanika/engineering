package org.nasdanika.engineering.gen;

import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.model.app.Action;

public class ModuleActionBuilder<T extends org.nasdanika.engineering.Module> extends EngineeredElementActionBuilder<T> {
	
	public ModuleActionBuilder(T target, Context context) {
		super(target, context);		
	}
		
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {

		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		if (Util.isBlank(action.getIcon())) {
			action.setIcon("fas fa-cube");		
		}
		
		createModuleActions(action, registry, resolveConsumer, progressMonitor);
		
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
	 * @throws Exception 
	 */
	protected void createModuleActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		EList<EObject> children = action.getChildren();
		for (org.nasdanika.engineering.Module module: getTarget().getModules()) {
			children.add(createChildAction(module, registry, resolveConsumer, progressMonitor));
		}
	}	
	
}
