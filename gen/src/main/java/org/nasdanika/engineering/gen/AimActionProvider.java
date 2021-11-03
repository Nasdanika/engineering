package org.nasdanika.engineering.gen;

import org.nasdanika.common.Context;
import org.nasdanika.engineering.Aim;

public class AimActionProvider<T extends Aim> extends NamedElementActionProvider<T> {
	
	public AimActionProvider(T target, Context context) {
		super(target, context);		
	}
	
}
