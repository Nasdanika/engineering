package org.nasdanika.engineering.gen;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Issue;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class IssueViewAction extends NamedElementViewAction<Issue> {
	
	protected IssueViewAction(Issue value) {
		super(value);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}

}
