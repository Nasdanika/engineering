package org.nasdanika.engineering.gen;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.BiSupplier;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.persistence.ObjectLoader;
import org.nasdanika.emf.persistence.EObjectLoader;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.util.EngineeringYamlLoadingExecutionParticipant;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.factories.ComposedLoader;
import org.nasdanika.html.emf.ViewAction;

/**
 * Registers adapter factory with the resource set, converts roots to actions
 * @author Pavel
 *
 */
public abstract class EngineeringYamlLoadingActionFunction extends EngineeringYamlLoadingExecutionParticipant implements Function<Action, BiSupplier<Action, Collection<Action>>> {

	public EngineeringYamlLoadingActionFunction(Context context) {
		super(context);
	}

	@Override
	public BiSupplier<Action, Collection<Action>> execute(Action root, ProgressMonitor progressMonitor) throws Exception {
		resourceSet.getAdapterFactories().add(new EngineeringViewActionAdapterFactory(context, diagnosticMap) {

			@Override
			public Action getParent() {
				return root;
			}
			
			@Override
			public String resolveResourcePath(Resource resource) {
				// TODO Auto-generated method stub
				return EngineeringYamlLoadingActionFunction.this.resolveResourcePath(resource);
			}
			
			@Override
			protected List<URL> getAppearanceLocations() {
				List<URL> ret = new ArrayList<>(EngineeringYamlLoadingActionFunction.this.getAppearanceLocations());
				ret.addAll(super.getAppearanceLocations());
				return ret;
			}
			
		});
		
		return new BiSupplier<Action, Collection<Action>>() {

			@Override
			public Action getFirst() {
				return root;
			}

			@Override
			public Collection<Action> getSecond() {
				return roots.stream().filter(ModelElement.class::isInstance).map(ViewAction::adaptToViewActionNonNull).collect(Collectors.toList());
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
		if (getResources().size() == 1) {
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
	protected ObjectLoader createLoader(ResourceSet resourceSet) {
		return new EObjectLoader(new ComposedLoader(), null, resourceSet);
	}
	
}
