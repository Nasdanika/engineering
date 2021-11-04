package org.nasdanika.engineering.gen;

import org.nasdanika.common.Context;
import org.nasdanika.engineering.EngineeredCapability;

public class EngineeredCapabilityActionProvider<T extends EngineeredCapability> extends CapabilityActionProvider<T> {
	
	public EngineeredCapabilityActionProvider(T target, Context context) {
		super(target, context);		
	}
		
}
