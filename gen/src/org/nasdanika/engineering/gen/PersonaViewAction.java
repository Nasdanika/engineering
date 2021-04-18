package org.nasdanika.engineering.gen;

import java.util.function.Function;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Persona;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class PersonaViewAction<T extends Persona> extends EngineeredElementViewAction<T> {
	
	public PersonaViewAction(T value, Function<Resource, String> resourcePathResolver) {
		super(value, resourcePathResolver);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}

}
