/**
 */
package org.nasdanika.engineering.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Artifact;
import org.nasdanika.engineering.Call;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeringAppearance;
import org.nasdanika.engineering.EngineeringFactory;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.FeatureAppearance;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.Journey;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.engineering.Note;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.Topic;
import org.nasdanika.engineering.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineeringFactoryImpl extends EFactoryImpl implements EngineeringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EngineeringFactory init() {
		try {
			EngineeringFactory theEngineeringFactory = (EngineeringFactory)EPackage.Registry.INSTANCE.getEFactory(EngineeringPackage.eNS_URI);
			if (theEngineeringFactory != null) {
				return theEngineeringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EngineeringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EngineeringPackage.ENDEAVOR: return createEndeavor();
			case EngineeringPackage.INCREMENT: return createIncrement();
			case EngineeringPackage.ISSUE_CATEGORY: return createIssueCategory();
			case EngineeringPackage.ISSUE_STATUS: return createIssueStatus();
			case EngineeringPackage.ISSUE: return createIssue();
			case EngineeringPackage.NOTE: return createNote();
			case EngineeringPackage.PERSONA: return createPersona();
			case EngineeringPackage.ENGINEER: return createEngineer();
			case EngineeringPackage.ORGANIZATION: return createOrganization();
			case EngineeringPackage.MODULE: return createModule();
			case EngineeringPackage.PRODUCT: return createProduct();
			case EngineeringPackage.CAPABILITY: return createCapability();
			case EngineeringPackage.ENGINEERED_CAPABILITY: return createEngineeredCapability();
			case EngineeringPackage.RELEASE: return createRelease();
			case EngineeringPackage.FEATURE: return createFeature();
			case EngineeringPackage.ACTIVITY: return createActivity();
			case EngineeringPackage.JOURNEY: return createJourney();
			case EngineeringPackage.TRANSITION: return createTransition();
			case EngineeringPackage.CALL: return createCall();
			case EngineeringPackage.ARTIFACT: return createArtifact();
			case EngineeringPackage.DIRECTORY: return createDirectory();
			case EngineeringPackage.CAPACITY: return createCapacity();
			case EngineeringPackage.ALLOCATION: return createAllocation();
			case EngineeringPackage.AIM: return createAim();
			case EngineeringPackage.PRINCIPLE: return createPrinciple();
			case EngineeringPackage.ALIGNMENT: return createAlignment();
			case EngineeringPackage.GOAL: return createGoal();
			case EngineeringPackage.FORUM: return createForum();
			case EngineeringPackage.MESSAGE: return createMessage();
			case EngineeringPackage.TOPIC: return createTopic();
			case EngineeringPackage.ENGINEERING_APPEARANCE: return createEngineeringAppearance();
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE: return createModelElementAppearance();
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE_ENTRY: return (EObject)createModelElementAppearanceEntry();
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY: return (EObject)createFeatureAppearanceEntry();
			case EngineeringPackage.FEATURE_APPEARANCE: return createFeatureAppearance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Endeavor createEndeavor() {
		EndeavorImpl endeavor = new EndeavorImpl();
		return endeavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Persona createPersona() {
		PersonaImpl persona = new PersonaImpl();
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Engineer createEngineer() {
		EngineerImpl engineer = new EngineerImpl();
		return engineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.engineering.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeredCapability createEngineeredCapability() {
		EngineeredCapabilityImpl engineeredCapability = new EngineeredCapabilityImpl();
		return engineeredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Increment createIncrement() {
		IncrementImpl increment = new IncrementImpl();
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueCategory createIssueCategory() {
		IssueCategoryImpl issueCategory = new IssueCategoryImpl();
		return issueCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueStatus createIssueStatus() {
		IssueStatusImpl issueStatus = new IssueStatusImpl();
		return issueStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Journey createJourney() {
		JourneyImpl journey = new JourneyImpl();
		return journey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Issue createIssue() {
		IssueImpl issue = new IssueImpl();
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directory createDirectory() {
		DirectoryImpl directory = new DirectoryImpl();
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capacity createCapacity() {
		CapacityImpl capacity = new CapacityImpl();
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Allocation createAllocation() {
		AllocationImpl allocation = new AllocationImpl();
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aim createAim() {
		AimImpl aim = new AimImpl();
		return aim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Principle createPrinciple() {
		PrincipleImpl principle = new PrincipleImpl();
		return principle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alignment createAlignment() {
		AlignmentImpl alignment = new AlignmentImpl();
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Forum createForum() {
		ForumImpl forum = new ForumImpl();
		return forum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringAppearance createEngineeringAppearance() {
		EngineeringAppearanceImpl engineeringAppearance = new EngineeringAppearanceImpl();
		return engineeringAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelElementAppearance createModelElementAppearance() {
		ModelElementAppearanceImpl modelElementAppearance = new ModelElementAppearanceImpl();
		return modelElementAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ModelElementAppearance> createModelElementAppearanceEntry() {
		ModelElementAppearanceEntryImpl modelElementAppearanceEntry = new ModelElementAppearanceEntryImpl();
		return modelElementAppearanceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, FeatureAppearance> createFeatureAppearanceEntry() {
		FeatureAppearanceEntryImpl featureAppearanceEntry = new FeatureAppearanceEntryImpl();
		return featureAppearanceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureAppearance createFeatureAppearance() {
		FeatureAppearanceImpl featureAppearance = new FeatureAppearanceImpl();
		return featureAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringPackage getEngineeringPackage() {
		return (EngineeringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EngineeringPackage getPackage() {
		return EngineeringPackage.eINSTANCE;
	}

} //EngineeringFactoryImpl
