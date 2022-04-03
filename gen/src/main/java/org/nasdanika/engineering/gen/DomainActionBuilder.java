package org.nasdanika.engineering.gen;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Domain;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.html.model.app.Action;

public class DomainActionBuilder extends EngineeredElementActionBuilder<Domain> {
	
	public DomainActionBuilder(Domain target, Context context) {
		super(target, context);		
	}
		
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);		
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
