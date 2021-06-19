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
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getTransition()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/transition.md'"
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
	 * @see #setTarget(JourneyElement)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTransition_Target()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika default-feature='true'"
	 * @generated
	 */
	JourneyElement getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(JourneyElement value);

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

} // Transition
