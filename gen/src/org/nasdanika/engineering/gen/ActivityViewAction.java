package org.nasdanika.engineering.gen;

import org.nasdanika.engineering.Activity;

public class ActivityViewAction<T extends Activity> extends JourneyElementViewAction<T> {

	public ActivityViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}

}
