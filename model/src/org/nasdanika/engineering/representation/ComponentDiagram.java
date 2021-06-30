/**
 */
package org.nasdanika.engineering.representation;

import org.nasdanika.engineering.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.representation.ComponentDiagram#getDepthOut <em>Depth Out</em>}</li>
 *   <li>{@link org.nasdanika.engineering.representation.ComponentDiagram#getDepthIn <em>Depth In</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.representation.RepresentationPackage#getComponentDiagram()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/representation/component-diagram.md'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='container'"
 * @generated
 */
public interface ComponentDiagram extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Depth Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Depth of outbound dependencies - what this module or module contained in the engineer depends on. Zero means unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depth Out</em>' attribute.
	 * @see #setDepthOut(int)
	 * @see org.nasdanika.engineering.representation.RepresentationPackage#getComponentDiagram_DepthOut()
	 * @model
	 * @generated
	 */
	int getDepthOut();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.representation.ComponentDiagram#getDepthOut <em>Depth Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Out</em>' attribute.
	 * @see #getDepthOut()
	 * @generated
	 */
	void setDepthOut(int value);

	/**
	 * Returns the value of the '<em><b>Depth In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Depth of inbound dependencies - which modules depend on this module or module contained in this engineer. Zero means unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depth In</em>' attribute.
	 * @see #setDepthIn(int)
	 * @see org.nasdanika.engineering.representation.RepresentationPackage#getComponentDiagram_DepthIn()
	 * @model
	 * @generated
	 */
	int getDepthIn();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.representation.ComponentDiagram#getDepthIn <em>Depth In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth In</em>' attribute.
	 * @see #getDepthIn()
	 * @generated
	 */
	void setDepthIn(int value);
} // ComponentDiagram
