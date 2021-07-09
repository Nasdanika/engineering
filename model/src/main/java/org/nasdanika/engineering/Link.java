/**
 */
package org.nasdanika.engineering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Link#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getLink()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/link.md'"
 * @generated
 */
public interface Link extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target URL
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getLink_Target()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika default-feature='true'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Link#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // Link
