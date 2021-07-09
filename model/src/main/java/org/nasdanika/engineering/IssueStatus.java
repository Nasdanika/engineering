/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.IssueStatus#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.IssueStatus#isDone <em>Done</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getIssueStatus()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/issue-status.md'"
 * @generated
 */
public interface IssueStatus extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues in this status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issues</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssueStatus_Issues()
	 * @see org.nasdanika.engineering.Issue#getStatus
	 * @model opposite="status" changeable="false" derived="true"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If ``true``, indicates that the issue in this status is successfully completed and issues requiring is are now workable. Issue can be completed (completion = 1), but not done, e.g. it can be cancelled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #setDone(boolean)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssueStatus_Done()
	 * @model
	 * @generated
	 */
	boolean isDone();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.IssueStatus#isDone <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #isDone()
	 * @generated
	 */
	void setDone(boolean value);

} // IssueStatus
