/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineered Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.EngineeredElement#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElement#getOwners <em>Owners</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElement#getExperts <em>Experts</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElement#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElement#getPrinciples <em>Principles</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElement#getAllIssues <em>All Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElement#getAffectedBy <em>Affected By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/engineered-element.md'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='capacity'"
 * @generated
 */
public interface EngineeredElement extends Forum, Period, ConnectionSource, ConnectionTarget {
	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues (work items) for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Issues()
	 * @model containment="true" keys="path"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Owners</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Engineer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element owners have both expertise and authority over the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owners</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Owners()
	 * @model
	 * @generated
	 */
	EList<Engineer> getOwners();

	/**
	 * Returns the value of the '<em><b>Experts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Engineer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Experts have expertise with the element, but no authority. E.g. they can help others with using the element, but cannot make changes in the element without owners' approval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experts</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Experts()
	 * @model
	 * @generated
	 */
	EList<Engineer> getExperts();

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Allocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allocations of [engineer](Engineer.html)'s [capacity](Capacity.html) to work on this engineered element [issues](Issue.html) for a particular [endeavor](Endeavor.html) and [issue category](IssueCategory.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocations</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Allocations()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Allocation> getAllocations();

	/**
	 * Returns the value of the '<em><b>Principles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Principle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Principles associated with this element to support decision making.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principles</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Principles()
	 * @model containment="true" keys="path"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Principle> getPrinciples();

	/**
	 * Returns the value of the '<em><b>All Issues</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues (work items) for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Issues</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_AllIssues()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<Issue> getAllIssues();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(EngineeredElementStatus)
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Status()
	 * @model
	 * @generated
	 */
	EngineeredElementStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.EngineeredElement#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EngineeredElementStatus value);

	/**
	 * Returns the value of the '<em><b>Affected By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Endeavor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineers managed by this engineer. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affected By</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_AffectedBy()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="urn:org.nasdanika opposite='affects'"
	 * @generated
	 */
	EList<Endeavor> getAffectedBy();

} // EngineeredElement
