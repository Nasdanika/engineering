/**
 */
package org.nasdanika.engineering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Feature#getRelease <em>Release</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getFeature()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/feature.md'"
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' reference.
	 * @see #setRelease(Release)
	 * @see org.nasdanika.engineering.EngineeringPackage#getFeature_Release()
	 * @model
	 * @generated
	 */
	Release getRelease();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Feature#getRelease <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(Release value);

} // Feature
