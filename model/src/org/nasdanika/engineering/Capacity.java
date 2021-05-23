/**
 */
package org.nasdanika.engineering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Capacity#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Capacity#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Capacity#getFunds <em>Funds</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Capacity#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getCapacity()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/capacity.md'"
 * @generated
 */
public interface Capacity extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Increment#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' reference.
	 * @see #setIncrement(Increment)
	 * @see org.nasdanika.engineering.EngineeringPackage#getCapacity_Increment()
	 * @see org.nasdanika.engineering.Increment#getCapacity
	 * @model opposite="capacity"
	 * @generated
	 */
	Increment getIncrement();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Capacity#getIncrement <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Increment value);

	/**
	 * Returns the value of the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effort</em>' attribute.
	 * @see #setEffort(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getCapacity_Effort()
	 * @model
	 * @generated
	 */
	double getEffort();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Capacity#getEffort <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort</em>' attribute.
	 * @see #getEffort()
	 * @generated
	 */
	void setEffort(double value);

	/**
	 * Returns the value of the '<em><b>Funds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funds</em>' attribute.
	 * @see #setFunds(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getCapacity_Funds()
	 * @model
	 * @generated
	 */
	double getFunds();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Capacity#getFunds <em>Funds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funds</em>' attribute.
	 * @see #getFunds()
	 * @generated
	 */
	void setFunds(double value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getCapacity_Rate()
	 * @model
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Capacity#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

} // Capacity
