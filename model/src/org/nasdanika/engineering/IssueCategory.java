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
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getIssueCategory()
 * @model
 * @generated
 */
public interface IssueCategory extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} // IssueCategory