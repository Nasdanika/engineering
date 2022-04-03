package org.nasdanika.engineering.gen;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Release;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.ncore.NcorePackage;

public class ReleaseActionBuilder extends EngineeredCapabilityActionBuilder<Release> {
	
	public ReleaseActionBuilder(Release target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.RELEASE__INCREMENT);
		return properties;
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		// Capabilities		
		EList<EngineeredCapability> capabilities = getTarget().getCapabilities();
		if (!capabilities.isEmpty()) {
			Map<EClass, List<EngineeredCapability>> groupedCapabilities = Util.groupBy(capabilities, EObject::eClass);
			
			List<EngineeredCapability> releases = groupedCapabilities.get(EngineeringPackage.Literals.RELEASE);
			if (releases != null && !releases.isEmpty()) {
				Table releasesTable = buildTable(
						releases, 
						action, 
						EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS, 
						context, 
						progressMonitor,
						createColumnBuilder("Release"),
						createColumnBuilder(EcorePackage.Literals.EOBJECT___ECONTAINER, "Product"),
						createColumnBuilder(EngineeringPackage.Literals.RELEASE__INCREMENT),
						createColumnBuilder(NcorePackage.Literals.PERIOD__START),
						createColumnBuilder(NcorePackage.Literals.PERIOD__END),
						createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION),
						createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
				
				Action section = AppFactory.eINSTANCE.createAction();
				section.setText("Releases");
				section.getContent().add(releasesTable);
			
				action.getSections().add(section);
			}
			
			List<EngineeredCapability> features = groupedCapabilities.get(EngineeringPackage.Literals.FEATURE);
			if (features != null && !features.isEmpty()) {
				Table featuresTable = buildTable(
						features, 
						action, 
						EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS, 
						context, 
						progressMonitor,
						createColumnBuilder("Feature"),
						createColumnBuilder(EcorePackage.Literals.EOBJECT___ECONTAINER, "Product"),
						createColumnBuilder(NcorePackage.Literals.PERIOD__START),
						createColumnBuilder(NcorePackage.Literals.PERIOD__END),
						createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION),
						createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
				
				Action section = AppFactory.eINSTANCE.createAction();
				section.setText("Features");
				section.getContent().add(featuresTable);
			
				action.getSections().add(section);
			}
			
			List<EngineeredCapability> issues = groupedCapabilities.get(EngineeringPackage.Literals.ISSUE);
			if (issues != null && !issues.isEmpty()) {
				Table issuesTable = buildTable(
						issues, 
						action, 
						EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS, 
						context, 
						progressMonitor,
						createColumnBuilder("Issue"),
						createColumnBuilder(EcorePackage.Literals.EOBJECT___ECONTAINER, "Module"),
						createColumnBuilder(EngineeringPackage.Literals.ISSUE__INCREMENT),
						createColumnBuilder(NcorePackage.Literals.PERIOD__START),
						createColumnBuilder(NcorePackage.Literals.PERIOD__END),
						createColumnBuilder(NcorePackage.Literals.PERIOD__DURATION),
						createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
				
				Action section = AppFactory.eINSTANCE.createAction();
				section.setText("Issues");
				section.getContent().add(issuesTable);
			
				action.getSections().add(section);
			}			
		}		
	}		
		
}
