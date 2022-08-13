module org.nasdanika.egineering.gen {
	
	exports org.nasdanika.engineering.gen;
	
	requires transitive org.nasdanika.egineering;
	requires transitive org.nasdanika.html.flow;
	requires transitive org.nasdanika.html.emf;
	requires org.nasdanika.exec.gen;
	requires org.apache.commons.codec;
	requires org.nasdanika.diagram.gen;
	requires org.eclipse.emf.ecore.xmi;
	requires org.jsoup;
	
}