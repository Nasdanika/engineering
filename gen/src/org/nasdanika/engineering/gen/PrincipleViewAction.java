package org.nasdanika.engineering.gen;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Principle;
import org.nasdanika.html.OrderedListType;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.app.viewparts.ListOfActionsViewPart;
import org.nasdanika.html.emf.EStructuralFeatureViewActionImpl;
import org.nasdanika.html.emf.ViewAction;

/**
 * @author Pavel
 *
 */
public class PrincipleViewAction extends AimViewAction<Principle> {
			
	protected PrincipleViewAction(Principle target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.PRINCIPLE__CHILDREN) {
			return role == FeatureRole.FEATURE_ACTIONS || role == FeatureRole.ELEMENT_ACTIONS;
		}
		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.PRINCIPLE__CHILDREN) {
			EList<Principle> children = getSemanticElement().getChildren();
			if (children.isEmpty()) {
				return Collections.emptyList();
			}
			EStructuralFeatureViewActionImpl<Principle, EStructuralFeature> childrenSection = new EStructuralFeatureViewActionImpl<Principle, EStructuralFeature>(getSemanticElement(), feature) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					ListOfActionsViewPart listOfPrinciples = new ListOfActionsViewPart(ViewAction.adaptToViewActionsNonNull(children), null, true, 10, OrderedListType.ROTATE) {
						@Override
						protected Collection<Entry<Label, List<Action>>> getGroupedActions(ViewGenerator viewGenerator, Action currentAction) {
							if (currentAction instanceof ViewAction) {
								EObject se = ((ViewAction<?>) currentAction).getSemanticElement();
								if (se instanceof Principle) {
									return Collections.singleton(new AbstractMap.SimpleEntry<Label, List<Action>>(null, ViewAction.adaptToViewActionsNonNull(((Principle) se).getChildren())));
								}
							}
							return super.getGroupedActions(viewGenerator, currentAction);
						}
					};
					return viewGenerator.processViewPart(listOfPrinciples, progressMonitor);
				}
				
			};
			
			childrenSection.getRoles().add(Action.Role.SECTION); 
			childrenSection.setSectionStyle(SectionStyle.DEFAULT);
			childrenSection.setText(featureLabelText(feature)); 		
			childrenSection.setIcon(featureIcon(feature));
			childrenSection.setDescription(featureDescription(feature));
			childrenSection.setActivator(new PathNavigationActionActivator(childrenSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#feature-" + feature.getName(), getMarker()));
			return Collections.singleton(childrenSection);
		}
		return super.featureActions(feature);
	}
	
}
