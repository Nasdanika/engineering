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
 *   <li>{@link org.nasdanika.engineering.Allocation#getEngineer <em>Engineer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getAllocation()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/allocation.md'"
 * @generated
 */
public interface Allocation extends Capacity {
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

} // Allocation
