package org.nasdanika.engineering.gen;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Product;
import org.nasdanika.html.model.app.Action;

public class ProductActionProvider extends ModuleActionProvider<Product> {
	
	public ProductActionProvider(Product target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action createAction(
			BiConsumer<EObject, Action> registry,
			Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer,
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		action.setIcon("fas fa-box");
		return action;
	}
	
}
