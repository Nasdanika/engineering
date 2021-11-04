package org.nasdanika.engineering.gen;

import org.nasdanika.common.Context;
import org.nasdanika.engineering.Capability;

public class CapabilityActionProvider<T extends Capability> extends NamedElementActionProvider<T> {
	
	public CapabilityActionProvider(T target, Context context) {
		super(target, context);		
	}
		
}
