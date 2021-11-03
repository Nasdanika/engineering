package org.nasdanika.engineering.gen;

import org.nasdanika.common.Context;
import org.nasdanika.engineering.EngineeredElement;

public class EngineeredElementActionProvider<T extends EngineeredElement> extends ForumActionProvider<T> {
	
	public EngineeredElementActionProvider(T target, Context context) {
		super(target, context);		
	}
	
}
