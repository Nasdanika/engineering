package org.nasdanika.engineering.gen;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Organization;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class OrganizationViewAction extends EngineerViewAction<Organization> {
	
	private Action parent;

	public OrganizationViewAction(Organization value, Action parent) {
		super(value);
		this.parent = parent;
	}
	
	@Override
	public Action getParent() {
		Action ret = super.getParent();
		return ret == null ? parent : ret;
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}

}
