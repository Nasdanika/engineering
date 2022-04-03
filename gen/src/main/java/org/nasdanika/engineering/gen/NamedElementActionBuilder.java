package org.nasdanika.engineering.gen;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.html.model.app.Action;

public class NamedElementActionBuilder<T extends NamedElement> extends ModelElementActionBuilder<T> {
	
	public NamedElementActionBuilder(T target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action ret = super.buildAction(action, registry, resolveConsumer, progressMonitor);		
		
		ret.setText(getTarget().getName()); // Escape?
		return ret;
	}

	@Override
	public String name() {
		return getTarget().getName();
	}
	
}
