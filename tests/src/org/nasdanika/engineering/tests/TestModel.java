package org.nasdanika.engineering.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Assert;
import org.junit.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.ConfigurationException;
import org.nasdanika.common.persistence.ObjectLoader;
import org.nasdanika.common.persistence.SourceResolver;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.persistence.EObjectLoader;
import org.nasdanika.emf.persistence.YamlResourceFactory;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.gen.EngineeringViewActionAdapterFactory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.factories.BootstrapContainerApplicationSupplierFactory;
import org.nasdanika.html.app.factories.ComposedLoader;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.viewparts.AdaptiveNavigationPanelViewPart.Style;
import org.nasdanika.html.ecore.EcoreViewActionStorableAdapterFactory;
import org.nasdanika.html.ecore.GenModelResourceSet;
import org.nasdanika.html.emf.ViewAction;
import org.nasdanika.html.emf.ViewActionStorable;
import org.nasdanika.html.model.app.AppPackage;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.Yaml;

/**
 * Tests of descriptor view parts and wizards.
 * @author Pavel
 *
 */
public class TestModel {
	
	private DiagramGenerator createDiagramGenerator(ProgressMonitor progressMonitor) {
		FileSystemContainer output = new FileSystemContainer(new File("target\\diagram-cache"));
		
		BiFunction<String,InputStream,String> decoder = (path, state) -> DefaultConverter.INSTANCE.convert(state, String.class);
		BiFunction<String,String,InputStream> encoder = (path, state) -> DefaultConverter.INSTANCE.convert(state, InputStream.class);
		return DiagramGenerator.INSTANCE.cachingDiagramGenerator(output.stateAdapter().adapt(decoder, encoder), progressMonitor);
	}
		
