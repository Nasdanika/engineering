package org.nasdanika.engineering.gen;

import static org.nasdanika.html.app.impl.Util.writeAction;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.BasicDiagnostic;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Status;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.ObjectLoader;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.emf.persistence.EObjectLoader;
import org.nasdanika.emf.persistence.YamlResourceFactory;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.factories.ComposedLoader;
import org.nasdanika.html.app.viewparts.AdaptiveNavigationPanelViewPart.Style;
import org.nasdanika.html.model.app.AppPackage;

/**
 * Generates a site for a set of engineering {@link Resource}'s.
 * @author Pavel
 *
 */
public class GenerateSiteConsumerFactory implements ConsumerFactory<Action> {
	
	private List<URI> resources;
	private Container<String> output;
	private SupplierFactory<? extends Application> applicationSupplierFactory;

	public GenerateSiteConsumerFactory(
			List<URI> resources,
			SupplierFactory<? extends Application> applicationSupplierFactory,
			Container<String> output) {
		this.resources = resources;
		this.applicationSupplierFactory = applicationSupplierFactory;
		this.output = output;
	}

	public GenerateSiteConsumerFactory(
			List<URI> resources, 
			SupplierFactory<? extends Application> applicationSupplierFactory,
			BinaryEntityContainer output) {
		this(resources, applicationSupplierFactory, output.stateAdapter().adapt(Util.INPUT_STREAM_TO_STRING_DECODER, Util.OBJECT_TO_INPUT_STREAM_ENCODER));
	}
	
	public GenerateSiteConsumerFactory(
			List<URI> resources, 
			SupplierFactory<? extends Application> applicationSupplierFactory,
			File output) {
		this(resources, applicationSupplierFactory, new FileSystemContainer(output));
	}	
	
	/**
	 * Base URI for relativizing references. This implementation returns tmp://base/engineering/.
	 * @return
	 */
	protected String getBaseURI() {
		return "tmp://base/engineering/";
	}
	
	/**
	 * Override to customize context. This implementation registers base URI if it is not blank
	 * @param context
	 * @return
	 */
	protected MutableContext forkContext(Context context, ProgressMonitor progressMonitor) {
		MutableContext ret = context.fork();
		String base = getBaseURI();
		if (!Util.isBlank(base)) {
			ret.put(Context.BASE_URI_PROPERTY, base);
		}
		
		ret.register(DiagramGenerator.class, createDiagramGenerator(progressMonitor));
				
//		SourceResolver sourceResolver = marker -> {
//			if (marker != null && !Util.isBlank(marker.getLocation())) {
//				// TODO - use jGit to resolve origin URL from marker location - cache.
////				return marker.getLine() > 0 ? ret + "#L" + marker.getLine() : ret;
//			}			
//			return null;			
//		};
//		ret.register(SourceResolver.class, sourceResolver);
		
		return ret;
	}
	
