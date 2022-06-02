package org.nasdanika.engineering.gen;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.engineering.Representation;
import org.nasdanika.html.model.app.Action;

/**
 * Generates representations.
 * @author Pavel
 *
 */
public interface RepresentationGenerator {
	
	interface Supplier extends org.nasdanika.common.Supplier<RepresentationGenerator> {
		interface Factory extends SupplierFactory<RepresentationGenerator> {
			
		}
	}
	
	void generate(
			Representation representation, 
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context resolverContext,
			ProgressMonitor progressMonitor) throws Exception;	

}
