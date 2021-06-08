package org.nasdanika.engineering.gen;

import java.util.List;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Directory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;

public class DirectoryViewAction extends EngineeredElementViewAction<Directory> {

	protected DirectoryViewAction(Directory value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	protected Object generateTableOfContents(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		return "Table of contents...";
	}
	
	protected Object generateInfo(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		return super.generate(viewGenerator, progressMonitor);
	}
	
	@Override
	protected Object doGenerate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		return "Directory contents here...";
	}
	
	@Override
	protected boolean isCacheContent() {
		return false;
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> ret = super.collectChildren();
		// TODO - info context action.
		return ret;
	}

}
