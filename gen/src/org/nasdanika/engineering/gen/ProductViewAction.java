package org.nasdanika.engineering.gen;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Product;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class ProductViewAction<T extends Product> extends ModuleViewAction<T> {
	
	public ProductViewAction(T value) {
		super(value);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}

}
