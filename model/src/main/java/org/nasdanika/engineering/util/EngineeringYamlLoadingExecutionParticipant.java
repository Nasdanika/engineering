package org.nasdanika.engineering.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.Context;
import org.nasdanika.common.persistence.DispatchingLoader;
import org.nasdanika.common.persistence.ObjectLoader;
import org.nasdanika.emf.persistence.YamlLoadingExecutionParticipant;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.representation.RepresentationPackage;
import org.nasdanika.exec.Loader;

/**
 * {@link YamlLoadingSupplier} for Engineering {@link EPackage}s.
 * Registers exec- loader. 
 * @author Pavel
 *
 */
public abstract class EngineeringYamlLoadingExecutionParticipant extends YamlLoadingExecutionParticipant {

	public EngineeringYamlLoadingExecutionParticipant(Context context) {
		super(context);
	}

	@Override
	protected Collection<EPackage> getEPackages() {
		Collection<EPackage> ret = new ArrayList<>(); 
		ret.add(EngineeringPackage.eINSTANCE);
		ret.add(RepresentationPackage.eINSTANCE);
		ret.add(FlowPackage.eINSTANCE);
		return ret;
	}
	
	@Override
	protected boolean matchURI(EObject eObj, URI uri) {
		return eObj instanceof ModelElement && uri != null && uri.toString().equals(((ModelElement) eObj).getUri()) ;
	}
	
	@Override
	protected ObjectLoader createLoader(ResourceSet resourceSet) {
		ObjectLoader loader = super.createLoader(resourceSet);
		((DispatchingLoader) loader).register("exec-", new Loader());
		return loader;
	}

}
