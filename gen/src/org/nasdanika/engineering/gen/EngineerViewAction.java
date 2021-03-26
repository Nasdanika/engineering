package org.nasdanika.engineering.gen;

import java.util.List;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class EngineerViewAction<T extends Engineer> extends PersonaViewAction<T> {
	
	public EngineerViewAction(T value) {
		super(value);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}
	
	@Override
	public List<Action> getChildren() {
		List<Action> children = super.getChildren();
		children.addAll(adaptToViewActionNonNullSorted(target.getModules()));
		return children;
	}

}
