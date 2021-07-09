package org.nasdanika.engineering.gen;

import org.nasdanika.common.ContextSupplier;
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
		ViewAction<?> tva = ViewAction.adaptToViewActionNonNull(getSemanticElement().getTarget());
		return Util.isBlank(targetDescription) ? getModelElementDescription(getSemanticElement().getTarget(), (tva instanceof ContextSupplier ? (ContextSupplier) tva : this).getContext()) : targetDescription; 
	}
	
	@Override
	public boolean isEmpty() {
		return true;
	}

}
