package org.nasdanika.engineering.gen;

import java.util.function.Function;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.Context;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.emf.InstanceAdapterFactory;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
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
	
	public EngineeringViewActionAdapterFactory(Action parent, Function<Resource, String> resourcePathResolver, Context context) {		
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
				obj -> new PersonaViewAction<Persona>(obj, resourcePathResolver)));
				
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, Engineer>(
				EngineeringPackage.Literals.ENGINEER, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				obj -> new EngineerViewAction<Engineer>(obj, resourcePathResolver)));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, Organization>(
				EngineeringPackage.Literals.ORGANIZATION, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				org -> new OrganizationViewAction(org, resourcePathResolver, parent)));					
				
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, org.nasdanika.engineering.Module>(
				EngineeringPackage.Literals.MODULE, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				obj -> new ModuleViewAction<org.nasdanika.engineering.Module>(obj, resourcePathResolver)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, Product>(
				EngineeringPackage.Literals.PRODUCT, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				obj -> new ProductViewAction(obj, resourcePathResolver)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, Issue>(
				EngineeringPackage.Literals.ISSUE, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				obj -> new IssueViewAction(obj, resourcePathResolver)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, Increment>(
				EngineeringPackage.Literals.INCREMENT, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				obj -> new IncrementViewAction(obj, resourcePathResolver)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction, IssueCategory>(
				EngineeringPackage.Literals.ISSUE_CATEGORY, 
				ViewAction.class, 
				this.getClass().getClassLoader(), 
				obj -> new IssueCategoryViewAction(obj, resourcePathResolver)));					
		
	}
	
}
