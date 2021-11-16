package org.nasdanika.engineering.gen;

import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.model.app.Action;

public class ModuleActionProvider<T extends org.nasdanika.engineering.Module> extends EngineeredElementActionProvider<T> {
	
	public ModuleActionProvider(T target, Context context) {
		super(target, context);		
	}
		
	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		action.setIcon("fas fa-cube");		
		
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
		List<org.nasdanika.engineering.Module> modules = getTarget().getModules();
		if (!modules.isEmpty()) {
	//		Action group = AppFactory.eINSTANCE.createAction();
	//		Predicate<org.nasdanika.engineering.Module> isProduct = Product.class::isInstance;			
	//		group.setText(modules.stream().anyMatch(isProduct.negate()) ? "Modules" : "Products");
	//		group.setIcon("fas fa-cubes");
			EList<EObject> children = action.getChildren();
			for (org.nasdanika.engineering.Module module: modules) {
				children.add(createChildAction(module, registry, resolveConsumer, progressMonitor));
			}
		}		
	}	
	
}
