/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.diagram.Connection;
import org.nasdanika.diagram.DiagramElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineered Element Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.EngineeredElementStatus#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElementStatus#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElementStatus#getElementStyle <em>Element Style</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElementStatus#getConnectionStyle <em>Connection Style</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElementStatus()
 * @model
 * @generated
 */
public interface EngineeredElementStatus extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.EngineeredElementStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EngineeredElement statuses can form a hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElementStatus_Children()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<EngineeredElementStatus> getChildren();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.EngineeredElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineered elements in this status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElementStatus_Elements()
	 * @model changeable="false" derived="true"
	 *        annotation="urn:org.nasdanika opposite='status'"
	 * @generated
	 */
	EList<EngineeredElement> getElements();

	/**
	 * Returns the value of the '<em><b>Element Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Style</em>' containment reference.
	 * @see #setElementStyle(DiagramElement)
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElementStatus_ElementStyle()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	DiagramElement getElementStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.EngineeredElementStatus#getElementStyle <em>Element Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Style</em>' containment reference.
	 * @see #getElementStyle()
	 * @generated
	 */
	void setElementStyle(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>Connection Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Style</em>' containment reference.
	 * @see #setConnectionStyle(Connection)
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElementStatus_ConnectionStyle()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	Connection getConnectionStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.EngineeredElementStatus#getConnectionStyle <em>Connection Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Style</em>' containment reference.
	 * @see #getConnectionStyle()
	 * @generated
	 */
	void setConnectionStyle(Connection value);

} // EngineeredElementStatus
