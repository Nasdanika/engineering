package org.nasdanika.engineering.gen;

import org.nasdanika.engineering.Temporal;

/**
 * @author Pavel
 *
 */
public class TemporalViewAction extends ModelElementViewActionImpl<Temporal> {
			
	public TemporalViewAction(Temporal target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}	
	
	@Override
	public String getText() {
		return getSemanticElement().normalize().toString();
	}
		
}
