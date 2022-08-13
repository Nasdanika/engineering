package org.nasdanika.engineering.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Document;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;

public class DocumentActionBuilder extends EngineeredElementActionBuilder<Document> {
	
	public DocumentActionBuilder(Document target, Context context) {
		super(target, context);		
	}
		
	@Override
	protected Table createPropertiesTable(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {		
		Table propertiesTable = super.createPropertiesTable(action, context, progressMonitor);
		if (propertiesTable != null) {
			Action propertiesAction = AppFactory.eINSTANCE.createAction();
			propertiesAction.setText("Properties");
			propertiesAction.setLocation(action.getUuid()+"-properties.html");
			propertiesAction.getContent().add(propertiesTable);
			action.getNavigation().add(propertiesAction);
		}
		return null;
	}
	
}
