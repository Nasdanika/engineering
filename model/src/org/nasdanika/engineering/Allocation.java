/**
 */
package org.nasdanika.engineering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Allocation#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Allocation#getEngineer <em>Engineer</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Allocation#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Allocation#getRate <em>Rate</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Allocation#getFunds <em>Funds</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getAllocation()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/allocation.md'"
 * @generated
 */
public interface Allocation extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' reference.
	 * @see #setIncrement(Increment)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAllocation_Increment()
	 * @model
	 * @generated
	 */
	Increment getIncrement();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Allocation#getIncrement <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Increment value);

	/**
	 * Returns the value of the '<em><b>Engineer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Engineer#getDesignations <em>Designations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engineer</em>' reference.
	 * @see #setEngineer(Engineer)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAllocation_Engineer()
	 * @see org.nasdanika.engineering.Engineer#getDesignations
	 * @model opposite="designations"
	 * @generated
	 */
	Engineer getEngineer();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Allocation#getEngineer <em>Engineer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineer</em>' reference.
	 * @see #getEngineer()
	 * @generated
	 */
	void setEngineer(Engineer value);

	/**
	 * Returns the value of the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effort</em>' attribute.
	 * @see #setEffort(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAllocation_Effort()
	 * @model
	 * @generated
	 */
	double getEffort();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Allocation#getEffort <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort</em>' attribute.
	 * @see #getEffort()
	 * @generated
	 */
	void setEffort(double value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAllocation_Rate()
	 * @model
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Allocation#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

	/**
	 * Returns the value of the '<em><b>Funds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funds</em>' attribute.
	 * @see #setFunds(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAllocation_Funds()
	 * @model
	 * @generated
	 */
	double getFunds();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Allocation#getFunds <em>Funds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funds</em>' attribute.
	 * @see #getFunds()
	 * @generated
	 */
	void setFunds(double value);

} // Allocation
