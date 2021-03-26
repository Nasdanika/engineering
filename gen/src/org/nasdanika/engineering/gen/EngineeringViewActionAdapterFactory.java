package org.nasdanika.engineering.gen;

import org.nasdanika.common.Context;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.emf.InstanceAdapterFactory;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Product;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.emf.ViewAction;

/**
 * Provides adapters for the Engineering model elements.
 * @author Pavel
 *
 */
public class EngineeringViewActionAdapterFactory extends ComposedAdapterFactory {
	
	public EngineeringViewActionAdapterFactory(Action parent, Context context) {		
		// Registering adapter factories.
		registerAdapterFactory(
			new InstanceAdapterFactory<Context>(
				EngineeringPackage.Literals.MODEL_ELEMENT, 
				Context.class, 
				this.getClass().getClassLoader(), 
				context));
				
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, Persona>(
				EngineeringPackage.Literals.PERSONA, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				PersonaViewAction::new));
				
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, Engineer>(
				EngineeringPackage.Literals.ENGINEER, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				EngineerViewAction::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, Organization>(
				EngineeringPackage.Literals.ORGANIZATION, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				org -> new OrganizationViewAction(org, parent)));					
				
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, org.nasdanika.engineering.Module>(
				EngineeringPackage.Literals.MODULE, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				ModuleViewAction::new));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, Product>(
				EngineeringPackage.Literals.PRODUCT, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				ProductViewAction::new));					
		
	}

}
