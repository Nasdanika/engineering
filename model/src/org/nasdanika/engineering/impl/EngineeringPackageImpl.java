/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.common.Adaptable;

import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.Artifact;
import org.nasdanika.engineering.Call;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringFactory;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Journey;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineeringPackageImpl extends EPackageImpl implements EngineeringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeredElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.engineering.EngineeringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EngineeringPackageImpl() {
		super(eNS_URI, EngineeringFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EngineeringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EngineeringPackage init() {
		if (isInited) return (EngineeringPackage)EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEngineeringPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EngineeringPackageImpl theEngineeringPackage = registeredEngineeringPackage instanceof EngineeringPackageImpl ? (EngineeringPackageImpl)registeredEngineeringPackage : new EngineeringPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEngineeringPackage.createPackageContents();

		// Initialize created meta-data
		theEngineeringPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEngineeringPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EngineeringPackage.eNS_URI, theEngineeringPackage);
		return theEngineeringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdaptable() {
		return adaptableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Id() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Path() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Description() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Actions() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Resources() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEngineeredElement() {
		return engineeredElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElement_Issues() {
		return (EReference)engineeredElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElement_Owner() {
		return (EReference)engineeredElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersona() {
		return personaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEngineer() {
		return engineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Modules() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Owns() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Increments() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Services() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Personas() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_Engineers() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Modules() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Releases() {
		return (EReference)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Features() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Activities() {
		return (EReference)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncrement() {
		return incrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncrement_Children() {
		return (EReference)incrementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncrement_Start() {
		return (EAttribute)incrementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncrement_End() {
		return (EAttribute)incrementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelease() {
		return releaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelease_Increment() {
		return (EReference)releaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Release() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Persona() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Outputs() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_ActivityType() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Requirements() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Deliverables() {
		return (EReference)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Calls() {
		return (EReference)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJourney() {
		return journeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourney_Activities() {
		return (EReference)journeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJourney_Partition() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Payload() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Description() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCall_Response() {
		return (EReference)callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssue() {
		return issueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Children() {
		return (EReference)issueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Assignee() {
		return (EReference)issueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Dependencies() {
		return (EReference)issueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_PlannedFor() {
		return (EReference)issueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_ContributesTo() {
		return (EReference)issueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectory() {
		return directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectory_Elements() {
		return (EReference)directoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringFactory getEngineeringFactory() {
		return (EngineeringFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adaptableEClass = createEClass(ADAPTABLE);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ID);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__PATH);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEReference(modelElementEClass, MODEL_ELEMENT__ACTIONS);
		createEReference(modelElementEClass, MODEL_ELEMENT__RESOURCES);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		engineeredElementEClass = createEClass(ENGINEERED_ELEMENT);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__ISSUES);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__OWNER);

		personaEClass = createEClass(PERSONA);

		engineerEClass = createEClass(ENGINEER);
		createEReference(engineerEClass, ENGINEER__MODULES);
		createEReference(engineerEClass, ENGINEER__OWNS);
		createEReference(engineerEClass, ENGINEER__INCREMENTS);
		createEReference(engineerEClass, ENGINEER__SERVICES);
		createEReference(engineerEClass, ENGINEER__PERSONAS);

		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__ENGINEERS);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODULES);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__RELEASES);
		createEReference(productEClass, PRODUCT__FEATURES);
		createEReference(productEClass, PRODUCT__ACTIVITIES);

		incrementEClass = createEClass(INCREMENT);
		createEReference(incrementEClass, INCREMENT__CHILDREN);
		createEAttribute(incrementEClass, INCREMENT__START);
		createEAttribute(incrementEClass, INCREMENT__END);

		releaseEClass = createEClass(RELEASE);
		createEReference(releaseEClass, RELEASE__INCREMENT);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__RELEASE);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__PERSONA);
		createEReference(activityEClass, ACTIVITY__OUTPUTS);
		createEAttribute(activityEClass, ACTIVITY__ACTIVITY_TYPE);
		createEReference(activityEClass, ACTIVITY__REQUIREMENTS);
		createEReference(activityEClass, ACTIVITY__DELIVERABLES);
		createEReference(activityEClass, ACTIVITY__CALLS);

		journeyEClass = createEClass(JOURNEY);
		createEReference(journeyEClass, JOURNEY__ACTIVITIES);
		createEAttribute(journeyEClass, JOURNEY__PARTITION);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__PAYLOAD);
		createEAttribute(transitionEClass, TRANSITION__NAME);
		createEAttribute(transitionEClass, TRANSITION__DESCRIPTION);

		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__RESPONSE);

		issueEClass = createEClass(ISSUE);
		createEReference(issueEClass, ISSUE__CHILDREN);
		createEReference(issueEClass, ISSUE__ASSIGNEE);
		createEReference(issueEClass, ISSUE__DEPENDENCIES);
		createEReference(issueEClass, ISSUE__PLANNED_FOR);
		createEReference(issueEClass, ISSUE__CONTRIBUTES_TO);

		artifactEClass = createEClass(ARTIFACT);

		directoryEClass = createEClass(DIRECTORY);
		createEReference(directoryEClass, DIRECTORY__ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelElementEClass.getESuperTypes().add(this.getAdaptable());
		namedElementEClass.getESuperTypes().add(this.getModelElement());
		engineeredElementEClass.getESuperTypes().add(this.getNamedElement());
		personaEClass.getESuperTypes().add(this.getEngineeredElement());
		engineerEClass.getESuperTypes().add(this.getPersona());
		organizationEClass.getESuperTypes().add(this.getEngineer());
		moduleEClass.getESuperTypes().add(this.getEngineeredElement());
		productEClass.getESuperTypes().add(this.getModule());
		incrementEClass.getESuperTypes().add(this.getNamedElement());
		featureEClass.getESuperTypes().add(this.getNamedElement());
		activityEClass.getESuperTypes().add(this.getEngineeredElement());
		journeyEClass.getESuperTypes().add(this.getActivity());
		callEClass.getESuperTypes().add(this.getTransition());
		artifactEClass.getESuperTypes().add(this.getEngineeredElement());
		directoryEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(adaptableEClass, Adaptable.class, "Adaptable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Path(), ecorePackage.getEString(), "path", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Actions(), ecorePackage.getEObject(), null, "actions", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Resources(), this.getNamedElement(), null, "resources", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineeredElementEClass, EngineeredElement.class, "EngineeredElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeredElement_Issues(), this.getIssue(), null, "issues", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_Owner(), this.getEngineer(), null, "owner", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(engineerEClass, Engineer.class, "Engineer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineer_Modules(), this.getModule(), null, "modules", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Owns(), this.getModule(), null, "owns", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Increments(), this.getIncrement(), null, "increments", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Services(), this.getActivity(), null, "services", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Personas(), this.getPersona(), null, "personas", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_Engineers(), this.getEngineer(), null, "engineers", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, org.nasdanika.engineering.Module.class, "Module", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Modules(), this.getModule(), null, "modules", null, 0, -1, org.nasdanika.engineering.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Releases(), this.getRelease(), null, "releases", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Features(), this.getFeature(), null, "features", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Activities(), this.getActivity(), null, "activities", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incrementEClass, Increment.class, "Increment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncrement_Children(), this.getIncrement(), null, "children", null, 0, -1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncrement_Start(), ecorePackage.getEDate(), "start", null, 0, 1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncrement_End(), ecorePackage.getEDate(), "end", null, 0, 1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelease_Increment(), this.getIncrement(), null, "increment", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Release(), this.getRelease(), null, "release", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Persona(), this.getPersona(), null, "persona", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Outputs(), this.getTransition(), null, "outputs", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_ActivityType(), ecorePackage.getEString(), "activityType", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Requirements(), this.getArtifact(), null, "requirements", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Deliverables(), this.getArtifact(), null, "deliverables", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Calls(), this.getCall(), null, "calls", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyEClass, Journey.class, "Journey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJourney_Activities(), this.getActivity(), null, "activities", null, 0, -1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Partition(), ecorePackage.getEBoolean(), "partition", null, 0, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Target(), this.getActivity(), null, "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Payload(), this.getArtifact(), null, "payload", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Description(), ecorePackage.getEString(), "description", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Response(), this.getArtifact(), null, "response", null, 0, -1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssue_Children(), this.getIssue(), null, "children", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Assignee(), this.getEngineer(), null, "assignee", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Dependencies(), this.getRelease(), null, "dependencies", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_PlannedFor(), this.getRelease(), null, "plannedFor", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_ContributesTo(), this.getFeature(), null, "contributesTo", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directoryEClass, Directory.class, "Directory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectory_Elements(), this.getNamedElement(), null, "elements", null, 0, -1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:org.nasdanika
		createUrnorgAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation-reference", "doc/engineering.md"
		   });
		addAnnotation
		  (modelElementEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/model-element.md"
		   });
		addAnnotation
		  (getModelElement_Path(),
		   source,
		   new String[] {
			   "load-key", "path"
		   });
		addAnnotation
		  (namedElementEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/named-element.md"
		   });
		addAnnotation
		  (engineeredElementEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/engineered-element.md"
		   });
		addAnnotation
		  (engineerEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/engineer.md"
		   });
		addAnnotation
		  (moduleEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/module.md"
		   });
		addAnnotation
		  (productEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/product.md",
			   "type-code", "d"
		   });
		addAnnotation
		  (getProduct_Activities(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (releaseEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/release.md"
		   });
		addAnnotation
		  (featureEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/feature.md"
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/activity.md"
		   });
		addAnnotation
		  (journeyEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/journey.md"
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/transition.md"
		   });
		addAnnotation
		  (getTransition_Target(),
		   source,
		   new String[] {
			   "default-feature", "true"
		   });
		addAnnotation
		  (issueEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/issue.md"
		   });
		addAnnotation
		  (artifactEClass,
		   source,
		   new String[] {
			   "documentation-reference", "../doc/artifact.md"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getModelElement_Id(),
		   source,
		   new String[] {
			   "documentation", "Element\'s unique ID. Derived from element type and containment path (parent ID)."
		   });
		addAnnotation
		  (getModelElement_Path(),
		   source,
		   new String[] {
			   "documentation", "Element\'s path to form full element URL. Shall be unique in the containing collection. If blank, derived from element\'s position in the collection or from the local ID. For named elements can be derived from element name.\nElement URL is formed by adding ``.html`` extension to the path if the model element\'s EClass doesn\'t have containment references and as such the element may not have children, and by adding ``/index.html`` otherwise."
		   });
		addAnnotation
		  (getModelElement_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getNamedElement_Name(),
		   source,
		   new String[] {
			   "documentation", "Element name."
		   });
		addAnnotation
		  (getProduct_Activities(),
		   source,
		   new String[] {
			   "documentation", "Product journeys define how to use a particular product and its features."
		   });
		addAnnotation
		  (getActivity_ActivityType(),
		   source,
		   new String[] {
			   "documentation", "Pseudo-activity (stereo)type. One of:\n\n* choice\n* fork\n* join\n* entryPoint\n* exitPoint\n* inputPin\n* outputPin\n* expansionInput\n* expansionOutput\n* end\n\nPseudo-activities name is not shown on the diagram, they are not clickable, and they are not listed as journey children.\n\nSee [PlantUML State Diagram](https://plantuml.com/state-diagram) for more details."
		   });
		addAnnotation
		  (getJourney_Partition(),
		   source,
		   new String[] {
			   "documentation", "If true, journey is visualized as a composite state on its parent journey diagram. If false, it is visualized as a simple state."
		   });
		addAnnotation
		  (getTransition_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
	}

} //EngineeringPackageImpl
