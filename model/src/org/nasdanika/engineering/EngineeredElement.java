/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

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
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika documentation-reference='../doc/engineered-element.md'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='capacity'"
 * @generated
 */
public interface EngineeredElement extends Forum {
	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Issues()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Owners</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Engineer}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Engineer#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owners</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Owners()
	 * @see org.nasdanika.engineering.Engineer#getOwns
	 * @model opposite="owns"
	 * @generated
	 */
	EList<Engineer> getOwners();

	/**
	 * Returns the value of the '<em><b>Experts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Engineer}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Engineer#getExpertise <em>Expertise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experts</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Experts()
	 * @see org.nasdanika.engineering.Engineer#getExpertise
	 * @model opposite="expertise"
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
	 * @return the value of the '<em>Principles</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Principles()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Principle> getPrinciples();

} // EngineeredElement
