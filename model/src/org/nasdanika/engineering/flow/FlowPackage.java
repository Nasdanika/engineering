/**
 */
package org.nasdanika.engineering.flow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.engineering.EngineeringPackage;

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
 * @see org.nasdanika.engineering.flow.FlowFactory
 * @model kind="package"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.engineering.flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.engineering.flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowPackage eINSTANCE = org.nasdanika.engineering.flow.impl.FlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.JourneyElementImpl <em>Journey Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.JourneyElementImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getJourneyElement()
	 * @generated
	 */
	int JOURNEY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__URI = EngineeringPackage.ENGINEERED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__PATH = EngineeringPackage.ENGINEERED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__DESCRIPTION = EngineeringPackage.ENGINEERED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__MARKDOWN_DESCRIPTION = EngineeringPackage.ENGINEERED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__RESOURCES = EngineeringPackage.ENGINEERED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__APPEARANCE = EngineeringPackage.ENGINEERED_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__TABLE_OF_CONTENTS = EngineeringPackage.ENGINEERED_ELEMENT__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__SECTIONS = EngineeringPackage.ENGINEERED_ELEMENT__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__REPRESENTATIONS = EngineeringPackage.ENGINEERED_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__NAME = EngineeringPackage.ENGINEERED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__DISCUSSION = EngineeringPackage.ENGINEERED_ELEMENT__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__TOPICS = EngineeringPackage.ENGINEERED_ELEMENT__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__ISSUES = EngineeringPackage.ENGINEERED_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__OWNERS = EngineeringPackage.ENGINEERED_ELEMENT__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__EXPERTS = EngineeringPackage.ENGINEERED_ELEMENT__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__ALLOCATIONS = EngineeringPackage.ENGINEERED_ELEMENT__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__PRINCIPLES = EngineeringPackage.ENGINEERED_ELEMENT__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__ALL_ISSUES = EngineeringPackage.ENGINEERED_ELEMENT__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__OUTPUTS = EngineeringPackage.ENGINEERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__CALLS = EngineeringPackage.ENGINEERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__REQUIREMENTS = EngineeringPackage.ENGINEERED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__DELIVERABLES = EngineeringPackage.ENGINEERED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__PERSONAS = EngineeringPackage.ENGINEERED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__OVERRIDES = EngineeringPackage.ENGINEERED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__OVERRIDEN_BY = EngineeringPackage.ENGINEERED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT__MODIFIERS = EngineeringPackage.ENGINEERED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Journey Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT_FEATURE_COUNT = EngineeringPackage.ENGINEERED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT___GET_INPUTS__ELIST = EngineeringPackage.ENGINEERED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT___GET_INVOCATIONS__ELIST = EngineeringPackage.ENGINEERED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT___GET_ALL_INPUTS__ELIST = EngineeringPackage.ENGINEERED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT___GET_ALL_INVOCATIONS__ELIST = EngineeringPackage.ENGINEERED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT___GET_ALL_OUTPUTS__ELIST = EngineeringPackage.ENGINEERED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT___GET_ALL_CALLS__ELIST = EngineeringPackage.ENGINEERED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT___OVERRIDES__JOURNEYELEMENT = EngineeringPackage.ENGINEERED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Journey Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_ELEMENT_OPERATION_COUNT = EngineeringPackage.ENGINEERED_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.ActivityImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__URI = JOURNEY_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PATH = JOURNEY_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = JOURNEY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MARKDOWN_DESCRIPTION = JOURNEY_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCES = JOURNEY_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__APPEARANCE = JOURNEY_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TABLE_OF_CONTENTS = JOURNEY_ELEMENT__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SECTIONS = JOURNEY_ELEMENT__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REPRESENTATIONS = JOURNEY_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = JOURNEY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DISCUSSION = JOURNEY_ELEMENT__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TOPICS = JOURNEY_ELEMENT__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ISSUES = JOURNEY_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNERS = JOURNEY_ELEMENT__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXPERTS = JOURNEY_ELEMENT__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ALLOCATIONS = JOURNEY_ELEMENT__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRINCIPLES = JOURNEY_ELEMENT__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ALL_ISSUES = JOURNEY_ELEMENT__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUTS = JOURNEY_ELEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CALLS = JOURNEY_ELEMENT__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REQUIREMENTS = JOURNEY_ELEMENT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DELIVERABLES = JOURNEY_ELEMENT__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PERSONAS = JOURNEY_ELEMENT__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OVERRIDES = JOURNEY_ELEMENT__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OVERRIDEN_BY = JOURNEY_ELEMENT__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MODIFIERS = JOURNEY_ELEMENT__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FEATURES = JOURNEY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SERVICES = JOURNEY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = JOURNEY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_INPUTS__ELIST = JOURNEY_ELEMENT___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_INVOCATIONS__ELIST = JOURNEY_ELEMENT___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_ALL_INPUTS__ELIST = JOURNEY_ELEMENT___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_ALL_INVOCATIONS__ELIST = JOURNEY_ELEMENT___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_ALL_OUTPUTS__ELIST = JOURNEY_ELEMENT___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_ALL_CALLS__ELIST = JOURNEY_ELEMENT___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___OVERRIDES__JOURNEYELEMENT = JOURNEY_ELEMENT___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = JOURNEY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.ServiceImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__URI = JOURNEY_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PATH = JOURNEY_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = JOURNEY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MARKDOWN_DESCRIPTION = JOURNEY_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RESOURCES = JOURNEY_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__APPEARANCE = JOURNEY_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TABLE_OF_CONTENTS = JOURNEY_ELEMENT__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SECTIONS = JOURNEY_ELEMENT__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REPRESENTATIONS = JOURNEY_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = JOURNEY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DISCUSSION = JOURNEY_ELEMENT__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TOPICS = JOURNEY_ELEMENT__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ISSUES = JOURNEY_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OWNERS = JOURNEY_ELEMENT__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXPERTS = JOURNEY_ELEMENT__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ALLOCATIONS = JOURNEY_ELEMENT__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRINCIPLES = JOURNEY_ELEMENT__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ALL_ISSUES = JOURNEY_ELEMENT__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OUTPUTS = JOURNEY_ELEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CALLS = JOURNEY_ELEMENT__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REQUIREMENTS = JOURNEY_ELEMENT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DELIVERABLES = JOURNEY_ELEMENT__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PERSONAS = JOURNEY_ELEMENT__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OVERRIDES = JOURNEY_ELEMENT__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OVERRIDEN_BY = JOURNEY_ELEMENT__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MODIFIERS = JOURNEY_ELEMENT__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TARGET = JOURNEY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = JOURNEY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_INPUTS__ELIST = JOURNEY_ELEMENT___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_INVOCATIONS__ELIST = JOURNEY_ELEMENT___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_ALL_INPUTS__ELIST = JOURNEY_ELEMENT___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_ALL_INVOCATIONS__ELIST = JOURNEY_ELEMENT___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_ALL_OUTPUTS__ELIST = JOURNEY_ELEMENT___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_ALL_CALLS__ELIST = JOURNEY_ELEMENT___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___OVERRIDES__JOURNEYELEMENT = JOURNEY_ELEMENT___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = JOURNEY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.TransitionImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__URI = EngineeringPackage.NAMED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PATH = EngineeringPackage.NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = EngineeringPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__MARKDOWN_DESCRIPTION = EngineeringPackage.NAMED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RESOURCES = EngineeringPackage.NAMED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__APPEARANCE = EngineeringPackage.NAMED_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TABLE_OF_CONTENTS = EngineeringPackage.NAMED_ELEMENT__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SECTIONS = EngineeringPackage.NAMED_ELEMENT__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REPRESENTATIONS = EngineeringPackage.NAMED_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = EngineeringPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PAYLOAD = EngineeringPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SUPPRESS = EngineeringPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = EngineeringPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = EngineeringPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___GET_TARGET__ELIST = EngineeringPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = EngineeringPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.CallImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 4;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__URI = TRANSITION__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__PATH = TRANSITION__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__MARKDOWN_DESCRIPTION = TRANSITION__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__RESOURCES = TRANSITION__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__APPEARANCE = TRANSITION__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__TABLE_OF_CONTENTS = TRANSITION__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__SECTIONS = TRANSITION__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__REPRESENTATIONS = TRANSITION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__PAYLOAD = TRANSITION__PAYLOAD;

	/**
	 * The feature id for the '<em><b>Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__SUPPRESS = TRANSITION__SUPPRESS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__TARGET = TRANSITION__TARGET;

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
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL___GET_TARGET__ELIST = TRANSITION___GET_TARGET__ELIST;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.JourneyImpl <em>Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.JourneyImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getJourney()
	 * @generated
	 */
	int JOURNEY = 5;

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
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__APPEARANCE = ACTIVITY__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__TABLE_OF_CONTENTS = ACTIVITY__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__SECTIONS = ACTIVITY__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__REPRESENTATIONS = ACTIVITY__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__DISCUSSION = ACTIVITY__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__TOPICS = ACTIVITY__TOPICS;

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
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__PRINCIPLES = ACTIVITY__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ALL_ISSUES = ACTIVITY__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__CALLS = ACTIVITY__CALLS;

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
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__PERSONAS = ACTIVITY__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__OVERRIDES = ACTIVITY__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__OVERRIDEN_BY = ACTIVITY__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__MODIFIERS = ACTIVITY__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__FEATURES = ACTIVITY__FEATURES;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__SERVICES = ACTIVITY__SERVICES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ELEMENTS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__EXTENDS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__EXTENSIONS = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ROOT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ALL_ELEMENTS = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY___GET_INPUTS__ELIST = ACTIVITY___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY___GET_INVOCATIONS__ELIST = ACTIVITY___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY___GET_ALL_INPUTS__ELIST = ACTIVITY___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY___GET_ALL_INVOCATIONS__ELIST = ACTIVITY___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY___GET_ALL_OUTPUTS__ELIST = ACTIVITY___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY___GET_ALL_CALLS__ELIST = ACTIVITY___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY___OVERRIDES__JOURNEYELEMENT = ACTIVITY___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.PseudoStateImpl <em>Pseudo State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.PseudoStateImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getPseudoState()
	 * @generated
	 */
	int PSEUDO_STATE = 6;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__URI = JOURNEY_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__PATH = JOURNEY_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__DESCRIPTION = JOURNEY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__MARKDOWN_DESCRIPTION = JOURNEY_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__RESOURCES = JOURNEY_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__APPEARANCE = JOURNEY_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__TABLE_OF_CONTENTS = JOURNEY_ELEMENT__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__SECTIONS = JOURNEY_ELEMENT__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__REPRESENTATIONS = JOURNEY_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__NAME = JOURNEY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__DISCUSSION = JOURNEY_ELEMENT__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__TOPICS = JOURNEY_ELEMENT__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__ISSUES = JOURNEY_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__OWNERS = JOURNEY_ELEMENT__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__EXPERTS = JOURNEY_ELEMENT__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__ALLOCATIONS = JOURNEY_ELEMENT__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__PRINCIPLES = JOURNEY_ELEMENT__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__ALL_ISSUES = JOURNEY_ELEMENT__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__OUTPUTS = JOURNEY_ELEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__CALLS = JOURNEY_ELEMENT__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__REQUIREMENTS = JOURNEY_ELEMENT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__DELIVERABLES = JOURNEY_ELEMENT__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__PERSONAS = JOURNEY_ELEMENT__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__OVERRIDES = JOURNEY_ELEMENT__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__OVERRIDEN_BY = JOURNEY_ELEMENT__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__MODIFIERS = JOURNEY_ELEMENT__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__TYPE = JOURNEY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pseudo State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE_FEATURE_COUNT = JOURNEY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE___GET_INPUTS__ELIST = JOURNEY_ELEMENT___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE___GET_INVOCATIONS__ELIST = JOURNEY_ELEMENT___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE___GET_ALL_INPUTS__ELIST = JOURNEY_ELEMENT___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST = JOURNEY_ELEMENT___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST = JOURNEY_ELEMENT___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE___GET_ALL_CALLS__ELIST = JOURNEY_ELEMENT___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT = JOURNEY_ELEMENT___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Pseudo State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE_OPERATION_COUNT = JOURNEY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.ChoiceImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 7;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.EndImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getEnd()
	 * @generated
	 */
	int END = 8;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.EntryPointImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 9;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.ExitPointImpl <em>Exit Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.ExitPointImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getExitPoint()
	 * @generated
	 */
	int EXIT_POINT = 10;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Exit Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Exit Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.ExpansionInputImpl <em>Expansion Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.ExpansionInputImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getExpansionInput()
	 * @generated
	 */
	int EXPANSION_INPUT = 11;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Expansion Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Expansion Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_INPUT_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.ExpansionOutputImpl <em>Expansion Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.ExpansionOutputImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getExpansionOutput()
	 * @generated
	 */
	int EXPANSION_OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Expansion Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Expansion Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_OUTPUT_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.ForkImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 13;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.InputPinImpl <em>Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.InputPinImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getInputPin()
	 * @generated
	 */
	int INPUT_PIN = 14;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.JoinImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 15;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.OutputPinImpl <em>Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.OutputPinImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getOutputPin()
	 * @generated
	 */
	int OUTPUT_PIN = 16;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.flow.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.flow.impl.StartImpl
	 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getStart()
	 * @generated
	 */
	int START = 17;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__URI = PSEUDO_STATE__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__PATH = PSEUDO_STATE__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__DESCRIPTION = PSEUDO_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__MARKDOWN_DESCRIPTION = PSEUDO_STATE__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__RESOURCES = PSEUDO_STATE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__APPEARANCE = PSEUDO_STATE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__TABLE_OF_CONTENTS = PSEUDO_STATE__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__SECTIONS = PSEUDO_STATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__REPRESENTATIONS = PSEUDO_STATE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = PSEUDO_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__DISCUSSION = PSEUDO_STATE__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__TOPICS = PSEUDO_STATE__TOPICS;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ISSUES = PSEUDO_STATE__ISSUES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OWNERS = PSEUDO_STATE__OWNERS;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__EXPERTS = PSEUDO_STATE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ALLOCATIONS = PSEUDO_STATE__ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Principles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__PRINCIPLES = PSEUDO_STATE__PRINCIPLES;

	/**
	 * The feature id for the '<em><b>All Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ALL_ISSUES = PSEUDO_STATE__ALL_ISSUES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OUTPUTS = PSEUDO_STATE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__CALLS = PSEUDO_STATE__CALLS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__REQUIREMENTS = PSEUDO_STATE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__DELIVERABLES = PSEUDO_STATE__DELIVERABLES;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__PERSONAS = PSEUDO_STATE__PERSONAS;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OVERRIDES = PSEUDO_STATE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Overriden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OVERRIDEN_BY = PSEUDO_STATE__OVERRIDEN_BY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__MODIFIERS = PSEUDO_STATE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__TYPE = PSEUDO_STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___GET_INPUTS__ELIST = PSEUDO_STATE___GET_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___GET_INVOCATIONS__ELIST = PSEUDO_STATE___GET_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___GET_ALL_INPUTS__ELIST = PSEUDO_STATE___GET_ALL_INPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Invocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___GET_ALL_INVOCATIONS__ELIST = PSEUDO_STATE___GET_ALL_INVOCATIONS__ELIST;

	/**
	 * The operation id for the '<em>Get All Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___GET_ALL_OUTPUTS__ELIST = PSEUDO_STATE___GET_ALL_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Get All Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___GET_ALL_CALLS__ELIST = PSEUDO_STATE___GET_ALL_CALLS__ELIST;

	/**
	 * The operation id for the '<em>Overrides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___OVERRIDES__JOURNEYELEMENT = PSEUDO_STATE___OVERRIDES__JOURNEYELEMENT;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.JourneyElement <em>Journey Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Element</em>'.
	 * @see org.nasdanika.engineering.flow.JourneyElement
	 * @generated
	 */
	EClass getJourneyElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.flow.JourneyElement#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getOutputs()
	 * @see #getJourneyElement()
	 * @generated
	 */
	EReference getJourneyElement_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.flow.JourneyElement#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getCalls()
	 * @see #getJourneyElement()
	 * @generated
	 */
	EReference getJourneyElement_Calls();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.flow.JourneyElement#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getRequirements()
	 * @see #getJourneyElement()
	 * @generated
	 */
	EReference getJourneyElement_Requirements();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.flow.JourneyElement#getDeliverables <em>Deliverables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deliverables</em>'.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getDeliverables()
	 * @see #getJourneyElement()
	 * @generated
	 */
	EReference getJourneyElement_Deliverables();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.flow.JourneyElement#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Personas</em>'.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getPersonas()
	 * @see #getJourneyElement()
	 * @generated
	 */
	EReference getJourneyElement_Personas();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.flow.JourneyElement#getOverrides <em>Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overrides</em>'.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getOverrides()
	 * @see #getJourneyElement()
	 * @generated
	 */
	EReference getJourneyElement_Overrides();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.flow.JourneyElement#getOverridenBy <em>Overriden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overriden By</em>'.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getOverridenBy()
	 * @see #getJourneyElement()
	 * @generated
	 */
	EReference getJourneyElement_OverridenBy();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.engineering.flow.JourneyElement#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getModifiers()
	 * @see #getJourneyElement()
	 * @generated
	 */
	EAttribute getJourneyElement_Modifiers();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.engineering.flow.JourneyElement#getInputs(org.eclipse.emf.common.util.EList) <em>Get Inputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inputs</em>' operation.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getInputs(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getJourneyElement__GetInputs__EList();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.engineering.flow.JourneyElement#getInvocations(org.eclipse.emf.common.util.EList) <em>Get Invocations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invocations</em>' operation.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getInvocations(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getJourneyElement__GetInvocations__EList();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.engineering.flow.JourneyElement#getAllInputs(org.eclipse.emf.common.util.EList) <em>Get All Inputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Inputs</em>' operation.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getAllInputs(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getJourneyElement__GetAllInputs__EList();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.engineering.flow.JourneyElement#getAllInvocations(org.eclipse.emf.common.util.EList) <em>Get All Invocations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Invocations</em>' operation.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getAllInvocations(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getJourneyElement__GetAllInvocations__EList();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.engineering.flow.JourneyElement#getAllOutputs(org.eclipse.emf.common.util.EList) <em>Get All Outputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Outputs</em>' operation.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getAllOutputs(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getJourneyElement__GetAllOutputs__EList();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.engineering.flow.JourneyElement#getAllCalls(org.eclipse.emf.common.util.EList) <em>Get All Calls</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Calls</em>' operation.
	 * @see org.nasdanika.engineering.flow.JourneyElement#getAllCalls(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getJourneyElement__GetAllCalls__EList();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.engineering.flow.JourneyElement#overrides(org.nasdanika.engineering.flow.JourneyElement) <em>Overrides</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Overrides</em>' operation.
	 * @see org.nasdanika.engineering.flow.JourneyElement#overrides(org.nasdanika.engineering.flow.JourneyElement)
	 * @generated
	 */
	EOperation getJourneyElement__Overrides__JourneyElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.nasdanika.engineering.flow.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.flow.Activity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.nasdanika.engineering.flow.Activity#getFeatures()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Features();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.flow.Activity#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see org.nasdanika.engineering.flow.Activity#getServices()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Services();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.nasdanika.engineering.flow.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.flow.Service#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.engineering.flow.Service#getTarget()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.nasdanika.engineering.flow.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.flow.Transition#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payload</em>'.
	 * @see org.nasdanika.engineering.flow.Transition#getPayload()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Payload();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.flow.Transition#isSuppress <em>Suppress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress</em>'.
	 * @see org.nasdanika.engineering.flow.Transition#isSuppress()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Suppress();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.flow.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.nasdanika.engineering.flow.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Target();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.engineering.flow.Transition#getTarget(org.eclipse.emf.common.util.EList) <em>Get Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target</em>' operation.
	 * @see org.nasdanika.engineering.flow.Transition#getTarget(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTransition__GetTarget__EList();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.nasdanika.engineering.flow.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.flow.Call#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Response</em>'.
	 * @see org.nasdanika.engineering.flow.Call#getResponse()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Response();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.Journey <em>Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey</em>'.
	 * @see org.nasdanika.engineering.flow.Journey
	 * @generated
	 */
	EClass getJourney();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.engineering.flow.Journey#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.engineering.flow.Journey#getElements()
	 * @see #getJourney()
	 * @generated
	 */
	EReference getJourney_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.flow.Journey#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see org.nasdanika.engineering.flow.Journey#getExtends()
	 * @see #getJourney()
	 * @generated
	 */
	EReference getJourney_Extends();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.flow.Journey#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extensions</em>'.
	 * @see org.nasdanika.engineering.flow.Journey#getExtensions()
	 * @see #getJourney()
	 * @generated
	 */
	EReference getJourney_Extensions();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.engineering.flow.Journey#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see org.nasdanika.engineering.flow.Journey#getRoot()
	 * @see #getJourney()
	 * @generated
	 */
	EReference getJourney_Root();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.engineering.flow.Journey#getAllElements <em>All Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Elements</em>'.
	 * @see org.nasdanika.engineering.flow.Journey#getAllElements()
	 * @see #getJourney()
	 * @generated
	 */
	EReference getJourney_AllElements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.PseudoState <em>Pseudo State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo State</em>'.
	 * @see org.nasdanika.engineering.flow.PseudoState
	 * @generated
	 */
	EClass getPseudoState();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.flow.PseudoState#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.engineering.flow.PseudoState#getType()
	 * @see #getPseudoState()
	 * @generated
	 */
	EAttribute getPseudoState_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see org.nasdanika.engineering.flow.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see org.nasdanika.engineering.flow.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see org.nasdanika.engineering.flow.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.ExitPoint <em>Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Point</em>'.
	 * @see org.nasdanika.engineering.flow.ExitPoint
	 * @generated
	 */
	EClass getExitPoint();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.ExpansionInput <em>Expansion Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expansion Input</em>'.
	 * @see org.nasdanika.engineering.flow.ExpansionInput
	 * @generated
	 */
	EClass getExpansionInput();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.ExpansionOutput <em>Expansion Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expansion Output</em>'.
	 * @see org.nasdanika.engineering.flow.ExpansionOutput
	 * @generated
	 */
	EClass getExpansionOutput();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see org.nasdanika.engineering.flow.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pin</em>'.
	 * @see org.nasdanika.engineering.flow.InputPin
	 * @generated
	 */
	EClass getInputPin();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see org.nasdanika.engineering.flow.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pin</em>'.
	 * @see org.nasdanika.engineering.flow.OutputPin
	 * @generated
	 */
	EClass getOutputPin();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.flow.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see org.nasdanika.engineering.flow.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowFactory getFlowFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.JourneyElementImpl <em>Journey Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.JourneyElementImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getJourneyElement()
		 * @generated
		 */
		EClass JOURNEY_ELEMENT = eINSTANCE.getJourneyElement();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_ELEMENT__OUTPUTS = eINSTANCE.getJourneyElement_Outputs();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_ELEMENT__CALLS = eINSTANCE.getJourneyElement_Calls();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_ELEMENT__REQUIREMENTS = eINSTANCE.getJourneyElement_Requirements();

		/**
		 * The meta object literal for the '<em><b>Deliverables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_ELEMENT__DELIVERABLES = eINSTANCE.getJourneyElement_Deliverables();

		/**
		 * The meta object literal for the '<em><b>Personas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_ELEMENT__PERSONAS = eINSTANCE.getJourneyElement_Personas();

		/**
		 * The meta object literal for the '<em><b>Overrides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_ELEMENT__OVERRIDES = eINSTANCE.getJourneyElement_Overrides();

		/**
		 * The meta object literal for the '<em><b>Overriden By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_ELEMENT__OVERRIDEN_BY = eINSTANCE.getJourneyElement_OverridenBy();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_ELEMENT__MODIFIERS = eINSTANCE.getJourneyElement_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Get Inputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOURNEY_ELEMENT___GET_INPUTS__ELIST = eINSTANCE.getJourneyElement__GetInputs__EList();

		/**
		 * The meta object literal for the '<em><b>Get Invocations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOURNEY_ELEMENT___GET_INVOCATIONS__ELIST = eINSTANCE.getJourneyElement__GetInvocations__EList();

		/**
		 * The meta object literal for the '<em><b>Get All Inputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOURNEY_ELEMENT___GET_ALL_INPUTS__ELIST = eINSTANCE.getJourneyElement__GetAllInputs__EList();

		/**
		 * The meta object literal for the '<em><b>Get All Invocations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOURNEY_ELEMENT___GET_ALL_INVOCATIONS__ELIST = eINSTANCE.getJourneyElement__GetAllInvocations__EList();

		/**
		 * The meta object literal for the '<em><b>Get All Outputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOURNEY_ELEMENT___GET_ALL_OUTPUTS__ELIST = eINSTANCE.getJourneyElement__GetAllOutputs__EList();

		/**
		 * The meta object literal for the '<em><b>Get All Calls</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOURNEY_ELEMENT___GET_ALL_CALLS__ELIST = eINSTANCE.getJourneyElement__GetAllCalls__EList();

		/**
		 * The meta object literal for the '<em><b>Overrides</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOURNEY_ELEMENT___OVERRIDES__JOURNEYELEMENT = eINSTANCE.getJourneyElement__Overrides__JourneyElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.ActivityImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__FEATURES = eINSTANCE.getActivity_Features();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SERVICES = eINSTANCE.getActivity_Services();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.ServiceImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__TARGET = eINSTANCE.getService_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.TransitionImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__PAYLOAD = eINSTANCE.getTransition_Payload();

		/**
		 * The meta object literal for the '<em><b>Suppress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__SUPPRESS = eINSTANCE.getTransition_Suppress();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Get Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___GET_TARGET__ELIST = eINSTANCE.getTransition__GetTarget__EList();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.CallImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getCall()
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
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.JourneyImpl <em>Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.JourneyImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getJourney()
		 * @generated
		 */
		EClass JOURNEY = eINSTANCE.getJourney();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY__ELEMENTS = eINSTANCE.getJourney_Elements();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY__EXTENDS = eINSTANCE.getJourney_Extends();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY__EXTENSIONS = eINSTANCE.getJourney_Extensions();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY__ROOT = eINSTANCE.getJourney_Root();

		/**
		 * The meta object literal for the '<em><b>All Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY__ALL_ELEMENTS = eINSTANCE.getJourney_AllElements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.PseudoStateImpl <em>Pseudo State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.PseudoStateImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getPseudoState()
		 * @generated
		 */
		EClass PSEUDO_STATE = eINSTANCE.getPseudoState();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSEUDO_STATE__TYPE = eINSTANCE.getPseudoState_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.ChoiceImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.EndImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.EntryPointImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.ExitPointImpl <em>Exit Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.ExitPointImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getExitPoint()
		 * @generated
		 */
		EClass EXIT_POINT = eINSTANCE.getExitPoint();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.ExpansionInputImpl <em>Expansion Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.ExpansionInputImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getExpansionInput()
		 * @generated
		 */
		EClass EXPANSION_INPUT = eINSTANCE.getExpansionInput();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.ExpansionOutputImpl <em>Expansion Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.ExpansionOutputImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getExpansionOutput()
		 * @generated
		 */
		EClass EXPANSION_OUTPUT = eINSTANCE.getExpansionOutput();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.ForkImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.InputPinImpl <em>Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.InputPinImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getInputPin()
		 * @generated
		 */
		EClass INPUT_PIN = eINSTANCE.getInputPin();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.JoinImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.OutputPinImpl <em>Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.OutputPinImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getOutputPin()
		 * @generated
		 */
		EClass OUTPUT_PIN = eINSTANCE.getOutputPin();

		/**
		 * The meta object literal for the '{@link org.nasdanika.engineering.flow.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.flow.impl.StartImpl
		 * @see org.nasdanika.engineering.flow.impl.FlowPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

	}

} //FlowPackage