	@Override
	public Consumer<Action> create(Context ctx) throws Exception {
		
		
		return new Consumer<Action>() {
			
			@Override
			public double size() {
				return 1;
			}
			
			@Override
			public String name() {
				return "Generating site";
			}
			
			private MutableContext context;
			private List<ModelElement> topLevelElements;
			private ResourceSet resourceSet;
			
			/**
			 * Loads resources, checks for unresolved proxies and diagnoses.
			 */
			@SuppressWarnings("unchecked")
			@Override
			public Diagnostic diagnose(ProgressMonitor progressMonitor) {
				context = forkContext(ctx, progressMonitor);
				
				// Creating loader
				resourceSet = new ResourceSetImpl() {
					
					Map<String, EObject> cache = new HashMap<>();
					
					@Override
					public EObject getEObject(URI uri, boolean loadOnDemand) {
						EObject ret = cache.get(uri.toString());
						if (ret != null) {
							return ret;
						}
						
						TreeIterator<Notifier> cit = getAllContents();
						while (cit.hasNext()) {
							Notifier next = cit.next();
							if (next instanceof ModelElement) {
								ModelElement nextModelElement = (ModelElement) next;
								String nUri = nextModelElement.getUri();
								cache.put(nUri, (ModelElement) next);
								if (uri != null && uri.toString().equals(nUri)) {
									ret = nextModelElement;
								}
							}						
						}

						if (ret != null) {
							return ret;
						}
						
						return super.getEObject(uri, loadOnDemand);
					}
					
				};	
				
				Resource.Factory.Registry resourceFactoryRegistry = new ResourceFactoryRegistryImpl();
				resourceSet.getPackageRegistry().put(EngineeringPackage.eNS_URI, EngineeringPackage.eINSTANCE);
				resourceSet.getPackageRegistry().put(AppPackage.eNS_URI, AppPackage.eINSTANCE);
				ObjectLoader loader = new EObjectLoader(new ComposedLoader(), null, resourceSet);
				
				resourceFactoryRegistry.getExtensionToFactoryMap().put("yml", new YamlResourceFactory(loader, context, progressMonitor));
				resourceSet.setResourceFactoryRegistry(resourceFactoryRegistry);

				Diagnostician diagnostician = new Diagnostician();
				Map<Class<Context>, MutableContext> diagnosticContext = Collections.singletonMap(Context.class, context);
				BasicDiagnostic ret = (BasicDiagnostic) Consumer.super.diagnose(progressMonitor);
				
				topLevelElements = new ArrayList<>();
				for (URI uri: resources) {
					Resource engineeringResource = resourceSet.getResource(uri, true);
					for (EObject e: engineeringResource.getContents()) {
						ret.add(EmfUtil.wrap(diagnostician.validate(e, diagnosticContext)));
						
						if (e instanceof ModelElement) {
							topLevelElements.add((ModelElement) e);
						}
					}
				}
				
				EcoreUtil.resolveAll(resourceSet);
				
				TreeIterator<Notifier> cit = resourceSet.getAllContents();
				while (cit.hasNext()) {
					Notifier next = cit.next();
					if (next instanceof EObject) {
						EObject nextEObject = (EObject) next;
						if (nextEObject.eIsProxy()) {
							ret.add(new BasicDiagnostic(Status.ERROR, "Unresolved proxy: " + next, next));
						} else {
							for (EReference ref: nextEObject.eClass().getEAllReferences()) {
								Object val = nextEObject.eGet(ref);
								if (val instanceof EObject) {
									if (((EObject) val).eIsProxy()) {
										ret.add(new BasicDiagnostic(Status.ERROR, "Unresolved proxy: " + val, val));
									}
								} else if (val instanceof Collection) {
									for (EObject ve: (Collection<EObject>) val) {
										if (ve.eIsProxy()) {
											ret.add(new BasicDiagnostic(Status.ERROR, "Unresolved proxy: " + ve, ve));
										}								
									}
								}
							}
						}
					}	
				}
				
				return ret;
			}
			
			@Override
			public void execute(Action rootAction, ProgressMonitor progressMonitor) throws Exception {
				Action principal;
				if (topLevelElements.size() == 1) {
					resourceSet.getAdapterFactories().add(new EngineeringViewActionAdapterFactory(rootAction, context));
					principal = ModelElementViewAction.adaptToViewActionNonNull(topLevelElements.get(0));
				} else {
					principal = createPricipalAction(rootAction, topLevelElements);
					resourceSet.getAdapterFactories().add(new EngineeringViewActionAdapterFactory(principal, context));
				}
				rootAction.getChildren().add(principal);

				writeAction(
						rootAction, 
						principal, 
						rootAction, 
						context.getString(Context.BASE_URI_PROPERTY), 
						output, 
						context, 
						getNavigationPanelStyle(), 
						applicationSupplierFactory, 
						progressMonitor);
			}
			
		};
	}
	
	protected Action createPricipalAction(Action rootAction, Collection<ModelElement> topLevelElements) {
		EngineeringViewAction principal = new EngineeringViewAction(topLevelElements);
		principal.setParent(rootAction);
		return principal;		
	}
	
	protected Style getNavigationPanelStyle() {
		return Style.CARDS;
	}
	
	protected DiagramGenerator createDiagramGenerator(ProgressMonitor progressMonitor) {
		URL diagramServerURL = getDiagramServerURL();
		DiagramGenerator ret = diagramServerURL == null ? DiagramGenerator.INSTANCE : DiagramGenerator.createClient(diagramServerURL);
		
		Container<String> cacheContainer = getDiagramCacheContainer();
		return cacheContainer == null ? ret : ret.cachingDiagramGenerator(cacheContainer, progressMonitor);
	}
	
	/**
	 * If this method returns non-null then a client diagram generator is created.
	 * @return
	 */
	protected URL getDiagramServerURL() {
		return null;
	}
	
	protected Container<String> getDiagramCacheContainer() {
		File cacheDir = getDiagramCacheDirectory();
		if (cacheDir == null) {
			return null;
		}
		
		FileSystemContainer cache = new FileSystemContainer(cacheDir);
		return cache.stateAdapter().adapt(Util.INPUT_STREAM_TO_STRING_DECODER, Util.OBJECT_TO_INPUT_STREAM_ENCODER);
	}
	
	/**
	 * If this method returns non-null then the returned directory is used to cache generated diagrams.
	 * @return
	 */
	protected File getDiagramCacheDirectory() {
		return null;
	}
		
}
