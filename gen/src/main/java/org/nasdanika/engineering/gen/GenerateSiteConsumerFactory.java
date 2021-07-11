package org.nasdanika.engineering.gen;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.emf.AbstractGenerateSiteConsumer;

/**
 * Generates a site for a set of engineering {@link Resource}'s.
 * @author Pavel
 *
 */
public class GenerateSiteConsumerFactory implements ConsumerFactory<Action> {
	
	protected Collection<URI> resources;
	protected Container<String> output;
	protected SupplierFactory<? extends Application> applicationSupplierFactory;

	protected GenerateSiteConsumerFactory(
			Collection<URI> resources,
			SupplierFactory<? extends Application> applicationSupplierFactory,
			Container<String> output) {
		this.resources = resources;
		this.applicationSupplierFactory = applicationSupplierFactory;
		this.output = output;
	}

	protected GenerateSiteConsumerFactory(
			Collection<URI> resources, 
			SupplierFactory<? extends Application> applicationSupplierFactory,
			BinaryEntityContainer output) {
		this(resources, applicationSupplierFactory, output.stateAdapter().adapt(Util.INPUT_STREAM_TO_STRING_DECODER, Util.OBJECT_TO_INPUT_STREAM_ENCODER));
	}
	
	protected GenerateSiteConsumerFactory(
			Collection<URI> resources, 
			SupplierFactory<? extends Application> applicationSupplierFactory,
			File output) {
		this(resources, applicationSupplierFactory, new FileSystemContainer(output));
	}	

	protected GenerateSiteConsumerFactory(
			URI resource,
			SupplierFactory<? extends Application> applicationSupplierFactory,
			Container<String> output) {
		this(Collections.singleton(resource), applicationSupplierFactory, output);
	}

	protected GenerateSiteConsumerFactory(
			URI resource, 
			SupplierFactory<? extends Application> applicationSupplierFactory,
			BinaryEntityContainer output) {
		this(Collections.singleton(resource), applicationSupplierFactory, output);
	}
	
	protected GenerateSiteConsumerFactory(
			URI resource, 
			SupplierFactory<? extends Application> applicationSupplierFactory,
			File output) {
		this(Collections.singleton(resource), applicationSupplierFactory, output);

	}	

	@Override
	public Consumer<Action> create(Context context) throws Exception {		
		@SuppressWarnings("resource")
		EngineeringYamlLoadingActionFunction actionFunction = new EngineeringYamlLoadingActionFunction(context) {

			@Override
			protected Collection<URI> getResources() {
				return GenerateSiteConsumerFactory.this.resources;
			}
			
		};
		
		AbstractGenerateSiteConsumer generateSiteConsumer = new AbstractGenerateSiteConsumer(applicationSupplierFactory, output, context) {
			
			@Override
			protected Action createPrincipalAction(Action rootAction, Collection<Action> children) {
				EngineeringViewAction principal = new EngineeringViewAction(children);
				principal.setActivator(new PathNavigationActionActivator(principal, context.getString(Context.BASE_URI_PROPERTY), "index.html", null));
				principal.setParent(rootAction);
				return principal;		
			}
		};
		
		return actionFunction.then(generateSiteConsumer);
	}
		
}
