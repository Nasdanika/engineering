/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Issue#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getPlannedFor <em>Planned For</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getContributesTo <em>Contributes To</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getIssue()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/issue.md'"
 * @generated
 */
public interface Issue extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getChildren();

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(Engineer)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Assignee()
	 * @model
	 * @generated
	 */
	Engineer getAssignee();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(Engineer value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Release}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Release> getDependencies();

	/**
	 * Returns the value of the '<em><b>Planned For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned For</em>' reference.
	 * @see #setPlannedFor(Release)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_PlannedFor()
	 * @model
	 * @generated
	 */
	Release getPlannedFor();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getPlannedFor <em>Planned For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned For</em>' reference.
	 * @see #getPlannedFor()
	 * @generated
	 */
	void setPlannedFor(Release value);

	/**
	 * Returns the value of the '<em><b>Contributes To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributes To</em>' reference.
	 * @see #setContributesTo(Feature)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_ContributesTo()
	 * @model
	 * @generated
	 */
	Feature getContributesTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getContributesTo <em>Contributes To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributes To</em>' reference.
	 * @see #getContributesTo()
	 * @generated
	 */
	void setContributesTo(Feature value);

} // Issue
