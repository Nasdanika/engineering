package org.nasdanika.engineering.gen;

import java.util.function.Function;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Capability;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class CapabilityViewAction<T extends Capability> extends NamedElementViewAction<T> {
	
	protected CapabilityViewAction(T value, Function<Resource, String> resourcePathResolver) {
		super(value, resourcePathResolver);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		
		// TODO - required by - list of actions, ...
		
		
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}

}
