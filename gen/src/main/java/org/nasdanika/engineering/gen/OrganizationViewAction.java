package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Organization;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;

public class OrganizationViewAction extends EngineerViewAction<Organization> {
	
	public OrganizationViewAction(Organization value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Collection<Action> memberActions(ETypedElement member) {
		if (member == EngineeringPackage.Literals.ORGANIZATION__ENGINEERS) {
			if (getSemanticElement().getEngineers().isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateEngineersTable));
		}

		return super.memberActions(member);
	}
	
	protected Object generateEngineersTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Engineer", "Start", "End", "Owns", "Expert", "Assignments", "Messages").color(Color.INFO);
		for (Engineer engineer: getSemanticElement().getEngineers()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(engineer)),
					memberValue(EngineeringPackage.Literals.PERIOD__START, engineer.getStart(), viewGenerator, progressMonitor),
					memberValue(EngineeringPackage.Literals.PERIOD__START, engineer.getEnd(), viewGenerator, progressMonitor),
					engineer.getOwns().size(),
					engineer.getExpertise().size(),
					engineer.getAssignments().size(),
					engineer.getMessages().size());
		}
		return table;
	}
	

}
