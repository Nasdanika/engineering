package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.ncore.util.NamedElementComparator;

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
		
		EList<EObject> children = action.getChildren();
		children.addAll(createModuleActions(registry, resolveConsumer, progressMonitor));
		
		return action;
	}
	
	/**
	 * Creates a list of actions for sub-packages. 
	 * @param progressMonitor
	 * @return An empty list if there are no sub-packages. A singleton list containing a grouping action containing sub-package actions otherwise.
	 * @throws Exception 
	 */
	protected List<Action> createModuleActions(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		List<org.nasdanika.engineering.Module> modules = getTarget().getModules().stream().sorted(NamedElementComparator.INSTANCE).collect(Collectors.toList());
		if (modules.isEmpty()) {
			return Collections.emptyList();
		}
		Action group = AppFactory.eINSTANCE.createAction();
		group.setText("Modules");
		// TODO - icon, ...
		EList<EObject> children = group.getChildren();
		for (org.nasdanika.engineering.Module module: modules) {
			children.add(createChildAction(module, registry, resolveConsumer, progressMonitor));
		}
		
		return Collections.singletonList(group);
	}	
	
}
