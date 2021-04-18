package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.html.Fragment;
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
		setText("Engineering");
	}
	
	@Override
	public List<Action> getChildren() {
		return ViewAction.adaptToViewActionNonNull(elements);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = viewGenerator.getHTMLFactory().fragment();
		ret.content(viewGenerator.processViewPart(ViewAction.listOfActions(elements, null, false, false, 1), progressMonitor));
		
		return ret;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

}