	@Test
	public void testSite() throws Exception {		
		// Creating loader
		ResourceSet resourceSet = new ResourceSetImpl() {
			
			@Override
			public EObject getEObject(URI uri, boolean loadOnDemand) {
				// id is a special authority for finding by id.
				if ("id".equals(uri.scheme())) {
					TreeIterator<Notifier> cit = getAllContents();
					while (cit.hasNext()) {
						Notifier next = cit.next();
						if (next instanceof ModelElement && uri.authority().equals(((ModelElement) next).getId())) {
							return (EObject) next;
						}						
					}
					throw new ConfigurationException("Object not found with id: " + uri.authority());
				}
				return super.getEObject(uri, loadOnDemand);
			}
			
		};		
		Resource.Factory.Registry resourceFactoryRegistry = new ResourceFactoryRegistryImpl();
		resourceSet.getPackageRegistry().put(EngineeringPackage.eNS_URI, EngineeringPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(AppPackage.eNS_URI, AppPackage.eINSTANCE);
		ObjectLoader loader = new EObjectLoader(new ComposedLoader(), null, resourceSet);
		
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		String base = "tmp://base/engineering/";
		context.put(Context.BASE_URI_PROPERTY, base);
		
		context.put("nasdanika/core", new File("..\\..\\core").toURI().toString());
				
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		context.register(DiagramGenerator.class, createDiagramGenerator(progressMonitor));//DiagramGenerator.createClient(new URL("http://localhost:8090/spring-exec/api/v1/exec/diagram/")));
		
		resourceFactoryRegistry.getExtensionToFactoryMap().put("yml", new YamlResourceFactory(loader, context, progressMonitor));
		resourceSet.setResourceFactoryRegistry(resourceFactoryRegistry);
				
		Object actionFactory = loader.loadYaml(new File("model/nasdanika/site.yml"), progressMonitor);
		Action root = Util.callSupplier(Util.<Action>asSupplierFactory(actionFactory).create(context), progressMonitor);
		
		// Registering adapter factories
		resourceSet.getAdapterFactories().add(new EngineeringViewActionAdapterFactory(root, context));
		
		// Loading the root of the model and adapting to Action.		
		URI uri = URI.createURI(new File("model/nasdanika/nasdanika.yml").toURI().toString());
		
		SourceResolver sourceResolver = marker -> {
			if (marker != null && !Util.isBlank(marker.getLocation())) {
				// TODO - use jGit to resolve origin URL from marker location - cache.
//				return marker.getLine() > 0 ? ret + "#L" + marker.getLine() : ret;
			}			
			return null;			
		};
		context.register(SourceResolver.class, sourceResolver);
		
		Resource engineeringResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(resourceSet);
		Organization org = (Organization) engineeringResource.getContents().get(0);
		
		Action principal = org.adaptTo(ViewAction.class);	
		root.getChildren().add(principal);
		
		writeAction(loader, context, base, root, principal, root, progressMonitor);
	}
	
	private void writeAction(
			ObjectLoader loader,
			Context context, 
			String base, 
			Action root, 
			Action principal, 
			Action active, 
			ProgressMonitor monitor) throws Exception {
		
		MutableContext actionContext = context.fork();		
		if (!active.isEmpty() && active.getActivator() instanceof NavigationActionActivator) {
			NavigationActionActivator activator = (NavigationActionActivator) active.getActivator();
			String actionURI = activator.getUrl(null);
			actionContext.put(Context.BASE_URI_PROPERTY, actionURI);
			actionContext.put("page-title", active.getText());
			ApplicationBuilder builder = new ActionApplicationBuilder(actionContext, root, principal, active) {
				
				@Override
				protected Style getNavigationPanelStyle() {
					return Style.CARDS;
				}
				
			};
			String resourceName = "org/nasdanika/html/app/templates/cerulean/dark-fluid.yml";
			Application app = Util.callSupplier(((BootstrapContainerApplicationSupplierFactory) loader.loadYaml(getClass().getClassLoader().getResource(resourceName), monitor)).create(actionContext), monitor);
			builder.build(app, monitor);
			// app.getHTMLPage().head("\n<!-- my comment -->\n");

			String url = ((NavigationActionActivator) active.getActivator()).getUrl(null);
			if (url != null && url.startsWith(base)) {			
				writeFile(url.substring(base.length()), app.toString());
			}			
		}		
		for (Action child: active.getChildren()) {
			writeAction(loader, actionContext, base, root, principal, child, monitor);
		}
	}
	
	/**
	 * Writes text file.
	 * @param path
	 * @param content
	 */
	private void writeFile(String path, String content) throws IOException {
		File target = new File(("target/site/"+path).replace("/", File.separator));
		File parent = target.getParentFile();
		if (!parent.exists()) {
			if (!parent.mkdirs()) {
				Assert.fail("Cannot create "+parent.getAbsolutePath());
			}
		}
		
		System.out.println("Writing to "+target.getAbsolutePath());
		try (Writer writer = new FileWriter(target)) {
			writer.write(content);
		}		
		
	}
	
	@Test
	public void testEcoreDoc() throws Exception {
		GenModelResourceSet resourceSet = new GenModelResourceSet();
		
		Map<String,String> pathMap = new ConcurrentHashMap<>();
		
		Function<EPackage,String> getEPackagePath = ePackage -> {
			for (int i = 0; i < Integer.MAX_VALUE; ++i) {
				String path = i == 0 ? ePackage.getName() : ePackage.getName() + "_" + i;
				if (pathMap.containsKey(path)) {
					if (ePackage.getNsURI().equals(pathMap.get(path))) {
						return path;
					}
				} else {
					pathMap.put(path, ePackage.getNsURI());
					return path;
				}
			}
			
			// Encoding NS URI as HEX. Shall never reach this point.
			return Hex.encodeHexString(ePackage.getNsURI().getBytes(StandardCharsets.UTF_8));
		};
		
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		DiagramGenerator diagramGenerator = createDiagramGenerator(progressMonitor);
		context.register(DiagramGenerator.class, diagramGenerator);//DiagramGenerator.createClient(new URL("http://localhost:8090/spring-exec/api/v1/exec/diagram/")));
		
		resourceSet.getAdapterFactories().add(new EcoreViewActionStorableAdapterFactory(context, getEPackagePath));
		
		Map<String,String> bundleMap = new LinkedHashMap<>();
		bundleMap.put("model", "org.nasdanika.engineering");

		File modelDir = new File("target/models").getAbsoluteFile();
		modelDir.mkdirs();
		
		File modelDocDir = new File("target/model-doc").getAbsoluteFile();
		delete(modelDocDir);
		modelDocDir.mkdirs();
		
		Map<URI,File> modelToDocMap = new LinkedHashMap<>();
		
		for (Entry<String, String> be: bundleMap.entrySet()) {					
			File sourceDir = new File("..\\" + be.getKey());
			File targetDir = new File(modelDir, be.getValue());
			copy(new File(sourceDir, "model"), new File(targetDir, "model"), true, (source, target) -> {
				if (target.getName().endsWith(".genmodel")) {
					modelToDocMap.put(URI.createFileURI(target.getAbsolutePath()), new File(modelDocDir, target.getName() + ".yml"));
				}
			});			
			copy(new File(sourceDir, "doc"), new File(targetDir, "doc"), true, null);
		}		
		
		// Loading resources to the resource set.
		for (URI uri: modelToDocMap.keySet()) {
			resourceSet.getResource(uri, true);
		}		
		
		EcoreUtil.resolveAll(resourceSet);
		
		// Generating
		for (URI uri: modelToDocMap.keySet()) {
			Resource resource = resourceSet.getResource(uri, false);
			File output = modelToDocMap.get(resource.getURI());
			List<Object> data = new ArrayList<>();
			for (EObject contents: resource.getContents()) {
				if (contents instanceof GenModel) {
					for (GenPackage genPackage: ((GenModel) contents).getGenPackages()) {
						EPackage ecorePackage = genPackage.getEcorePackage();
						data.add(EObjectAdaptable.adaptTo(ecorePackage, ViewActionStorable.class).store(output.toURI().toURL(), progressMonitor));
					}
				}
			}
			
			DumperOptions dumperOptions = new DumperOptions();
			dumperOptions.setDefaultFlowStyle(FlowStyle.BLOCK);
			dumperOptions.setIndent(4);
			Yaml yaml = new Yaml(dumperOptions);
			yaml.dump(data.size() == 1 ? data.get(0) : data, new FileWriter(output));							
		}		
		
		// --- Generating documentation site ---
		String base = "tmp://base/engineering/";
		context.put(Context.BASE_URI_PROPERTY, base);
		
		ComposedLoader loader = new ComposedLoader();
		Object actionFactory = loader.loadYaml(new File("model\\nasdanika\\doc-site.yml"), progressMonitor);
		Action action = Util.callSupplier(Util.<Action>asSupplierFactory(actionFactory).create(context), progressMonitor);
		writeAction(loader, context, base, action, action.getNavigationChildren().get(0), action, progressMonitor);		
		
		System.out.println(diagramGenerator);
	}
	
	public static void copy(File source, File target, boolean cleanTarget, BiConsumer<File,File> listener) throws IOException {
		if (cleanTarget && target.isDirectory()) {
			delete(target.listFiles());
		}
		if (source.isDirectory()) {
			target.mkdirs();
			for (File sc: source.listFiles()) {
				copy(sc, new File(target, sc.getName()), false, listener);
			}
		} else if (source.isFile()) {
			Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);			
			if (listener != null) {
				listener.accept(source, target);
			}
		}
	}

	public static void delete(File... files) {
		for (File file: files) {
			if (file.exists()) {
				if (file.isDirectory()) {
					delete(file.listFiles());
				}
				file.delete();
			}
		}
	}

}
