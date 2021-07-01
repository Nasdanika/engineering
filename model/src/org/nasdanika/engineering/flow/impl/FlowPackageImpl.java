/**
 */
package org.nasdanika.engineering.flow.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.engineering.EngineeringPackage;

import org.nasdanika.engineering.flow.Activity;
import org.nasdanika.engineering.flow.Call;
import org.nasdanika.engineering.flow.Choice;
import org.nasdanika.engineering.flow.End;
import org.nasdanika.engineering.flow.EntryPoint;
import org.nasdanika.engineering.flow.ExitPoint;
import org.nasdanika.engineering.flow.ExpansionInput;
import org.nasdanika.engineering.flow.ExpansionOutput;
import org.nasdanika.engineering.flow.FlowFactory;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.flow.Fork;
import org.nasdanika.engineering.flow.InputPin;
import org.nasdanika.engineering.flow.Join;
import org.nasdanika.engineering.flow.Journey;
import org.nasdanika.engineering.flow.JourneyElement;
import org.nasdanika.engineering.flow.OutputPin;
import org.nasdanika.engineering.flow.PseudoState;
import org.nasdanika.engineering.flow.Service;
import org.nasdanika.engineering.flow.Start;
import org.nasdanika.engineering.flow.Transition;

import org.nasdanika.engineering.flow.util.FlowValidator;

import org.nasdanika.engineering.impl.EngineeringPackageImpl;

import org.nasdanika.engineering.representation.RepresentationPackage;

