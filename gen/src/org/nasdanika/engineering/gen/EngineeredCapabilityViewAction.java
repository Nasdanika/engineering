package org.nasdanika.engineering.gen;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.app.ViewGenerator;

public class EngineeredCapabilityViewAction<T extends EngineeredCapability> extends CapabilityViewAction<T> {
	
	protected EngineeredCapabilityViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Object featureValue(EStructuralFeature feature, Object value, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (feature == EngineeringPackage.Literals.ENDEAVOR__COMPLETION) {
			double completion = getSemanticElement().getCompletion();
			if (completion != Double.NaN && completion > 0.001) {
				return viewGenerator.getBootstrapFactory().progressBar((int) (100 * completion));
			}			
		}
		return super.featureValue(feature, value, viewGenerator, progressMonitor);
	}
	
}
