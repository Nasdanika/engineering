package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.engineering.Objective;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;

/**
 * @author Pavel
 *
 */
public class ObjectiveViewAction extends KeyResultViewAction<Objective> {
			
	protected ObjectiveViewAction(Objective target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}
	
	protected Object generateKeyResultsTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Key result", "Completion").color(Color.INFO);
		for (KeyResult keyResult: getSemanticElement().getKeyResults()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(keyResult)),
					progressBar(keyResult.getCompletion(), viewGenerator));
		}
		return table;
	}				
	
	protected Object generateChildrenTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Objective", "Completion").color(Color.INFO);
		for (Objective objective: getSemanticElement().getChildren()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(objective)),
					progressBar(objective.getCompletion(), viewGenerator));
		}
		return table;
	}				
	
	protected Object generateLinkedObjectivesTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Objective", "Completion").color(Color.INFO);
		for (Objective objective: getSemanticElement().getLinkedObjectives()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(objective)),
					progressBar(objective.getCompletion(), viewGenerator));
		}
		return table;
	}				
	
	protected Object generateSubObjectivesTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Objective", "Completion").color(Color.INFO);
		for (Objective objective: getSemanticElement().getSubObjectives()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(objective)),
					progressBar(objective.getCompletion(), viewGenerator));
		}
		return table;
	}				
	
	@Override
	protected Collection<Action> memberActions(ETypedElement member) {
		if (member == EngineeringPackage.Literals.OBJECTIVE__KEY_RESULTS) {
			if (getSemanticElement().getKeyResults().isEmpty()) {
				return Collections.emptyList();
			}
			
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateKeyResultsTable));			
		}
		if (member == EngineeringPackage.Literals.OBJECTIVE__CHILDREN) {
			if (getSemanticElement().getChildren().isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateChildrenTable));			
		}
		if (member == EngineeringPackage.Literals.OBJECTIVE__LINKED_OBJECTIVES) {
			if (getSemanticElement().getLinkedObjectives().isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateLinkedObjectivesTable));			
		}
		if (member == EngineeringPackage.Literals.OBJECTIVE__SUB_OBJECTIVES) {
			if (getSemanticElement().getSubObjectives().isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateSubObjectivesTable));			
		}
		return super.memberActions(member);
	}
	
}
