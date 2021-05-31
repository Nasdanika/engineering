/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Call#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getCall()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/call.md'"
 * @generated
 */
public interface Call extends Transition {
	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response artifacts passed back from the target to the source activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getCall_Response()
	 * @model
	 * @generated
	 */
	EList<Artifact> getResponse();

} // Call
