package org.nasdanika.engineering.gen;

import java.util.List;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;

public class DirectoryViewAction extends EngineeredElementViewAction<Directory> {

	protected DirectoryViewAction(Directory value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Object doGenerate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Resource", "Description").color(Color.INFO);
		for (NamedElement element: getSemanticElement().getElements()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(element)),
					getModelElementDescription(element));
		}
		return table;
	}
	
	@Override
	protected boolean isCacheContent() {
		return false;
	}
	
	
	protected Object generateInfo(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		return super.doGenerate(viewGenerator, progressMonitor);
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> ret = super.collectChildren();
		
		ActionImpl infoAction = new ActionImpl() {
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				return generateInfo(viewGenerator, progressMonitor);
			}
			
			@Override
			public boolean isEmpty() {
				return false;
			}
			
		};
		
		infoAction.setText("Info");
		infoAction.getRoles().add(Action.Role.CONTEXT);
		infoAction.setParent(this);
		infoAction.setActivator(new PathNavigationActionActivator(infoAction, ((NavigationActionActivator) getActivator()).getUrl(null), sectionPath(this) + "info.html", getMarker()));
		ret.add(infoAction);
		
		return ret;
	}

}
