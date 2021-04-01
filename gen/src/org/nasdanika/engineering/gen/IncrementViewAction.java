package org.nasdanika.engineering.gen;

import java.util.Date;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.Table;

public class IncrementViewAction extends NamedElementViewAction<Increment> {
	
	protected IncrementViewAction(Increment value) {
		super(value);
	}
	
	@Override
	public Label getCategory() {
		if (target.eContainmentFeature() == EngineeringPackage.Literals.INCREMENT__CHILDREN) {
			return null;
		}
		return super.getCategory();
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}
	

	@Override
	protected Table propertiesTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) { 
		Table propertiesTable = super.propertiesTable(viewGenerator, progressMonitor);
		Date start = target.getStart();
		if (start != null) {
			Row startRow = propertiesTable.row(); 
			startRow.header("Start");
			startRow.cell(start);
		}
		Date end = target.getEnd();
		if (end != null) {
			Row endRow = propertiesTable.row(); 
			endRow.header("End");
			endRow.cell(end);
		}
		return propertiesTable;
	}
	

}
