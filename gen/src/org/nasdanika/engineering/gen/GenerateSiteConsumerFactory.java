package org.nasdanika.engineering.gen;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.Context;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Container;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.viewparts.AdaptiveNavigationPanelViewPart.Style;
import org.nasdanika.html.emf.AbstractGenerateSiteConsumerFactory;
import org.nasdanika.html.model.app.AppPackage;

/**
 * Generates a site for a set of engineering {@link Resource}'s.
 * @author Pavel
 *
 */
public class GenerateSiteConsumerFactory extends AbstractGenerateSiteConsumerFactory {
	
	public GenerateSiteConsumerFactory(
			List<URI> resources,
			SupplierFactory<? extends Application> applicationSupplierFactory, 
			BinaryEntityContainer output) {
		super(resources, applicationSupplierFactory, output);
	}

	public GenerateSiteConsumerFactory(
			List<URI> resources,
			SupplierFactory<? extends Application> applicationSupplierFactory, 
			Container<String> output) {
		super(resources, applicationSupplierFactory, output);
	}

	public GenerateSiteConsumerFactory(
			List<URI> resources,
			SupplierFactory<? extends Application> applicationSupplierFactory, 
			File output) {
		super(resources, applicationSupplierFactory, output);
	}
	
	@Override
	protected Action createPricipalAction(Action rootAction, Collection<EObject> topLevelElements) {
		EngineeringViewAction principal = new EngineeringViewAction(topLevelElements);
		principal.setParent(rootAction);
		return principal;		
	}
	
	protected Style getNavigationPanelStyle() {
		return Style.CARDS;
	}

	@Override
	protected AdapterFactory createAdapterFactory(Action parent, Context context) {		
		return new EngineeringViewActionAdapterFactory(parent, context);
	}

	@Override
	protected boolean isTopLevelElement(EObject eObj) {
		return eObj instanceof ModelElement;
	}

	@Override
	protected String getURI(EObject eObj) {
		return eObj instanceof ModelElement ? ((ModelElement) eObj).getUri() : null;
	}

	@Override
	protected Collection<EPackage> getEPackages() {
		Collection<EPackage> ret = new ArrayList<>(); 
		ret.add(EngineeringPackage.eINSTANCE);
		ret.add(AppPackage.eINSTANCE);		
		return ret;
	}
		
}
