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
import org.nasdanika.html.emf.EStructuralFeatureViewActionImpl;
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

	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.AIM__ALIGNMENTS) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		if (feature == EngineeringPackage.Literals.AIM__ALIGNS) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	public boolean isInRole(String role) {
		// Anonymous action, navigating from a persona list.
		return false;
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.AIM__ALIGNS) {
			EList<Alignment> aligns = getSemanticElement().getAligns();
			if (aligns.isEmpty()) {
				return Collections.emptyList();
			}
			EStructuralFeatureViewActionImpl<T, EStructuralFeature, AimViewAction<T>> alignsFeatureAction = new EStructuralFeatureViewActionImpl<T, EStructuralFeature, AimViewAction<T>>(this, feature) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
					table.header().headerRow("Aim", "Description").color(Color.INFO);
					for (Alignment alignment: aligns) {
						table.body().row(
								viewGenerator.link(ViewAction.adaptToViewActionNonNull(alignment.getAim())),
								getModelElementDescription(alignment));
					}
					return table;
				}				
				
			};
			alignsFeatureAction.getRoles().add(Action.Role.SECTION);
			return Collections.singleton(alignsFeatureAction);
		}
		if (feature == EngineeringPackage.Literals.AIM__ALIGNMENTS) {
			EList<Alignment> alignments = getSemanticElement().getAlignments();
			if (alignments.isEmpty()) {
				return Collections.emptyList();
			}
			EStructuralFeatureViewActionImpl<T, EStructuralFeature, AimViewAction<T>> alignmentsFeatureAction = new EStructuralFeatureViewActionImpl<T, EStructuralFeature, AimViewAction<T>>(this, feature) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
					table.header().headerRow("Source", "Description").color(Color.INFO);
					for (Alignment alignment: alignments) {
						table.body().row(
								viewGenerator.link(ViewAction.adaptToViewActionNonNull(alignment.eContainer())),
								getModelElementDescription(alignment));
					}
					return table;
				}				
				
			};
			alignmentsFeatureAction.getRoles().add(Action.Role.SECTION);
			return Collections.singleton(alignmentsFeatureAction);
		}
		return super.featureActions(feature);
	}
	
	
}
