package org.nasdanika.engineering.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.common.Context;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.journey.JourneyPackage;
import org.nasdanika.flow.util.FlowYamlLoadingExecutionParticipant;

/**
 * {@link YamlLoadingSupplier} for Engineering {@link EPackage}s.
 * Registers exec- loader. 
 * @author Pavel
 *
 */
public abstract class EngineeringYamlLoadingExecutionParticipant extends FlowYamlLoadingExecutionParticipant {

	public EngineeringYamlLoadingExecutionParticipant(Context context) {
		super(context);
	}

	@Override
	protected Collection<EPackage> getEPackages() {
		Collection<EPackage> ret = new ArrayList<>(); 
		ret.add(EngineeringPackage.eINSTANCE);
		ret.add(JourneyPackage.eINSTANCE);
		return ret;
	}

}
