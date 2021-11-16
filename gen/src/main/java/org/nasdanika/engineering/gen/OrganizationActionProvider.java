package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Organization;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;

public class OrganizationActionProvider extends EngineerActionProvider<Organization> {
	
	public OrganizationActionProvider(Organization target, Context context) {
		super(target, context);	
	}
	
	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		createEngineersActions(action, registry, resolveConsumer, progressMonitor);
		return action;
	}
	
	/**
	 * Creates a list of actions for personas and adds them to the list of group's anonymous actions. 
	 * @param progressMonitor
	 * @return An empty list if there are no personas. A singleton list containing a grouping action containing persona actions otherwise.
	 * @throws Exception 
	 */
	protected void createEngineersActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Engineer> engineers = getTarget().getEngineers();
		if (!engineers.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Engineers");
			group.setUuid(action.getUuid() + "-engineers");
			group.setLocation("engineers.html");
			// TODO - icon, ...
			EList<Action> groupAnonymous = group.getAnonymous();
			for (Engineer engineer: engineers) {
				groupAnonymous.add(createChildAction(engineer, registry, resolveConsumer, progressMonitor));
			}
		
			action.getNavigation().add(group);
		}
	}
		
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		Organization semanticElement = getTarget();
		EList<Engineer> engineers = semanticElement.getEngineers();
		if (!engineers.isEmpty()) {
			String personaGroupUUID = action.getUuid() + "-engineers";
			Optional<Action> personasActionOptional = action.getNavigation().stream()
					.filter(Action.class::isInstance)					
					.map(Action.class::cast)
					.filter(a -> personaGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Action personasAction = personasActionOptional.get();
			personasAction.getContent().add(renderList(engineers, true, createEngineerChildrenProvider(), personasAction, EngineeringPackage.Literals.ENGINEER__PERSONAS, context, progressMonitor)); // Table?
		}
		
	}
	
	private ContentProvider<Engineer> createEngineerChildrenProvider() {
		return new ContentProvider<Engineer>() {
	
			@Override
			public List<EObject> createContent(
					Engineer element, 
					Action base, 
					ETypedElement typedElement,
					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
					ProgressMonitor progressMonitor) throws Exception {
				
				if (element instanceof Organization) {
					EList<Engineer> engineers = ((Organization) element).getEngineers();
					if (!engineers.isEmpty()) {
						return Collections.singletonList(renderList(engineers, true, this, base, EngineeringPackage.Literals.ORGANIZATION__ENGINEERS, context, progressMonitor));
					}
				}
				return null;
			}
			
		};
	}	
	
}
