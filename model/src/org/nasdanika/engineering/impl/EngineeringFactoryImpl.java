/**
 */
package org.nasdanika.engineering.impl;

import java.time.Duration;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Appearance;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Decision;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.PackageAppearance;
import org.nasdanika.engineering.Period;
import org.nasdanika.engineering.EngineeringFactory;
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
import org.nasdanika.engineering.MemberAppearance;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.NamedElementReference;
import org.nasdanika.engineering.Note;
import org.nasdanika.engineering.Objective;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.TableOfContents;
import org.nasdanika.engineering.Temporal;
import org.nasdanika.engineering.Topic;
import org.nasdanika.html.app.SectionStyle;

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
			case EngineeringPackage.TABLE_OF_CONTENTS: return createTableOfContents();
			case EngineeringPackage.TEMPORAL: return createTemporal();
			case EngineeringPackage.PERIOD: return createPeriod();
			case EngineeringPackage.NAMED_ELEMENT: return createNamedElement();
			case EngineeringPackage.EVENT: return createEvent();
			case EngineeringPackage.ENDEAVOR: return createEndeavor();
			case EngineeringPackage.INCREMENT: return createIncrement();
			case EngineeringPackage.ISSUE_CATEGORY: return createIssueCategory();
			case EngineeringPackage.ISSUE_STATUS: return createIssueStatus();
			case EngineeringPackage.ISSUE_PRIORITY: return createIssuePriority();
			case EngineeringPackage.ISSUE_SEVERITY: return createIssueSeverity();
			case EngineeringPackage.ISSUE: return createIssue();
			case EngineeringPackage.NOTE: return createNote();
			case EngineeringPackage.DOCUMENT: return createDocument();
			case EngineeringPackage.PERSONA: return createPersona();
			case EngineeringPackage.ENGINEER: return createEngineer();
			case EngineeringPackage.ORGANIZATION: return createOrganization();
			case EngineeringPackage.MODULE: return createModule();
			case EngineeringPackage.PRODUCT: return createProduct();
			case EngineeringPackage.CAPABILITY: return createCapability();
			case EngineeringPackage.ENGINEERED_CAPABILITY: return createEngineeredCapability();
			case EngineeringPackage.RELEASE: return createRelease();
			case EngineeringPackage.FEATURE: return createFeature();
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
			case EngineeringPackage.PACKAGE_APPEARANCE: return createPackageAppearance();
			case EngineeringPackage.PACKAGE_APPEARANCE_ENTRY: return (EObject)createPackageAppearanceEntry();
			case EngineeringPackage.APPEARANCE: return createAppearance();
			case EngineeringPackage.APPEARANCE_ENTRY: return (EObject)createAppearanceEntry();
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE: return createModelElementAppearance();
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE_ENTRY: return (EObject)createModelElementAppearanceEntry();
			case EngineeringPackage.MEMBER_APPEARANCE_ENTRY: return (EObject)createMemberAppearanceEntry();
			case EngineeringPackage.MEMBER_APPEARANCE: return createMemberAppearance();
			case EngineeringPackage.NAMED_ELEMENT_REFERENCE: return createNamedElementReference();
			case EngineeringPackage.LINK: return createLink();
			case EngineeringPackage.KEY_RESULT: return createKeyResult();
			case EngineeringPackage.OBJECTIVE: return createObjective();
			case EngineeringPackage.DECISION: return createDecision();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EngineeringPackage.DURATION:
				return createDurationFromString(eDataType, initialValue);
			case EngineeringPackage.SECTION_STYLE:
				return createSectionStyleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EngineeringPackage.DURATION:
				return convertDurationToString(eDataType, instanceValue);
			case EngineeringPackage.SECTION_STYLE:
				return convertSectionStyleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableOfContents createTableOfContents() {
		TableOfContentsImpl tableOfContents = new TableOfContentsImpl();
		return tableOfContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal createTemporal() {
		TemporalImpl temporal = new TemporalImpl();
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
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
	public IssuePriority createIssuePriority() {
		IssuePriorityImpl issuePriority = new IssuePriorityImpl();
		return issuePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueSeverity createIssueSeverity() {
		IssueSeverityImpl issueSeverity = new IssueSeverityImpl();
		return issueSeverity;
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
	public PackageAppearance createPackageAppearance() {
		PackageAppearanceImpl packageAppearance = new PackageAppearanceImpl();
		return packageAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, PackageAppearance> createPackageAppearanceEntry() {
		PackageAppearanceEntryImpl packageAppearanceEntry = new PackageAppearanceEntryImpl();
		return packageAppearanceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appearance createAppearance() {
		AppearanceImpl appearance = new AppearanceImpl();
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Appearance> createAppearanceEntry() {
		AppearanceEntryImpl appearanceEntry = new AppearanceEntryImpl();
		return appearanceEntry;
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
	public Map.Entry<String, MemberAppearance> createMemberAppearanceEntry() {
		MemberAppearanceEntryImpl memberAppearanceEntry = new MemberAppearanceEntryImpl();
		return memberAppearanceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberAppearance createMemberAppearance() {
		MemberAppearanceImpl memberAppearance = new MemberAppearanceImpl();
		return memberAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElementReference createNamedElementReference() {
		NamedElementReferenceImpl namedElementReference = new NamedElementReferenceImpl();
		return namedElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyResult createKeyResult() {
		KeyResultImpl keyResult = new KeyResultImpl();
		return keyResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objective createObjective() {
		ObjectiveImpl objective = new ObjectiveImpl();
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDurationFromString(EDataType eDataType, String initialValue) {
		return (Duration)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionStyle createSectionStyleFromString(EDataType eDataType, String initialValue) {
		return (SectionStyle)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSectionStyleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
