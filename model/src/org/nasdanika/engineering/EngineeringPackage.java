/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.engineering.EngineeringFactory
 * @model kind="package"
 *        annotation="urn:org.nasdanika documentation-reference='doc/engineering.md'"
 * @generated
 */
public interface EngineeringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "engineering";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.engineering";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.engineering";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EngineeringPackage eINSTANCE = org.nasdanika.engineering.impl.EngineeringPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.common.Adaptable <em>Adaptable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.common.Adaptable
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getAdaptable()
	 * @generated
	 */
	int ADAPTABLE = 0;

	/**
	 * The number of structural features of the '<em>Adaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Adaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.ModelElementImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__URI = ADAPTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__PATH = ADAPTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = ADAPTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__MARKDOWN_DESCRIPTION = ADAPTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ACTIONS = ADAPTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__RESOURCES = ADAPTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = ADAPTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = ADAPTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.NamedElementImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__URI = MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__PATH = MODEL_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__MARKDOWN_DESCRIPTION = MODEL_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ACTIONS = MODEL_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__RESOURCES = MODEL_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.EndeavorImpl <em>Endeavor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.EndeavorImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getEndeavor()
	 * @generated
	 */
	int ENDEAVOR = 3;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDEAVOR__COMPLETION = 0;

	/**
	 * The feature id for the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDEAVOR__BENEFIT = 1;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDEAVOR__TOTAL_COST = 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDEAVOR__ASSIGNEE = 3;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDEAVOR__ALL_ISSUES = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDEAVOR__START = 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDEAVOR__END = 6;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDEAVOR__CAPACITY = 7;

	/**
	 * The number of structural features of the '<em>Endeavor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDEAVOR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Endeavor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDEAVOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.EngineeredElementImpl <em>Engineered Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.EngineeredElementImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getEngineeredElement()
	 * @generated
	 */
	int ENGINEERED_ELEMENT = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.PersonaImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 10;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.EngineerImpl <em>Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.EngineerImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getEngineer()
	 * @generated
	 */
	int ENGINEER = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.OrganizationImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.ModuleImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.ProductImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.CapabilityImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.IncrementImpl <em>Increment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.IncrementImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getIncrement()
	 * @generated
	 */
	int INCREMENT = 4;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__URI = NAMED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__MARKDOWN_DESCRIPTION = NAMED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__ACTIONS = NAMED_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__RESOURCES = NAMED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__COMPLETION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__BENEFIT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__TOTAL_COST = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__ASSIGNEE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__ALL_ISSUES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__START = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__END = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__CAPACITY = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__CHILDREN = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__ISSUES = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__RELEASES = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.IssueCategoryImpl <em>Issue Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.IssueCategoryImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getIssueCategory()
	 * @generated
	 */
	int ISSUE_CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__URI = NAMED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__MARKDOWN_DESCRIPTION = NAMED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__ACTIONS = NAMED_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__RESOURCES = NAMED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__WEIGHT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__ISSUES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cumulative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__CUMULATIVE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__ALLOCATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Issue Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Issue Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.IssueStatusImpl <em>Issue Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.IssueStatusImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getIssueStatus()
	 * @generated
	 */
	int ISSUE_STATUS = 6;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__URI = NAMED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__MARKDOWN_DESCRIPTION = NAMED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__ACTIONS = NAMED_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__RESOURCES = NAMED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__ISSUES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__DONE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Issue Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Issue Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__URI = NAMED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__MARKDOWN_DESCRIPTION = NAMED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ACTIONS = NAMED_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__RESOURCES = NAMED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__REQUIRED_BY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__AVAILABLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl <em>Engineered Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.EngineeredCapabilityImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getEngineeredCapability()
	 * @generated
	 */
	int ENGINEERED_CAPABILITY = 16;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__URI = CAPABILITY__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__PATH = CAPABILITY__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__DESCRIPTION = CAPABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__MARKDOWN_DESCRIPTION = CAPABILITY__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__ACTIONS = CAPABILITY__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__RESOURCES = CAPABILITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__REQUIRED_BY = CAPABILITY__REQUIRED_BY;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__AVAILABLE = CAPABILITY__AVAILABLE;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__COMPLETION = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__BENEFIT = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__TOTAL_COST = CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__ASSIGNEE = CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__ALL_ISSUES = CAPABILITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__START = CAPABILITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__END = CAPABILITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY__CAPACITY = CAPABILITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Engineered Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Engineered Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.ReleaseImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.FeatureImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.ActivityImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.JourneyImpl <em>Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.JourneyImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getJourney()
	 * @generated
	 */
	int JOURNEY = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.TransitionImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 21;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.CallImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 22;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.IssueImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 7;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__URI = ENGINEERED_CAPABILITY__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PATH = ENGINEERED_CAPABILITY__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = ENGINEERED_CAPABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__MARKDOWN_DESCRIPTION = ENGINEERED_CAPABILITY__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ACTIONS = ENGINEERED_CAPABILITY__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__RESOURCES = ENGINEERED_CAPABILITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NAME = ENGINEERED_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REQUIRED_BY = ENGINEERED_CAPABILITY__REQUIRED_BY;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__AVAILABLE = ENGINEERED_CAPABILITY__AVAILABLE;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__COMPLETION = ENGINEERED_CAPABILITY__COMPLETION;

	/**
	 * The feature id for the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__BENEFIT = ENGINEERED_CAPABILITY__BENEFIT;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TOTAL_COST = ENGINEERED_CAPABILITY__TOTAL_COST;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNEE = ENGINEERED_CAPABILITY__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ALL_ISSUES = ENGINEERED_CAPABILITY__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__START = ENGINEERED_CAPABILITY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__END = ENGINEERED_CAPABILITY__END;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CAPACITY = ENGINEERED_CAPABILITY__CAPACITY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CHILDREN = ENGINEERED_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REQUIRES = ENGINEERED_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__INCREMENT = ENGINEERED_CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CONTRIBUTES_TO = ENGINEERED_CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NOTES = ENGINEERED_CAPABILITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CATEGORY = ENGINEERED_CAPABILITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TARGET = ENGINEERED_CAPABILITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATUS = ENGINEERED_CAPABILITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Workable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__WORKABLE = ENGINEERED_CAPABILITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__RELEASES = ENGINEERED_CAPABILITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__EFFORT = ENGINEERED_CAPABILITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__COST = ENGINEERED_CAPABILITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Remaining Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REMAINING_EFFORT = ENGINEERED_CAPABILITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Remaining Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REMAINING_COST = ENGINEERED_CAPABILITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = ENGINEERED_CAPABILITY_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = ENGINEERED_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.NoteImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 8;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__URI = MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__PATH = MODEL_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__MARKDOWN_DESCRIPTION = MODEL_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ACTIONS = MODEL_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__RESOURCES = MODEL_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__AUTHOR = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DATE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__EFFORT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__COST = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remaining Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__REMAINING_EFFORT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Remaining Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__REMAINING_COST = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__STATUS = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__URI = NAMED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__MARKDOWN_DESCRIPTION = NAMED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__ACTIONS = NAMED_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__RESOURCES = NAMED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__ISSUES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__OWNERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__EXPERTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__ALLOCATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Engineered Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Engineered Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__URI = ENGINEERED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__PATH = ENGINEERED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DESCRIPTION = ENGINEERED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__MARKDOWN_DESCRIPTION = ENGINEERED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ACTIONS = ENGINEERED_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__RESOURCES = ENGINEERED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NAME = ENGINEERED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ISSUES = ENGINEERED_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__OWNERS = ENGINEERED_ELEMENT__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__EXPERTS = ENGINEERED_ELEMENT__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ALLOCATIONS = ENGINEERED_ELEMENT__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ACTIVITIES = ENGINEERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = ENGINEERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = ENGINEERED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__URI = PERSONA__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__PATH = PERSONA__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__DESCRIPTION = PERSONA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__MARKDOWN_DESCRIPTION = PERSONA__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ACTIONS = PERSONA__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__RESOURCES = PERSONA__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__NAME = PERSONA__NAME;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ISSUES = PERSONA__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__OWNERS = PERSONA__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__EXPERTS = PERSONA__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ALLOCATIONS = PERSONA__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ACTIVITIES = PERSONA__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__MODULES = PERSONA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__OWNS = PERSONA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expertise</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__EXPERTISE = PERSONA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Increments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__INCREMENTS = PERSONA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__SERVICES = PERSONA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__PERSONAS = PERSONA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ASSIGNMENTS = PERSONA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Issue Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ISSUE_CATEGORIES = PERSONA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Issue Statuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ISSUE_STATUSES = PERSONA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__RATE = PERSONA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Designations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__DESIGNATIONS = PERSONA_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__CAPACITY = PERSONA_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_FEATURE_COUNT = PERSONA_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_OPERATION_COUNT = PERSONA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__URI = ENGINEER__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PATH = ENGINEER__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DESCRIPTION = ENGINEER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MARKDOWN_DESCRIPTION = ENGINEER__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ACTIONS = ENGINEER__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__RESOURCES = ENGINEER__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = ENGINEER__NAME;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ISSUES = ENGINEER__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__OWNERS = ENGINEER__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EXPERTS = ENGINEER__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ALLOCATIONS = ENGINEER__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ACTIVITIES = ENGINEER__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MODULES = ENGINEER__MODULES;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__OWNS = ENGINEER__OWNS;

	/**
	 * The feature id for the '<em><b>Expertise</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EXPERTISE = ENGINEER__EXPERTISE;

	/**
	 * The feature id for the '<em><b>Increments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__INCREMENTS = ENGINEER__INCREMENTS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__SERVICES = ENGINEER__SERVICES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PERSONAS = ENGINEER__PERSONAS;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ASSIGNMENTS = ENGINEER__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Issue Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ISSUE_CATEGORIES = ENGINEER__ISSUE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Issue Statuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ISSUE_STATUSES = ENGINEER__ISSUE_STATUSES;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__RATE = ENGINEER__RATE;

	/**
	 * The feature id for the '<em><b>Designations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DESIGNATIONS = ENGINEER__DESIGNATIONS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CAPACITY = ENGINEER__CAPACITY;

	/**
	 * The feature id for the '<em><b>Engineers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ENGINEERS = ENGINEER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = ENGINEER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = ENGINEER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__URI = ENGINEERED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PATH = ENGINEERED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = ENGINEERED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MARKDOWN_DESCRIPTION = ENGINEERED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ACTIONS = ENGINEERED_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__RESOURCES = ENGINEERED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = ENGINEERED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ISSUES = ENGINEERED_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNERS = ENGINEERED_ELEMENT__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EXPERTS = ENGINEERED_ELEMENT__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ALLOCATIONS = ENGINEERED_ELEMENT__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULES = ENGINEERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = ENGINEERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = ENGINEERED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PATH = MODULE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = MODULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MARKDOWN_DESCRIPTION = MODULE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ACTIONS = MODULE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RESOURCES = MODULE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ISSUES = MODULE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__OWNERS = MODULE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__EXPERTS = MODULE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ALLOCATIONS = MODULE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RELEASES = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__FEATURES = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ACTIVITIES = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__URI = ENGINEERED_CAPABILITY__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__PATH = ENGINEERED_CAPABILITY__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DESCRIPTION = ENGINEERED_CAPABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__MARKDOWN_DESCRIPTION = ENGINEERED_CAPABILITY__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ACTIONS = ENGINEERED_CAPABILITY__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__RESOURCES = ENGINEERED_CAPABILITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NAME = ENGINEERED_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__REQUIRED_BY = ENGINEERED_CAPABILITY__REQUIRED_BY;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__AVAILABLE = ENGINEERED_CAPABILITY__AVAILABLE;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__COMPLETION = ENGINEERED_CAPABILITY__COMPLETION;

	/**
	 * The feature id for the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__BENEFIT = ENGINEERED_CAPABILITY__BENEFIT;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__TOTAL_COST = ENGINEERED_CAPABILITY__TOTAL_COST;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ASSIGNEE = ENGINEERED_CAPABILITY__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ALL_ISSUES = ENGINEERED_CAPABILITY__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__START = ENGINEERED_CAPABILITY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__END = ENGINEERED_CAPABILITY__END;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CAPACITY = ENGINEERED_CAPABILITY__CAPACITY;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__INCREMENT = ENGINEERED_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__FEATURES = ENGINEERED_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ISSUES = ENGINEERED_CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = ENGINEERED_CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = ENGINEERED_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__URI = ENGINEERED_CAPABILITY__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PATH = ENGINEERED_CAPABILITY__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = ENGINEERED_CAPABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MARKDOWN_DESCRIPTION = ENGINEERED_CAPABILITY__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ACTIONS = ENGINEERED_CAPABILITY__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__RESOURCES = ENGINEERED_CAPABILITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = ENGINEERED_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQUIRED_BY = ENGINEERED_CAPABILITY__REQUIRED_BY;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__AVAILABLE = ENGINEERED_CAPABILITY__AVAILABLE;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COMPLETION = ENGINEERED_CAPABILITY__COMPLETION;

	/**
	 * The feature id for the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BENEFIT = ENGINEERED_CAPABILITY__BENEFIT;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TOTAL_COST = ENGINEERED_CAPABILITY__TOTAL_COST;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ASSIGNEE = ENGINEERED_CAPABILITY__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALL_ISSUES = ENGINEERED_CAPABILITY__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__START = ENGINEERED_CAPABILITY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__END = ENGINEERED_CAPABILITY__END;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CAPACITY = ENGINEERED_CAPABILITY__CAPACITY;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__RELEASES = ENGINEERED_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ACTIVITIES = ENGINEERED_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ISSUES = ENGINEERED_CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = ENGINEERED_CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = ENGINEERED_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__URI = ENGINEERED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PATH = ENGINEERED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = ENGINEERED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MARKDOWN_DESCRIPTION = ENGINEERED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIONS = ENGINEERED_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCES = ENGINEERED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = ENGINEERED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ISSUES = ENGINEERED_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNERS = ENGINEERED_ELEMENT__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXPERTS = ENGINEERED_ELEMENT__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ALLOCATIONS = ENGINEERED_ELEMENT__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PERSONAS = ENGINEERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUTS = ENGINEERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITY_TYPE = ENGINEERED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REQUIREMENTS = ENGINEERED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DELIVERABLES = ENGINEERED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CALLS = ENGINEERED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FEATURES = ENGINEERED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = ENGINEERED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = ENGINEERED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__URI = ACTIVITY__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__PATH = ACTIVITY__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__MARKDOWN_DESCRIPTION = ACTIVITY__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ACTIONS = ACTIVITY__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ISSUES = ACTIVITY__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__OWNERS = ACTIVITY__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__EXPERTS = ACTIVITY__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ALLOCATIONS = ACTIVITY__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__PERSONAS = ACTIVITY__PERSONAS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ACTIVITY_TYPE = ACTIVITY__ACTIVITY_TYPE;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__REQUIREMENTS = ACTIVITY__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__DELIVERABLES = ACTIVITY__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__CALLS = ACTIVITY__CALLS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__FEATURES = ACTIVITY__FEATURES;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ACTIVITIES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__PARTITION = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PAYLOAD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__PAYLOAD = TRANSITION__PAYLOAD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__RESPONSE = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.ArtifactImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 23;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__URI = ENGINEERED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PATH = ENGINEERED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = ENGINEERED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MARKDOWN_DESCRIPTION = ENGINEERED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ACTIONS = ENGINEERED_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__RESOURCES = ENGINEERED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = ENGINEERED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ISSUES = ENGINEERED_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__OWNERS = ENGINEERED_ELEMENT__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXPERTS = ENGINEERED_ELEMENT__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ALLOCATIONS = ENGINEERED_ELEMENT__ALLOCATIONS;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = ENGINEERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = ENGINEERED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.DirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.DirectoryImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 24;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__URI = NAMED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__MARKDOWN_DESCRIPTION = NAMED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__ACTIONS = NAMED_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__RESOURCES = NAMED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.CapacityImpl <em>Capacity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.CapacityImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getCapacity()
	 * @generated
	 */
	int CAPACITY = 25;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__URI = MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__PATH = MODEL_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__MARKDOWN_DESCRIPTION = MODEL_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__ACTIONS = MODEL_ELEMENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__RESOURCES = MODEL_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Endeavor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__ENDEAVOR = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__EFFORT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Funds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__FUNDS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__RATE = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.impl.AllocationImpl
	 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 26;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__URI = CAPACITY__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__PATH = CAPACITY__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__DESCRIPTION = CAPACITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__MARKDOWN_DESCRIPTION = CAPACITY__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__ACTIONS = CAPACITY__ACTIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__RESOURCES = CAPACITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Endeavor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__ENDEAVOR = CAPACITY__ENDEAVOR;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__EFFORT = CAPACITY__EFFORT;

	/**
	 * The feature id for the '<em><b>Funds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__FUNDS = CAPACITY__FUNDS;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__RATE = CAPACITY__RATE;

	/**
	 * The feature id for the '<em><b>Engineer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__ENGINEER = CAPACITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__CATEGORY = CAPACITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = CAPACITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_OPERATION_COUNT = CAPACITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.common.Adaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptable</em>'.
	 * @see org.nasdanika.common.Adaptable
	 * @model instanceClass="org.nasdanika.common.Adaptable"
	 * @generated
	 */
	EClass getAdaptable();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.engineering.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.ModelElement#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.nasdanika.engineering.ModelElement#getUri()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.ModelElement#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.engineering.ModelElement#getPath()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.engineering.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.ModelElement#getMarkdownDescription <em>Markdown Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Markdown Description</em>'.
	 * @see org.nasdanika.engineering.ModelElement#getMarkdownDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_MarkdownDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.ModelElement#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.nasdanika.engineering.ModelElement#getActions()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.ModelElement#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nasdanika.engineering.ModelElement#getResources()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.nasdanika.engineering.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.engineering.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Endeavor <em>Endeavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endeavor</em>'.
	 * @see org.nasdanika.engineering.Endeavor
	 * @generated
	 */
	EClass getEndeavor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Endeavor#getCompletion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion</em>'.
	 * @see org.nasdanika.engineering.Endeavor#getCompletion()
	 * @see #getEndeavor()
	 * @generated
	 */
	EAttribute getEndeavor_Completion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Endeavor#getBenefit <em>Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Benefit</em>'.
	 * @see org.nasdanika.engineering.Endeavor#getBenefit()
	 * @see #getEndeavor()
	 * @generated
	 */
	EAttribute getEndeavor_Benefit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Endeavor#getTotalCost <em>Total Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cost</em>'.
	 * @see org.nasdanika.engineering.Endeavor#getTotalCost()
	 * @see #getEndeavor()
	 * @generated
	 */
	EAttribute getEndeavor_TotalCost();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Endeavor#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.nasdanika.engineering.Endeavor#getAssignee()
	 * @see #getEndeavor()
	 * @generated
	 */
	EReference getEndeavor_Assignee();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Endeavor#getAllIssues <em>All Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Issues</em>'.
	 * @see org.nasdanika.engineering.Endeavor#getAllIssues()
	 * @see #getEndeavor()
	 * @generated
	 */
	EReference getEndeavor_AllIssues();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Endeavor#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.nasdanika.engineering.Endeavor#getStart()
	 * @see #getEndeavor()
	 * @generated
	 */
	EAttribute getEndeavor_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Endeavor#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.nasdanika.engineering.Endeavor#getEnd()
	 * @see #getEndeavor()
	 * @generated
	 */
	EAttribute getEndeavor_End();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Endeavor#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capacity</em>'.
	 * @see org.nasdanika.engineering.Endeavor#getCapacity()
	 * @see #getEndeavor()
	 * @generated
	 */
	EReference getEndeavor_Capacity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.EngineeredElement <em>Engineered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineered Element</em>'.
	 * @see org.nasdanika.engineering.EngineeredElement
	 * @generated
	 */
	EClass getEngineeredElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.EngineeredElement#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see org.nasdanika.engineering.EngineeredElement#getIssues()
	 * @see #getEngineeredElement()
	 * @generated
	 */
	EReference getEngineeredElement_Issues();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.EngineeredElement#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owners</em>'.
	 * @see org.nasdanika.engineering.EngineeredElement#getOwners()
	 * @see #getEngineeredElement()
	 * @generated
	 */
	EReference getEngineeredElement_Owners();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.EngineeredElement#getExperts <em>Experts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Experts</em>'.
	 * @see org.nasdanika.engineering.EngineeredElement#getExperts()
	 * @see #getEngineeredElement()
	 * @generated
	 */
	EReference getEngineeredElement_Experts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.EngineeredElement#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocations</em>'.
	 * @see org.nasdanika.engineering.EngineeredElement#getAllocations()
	 * @see #getEngineeredElement()
	 * @generated
	 */
	EReference getEngineeredElement_Allocations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see org.nasdanika.engineering.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Persona#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see org.nasdanika.engineering.Persona#getActivities()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Activities();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Engineer <em>Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineer</em>'.
	 * @see org.nasdanika.engineering.Engineer
	 * @generated
	 */
	EClass getEngineer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Engineer#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.nasdanika.engineering.Engineer#getModules()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Modules();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Engineer#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns</em>'.
	 * @see org.nasdanika.engineering.Engineer#getOwns()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Owns();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Engineer#getExpertise <em>Expertise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expertise</em>'.
	 * @see org.nasdanika.engineering.Engineer#getExpertise()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Expertise();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Engineer#getIncrements <em>Increments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Increments</em>'.
	 * @see org.nasdanika.engineering.Engineer#getIncrements()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Increments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Engineer#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.nasdanika.engineering.Engineer#getServices()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Engineer#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personas</em>'.
	 * @see org.nasdanika.engineering.Engineer#getPersonas()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Personas();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Engineer#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignments</em>'.
	 * @see org.nasdanika.engineering.Engineer#getAssignments()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Assignments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Engineer#getIssueCategories <em>Issue Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Categories</em>'.
	 * @see org.nasdanika.engineering.Engineer#getIssueCategories()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_IssueCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Engineer#getIssueStatuses <em>Issue Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Statuses</em>'.
	 * @see org.nasdanika.engineering.Engineer#getIssueStatuses()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_IssueStatuses();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Engineer#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see org.nasdanika.engineering.Engineer#getRate()
	 * @see #getEngineer()
	 * @generated
	 */
	EAttribute getEngineer_Rate();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Engineer#getDesignations <em>Designations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designations</em>'.
	 * @see org.nasdanika.engineering.Engineer#getDesignations()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Designations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Engineer#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capacity</em>'.
	 * @see org.nasdanika.engineering.Engineer#getCapacity()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Capacity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.nasdanika.engineering.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Organization#getEngineers <em>Engineers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Engineers</em>'.
	 * @see org.nasdanika.engineering.Organization#getEngineers()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Engineers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.nasdanika.engineering.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Module#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.nasdanika.engineering.Module#getModules()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Modules();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.nasdanika.engineering.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Product#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see org.nasdanika.engineering.Product#getReleases()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Releases();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Product#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.nasdanika.engineering.Product#getFeatures()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Product#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.nasdanika.engineering.Product#getActivities()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Activities();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.nasdanika.engineering.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Capability#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required By</em>'.
	 * @see org.nasdanika.engineering.Capability#getRequiredBy()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_RequiredBy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Capability#isAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see org.nasdanika.engineering.Capability#isAvailable()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Available();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.EngineeredCapability <em>Engineered Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineered Capability</em>'.
	 * @see org.nasdanika.engineering.EngineeredCapability
	 * @generated
	 */
	EClass getEngineeredCapability();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Increment <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment</em>'.
	 * @see org.nasdanika.engineering.Increment
	 * @generated
	 */
	EClass getIncrement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Increment#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.engineering.Increment#getChildren()
	 * @see #getIncrement()
	 * @generated
	 */
	EReference getIncrement_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Increment#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see org.nasdanika.engineering.Increment#getIssues()
	 * @see #getIncrement()
	 * @generated
	 */
	EReference getIncrement_Issues();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Increment#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Releases</em>'.
	 * @see org.nasdanika.engineering.Increment#getReleases()
	 * @see #getIncrement()
	 * @generated
	 */
	EReference getIncrement_Releases();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.IssueCategory <em>Issue Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Category</em>'.
	 * @see org.nasdanika.engineering.IssueCategory
	 * @generated
	 */
	EClass getIssueCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.IssueCategory#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.engineering.IssueCategory#getWeight()
	 * @see #getIssueCategory()
	 * @generated
	 */
	EAttribute getIssueCategory_Weight();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.IssueCategory#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see org.nasdanika.engineering.IssueCategory#getIssues()
	 * @see #getIssueCategory()
	 * @generated
	 */
	EReference getIssueCategory_Issues();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.IssueCategory#isCumulative <em>Cumulative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cumulative</em>'.
	 * @see org.nasdanika.engineering.IssueCategory#isCumulative()
	 * @see #getIssueCategory()
	 * @generated
	 */
	EAttribute getIssueCategory_Cumulative();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.IssueCategory#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocations</em>'.
	 * @see org.nasdanika.engineering.IssueCategory#getAllocations()
	 * @see #getIssueCategory()
	 * @generated
	 */
	EReference getIssueCategory_Allocations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.IssueStatus <em>Issue Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Status</em>'.
	 * @see org.nasdanika.engineering.IssueStatus
	 * @generated
	 */
	EClass getIssueStatus();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.IssueStatus#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see org.nasdanika.engineering.IssueStatus#getIssues()
	 * @see #getIssueStatus()
	 * @generated
	 */
	EReference getIssueStatus_Issues();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.IssueStatus#isDone <em>Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Done</em>'.
	 * @see org.nasdanika.engineering.IssueStatus#isDone()
	 * @see #getIssueStatus()
	 * @generated
	 */
	EAttribute getIssueStatus_Done();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.nasdanika.engineering.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Release#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Increment</em>'.
	 * @see org.nasdanika.engineering.Release#getIncrement()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Increment();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Release#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see org.nasdanika.engineering.Release#getIssues()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Issues();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Release#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.nasdanika.engineering.Release#getFeatures()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Features();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.nasdanika.engineering.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Feature#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Releases</em>'.
	 * @see org.nasdanika.engineering.Feature#getReleases()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Releases();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Feature#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see org.nasdanika.engineering.Feature#getActivities()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Activities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Feature#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see org.nasdanika.engineering.Feature#getIssues()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Issues();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.nasdanika.engineering.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Activity#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Personas</em>'.
	 * @see org.nasdanika.engineering.Activity#getPersonas()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Personas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Activity#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see org.nasdanika.engineering.Activity#getOutputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Activity#getActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Type</em>'.
	 * @see org.nasdanika.engineering.Activity#getActivityType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ActivityType();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Activity#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see org.nasdanika.engineering.Activity#getRequirements()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Requirements();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Activity#getDeliverables <em>Deliverables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deliverables</em>'.
	 * @see org.nasdanika.engineering.Activity#getDeliverables()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Deliverables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Activity#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see org.nasdanika.engineering.Activity#getCalls()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Calls();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Activity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.nasdanika.engineering.Activity#getFeatures()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Features();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Journey <em>Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey</em>'.
	 * @see org.nasdanika.engineering.Journey
	 * @generated
	 */
	EClass getJourney();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Journey#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.nasdanika.engineering.Journey#getActivities()
	 * @see #getJourney()
	 * @generated
	 */
	EReference getJourney_Activities();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Journey#isPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition</em>'.
	 * @see org.nasdanika.engineering.Journey#isPartition()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_Partition();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.nasdanika.engineering.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.engineering.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Transition#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payload</em>'.
	 * @see org.nasdanika.engineering.Transition#getPayload()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Payload();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.engineering.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Transition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.engineering.Transition#getDescription()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.nasdanika.engineering.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Call#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Response</em>'.
	 * @see org.nasdanika.engineering.Call#getResponse()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Response();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see org.nasdanika.engineering.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Issue#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.engineering.Issue#getChildren()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Issue#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see org.nasdanika.engineering.Issue#getRequires()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Requires();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Issue#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Increment</em>'.
	 * @see org.nasdanika.engineering.Issue#getIncrement()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Increment();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Issue#getContributesTo <em>Contributes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes To</em>'.
	 * @see org.nasdanika.engineering.Issue#getContributesTo()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_ContributesTo();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.nasdanika.engineering.Issue#getStatus()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Issue#isWorkable <em>Workable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workable</em>'.
	 * @see org.nasdanika.engineering.Issue#isWorkable()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Workable();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Issue#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Releases</em>'.
	 * @see org.nasdanika.engineering.Issue#getReleases()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Releases();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Issue#getEffort <em>Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effort</em>'.
	 * @see org.nasdanika.engineering.Issue#getEffort()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Effort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Issue#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.nasdanika.engineering.Issue#getCost()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Cost();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Issue#getRemainingEffort <em>Remaining Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Effort</em>'.
	 * @see org.nasdanika.engineering.Issue#getRemainingEffort()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_RemainingEffort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Issue#getRemainingCost <em>Remaining Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Cost</em>'.
	 * @see org.nasdanika.engineering.Issue#getRemainingCost()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_RemainingCost();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Issue#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see org.nasdanika.engineering.Issue#getNotes()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Notes();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Issue#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.nasdanika.engineering.Issue#getCategory()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Category();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Issue#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.engineering.Issue#getTarget()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.nasdanika.engineering.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Note#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.engineering.Note#getAuthor()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Note#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.engineering.Note#getDate()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Note#getEffort <em>Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effort</em>'.
	 * @see org.nasdanika.engineering.Note#getEffort()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Effort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Note#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.nasdanika.engineering.Note#getCost()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Cost();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Note#getRemainingEffort <em>Remaining Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Effort</em>'.
	 * @see org.nasdanika.engineering.Note#getRemainingEffort()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_RemainingEffort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Note#getRemainingCost <em>Remaining Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Cost</em>'.
	 * @see org.nasdanika.engineering.Note#getRemainingCost()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_RemainingCost();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Note#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.nasdanika.engineering.Note#getStatus()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Status();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.nasdanika.engineering.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see org.nasdanika.engineering.Directory
	 * @generated
	 */
	EClass getDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.Directory#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.engineering.Directory#getElements()
	 * @see #getDirectory()
	 * @generated
	 */
	EReference getDirectory_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Capacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity</em>'.
	 * @see org.nasdanika.engineering.Capacity
	 * @generated
	 */
	EClass getCapacity();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Capacity#getEndeavor <em>Endeavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endeavor</em>'.
	 * @see org.nasdanika.engineering.Capacity#getEndeavor()
	 * @see #getCapacity()
	 * @generated
	 */
	EReference getCapacity_Endeavor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Capacity#getEffort <em>Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effort</em>'.
	 * @see org.nasdanika.engineering.Capacity#getEffort()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Effort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Capacity#getFunds <em>Funds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funds</em>'.
	 * @see org.nasdanika.engineering.Capacity#getFunds()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Funds();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.Capacity#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see org.nasdanika.engineering.Capacity#getRate()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Rate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see org.nasdanika.engineering.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.Allocation#getEngineer <em>Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engineer</em>'.
	 * @see org.nasdanika.engineering.Allocation#getEngineer()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_Engineer();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.Allocation#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see org.nasdanika.engineering.Allocation#getCategory()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_Category();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EngineeringFactory getEngineeringFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.common.Adaptable <em>Adaptable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.common.Adaptable
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getAdaptable()
		 * @generated
		 */
		EClass ADAPTABLE = eINSTANCE.getAdaptable();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.ModelElementImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__URI = eINSTANCE.getModelElement_Uri();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__PATH = eINSTANCE.getModelElement_Path();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Markdown Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__MARKDOWN_DESCRIPTION = eINSTANCE.getModelElement_MarkdownDescription();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__ACTIONS = eINSTANCE.getModelElement_Actions();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__RESOURCES = eINSTANCE.getModelElement_Resources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.NamedElementImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.EndeavorImpl <em>Endeavor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.EndeavorImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getEndeavor()
		 * @generated
		 */
		EClass ENDEAVOR = eINSTANCE.getEndeavor();

		/**
		 * The meta object literal for the '<em><b>Completion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDEAVOR__COMPLETION = eINSTANCE.getEndeavor_Completion();

		/**
		 * The meta object literal for the '<em><b>Benefit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDEAVOR__BENEFIT = eINSTANCE.getEndeavor_Benefit();

		/**
		 * The meta object literal for the '<em><b>Total Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDEAVOR__TOTAL_COST = eINSTANCE.getEndeavor_TotalCost();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDEAVOR__ASSIGNEE = eINSTANCE.getEndeavor_Assignee();

		/**
		 * The meta object literal for the '<em><b>All Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDEAVOR__ALL_ISSUES = eINSTANCE.getEndeavor_AllIssues();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDEAVOR__START = eINSTANCE.getEndeavor_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDEAVOR__END = eINSTANCE.getEndeavor_End();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDEAVOR__CAPACITY = eINSTANCE.getEndeavor_Capacity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.EngineeredElementImpl <em>Engineered Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.EngineeredElementImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getEngineeredElement()
		 * @generated
		 */
		EClass ENGINEERED_ELEMENT = eINSTANCE.getEngineeredElement();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERED_ELEMENT__ISSUES = eINSTANCE.getEngineeredElement_Issues();

		/**
		 * The meta object literal for the '<em><b>Owners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERED_ELEMENT__OWNERS = eINSTANCE.getEngineeredElement_Owners();

		/**
		 * The meta object literal for the '<em><b>Experts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERED_ELEMENT__EXPERTS = eINSTANCE.getEngineeredElement_Experts();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERED_ELEMENT__ALLOCATIONS = eINSTANCE.getEngineeredElement_Allocations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.PersonaImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__ACTIVITIES = eINSTANCE.getPersona_Activities();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.EngineerImpl <em>Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.EngineerImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getEngineer()
		 * @generated
		 */
		EClass ENGINEER = eINSTANCE.getEngineer();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__MODULES = eINSTANCE.getEngineer_Modules();

		/**
		 * The meta object literal for the '<em><b>Owns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__OWNS = eINSTANCE.getEngineer_Owns();

		/**
		 * The meta object literal for the '<em><b>Expertise</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__EXPERTISE = eINSTANCE.getEngineer_Expertise();

		/**
		 * The meta object literal for the '<em><b>Increments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__INCREMENTS = eINSTANCE.getEngineer_Increments();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__SERVICES = eINSTANCE.getEngineer_Services();

		/**
		 * The meta object literal for the '<em><b>Personas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__PERSONAS = eINSTANCE.getEngineer_Personas();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__ASSIGNMENTS = eINSTANCE.getEngineer_Assignments();

		/**
		 * The meta object literal for the '<em><b>Issue Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__ISSUE_CATEGORIES = eINSTANCE.getEngineer_IssueCategories();

		/**
		 * The meta object literal for the '<em><b>Issue Statuses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__ISSUE_STATUSES = eINSTANCE.getEngineer_IssueStatuses();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINEER__RATE = eINSTANCE.getEngineer_Rate();

		/**
		 * The meta object literal for the '<em><b>Designations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__DESIGNATIONS = eINSTANCE.getEngineer_Designations();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__CAPACITY = eINSTANCE.getEngineer_Capacity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.OrganizationImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Engineers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__ENGINEERS = eINSTANCE.getOrganization_Engineers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.ModuleImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULES = eINSTANCE.getModule_Modules();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.ProductImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__RELEASES = eINSTANCE.getProduct_Releases();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__FEATURES = eINSTANCE.getProduct_Features();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__ACTIVITIES = eINSTANCE.getProduct_Activities();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.CapabilityImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Required By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__REQUIRED_BY = eINSTANCE.getCapability_RequiredBy();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__AVAILABLE = eINSTANCE.getCapability_Available();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl <em>Engineered Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.EngineeredCapabilityImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getEngineeredCapability()
		 * @generated
		 */
		EClass ENGINEERED_CAPABILITY = eINSTANCE.getEngineeredCapability();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.IncrementImpl <em>Increment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.IncrementImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getIncrement()
		 * @generated
		 */
		EClass INCREMENT = eINSTANCE.getIncrement();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCREMENT__CHILDREN = eINSTANCE.getIncrement_Children();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCREMENT__ISSUES = eINSTANCE.getIncrement_Issues();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCREMENT__RELEASES = eINSTANCE.getIncrement_Releases();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.IssueCategoryImpl <em>Issue Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.IssueCategoryImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getIssueCategory()
		 * @generated
		 */
		EClass ISSUE_CATEGORY = eINSTANCE.getIssueCategory();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_CATEGORY__WEIGHT = eINSTANCE.getIssueCategory_Weight();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_CATEGORY__ISSUES = eINSTANCE.getIssueCategory_Issues();

		/**
		 * The meta object literal for the '<em><b>Cumulative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_CATEGORY__CUMULATIVE = eINSTANCE.getIssueCategory_Cumulative();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_CATEGORY__ALLOCATIONS = eINSTANCE.getIssueCategory_Allocations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.IssueStatusImpl <em>Issue Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.IssueStatusImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getIssueStatus()
		 * @generated
		 */
		EClass ISSUE_STATUS = eINSTANCE.getIssueStatus();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_STATUS__ISSUES = eINSTANCE.getIssueStatus_Issues();

		/**
		 * The meta object literal for the '<em><b>Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_STATUS__DONE = eINSTANCE.getIssueStatus_Done();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.ReleaseImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__INCREMENT = eINSTANCE.getRelease_Increment();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__ISSUES = eINSTANCE.getRelease_Issues();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__FEATURES = eINSTANCE.getRelease_Features();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.FeatureImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__RELEASES = eINSTANCE.getFeature_Releases();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ACTIVITIES = eINSTANCE.getFeature_Activities();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ISSUES = eINSTANCE.getFeature_Issues();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.ActivityImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Personas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PERSONAS = eINSTANCE.getActivity_Personas();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OUTPUTS = eINSTANCE.getActivity_Outputs();

		/**
		 * The meta object literal for the '<em><b>Activity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACTIVITY_TYPE = eINSTANCE.getActivity_ActivityType();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__REQUIREMENTS = eINSTANCE.getActivity_Requirements();

		/**
		 * The meta object literal for the '<em><b>Deliverables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DELIVERABLES = eINSTANCE.getActivity_Deliverables();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CALLS = eINSTANCE.getActivity_Calls();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__FEATURES = eINSTANCE.getActivity_Features();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.JourneyImpl <em>Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.JourneyImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getJourney()
		 * @generated
		 */
		EClass JOURNEY = eINSTANCE.getJourney();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY__ACTIVITIES = eINSTANCE.getJourney_Activities();

		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__PARTITION = eINSTANCE.getJourney_Partition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.TransitionImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__PAYLOAD = eINSTANCE.getTransition_Payload();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__DESCRIPTION = eINSTANCE.getTransition_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.CallImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__RESPONSE = eINSTANCE.getCall_Response();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.IssueImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CHILDREN = eINSTANCE.getIssue_Children();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__REQUIRES = eINSTANCE.getIssue_Requires();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__INCREMENT = eINSTANCE.getIssue_Increment();

		/**
		 * The meta object literal for the '<em><b>Contributes To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CONTRIBUTES_TO = eINSTANCE.getIssue_ContributesTo();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__STATUS = eINSTANCE.getIssue_Status();

		/**
		 * The meta object literal for the '<em><b>Workable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__WORKABLE = eINSTANCE.getIssue_Workable();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__RELEASES = eINSTANCE.getIssue_Releases();

		/**
		 * The meta object literal for the '<em><b>Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__EFFORT = eINSTANCE.getIssue_Effort();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__COST = eINSTANCE.getIssue_Cost();

		/**
		 * The meta object literal for the '<em><b>Remaining Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__REMAINING_EFFORT = eINSTANCE.getIssue_RemainingEffort();

		/**
		 * The meta object literal for the '<em><b>Remaining Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__REMAINING_COST = eINSTANCE.getIssue_RemainingCost();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__NOTES = eINSTANCE.getIssue_Notes();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CATEGORY = eINSTANCE.getIssue_Category();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__TARGET = eINSTANCE.getIssue_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.NoteImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__AUTHOR = eINSTANCE.getNote_Author();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DATE = eINSTANCE.getNote_Date();

		/**
		 * The meta object literal for the '<em><b>Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__EFFORT = eINSTANCE.getNote_Effort();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__COST = eINSTANCE.getNote_Cost();

		/**
		 * The meta object literal for the '<em><b>Remaining Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__REMAINING_EFFORT = eINSTANCE.getNote_RemainingEffort();

		/**
		 * The meta object literal for the '<em><b>Remaining Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__REMAINING_COST = eINSTANCE.getNote_RemainingCost();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__STATUS = eINSTANCE.getNote_Status();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.ArtifactImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.DirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.DirectoryImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getDirectory()
		 * @generated
		 */
		EClass DIRECTORY = eINSTANCE.getDirectory();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORY__ELEMENTS = eINSTANCE.getDirectory_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.CapacityImpl <em>Capacity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.CapacityImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getCapacity()
		 * @generated
		 */
		EClass CAPACITY = eINSTANCE.getCapacity();

		/**
		 * The meta object literal for the '<em><b>Endeavor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY__ENDEAVOR = eINSTANCE.getCapacity_Endeavor();

		/**
		 * The meta object literal for the '<em><b>Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__EFFORT = eINSTANCE.getCapacity_Effort();

		/**
		 * The meta object literal for the '<em><b>Funds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__FUNDS = eINSTANCE.getCapacity_Funds();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__RATE = eINSTANCE.getCapacity_Rate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.impl.AllocationImpl
		 * @see org.nasdanika.engineering.impl.EngineeringPackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '<em><b>Engineer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__ENGINEER = eINSTANCE.getAllocation_Engineer();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__CATEGORY = eINSTANCE.getAllocation_Category();

	}

} //EngineeringPackage
