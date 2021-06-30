package org.nasdanika.engineering.gen;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.nasdanika.engineering.representation.RepresentationPackage;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
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
			Collection<URI> resources,
			SupplierFactory<? extends Application> applicationSupplierFactory, 
			BinaryEntityContainer output) {
		super(resources, applicationSupplierFactory, output);
	}

	public GenerateSiteConsumerFactory(
			Collection<URI> resources,
			SupplierFactory<? extends Application> applicationSupplierFactory, 
			Container<String> output) {
		super(resources, applicationSupplierFactory, output);
	}

	public GenerateSiteConsumerFactory(
			Collection<URI> resources,
			SupplierFactory<? extends Application> applicationSupplierFactory, 
			File output) {
		super(resources, applicationSupplierFactory, output);
	}
	
	@Override
	protected Action createPricipalAction(Action rootAction, Collection<EObject> topLevelElements) {
		EngineeringViewAction principal = new EngineeringViewAction(topLevelElements);
		principal.setActivator(new PathNavigationActionActivator(principal, getBaseURI(), "index.html", null));
		principal.setParent(rootAction);
		return principal;		
	}
	
	protected Style getNavigationPanelStyle() {
		return Style.CARDS;
	}

	@Override
	protected AdapterFactory createAdapterFactory(Action parent, Context context, Map<EObject, org.eclipse.emf.common.util.Diagnostic> diagnosticMap) {		
		return new EngineeringViewActionAdapterFactory(context, diagnosticMap) {
			
			@Override
			public Action getParent() {
				return parent;
			}
			
			@Override
			public String resolveResourcePath(Resource resource) {
				return GenerateSiteConsumerFactory.this.resolveResourcePath(resource);
			}

			@Override
			protected List<URL> getAppearanceLocations() {
				List<URL> ret = new ArrayList<>(GenerateSiteConsumerFactory.this.getAppearanceLocations());
				ret.addAll(super.getAppearanceLocations());
				return ret;
			}
			
		};
	}
	
	protected List<URL> getAppearanceLocations() {
		return Collections.emptyList();
	}
	
	private Map<String, Resource> resourcePaths = new HashMap<>();
	
	/**
	 * Uses resource URI last segment without extension as path, de-dups by adding index.
	 * @param resource
	 * @return
	 */
	protected String resolveResourcePath(Resource resource) {
		if (resources.size() == 1) {
			return null;
		}
		String lastSegment = resource.getURI().lastSegment();
		if (lastSegment == null) {
			return null;
		}
		int dotIdx = lastSegment.lastIndexOf('.');
		if (dotIdx != -1) {
			lastSegment = lastSegment.substring(0, dotIdx);
		}
		for (int i = 0; ; ++i) {
			String path = lastSegment;
			if (i > 0) {
				path += "-" + Integer.toString(i, Character.MAX_RADIX);
			}
			path +=  "/";
			Resource existing = resourcePaths.get(path);
			if (existing == null) {
				resourcePaths.put(path, resource);
				return path;
			}
			if (existing == resource) {
				return path;
			}
		}
	}

	@Override
	protected boolean isTopLevelElement(EObject eObj) {
		return eObj instanceof ModelElement;
	}
	
	@Override
	protected boolean matchURI(EObject eObj, URI uri) {
		return eObj instanceof ModelElement && uri != null && uri.toString().equals(((ModelElement) eObj).getUri()) ;
	}

	@Override
	protected Collection<EPackage> getEPackages() {
		Collection<EPackage> ret = new ArrayList<>(); 
		ret.add(EngineeringPackage.eINSTANCE);
		ret.add(AppPackage.eINSTANCE);		
		ret.add(RepresentationPackage.eINSTANCE);
		return ret;
	}
		
}
