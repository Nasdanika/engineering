package org.nasdanika.engineering.gen.flow;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.flow.Activity;
import org.nasdanika.engineering.flow.Journey;
import org.nasdanika.engineering.gen.EngineeringViewActionAdapterFactory;

public class ActivityViewAction<T extends Activity> extends JourneyElementViewAction<T> {

	public ActivityViewAction(EList<Journey> journeyPath, T value, EngineeringViewActionAdapterFactory factory) {
		super(journeyPath, value, factory);
	}

}
