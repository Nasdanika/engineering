/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.nasdanika.engineering.Issue#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getIncrementId <em>Increment Id</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getContributesTo <em>Contributes To</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#isDone <em>Done</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getIssue()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/issue.md'"
 * @generated
 */
public interface Issue extends Capability {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Children()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
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
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Capability}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Capability#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities required to start working on an issue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Requirements()
	 * @see org.nasdanika.engineering.Capability#getRequiredBy
	 * @model opposite="requiredBy"
	 * @generated
	 */
	EList<Capability> getRequirements();

	/**
	 * Returns the value of the '<em><b>Increment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Id</em>' attribute.
	 * @see #setIncrementId(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_IncrementId()
	 * @model annotation="urn:org.nasdanika load-key='increment_'"
	 * @generated
	 */
	String getIncrementId();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getIncrementId <em>Increment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Id</em>' attribute.
	 * @see #getIncrementId()
	 * @generated
	 */
	void setIncrementId(String value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' reference.
	 * @see #setIncrement(Increment)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Increment()
	 * @model annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	Increment getIncrement();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getIncrement <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Increment value);

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

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #setDone(boolean)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Done()
	 * @model
	 * @generated
	 */
	boolean isDone();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#isDone <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #isDone()
	 * @generated
	 */
	void setDone(boolean value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Notes()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Note> getNotes();

} // Issue
