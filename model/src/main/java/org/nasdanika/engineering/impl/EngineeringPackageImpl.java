/**
 */
package org.nasdanika.engineering.impl;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.common.Adaptable;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignable;
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
import org.nasdanika.engineering.EngineeredElement;
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
import org.nasdanika.engineering.ModelElement;
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
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.flow.impl.FlowPackageImpl;
import org.nasdanika.engineering.representation.RepresentationPackage;
import org.nasdanika.engineering.representation.impl.RepresentationPackageImpl;
import org.nasdanika.engineering.util.EngineeringValidator;
import org.nasdanika.html.app.SectionStyle;

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
	private EClass tableOfContentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

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
	private EClass packageAppearanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageAppearanceEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appearanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appearanceEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementAppearanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementAppearanceEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberAppearanceEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberAppearanceEClass = null;

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
	private EDataType durationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instantEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sectionStyleEDataType = null;

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

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI);
		RepresentationPackageImpl theRepresentationPackage = (RepresentationPackageImpl)(registeredPackage instanceof RepresentationPackageImpl ? registeredPackage : RepresentationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);
		FlowPackageImpl theFlowPackage = (FlowPackageImpl)(registeredPackage instanceof FlowPackageImpl ? registeredPackage : FlowPackage.eINSTANCE);

		// Create package meta-data objects
		theEngineeringPackage.createPackageContents();
		theRepresentationPackage.createPackageContents();
		theFlowPackage.createPackageContents();

		// Initialize created meta-data
		theEngineeringPackage.initializePackageContents();
		theRepresentationPackage.initializePackageContents();
		theFlowPackage.initializePackageContents();

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
	public EAttribute getModelElement_Uri() {
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
	public EAttribute getModelElement_MarkdownDescription() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(3);
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
	public EReference getModelElement_Appearance() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_TableOfContents() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Sections() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Representations() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(8);
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
	public EClass getTemporal() {
		return temporalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporal_Instant() {
		return (EAttribute)temporalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporal_Base() {
		return (EReference)temporalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporal_Offset() {
		return (EAttribute)temporalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporal_Derivatives() {
		return (EReference)temporalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporal_LowerBounds() {
		return (EReference)temporalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporal_UpperBounds() {
		return (EReference)temporalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTemporal__After__Temporal() {
		return temporalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTemporal__Before__Temporal() {
		return temporalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTemporal__Coincides__Temporal() {
		return temporalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTemporal__Normalize() {
		return temporalEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTemporal__Minus__Temporal() {
		return temporalEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTemporal__Minus__Duration() {
		return temporalEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTemporal__Plus__Duration() {
		return temporalEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriod() {
		return periodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriod_Start() {
		return (EReference)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriod_End() {
		return (EReference)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeriod_Duration() {
		return (EAttribute)periodEClass.getEStructuralFeatures().get(2);
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
	public EClass getPersona() {
		return personaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_JourneyElements() {
		return (EReference)personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Goals() {
		return (EReference)personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Representatives() {
		return (EReference)personaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Extends() {
		return (EReference)personaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Extensions() {
		return (EReference)personaEClass.getEStructuralFeatures().get(4);
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
	public EReference getRelease_Issues() {
		return (EReference)releaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelease_Features() {
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
	public EReference getFeature_Releases() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Activities() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Issues() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Uses() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
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
	public EReference getIssue_Releases() {
		return (EReference)issueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Effort() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Cost() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_RemainingEffort() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_RemainingCost() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Priority() {
		return (EReference)issueEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Severity() {
		return (EReference)issueEClass.getEStructuralFeatures().get(15);
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
	public EClass getPackageAppearance() {
		return packageAppearanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageAppearance_ModelElements() {
		return (EReference)packageAppearanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageAppearance_SubPackages() {
		return (EReference)packageAppearanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageAppearanceEntry() {
		return packageAppearanceEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageAppearanceEntry_Key() {
		return (EAttribute)packageAppearanceEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageAppearanceEntry_Value() {
		return (EReference)packageAppearanceEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppearance() {
		return appearanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppearance_Label() {
		return (EAttribute)appearanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppearance_Icon() {
		return (EAttribute)appearanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppearance_Description() {
		return (EAttribute)appearanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppearance_MarkdownDescription() {
		return (EAttribute)appearanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppearance_Roles() {
		return (EAttribute)appearanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppearance_SectionStyle() {
		return (EAttribute)appearanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppearanceEntry() {
		return appearanceEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppearanceEntry_Key() {
		return (EAttribute)appearanceEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppearanceEntry_Value() {
		return (EReference)appearanceEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElementAppearance() {
		return modelElementAppearanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElementAppearance_Features() {
		return (EReference)modelElementAppearanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElementAppearance_Operations() {
		return (EReference)modelElementAppearanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElementAppearance_Actions() {
		return (EReference)modelElementAppearanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElementAppearanceEntry() {
		return modelElementAppearanceEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElementAppearanceEntry_Key() {
		return (EAttribute)modelElementAppearanceEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElementAppearanceEntry_Value() {
		return (EReference)modelElementAppearanceEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberAppearanceEntry() {
		return memberAppearanceEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberAppearanceEntry_Key() {
		return (EAttribute)memberAppearanceEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberAppearanceEntry_Value() {
		return (EReference)memberAppearanceEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberAppearance() {
		return memberAppearanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberAppearance_Category() {
		return (EAttribute)memberAppearanceEClass.getEStructuralFeatures().get(0);
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
	public EDataType getDuration() {
		return durationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInstant() {
		return instantEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocument_Content() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocument_MarkdownContent() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSectionStyle() {
		return sectionStyleEDataType;
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
		adaptableEClass = createEClass(ADAPTABLE);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__URI);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__PATH);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__MARKDOWN_DESCRIPTION);
		createEReference(modelElementEClass, MODEL_ELEMENT__RESOURCES);
		createEReference(modelElementEClass, MODEL_ELEMENT__APPEARANCE);
		createEReference(modelElementEClass, MODEL_ELEMENT__TABLE_OF_CONTENTS);
		createEReference(modelElementEClass, MODEL_ELEMENT__SECTIONS);
		createEReference(modelElementEClass, MODEL_ELEMENT__REPRESENTATIONS);

		tableOfContentsEClass = createEClass(TABLE_OF_CONTENTS);
		createEAttribute(tableOfContentsEClass, TABLE_OF_CONTENTS__ROLE);
		createEAttribute(tableOfContentsEClass, TABLE_OF_CONTENTS__DEPTH);
		createEAttribute(tableOfContentsEClass, TABLE_OF_CONTENTS__HEADER);

		temporalEClass = createEClass(TEMPORAL);
		createEAttribute(temporalEClass, TEMPORAL__INSTANT);
		createEReference(temporalEClass, TEMPORAL__BASE);
		createEAttribute(temporalEClass, TEMPORAL__OFFSET);
		createEReference(temporalEClass, TEMPORAL__DERIVATIVES);
		createEReference(temporalEClass, TEMPORAL__LOWER_BOUNDS);
		createEReference(temporalEClass, TEMPORAL__UPPER_BOUNDS);
		createEOperation(temporalEClass, TEMPORAL___AFTER__TEMPORAL);
		createEOperation(temporalEClass, TEMPORAL___BEFORE__TEMPORAL);
		createEOperation(temporalEClass, TEMPORAL___COINCIDES__TEMPORAL);
		createEOperation(temporalEClass, TEMPORAL___NORMALIZE);
		createEOperation(temporalEClass, TEMPORAL___MINUS__TEMPORAL);
		createEOperation(temporalEClass, TEMPORAL___MINUS__DURATION);
		createEOperation(temporalEClass, TEMPORAL___PLUS__DURATION);

		periodEClass = createEClass(PERIOD);
		createEReference(periodEClass, PERIOD__START);
		createEReference(periodEClass, PERIOD__END);
		createEAttribute(periodEClass, PERIOD__DURATION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		eventEClass = createEClass(EVENT);

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
		createEReference(issueEClass, ISSUE__RELEASES);
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

		engineeredElementEClass = createEClass(ENGINEERED_ELEMENT);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__ISSUES);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__OWNERS);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__EXPERTS);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__ALLOCATIONS);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__PRINCIPLES);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__ALL_ISSUES);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__CONTENT);
		createEAttribute(documentEClass, DOCUMENT__MARKDOWN_CONTENT);

		personaEClass = createEClass(PERSONA);
		createEReference(personaEClass, PERSONA__JOURNEY_ELEMENTS);
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

		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__ENGINEERS);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODULES);
		createEReference(moduleEClass, MODULE__DEPENDENCIES);
		createEReference(moduleEClass, MODULE__DEPENDANTS);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__RELEASES);
		createEReference(productEClass, PRODUCT__FEATURES);
		createEReference(productEClass, PRODUCT__ACTIVITIES);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__REQUIRED_BY);
		createEAttribute(capabilityEClass, CAPABILITY__AVAILABLE);

		engineeredCapabilityEClass = createEClass(ENGINEERED_CAPABILITY);

		releaseEClass = createEClass(RELEASE);
		createEReference(releaseEClass, RELEASE__INCREMENT);
		createEReference(releaseEClass, RELEASE__FEATURES);
		createEReference(releaseEClass, RELEASE__ISSUES);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__RELEASES);
		createEReference(featureEClass, FEATURE__ACTIVITIES);
		createEReference(featureEClass, FEATURE__ISSUES);
		createEReference(featureEClass, FEATURE__USES);

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

		alignableEClass = createEClass(ALIGNABLE);
		createEReference(alignableEClass, ALIGNABLE__ALIGNS);

		aimEClass = createEClass(AIM);
		createEReference(aimEClass, AIM__ALIGNMENTS);

		principleEClass = createEClass(PRINCIPLE);
		createEReference(principleEClass, PRINCIPLE__CHILDREN);

		alignmentEClass = createEClass(ALIGNMENT);
		createEReference(alignmentEClass, ALIGNMENT__AIM);
		createEAttribute(alignmentEClass, ALIGNMENT__WEIGHT);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__CHILDREN);

		forumEClass = createEClass(FORUM);
		createEReference(forumEClass, FORUM__DISCUSSION);
		createEReference(forumEClass, FORUM__TOPICS);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__DATE);
		createEReference(messageEClass, MESSAGE__AUTHOR);

		topicEClass = createEClass(TOPIC);
		createEReference(topicEClass, TOPIC__MESSAGES);

		packageAppearanceEClass = createEClass(PACKAGE_APPEARANCE);
		createEReference(packageAppearanceEClass, PACKAGE_APPEARANCE__MODEL_ELEMENTS);
		createEReference(packageAppearanceEClass, PACKAGE_APPEARANCE__SUB_PACKAGES);

		packageAppearanceEntryEClass = createEClass(PACKAGE_APPEARANCE_ENTRY);
		createEAttribute(packageAppearanceEntryEClass, PACKAGE_APPEARANCE_ENTRY__KEY);
		createEReference(packageAppearanceEntryEClass, PACKAGE_APPEARANCE_ENTRY__VALUE);

		appearanceEClass = createEClass(APPEARANCE);
		createEAttribute(appearanceEClass, APPEARANCE__LABEL);
		createEAttribute(appearanceEClass, APPEARANCE__ICON);
		createEAttribute(appearanceEClass, APPEARANCE__DESCRIPTION);
		createEAttribute(appearanceEClass, APPEARANCE__MARKDOWN_DESCRIPTION);
		createEAttribute(appearanceEClass, APPEARANCE__ROLES);
		createEAttribute(appearanceEClass, APPEARANCE__SECTION_STYLE);

		appearanceEntryEClass = createEClass(APPEARANCE_ENTRY);
		createEAttribute(appearanceEntryEClass, APPEARANCE_ENTRY__KEY);
		createEReference(appearanceEntryEClass, APPEARANCE_ENTRY__VALUE);

		modelElementAppearanceEClass = createEClass(MODEL_ELEMENT_APPEARANCE);
		createEReference(modelElementAppearanceEClass, MODEL_ELEMENT_APPEARANCE__FEATURES);
		createEReference(modelElementAppearanceEClass, MODEL_ELEMENT_APPEARANCE__OPERATIONS);
		createEReference(modelElementAppearanceEClass, MODEL_ELEMENT_APPEARANCE__ACTIONS);

		modelElementAppearanceEntryEClass = createEClass(MODEL_ELEMENT_APPEARANCE_ENTRY);
		createEAttribute(modelElementAppearanceEntryEClass, MODEL_ELEMENT_APPEARANCE_ENTRY__KEY);
		createEReference(modelElementAppearanceEntryEClass, MODEL_ELEMENT_APPEARANCE_ENTRY__VALUE);

		memberAppearanceEntryEClass = createEClass(MEMBER_APPEARANCE_ENTRY);
		createEAttribute(memberAppearanceEntryEClass, MEMBER_APPEARANCE_ENTRY__KEY);
		createEReference(memberAppearanceEntryEClass, MEMBER_APPEARANCE_ENTRY__VALUE);

		memberAppearanceEClass = createEClass(MEMBER_APPEARANCE);
		createEAttribute(memberAppearanceEClass, MEMBER_APPEARANCE__CATEGORY);

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

		// Create data types
		durationEDataType = createEDataType(DURATION);
		instantEDataType = createEDataType(INSTANT);
		sectionStyleEDataType = createEDataType(SECTION_STYLE);
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
		RepresentationPackage theRepresentationPackage = (RepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI);
		FlowPackage theFlowPackage = (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRepresentationPackage);
		getESubpackages().add(theFlowPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelElementEClass.getESuperTypes().add(this.getAdaptable());
		temporalEClass.getESuperTypes().add(this.getModelElement());
		periodEClass.getESuperTypes().add(this.getModelElement());
		namedElementEClass.getESuperTypes().add(this.getModelElement());
		eventEClass.getESuperTypes().add(this.getNamedElement());
		eventEClass.getESuperTypes().add(this.getTemporal());
		endeavorEClass.getESuperTypes().add(this.getPeriod());
		endeavorEClass.getESuperTypes().add(this.getAlignable());
		incrementEClass.getESuperTypes().add(this.getNamedElement());
		incrementEClass.getESuperTypes().add(this.getEndeavor());
		issueCategoryEClass.getESuperTypes().add(this.getAim());
		issueStatusEClass.getESuperTypes().add(this.getNamedElement());
		issuePriorityEClass.getESuperTypes().add(this.getNamedElement());
		issueSeverityEClass.getESuperTypes().add(this.getNamedElement());
		issueEClass.getESuperTypes().add(this.getEngineeredCapability());
		noteEClass.getESuperTypes().add(this.getModelElement());
		engineeredElementEClass.getESuperTypes().add(this.getForum());
		engineeredElementEClass.getESuperTypes().add(this.getPeriod());
		documentEClass.getESuperTypes().add(this.getEngineeredElement());
		personaEClass.getESuperTypes().add(this.getEngineeredElement());
		engineerEClass.getESuperTypes().add(this.getPersona());
		organizationEClass.getESuperTypes().add(this.getEngineer());
		moduleEClass.getESuperTypes().add(this.getEngineeredElement());
		productEClass.getESuperTypes().add(this.getModule());
		capabilityEClass.getESuperTypes().add(this.getNamedElement());
		capabilityEClass.getESuperTypes().add(this.getPeriod());
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
		forumEClass.getESuperTypes().add(this.getNamedElement());
		messageEClass.getESuperTypes().add(this.getNamedElement());
		topicEClass.getESuperTypes().add(this.getMessage());
		modelElementAppearanceEClass.getESuperTypes().add(this.getAppearance());
		memberAppearanceEClass.getESuperTypes().add(this.getAppearance());
		namedElementReferenceEClass.getESuperTypes().add(this.getNamedElement());
		linkEClass.getESuperTypes().add(this.getNamedElement());
		keyResultEClass.getESuperTypes().add(this.getAim());
		objectiveEClass.getESuperTypes().add(this.getKeyResult());
		decisionEClass.getESuperTypes().add(this.getIssue());
		decisionEClass.getESuperTypes().add(this.getAim());

		// Initialize classes, features, and operations; add parameters
		initEClass(adaptableEClass, Adaptable.class, "Adaptable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Path(), ecorePackage.getEString(), "path", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_MarkdownDescription(), ecorePackage.getEString(), "markdownDescription", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Resources(), this.getNamedElement(), null, "resources", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Appearance(), this.getModelElementAppearance(), null, "appearance", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_TableOfContents(), this.getTableOfContents(), null, "tableOfContents", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Sections(), this.getDocument(), null, "sections", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Representations(), this.getNamedElement(), null, "representations", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableOfContentsEClass, TableOfContents.class, "TableOfContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableOfContents_Role(), ecorePackage.getEString(), "role", null, 0, 1, TableOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOfContents_Depth(), ecorePackage.getEInt(), "depth", null, 0, 1, TableOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOfContents_Header(), ecorePackage.getEString(), "header", null, 0, 1, TableOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalEClass, Temporal.class, "Temporal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporal_Instant(), this.getInstant(), "instant", null, 0, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporal_Base(), this.getTemporal(), this.getTemporal_Derivatives(), "base", null, 0, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporal_Offset(), this.getDuration(), "offset", null, 0, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporal_Derivatives(), this.getTemporal(), this.getTemporal_Base(), "derivatives", null, 0, -1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTemporal_LowerBounds(), this.getTemporal(), null, "lowerBounds", null, 0, -1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporal_UpperBounds(), this.getTemporal(), null, "upperBounds", null, 0, -1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTemporal__After__Temporal(), ecorePackage.getEBooleanObject(), "after", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTemporal(), "when", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTemporal__Before__Temporal(), ecorePackage.getEBooleanObject(), "before", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTemporal(), "when", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTemporal__Coincides__Temporal(), ecorePackage.getEBooleanObject(), "coincides", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTemporal(), "when", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTemporal__Normalize(), this.getTemporal(), "normalize", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTemporal__Minus__Temporal(), this.getDuration(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTemporal(), "when", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTemporal__Minus__Duration(), this.getTemporal(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTemporal__Plus__Duration(), this.getTemporal(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriod_Start(), this.getTemporal(), null, "start", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriod_End(), this.getTemporal(), null, "end", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriod_Duration(), this.getDuration(), "duration", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endeavorEClass, Endeavor.class, "Endeavor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndeavor_Completion(), ecorePackage.getEDouble(), "completion", null, 0, 1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndeavor_Benefit(), ecorePackage.getEDouble(), "benefit", null, 0, 1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndeavor_TotalCost(), ecorePackage.getEDouble(), "totalCost", null, 0, 1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_Assignee(), this.getEngineer(), this.getEngineer_Assignments(), "assignee", null, 0, 1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_AllIssues(), this.getIssue(), null, "allIssues", null, 0, -1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_Capacity(), this.getCapacity(), this.getCapacity_Endeavor(), "capacity", null, 0, -1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_Objectives(), this.getObjective(), null, "objectives", null, 0, -1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_LinkedObjectives(), this.getObjective(), this.getObjective_Endeavor(), "linkedObjectives", null, 0, -1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndeavor_AllObjectives(), this.getObjective(), null, "allObjectives", null, 0, -1, Endeavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(incrementEClass, Increment.class, "Increment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncrement_Children(), this.getIncrement(), null, "children", null, 0, -1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncrement_Issues(), this.getIssue(), this.getIssue_Increment(), "issues", null, 0, -1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIncrement_Releases(), this.getRelease(), this.getRelease_Increment(), "releases", null, 0, -1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(issueCategoryEClass, IssueCategory.class, "IssueCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssueCategory_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, IssueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssueCategory_Issues(), this.getIssue(), this.getIssue_Categories(), "issues", null, 0, -1, IssueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssueCategory_Cumulative(), ecorePackage.getEBoolean(), "cumulative", null, 0, 1, IssueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssueCategory_Allocations(), this.getAllocation(), this.getAllocation_Category(), "allocations", null, 0, -1, IssueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(issueStatusEClass, IssueStatus.class, "IssueStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssueStatus_Issues(), this.getIssue(), this.getIssue_Status(), "issues", null, 0, -1, IssueStatus.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssueStatus_Done(), ecorePackage.getEBoolean(), "done", null, 0, 1, IssueStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issuePriorityEClass, IssuePriority.class, "IssuePriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssuePriority_Issues(), this.getIssue(), this.getIssue_Priority(), "issues", null, 0, -1, IssuePriority.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(issueSeverityEClass, IssueSeverity.class, "IssueSeverity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssueSeverity_Issues(), this.getIssue(), this.getIssue_Severity(), "issues", null, 0, -1, IssueSeverity.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssue_Children(), this.getIssue(), null, "children", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Requires(), this.getCapability(), this.getCapability_RequiredBy(), "requires", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Increment(), this.getIncrement(), this.getIncrement_Issues(), "increment", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_ContributesTo(), this.getFeature(), this.getFeature_Issues(), "contributesTo", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Notes(), this.getNote(), null, "notes", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Categories(), this.getIssueCategory(), this.getIssueCategory_Issues(), "categories", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Target(), this.getEngineeredElement(), null, "target", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Status(), this.getIssueStatus(), this.getIssueStatus_Issues(), "status", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Workable(), ecorePackage.getEBoolean(), "workable", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Releases(), this.getRelease(), this.getRelease_Issues(), "releases", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Effort(), ecorePackage.getEDouble(), "effort", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Cost(), ecorePackage.getEDouble(), "cost", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_RemainingEffort(), ecorePackage.getEDouble(), "remainingEffort", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_RemainingCost(), ecorePackage.getEDouble(), "remainingCost", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Priority(), this.getIssuePriority(), this.getIssuePriority_Issues(), "priority", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Severity(), this.getIssueSeverity(), this.getIssueSeverity_Issues(), "severity", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNote_Author(), this.getEngineer(), null, "author", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Effort(), ecorePackage.getEDouble(), "effort", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Cost(), ecorePackage.getEDouble(), "cost", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_RemainingEffort(), ecorePackage.getEDouble(), "remainingEffort", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_RemainingCost(), ecorePackage.getEDouble(), "remainingCost", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNote_Status(), this.getIssueStatus(), null, "status", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineeredElementEClass, EngineeredElement.class, "EngineeredElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeredElement_Issues(), this.getIssue(), null, "issues", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_Owners(), this.getEngineer(), this.getEngineer_Owns(), "owners", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_Experts(), this.getEngineer(), this.getEngineer_Expertise(), "experts", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_Allocations(), this.getAllocation(), null, "allocations", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_Principles(), this.getPrinciple(), null, "principles", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_AllIssues(), this.getIssue(), null, "allIssues", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Content(), ecorePackage.getEString(), "content", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_MarkdownContent(), ecorePackage.getEString(), "markdownContent", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersona_JourneyElements(), theFlowPackage.getJourneyElement(), theFlowPackage.getJourneyElement_Personas(), "journeyElements", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Goals(), this.getGoal(), null, "goals", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Representatives(), this.getEngineer(), this.getEngineer_Represents(), "representatives", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Extends(), this.getPersona(), this.getPersona_Extensions(), "extends", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Extensions(), this.getPersona(), this.getPersona_Extends(), "extensions", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(engineerEClass, Engineer.class, "Engineer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineer_Modules(), this.getModule(), null, "modules", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Owns(), this.getEngineeredElement(), this.getEngineeredElement_Owners(), "owns", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Expertise(), this.getEngineeredElement(), this.getEngineeredElement_Experts(), "expertise", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Increments(), this.getIncrement(), null, "increments", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Services(), theFlowPackage.getActivity(), null, "services", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Personas(), this.getPersona(), null, "personas", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Assignments(), this.getEndeavor(), this.getEndeavor_Assignee(), "assignments", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_IssueCategories(), this.getIssueCategory(), null, "issueCategories", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_IssueStatuses(), this.getIssueStatus(), null, "issueStatuses", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_IssuePriorities(), this.getIssuePriority(), null, "issuePriorities", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_IssueSeverities(), this.getIssueSeverity(), null, "issueSeverities", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngineer_Rate(), ecorePackage.getEDouble(), "rate", "1", 0, 1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Designations(), this.getAllocation(), this.getAllocation_Engineer(), "designations", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Capacity(), this.getCapacity(), null, "capacity", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Represents(), this.getPersona(), this.getPersona_Representatives(), "represents", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Messages(), this.getMessage(), this.getMessage_Author(), "messages", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Objectives(), this.getObjective(), null, "objectives", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_Engineers(), this.getEngineer(), null, "engineers", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, org.nasdanika.engineering.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Modules(), this.getModule(), null, "modules", null, 0, -1, org.nasdanika.engineering.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Dependencies(), this.getModule(), this.getModule_Dependants(), "dependencies", null, 0, -1, org.nasdanika.engineering.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Dependants(), this.getModule(), this.getModule_Dependencies(), "dependants", null, 0, -1, org.nasdanika.engineering.Module.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Releases(), this.getRelease(), null, "releases", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Features(), this.getFeature(), null, "features", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Activities(), theFlowPackage.getActivity(), null, "activities", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_RequiredBy(), this.getIssue(), this.getIssue_Requires(), "requiredBy", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_Available(), ecorePackage.getEBoolean(), "available", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineeredCapabilityEClass, EngineeredCapability.class, "EngineeredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelease_Increment(), this.getIncrement(), this.getIncrement_Releases(), "increment", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelease_Features(), this.getFeature(), this.getFeature_Releases(), "features", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelease_Issues(), this.getIssue(), this.getIssue_Releases(), "issues", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Releases(), this.getRelease(), this.getRelease_Features(), "releases", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Activities(), theFlowPackage.getActivity(), null, "activities", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Issues(), this.getIssue(), this.getIssue_ContributesTo(), "issues", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Uses(), theFlowPackage.getActivity(), theFlowPackage.getActivity_Features(), "uses", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(directoryEClass, Directory.class, "Directory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectory_Elements(), this.getNamedElement(), null, "elements", null, 0, -1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capacityEClass, Capacity.class, "Capacity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapacity_Endeavor(), this.getEndeavor(), this.getEndeavor_Capacity(), "endeavor", null, 1, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Effort(), ecorePackage.getEDouble(), "effort", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Funds(), ecorePackage.getEDouble(), "funds", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Rate(), ecorePackage.getEDouble(), "rate", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocation_Engineer(), this.getEngineer(), this.getEngineer_Designations(), "engineer", null, 1, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocation_Category(), this.getIssueCategory(), this.getIssueCategory_Allocations(), "category", null, 0, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alignableEClass, Alignable.class, "Alignable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlignable_Aligns(), this.getAlignment(), null, "aligns", null, 0, -1, Alignable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aimEClass, Aim.class, "Aim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAim_Alignments(), this.getAlignment(), this.getAlignment_Aim(), "alignments", null, 0, -1, Aim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(principleEClass, Principle.class, "Principle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrinciple_Children(), this.getPrinciple(), null, "children", null, 0, -1, Principle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alignmentEClass, Alignment.class, "Alignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlignment_Aim(), this.getAim(), this.getAim_Alignments(), "aim", null, 0, 1, Alignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlignment_Weight(), ecorePackage.getEDouble(), "weight", "1", 0, 1, Alignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_Children(), this.getGoal(), null, "children", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forumEClass, Forum.class, "Forum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForum_Discussion(), this.getForum(), null, "discussion", null, 0, -1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForum_Topics(), this.getTopic(), null, "topics", null, 0, -1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Author(), this.getEngineer(), this.getEngineer_Messages(), "author", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopic_Messages(), this.getMessage(), null, "messages", null, 0, -1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageAppearanceEClass, PackageAppearance.class, "PackageAppearance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageAppearance_ModelElements(), this.getModelElementAppearanceEntry(), null, "modelElements", null, 0, -1, PackageAppearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageAppearance_SubPackages(), this.getPackageAppearanceEntry(), null, "subPackages", null, 0, -1, PackageAppearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageAppearanceEntryEClass, Map.Entry.class, "PackageAppearanceEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageAppearanceEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageAppearanceEntry_Value(), this.getPackageAppearance(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appearanceEClass, Appearance.class, "Appearance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppearance_Label(), ecorePackage.getEString(), "label", null, 0, 1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearance_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearance_Description(), ecorePackage.getEString(), "description", null, 0, 1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearance_MarkdownDescription(), ecorePackage.getEString(), "markdownDescription", null, 0, 1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearance_Roles(), ecorePackage.getEString(), "roles", null, 0, -1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearance_SectionStyle(), this.getSectionStyle(), "sectionStyle", null, 0, 1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appearanceEntryEClass, Map.Entry.class, "AppearanceEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppearanceEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearanceEntry_Value(), this.getAppearance(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementAppearanceEClass, ModelElementAppearance.class, "ModelElementAppearance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElementAppearance_Features(), this.getMemberAppearanceEntry(), null, "features", null, 0, -1, ModelElementAppearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementAppearance_Operations(), this.getMemberAppearanceEntry(), null, "operations", null, 0, -1, ModelElementAppearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementAppearance_Actions(), this.getAppearanceEntry(), null, "actions", null, 0, -1, ModelElementAppearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementAppearanceEntryEClass, Map.Entry.class, "ModelElementAppearanceEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElementAppearanceEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementAppearanceEntry_Value(), this.getModelElementAppearance(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberAppearanceEntryEClass, Map.Entry.class, "MemberAppearanceEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemberAppearanceEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberAppearanceEntry_Value(), this.getMemberAppearance(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberAppearanceEClass, MemberAppearance.class, "MemberAppearance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemberAppearance_Category(), ecorePackage.getEBooleanObject(), "category", null, 0, 1, MemberAppearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementReferenceEClass, NamedElementReference.class, "NamedElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedElementReference_Target(), this.getNamedElement(), null, "target", null, 1, 1, NamedElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Target(), ecorePackage.getEString(), "target", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyResultEClass, KeyResult.class, "KeyResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyResult_Weight(), ecorePackage.getEDouble(), "weight", "1", 0, 1, KeyResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyResult_Completion(), ecorePackage.getEDouble(), "completion", null, 0, 1, KeyResult.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyResult_Initiatives(), this.getIssue(), null, "initiatives", null, 0, -1, KeyResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjective_Endeavor(), this.getEndeavor(), this.getEndeavor_LinkedObjectives(), "endeavor", null, 0, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_KeyResults(), this.getKeyResult(), null, "keyResults", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_Children(), this.getObjective(), null, "children", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_Parent(), this.getObjective(), this.getObjective_LinkedObjectives(), "parent", null, 0, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_LinkedObjectives(), this.getObjective(), this.getObjective_Parent(), "linkedObjectives", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_SubObjectives(), this.getObjective(), null, "subObjectives", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecision_EffectiveStart(), ecorePackage.getEDate(), "effectiveStart", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_EffectiveEnd(), ecorePackage.getEDate(), "effectiveEnd", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Supercedes(), this.getDecision(), this.getDecision_SupercededBy(), "supercedes", null, 0, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_SupercededBy(), this.getDecision(), this.getDecision_Supercedes(), "supercededBy", null, 0, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Resolution(), ecorePackage.getEString(), "resolution", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(durationEDataType, Duration.class, "Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(instantEDataType, Instant.class, "Instant", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sectionStyleEDataType, SectionStyle.class, "SectionStyle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (getModelElement_Path(),
		   source,
		   new String[] {
			   "load-key", "path"
		   });
		addAnnotation
		  (getModelElement_Appearance(),
		   source,
		   new String[] {
			   "homogenous", "true"
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
		  (temporalEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/temporal.md"
		   });
		addAnnotation
		  (getTemporal_Instant(),
		   source,
		   new String[] {
			   "default-feature", "true",
			   "exclusive-with", "base"
		   });
		addAnnotation
		  (getTemporal_Base(),
		   source,
		   new String[] {
			   "exclusive-with", "instant"
		   });
		addAnnotation
		  (getTemporal_LowerBounds(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getTemporal_UpperBounds(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (periodEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/period.md"
		   });
		addAnnotation
		  (getPeriod_Start(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getPeriod_End(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
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
		  (issueCategoryEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/issue-category.md"
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
		  (getIssue_Increment(),
		   source,
		   new String[] {
			   "homogenous", "true"
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
			   "homogenous", "true"
		   });
		addAnnotation
		  (getIssue_Releases(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getIssue_Priority(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getIssue_Severity(),
		   source,
		   new String[] {
			   "homogenous", "true"
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
		  (engineerEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/engineer.md",
			   "icon", "fas fa-user"
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
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getProduct_Features(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getProduct_Activities(),
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
		  (engineeredCapabilityEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/engineered-capability.md"
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
		  (aimEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/aim.md"
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
		  (messageEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/message.md"
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
		  (packageAppearanceEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/package-appearance.md"
		   });
		addAnnotation
		  (getPackageAppearance_ModelElements(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getPackageAppearance_SubPackages(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (packageAppearanceEntryEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/package-appearance-entry.md"
		   });
		addAnnotation
		  (getPackageAppearanceEntry_Value(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (appearanceEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/appearance.md"
		   });
		addAnnotation
		  (appearanceEntryEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/appearance-entry.md"
		   });
		addAnnotation
		  (getAppearanceEntry_Value(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (modelElementAppearanceEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/model-element-appearance.md"
		   });
		addAnnotation
		  (getModelElementAppearance_Features(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getModelElementAppearance_Operations(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (getModelElementAppearance_Actions(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (modelElementAppearanceEntryEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/model-element-appearance-entry.md"
		   });
		addAnnotation
		  (getModelElementAppearanceEntry_Value(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (memberAppearanceEntryEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/member-appearance-entry.md"
		   });
		addAnnotation
		  (getMemberAppearanceEntry_Value(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (memberAppearanceEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/member-appearance.md"
		   });
		addAnnotation
		  (sectionStyleEDataType,
		   source,
		   new String[] {
			   "documentation-reference", "doc/section-style.md"
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
		  (decisionEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/decision.md"
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
		  (getModelElement_Uri(),
		   source,
		   new String[] {
			   "documentation", "Element\'s URI is derived from ``path``, container URI, and containment reference. URI is used for cross-referencing of elements."
		   });
		addAnnotation
		  (getModelElement_Path(),
		   source,
		   new String[] {
			   "documentation", "Element\'s path to form full element URI and URL. Shall be unique in the containing collection. If blank, derived from element\'s position in the collection. For named elements is derived from element name.\nElement URL is formed by adding ``.html`` extension to the path if the model element\'s EClass doesn\'t have containment references and as such the element may not have children, and by adding ``/index.html`` otherwise."
		   });
		addAnnotation
		  (getModelElement_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in HTML."
		   });
		addAnnotation
		  (getModelElement_MarkdownDescription(),
		   source,
		   new String[] {
			   "documentation", "Description in [Markdown](https://en.wikipedia.org/wiki/Markdown)."
		   });
		addAnnotation
		  (getModelElement_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resources associated with the element, e.g. documentation."
		   });
		addAnnotation
		  (getModelElement_Sections(),
		   source,
		   new String[] {
			   "documentation", "Sections for model element descriptions. In documents sections apply to the document content, i.e. document descriptions cannot have sections. Sections can be nested."
		   });
		addAnnotation
		  (getModelElement_Representations(),
		   source,
		   new String[] {
			   "documentation", "Pluggable representations of a model element, e.g. a component diagram for engineers and modules."
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
		  (durationEDataType,
		   source,
		   new String[] {
			   "documentation", "[Duration](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html) is an amount of time in the [ISO-8601 Duration format](https://en.wikipedia.org/wiki/ISO_8601#Duration). Supports days and smaller units. Weeks, months and years are not supported. Example: ``P28DT10H``."
		   });
		addAnnotation
		  (instantEDataType,
		   source,
		   new String[] {
			   "documentation", "[Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) is a single instantaneous point on the time-line. \nIf instant specification contains ``Z``, then it is parsed using [Instant.parse()](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html#parse-java.lang.CharSequence-) method.\nOtherwise the specification is used to construct ``java.util.Date`` which is then converted to instant.\n\nExamples:\n\n* ``2021-12-03T10:15:30.00Z`` - loaded using ``Instant.parse()``\n* ``10/1/2021`` - loaded using ``new Date()`` and then converted to instant.\n\n"
		   });
		addAnnotation
		  (getTemporal__After__Temporal(),
		   source,
		   new String[] {
			   "documentation", "Tests if this temporal is after the specified temporal. Returns null if unknown, e.g. two unrelated events."
		   });
		addAnnotation
		  (getTemporal__Before__Temporal(),
		   source,
		   new String[] {
			   "documentation", "Tests if this temporal is before the specified temporal. Returns null if unknown, e.g. two unrelated events."
		   });
		addAnnotation
		  (getTemporal__Coincides__Temporal(),
		   source,
		   new String[] {
			   "documentation", "Tests if this temporal occurs at the same point on the time-line as the specified temporal. Returns null if unknown, e.g. two unrelated events."
		   });
		addAnnotation
		  (getTemporal__Normalize(),
		   source,
		   new String[] {
			   "documentation", "Returns a normalized instance of this temporal not contained in the model. Normalization walks through the temporal chain to the root temporal. If that root temporal is instant/absolute then the normalized instance would be instant/absolute. Otherwise the normalized instance would contain the root temporal as its base and offset would be the sum of all offsets."
		   });
		addAnnotation
		  (getTemporal__Minus__Temporal(),
		   source,
		   new String[] {
			   "documentation", "Returns [duration](Duration.html) difference between this temporal and the argument temporal - how much this temporal is after the argument on the time-line, if difference can be computed, e.g. both this temporal and the argument temporal are instant or trace to the same base temporal. Returns null otherwise."
		   });
		addAnnotation
		  (getTemporal__Minus__Duration(),
		   source,
		   new String[] {
			   "documentation", "Returns a temporal based on this one offset by negation of the argument [duration](Duration.html). Null duration is treated as zero and set as-is (not negated)."
		   });
		addAnnotation
		  (getTemporal__Plus__Duration(),
		   source,
		   new String[] {
			   "documentation", "Returns a temporal based on this one offset by the argument [duration](Duration.html). Duration can be null."
		   });
		addAnnotation
		  (getTemporal_Instant(),
		   source,
		   new String[] {
			   "documentation", "An absolute point on the time-line. E.g. ``2021/07/04``."
		   });
		addAnnotation
		  (getTemporal_Base(),
		   source,
		   new String[] {
			   "documentation", "Base of this temporal."
		   });
		addAnnotation
		  (getTemporal_Offset(),
		   source,
		   new String[] {
			   "documentation", "Time offset from the base in [ISO-8601 durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) format. \n\nExamples:\n\n* ``P1H`` for one hour later.\n* ``-P20D`` or ``P-20D`` for 20 days before. Can be null (zero), e.g. if one [period](Period.html) starts right after another period ends."
		   });
		addAnnotation
		  (getTemporal_Derivatives(),
		   source,
		   new String[] {
			   "documentation", "Temporals which are based on this temporal."
		   });
		addAnnotation
		  (getTemporal_LowerBounds(),
		   source,
		   new String[] {
			   "documentation", "Lower bounds of a temporal. E.g. exact time of some temporal might not be known at a moment, but it might be known that it should not be before than some other temporal - a lower bound. Lower bounds are used in validations and before/after computations. "
		   });
		addAnnotation
		  (getTemporal_UpperBounds(),
		   source,
		   new String[] {
			   "documentation", "Upper bounds of a temporal. E.g. exact time of some temporal might not be known at a moment, but it might be known that it should not be after some other temporal - an upper bound. Upper bounds are used in validations and before/after computations. "
		   });
		addAnnotation
		  (getPeriod_Start(),
		   source,
		   new String[] {
			   "documentation", "Period start."
		   });
		addAnnotation
		  (getPeriod_End(),
		   source,
		   new String[] {
			   "documentation", "Period end."
		   });
		addAnnotation
		  (getPeriod_Duration(),
		   source,
		   new String[] {
			   "documentation", "Positive period duration in [ISO-8601 durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) format. E.g. ``P1M`` for one month or ``P20D`` for 20 days."
		   });
		addAnnotation
		  (getNamedElement_Name(),
		   source,
		   new String[] {
			   "documentation", "Element name."
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
		  (getIssue_Releases(),
		   source,
		   new String[] {
			   "documentation", "Issue can be planned for zero or more releases directly. It can be also indirectly planned for releases via contribution to [features](Feature.html)."
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
		  (getDocument_Content(),
		   source,
		   new String[] {
			   "documentation", "Document/section content in HTML."
		   });
		addAnnotation
		  (getDocument_MarkdownContent(),
		   source,
		   new String[] {
			   "documentation", "Document/section content in [Markdown](https://en.wikipedia.org/wiki/Markdown)."
		   });
		addAnnotation
		  (getPersona_JourneyElements(),
		   source,
		   new String[] {
			   "documentation", "Derived opposite to journey element personas reference - [activities](Activity.html) performed by this persona which use [product](Product.html) [features](Feature.html) and [services](Service.html) which this persona uses."
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
		  (getProduct_Activities(),
		   source,
		   new String[] {
			   "documentation", "Activities/[journeys](Journey.html) which demonstrate how to use the product and its features."
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
		  (getRelease_Increment(),
		   source,
		   new String[] {
			   "documentation", "Increment for which this release is scheduled."
		   });
		addAnnotation
		  (getRelease_Features(),
		   source,
		   new String[] {
			   "documentation", "Features planned for this release."
		   });
		addAnnotation
		  (getRelease_Issues(),
		   source,
		   new String[] {
			   "documentation", "Issues planned for this release."
		   });
		addAnnotation
		  (getFeature_Releases(),
		   source,
		   new String[] {
			   "documentation", "Releases for which this feature is planned."
		   });
		addAnnotation
		  (getFeature_Activities(),
		   source,
		   new String[] {
			   "documentation", "Activities exemplifying use of the feature. These activities may be [journeys](Journey.html) and may be referenced from journeys."
		   });
		addAnnotation
		  (getFeature_Issues(),
		   source,
		   new String[] {
			   "documentation", "Issues contributing to this feature."
		   });
		addAnnotation
		  (getFeature_Uses(),
		   source,
		   new String[] {
			   "documentation", "Activities using this feature."
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
		  (getAlignable_Aligns(),
		   source,
		   new String[] {
			   "documentation", "Aims to which this alignable aligns. E.g. a module level principle may align to organization pirinciples."
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
		  (getPackageAppearance_ModelElements(),
		   source,
		   new String[] {
			   "documentation", "Mapping of model element EClass names in kebab case to model element appearance.\nE.g. for ``IssueStatus`` appearance specification will look like:\n\n```yaml\nmodel-elements:\n    issue-status:\n        roles: context\n```\n"
		   });
		addAnnotation
		  (getPackageAppearance_SubPackages(),
		   source,
		   new String[] {
			   "documentation", "Mapping of model element EClass names in kebab case to model element appearance.\nE.g. for ``IssueStatus`` appearance specification will look like:\n\n```yaml\nmodel-elements:\n    issue-status:\n        roles: context\n```\n"
		   });
		addAnnotation
		  (getPackageAppearanceEntry_Key(),
		   source,
		   new String[] {
			   "documentation", "Model element EClass name in kebab case. E.g. ``issue-status`` for [IssueStatus](IssueStatus.html)."
		   });
		addAnnotation
		  (getPackageAppearanceEntry_Value(),
		   source,
		   new String[] {
			   "documentation", "Model element appearance."
		   });
		addAnnotation
		  (getAppearance_Label(),
		   source,
		   new String[] {
			   "documentation", "Custom text."
		   });
		addAnnotation
		  (getAppearance_Icon(),
		   source,
		   new String[] {
			   "documentation", "Icon - image URL if contains slash (``/``). CSS class otherwise, e.g. ``fas fa-user``.  ``none`` to suppress the icon."
		   });
		addAnnotation
		  (getAppearance_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in HTML to show in the context help modal dialog."
		   });
		addAnnotation
		  (getAppearance_MarkdownDescription(),
		   source,
		   new String[] {
			   "documentation", "Description  in [Markdown](https://en.wikipedia.org/wiki/Markdown) to show in the context help modal dialog."
		   });
		addAnnotation
		  (getAppearance_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles of the containing element. \n\nAction role for model elements. One of:\n\n* ``navigation`` - Navigation actions are shown in the navigation panel as a list or as a tree. \n* ``context`` - Context actions are shown as a tree context menu and as a button toolbar in the content panel.\n* ``section`` - Section actions are shown as sections in the content panel. \n* ``content-right`` - Content right actions are shown in an adaptive navigation panel to the right of the action content.\n* ``content-left`` - Content left actions are shown in an adaptive  navigation panel to the left of the action content.\n\nFor members (features and operations) and actions - member/action role. One of:\n\n* ``actions`` - Child actions for a member, e.g. a section with a table of an action list.\n* ``content`` - Feature value or operation result is shown in the content. \n* ``elements`` - Child action for each feature or operation result element\n* ``elements-sorted`` - Child actions for member elements sorted by text\n* ``head`` - Feature value or operation result is shown in the content head - above description and sections. \n* ``property`` - Member value/result is shown in the properties table.\n\nAction member roles (``acitons``, ``elements``, and ``elements-sorted``) may be followed by a slash (``/``) and then action role.\nFor example: ``actions/context``.\n\nUse ``none`` role to hide feature or model element.\n\n\n"
		   });
		addAnnotation
		  (getAppearanceEntry_Key(),
		   source,
		   new String[] {
			   "documentation", "Model element EClass name in kebab case. E.g. ``issue-status`` for [IssueStatus](IssueStatus.html)."
		   });
		addAnnotation
		  (getAppearanceEntry_Value(),
		   source,
		   new String[] {
			   "documentation", "Model element appearance."
		   });
		addAnnotation
		  (getModelElementAppearance_Features(),
		   source,
		   new String[] {
			   "documentation", "Mapping of feature names in kebab case to feature appearance.\nE.g. for ``issueCategories`` feature mapping specification will look like:\n\n```yaml\nfeatures:\n    issue-categories:\n        roles: context\n```\n"
		   });
		addAnnotation
		  (getModelElementAppearance_Operations(),
		   source,
		   new String[] {
			   "documentation", "Mapping of operation names in kebab case to operation appearance.\nE.g. for ``allInvocations`` operation mapping specification will look like:\n\n```yaml\noperations:\n    all-invocations:\n        roles: context\n```\n"
		   });
		addAnnotation
		  (getModelElementAppearance_Actions(),
		   source,
		   new String[] {
			   "documentation", "Mapping of UI action names.\nE.g. for ``diagnostic-summary`` action mapping specification will look like:\n\n```yaml\nactions:\n    diagnostic-summary:\n        roles: context\n```\n"
		   });
		addAnnotation
		  (getModelElementAppearanceEntry_Key(),
		   source,
		   new String[] {
			   "documentation", "Model element EClass name in kebab case. E.g. ``issue-status`` for [IssueStatus](IssueStatus.html)."
		   });
		addAnnotation
		  (getModelElementAppearanceEntry_Value(),
		   source,
		   new String[] {
			   "documentation", "Model element appearance."
		   });
		addAnnotation
		  (getMemberAppearanceEntry_Key(),
		   source,
		   new String[] {
			   "documentation", "Feature name in kebab case. E.g. ``issue-categories``."
		   });
		addAnnotation
		  (getMemberAppearanceEntry_Value(),
		   source,
		   new String[] {
			   "documentation", "Feature appearance."
		   });
		addAnnotation
		  (getMemberAppearance_Category(),
		   source,
		   new String[] {
			   "documentation", "If false feature element actions are not categorized, i.e. in the navigation tree they would appear as container children without an intermediary feature category node. It can be useful if the containing element has navigation children only of one type or they can be distinguished by an icon and as such a feature category is not necessary."
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
		  (temporalEClass,
		   source,
		   new String[] {
			   "constraints", "bounds offset"
		   });
		addAnnotation
		  (periodEClass,
		   source,
		   new String[] {
			   "constraints", "start_end"
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