import org.nasdanika.engineering.representation.impl.RepresentationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowPackageImpl extends EPackageImpl implements FlowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyElementEClass = null;

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
	private EClass serviceEClass = null;

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
	private EClass journeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

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
	 * @see org.nasdanika.engineering.flow.FlowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlowPackageImpl() {
		super(eNS_URI, FlowFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FlowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlowPackage init() {
		if (isInited) return (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFlowPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FlowPackageImpl theFlowPackage = registeredFlowPackage instanceof FlowPackageImpl ? (FlowPackageImpl)registeredFlowPackage : new FlowPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI);
		EngineeringPackageImpl theEngineeringPackage = (EngineeringPackageImpl)(registeredPackage instanceof EngineeringPackageImpl ? registeredPackage : EngineeringPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI);
		RepresentationPackageImpl theRepresentationPackage = (RepresentationPackageImpl)(registeredPackage instanceof RepresentationPackageImpl ? registeredPackage : RepresentationPackage.eINSTANCE);

		// Create package meta-data objects
		theFlowPackage.createPackageContents();
		theEngineeringPackage.createPackageContents();
		theRepresentationPackage.createPackageContents();

		// Initialize created meta-data
		theFlowPackage.initializePackageContents();
		theEngineeringPackage.initializePackageContents();
		theRepresentationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFlowPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return FlowValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFlowPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlowPackage.eNS_URI, theFlowPackage);
		return theFlowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJourneyElement() {
		return journeyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyElement_Outputs() {
		return (EReference)journeyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyElement_Calls() {
		return (EReference)journeyElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyElement_Requirements() {
		return (EReference)journeyElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyElement_Deliverables() {
		return (EReference)journeyElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyElement_Personas() {
		return (EReference)journeyElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyElement_Overrides() {
		return (EReference)journeyElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyElement_OverridenBy() {
		return (EReference)journeyElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJourneyElement_Modifiers() {
		return (EAttribute)journeyElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJourneyElement__GetInputs__EList() {
		return journeyElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJourneyElement__GetInvocations__EList() {
		return journeyElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJourneyElement__GetAllInputs__EList() {
		return journeyElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJourneyElement__GetAllInvocations__EList() {
		return journeyElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJourneyElement__GetAllOutputs__EList() {
		return journeyElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJourneyElement__GetAllCalls__EList() {
		return journeyElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJourneyElement__Overrides__JourneyElement() {
		return journeyElementEClass.getEOperations().get(6);
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
	public EReference getActivity_Features() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Services() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Target() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
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
	public EReference getTransition_Payload() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Suppress() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Target() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetTarget__EList() {
		return transitionEClass.getEOperations().get(0);
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
	public EClass getJourney() {
		return journeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourney_Elements() {
		return (EReference)journeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourney_Extends() {
		return (EReference)journeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourney_Extensions() {
		return (EReference)journeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourney_Root() {
		return (EReference)journeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourney_AllElements() {
		return (EReference)journeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPseudoState() {
		return pseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPseudoState_Type() {
		return (EAttribute)pseudoStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntryPoint() {
		return entryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExitPoint() {
		return exitPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpansionInput() {
		return expansionInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpansionOutput() {
		return expansionOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFork() {
		return forkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputPin() {
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputPin() {
		return outputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowFactory getFlowFactory() {
		return (FlowFactory)getEFactoryInstance();
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
		journeyElementEClass = createEClass(JOURNEY_ELEMENT);
		createEReference(journeyElementEClass, JOURNEY_ELEMENT__OUTPUTS);
		createEReference(journeyElementEClass, JOURNEY_ELEMENT__CALLS);
		createEReference(journeyElementEClass, JOURNEY_ELEMENT__REQUIREMENTS);
		createEReference(journeyElementEClass, JOURNEY_ELEMENT__DELIVERABLES);
		createEReference(journeyElementEClass, JOURNEY_ELEMENT__PERSONAS);
		createEReference(journeyElementEClass, JOURNEY_ELEMENT__OVERRIDES);
		createEReference(journeyElementEClass, JOURNEY_ELEMENT__OVERRIDEN_BY);
		createEAttribute(journeyElementEClass, JOURNEY_ELEMENT__MODIFIERS);
		createEOperation(journeyElementEClass, JOURNEY_ELEMENT___GET_INPUTS__ELIST);
		createEOperation(journeyElementEClass, JOURNEY_ELEMENT___GET_INVOCATIONS__ELIST);
		createEOperation(journeyElementEClass, JOURNEY_ELEMENT___GET_ALL_INPUTS__ELIST);
		createEOperation(journeyElementEClass, JOURNEY_ELEMENT___GET_ALL_INVOCATIONS__ELIST);
		createEOperation(journeyElementEClass, JOURNEY_ELEMENT___GET_ALL_OUTPUTS__ELIST);
		createEOperation(journeyElementEClass, JOURNEY_ELEMENT___GET_ALL_CALLS__ELIST);
		createEOperation(journeyElementEClass, JOURNEY_ELEMENT___OVERRIDES__JOURNEYELEMENT);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__FEATURES);
		createEReference(activityEClass, ACTIVITY__SERVICES);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__TARGET);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__PAYLOAD);
		createEAttribute(transitionEClass, TRANSITION__SUPPRESS);
		createEAttribute(transitionEClass, TRANSITION__TARGET);
		createEOperation(transitionEClass, TRANSITION___GET_TARGET__ELIST);

		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__RESPONSE);

		journeyEClass = createEClass(JOURNEY);
		createEReference(journeyEClass, JOURNEY__ELEMENTS);
		createEReference(journeyEClass, JOURNEY__EXTENDS);
		createEReference(journeyEClass, JOURNEY__EXTENSIONS);
		createEReference(journeyEClass, JOURNEY__ROOT);
		createEReference(journeyEClass, JOURNEY__ALL_ELEMENTS);

		pseudoStateEClass = createEClass(PSEUDO_STATE);
		createEAttribute(pseudoStateEClass, PSEUDO_STATE__TYPE);

		choiceEClass = createEClass(CHOICE);

		endEClass = createEClass(END);

		entryPointEClass = createEClass(ENTRY_POINT);

		exitPointEClass = createEClass(EXIT_POINT);

		expansionInputEClass = createEClass(EXPANSION_INPUT);

		expansionOutputEClass = createEClass(EXPANSION_OUTPUT);

		forkEClass = createEClass(FORK);

		inputPinEClass = createEClass(INPUT_PIN);

		joinEClass = createEClass(JOIN);

		outputPinEClass = createEClass(OUTPUT_PIN);

		startEClass = createEClass(START);
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

		// Obtain other dependent packages
		EngineeringPackage theEngineeringPackage = (EngineeringPackage)EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		journeyElementEClass.getESuperTypes().add(theEngineeringPackage.getEngineeredElement());
		activityEClass.getESuperTypes().add(this.getJourneyElement());
		serviceEClass.getESuperTypes().add(this.getJourneyElement());
		transitionEClass.getESuperTypes().add(theEngineeringPackage.getNamedElement());
		callEClass.getESuperTypes().add(this.getTransition());
		journeyEClass.getESuperTypes().add(this.getActivity());
		pseudoStateEClass.getESuperTypes().add(this.getJourneyElement());
		choiceEClass.getESuperTypes().add(this.getPseudoState());
		endEClass.getESuperTypes().add(this.getPseudoState());
		entryPointEClass.getESuperTypes().add(this.getPseudoState());
		exitPointEClass.getESuperTypes().add(this.getPseudoState());
		expansionInputEClass.getESuperTypes().add(this.getPseudoState());
		expansionOutputEClass.getESuperTypes().add(this.getPseudoState());
		forkEClass.getESuperTypes().add(this.getPseudoState());
		inputPinEClass.getESuperTypes().add(this.getPseudoState());
		joinEClass.getESuperTypes().add(this.getPseudoState());
		outputPinEClass.getESuperTypes().add(this.getPseudoState());
		startEClass.getESuperTypes().add(this.getPseudoState());

		// Initialize classes, features, and operations; add parameters
		initEClass(journeyElementEClass, JourneyElement.class, "JourneyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJourneyElement_Outputs(), this.getTransition(), null, "outputs", null, 0, -1, JourneyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyElement_Calls(), this.getCall(), null, "calls", null, 0, -1, JourneyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyElement_Requirements(), theEngineeringPackage.getNamedElement(), null, "requirements", null, 0, -1, JourneyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyElement_Deliverables(), theEngineeringPackage.getNamedElement(), null, "deliverables", null, 0, -1, JourneyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyElement_Personas(), theEngineeringPackage.getPersona(), theEngineeringPackage.getPersona_JourneyElements(), "personas", null, 0, -1, JourneyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyElement_Overrides(), this.getJourneyElement(), this.getJourneyElement_OverridenBy(), "overrides", null, 0, 1, JourneyElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyElement_OverridenBy(), this.getJourneyElement(), this.getJourneyElement_Overrides(), "overridenBy", null, 0, -1, JourneyElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneyElement_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, JourneyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getJourneyElement__GetInputs__EList(), this.getTransition(), "getInputs", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJourney(), "journeyPath", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJourneyElement__GetInvocations__EList(), this.getCall(), "getInvocations", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJourney(), "journeyPath", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJourneyElement__GetAllInputs__EList(), this.getTransition(), "getAllInputs", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJourney(), "journeyPath", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJourneyElement__GetAllInvocations__EList(), this.getCall(), "getAllInvocations", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJourney(), "journeyPath", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJourneyElement__GetAllOutputs__EList(), this.getTransition(), "getAllOutputs", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJourney(), "journeyPath", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJourneyElement__GetAllCalls__EList(), this.getCall(), "getAllCalls", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJourney(), "journeyPath", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJourneyElement__Overrides__JourneyElement(), ecorePackage.getEBoolean(), "overrides", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJourneyElement(), "journeyElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Features(), theEngineeringPackage.getFeature(), theEngineeringPackage.getFeature_Uses(), "features", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Services(), this.getService(), this.getService_Target(), "services", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Target(), this.getActivity(), this.getActivity_Services(), "target", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Payload(), theEngineeringPackage.getNamedElement(), null, "payload", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Suppress(), ecorePackage.getEBoolean(), "suppress", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Target(), ecorePackage.getEString(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTransition__GetTarget__EList(), this.getJourneyElement(), "getTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJourney(), "journeyPath", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Response(), theEngineeringPackage.getNamedElement(), null, "response", null, 0, -1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyEClass, Journey.class, "Journey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJourney_Elements(), this.getJourneyElement(), null, "elements", null, 0, -1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourney_Extends(), this.getJourney(), this.getJourney_Extensions(), "extends", null, 0, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourney_Extensions(), this.getJourney(), this.getJourney_Extends(), "extensions", null, 0, -1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJourney_Root(), this.getJourney(), null, "root", null, 0, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJourney_AllElements(), this.getJourneyElement(), null, "allElements", null, 0, -1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pseudoStateEClass, PseudoState.class, "PseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPseudoState_Type(), ecorePackage.getEString(), "type", null, 0, 1, PseudoState.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryPointEClass, EntryPoint.class, "EntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitPointEClass, ExitPoint.class, "ExitPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expansionInputEClass, ExpansionInput.class, "ExpansionInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expansionOutputEClass, ExpansionOutput.class, "ExpansionOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// urn:org.nasdanika
		createUrnorgAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
		  (journeyElementEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/journey-element.md"
		   });
		addAnnotation
		  (getJourneyElement_Outputs(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getJourneyElement_Calls(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/activity.md"
		   });
		addAnnotation
		  (serviceEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/service.md"
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/transition.md"
		   });
		addAnnotation
		  (getTransition_Target(),
		   source,
		   new String[] {
			   "default-feature", "true"
		   });
		addAnnotation
		  (callEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/call.md"
		   });
		addAnnotation
		  (journeyEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/journey.md"
		   });
		addAnnotation
		  (pseudoStateEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/pseudo-state.md"
		   });
		addAnnotation
		  (choiceEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/choice.md"
		   });
		addAnnotation
		  (endEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/end.md"
		   });
		addAnnotation
		  (entryPointEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/entry-point.md"
		   });
		addAnnotation
		  (exitPointEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/exit-point.md"
		   });
		addAnnotation
		  (expansionInputEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/expansion-input.md"
		   });
		addAnnotation
		  (expansionOutputEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/expansion-output.md"
		   });
		addAnnotation
		  (forkEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/fork.md"
		   });
		addAnnotation
		  (inputPinEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/input-pin.md"
		   });
		addAnnotation
		  (joinEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/join.md"
		   });
		addAnnotation
		  (outputPinEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/output-pin.md"
		   });
		addAnnotation
		  (startEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/start.md"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (journeyElementEClass,
		   source,
		   new String[] {
			   "constraints", "final override suppress suppressAndOverride"
		   });
		addAnnotation
		  (serviceEClass,
		   source,
		   new String[] {
			   "constraints", "abstract"
		   });
		addAnnotation
		  (journeyEClass,
		   source,
		   new String[] {
			   "constraints", "final abstract elements"
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
		  (getJourneyElement__GetInputs__EList(),
		   source,
		   new String[] {
			   "documentation", "Transitions which have this journey element as its target in a given journey path. "
		   });
		addAnnotation
		  ((getJourneyElement__GetInputs__EList()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "Journey nesting path to resolve transitions target elements. May be different from the containment path in the case of nested journeys of extended journeys."
		   });
		addAnnotation
		  (getJourneyElement__GetInvocations__EList(),
		   source,
		   new String[] {
			   "documentation", "Calls which have this journey element as its target in a given journey path. "
		   });
		addAnnotation
		  ((getJourneyElement__GetInvocations__EList()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "Journey nesting path to resolve calls target elements. May be different from the containment path in the case of nested journeys of extended journeys."
		   });
		addAnnotation
		  (getJourneyElement__GetAllInputs__EList(),
		   source,
		   new String[] {
			   "documentation", "Opposite to all outputs, i.e. all inbound transitions, in a given journey path."
		   });
		addAnnotation
		  ((getJourneyElement__GetAllInputs__EList()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "Journey nesting path to resolve transitions target elements. May be different from the containment path in the case of nested journeys of extended journeys."
		   });
		addAnnotation
		  (getJourneyElement__GetAllInvocations__EList(),
		   source,
		   new String[] {
			   "documentation", "Opposite to all calls, i.e. all incoming calls, in a given journey path."
		   });
		addAnnotation
		  ((getJourneyElement__GetAllInvocations__EList()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "Journey nesting path to resolve calls target elements. May be different from the containment path in the case of nested journeys of extended journeys."
		   });
		addAnnotation
		  (getJourneyElement__GetAllOutputs__EList(),
		   source,
		   new String[] {
			   "documentation", "Includes own outputs and outputs inherited from the base journey of the containing journey. This element outputs override inherited outputs with the same path."
		   });
		addAnnotation
		  ((getJourneyElement__GetAllOutputs__EList()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "Journey nesting path to resolve transitions target elements. May be different from the containment path in the case of nested journeys of extended journeys."
		   });
		addAnnotation
		  (getJourneyElement__GetAllCalls__EList(),
		   source,
		   new String[] {
			   "documentation", "Includes own calls and calls inherited from the base journey of the containing journey. This element calls override inherited calls with the same path."
		   });
		addAnnotation
		  ((getJourneyElement__GetAllCalls__EList()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "Journey nesting path to resolve calls target elements. May be different from the containment path in the case of nested journeys of extended journeys."
		   });
		addAnnotation
		  (getJourneyElement__Overrides__JourneyElement(),
		   source,
		   new String[] {
			   "documentation", "Returns ``true`` if this journey element directly or transitively overrided the argument journey element."
		   });
		addAnnotation
		  (getJourneyElement_Outputs(),
		   source,
		   new String[] {
			   "documentation", "Activity outbound transitions to other activities."
		   });
		addAnnotation
		  (getJourneyElement_Calls(),
		   source,
		   new String[] {
			   "documentation", "Calls to other activities."
		   });
		addAnnotation
		  (getJourneyElement_Requirements(),
		   source,
		   new String[] {
			   "documentation", "Input artifacts required to start working on this activity."
		   });
		addAnnotation
		  (getJourneyElement_Deliverables(),
		   source,
		   new String[] {
			   "documentation", "Output artifacts of the activity."
		   });
		addAnnotation
		  (getJourneyElement_Personas(),
		   source,
		   new String[] {
			   "documentation", "Personas performing this journey element if it is an activity. Applies to all journey elements in order to group them into persona partitions."
		   });
		addAnnotation
		  (getJourneyElement_Overrides(),
		   source,
		   new String[] {
			   "documentation", "A journey element which is overriden by this element. "
		   });
		addAnnotation
		  (getJourneyElement_OverridenBy(),
		   source,
		   new String[] {
			   "documentation", "Elements of the extension journeys which override this element."
		   });
		addAnnotation
		  (getJourneyElement_Modifiers(),
		   source,
		   new String[] {
			   "documentation", "A collection of boolean flags:\n\n* ``abstract`` - Specifies that this journey element is abstract. For journeys it means that they contain abstract elements and must be extended to become concrete. If a journey contains abstract elements and does not have abstract modifier, it is diagnosed as an error. If concrete journeys extend abstract journeys they must override (implement) all abstract elements.\n* ``explicit-end`` - Applies to [journeys](Journey.html). Specifies that the [end](End.html) [pseudo-state](PseudoState.html) shall not be inferred by finding journey elements with no outputs. End will either be explicitly specified or the diagram will not have an end pseudo-state.\n* ``explicit-start`` - Applies to journeys. Specifies that the [start](Start.html) pseudo-state shall not be inferred by finding journey elements with no inputs. Start will either be explicitly specified or the diagram will not have a start pseudo-state.\n* ``final`` - Specifies that this journey element cannot be overriden in journeys extending this journey. Overriding a final elemen will be diagnosed as an error. For example, in an organization some processes can be defined as journeys at higher levels of the orgnization and extended at lower levels. ``final`` modifier allows to specify what can be extended and what cannot. Specifying a top-level journey as final indicates that it cannot have extensions.\n* ``optional`` - Specifies that this journey element is optional. Optional elements have different apperance on diagrams.\n* ``override`` - Specifies that this journey element overrides an element in one of extended journeys. If this modifier is present and overrides reference is null, then it results in a diagnostic error.\n* ``partition`` - Applies to journeys and specifies that the journey shall be rendered as a partition on a digarm.\n* ``suppress`` - Specifies that this element supprresses its overriden element, i.e. removes it from the list of journey elements.\n* ``vertical`` - Specifies that journey element direction top-down instead of the default left-to-right.\n"
		   });
		addAnnotation
		  (getActivity_Features(),
		   source,
		   new String[] {
			   "documentation", "Product features used by this activity."
		   });
		addAnnotation
		  (getActivity_Services(),
		   source,
		   new String[] {
			   "documentation", "Derived opposite to Service target."
		   });
		addAnnotation
		  (getService_Target(),
		   source,
		   new String[] {
			   "documentation", "Target activity of the service."
		   });
		addAnnotation
		  (getTransition__GetTarget__EList(),
		   source,
		   new String[] {
			   "documentation", "Resolves transition\'s target journey element for a given journey."
		   });
		addAnnotation
		  ((getTransition__GetTarget__EList()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "Journey nesting path to resolve target element for. May be different from the containment path in the case of nested journeys of extended journeys."
		   });
		addAnnotation
		  (getTransition_Payload(),
		   source,
		   new String[] {
			   "documentation", "Artifacts passed from source to target activity."
		   });
		addAnnotation
		  (getTransition_Suppress(),
		   source,
		   new String[] {
			   "documentation", "Can be used in journeys extending other journeys to remove the inherited transition from the list of outputs/call. Transitions to supprressed journey elements are automatically supppressed."
		   });
		addAnnotation
		  (getTransition_Target(),
		   source,
		   new String[] {
			   "documentation", "Relative path to the target [journey element](JourneyElement.html). May contain ``..`` to navigate to the parent [journey](Journey.html) - i.e. the journey which contains the journey containing the element which contains this transition. May contain ``/`` to navigate to nested journeys. Treated as URI if contains ``:``."
		   });
		addAnnotation
		  (getCall_Response(),
		   source,
		   new String[] {
			   "documentation", "Response artifacts passed back from the target to the source activity."
		   });
		addAnnotation
		  (getJourney_Elements(),
		   source,
		   new String[] {
			   "documentation", "Elements of this journey."
		   });
		addAnnotation
		  (getJourney_Extends(),
		   source,
		   new String[] {
			   "documentation", "Journey can  extend another journey and inherit its elements. Inherited elements can be overriden or suppressed."
		   });
		addAnnotation
		  (getJourney_Extensions(),
		   source,
		   new String[] {
			   "documentation", "Journeys extending this journey."
		   });
		addAnnotation
		  (getJourney_Root(),
		   source,
		   new String[] {
			   "documentation", "Root of this journey inheritance hierarchy."
		   });
		addAnnotation
		  (getJourney_AllElements(),
		   source,
		   new String[] {
			   "documentation", "Own and inherited elements."
		   });
		addAnnotation
		  (getPseudoState_Type(),
		   source,
		   new String[] {
			   "documentation", "Pseudo-state type provided by concrete sub-classes."
		   });
	}

} //FlowPackageImpl
