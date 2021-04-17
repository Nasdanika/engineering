package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.List;

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
	
	private Collection<ModelElement> elements;

	public EngineeringViewAction(Collection<ModelElement> elements) {
		this.elements = elements;
	}
	
	@Override
	public List<Action> getChildren() {
		return ModelElementViewAction.adaptToViewActionNonNull(elements);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		// TODO List of contents for elements.
		return super.generate(viewGenerator, progressMonitor);
	}


}
