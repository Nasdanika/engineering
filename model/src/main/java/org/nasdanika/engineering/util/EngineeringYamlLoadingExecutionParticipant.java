package org.nasdanika.engineering.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.common.Context;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.journey.JourneyPackage;
import org.nasdanika.flow.util.FlowObjectLoaderExecutionParticipant;
import org.nasdanika.html.model.app.AppPackage;
import org.nasdanika.html.model.bootstrap.BootstrapPackage;
import org.nasdanika.html.model.html.HtmlPackage;

/**
 * {@link YamlLoadingSupplier} for Engineering {@link EPackage}s.
 * Registers exec- loader. 
 * @author Pavel
 *
 */
public abstract class EngineeringYamlLoadingExecutionParticipant extends FlowObjectLoaderExecutionParticipant {

	public EngineeringYamlLoadingExecutionParticipant(Context context) {
		super(context);
	}

	@Override
	protected Collection<EPackage> getEPackages() {
		Collection<EPackage> ret = super.getEPackages(); 
		ret.add(HtmlPackage.eINSTANCE);
		ret.add(BootstrapPackage.eINSTANCE);
		ret.add(AppPackage.eINSTANCE);
		ret.add(EngineeringPackage.eINSTANCE);
		ret.add(JourneyPackage.eINSTANCE);
		return ret;
	}

}
