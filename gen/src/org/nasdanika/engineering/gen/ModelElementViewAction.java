package org.nasdanika.engineering.gen;

import org.nasdanika.engineering.ModelElement;
import org.nasdanika.html.emf.ViewAction;

public interface ModelElementViewAction<T extends ModelElement> extends ViewAction<T> {
	
	EngineeringViewActionAdapterFactory getFactory();

}
