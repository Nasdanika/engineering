package org.nasdanika.engineering.gen;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;

public class DirectoryActionBuilder extends EngineeredElementActionBuilder<Directory> {
	
	public DirectoryActionBuilder(Directory target, Context context) {
		super(target, context);
	}
	
	@Override
	protected Action buildAction(
			Action action, 
			BiConsumer<EObject, Action> registry,
			Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer,
			ProgressMonitor progressMonitor) {
		Action ret = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		EList<Action> anonymous = ret.getAnonymous();
		for (NamedElement element: getTarget().getElements()) {
			anonymous.add(createChildAction(element, registry, resolveConsumer, progressMonitor));
		}
		
		return ret;
	}
	
	@Override
	protected Table createPropertiesTable(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {		
		Table propertiesTable = super.createPropertiesTable(action, context, progressMonitor);
		if (propertiesTable != null) {
			Action propertiesAction = AppFactory.eINSTANCE.createAction();
			propertiesAction.setText("Properties");
			propertiesAction.setLocation(action.getUuid()+"-properties.html");
			propertiesAction.getContent().add(propertiesTable);
			action.getNavigation().add(propertiesAction);
		}
		return null;
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {
		super.resolve(action, context, progressMonitor);
	
		action.getContent().add(renderList(getTarget().getElements(), true, createElementChildrenProvider(), action, EngineeringPackage.Literals.MODEL_ELEMENT__RESOURCES, context, progressMonitor)); // Table?		
	}
	
	
	private ContentProvider<NamedElement> createElementChildrenProvider() {
		return new ContentProvider<NamedElement>() {
	
			@Override
			public List<EObject> createContent(
					NamedElement element, 
					Action base, 
					ETypedElement typedElement,
					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
					ProgressMonitor progressMonitor) {
	
				if (element instanceof Directory) {
					EList<NamedElement> children = ((Directory) element).getElements();
					if (!children.isEmpty()) {
						return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.DIRECTORY__ELEMENTS, context, progressMonitor));
					}
				}
				return null;
			}
			
		};
	}	
	
	
}
