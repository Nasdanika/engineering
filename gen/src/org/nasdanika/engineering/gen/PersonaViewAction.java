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
import org.nasdanika.engineering.Persona;
import org.nasdanika.html.OrderedListType;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.app.viewparts.ListOfActionsViewPart;
import org.nasdanika.html.emf.ViewAction;

public class PersonaViewAction<T extends Persona> extends EngineeredElementViewAction<T> {
	
	public PersonaViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.PERSONA__REPRESENTATIVES) {
			return role == FeatureRole.PROPERTY;
		}
		if (feature == EngineeringPackage.Literals.PERSONA__EXTENDS) {
			return role == FeatureRole.PROPERTY;
		}
		if (feature == EngineeringPackage.Literals.PERSONA__EXTENSIONS) {
			return role == FeatureRole.PROPERTY;
		}
		if (feature == EngineeringPackage.Literals.PERSONA__GOALS) {
			return role == FeatureRole.FEATURE_ACTIONS || role == FeatureRole.ELEMENT_ACTIONS;
		}		
		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.PERSONA__GOALS) {
			EList<Goal> goals = getSemanticElement().getGoals();
			if (goals.isEmpty()) {
				return Collections.emptyList();
			}
			ModelElementFeatureViewAction<T, EStructuralFeature, PersonaViewAction<T>> goalsSection = new ModelElementFeatureViewAction<T, EStructuralFeature, PersonaViewAction<T>>(this, feature) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					ListOfActionsViewPart listOfPrinciples = new ListOfActionsViewPart(ViewAction.adaptToViewActionsNonNull(goals), null, true, 10, OrderedListType.ROTATE) {
						@Override
						protected Collection<Entry<Label, List<Action>>> getGroupedActions(ViewGenerator viewGenerator, Action currentAction) {
							if (currentAction instanceof ViewAction) {
								EObject se = ((ViewAction<?>) currentAction).getSemanticElement();
								if (se instanceof Goal) {
									return Collections.singleton(new AbstractMap.SimpleEntry<Label, List<Action>>(null, ViewAction.adaptToViewActionsNonNull(((Goal) se).getChildren())));
								}
							}
							return super.getGroupedActions(viewGenerator, currentAction);
						}
					};
					return viewGenerator.processViewPart(listOfPrinciples, progressMonitor);
				}
				
			};
			
			goalsSection.getRoles().add(Action.Role.SECTION); 
			goalsSection.setSectionStyle(SectionStyle.DEFAULT);
			goalsSection.setText(featureLabelText(feature)); 		
			goalsSection.setIcon(featureIcon(feature));
			goalsSection.setDescription(featureDescription(feature));
			goalsSection.setActivator(new PathNavigationActionActivator(goalsSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#feature-" + feature.getName(), getMarker()));
			return Collections.singleton(goalsSection);
		}
		return super.featureActions(feature);
	}
	
//	@Override
//	public boolean isInRole(String role) {
//		// Anonymous action, navigating from a persona list.
//		return false;
//	}
	
}
