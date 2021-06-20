/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.nasdanika.engineering.Transition#isSuppress <em>Suppress</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Transition#getTargetId <em>Target Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getTransition()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/transition.md'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='target'"
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transition's target journey element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see org.nasdanika.engineering.EngineeringPackage#getTransition_Target()
	 * @model changeable="false" derived="true"
	 *        annotation="urn:org.nasdanika default-feature='true'"
	 * @generated
	 */
	JourneyElement getTarget();

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts passed from source to target activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getTransition_Payload()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getPayload();

	/**
	 * Returns the value of the '<em><b>Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can be used in journeys extending other journeys to remove the inherited transition from the list of outputs/call. Transitions to supprressed journey elements are automatically supppressed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suppress</em>' attribute.
	 * @see #setSuppress(boolean)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTransition_Suppress()
	 * @model
	 * @generated
	 */
	boolean isSuppress();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Transition#isSuppress <em>Suppress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress</em>' attribute.
	 * @see #isSuppress()
	 * @generated
	 */
	void setSuppress(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative path to the target [journey element](JourneyElement.html). May contain ``..`` to navigate to the parent [journey](Journey.html) - i.e. the journey which contains the journey containing the element which contains this transition. May contain ``/`` to navigate to nested journeys. Treated as URI if contains ``:``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Id</em>' attribute.
	 * @see #setTargetId(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTransition_TargetId()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika default-feature='true' load-key='target'"
	 * @generated
	 */
	String getTargetId();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Transition#getTargetId <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' attribute.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(String value);

} // Transition
