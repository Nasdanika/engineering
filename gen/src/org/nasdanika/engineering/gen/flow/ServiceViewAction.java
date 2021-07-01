package org.nasdanika.engineering.gen.flow;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.flow.Journey;
import org.nasdanika.engineering.flow.Service;
import org.nasdanika.engineering.gen.EngineeringViewActionAdapterFactory;

public class ServiceViewAction extends JourneyElementViewAction<Service> {

	public ServiceViewAction(EList<Journey> journeyPath, Service value, EngineeringViewActionAdapterFactory factory) {
		super(journeyPath, value, factory);
	}

}
