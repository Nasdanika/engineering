/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Transition#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Transition#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Transition#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getTransition()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/transition.md'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Activity)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTransition_Target()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika default-feature='true'"
	 * @generated
	 */
	Activity getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Activity value);

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getTransition_Payload()
	 * @model
	 * @generated
	 */
	EList<Artifact> getPayload();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTransition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Transition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Transition
