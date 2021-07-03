package org.nasdanika.engineering.tests;

import static org.nasdanika.html.app.impl.Util.writeAction;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.factories.BootstrapContainerApplicationSupplierFactory;
import org.nasdanika.html.app.factories.ComposedLoader;
import org.nasdanika.html.app.viewparts.AdaptiveNavigationPanelViewPart.Style;
import org.nasdanika.html.ecore.EcoreViewActionStorableAdapterFactory;
import org.nasdanika.html.ecore.GenModelResourceSet;
import org.nasdanika.html.emf.ViewActionStorable;
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
		Object actionFactory = loader.loadYaml(new File("model\\doc-site.yml"), progressMonitor);
		Action action = Util.call(Util.<Action>asSupplierFactory(actionFactory).create(context), progressMonitor, null);
		
		FileSystemContainer output = new FileSystemContainer(new File("..\\docs")); 
		BiFunction<String, InputStream, String> decoder = Util.INPUT_STREAM_TO_STRING_DECODER;
		BiFunction<String, Object, InputStream> encoder = Util.OBJECT_TO_INPUT_STREAM_ENCODER;
		Container<String> container = output.stateAdapter().adapt(decoder, encoder);

		String resourceName = "cerulean/dark-fluid.yml";
		BootstrapContainerApplicationSupplierFactory applicationSupplierFactory = (BootstrapContainerApplicationSupplierFactory) loader.loadYaml(getClass().getResource(resourceName), progressMonitor);
		
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
	public void testDuration() {
		Duration duration = DefaultConverter.INSTANCE.toDuration("PT12H10M");
		System.out.println(duration.toMinutes());
	}

}
