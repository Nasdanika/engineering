package org.nasdanika.engineering.gen;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class EngineeredElementViewAction<T extends EngineeredElement> extends NamedElementViewAction<T> {
	
	protected EngineeredElementViewAction(T value) {
		super(value);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}

}
