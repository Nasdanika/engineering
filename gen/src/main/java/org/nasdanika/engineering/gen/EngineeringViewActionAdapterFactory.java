package org.nasdanika.engineering.gen;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.Context;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.MarkingYamlConstructor;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.emf.InstanceAdapterFactory;
import org.nasdanika.emf.persistence.EObjectLoader;
import org.nasdanika.engineering.Decision;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Event;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssuePriority;
import org.nasdanika.engineering.IssueSeverity;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.engineering.Link;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.engineering.NamedElementReference;
import org.nasdanika.engineering.Objective;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.PackageAppearance;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.Temporal;
import org.nasdanika.engineering.Topic;
import org.nasdanika.engineering.flow.Activity;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.flow.Journey;
import org.nasdanika.engineering.flow.Service;
import org.nasdanika.engineering.gen.flow.ActivityViewAction;
import org.nasdanika.engineering.gen.flow.JourneyElementViewAction;
import org.nasdanika.engineering.gen.flow.JourneyViewAction;
import org.nasdanika.engineering.gen.flow.ServiceViewAction;
import org.nasdanika.engineering.gen.representation.ComponentDiagramViewAction;
import org.nasdanika.engineering.representation.ComponentDiagram;
import org.nasdanika.engineering.representation.RepresentationPackage;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.emf.ViewAction;
import org.yaml.snakeyaml.Yaml;

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
				obj -> new IssueViewAction<Issue>(obj, this)));					
		
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
			new FunctionAdapterFactory<ViewAction<IssuePriority>, IssuePriority>(
				EngineeringPackage.Literals.ISSUE_PRIORITY, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new IssuePriorityViewAction(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<IssueSeverity>, IssueSeverity>(
				EngineeringPackage.Literals.ISSUE_SEVERITY, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new IssueSeverityViewAction(obj, this)));					
		
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
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Forum>, Forum>(
				EngineeringPackage.Literals.FORUM, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new ForumViewAction<Forum>(obj, this)));					
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Topic>, Topic>(
				EngineeringPackage.Literals.TOPIC, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new TopicViewAction(obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Document>, Document>(
				EngineeringPackage.Literals.DOCUMENT, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new DocumentViewAction(obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Directory>, Directory>(
				EngineeringPackage.Literals.DIRECTORY, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new DirectoryViewAction(obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<NamedElementReference>, NamedElementReference>(
				EngineeringPackage.Literals.NAMED_ELEMENT_REFERENCE, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new NamedElementReferenceViewAction(obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Link>, Link>(
				EngineeringPackage.Literals.LINK, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new LinkViewAction(obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<KeyResult>, KeyResult>(
				EngineeringPackage.Literals.KEY_RESULT, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new KeyResultViewAction<KeyResult>(obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Objective>, Objective>(
				EngineeringPackage.Literals.OBJECTIVE, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new ObjectiveViewAction(obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Decision>, Decision>(
				EngineeringPackage.Literals.DECISION, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new DecisionViewAction(obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Event>, Event>(
				EngineeringPackage.Literals.EVENT, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new EventViewAction(obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Temporal>, Temporal>(
				EngineeringPackage.Literals.TEMPORAL, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new TemporalViewAction(obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Activity>, Activity>(
				FlowPackage.Literals.ACTIVITY, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new ActivityViewAction<Activity>(obj.getContainmentJourneyPath(), obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Service>, Service>(
				FlowPackage.Literals.SERVICE, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new ServiceViewAction(obj.getContainmentJourneyPath(), obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewAction<Journey>, Journey>(
				FlowPackage.Literals.JOURNEY, 
				getViewActionClass(), 
				this.getClass().getClassLoader(), 
				obj -> new JourneyViewAction(obj.getContainmentJourneyPath(), obj, this)));

		// Providers		
		registerAdapterFactory(
			new FunctionAdapterFactory<JourneyElementViewActionProvider<ActivityViewAction<Activity>>, Activity>(
				FlowPackage.Literals.ACTIVITY, 
				getJourneyElementViewActionProviderClass(), 
				this.getClass().getClassLoader(), 
				obj -> journeyPath -> new ActivityViewAction<Activity>(journeyPath, obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<JourneyElementViewActionProvider<ServiceViewAction>, Service>(
				FlowPackage.Literals.SERVICE, 
				getJourneyElementViewActionProviderClass(), 
				this.getClass().getClassLoader(), 
				obj -> journeyPath -> new ServiceViewAction(journeyPath, obj, this)));			
		
		registerAdapterFactory(
			new FunctionAdapterFactory<JourneyElementViewActionProvider<JourneyViewAction>, Journey>(
				FlowPackage.Literals.JOURNEY, 
				getJourneyElementViewActionProviderClass(), 
				this.getClass().getClassLoader(), 
				obj -> journeyPath -> new JourneyViewAction(journeyPath, obj, this)));			
				
		// --- Representations ---
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ViewAction<ComponentDiagram>, ComponentDiagram>(
					RepresentationPackage.Literals.COMPONENT_DIAGRAM, 
					getViewActionClass(), 
					this.getClass().getClassLoader(), 
					obj -> new ComponentDiagramViewAction(obj, this)));			
		
				
		// Loading appearances from URL's
		appearanceMap = new HashMap<>();
		EObjectLoader loader = new EObjectLoader(EngineeringPackage.eINSTANCE);
		NullProgressMonitor progressMonitor = new NullProgressMonitor();
		try {
			for (URL appearanceURL: getAppearanceLocations()) {
				Yaml yaml = MarkingYamlConstructor.createMarkingYaml(appearanceURL.toString());		
					Object asf = loader.create(
							loader, 
							EngineeringPackage.Literals.PACKAGE_APPEARANCE, 
							yaml.load(appearanceURL.openStream()), 
							appearanceURL, 
							progressMonitor, 
							null, 
							null);
					SupplierFactory<PackageAppearance> appearanceSupplierFactory = Util.<PackageAppearance>asSupplierFactory(asf);
					PackageAppearance appearanceElement = Util.call(appearanceSupplierFactory.create(Context.EMPTY_CONTEXT), progressMonitor, null);
					addAppearance(EngineeringPackage.eINSTANCE, appearanceElement);
			}
		} catch (Exception e) {
			throw new NasdanikaException(e);
		}		
	}
	
	private void addAppearance(EPackage ePackage, PackageAppearance appearanceElement) {
		List<java.util.function.Function<String, ModelElementAppearance>> appearance = new ArrayList<>();
		appearance.add(appearanceElement.getModelElements()::get);
		appearanceMap.put(ePackage, appearance);
		for (EPackage subPackage: ePackage.getESubpackages()) {
			PackageAppearance subAppearance = appearanceElement.getSubPackages().get(Util.camelToKebab(subPackage.getName()));
			if (subAppearance != null) {
				addAppearance(subPackage, subAppearance);
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected <T extends EObject> Class<ViewAction<T>> getViewActionClass() {
		return (Class) ViewAction.class;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected <T extends JourneyElementViewAction<?>> Class<JourneyElementViewActionProvider<T>> getJourneyElementViewActionProviderClass() {
		return (Class) JourneyElementViewActionProvider.class;
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
	
	/**
	 * Map of EPackage namespace URI to appearance list.
	 */
	private Map<EPackage, List<java.util.function.Function<String, ModelElementAppearance>>> appearanceMap;
	
	protected List<URL> getAppearanceLocations() {
		return Collections.singletonList(EngineeringViewActionAdapterFactory.class.getResource("default-appearance.yml"));
	}
	
	/**
	 * @return Chain of appearance mappings.
	 */
	protected java.util.function.Function<EPackage, List<java.util.function.Function<String, ModelElementAppearance>>> getAppearance() {
		return appearanceMap::get;
	}
	
	/**
	 * Override to customize appearance. 
	 * @return Appearance chain for {@link ModelElement} {@link EClass} 
	 */
	public List<ModelElementAppearance> getAppearance(EClass eClass) {		
		List<ModelElementAppearance> ret = new ArrayList<>();		
		List<Function<String, ModelElementAppearance>> packageAppearance = getAppearance().apply(eClass.getEPackage());
		if (packageAppearance != null) {
			for (java.util.function.Function<String, ModelElementAppearance> appearance: packageAppearance) {
				ModelElementAppearance mea = appearance.apply(Util.camelToKebab(eClass.getName()));
				if (mea != null) {
					ret.add(mea);
				}
			}
		}
		return ret;
	}
	
}
