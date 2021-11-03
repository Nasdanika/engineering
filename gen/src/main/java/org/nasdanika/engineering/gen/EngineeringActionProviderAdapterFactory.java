package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.Context;
import org.nasdanika.emf.DiagnosticProvider;
import org.nasdanika.emf.DiagnosticProviderAdapter;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Persona;
import org.nasdanika.html.flow.FlowActionProviderAdapterFactory;
import org.nasdanika.html.model.app.util.ActionProvider;

/**
 * Provides adapters for the Ecore types - {@link EPackage}, {@link EClass}, {@link EStructuralFeature}, {@link EOperation}, ...
 * @author Pavel
 *
 */
public class EngineeringActionProviderAdapterFactory extends FlowActionProviderAdapterFactory {
	
	public EngineeringActionProviderAdapterFactory(Context context) {
		super(context);
		
		// Registering adapter factories.
		registerAdapterFactory(
			new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Persona>(
				EngineeringPackage.Literals.PERSONA, 
				ActionProvider.class, 
				this.getClass().getClassLoader(), 
				e -> new PersonaActionProvider<Persona>(e, context)));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Engineer>(
					EngineeringPackage.Literals.ENGINEER, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new EngineerActionProvider<Engineer>(e, context)));
			
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Organization>(
					EngineeringPackage.Literals.ORGANIZATION, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new OrganizationActionProvider(e, context)));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Module>(
					EngineeringPackage.Literals.MODULE, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new ModuleActionProvider<org.nasdanika.engineering.Module>(e, context)));
	
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Product>(
					EngineeringPackage.Literals.PRODUCT, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new ProductActionProvider(e, context)));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Goal>(
					EngineeringPackage.Literals.GOAL, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new GoalActionProvider(e, context)));
			
	}
			
	@Override
	public Adapter adaptNew(Notifier target, Object type) {
		if (type == DiagnosticProvider.class) {
			return new DiagnosticProviderAdapter(target, this::getDiagnostic, this::getFeatureDiagnostic);
		}
		return super.adaptNew(target, type);
	}
	
	@Override
	public boolean isFactoryForType(Object type) {
		return super.isFactoryForType(type) || type == DiagnosticProvider.class;
	}
	
	protected Collection<Diagnostic> getDiagnostic(Notifier target) {
		return Collections.emptyList();
	}

	protected Collection<Diagnostic> getFeatureDiagnostic(Notifier target, EStructuralFeature feature) {
		return Collections.emptyList();
	}
	
}
