package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeredElementStatus;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.html.Tag;

public class EngineeredElementStatusActionBuilder extends NamedElementActionBuilder<EngineeredElementStatus> {
	
	public EngineeredElementStatusActionBuilder(EngineeredElementStatus target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		action.getSections().addAll(createChildrenActions(registry, resolveConsumer, progressMonitor));
		
		return action;
	}
	
	protected List<Action> createChildrenActions(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<EngineeredElementStatus> children = getTarget().getChildren();
		if (children.isEmpty()) {
			return Collections.emptyList();
		}
		Action group = AppFactory.eINSTANCE.createAction();
		group.setText("Sub-statuses");
		EList<Action> groupAnonymous = group.getAnonymous();
		for (EngineeredElementStatus subStatus: children) {
			groupAnonymous.add(createChildAction(subStatus, registry, resolveConsumer, progressMonitor));
		}
		
		return Collections.singletonList(group);
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {
		super.resolve(action, context, progressMonitor);
		
		EList<EngineeredElementStatus> children = getTarget().getChildren();
		if (!children.isEmpty()) {
			Action childrenAction = (Action) action.getSections().get(0);
			ContentProvider<EngineeredElementStatus> engineeredElementStatusChildrenListProvider = new ContentProvider<EngineeredElementStatus>() {

				@Override
				public List<EObject> createContent(
						EngineeredElementStatus element, 
						Action base, 
						ETypedElement typedElement,
						org.nasdanika.html.emf.EObjectActionResolver.Context context, 
						ProgressMonitor progressMonitor) {
					
					EList<EngineeredElementStatus> children = element.getChildren();
					if (children.isEmpty()) {
						return null;
					}
					return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS__CHILDREN, context, progressMonitor));
				}
				
			};
			
			childrenAction.getContent().add(renderList(children, true, engineeredElementStatusChildrenListProvider, action, EngineeringPackage.Literals.ENGINEER__ENGINEERED_ELEMENT_STATUSES, context, progressMonitor));
		}
		
		List<EngineeredElement> elements = getTarget().getElements();
		if (!elements.isEmpty()) {
			Tag elementsList = renderList(elements, true, null, action, EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS__ELEMENTS, context, progressMonitor);
			Action section = AppFactory.eINSTANCE.createAction();
			section.setText("Elements");
			section.getContent().add(elementsList);
		
			action.getSections().add(section);
		}			
	}
	
}
