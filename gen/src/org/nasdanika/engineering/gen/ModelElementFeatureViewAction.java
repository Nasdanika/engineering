package org.nasdanika.engineering.gen;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.FeatureAppearance;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.html.emf.EStructuralFeatureViewActionImpl;
import org.nasdanika.html.emf.SimpleEObjectViewAction;

/**
 * Handles appearance.
 * @author Pavel
 *
 * @param <T>
 * @param <F>
 * @param <V>
 */
public class ModelElementFeatureViewAction<T extends ModelElement, F extends EStructuralFeature, V extends ModelElementViewAction<T>> extends EStructuralFeatureViewActionImpl<T, F, V> {

	public ModelElementFeatureViewAction(T semanticElement, F feature) {
		super(semanticElement, feature);
	}

	public ModelElementFeatureViewAction(V semanticElementViewAction, F feature) {
		super(semanticElementViewAction, feature);
	}
	
	@Override
	public boolean isInRole(String role) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			FeatureAppearance featureAppearance = appearance.getFeatures().get(Util.camelToKebab(getEStructuralFeature().getName()));
			if (featureAppearance != null) {
				if (!featureAppearance.getRoles().isEmpty()) {
					boolean hasFeatureActions = false;
					for (String featureRole: featureAppearance.getRoles()) {
						if (featureRole.equals(SimpleEObjectViewAction.FeatureRole.FEATURE_ACTIONS.LITERAL + "/" + role)) {
							return true;
						}
						if (featureRole.startsWith(SimpleEObjectViewAction.FeatureRole.FEATURE_ACTIONS.LITERAL + "/")) {
							hasFeatureActions = true;
						}
					}
					
					if (hasFeatureActions) {
						return false;
					}
				}
			}
		}
		
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: getSemanticElementViewAction().getFactory().getAppearance(eClass)) {
				FeatureAppearance featureAppearance = classAppearance.getFeatures().get(Util.camelToKebab(getEStructuralFeature().getName()));
				if (featureAppearance != null) {
					if (!featureAppearance.getRoles().isEmpty()) {
						boolean hasFeatureActions = false;
						for (String featureRole: featureAppearance.getRoles()) {
							if (featureRole.equals(SimpleEObjectViewAction.FeatureRole.FEATURE_ACTIONS.LITERAL + "/" + role)) {
								return true;
							}
							if (featureRole.startsWith(SimpleEObjectViewAction.FeatureRole.FEATURE_ACTIONS.LITERAL + "/")) {
								hasFeatureActions = true;
							}
						}
						
						if (hasFeatureActions) {
							return false;
						}
					}
				}
			}
		}

		return super.isInRole(role);
	}

}
