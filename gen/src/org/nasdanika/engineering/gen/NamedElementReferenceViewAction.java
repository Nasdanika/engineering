package org.nasdanika.engineering.gen;

import org.nasdanika.engineering.NamedElementReference;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.impl.Util;
import org.nasdanika.html.emf.ViewAction;

public class NamedElementReferenceViewAction extends NamedElementViewAction<NamedElementReference> {

	protected NamedElementReferenceViewAction(NamedElementReference value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	public ActionActivator getActivator() {
		return ViewAction.adaptToViewActionNonNull(getSemanticElement().getTarget()).getActivator();
	}
	
	@Override
	public String getText() {
		String text = super.getText();
		return Util.isBlank(text) ? ViewAction.adaptToViewActionNonNull(getSemanticElement().getTarget()).getText() : text;
	}
	
	@Override
	protected String getTargetDescription() {
		String targetDescription = super.getTargetDescription();
		return Util.isBlank(targetDescription) ? getModelElementDescription(getSemanticElement().getTarget()) : targetDescription; 
	}
	
	@Override
	public boolean isEmpty() {
		return true;
	}

}
