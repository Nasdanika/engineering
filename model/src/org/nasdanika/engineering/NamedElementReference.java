/**
 */
package org.nasdanika.engineering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.NamedElementReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getNamedElementReference()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/named-element-reference.md'"
 * @generated
 */
public interface NamedElementReference extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NamedElement)
	 * @see org.nasdanika.engineering.EngineeringPackage#getNamedElementReference_Target()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika default-property='true'"
	 * @generated
	 */
	NamedElement getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.NamedElementReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NamedElement value);

} // NamedElementReference
