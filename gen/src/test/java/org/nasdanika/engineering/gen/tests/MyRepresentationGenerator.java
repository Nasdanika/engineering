package org.nasdanika.engineering.gen.tests;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Representation;
import org.nasdanika.engineering.gen.RepresentationGenerator;
import org.nasdanika.html.emf.EObjectActionResolver.Context;
import org.nasdanika.html.model.app.Action;

public class MyRepresentationGenerator implements RepresentationGenerator {

	@Override
	public void generate(
			Representation representation, 
			Action action, Context resolverContext,
			ProgressMonitor progressMonitor) throws Exception {
		System.out.println("Here we go!!!");

	}

}
