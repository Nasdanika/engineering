package org.nasdanika.engineering.gen;

import org.nasdanika.engineering.Persona;

public class PersonaViewAction<T extends Persona> extends EngineeredElementViewAction<T> {
	
	public PersonaViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
}
