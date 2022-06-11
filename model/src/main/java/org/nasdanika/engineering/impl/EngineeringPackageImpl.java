/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.diagram.DiagramPackage;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignable;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Connection;
import org.nasdanika.engineering.ConnectionSource;
import org.nasdanika.engineering.ConnectionTarget;
import org.nasdanika.engineering.Decision;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.Domain;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeredElementStatus;
import org.nasdanika.engineering.EngineeringFactory;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Event;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Interface;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssuePriority;
import org.nasdanika.engineering.IssueSeverity;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.engineering.Link;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.NamedElementReference;
import org.nasdanika.engineering.Note;
import org.nasdanika.engineering.Objective;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.ProductOrganization;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.Representation;
import org.nasdanika.engineering.TableOfContents;
import org.nasdanika.engineering.Topic;
import org.nasdanika.engineering.journey.JourneyPackage;
import org.nasdanika.engineering.journey.impl.JourneyPackageImpl;
import org.nasdanika.engineering.util.EngineeringValidator;
import org.nasdanika.exec.ExecPackage;
import org.nasdanika.flow.FlowPackage;
import org.nasdanika.ncore.NcorePackage;

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
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableOfContentsEClass = null;

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
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endeavorEClass = null;

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
	private EClass engineeredElementStatusEClass = null;

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
	private EClass domainEClass = null;

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
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeredCapabilityEClass = null;

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
	private EClass issueCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issuePriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueSeverityEClass = null;

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
	private EClass issueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alignableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

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

		// Initialize simple dependencies
		DiagramPackage.eINSTANCE.eClass();
		ExecPackage.eINSTANCE.eClass();
		FlowPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JourneyPackage.eNS_URI);
		JourneyPackageImpl theJourneyPackage = (JourneyPackageImpl)(registeredPackage instanceof JourneyPackageImpl ? registeredPackage : JourneyPackage.eINSTANCE);

		// Create package meta-data objects
		theEngineeringPackage.createPackageContents();
		theJourneyPackage.createPackageContents();

		// Initialize created meta-data
		theEngineeringPackage.initializePackageContents();
		theJourneyPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEngineeringPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return EngineeringValidator.INSTANCE;
				 }
			 });

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
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Path() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Resources() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Documentation() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_TableOfContents() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Sections() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Representations() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepresentation() {
		return representationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepresentation_Generator() {
		return (EReference)representationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableOfContents() {
		return tableOfContentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOfContents_Depth() {
		return (EAttribute)tableOfContentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOfContents_Role() {
		return (EAttribute)tableOfContentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOfContents_Header() {
		return (EAttribute)tableOfContentsEClass.getEStructuralFeatures().get(2);
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
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndeavor() {
		return endeavorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndeavor_Completion() {
		return (EAttribute)endeavorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndeavor_Benefit() {
		return (EAttribute)endeavorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndeavor_TotalCost() {
		return (EAttribute)endeavorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndeavor_Assignee() {
		return (EReference)endeavorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndeavor_AllIssues() {
		return (EReference)endeavorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndeavor_Capacity() {
		return (EReference)endeavorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndeavor_Objectives() {
		return (EReference)endeavorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndeavor_LinkedObjectives() {
		return (EReference)endeavorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndeavor_AllObjectives() {
		return (EReference)endeavorEClass.getEStructuralFeatures().get(8);
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
	public EReference getEngineeredElement_Owners() {
		return (EReference)engineeredElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElement_Experts() {
		return (EReference)engineeredElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElement_Allocations() {
		return (EReference)engineeredElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElement_Principles() {
		return (EReference)engineeredElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElement_AllIssues() {
		return (EReference)engineeredElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElement_Status() {
		return (EReference)engineeredElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEngineeredElementStatus() {
		return engineeredElementStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElementStatus_Children() {
		return (EReference)engineeredElementStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElementStatus_Elements() {
		return (EReference)engineeredElementStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElementStatus_ElementStyle() {
		return (EReference)engineeredElementStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElementStatus_ConnectionStyle() {
		return (EReference)engineeredElementStatusEClass.getEStructuralFeatures().get(3);
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
	public EReference getPersona_Goals() {
		return (EReference)personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Representatives() {
		return (EReference)personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Extends() {
		return (EReference)personaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Extensions() {
		return (EReference)personaEClass.getEStructuralFeatures().get(3);
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
	public EReference getEngineer_Expertise() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Increments() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Services() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Personas() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Assignments() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_IssueCategories() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_IssueStatuses() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_IssuePriorities() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_IssueSeverities() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEngineer_Rate() {
		return (EAttribute)engineerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Designations() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Capacity() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Represents() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Messages() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Objectives() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Domains() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_EngineeredElementStatuses() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomain_Elements() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
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
	public EReference getModule_Dependencies() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Dependants() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Interfaces() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
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
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_RequiredBy() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapability_Available() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEngineeredCapability() {
		return engineeredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredCapability_Releases() {
		return (EReference)engineeredCapabilityEClass.getEStructuralFeatures().get(0);
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
	public EReference getIncrement_Issues() {
		return (EReference)incrementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncrement_Releases() {
		return (EReference)incrementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssueCategory() {
		return issueCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueCategory_Weight() {
		return (EAttribute)issueCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssueCategory_Issues() {
		return (EReference)issueCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueCategory_Cumulative() {
		return (EAttribute)issueCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssueCategory_Allocations() {
		return (EReference)issueCategoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssueCategory_Children() {
		return (EReference)issueCategoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssueStatus() {
		return issueStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssueStatus_Issues() {
		return (EReference)issueStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueStatus_Done() {
		return (EAttribute)issueStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssuePriority() {
		return issuePriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssuePriority_Issues() {
		return (EReference)issuePriorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssueSeverity() {
		return issueSeverityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssueSeverity_Issues() {
		return (EReference)issueSeverityEClass.getEStructuralFeatures().get(0);
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
	public EReference getRelease_Capabilities() {
		return (EReference)releaseEClass.getEStructuralFeatures().get(1);
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
	public EReference getFeature_Issues() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Children() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
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
	public EReference getIssue_Requires() {
		return (EReference)issueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Increment() {
		return (EReference)issueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_ContributesTo() {
		return (EReference)issueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Status() {
		return (EReference)issueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Workable() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Effort() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Cost() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_RemainingEffort() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_RemainingCost() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Priority() {
		return (EReference)issueEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Severity() {
		return (EReference)issueEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Notes() {
		return (EReference)issueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Categories() {
		return (EReference)issueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Target() {
		return (EReference)issueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNote_Author() {
		return (EReference)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Date() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Effort() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Cost() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_RemainingEffort() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_RemainingCost() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNote_Status() {
		return (EReference)noteEClass.getEStructuralFeatures().get(6);
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
	public EClass getCapacity() {
		return capacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapacity_Endeavor() {
		return (EReference)capacityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapacity_Effort() {
		return (EAttribute)capacityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapacity_Funds() {
		return (EAttribute)capacityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapacity_Rate() {
		return (EAttribute)capacityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocation_Engineer() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocation_Category() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlignable() {
		return alignableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlignable_Aligns() {
		return (EReference)alignableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAim() {
		return aimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAim_Alignments() {
		return (EReference)aimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrinciple() {
		return principleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrinciple_Children() {
		return (EReference)principleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlignment() {
		return alignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlignment_Aim() {
		return (EReference)alignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlignment_Weight() {
		return (EAttribute)alignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoal_Children() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForum() {
		return forumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForum_Discussion() {
		return (EReference)forumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForum_Topics() {
		return (EReference)forumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTopic_Messages() {
		return (EReference)topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElementReference() {
		return namedElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamedElementReference_Target() {
		return (EReference)namedElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Target() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyResult() {
		return keyResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyResult_Weight() {
		return (EAttribute)keyResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyResult_Completion() {
		return (EAttribute)keyResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKeyResult_Initiatives() {
		return (EReference)keyResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjective() {
		return objectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjective_Endeavor() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjective_KeyResults() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjective_Children() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjective_Parent() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjective_LinkedObjectives() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjective_SubObjectives() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_EffectiveStart() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_EffectiveEnd() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Supercedes() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_SupercededBy() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_Resolution() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductOrganization() {
		return productOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOrganization_Releases() {
		return (EReference)productOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOrganization_Features() {
		return (EReference)productOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionSource() {
		return connectionSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionSource_OutboundConnections() {
		return (EReference)connectionSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Target() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionTarget() {
		return connectionTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionTarget_InboundConnections() {
		return (EReference)connectionTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_Children() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Date() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_Author() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
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
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__PATH);
		createEReference(modelElementEClass, MODEL_ELEMENT__RESOURCES);
		createEReference(modelElementEClass, MODEL_ELEMENT__DOCUMENTATION);
		createEReference(modelElementEClass, MODEL_ELEMENT__TABLE_OF_CONTENTS);
		createEReference(modelElementEClass, MODEL_ELEMENT__SECTIONS);
		createEReference(modelElementEClass, MODEL_ELEMENT__REPRESENTATIONS);

		representationEClass = createEClass(REPRESENTATION);
		createEReference(representationEClass, REPRESENTATION__GENERATOR);

		tableOfContentsEClass = createEClass(TABLE_OF_CONTENTS);
		createEAttribute(tableOfContentsEClass, TABLE_OF_CONTENTS__ROLE);
		createEAttribute(tableOfContentsEClass, TABLE_OF_CONTENTS__DEPTH);
		createEAttribute(tableOfContentsEClass, TABLE_OF_CONTENTS__HEADER);

		namedElementEClass = createEClass(NAMED_ELEMENT);

		eventEClass = createEClass(EVENT);

		alignableEClass = createEClass(ALIGNABLE);
		createEReference(alignableEClass, ALIGNABLE__ALIGNS);

		endeavorEClass = createEClass(ENDEAVOR);
		createEAttribute(endeavorEClass, ENDEAVOR__COMPLETION);
		createEAttribute(endeavorEClass, ENDEAVOR__BENEFIT);
		createEAttribute(endeavorEClass, ENDEAVOR__TOTAL_COST);
		createEReference(endeavorEClass, ENDEAVOR__ASSIGNEE);
		createEReference(endeavorEClass, ENDEAVOR__ALL_ISSUES);
		createEReference(endeavorEClass, ENDEAVOR__CAPACITY);
		createEReference(endeavorEClass, ENDEAVOR__OBJECTIVES);
		createEReference(endeavorEClass, ENDEAVOR__LINKED_OBJECTIVES);
		createEReference(endeavorEClass, ENDEAVOR__ALL_OBJECTIVES);

		incrementEClass = createEClass(INCREMENT);
		createEReference(incrementEClass, INCREMENT__CHILDREN);
		createEReference(incrementEClass, INCREMENT__ISSUES);
		createEReference(incrementEClass, INCREMENT__RELEASES);

		issueCategoryEClass = createEClass(ISSUE_CATEGORY);
		createEAttribute(issueCategoryEClass, ISSUE_CATEGORY__WEIGHT);
		createEReference(issueCategoryEClass, ISSUE_CATEGORY__ISSUES);
		createEAttribute(issueCategoryEClass, ISSUE_CATEGORY__CUMULATIVE);
		createEReference(issueCategoryEClass, ISSUE_CATEGORY__ALLOCATIONS);
		createEReference(issueCategoryEClass, ISSUE_CATEGORY__CHILDREN);

		issueStatusEClass = createEClass(ISSUE_STATUS);
		createEReference(issueStatusEClass, ISSUE_STATUS__ISSUES);
		createEAttribute(issueStatusEClass, ISSUE_STATUS__DONE);

		issuePriorityEClass = createEClass(ISSUE_PRIORITY);
		createEReference(issuePriorityEClass, ISSUE_PRIORITY__ISSUES);

		issueSeverityEClass = createEClass(ISSUE_SEVERITY);
		createEReference(issueSeverityEClass, ISSUE_SEVERITY__ISSUES);

		issueEClass = createEClass(ISSUE);
		createEReference(issueEClass, ISSUE__CHILDREN);
		createEReference(issueEClass, ISSUE__REQUIRES);
		createEReference(issueEClass, ISSUE__INCREMENT);
		createEReference(issueEClass, ISSUE__CONTRIBUTES_TO);
		createEReference(issueEClass, ISSUE__NOTES);
		createEReference(issueEClass, ISSUE__CATEGORIES);
		createEReference(issueEClass, ISSUE__TARGET);
		createEReference(issueEClass, ISSUE__STATUS);
		createEAttribute(issueEClass, ISSUE__WORKABLE);
		createEAttribute(issueEClass, ISSUE__EFFORT);
		createEAttribute(issueEClass, ISSUE__COST);
		createEAttribute(issueEClass, ISSUE__REMAINING_EFFORT);
		createEAttribute(issueEClass, ISSUE__REMAINING_COST);
		createEReference(issueEClass, ISSUE__PRIORITY);
		createEReference(issueEClass, ISSUE__SEVERITY);

		noteEClass = createEClass(NOTE);
		createEReference(noteEClass, NOTE__AUTHOR);
		createEAttribute(noteEClass, NOTE__DATE);
		createEAttribute(noteEClass, NOTE__EFFORT);
		createEAttribute(noteEClass, NOTE__COST);
		createEAttribute(noteEClass, NOTE__REMAINING_EFFORT);
		createEAttribute(noteEClass, NOTE__REMAINING_COST);
		createEReference(noteEClass, NOTE__STATUS);

		forumEClass = createEClass(FORUM);
		createEReference(forumEClass, FORUM__DISCUSSION);
		createEReference(forumEClass, FORUM__TOPICS);

		engineeredElementEClass = createEClass(ENGINEERED_ELEMENT);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__ISSUES);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__OWNERS);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__EXPERTS);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__ALLOCATIONS);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__PRINCIPLES);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__ALL_ISSUES);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__STATUS);

		engineeredElementStatusEClass = createEClass(ENGINEERED_ELEMENT_STATUS);
		createEReference(engineeredElementStatusEClass, ENGINEERED_ELEMENT_STATUS__CHILDREN);
		createEReference(engineeredElementStatusEClass, ENGINEERED_ELEMENT_STATUS__ELEMENTS);
		createEReference(engineeredElementStatusEClass, ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE);
		createEReference(engineeredElementStatusEClass, ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE);

		documentEClass = createEClass(DOCUMENT);

		personaEClass = createEClass(PERSONA);
		createEReference(personaEClass, PERSONA__GOALS);
		createEReference(personaEClass, PERSONA__REPRESENTATIVES);
		createEReference(personaEClass, PERSONA__EXTENDS);
		createEReference(personaEClass, PERSONA__EXTENSIONS);

		engineerEClass = createEClass(ENGINEER);
		createEReference(engineerEClass, ENGINEER__MODULES);
		createEReference(engineerEClass, ENGINEER__OWNS);
		createEReference(engineerEClass, ENGINEER__EXPERTISE);
		createEReference(engineerEClass, ENGINEER__INCREMENTS);
		createEReference(engineerEClass, ENGINEER__SERVICES);
		createEReference(engineerEClass, ENGINEER__PERSONAS);
		createEReference(engineerEClass, ENGINEER__ASSIGNMENTS);
		createEReference(engineerEClass, ENGINEER__ISSUE_CATEGORIES);
		createEReference(engineerEClass, ENGINEER__ISSUE_STATUSES);
		createEReference(engineerEClass, ENGINEER__ISSUE_PRIORITIES);
		createEReference(engineerEClass, ENGINEER__ISSUE_SEVERITIES);
		createEAttribute(engineerEClass, ENGINEER__RATE);
		createEReference(engineerEClass, ENGINEER__DESIGNATIONS);
		createEReference(engineerEClass, ENGINEER__CAPACITY);
		createEReference(engineerEClass, ENGINEER__REPRESENTS);
		createEReference(engineerEClass, ENGINEER__MESSAGES);
		createEReference(engineerEClass, ENGINEER__OBJECTIVES);
		createEReference(engineerEClass, ENGINEER__DOMAINS);
		createEReference(engineerEClass, ENGINEER__ENGINEERED_ELEMENT_STATUSES);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__ELEMENTS);

		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__ENGINEERS);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODULES);
		createEReference(moduleEClass, MODULE__DEPENDENCIES);
		createEReference(moduleEClass, MODULE__DEPENDANTS);
		createEReference(moduleEClass, MODULE__INTERFACES);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__RELEASES);
		createEReference(productEClass, PRODUCT__FEATURES);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__REQUIRED_BY);
		createEAttribute(capabilityEClass, CAPABILITY__AVAILABLE);

		engineeredCapabilityEClass = createEClass(ENGINEERED_CAPABILITY);
		createEReference(engineeredCapabilityEClass, ENGINEERED_CAPABILITY__RELEASES);

		releaseEClass = createEClass(RELEASE);
		createEReference(releaseEClass, RELEASE__INCREMENT);
		createEReference(releaseEClass, RELEASE__CAPABILITIES);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__ISSUES);
		createEReference(featureEClass, FEATURE__CHILDREN);

		directoryEClass = createEClass(DIRECTORY);
		createEReference(directoryEClass, DIRECTORY__ELEMENTS);

		capacityEClass = createEClass(CAPACITY);
		createEReference(capacityEClass, CAPACITY__ENDEAVOR);
		createEAttribute(capacityEClass, CAPACITY__EFFORT);
		createEAttribute(capacityEClass, CAPACITY__FUNDS);
		createEAttribute(capacityEClass, CAPACITY__RATE);

		allocationEClass = createEClass(ALLOCATION);
		createEReference(allocationEClass, ALLOCATION__ENGINEER);
		createEReference(allocationEClass, ALLOCATION__CATEGORY);

		aimEClass = createEClass(AIM);
		createEReference(aimEClass, AIM__ALIGNMENTS);

		principleEClass = createEClass(PRINCIPLE);
		createEReference(principleEClass, PRINCIPLE__CHILDREN);

		alignmentEClass = createEClass(ALIGNMENT);
		createEReference(alignmentEClass, ALIGNMENT__AIM);
		createEAttribute(alignmentEClass, ALIGNMENT__WEIGHT);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__CHILDREN);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__DATE);
		createEReference(messageEClass, MESSAGE__AUTHOR);

		topicEClass = createEClass(TOPIC);
		createEReference(topicEClass, TOPIC__MESSAGES);

		namedElementReferenceEClass = createEClass(NAMED_ELEMENT_REFERENCE);
		createEReference(namedElementReferenceEClass, NAMED_ELEMENT_REFERENCE__TARGET);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__TARGET);

		keyResultEClass = createEClass(KEY_RESULT);
		createEAttribute(keyResultEClass, KEY_RESULT__WEIGHT);
		createEAttribute(keyResultEClass, KEY_RESULT__COMPLETION);
		createEReference(keyResultEClass, KEY_RESULT__INITIATIVES);

		objectiveEClass = createEClass(OBJECTIVE);
		createEReference(objectiveEClass, OBJECTIVE__ENDEAVOR);
		createEReference(objectiveEClass, OBJECTIVE__KEY_RESULTS);
		createEReference(objectiveEClass, OBJECTIVE__CHILDREN);
		createEReference(objectiveEClass, OBJECTIVE__PARENT);
		createEReference(objectiveEClass, OBJECTIVE__LINKED_OBJECTIVES);
		createEReference(objectiveEClass, OBJECTIVE__SUB_OBJECTIVES);

		decisionEClass = createEClass(DECISION);
		createEAttribute(decisionEClass, DECISION__EFFECTIVE_START);
		createEAttribute(decisionEClass, DECISION__EFFECTIVE_END);
		createEReference(decisionEClass, DECISION__SUPERCEDES);
		createEReference(decisionEClass, DECISION__SUPERCEDED_BY);
		createEAttribute(decisionEClass, DECISION__RESOLUTION);

		productOrganizationEClass = createEClass(PRODUCT_ORGANIZATION);
		createEReference(productOrganizationEClass, PRODUCT_ORGANIZATION__RELEASES);
		createEReference(productOrganizationEClass, PRODUCT_ORGANIZATION__FEATURES);

		connectionSourceEClass = createEClass(CONNECTION_SOURCE);
		createEReference(connectionSourceEClass, CONNECTION_SOURCE__OUTBOUND_CONNECTIONS);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__TARGET);

		connectionTargetEClass = createEClass(CONNECTION_TARGET);
		createEReference(connectionTargetEClass, CONNECTION_TARGET__INBOUND_CONNECTIONS);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__CHILDREN);
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
		JourneyPackage theJourneyPackage = (JourneyPackage)EPackage.Registry.INSTANCE.getEPackage(JourneyPackage.eNS_URI);
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);
		DiagramPackage theDiagramPackage = (DiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);
		ExecPackage theExecPackage = (ExecPackage)EPackage.Registry.INSTANCE.getEPackage(ExecPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theJourneyPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelElementEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		representationEClass.getESuperTypes().add(theDiagramPackage.getDiagram());
		namedElementEClass.getESuperTypes().add(this.getModelElement());
		namedElementEClass.getESuperTypes().add(theNcorePackage.getNamedElement());
		eventEClass.getESuperTypes().add(this.getEngineeredElement());
		eventEClass.getESuperTypes().add(theNcorePackage.getTemporal());
		endeavorEClass.getESuperTypes().add(this.getModelElement());
		endeavorEClass.getESuperTypes().add(theNcorePackage.getPeriod());
		endeavorEClass.getESuperTypes().add(this.getAlignable());
		incrementEClass.getESuperTypes().add(this.getNamedElement());
		incrementEClass.getESuperTypes().add(this.getEndeavor());
		issueCategoryEClass.getESuperTypes().add(this.getAim());
		issueStatusEClass.getESuperTypes().add(this.getNamedElement());
		issuePriorityEClass.getESuperTypes().add(this.getNamedElement());
		issueSeverityEClass.getESuperTypes().add(this.getNamedElement());
		issueEClass.getESuperTypes().add(this.getEngineeredCapability());
		noteEClass.getESuperTypes().add(this.getModelElement());
		forumEClass.getESuperTypes().add(this.getNamedElement());
		engineeredElementEClass.getESuperTypes().add(this.getForum());
		engineeredElementEClass.getESuperTypes().add(theNcorePackage.getPeriod());
		engineeredElementEClass.getESuperTypes().add(this.getConnectionSource());
		engineeredElementEClass.getESuperTypes().add(this.getConnectionTarget());
		engineeredElementStatusEClass.getESuperTypes().add(this.getNamedElement());
		documentEClass.getESuperTypes().add(this.getEngineeredElement());
		personaEClass.getESuperTypes().add(this.getEngineeredElement());
		engineerEClass.getESuperTypes().add(this.getPersona());
		domainEClass.getESuperTypes().add(this.getEngineeredElement());
		organizationEClass.getESuperTypes().add(this.getEngineer());
		moduleEClass.getESuperTypes().add(this.getEngineeredElement());
		productEClass.getESuperTypes().add(this.getModule());
		capabilityEClass.getESuperTypes().add(this.getNamedElement());
		capabilityEClass.getESuperTypes().add(theNcorePackage.getPeriod());
		engineeredCapabilityEClass.getESuperTypes().add(this.getCapability());
		engineeredCapabilityEClass.getESuperTypes().add(this.getEndeavor());
		releaseEClass.getESuperTypes().add(this.getEngineeredCapability());
		featureEClass.getESuperTypes().add(this.getEngineeredCapability());
		directoryEClass.getESuperTypes().add(this.getEngineeredElement());
		capacityEClass.getESuperTypes().add(this.getModelElement());
		allocationEClass.getESuperTypes().add(this.getCapacity());
		aimEClass.getESuperTypes().add(this.getNamedElement());
		aimEClass.getESuperTypes().add(this.getAlignable());
		principleEClass.getESuperTypes().add(this.getAim());
		alignmentEClass.getESuperTypes().add(this.getModelElement());
		goalEClass.getESuperTypes().add(this.getAim());
		messageEClass.getESuperTypes().add(this.getNamedElement());
		topicEClass.getESuperTypes().add(this.getMessage());
		namedElementReferenceEClass.getESuperTypes().add(this.getNamedElement());
		linkEClass.getESuperTypes().add(this.getNamedElement());
		keyResultEClass.getESuperTypes().add(this.getAim());
		objectiveEClass.getESuperTypes().add(this.getKeyResult());
		decisionEClass.getESuperTypes().add(this.getIssue());
		decisionEClass.getESuperTypes().add(this.getAim());
		productOrganizationEClass.getESuperTypes().add(this.getOrganization());
		connectionEClass.getESuperTypes().add(this.getEngineeredElement());
		interfaceEClass.getESuperTypes().add(this.getEngineeredElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Path(), ecorePackage.getEString(), "path", null, 1, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Resources(), this.getNamedElement(), null, "resources", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModelElement_Resources().getEKeys().add(this.getModelElement_Path());
		initEReference(getModelElement_Documentation(), ecorePackage.getEObject(), null, "documentation", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_TableOfContents(), this.getTableOfContents(), null, "tableOfContents", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Sections(), this.getDocument(), null, "sections", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModelElement_Sections().getEKeys().add(this.getModelElement_Path());
		initEReference(getModelElement_Representations(), this.getRepresentation(), null, "representations", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationEClass, Representation.class, "Representation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentation_Generator(), theExecPackage.getCall(), null, "generator", null, 0, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableOfContentsEClass, TableOfContents.class, "TableOfContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableOfContents_Role(), ecorePackage.getEString(), "role", null, 0, 1, TableOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOfContents_Depth(), ecorePackage.getEInt(), "depth", null, 0, 1, TableOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOfContents_Header(), ecorePackage.getEString(), "header", null, 0, 1, TableOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alignableEClass, Alignable.class, "Alignable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlignable_Aligns(), this.getAlignment(), null, "aligns", null, 0, -1, Alignable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAlignable_Aligns().getEKeys().add(this.getModelElement_Path());

		initEClass(endeavorEClass, Endeavor.class, "Endeavor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndeavor_Completion(), ecorePackage.getEDouble(), "completion", null, 0, 1, Endeavor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndeavor_Benefit(), ecorePackage.getEDouble(), "benefit", null, 0, 1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndeavor_TotalCost(), ecorePackage.getEDouble(), "totalCost", null, 0, 1, Endeavor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_Assignee(), this.getEngineer(), null, "assignee", null, 0, 1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_AllIssues(), this.getIssue(), null, "allIssues", null, 0, -1, Endeavor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_Capacity(), this.getCapacity(), this.getCapacity_Endeavor(), "capacity", null, 0, -1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_Objectives(), this.getObjective(), null, "objectives", null, 0, -1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEndeavor_Objectives().getEKeys().add(this.getModelElement_Path());
		initEReference(getEndeavor_LinkedObjectives(), this.getObjective(), this.getObjective_Endeavor(), "linkedObjectives", null, 0, -1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_AllObjectives(), this.getObjective(), null, "allObjectives", null, 0, -1, Endeavor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(incrementEClass, Increment.class, "Increment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncrement_Children(), this.getIncrement(), null, "children", null, 0, -1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIncrement_Children().getEKeys().add(this.getModelElement_Path());
		initEReference(getIncrement_Issues(), this.getIssue(), null, "issues", null, 0, -1, Increment.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIncrement_Releases(), this.getRelease(), null, "releases", null, 0, -1, Increment.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(issueCategoryEClass, IssueCategory.class, "IssueCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssueCategory_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, IssueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssueCategory_Issues(), this.getIssue(), null, "issues", null, 0, -1, IssueCategory.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssueCategory_Cumulative(), ecorePackage.getEBoolean(), "cumulative", null, 0, 1, IssueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssueCategory_Allocations(), this.getAllocation(), this.getAllocation_Category(), "allocations", null, 0, -1, IssueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIssueCategory_Children(), this.getIssueCategory(), null, "children", null, 0, -1, IssueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIssueCategory_Children().getEKeys().add(this.getModelElement_Path());

		initEClass(issueStatusEClass, IssueStatus.class, "IssueStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssueStatus_Issues(), this.getIssue(), null, "issues", null, 0, -1, IssueStatus.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssueStatus_Done(), ecorePackage.getEBoolean(), "done", null, 0, 1, IssueStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issuePriorityEClass, IssuePriority.class, "IssuePriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssuePriority_Issues(), this.getIssue(), null, "issues", null, 0, -1, IssuePriority.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(issueSeverityEClass, IssueSeverity.class, "IssueSeverity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssueSeverity_Issues(), this.getIssue(), null, "issues", null, 0, -1, IssueSeverity.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssue_Children(), this.getIssue(), null, "children", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIssue_Children().getEKeys().add(this.getModelElement_Path());
		initEReference(getIssue_Requires(), this.getCapability(), null, "requires", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Increment(), this.getIncrement(), null, "increment", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_ContributesTo(), this.getFeature(), null, "contributesTo", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Notes(), this.getNote(), null, "notes", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIssue_Notes().getEKeys().add(this.getModelElement_Path());
		initEReference(getIssue_Categories(), this.getIssueCategory(), null, "categories", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Target(), this.getEngineeredElement(), null, "target", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Status(), this.getIssueStatus(), null, "status", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Workable(), ecorePackage.getEBoolean(), "workable", null, 0, 1, Issue.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Effort(), ecorePackage.getEDouble(), "effort", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Cost(), ecorePackage.getEDouble(), "cost", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_RemainingEffort(), ecorePackage.getEDouble(), "remainingEffort", null, 0, 1, Issue.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_RemainingCost(), ecorePackage.getEDouble(), "remainingCost", null, 0, 1, Issue.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Priority(), this.getIssuePriority(), null, "priority", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Severity(), this.getIssueSeverity(), null, "severity", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNote_Author(), this.getEngineer(), null, "author", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Effort(), ecorePackage.getEDouble(), "effort", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Cost(), ecorePackage.getEDouble(), "cost", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_RemainingEffort(), ecorePackage.getEDouble(), "remainingEffort", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_RemainingCost(), ecorePackage.getEDouble(), "remainingCost", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNote_Status(), this.getIssueStatus(), null, "status", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forumEClass, Forum.class, "Forum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForum_Discussion(), this.getForum(), null, "discussion", null, 0, -1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getForum_Discussion().getEKeys().add(this.getModelElement_Path());
		initEReference(getForum_Topics(), this.getTopic(), null, "topics", null, 0, -1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getForum_Topics().getEKeys().add(this.getModelElement_Path());

		initEClass(engineeredElementEClass, EngineeredElement.class, "EngineeredElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeredElement_Issues(), this.getIssue(), null, "issues", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineeredElement_Issues().getEKeys().add(this.getModelElement_Path());
		initEReference(getEngineeredElement_Owners(), this.getEngineer(), null, "owners", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_Experts(), this.getEngineer(), null, "experts", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_Allocations(), this.getAllocation(), null, "allocations", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_Principles(), this.getPrinciple(), null, "principles", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineeredElement_Principles().getEKeys().add(this.getModelElement_Path());
		initEReference(getEngineeredElement_AllIssues(), this.getIssue(), null, "allIssues", null, 0, -1, EngineeredElement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_Status(), this.getEngineeredElementStatus(), null, "status", null, 0, 1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineeredElementStatusEClass, EngineeredElementStatus.class, "EngineeredElementStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeredElementStatus_Children(), this.getEngineeredElementStatus(), null, "children", null, 0, -1, EngineeredElementStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElementStatus_Elements(), this.getEngineeredElement(), null, "elements", null, 0, -1, EngineeredElementStatus.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElementStatus_ElementStyle(), theDiagramPackage.getDiagramElement(), null, "elementStyle", null, 0, 1, EngineeredElementStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElementStatus_ConnectionStyle(), theDiagramPackage.getConnection(), null, "connectionStyle", null, 0, 1, EngineeredElementStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersona_Goals(), this.getGoal(), null, "goals", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPersona_Goals().getEKeys().add(this.getModelElement_Path());
		initEReference(getPersona_Representatives(), this.getEngineer(), this.getEngineer_Represents(), "representatives", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Extends(), this.getPersona(), null, "extends", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Extensions(), this.getPersona(), null, "extensions", null, 0, -1, Persona.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(engineerEClass, Engineer.class, "Engineer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineer_Modules(), this.getModule(), null, "modules", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineer_Modules().getEKeys().add(this.getModelElement_Path());
		initEReference(getEngineer_Owns(), this.getEngineeredElement(), null, "owns", null, 0, -1, Engineer.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Expertise(), this.getEngineeredElement(), null, "expertise", null, 0, -1, Engineer.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Increments(), this.getIncrement(), null, "increments", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineer_Increments().getEKeys().add(this.getModelElement_Path());
		initEReference(getEngineer_Services(), theJourneyPackage.getActivity(), null, "services", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Personas(), this.getPersona(), null, "personas", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineer_Personas().getEKeys().add(this.getModelElement_Path());
		initEReference(getEngineer_Assignments(), this.getEndeavor(), null, "assignments", null, 0, -1, Engineer.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_IssueCategories(), this.getIssueCategory(), null, "issueCategories", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineer_IssueCategories().getEKeys().add(this.getModelElement_Path());
		initEReference(getEngineer_IssueStatuses(), this.getIssueStatus(), null, "issueStatuses", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineer_IssueStatuses().getEKeys().add(this.getModelElement_Path());
		initEReference(getEngineer_IssuePriorities(), this.getIssuePriority(), null, "issuePriorities", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineer_IssuePriorities().getEKeys().add(this.getModelElement_Path());
		initEReference(getEngineer_IssueSeverities(), this.getIssueSeverity(), null, "issueSeverities", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineer_IssueSeverities().getEKeys().add(this.getModelElement_Path());
		initEAttribute(getEngineer_Rate(), ecorePackage.getEDouble(), "rate", "1", 0, 1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Designations(), this.getAllocation(), this.getAllocation_Engineer(), "designations", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Capacity(), this.getCapacity(), null, "capacity", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Represents(), this.getPersona(), this.getPersona_Representatives(), "represents", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Messages(), this.getMessage(), null, "messages", null, 0, -1, Engineer.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Objectives(), this.getObjective(), null, "objectives", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineer_Objectives().getEKeys().add(this.getModelElement_Path());
		initEReference(getEngineer_Domains(), this.getDomain(), null, "domains", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineer_Domains().getEKeys().add(this.getModelElement_Path());
		initEReference(getEngineer_EngineeredElementStatuses(), this.getEngineeredElementStatus(), null, "engineeredElementStatuses", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEngineer_EngineeredElementStatuses().getEKeys().add(this.getModelElement_Path());

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Elements(), this.getEngineeredElement(), null, "elements", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDomain_Elements().getEKeys().add(this.getModelElement_Path());

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_Engineers(), this.getEngineer(), null, "engineers", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrganization_Engineers().getEKeys().add(this.getModelElement_Path());

		initEClass(moduleEClass, org.nasdanika.engineering.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Modules(), this.getModule(), null, "modules", null, 0, -1, org.nasdanika.engineering.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModule_Modules().getEKeys().add(this.getModelElement_Path());
		initEReference(getModule_Dependencies(), this.getModule(), null, "dependencies", null, 0, -1, org.nasdanika.engineering.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Dependants(), this.getModule(), null, "dependants", null, 0, -1, org.nasdanika.engineering.Module.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, org.nasdanika.engineering.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModule_Interfaces().getEKeys().add(this.getModelElement_Path());

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Releases(), this.getRelease(), null, "releases", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_Releases().getEKeys().add(this.getModelElement_Path());
		initEReference(getProduct_Features(), this.getFeature(), null, "features", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_Features().getEKeys().add(this.getModelElement_Path());

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_RequiredBy(), this.getIssue(), null, "requiredBy", null, 0, -1, Capability.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_Available(), ecorePackage.getEBoolean(), "available", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineeredCapabilityEClass, EngineeredCapability.class, "EngineeredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeredCapability_Releases(), this.getRelease(), null, "releases", null, 0, -1, EngineeredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelease_Increment(), this.getIncrement(), null, "increment", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelease_Capabilities(), this.getEngineeredCapability(), null, "capabilities", null, 0, -1, Release.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Issues(), this.getIssue(), null, "issues", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Children(), this.getFeature(), null, "children", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFeature_Children().getEKeys().add(this.getModelElement_Path());

		initEClass(directoryEClass, Directory.class, "Directory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectory_Elements(), this.getNamedElement(), null, "elements", null, 0, -1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDirectory_Elements().getEKeys().add(this.getModelElement_Path());

		initEClass(capacityEClass, Capacity.class, "Capacity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapacity_Endeavor(), this.getEndeavor(), this.getEndeavor_Capacity(), "endeavor", null, 1, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Effort(), ecorePackage.getEDouble(), "effort", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Funds(), ecorePackage.getEDouble(), "funds", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Rate(), ecorePackage.getEDouble(), "rate", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocation_Engineer(), this.getEngineer(), this.getEngineer_Designations(), "engineer", null, 1, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocation_Category(), this.getIssueCategory(), this.getIssueCategory_Allocations(), "category", null, 0, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aimEClass, Aim.class, "Aim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAim_Alignments(), this.getAlignment(), null, "alignments", null, 0, -1, Aim.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(principleEClass, Principle.class, "Principle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrinciple_Children(), this.getPrinciple(), null, "children", null, 0, -1, Principle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPrinciple_Children().getEKeys().add(this.getModelElement_Path());

		initEClass(alignmentEClass, Alignment.class, "Alignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlignment_Aim(), this.getAim(), null, "aim", null, 0, 1, Alignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlignment_Weight(), ecorePackage.getEDouble(), "weight", "1", 0, 1, Alignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_Children(), this.getGoal(), null, "children", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGoal_Children().getEKeys().add(this.getModelElement_Path());

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Author(), this.getEngineer(), null, "author", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopic_Messages(), this.getMessage(), null, "messages", null, 0, -1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTopic_Messages().getEKeys().add(this.getModelElement_Path());

		initEClass(namedElementReferenceEClass, NamedElementReference.class, "NamedElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedElementReference_Target(), this.getNamedElement(), null, "target", null, 1, 1, NamedElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Target(), ecorePackage.getEString(), "target", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyResultEClass, KeyResult.class, "KeyResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyResult_Weight(), ecorePackage.getEDouble(), "weight", "1", 0, 1, KeyResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyResult_Completion(), ecorePackage.getEDouble(), "completion", null, 0, 1, KeyResult.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyResult_Initiatives(), this.getIssue(), null, "initiatives", null, 0, -1, KeyResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKeyResult_Initiatives().getEKeys().add(this.getModelElement_Path());

		initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjective_Endeavor(), this.getEndeavor(), this.getEndeavor_LinkedObjectives(), "endeavor", null, 0, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_KeyResults(), this.getKeyResult(), null, "keyResults", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getObjective_KeyResults().getEKeys().add(this.getModelElement_Path());
		initEReference(getObjective_Children(), this.getObjective(), null, "children", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getObjective_Children().getEKeys().add(this.getModelElement_Path());
		initEReference(getObjective_Parent(), this.getObjective(), null, "parent", null, 0, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_LinkedObjectives(), this.getObjective(), null, "linkedObjectives", null, 0, -1, Objective.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_SubObjectives(), this.getObjective(), null, "subObjectives", null, 0, -1, Objective.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecision_EffectiveStart(), ecorePackage.getEDate(), "effectiveStart", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_EffectiveEnd(), ecorePackage.getEDate(), "effectiveEnd", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Supercedes(), this.getDecision(), this.getDecision_SupercededBy(), "supercedes", null, 0, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_SupercededBy(), this.getDecision(), this.getDecision_Supercedes(), "supercededBy", null, 0, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Resolution(), ecorePackage.getEString(), "resolution", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productOrganizationEClass, ProductOrganization.class, "ProductOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductOrganization_Releases(), this.getRelease(), null, "releases", null, 0, -1, ProductOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductOrganization_Releases().getEKeys().add(this.getModelElement_Path());
		initEReference(getProductOrganization_Features(), this.getFeature(), null, "features", null, 0, -1, ProductOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductOrganization_Features().getEKeys().add(this.getModelElement_Path());

		initEClass(connectionSourceEClass, ConnectionSource.class, "ConnectionSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionSource_OutboundConnections(), this.getConnection(), null, "outboundConnections", null, 0, -1, ConnectionSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConnectionSource_OutboundConnections().getEKeys().add(this.getModelElement_Path());

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Target(), this.getConnectionTarget(), null, "target", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionTargetEClass, ConnectionTarget.class, "ConnectionTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionTarget_InboundConnections(), this.getConnection(), null, "inboundConnections", null, 0, -1, ConnectionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Children(), this.getInterface(), null, "children", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getInterface_Children().getEKeys().add(this.getModelElement_Path());

		// Create resource
		createResource(eNS_URI);

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
		  (this,
		   source,
		   new String[] {
			   "documentation-reference", "doc/engineering.md"
		   });
		addAnnotation
		  (modelElementEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/model-element.md"
		   });
		addAnnotation
		  (getModelElement_TableOfContents(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getModelElement_Sections(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getModelElement_Representations(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getRepresentation_Generator(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (tableOfContentsEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/table-of-contents.md"
		   });
		addAnnotation
		  (getTableOfContents_Role(),
		   source,
		   new String[] {
			   "default-feature", "true"
		   });
		addAnnotation
		  (namedElementEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/named-element.md"
		   });
		addAnnotation
		  (eventEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/event.md"
		   });
		addAnnotation
		  (alignableEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/alignable.md"
		   });
		addAnnotation
		  (getAlignable_Aligns(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (endeavorEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/endeavor.md"
		   });
		addAnnotation
		  (getEndeavor_Objectives(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (incrementEClass,
		   source,
		   new String[] {
			   "icon", "far fa-calendar-alt",
			   "documentation-reference", "doc/increment.md"
		   });
		addAnnotation
		  (getIncrement_Children(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getIncrement_Issues(),
		   source,
		   new String[] {
			   "opposite", "increment"
		   });
		addAnnotation
		  (getIncrement_Releases(),
		   source,
		   new String[] {
			   "opposite", "increment"
		   });
		addAnnotation
		  (issueCategoryEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/issue-category.md"
		   });
		addAnnotation
		  (getIssueCategory_Issues(),
		   source,
		   new String[] {
			   "opposite", "categories"
		   });
		addAnnotation
		  (getIssueCategory_Children(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (issueStatusEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/issue-status.md"
		   });
		addAnnotation
		  (issuePriorityEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/issue-priority.md"
		   });
		addAnnotation
		  (issueSeverityEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/issue-severity.md"
		   });
		addAnnotation
		  (issueEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/issue.md"
		   });
		addAnnotation
		  (getIssue_Children(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getIssue_Requires(),
		   source,
		   new String[] {
			   "opposite", "requiredBy"
		   });
		addAnnotation
		  (getIssue_Increment(),
		   source,
		   new String[] {
			   "opposite", "issues"
		   });
		addAnnotation
		  (getIssue_ContributesTo(),
		   source,
		   new String[] {
			   "opposite", "issues"
		   });
		addAnnotation
		  (getIssue_Notes(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getIssue_Categories(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getIssue_Status(),
		   source,
		   new String[] {
			   "opposite", "issues"
		   });
		addAnnotation
		  (getIssue_Priority(),
		   source,
		   new String[] {
			   "opposite", "issues"
		   });
		addAnnotation
		  (getIssue_Severity(),
		   source,
		   new String[] {
			   "opposite", "issues"
		   });
		addAnnotation
		  (noteEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/note.md"
		   });
		addAnnotation
		  (getNote_Status(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (forumEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/forum.md"
		   });
		addAnnotation
		  (getForum_Discussion(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getForum_Topics(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (engineeredElementEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/engineered-element.md"
		   });
		addAnnotation
		  (getEngineeredElement_Issues(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getEngineeredElement_Allocations(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getEngineeredElement_Principles(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getEngineeredElementStatus_Children(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getEngineeredElementStatus_Elements(),
		   source,
		   new String[] {
			   "opposite", "status"
		   });
		addAnnotation
		  (getEngineeredElementStatus_ElementStyle(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getEngineeredElementStatus_ConnectionStyle(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (documentEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/document.md"
		   });
		addAnnotation
		  (personaEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/persona.md",
			   "icon", "far fa-user"
		   });
		addAnnotation
		  (getPersona_Goals(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getPersona_Extensions(),
		   source,
		   new String[] {
			   "opposite", "extends"
		   });
		addAnnotation
		  (engineerEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/engineer.md",
			   "icon", "fas fa-user"
		   });
		addAnnotation
		  (getEngineer_Owns(),
		   source,
		   new String[] {
			   "opposite", "owners"
		   });
		addAnnotation
		  (getEngineer_Expertise(),
		   source,
		   new String[] {
			   "opposite", "experts"
		   });
		addAnnotation
		  (getEngineer_Increments(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getEngineer_Personas(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getEngineer_Assignments(),
		   source,
		   new String[] {
			   "opposite", "assignee"
		   });
		addAnnotation
		  (getEngineer_IssueCategories(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getEngineer_IssueStatuses(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getEngineer_IssuePriorities(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getEngineer_IssueSeverities(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getEngineer_Capacity(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getEngineer_Objectives(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getEngineer_Domains(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getEngineer_EngineeredElementStatuses(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (domainEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/domain.md"
		   });
		addAnnotation
		  (organizationEClass,
		   source,
		   new String[] {
			   "icon", "far fa-building",
			   "documentation-reference", "doc/organization.md"
		   });
		addAnnotation
		  (getOrganization_Engineers(),
		   source,
		   new String[] {
			   "icon", "fas fa-users"
		   });
		addAnnotation
		  (moduleEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/module.md"
		   });
		addAnnotation
		  (getModule_Dependants(),
		   source,
		   new String[] {
			   "opposite", "dependencies"
		   });
		addAnnotation
		  (getModule_Interfaces(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (productEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/product.md",
			   "type-code", "d"
		   });
		addAnnotation
		  (getProduct_Releases(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getProduct_Features(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (capabilityEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/capability.md"
		   });
		addAnnotation
		  (getCapability_RequiredBy(),
		   source,
		   new String[] {
			   "opposite", "requires"
		   });
		addAnnotation
		  (engineeredCapabilityEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/engineered-capability.md"
		   });
		addAnnotation
		  (getEngineeredCapability_Releases(),
		   source,
		   new String[] {
			   "opposite", "capabilities"
		   });
		addAnnotation
		  (releaseEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/release.md"
		   });
		addAnnotation
		  (featureEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/feature.md"
		   });
		addAnnotation
		  (getFeature_Children(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (directoryEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/directory.md"
		   });
		addAnnotation
		  (capacityEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/capacity.md"
		   });
		addAnnotation
		  (allocationEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/allocation.md"
		   });
		addAnnotation
		  (aimEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/aim.md"
		   });
		addAnnotation
		  (getAim_Alignments(),
		   source,
		   new String[] {
			   "opposite", "aim"
		   });
		addAnnotation
		  (principleEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/principle.md"
		   });
		addAnnotation
		  (getPrinciple_Children(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (alignmentEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/alignment.md"
		   });
		addAnnotation
		  (getAlignment_Aim(),
		   source,
		   new String[] {
			   "default-feature", "true"
		   });
		addAnnotation
		  (goalEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/goal.md",
			   "icon", "fas fa-bullseye"
		   });
		addAnnotation
		  (getGoal_Children(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (messageEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/message.md"
		   });
		addAnnotation
		  (getMessage_Author(),
		   source,
		   new String[] {
			   "opposite", "messages"
		   });
		addAnnotation
		  (topicEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/topic.md"
		   });
		addAnnotation
		  (getTopic_Messages(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (namedElementReferenceEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/named-element-reference.md"
		   });
		addAnnotation
		  (getNamedElementReference_Target(),
		   source,
		   new String[] {
			   "default-feature", "true"
		   });
		addAnnotation
		  (linkEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/link.md"
		   });
		addAnnotation
		  (getLink_Target(),
		   source,
		   new String[] {
			   "default-feature", "true"
		   });
		addAnnotation
		  (keyResultEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/key-result.md"
		   });
		addAnnotation
		  (getKeyResult_Initiatives(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (objectiveEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/objective.md"
		   });
		addAnnotation
		  (getObjective_KeyResults(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getObjective_Children(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getObjective_LinkedObjectives(),
		   source,
		   new String[] {
			   "opposite", "parent"
		   });
		addAnnotation
		  (decisionEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/decision.md"
		   });
		addAnnotation
		  (getProductOrganization_Releases(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getProductOrganization_Features(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getConnectionSource_OutboundConnections(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getConnectionTarget_InboundConnections(),
		   source,
		   new String[] {
			   "opposite", "target"
		   });
		addAnnotation
		  (getInterface_Children(),
		   source,
		   new String[] {
			   "homogenous", "true"
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
		  (getModelElement_Path(),
		   source,
		   new String[] {
			   "documentation", "Element path is typically used as a key (EKey) in a containing collection."
		   });
		addAnnotation
		  (getModelElement_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resources associated with the element, e.g. documentation."
		   });
		addAnnotation
		  (getModelElement_Documentation(),
		   source,
		   new String[] {
			   "documentation", "Element documentation, e.g. [Markdown](${classifier/Markdown@urn:org.nasdanika.exec.content}) documentation."
		   });
		addAnnotation
		  (getModelElement_TableOfContents(),
		   source,
		   new String[] {
			   "documentation", "Table of contents configuration."
		   });
		addAnnotation
		  (getModelElement_Sections(),
		   source,
		   new String[] {
			   "documentation", "Sections for model element documentation."
		   });
		addAnnotation
		  (getModelElement_Representations(),
		   source,
		   new String[] {
			   "documentation", "Pluggable representations of a model element, e.g. a component diagram for modules."
		   });
		addAnnotation
		  (getTableOfContents_Role(),
		   source,
		   new String[] {
			   "documentation", "Table of contents role defines where it is positioned on the page. \nSee [Appearance](Appearance.html) for details regarding page parts.\nOne of the following:\n\n* ``content`` - in the content panel, before the document/section text.\n* ``content-left`` - Left content panel.\n* ``content-right`` - Right content panel.\n* ``float-left`` - Floats to the left. Diferent from ``content-left`` which takes the entire column.\n* ``float-right`` - Floats to the right. Different from ``content-right`` which takes the entire column.\n"
		   });
		addAnnotation
		  (getTableOfContents_Depth(),
		   source,
		   new String[] {
			   "documentation", "Table of contents depth. Zero (default) means unlimited depth."
		   });
		addAnnotation
		  (getTableOfContents_Header(),
		   source,
		   new String[] {
			   "documentation", "Table of contents header, e.g. ``Contents``. No header by default."
		   });
		addAnnotation
		  (getAlignable_Aligns(),
		   source,
		   new String[] {
			   "documentation", "Aims to which this alignable aligns. E.g. a module level principle may align to organization pirinciples."
		   });
		addAnnotation
		  (getEndeavor_Completion(),
		   source,
		   new String[] {
			   "documentation", "Number between 0 and 1."
		   });
		addAnnotation
		  (getEndeavor_Benefit(),
		   source,
		   new String[] {
			   "documentation", "Number representing benefit of this endeavor. Can be explicitly provided or derived."
		   });
		addAnnotation
		  (getEndeavor_TotalCost(),
		   source,
		   new String[] {
			   "documentation", "Total cost of the endeavor includes both cost and labor multiplied by rate."
		   });
		addAnnotation
		  (getEndeavor_Assignee(),
		   source,
		   new String[] {
			   "documentation", "Engineer responsible for completion of this endeavor. For a simple issue it would be an engineer working on the issue, for other endeavors the assignee\'s may not actually work on issues, but rather coordinate. E.g. [increment](Increment.html) assignee responsibility would be similar to those of a [scrum master](https://en.wikipedia.org/wiki/Scrum_(software_development)#Scrum_master)."
		   });
		addAnnotation
		  (getEndeavor_AllIssues(),
		   source,
		   new String[] {
			   "documentation", "Issues scheduled to work on in this increment directly or indirectly via [releases](Release.html) and [features](Feature.html)."
		   });
		addAnnotation
		  (getEndeavor_Capacity(),
		   source,
		   new String[] {
			   "documentation", "[Capacity](Capacity.html) or [Allocation](Allocation.html).  If an element is capacity that means that there is a capacity for an [engineer](Engineer.html) to work on this endeavor.  If an element is allocation that means that Engineer\'s capacity has been allocated to work on a particular [engineered element](EngineeredElement.html) [issues](Issue.html) in a particular [issue category](IssueCategory.html)."
		   });
		addAnnotation
		  (getEndeavor_Objectives(),
		   source,
		   new String[] {
			   "documentation", "Assignee\'s objectives for this endeavor."
		   });
		addAnnotation
		  (getEndeavor_LinkedObjectives(),
		   source,
		   new String[] {
			   "documentation", "Objectives defined under [Engineer](Engineer.html) for this endeavor."
		   });
		addAnnotation
		  (getEndeavor_AllObjectives(),
		   source,
		   new String[] {
			   "documentation", "All objectives for this endeavor - a union of objectives and linkedObjectives."
		   });
		addAnnotation
		  (getIncrement_Children(),
		   source,
		   new String[] {
			   "documentation", "Increment children, e.g. quarters for a year or months for a quarter."
		   });
		addAnnotation
		  (getIncrement_Issues(),
		   source,
		   new String[] {
			   "documentation", "Issues scheduled to work on in this increment"
		   });
		addAnnotation
		  (getIncrement_Releases(),
		   source,
		   new String[] {
			   "documentation", "Releases scheduled to be made available in this increment"
		   });
		addAnnotation
		  (getIssueCategory_Weight(),
		   source,
		   new String[] {
			   "documentation", "Category relative importance. Can be used to allocate issues to increments in a balanced way."
		   });
		addAnnotation
		  (getIssueCategory_Issues(),
		   source,
		   new String[] {
			   "documentation", "Issues in the category."
		   });
		addAnnotation
		  (getIssueCategory_Cumulative(),
		   source,
		   new String[] {
			   "documentation", "If true, unused category weight \"capacity\" is carried over to future increments and overused is subtracted from future increments. This allow low-weight categories to accumulate weight over time."
		   });
		addAnnotation
		  (getIssueCategory_Allocations(),
		   source,
		   new String[] {
			   "documentation", "Allocations for this category."
		   });
		addAnnotation
		  (getIssueCategory_Children(),
		   source,
		   new String[] {
			   "documentation", "Issue categories can form a hierarchy."
		   });
		addAnnotation
		  (getIssueStatus_Issues(),
		   source,
		   new String[] {
			   "documentation", "Issues in this status."
		   });
		addAnnotation
		  (getIssueStatus_Done(),
		   source,
		   new String[] {
			   "documentation", "If ``true``, indicates that the issue in this status is successfully completed and issues requiring is are now workable. Issue can be completed (completion = 1), but not done, e.g. it can be cancelled."
		   });
		addAnnotation
		  (getIssuePriority_Issues(),
		   source,
		   new String[] {
			   "documentation", "Issues in this priority"
		   });
		addAnnotation
		  (getIssueSeverity_Issues(),
		   source,
		   new String[] {
			   "documentation", "Issues in this severity."
		   });
		addAnnotation
		  (getIssue_Children(),
		   source,
		   new String[] {
			   "documentation", "Issues can be infinitely nested to form a [Work Breakdown Structure](https://en.wikipedia.org/wiki/Work_breakdown_structure)."
		   });
		addAnnotation
		  (getIssue_Requires(),
		   source,
		   new String[] {
			   "documentation", "Capabilities required to start working on an issue."
		   });
		addAnnotation
		  (getIssue_Increment(),
		   source,
		   new String[] {
			   "documentation", "Increment for which this issue is directly scheduled. Issue can be scheduled for an increment directly or indirectly via [features](Feature.html) and [releases](Release.html). Release increment can be different from issue incrmenent. E.g. issue can be scheduled for May, but its release might be scheduled for July."
		   });
		addAnnotation
		  (getIssue_ContributesTo(),
		   source,
		   new String[] {
			   "documentation", "Issue can contribute to zero or more features."
		   });
		addAnnotation
		  (getIssue_Notes(),
		   source,
		   new String[] {
			   "documentation", "Issue notes are used for discussion and to record progress, remaining effort, and issue status if it is not set at the issue level. "
		   });
		addAnnotation
		  (getIssue_Categories(),
		   source,
		   new String[] {
			   "documentation", "Issue category."
		   });
		addAnnotation
		  (getIssue_Target(),
		   source,
		   new String[] {
			   "documentation", "Target element for this issue - container of the issue itself or the root issue in the issue hierarchy."
		   });
		addAnnotation
		  (getIssue_Status(),
		   source,
		   new String[] {
			   "documentation", "Issue status."
		   });
		addAnnotation
		  (getIssue_Workable(),
		   source,
		   new String[] {
			   "documentation", "Issue is workable if it doesn\'t have any unavailable required capabilities."
		   });
		addAnnotation
		  (getIssue_Effort(),
		   source,
		   new String[] {
			   "documentation", "Effort for this issue."
		   });
		addAnnotation
		  (getIssue_Cost(),
		   source,
		   new String[] {
			   "documentation", "Monetary cost for this issue, e.g. cost of materials."
		   });
		addAnnotation
		  (getIssue_RemainingEffort(),
		   source,
		   new String[] {
			   "documentation", "Remaining effort is computed from issue effort and [notes](Note.html) effort or remaining effort."
		   });
		addAnnotation
		  (getIssue_RemainingCost(),
		   source,
		   new String[] {
			   "documentation", "Remaining cost is computed from issue cost and [notes](Note.html) cost or remaining cost."
		   });
		addAnnotation
		  (getIssue_Priority(),
		   source,
		   new String[] {
			   "documentation", "Issue status."
		   });
		addAnnotation
		  (getIssue_Severity(),
		   source,
		   new String[] {
			   "documentation", "Issue status."
		   });
		addAnnotation
		  (getNote_Author(),
		   source,
		   new String[] {
			   "documentation", "Note author."
		   });
		addAnnotation
		  (getNote_Date(),
		   source,
		   new String[] {
			   "documentation", "Note date and time."
		   });
		addAnnotation
		  (getNote_Effort(),
		   source,
		   new String[] {
			   "documentation", "Effort spent."
		   });
		addAnnotation
		  (getNote_Cost(),
		   source,
		   new String[] {
			   "documentation", "Cost spent."
		   });
		addAnnotation
		  (getNote_RemainingEffort(),
		   source,
		   new String[] {
			   "documentation", "If remaining effort is not specified explicitly is it computed from by subtracting note effort from the issue remaining effort. "
		   });
		addAnnotation
		  (getNote_RemainingCost(),
		   source,
		   new String[] {
			   "documentation", "If remaining cost is not specified explicitly is it computed from by subtracting note cost from the issue remaining cost. "
		   });
		addAnnotation
		  (getNote_Status(),
		   source,
		   new String[] {
			   "documentation", "If issue status is not set explicitly the the status of the last note with status is used as issue status. It can be used to keep track of status changes."
		   });
		addAnnotation
		  (getForum_Discussion(),
		   source,
		   new String[] {
			   "documentation", "Sub-forums."
		   });
		addAnnotation
		  (getForum_Topics(),
		   source,
		   new String[] {
			   "documentation", "Discussion topics in this forum."
		   });
		addAnnotation
		  (getEngineeredElement_Issues(),
		   source,
		   new String[] {
			   "documentation", "Issues (work items) for this element."
		   });
		addAnnotation
		  (getEngineeredElement_Owners(),
		   source,
		   new String[] {
			   "documentation", "Element owners have both expertise and authority over the element."
		   });
		addAnnotation
		  (getEngineeredElement_Experts(),
		   source,
		   new String[] {
			   "documentation", "Experts have expertise with the element, but no authority. E.g. they can help others with using the element, but cannot make changes in the element without owners\' approval."
		   });
		addAnnotation
		  (getEngineeredElement_Allocations(),
		   source,
		   new String[] {
			   "documentation", "Allocations of [engineer](Engineer.html)\'s [capacity](Capacity.html) to work on this engineered element [issues](Issue.html) for a particular [endeavor](Endeavor.html) and [issue category](IssueCategory.html)."
		   });
		addAnnotation
		  (getEngineeredElement_Principles(),
		   source,
		   new String[] {
			   "documentation", "Principles associated with this element to support decision making."
		   });
		addAnnotation
		  (getEngineeredElement_AllIssues(),
		   source,
		   new String[] {
			   "documentation", "Issues (work items) for this element."
		   });
		addAnnotation
		  (getEngineeredElementStatus_Children(),
		   source,
		   new String[] {
			   "documentation", "EngineeredElement statuses can form a hierarchy."
		   });
		addAnnotation
		  (getEngineeredElementStatus_Elements(),
		   source,
		   new String[] {
			   "documentation", "Engineered elements in this status."
		   });
		addAnnotation
		  (getPersona_Goals(),
		   source,
		   new String[] {
			   "documentation", "Persona goals are used to elicit and align [endeavors](Endeavor.html). E.g. new [product](Product.html) [features](Feature.html)."
		   });
		addAnnotation
		  (getPersona_Representatives(),
		   source,
		   new String[] {
			   "documentation", "Engineers which represent this persona. E.g. in a hierarchical [organization](Organization.html) some units or engineers may build products for internal customers - other units or engineers. In this case some of those internal customers act as persona representatives and work with the persona owner to identify persona goals and product features to address those goals. "
		   });
		addAnnotation
		  (getPersona_Extends(),
		   source,
		   new String[] {
			   "documentation", "A persona may extend another persona. E.g. \"Moderator\" discussion forum persona extends \"User\" persona, which may in turn extend \"Visitor\" persona. This persona inherits goals for the extended personas."
		   });
		addAnnotation
		  (getPersona_Extensions(),
		   source,
		   new String[] {
			   "documentation", "Personas extending this persona."
		   });
		addAnnotation
		  (getEngineer_Modules(),
		   source,
		   new String[] {
			   "documentation", "Modules ([products](Product.html)) are defined under engineer or [organization](Organization.html)."
		   });
		addAnnotation
		  (getEngineer_Owns(),
		   source,
		   new String[] {
			   "documentation", "Engineered elements owned by this engineer."
		   });
		addAnnotation
		  (getEngineer_Expertise(),
		   source,
		   new String[] {
			   "documentation", "Engineered element which this engineer has experience with."
		   });
		addAnnotation
		  (getEngineer_Increments(),
		   source,
		   new String[] {
			   "documentation", "Increments are defined under engineer/[organization](Organization.html)."
		   });
		addAnnotation
		  (getEngineer_Services(),
		   source,
		   new String[] {
			   "documentation", "Engineer may perform shared activities (services) which can be parts of [persona](Persona.html) [journeys](Journey.html)."
		   });
		addAnnotation
		  (getEngineer_Personas(),
		   source,
		   new String[] {
			   "documentation", "Personas which this engineer/[organization](Organization.html) builds products for."
		   });
		addAnnotation
		  (getEngineer_Assignments(),
		   source,
		   new String[] {
			   "documentation", "Engineer assignments."
		   });
		addAnnotation
		  (getEngineer_IssueCategories(),
		   source,
		   new String[] {
			   "documentation", "Issue categories are defined under engineer/[organization](Organization.html)."
		   });
		addAnnotation
		  (getEngineer_IssueStatuses(),
		   source,
		   new String[] {
			   "documentation", "Issue statuses are defined under engineer/[organization](Organization.html)."
		   });
		addAnnotation
		  (getEngineer_IssuePriorities(),
		   source,
		   new String[] {
			   "documentation", "Issue priorities are defined under engineer/[organization](Organization.html)."
		   });
		addAnnotation
		  (getEngineer_IssueSeverities(),
		   source,
		   new String[] {
			   "documentation", "Issue severities are defined under engineer/[organization](Organization.html)."
		   });
		addAnnotation
		  (getEngineer_Rate(),
		   source,
		   new String[] {
			   "documentation", "Default engineer rate. Can be customized in capacity."
		   });
		addAnnotation
		  (getEngineer_Designations(),
		   source,
		   new String[] {
			   "documentation", "Allocations of this [engineer](Engineer.html)\'s [capacity](Capacity.html) to work on an [engineered element](EngineeredElement.hml) [issues](Issue.html) for a particular [endeavor](Endeavor.html) and [issue category](IssueCategory.html)."
		   });
		addAnnotation
		  (getEngineer_Capacity(),
		   source,
		   new String[] {
			   "documentation", "Engineer\'s capacity for a particular [endeavor](Endeavor.html)"
		   });
		addAnnotation
		  (getEngineer_Represents(),
		   source,
		   new String[] {
			   "documentation", "Personas which this engineer represents."
		   });
		addAnnotation
		  (getEngineer_Messages(),
		   source,
		   new String[] {
			   "documentation", "Discussion messages authored by this engineer."
		   });
		addAnnotation
		  (getEngineer_Objectives(),
		   source,
		   new String[] {
			   "documentation", "Engineer\'s objectives for a particular [endeavor](Endeavor.html)"
		   });
		addAnnotation
		  (getEngineer_Domains(),
		   source,
		   new String[] {
			   "documentation", "Engineer\'s domains"
		   });
		addAnnotation
		  (getDomain_Elements(),
		   source,
		   new String[] {
			   "documentation", "Domain elements"
		   });
		addAnnotation
		  (getOrganization_Engineers(),
		   source,
		   new String[] {
			   "documentation", "Members of this organization."
		   });
		addAnnotation
		  (getModule_Modules(),
		   source,
		   new String[] {
			   "documentation", "Sub-modules of this module."
		   });
		addAnnotation
		  (getModule_Dependencies(),
		   source,
		   new String[] {
			   "documentation", "Modules which this module depends on."
		   });
		addAnnotation
		  (getModule_Dependants(),
		   source,
		   new String[] {
			   "documentation", "Derived opposite to dependencies - modules which depend on this module."
		   });
		addAnnotation
		  (getProduct_Releases(),
		   source,
		   new String[] {
			   "documentation", "Product releases."
		   });
		addAnnotation
		  (getProduct_Features(),
		   source,
		   new String[] {
			   "documentation", "Product features."
		   });
		addAnnotation
		  (getCapability_RequiredBy(),
		   source,
		   new String[] {
			   "documentation", "Issues requiring this capability."
		   });
		addAnnotation
		  (getCapability_Available(),
		   source,
		   new String[] {
			   "documentation", "Indicates that this capability is available and [issues](Issue.html) which require it are workable, unless they have other unavailable requirements."
		   });
		addAnnotation
		  (getEngineeredCapability_Releases(),
		   source,
		   new String[] {
			   "documentation", "Engineered capability can be planned for zero or more releases."
		   });
		addAnnotation
		  (getRelease_Increment(),
		   source,
		   new String[] {
			   "documentation", "Increment for which this release is scheduled."
		   });
		addAnnotation
		  (getRelease_Capabilities(),
		   source,
		   new String[] {
			   "documentation", "Engineered capabilities planned for this release."
		   });
		addAnnotation
		  (getFeature_Issues(),
		   source,
		   new String[] {
			   "documentation", "Issues contributing to this feature."
		   });
		addAnnotation
		  (getFeature_Children(),
		   source,
		   new String[] {
			   "documentation", "Features can be organized into a hierarchy."
		   });
		addAnnotation
		  (getDirectory_Elements(),
		   source,
		   new String[] {
			   "documentation", "Directory elements."
		   });
		addAnnotation
		  (getCapacity_Endeavor(),
		   source,
		   new String[] {
			   "documentation", "Endeavor for which containing [engineer](Engineer.html) has this capacity for."
		   });
		addAnnotation
		  (getCapacity_Effort(),
		   source,
		   new String[] {
			   "documentation", "For capacitly - amount of effort which the containing [engineer](Engineer.html) can spend on the capacity\'s [endeavor](Endeavor.html). For allocation - amount of effort which allocation\'s engineer can spend on the containing [engineered element](EngineeredElement.html) and, optionally, [issue category](IssueCategory.html)."
		   });
		addAnnotation
		  (getCapacity_Funds(),
		   source,
		   new String[] {
			   "documentation", "For capacitly - monetary amount which the containing [engineer](Engineer.html) can spend on the capacity\'s [endeavor](Endeavor.html). For allocation - monetary amount which allocation\'s engineer can spend on the containing [engineered element](EngineeredElement.html) and, optionally, [issue category](IssueCategory.html)."
		   });
		addAnnotation
		  (getCapacity_Rate(),
		   source,
		   new String[] {
			   "documentation", "For effort capacity, containing [engineer](Engineer.html) rate, if different from the engineer\'s default rate."
		   });
		addAnnotation
		  (getAllocation_Engineer(),
		   source,
		   new String[] {
			   "documentation", "Engineer whose capacity is allocated to work on the containing [engineered element](EngineeredElement.html)."
		   });
		addAnnotation
		  (getAllocation_Category(),
		   source,
		   new String[] {
			   "documentation", "Optional issue category for this allocation. E.g. a allocation can be made to \"Documentation\" or \"Test coverage\" categories."
		   });
		addAnnotation
		  (getAim_Alignments(),
		   source,
		   new String[] {
			   "documentation", "Alignments to this aim. "
		   });
		addAnnotation
		  (getPrinciple_Children(),
		   source,
		   new String[] {
			   "documentation", "Principles can be nested. E.g. Architectural Principles may contain Data Architecture principles."
		   });
		addAnnotation
		  (getAlignment_Aim(),
		   source,
		   new String[] {
			   "documentation", "Aim to which the containing element, e.g. [endeavor](Endeavor.html) aligns."
		   });
		addAnnotation
		  (getAlignment_Weight(),
		   source,
		   new String[] {
			   "documentation", "Alignment weight can be used with [Objective](Objective.html) and [KeyResult](KeyResult.html) aims to indicate how much the containing endeavor contributes to completion of the aim."
		   });
		addAnnotation
		  (getGoal_Children(),
		   source,
		   new String[] {
			   "documentation", "[Persona](Persona.html) goals can be nested."
		   });
		addAnnotation
		  (getMessage_Date(),
		   source,
		   new String[] {
			   "documentation", "Date/time when this message was posted."
		   });
		addAnnotation
		  (getMessage_Author(),
		   source,
		   new String[] {
			   "documentation", "Message author."
		   });
		addAnnotation
		  (getTopic_Messages(),
		   source,
		   new String[] {
			   "documentation", "Messages in this topic."
		   });
		addAnnotation
		  (getNamedElementReference_Target(),
		   source,
		   new String[] {
			   "documentation", "Reference target"
		   });
		addAnnotation
		  (getLink_Target(),
		   source,
		   new String[] {
			   "documentation", "Target URL"
		   });
		addAnnotation
		  (getKeyResult_Weight(),
		   source,
		   new String[] {
			   "documentation", "Indicates how much this key result or [objective](Objective.html) contributes to completion of the containing or parent objective."
		   });
		addAnnotation
		  (getKeyResult_Completion(),
		   source,
		   new String[] {
			   "documentation", "Number between 0 and 1. Computed from alignments for key results and for alignments, key results, and sub-objectives for [objectives](Objective.html)"
		   });
		addAnnotation
		  (getKeyResult_Initiatives(),
		   source,
		   new String[] {
			   "documentation", "What needs to be done to achieve the containing Key Result."
		   });
		addAnnotation
		  (getObjective_Endeavor(),
		   source,
		   new String[] {
			   "documentation", "Endeavor for which containing [engineer](Engineer.html) has this objective for. E.g. \"Achieve XYZ in Q2\". Objectives can also be contained in endeavors directly. In this case they are assumed to be objectives of the assignee."
		   });
		addAnnotation
		  (getObjective_KeyResults(),
		   source,
		   new String[] {
			   "documentation", "Key results for this objective."
		   });
		addAnnotation
		  (getObjective_Children(),
		   source,
		   new String[] {
			   "documentation", "Sub-objectives of this objective."
		   });
		addAnnotation
		  (getObjective_Parent(),
		   source,
		   new String[] {
			   "documentation", "Objective can be linked to a parent objective it is not already a child of objective, i.e. is contained by an [engineer](Engineer.html) or [endeavor](Endeavor.html)."
		   });
		addAnnotation
		  (getObjective_LinkedObjectives(),
		   source,
		   new String[] {
			   "documentation", "Objectives linked to this one via the ``parent`` reference."
		   });
		addAnnotation
		  (getObjective_SubObjectives(),
		   source,
		   new String[] {
			   "documentation", "A union of children and linked objectives."
		   });
		addAnnotation
		  (getDecision_EffectiveStart(),
		   source,
		   new String[] {
			   "documentation", "Date when this decision goes into effect once it is available (done). If not set, decision goes into effect once it is in a done status."
		   });
		addAnnotation
		  (getDecision_EffectiveEnd(),
		   source,
		   new String[] {
			   "documentation", "Date when decision stops being in effect if it was in effect before. If not set, the decision is effective indefinitely if it is in a done status."
		   });
		addAnnotation
		  (getDecision_Supercedes(),
		   source,
		   new String[] {
			   "documentation", "Decisions which this decision supercedes once (if ever) it goes into effect."
		   });
		addAnnotation
		  (getDecision_SupercededBy(),
		   source,
		   new String[] {
			   "documentation", "Decisions which (will) supercede this decision when (if ever) they are effective."
		   });
		addAnnotation
		  (getDecision_Resolution(),
		   source,
		   new String[] {
			   "documentation", "Documentation of what has been decided (decision process outcome)."
		   });
		addAnnotation
		  (productOrganizationEClass,
		   source,
		   new String[] {
			   "documentation", "An organization has some properties of a product - features and releases. E.g. an IT department may be a product organization delivering value to its larger organization as features organized into releases. In this regard a feature is an organizational capability."
		   });
		addAnnotation
		  (getProductOrganization_Releases(),
		   source,
		   new String[] {
			   "documentation", "Product organization releases."
		   });
		addAnnotation
		  (getProductOrganization_Features(),
		   source,
		   new String[] {
			   "documentation", "Product organization features."
		   });
		addAnnotation
		  (getInterface_Children(),
		   source,
		   new String[] {
			   "documentation", "Interfaces can be nested. For example, a TCP/IP interface may have an REST interface at port 443 as its child and that interface may have multiple endpoints at different paths. Similarly, there might be a messaging interface at a different port with multiple destination endpoints."
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
		  (modelElementEClass,
		   source,
		   new String[] {
			   "constraints", "path"
		   });
		addAnnotation
		  (endeavorEClass,
		   source,
		   new String[] {
			   "constraints", "capacity children"
		   });
		addAnnotation
		  (incrementEClass,
		   source,
		   new String[] {
			   "constraints", "nesting"
		   });
		addAnnotation
		  (issueEClass,
		   source,
		   new String[] {
			   "constraints", "increment"
		   });
		addAnnotation
		  (engineeredElementEClass,
		   source,
		   new String[] {
			   "constraints", "capacity"
		   });
		addAnnotation
		  (engineerEClass,
		   source,
		   new String[] {
			   "constraints", "capacity start_end"
		   });
		addAnnotation
		  (releaseEClass,
		   source,
		   new String[] {
			   "constraints", "increment"
		   });
	}

} //EngineeringPackageImpl
