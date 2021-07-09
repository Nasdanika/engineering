/**
 */
package org.nasdanika.engineering.representation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.nasdanika.engineering.representation.RepresentationFactory
 * @model kind="package"
 *        annotation="urn:org.nasdanika documentation-reference='doc/representation/package-summary.md'"
 * @generated
 */
public interface RepresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "representation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.engineering.representation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.engineering.representation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepresentationPackage eINSTANCE = org.nasdanika.engineering.representation.impl.RepresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.engineering.representation.impl.ComponentDiagramImpl <em>Component Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.engineering.representation.impl.ComponentDiagramImpl
	 * @see org.nasdanika.engineering.representation.impl.RepresentationPackageImpl#getComponentDiagram()
	 * @generated
	 */
	int COMPONENT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__URI = EngineeringPackage.NAMED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__PATH = EngineeringPackage.NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__DESCRIPTION = EngineeringPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__MARKDOWN_DESCRIPTION = EngineeringPackage.NAMED_ELEMENT__MARKDOWN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__RESOURCES = EngineeringPackage.NAMED_ELEMENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__APPEARANCE = EngineeringPackage.NAMED_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__TABLE_OF_CONTENTS = EngineeringPackage.NAMED_ELEMENT__TABLE_OF_CONTENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__SECTIONS = EngineeringPackage.NAMED_ELEMENT__SECTIONS;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__REPRESENTATIONS = EngineeringPackage.NAMED_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__NAME = EngineeringPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Depth Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__DEPTH_OUT = EngineeringPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depth In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__DEPTH_IN = EngineeringPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM_FEATURE_COUNT = EngineeringPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM_OPERATION_COUNT = EngineeringPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.engineering.representation.ComponentDiagram <em>Component Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Diagram</em>'.
	 * @see org.nasdanika.engineering.representation.ComponentDiagram
	 * @generated
	 */
	EClass getComponentDiagram();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.representation.ComponentDiagram#getDepthOut <em>Depth Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth Out</em>'.
	 * @see org.nasdanika.engineering.representation.ComponentDiagram#getDepthOut()
	 * @see #getComponentDiagram()
	 * @generated
	 */
	EAttribute getComponentDiagram_DepthOut();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.engineering.representation.ComponentDiagram#getDepthIn <em>Depth In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth In</em>'.
	 * @see org.nasdanika.engineering.representation.ComponentDiagram#getDepthIn()
	 * @see #getComponentDiagram()
	 * @generated
	 */
	EAttribute getComponentDiagram_DepthIn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepresentationFactory getRepresentationFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.engineering.representation.impl.ComponentDiagramImpl <em>Component Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.engineering.representation.impl.ComponentDiagramImpl
		 * @see org.nasdanika.engineering.representation.impl.RepresentationPackageImpl#getComponentDiagram()
		 * @generated
		 */
		EClass COMPONENT_DIAGRAM = eINSTANCE.getComponentDiagram();
		/**
		 * The meta object literal for the '<em><b>Depth Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DIAGRAM__DEPTH_OUT = eINSTANCE.getComponentDiagram_DepthOut();
		/**
		 * The meta object literal for the '<em><b>Depth In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DIAGRAM__DEPTH_IN = eINSTANCE.getComponentDiagram_DepthIn();

	}

} //RepresentationPackage
