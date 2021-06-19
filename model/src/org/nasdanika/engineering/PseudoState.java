/**
 */
package org.nasdanika.engineering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.PseudoState#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getPseudoState()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/pseudo-state.md'"
 * @generated
 */
public interface PseudoState extends JourneyElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pseudo-state type provided by concrete sub-classes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getPseudoState_Type()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	String getType();

} // PseudoState
