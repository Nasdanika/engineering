package org.nasdanika.engineering.gen;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.Context;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.emf.InstanceAdapterFactory;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.Release;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.emf.ViewAction;

/**
 * Provides adapters for the Engineering model elements.
 * @author Pavel
 *
 */
public class EngineeringViewActionAdapterFactory extends ComposedAdapterFactory {
	
	private Map<EObject, Diagnostic> diagnosticMap;

	public EngineeringViewActionAdapterFactory(Context context, Map<EObject, Diagnostic> diagnosticMap) {		
		this.diagnosticMap = diagnosticMap;
		
		// Registering adapter factories.
		registerAdapterFactory(
			new InstanceAdapterFactory<Context>(
				EngineeringPackage.Literals.MODEL_ELEMENT, 
				Context.class, 
				this.getClass().getClassLoader(), 
				context));
				
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Persona>, Persona>(
				EngineeringPackage.Literals.PERSONA, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new PersonaViewAction<Persona>(obj, this)));
				
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Engineer>, Engineer>(
				EngineeringPackage.Literals.ENGINEER, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new EngineerViewAction<Engineer>(obj, this)));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Organization>, Organization>(
				EngineeringPackage.Literals.ORGANIZATION, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				org -> new OrganizationViewAction(org, this)));					
				
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<org.nasdanika.engineering.Module>, org.nasdanika.engineering.Module>(
				EngineeringPackage.Literals.MODULE, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new ModuleViewAction<org.nasdanika.engineering.Module>(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Product>, Product>(
				EngineeringPackage.Literals.PRODUCT, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new ProductViewAction(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Issue>, Issue>(
				EngineeringPackage.Literals.ISSUE, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new IssueViewAction(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Increment>, Increment>(
				EngineeringPackage.Literals.INCREMENT, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new IncrementViewAction(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<IssueCategory>, IssueCategory>(
				EngineeringPackage.Literals.ISSUE_CATEGORY, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new IssueCategoryViewAction(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<IssueStatus>, IssueStatus>(
				EngineeringPackage.Literals.ISSUE_STATUS, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new IssueStatusViewAction(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Release>, Release>(
				EngineeringPackage.Literals.RELEASE, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new ReleaseViewAction(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Feature>, Feature>(
				EngineeringPackage.Literals.FEATURE, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new FeatureViewAction(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Goal>, Goal>(
				EngineeringPackage.Literals.GOAL, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new GoalViewAction(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Principle>, Principle>(
				EngineeringPackage.Literals.PRINCIPLE, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new PrincipleViewAction(obj, this)));					
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected <T extends EObject> Class<ViewAction<T>> getViewActionClass() {
		return (Class) ViewAction.class;
	}
	
	/**
	 * @param resource
	 * @return Resource path to use the case of multi-resource models.
	 */
	public String resolveResourcePath(Resource resource) {
		return null;
	}
	
	/**
	 * @return Parent action for top-level actions.
	 */
	public Action getParent() {
		return null;
	}
	
	public Map<EObject, Diagnostic> getDiagnosticMap() {
		return diagnosticMap;
	}
	
}
