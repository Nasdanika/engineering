package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.EngineeringPackage;
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
		table.header().headerRow("Source", "Description").color(Color.INFO);
		for (Alignment alignment: getSemanticElement().getAlignments()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(alignment.eContainer())),
					getModelElementDescription(alignment));
		}
		return table;
	}				
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.AIM__ALIGNS) {
			EList<Alignment> aligns = getSemanticElement().getAligns();
			if (aligns.isEmpty()) {
				return Collections.emptyList();
			}
			
			return Collections.singleton(createFeatureViewAction(feature, this::generateAlignsTable));			
		}
		if (feature == EngineeringPackage.Literals.AIM__ALIGNMENTS) {
			EList<Alignment> alignments = getSemanticElement().getAlignments();
			if (alignments.isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction(feature, this::generateAlignmentsTable));			
		}
		return super.featureActions(feature);
	}
	
	
}
