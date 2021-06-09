/**
 */
package org.nasdanika.engineering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.KeyResult#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.engineering.KeyResult#getCompletion <em>Completion</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getKeyResult()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/key-result.md'"
 * @generated
 */
public interface KeyResult extends Aim {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how much this key result or [objective](Objective.html) contributes to completion of the containing or parent objective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getKeyResult_Weight()
	 * @model default="1"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.KeyResult#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number between 0 and 1. Computed from alignments for key results and for alignments, key results, and sub-objectives for [objectives](Objective.html)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getKeyResult_Completion()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	double getCompletion();

} // KeyResult
