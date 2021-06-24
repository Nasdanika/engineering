package org.nasdanika.engineering.gen;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.Journey;
import org.nasdanika.engineering.Service;

public class ServiceViewAction extends JourneyElementViewAction<Service> {

	public ServiceViewAction(EList<Journey> journeyPath, Service value, EngineeringViewActionAdapterFactory factory) {
		super(journeyPath, value, factory);
	}

}
