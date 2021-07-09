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
 *   <li>{@link org.nasdanika.engineering.Allocation#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getAllocation()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/allocation.md'"
 * @generated
 */
public interface Allocation extends Capacity {
	/**
	 * Returns the value of the '<em><b>Engineer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Engineer#getDesignations <em>Designations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineer whose capacity is allocated to work on the containing [engineered element](EngineeredElement.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineer</em>' reference.
	 * @see #setEngineer(Engineer)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAllocation_Engineer()
	 * @see org.nasdanika.engineering.Engineer#getDesignations
	 * @model opposite="designations" required="true"
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
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.IssueCategory#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional issue category for this allocation. E.g. a allocation can be made to "Documentation" or "Test coverage" categories.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(IssueCategory)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAllocation_Category()
	 * @see org.nasdanika.engineering.IssueCategory#getAllocations
	 * @model opposite="allocations"
	 * @generated
	 */
	IssueCategory getCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Allocation#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(IssueCategory value);

} // Allocation
