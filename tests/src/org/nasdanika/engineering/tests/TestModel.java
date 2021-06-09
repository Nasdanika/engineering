package org.nasdanika.engineering.tests;

import static org.nasdanika.html.app.impl.Util.writeAction;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.nasdanika.common.CommandFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.DiagnosticException;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Status;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.ObjectLoader;
import org.nasdanika.common.persistence.SourceResolver;
import org.nasdanika.common.persistence.SourceResolver.Link;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.persistence.EObjectLoader;
import org.nasdanika.engineering.gen.GenerateSiteConsumerFactory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.factories.BootstrapContainerApplicationSupplierFactory;
import org.nasdanika.html.app.factories.ComposedLoader;
import org.nasdanika.html.app.viewparts.AdaptiveNavigationPanelViewPart.Style;
import org.nasdanika.html.ecore.EcoreViewActionStorableAdapterFactory;
import org.nasdanika.html.ecore.GenModelResourceSet;
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
	public void testGenerateNasdanikaSite() throws Exception {
		ObjectLoader loader = new EObjectLoader(new ComposedLoader(), null, AppPackage.eINSTANCE);
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String resourceName = "org/nasdanika/html/app/templates/cerulean/dark-fluid.yml";
		BootstrapContainerApplicationSupplierFactory applicationSupplierFactory = (BootstrapContainerApplicationSupplierFactory) loader.loadYaml(getClass().getClassLoader().getResource(resourceName), progressMonitor);
		
		Collection<URI> models = new ArrayList<>();
		for (String model: System.getenv("MODELS").split(";")) {
			models.add(URI.createURI(new File(model).toURI().toString()));
		}
		
		GenerateSiteConsumerFactory consumerFactory = new GenerateSiteConsumerFactory(
				models, 
				applicationSupplierFactory, 
				new File("target\\site")) {
			
			@Override
			protected MutableContext forkContext(Context context, ProgressMonitor progressMonitor) {
				MutableContext ret = super.forkContext(context, progressMonitor);

				MarkdownHelper markdownHelper = new MarkdownHelper() {
					
					@Override
					protected DiagramGenerator getDiagramGenerator() {
						return context.get(DiagramGenerator.class, DiagramGenerator.INSTANCE);
					}
					
				};
				ret.register(MarkdownHelper.class, markdownHelper);
				
				return ret;
			}
			
		};
		
		Object actionFactory = loader.loadYaml(new File("model/nasdanika/site.yml"), progressMonitor);
		SupplierFactory<Action> asf = Util.<Action>asSupplierFactory(actionFactory);		
		
		CommandFactory commandFactory = asf.then(consumerFactory); 
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		context.put("nasdanika/core", new File("..\\..\\core").toURI().toString());
		context.put(Context.BASE_URI_PROPERTY, "random://" + UUID.randomUUID() + "/" + UUID.randomUUID() + "/");

		URI uri = URI.createFileURI(new File(".").getCanonicalPath());
		SourceResolver sourceResolver = marker -> {
			if (marker != null && !Util.isBlank(marker.getLocation())) { 
				try {
					File locationFile = new File(new java.net.URI(marker.getLocation()));
					URI locationURI = URI.createFileURI(locationFile.getCanonicalPath());
					URI relativeLocationURI = locationURI.deresolve(uri, true, true, true); 
					return new Link() {
	
						@Override
						public String getLocation() {
							return marker.getLocation();
						}
						
						@Override
						public String getText() {							
							return relativeLocationURI.toString() + " " + marker.getLine() + ":" + marker.getColumn();
						}
						
					};
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			return null;
		};
		
		context.register(SourceResolver.class, sourceResolver);
		
		try {
			Diagnostic diagnostic = Util.call(commandFactory.create(context), progressMonitor);
			if (diagnostic.getStatus() == Status.WARNING || diagnostic.getStatus() == Status.ERROR) {
				System.err.println("***********************");
				System.err.println("*      Diagnostic     *");
				System.err.println("***********************");
				diagnostic.dump(System.err, 4, Status.ERROR, Status.WARNING);
			}
		} catch (DiagnosticException e) {
			System.err.println("******************************");
			System.err.println("*      Diagnostic failed     *");
			System.err.println("******************************");
			e.getDiagnostic().dump(System.err, 4, Status.FAIL);
			throw e;
		}
	}
	
	@Test
	public void testGenerateTestSite() throws Exception {
		ObjectLoader loader = new EObjectLoader(new ComposedLoader(), null, AppPackage.eINSTANCE);
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String resourceName = "org/nasdanika/html/app/templates/cerulean/dark-fluid.yml";
		BootstrapContainerApplicationSupplierFactory applicationSupplierFactory = (BootstrapContainerApplicationSupplierFactory) loader.loadYaml(getClass().getClassLoader().getResource(resourceName), progressMonitor);
		
		GenerateSiteConsumerFactory consumerFactory = new GenerateSiteConsumerFactory(
				Collections.singleton(URI.createURI(new File("model/test.yml").toURI().toString())), 
				applicationSupplierFactory, 
				new File("target\\test-site")) {
			
			@Override
			protected MutableContext forkContext(Context context, ProgressMonitor progressMonitor) {
				MutableContext ret = super.forkContext(context, progressMonitor);

				MarkdownHelper markdownHelper = new MarkdownHelper() {
					
					@Override
					protected DiagramGenerator getDiagramGenerator() {
						return context.get(DiagramGenerator.class, DiagramGenerator.INSTANCE);
					}
					
				};
				ret.register(MarkdownHelper.class, markdownHelper);
				
				return ret;
			}
			
//			@Override
//			protected List<URL> getAppearanceLocations() {
//				try {
//					return Collections.singletonList(new File("model/test-appearance.yml").toURI().toURL());
//				} catch (MalformedURLException e) {
//					throw new NasdanikaException(e);
//				}
//			}
			
		};
		
		Object actionFactory = loader.loadYaml(new File("model/nasdanika/site.yml"), progressMonitor);
		SupplierFactory<Action> asf = Util.<Action>asSupplierFactory(actionFactory);		
		
		CommandFactory commandFactory = asf.then(consumerFactory); 
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		context.put(Context.BASE_URI_PROPERTY, "random://" + UUID.randomUUID() + "/" + UUID.randomUUID() + "/");
		context.register(Date.class, new Date());

		URI uri = URI.createFileURI(new File(".").getCanonicalPath());
		SourceResolver sourceResolver = marker -> {
			if (marker != null && !Util.isBlank(marker.getLocation())) { 
				try {
					File locationFile = new File(new java.net.URI(marker.getLocation()));
					URI locationURI = URI.createFileURI(locationFile.getCanonicalPath());
					URI relativeLocationURI = locationURI.deresolve(uri, true, true, true); 
					return new Link() {
	
						@Override
						public String getLocation() {
							return marker.getLocation();
						}
						
						@Override
						public String getText() {							
							return relativeLocationURI.toString() + " " + marker.getLine() + ":" + marker.getColumn();
						}
						
					};
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			return null;
		};
		
		context.register(SourceResolver.class, sourceResolver);
		
		try {
			Diagnostic diagnostic = Util.call(commandFactory.create(context), progressMonitor);
			if (diagnostic.getStatus() == Status.WARNING || diagnostic.getStatus() == Status.ERROR) {
				System.err.println("***********************");
				System.err.println("*      Diagnostic     *");
				System.err.println("***********************");
				diagnostic.dump(System.err, 4, Status.ERROR, Status.WARNING);
			}
		} catch (DiagnosticException e) {
			System.err.println("******************************");
			System.err.println("*      Diagnostic failed     *");
			System.err.println("******************************");
			e.getDiagnostic().dump(System.err, 4, Status.FAIL);
			throw e;
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
		Action action = Util.call(Util.<Action>asSupplierFactory(actionFactory).create(context), progressMonitor, null);
		
		FileSystemContainer output = new FileSystemContainer(new File("..\\docs"));
		BiFunction<String, InputStream, String> decoder = Util.INPUT_STREAM_TO_STRING_DECODER;
		BiFunction<String, Object, InputStream> encoder = Util.OBJECT_TO_INPUT_STREAM_ENCODER;
		Container<String> container = output.stateAdapter().adapt(decoder, encoder);

		String resourceName = "org/nasdanika/html/app/templates/cerulean/dark-fluid.yml";
		BootstrapContainerApplicationSupplierFactory applicationSupplierFactory = (BootstrapContainerApplicationSupplierFactory) loader.loadYaml(getClass().getClassLoader().getResource(resourceName), progressMonitor);
		
		writeAction(
				action, 
				action.getNavigationChildren().get(0), 
				action, 
				base, 
				container, 
				context, 
				Style.CARDS, 
				applicationSupplierFactory, 
				progressMonitor);
		
		
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
	
	@Test
	public void testURI() {
		URI uri = URI.createURI("nasdanika:this");
		System.out.println(uri);
		System.out.println(uri.hasAuthority() + " " + uri.authority());
		System.out.println(uri.scheme());
		
		URI relative = URI.createHierarchicalURI(uri.scheme(), "this", null, null, null);
		System.out.println(relative);
		System.out.println(relative.authority());
		System.out.println(relative.scheme());
		
		URI that = URI.createURI("that").resolve(relative);
		System.out.println(that);
		
		URI purum = URI.createURI("purum").resolve(that);
		System.out.println(purum);
		
	}

}
