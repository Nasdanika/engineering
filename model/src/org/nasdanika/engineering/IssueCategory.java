/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.IssueCategory#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.engineering.IssueCategory#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.IssueCategory#isCumulative <em>Cumulative</em>}</li>
 *   <li>{@link org.nasdanika.engineering.IssueCategory#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getIssueCategory()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/issue-category.md'"
 * @generated
 */
public interface IssueCategory extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category relative importance. Can be used to allocate issues to increments in a balanced way.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssueCategory_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.IssueCategory#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Issue#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues in the category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issues</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssueCategory_Issues()
	 * @see org.nasdanika.engineering.Issue#getCategory
	 * @model opposite="category" changeable="false" derived="true"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Cumulative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, unused category weight "capacity" is carried over to future increments and overused is subtracted from future increments. This allow low-weight categories to accumulate weight over time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cumulative</em>' attribute.
	 * @see #setCumulative(boolean)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssueCategory_Cumulative()
	 * @model
	 * @generated
	 */
	boolean isCumulative();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.IssueCategory#isCumulative <em>Cumulative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cumulative</em>' attribute.
	 * @see #isCumulative()
	 * @generated
	 */
	void setCumulative(boolean value);

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Allocation}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Allocation#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allocations for this category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocations</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssueCategory_Allocations()
	 * @see org.nasdanika.engineering.Allocation#getCategory
	 * @model opposite="category" changeable="false" derived="true"
	 * @generated
	 */
	EList<Allocation> getAllocations();

} // IssueCategory
