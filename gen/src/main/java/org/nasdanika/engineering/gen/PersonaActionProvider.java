package org.nasdanika.engineering.gen;

import org.nasdanika.common.Context;
import org.nasdanika.engineering.Persona;

public class PersonaActionProvider<T extends Persona> extends EngineeredElementActionProvider<T> {
	
	public PersonaActionProvider(T target, Context context) {
		super(target, context);		
	}
	
}
