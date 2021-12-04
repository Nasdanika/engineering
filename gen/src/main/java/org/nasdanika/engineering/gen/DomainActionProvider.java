package org.nasdanika.engineering.gen;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Domain;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.html.model.app.Action;

public class DomainActionProvider extends EngineeredElementActionProvider<Domain> {
	
	public DomainActionProvider(Domain target, Context context) {
		super(target, context);		
	}
		
	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);		
		createElementActions(action, registry, resolveConsumer, progressMonitor);		
		return action;
	}
	
	protected void createElementActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		EList<EObject> children = action.getChildren();
		for (EngineeredElement element: getTarget().getElements()) {
			children.add(createChildAction(element, registry, resolveConsumer, progressMonitor));
		}
	}	
	
}
