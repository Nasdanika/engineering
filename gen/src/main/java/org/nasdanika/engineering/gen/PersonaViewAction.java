package org.nasdanika.engineering.gen;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Persona;
import org.nasdanika.html.OrderedListType;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.viewparts.ListOfActionsViewPart;
import org.nasdanika.html.emf.ViewAction;

public class PersonaViewAction<T extends Persona> extends EngineeredElementViewAction<T> {
	
	public PersonaViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	protected Object generateListOfGoals(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		ListOfActionsViewPart listOfGoals = new ListOfActionsViewPart(adaptMemberElementsToViewActionsNonNull(EngineeringPackage.Literals.PERSONA__GOALS, getSemanticElement().getGoals()), null, true, 10, OrderedListType.ROTATE) {
			@Override
			protected Collection<Entry<Label, List<Action>>> getGroupedActions(ViewGenerator viewGenerator, Action currentAction) {
				if (currentAction instanceof ViewAction) {
					EObject se = ((ViewAction<?>) currentAction).getSemanticElement();
					if (se instanceof Goal) {
						return Collections.singleton(new AbstractMap.SimpleEntry<Label, List<Action>>(null, adaptMemberElementsToViewActionsNonNull(EngineeringPackage.Literals.GOAL__CHILDREN, ((Goal) se).getChildren())));
					}
				}
				return super.getGroupedActions(viewGenerator, currentAction);
			}
		};
		return viewGenerator.processViewPart(listOfGoals, progressMonitor);
	}
	
	@Override
	protected Collection<Action> memberActions(ETypedElement member) {
		if (member == EngineeringPackage.Literals.PERSONA__GOALS) {
			EList<Goal> goals = getSemanticElement().getGoals();
			if (goals.isEmpty()) {
				return Collections.emptyList();
			}
			ModelElementFeatureViewAction<T, EStructuralFeature, ModelElementViewActionImpl<T>> goalsSection = createFeatureViewAction((EStructuralFeature) member, this::generateListOfGoals);
			
			goalsSection.setSectionStyle(SectionStyle.DEFAULT);
			return Collections.singleton(goalsSection);
		}
		return super.memberActions(member);
	}
	
}
