package org.nasdanika.engineering.gen;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.Connection;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.model.app.Action;

public class ConnectionActionBuilder extends EngineeredElementActionBuilder<Connection> {
	
	public ConnectionActionBuilder(Connection target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action, 
			BiConsumer<EObject, Action> registry,
			Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer,
			ProgressMonitor progressMonitor) throws Exception {
		Action ret = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		if (Util.isBlank(ret.getText())) {
			ret.setText("(unnamed)");
		}
		return ret;
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.CONNECTION__TARGET);
		
		return properties;
	}
	
}
