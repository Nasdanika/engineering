package org.nasdanika.engineering.gen;

import java.util.function.Function;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Product;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class ProductViewAction extends ModuleViewAction<Product> {
	
	public ProductViewAction(Product value, Function<Resource, String> resourcePathResolver) {
		super(value, resourcePathResolver);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}

}
