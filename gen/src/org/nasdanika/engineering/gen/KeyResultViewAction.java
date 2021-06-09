package org.nasdanika.engineering.gen;

import org.nasdanika.engineering.KeyResult;

/**
 * @author Pavel
 *
 */
public class KeyResultViewAction<T extends KeyResult> extends AimViewAction<T> {
			
	protected KeyResultViewAction(T target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}
	
	// TODO - alignments table with weights and completion.
	
}
