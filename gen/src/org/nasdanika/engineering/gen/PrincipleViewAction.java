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
import org.nasdanika.engineering.Principle;
import org.nasdanika.html.OrderedListType;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.viewparts.ListOfActionsViewPart;
import org.nasdanika.html.emf.ViewAction;

/**
 * @author Pavel
 *
 */
public class PrincipleViewAction extends AimViewAction<Principle> {
			
	protected PrincipleViewAction(Principle target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}
	
	protected Object generateChildrenList(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		ListOfActionsViewPart childrenList = new ListOfActionsViewPart(adaptMemberElementsToViewActionsNonNull(EngineeringPackage.Literals.PRINCIPLE__CHILDREN, getSemanticElement().getChildren()), null, true, 10, OrderedListType.ROTATE) {
			@Override
			protected Collection<Entry<Label, List<Action>>> getGroupedActions(ViewGenerator viewGenerator, Action currentAction) {
				if (currentAction instanceof ViewAction) {
					EObject se = ((ViewAction<?>) currentAction).getSemanticElement();
					if (se instanceof Principle) {
						return Collections.singleton(new AbstractMap.SimpleEntry<Label, List<Action>>(null, adaptMemberElementsToViewActionsNonNull(EngineeringPackage.Literals.PRINCIPLE__CHILDREN, ((Principle) se).getChildren())));
					}
				}
				return super.getGroupedActions(viewGenerator, currentAction);
			}
		};
		return viewGenerator.processViewPart(childrenList, progressMonitor);
	}
	
	@Override
	protected Collection<Action> memberActions(ETypedElement member) {
		if (member == EngineeringPackage.Literals.PRINCIPLE__CHILDREN) {
			EList<Principle> children = getSemanticElement().getChildren();
			if (children.isEmpty()) {
				return Collections.emptyList();
			}
			
			ModelElementFeatureViewAction<Principle, EStructuralFeature, ModelElementViewActionImpl<Principle>> childrenSection = createFeatureViewAction((EStructuralFeature) member, this::generateChildrenList);
			
			childrenSection.setSectionStyle(SectionStyle.DEFAULT);
//			childrenSection.setActivator(new PathNavigationActionActivator(childrenSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#feature-" + feature.getName(), getMarker()));
			return Collections.singleton(childrenSection);
		}
		return super.memberActions(member);
	}
	
}
