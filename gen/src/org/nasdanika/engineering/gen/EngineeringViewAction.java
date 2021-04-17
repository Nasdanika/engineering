package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.emf.ViewAction;

/**
 * Grouping action for {@link ModelElement}'s {@link ViewAction}'s. 
 * 
 * @author Pavel
 *
 */
public class EngineeringViewAction extends ActionImpl {
	
	private Collection<EObject> elements;

	public EngineeringViewAction(Collection<EObject> elements) {
		this.elements = elements;
	}
	
	@Override
	public List<Action> getChildren() {
		return ViewAction.adaptToViewActionNonNull(elements);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		// TODO List of contents for elements.
		return super.generate(viewGenerator, progressMonitor);
	}


}
