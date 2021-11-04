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
 *   <li>{@link org.nasdanika.engineering.Issue#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getContributesTo <em>Contributes To</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#isWorkable <em>Workable</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getCost <em>Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getRemainingEffort <em>Remaining Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Issue#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getIssue()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/issue.md'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='increment'"
 * @generated
 */
public interface Issue extends EngineeredCapability {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues can be infinitely nested to form a [Work Breakdown Structure](https://en.wikipedia.org/wiki/Work_breakdown_structure).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Children()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Issue> getChildren();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities required to start working on an issue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Requires()
	 * @model annotation="urn:org.nasdanika opposite='requiredBy'"
	 * @generated
	 */
	EList<Capability> getRequires();

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Increment#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment for which this issue is directly scheduled. Issue can be scheduled for an increment directly or indirectly via [features](Feature.html) and [releases](Release.html). Release increment can be different from issue incrmenent. E.g. issue can be scheduled for May, but its release might be scheduled for July.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Increment</em>' reference.
	 * @see #setIncrement(Increment)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Increment()
	 * @see org.nasdanika.engineering.Increment#getIssues
	 * @model opposite="issues"
	 *        annotation="urn:org.nasdanika opposite='issues'"
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
	 * Returns the value of the '<em><b>Contributes To</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue can contribute to zero or more features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributes To</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_ContributesTo()
	 * @model annotation="urn:org.nasdanika opposite='issues'"
	 * @generated
	 */
	EList<Feature> getContributesTo();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(IssueStatus)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Status()
	 * @model annotation="urn:org.nasdanika opposite='issues'"
	 * @generated
	 */
	IssueStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IssueStatus value);

	/**
	 * Returns the value of the '<em><b>Workable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue is workable if it doesn't have any unavailable required capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workable</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Workable()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	boolean isWorkable();

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Release}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Release#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue can be planned for zero or more releases directly. It can be also indirectly planned for releases via contribution to [features](Feature.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Releases</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Releases()
	 * @see org.nasdanika.engineering.Release#getIssues
	 * @model opposite="issues"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Release> getReleases();

	/**
	 * Returns the value of the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Effort for this issue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effort</em>' attribute.
	 * @see #setEffort(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Effort()
	 * @model
	 * @generated
	 */
	double getEffort();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getEffort <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort</em>' attribute.
	 * @see #getEffort()
	 * @generated
	 */
	void setEffort(double value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monetary cost for this issue, e.g. cost of materials.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Remaining Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remaining effort is computed from issue effort and [notes](Note.html) effort or remaining effort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Effort</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_RemainingEffort()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	double getRemainingEffort();

	/**
	 * Returns the value of the '<em><b>Remaining Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remaining cost is computed from issue cost and [notes](Note.html) cost or remaining cost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Cost</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_RemainingCost()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	double getRemainingCost();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' reference.
	 * @see #setPriority(IssuePriority)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Priority()
	 * @model annotation="urn:org.nasdanika opposite='issues'"
	 * @generated
	 */
	IssuePriority getPriority();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getPriority <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(IssuePriority value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' reference.
	 * @see #setSeverity(IssueSeverity)
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Severity()
	 * @model annotation="urn:org.nasdanika opposite='issues'"
	 * @generated
	 */
	IssueSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Issue#getSeverity <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(IssueSeverity value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue notes are used for discussion and to record progress, remaining effort, and issue status if it is not set at the issue level. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Notes()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Note> getNotes();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.IssueCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Categories()
	 * @model annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<IssueCategory> getCategories();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target element for this issue - container of the issue itself or the root issue in the issue hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssue_Target()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EngineeredElement getTarget();

} // Issue
