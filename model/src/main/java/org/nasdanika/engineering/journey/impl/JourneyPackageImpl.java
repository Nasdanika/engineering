/**
 */
package org.nasdanika.engineering.journey.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.diagram.DiagramPackage;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.impl.EngineeringPackageImpl;
import org.nasdanika.engineering.journey.Activity;
import org.nasdanika.engineering.journey.Journey;
import org.nasdanika.engineering.journey.JourneyFactory;
import org.nasdanika.engineering.journey.JourneyPackage;
import org.nasdanika.engineering.journey.util.JourneyValidator;
import org.nasdanika.exec.ExecPackage;
import org.nasdanika.flow.FlowPackage;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JourneyPackageImpl extends EPackageImpl implements JourneyPackage {
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
	 * @see org.nasdanika.engineering.journey.JourneyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JourneyPackageImpl() {
		super(eNS_URI, JourneyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JourneyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JourneyPackage init() {
		if (isInited) return (JourneyPackage)EPackage.Registry.INSTANCE.getEPackage(JourneyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJourneyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JourneyPackageImpl theJourneyPackage = registeredJourneyPackage instanceof JourneyPackageImpl ? (JourneyPackageImpl)registeredJourneyPackage : new JourneyPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DiagramPackage.eINSTANCE.eClass();
		ExecPackage.eINSTANCE.eClass();
		FlowPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI);
		EngineeringPackageImpl theEngineeringPackage = (EngineeringPackageImpl)(registeredPackage instanceof EngineeringPackageImpl ? registeredPackage : EngineeringPackage.eINSTANCE);

		// Create package meta-data objects
		theJourneyPackage.createPackageContents();
		theEngineeringPackage.createPackageContents();

		// Initialize created meta-data
		theJourneyPackage.initializePackageContents();
		theEngineeringPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theJourneyPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return JourneyValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theJourneyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JourneyPackage.eNS_URI, theJourneyPackage);
		return theJourneyPackage;
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
	public EClass getJourney() {
		return journeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JourneyFactory getJourneyFactory() {
		return (JourneyFactory)getEFactoryInstance();
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
		activityEClass = createEClass(ACTIVITY);

		journeyEClass = createEClass(JOURNEY);
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
		FlowPackage theFlowPackage = (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theFlowPackage.getActivity());
		EGenericType g2 = createEGenericType(this.getActivity());
		g1.getETypeArguments().add(g2);
		activityEClass.getEGenericSuperTypes().add(g1);
		journeyEClass.getESuperTypes().add(theFlowPackage.getFlow());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(journeyEClass, Journey.class, "Journey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// urn:org.nasdanika
		createUrnorgAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
			   "documentation-reference", "doc/journey/package-summary.md"
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/activity.md"
		   });
		addAnnotation
		  (journeyEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/flow/journey.md"
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
		  (journeyEClass,
		   source,
		   new String[] {
			   "constraints", "final abstract elements"
		   });
	}

} //JourneyPackageImpl
