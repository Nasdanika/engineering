package org.nasdanika.engineering.gen;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Capability;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class CapabilityViewAction<T extends Capability> extends NamedElementViewAction<T> {
	
	protected CapabilityViewAction(T value) {
		super(value);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		
		// TODO - required by - list of actions, ...
		
		
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}

}
