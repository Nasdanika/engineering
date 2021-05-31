/**
 */
package org.nasdanika.engineering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Alignment#getAim <em>Aim</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getAlignment()
 * @model
 * @generated
 */
public interface Alignment extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Aim</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Aim#getAlignments <em>Alignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aim</em>' reference.
	 * @see #setAim(Aim)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAlignment_Aim()
	 * @see org.nasdanika.engineering.Aim#getAlignments
	 * @model opposite="alignments"
	 *        annotation="urn:org.nasdanika default-feature='true'"
	 * @generated
	 */
	Aim getAim();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Alignment#getAim <em>Aim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aim</em>' reference.
	 * @see #getAim()
	 * @generated
	 */
	void setAim(Aim value);

} // Alignment
