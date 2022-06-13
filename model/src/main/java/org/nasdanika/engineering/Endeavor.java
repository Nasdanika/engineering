/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endeavor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getAllIssues <em>All Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getLinkedObjectives <em>Linked Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getAllObjectives <em>All Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getAffects <em>Affects</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='capacity children'"
 *        annotation="urn:org.nasdanika documentation-reference='doc/endeavor.md'"
 * @generated
 */
public interface Endeavor extends ModelElement, Period, Alignable {
	/**
	 * Returns the value of the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number between 0 and 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Completion()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getCompletion();

	/**
	 * Returns the value of the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number representing benefit of this endeavor. Can be explicitly provided or derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit</em>' attribute.
	 * @see #setBenefit(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Benefit()
	 * @model
	 * @generated
	 */
	double getBenefit();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Endeavor#getBenefit <em>Benefit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit</em>' attribute.
	 * @see #getBenefit()
	 * @generated
	 */
	void setBenefit(double value);

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total cost of the endeavor includes both cost and labor multiplied by rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Cost</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_TotalCost()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getTotalCost();

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineer responsible for completion of this endeavor. For a simple issue it would be an engineer working on the issue, for other endeavors the assignee's may not actually work on issues, but rather coordinate. E.g. [increment](Increment.html) assignee responsibility would be similar to those of a [scrum master](https://en.wikipedia.org/wiki/Scrum_(software_development)#Scrum_master).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(Engineer)
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Assignee()
	 * @model
	 * @generated
	 */
	Engineer getAssignee();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Endeavor#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(Engineer value);

	/**
	 * Returns the value of the '<em><b>All Issues</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues scheduled to work on in this increment directly or indirectly via [releases](Release.html) and [features](Feature.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Issues</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_AllIssues()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<Issue> getAllIssues();

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Capacity}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Capacity#getEndeavor <em>Endeavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [Capacity](Capacity.html) or [Allocation](Allocation.html).  If an element is capacity that means that there is a capacity for an [engineer](Engineer.html) to work on this endeavor.  If an element is allocation that means that Engineer's capacity has been allocated to work on a particular [engineered element](EngineeredElement.html) [issues](Issue.html) in a particular [issue category](IssueCategory.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Capacity()
	 * @see org.nasdanika.engineering.Capacity#getEndeavor
	 * @model opposite="endeavor" changeable="false" derived="true"
	 * @generated
	 */
	EList<Capacity> getCapacity();

	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Objective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assignee's objectives for this endeavor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Objectives()
	 * @model containment="true" keys="path"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Objective> getObjectives();

	/**
	 * Returns the value of the '<em><b>Linked Objectives</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Objective}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Objective#getEndeavor <em>Endeavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objectives defined under [Engineer](Engineer.html) for this endeavor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linked Objectives</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_LinkedObjectives()
	 * @see org.nasdanika.engineering.Objective#getEndeavor
	 * @model opposite="endeavor" derived="true"
	 * @generated
	 */
	EList<Objective> getLinkedObjectives();

	/**
	 * Returns the value of the '<em><b>All Objectives</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Objective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All objectives for this endeavor - a union of objectives and linkedObjectives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Objectives</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_AllObjectives()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<Objective> getAllObjectives();

	/**
	 * Returns the value of the '<em><b>Affects</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.EngineeredElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineer manager(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affects</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Affects()
	 * @model
	 * @generated
	 */
	EList<EngineeredElement> getAffects();

} // Endeavor
