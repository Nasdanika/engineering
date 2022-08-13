package org.nasdanika.engineering.gen;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;

public class CapabilityActionBuilder<T extends Capability> extends NamedElementActionBuilder<T> {
	
	public CapabilityActionBuilder(T target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		createRequiredByAction(action, registry, resolveConsumer, progressMonitor);		
		
		return action;
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.CAPABILITY__AVAILABLE);
		return properties;
	}
	
	protected void createRequiredByAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<Issue> requiredBy = getTarget().getRequiredBy();
		if (!requiredBy.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Required by");
			group.setUuid(action.getUuid() + "-required-by");
			group.setLocation("required-by.html");
			action.getSections().add(group);
		}		
	}
		
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {
		super.resolve(action, context, progressMonitor);
		
		EList<Issue> requiredBy = getTarget().getRequiredBy();
		if (!requiredBy.isEmpty()) {
			String requiredByGroupUUID = action.getUuid() + "-required-by";
			Optional<Action> requiredByOptional = action.getSections().stream()
					.filter(a -> requiredByGroupUUID.equals(a.getUuid()))
					.findFirst();
			Action issuesAction = requiredByOptional.get();
			Table requiredByTable = buildTable(
					requiredBy, 
					action, 
					EngineeringPackage.Literals.CAPABILITY__REQUIRED_BY, 
					context, 
					progressMonitor,
					createColumnBuilder("Issue"),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__TARGET),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__CATEGORIES),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__PRIORITY),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__SEVERITY),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__STATUS),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__WORKABLE),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__BENEFIT),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__COST),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__EFFORT),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__REMAINING_COST),
					createColumnBuilder(EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT),
					createColumnBuilder(EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
			
			issuesAction.getContent().add(requiredByTable);
		}
		
	}
		
}
