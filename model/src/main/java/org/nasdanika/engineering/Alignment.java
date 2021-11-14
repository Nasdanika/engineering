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
 *   <li>{@link org.nasdanika.engineering.Alignment#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getAlignment()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/alignment.md'"
 * @generated
 */
public interface Alignment extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Aim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aim to which the containing element, e.g. [endeavor](Endeavor.html) aligns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aim</em>' reference.
	 * @see #setAim(Aim)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAlignment_Aim()
	 * @model annotation="urn:org.nasdanika default-feature='true'"
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

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alignment weight can be used with [Objective](Objective.html) and [KeyResult](KeyResult.html) aims to indicate how much the containing endeavor contributes to completion of the aim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAlignment_Weight()
	 * @model default="1"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Alignment#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

} // Alignment
