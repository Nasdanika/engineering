package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;

/**
 * @author Pavel
 *
 * @param <T>
 */
public class AimViewAction<T extends Aim> extends NamedElementViewAction<T> {
			
	protected AimViewAction(T target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}
	
	protected Object generateAlignsTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Aim", "Description").color(Color.INFO);
		for (Alignment alignment: getSemanticElement().getAligns()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(alignment.getAim())),
					getModelElementDescription(alignment));
		}
		return table;
	}
	
	protected Object generateAlignmentsTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Source", "Completion", "Description").color(Color.INFO);
		for (Alignment alignment: getSemanticElement().getAlignments()) {
			Object progressBar = null;
			EObject aContainer = alignment.eContainer();
			if (aContainer instanceof Endeavor) {
				progressBar = progressBar(((Endeavor) aContainer).getCompletion(), viewGenerator);
			} else if (aContainer instanceof KeyResult) {
				progressBar = progressBar(((KeyResult) aContainer).getCompletion(), viewGenerator);				
			}
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(aContainer)),
					progressBar,
					getModelElementDescription(alignment));
		}
		return table;
	}				
	
	@Override
	protected Collection<Action> memberActions(ETypedElement member) {
		if (member == EngineeringPackage.Literals.ALIGNABLE__ALIGNS) {
			if (getSemanticElement().getAligns().isEmpty()) {
				return Collections.emptyList();
			}
			
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateAlignsTable));			
		}
		if (member == EngineeringPackage.Literals.AIM__ALIGNMENTS) {
			if (getSemanticElement().getAlignments().isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateAlignmentsTable));			
		}
		return super.memberActions(member);
	}
		
}
