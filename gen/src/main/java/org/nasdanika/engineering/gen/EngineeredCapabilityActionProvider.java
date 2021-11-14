package org.nasdanika.engineering.gen;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.ncore.NcorePackage;

public class EngineeredCapabilityActionProvider<T extends EngineeredCapability> extends CapabilityActionProvider<T> {
	
	public EngineeredCapabilityActionProvider(T target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		
		// Endeavor's
		properties.add(EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE);
		properties.add(EngineeringPackage.Literals.ENDEAVOR__COMPLETION);
		properties.add(EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST);
		
		return properties;
	}
		
	@Override
	protected Action createAction(
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action action = super.createAction(registry, resolveConsumer, progressMonitor);
		
		createAlignsActions(action, registry, resolveConsumer, progressMonitor);
		
		return action;
	}
	
	protected void createAlignsActions(
			Action action, 
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		
		List<Alignment> alignments = getTarget().getAligns();
		if (!alignments.isEmpty()) {
			Action group = AppFactory.eINSTANCE.createAction();
			group.setText("Aligns");
			group.setUuid(action.getUuid() + "-aligns");
			action.getSections().add(group);
		}
	}
	
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		EList<Alignment> alignments = getTarget().getAligns();
		if (!alignments.isEmpty()) {
			String alignsGroupUUID = action.getUuid() + "-aligns";
			Optional<Action> alignmentsActionOptional = action.getSections().stream()
					.filter(a -> alignsGroupUUID.equals(a.getUuid()))
					.findFirst();
			
			Table alignmentsTable = buildTable(
					alignments, 
					action, 
					EngineeringPackage.Literals.ALIGNABLE__ALIGNS, 
					context, 
					progressMonitor, 
					createColumnBuilder(EngineeringPackage.Literals.ALIGNMENT__AIM),
					createColumnBuilder(NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION),
					createColumnBuilder(EngineeringPackage.Literals.ALIGNMENT__WEIGHT));
			alignmentsActionOptional.get().getContent().add(alignmentsTable);
		}
	}	
		
}
