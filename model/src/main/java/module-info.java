module org.nasdanika.egineering {
	
	exports org.nasdanika.engineering;
	exports org.nasdanika.engineering.impl;
	exports org.nasdanika.engineering.util;
	exports org.nasdanika.engineering.journey;
	exports org.nasdanika.engineering.journey.impl;
	exports org.nasdanika.engineering.journey.util;
	
	requires transitive org.nasdanika.flow;
	requires transitive org.nasdanika.html.model.app;
	requires org.apache.commons.codec;
	
}