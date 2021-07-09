package org.nasdanika.engineering.gen;

import org.nasdanika.engineering.Link;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.NavigationActionActivator;

public class LinkViewAction extends NamedElementViewAction<Link> {

	protected LinkViewAction(Link value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	public ActionActivator getActivator() {
		return new NavigationActionActivator() {
			
			@Override
			public String getUrl(String base) {
				return getSemanticElement().getTarget();
			}
		};
	}

}
