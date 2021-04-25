package org.nasdanika.engineering.gen;

import org.nasdanika.engineering.EngineeredCapability;

public class EngineeredCapabilityViewAction<T extends EngineeredCapability> extends CapabilityViewAction<T> {
	
	protected EngineeredCapabilityViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
}
