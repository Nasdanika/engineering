/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Activity is an operation which can pass control to another activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Activity#getOutboundTransitions <em>Outbound Transitions</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getInboundTransitions <em>Inbound Transitions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Operation {
	/**
	 * Returns the value of the '<em><b>Outbound Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitions from this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outbound Transitions</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_OutboundTransitions()
	 * @model containment="true" transient="true" derived="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Transition> getOutboundTransitions();

	/**
	 * Returns the value of the '<em><b>Inbound Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitions to this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inbound Transitions</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_InboundTransitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getInboundTransitions();

} // Activity
