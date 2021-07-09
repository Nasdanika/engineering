package org.nasdanika.engineering.gen;

import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.html.app.ViewGenerator;

/**
 * @author Pavel
 *
 */
public class KeyResultViewAction<T extends KeyResult> extends AimViewAction<T> {
		
	@Override
	protected Object memberValue(ETypedElement member, Object value, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (member == EngineeringPackage.Literals.KEY_RESULT__COMPLETION) {
			return progressBar(getSemanticElement().getCompletion(), viewGenerator);			
		}
		return super.memberValue(member, value, viewGenerator, progressMonitor);
	}
			
	protected KeyResultViewAction(T target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}
	
	// TODO - alignments table with weights and completion.
	
}
