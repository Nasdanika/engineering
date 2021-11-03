package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Persona;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.ncore.util.NamedElementComparator;

public class EngineerActionProvider<T extends Engineer> extends PersonaActionProvider<T> {
	
	public EngineerActionProvider(T target, Context context) {
		super(target, context);		
	}
		
	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		
		EList<EObject> children = action.getChildren();
		children.addAll(createModuleActions(registry, resolveConsumer, progressMonitor));
		
		action.getNavigation().addAll(createPersonaActions(registry, resolveConsumer, progressMonitor));
		
		return action;
	}
	
	/**
	 * Creates a list of actions for modules. 
	 * @param progressMonitor
	 * @return An empty list if there are no modules. A singleton list containing a grouping action containing module actions otherwise.
	 * @throws Exception 
	 */
	protected List<Action> createModuleActions(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		List<org.nasdanika.engineering.Module> modules = getTarget().getModules().stream().sorted(NamedElementComparator.INSTANCE).collect(Collectors.toList());
		if (modules.isEmpty()) {
			return Collections.emptyList();
		}
		Action group = AppFactory.eINSTANCE.createAction();
		group.setText("Modules");
		// TODO - icon, ...
		EList<EObject> children = group.getChildren();
		for (org.nasdanika.engineering.Module module: modules) {
			children.add(createChildAction(module, registry, resolveConsumer, progressMonitor));
		}
		
		return Collections.singletonList(group);
	}
	
	/**
	 * Creates a list of actions for personas and adds them to the list of group's anonymous actions. 
	 * @param progressMonitor
	 * @return An empty list if there are no modules. A singleton list containing a grouping action containing module actions otherwise.
	 * @throws Exception 
	 */
	protected List<Action> createPersonaActions(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Persona> personas = getTarget().getPersonas().stream().sorted(NamedElementComparator.INSTANCE).collect(Collectors.toList());
		if (personas.isEmpty()) {
			return Collections.emptyList();
		}
		Action group = AppFactory.eINSTANCE.createAction();
		group.setText("Personas");
		group.setLocation("personas.html");
		// TODO - icon, ...
		EList<Action> groupAnonymous = group.getAnonymous();
		for (Persona persona: personas) {
			groupAnonymous.add(createChildAction(persona, registry, resolveConsumer, progressMonitor));
		}
		
		return Collections.singletonList(group);
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<Persona> personas = getTarget().getPersonas();
		if (!personas.isEmpty()) {
			Action personasAction = (Action) action.getNavigation().get(0);
			personasAction.getContent().add(renderList(personas, true, null, action, EngineeringPackage.Literals.ENGINEER__PERSONAS, context, progressMonitor)); // Table?
		}
	}
		
}
