package org.nasdanika.engineering.gen;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.Journey;

public class ActivityViewAction<T extends Activity> extends JourneyElementViewAction<T> {

	public ActivityViewAction(EList<Journey> journeyPath, T value, EngineeringViewActionAdapterFactory factory) {
		super(journeyPath, value, factory);
	}

}
