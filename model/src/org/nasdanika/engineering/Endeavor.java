/**
 */
package org.nasdanika.engineering;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link org.nasdanika.engineering.Endeavor#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='start_end capacity'"
 * @generated
 */
public interface Endeavor extends EObject {
	/**
	 * Returns the value of the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Completion()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	double getCompletion();

	/**
	 * Returns the value of the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @return the value of the '<em>Total Cost</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_TotalCost()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	double getTotalCost();

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Engineer#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(Engineer)
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Assignee()
	 * @see org.nasdanika.engineering.Engineer#getAssignments
	 * @model opposite="assignments"
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
	 * Issues scheduled to work on in this increment directly or indirectly via releases and features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Issues</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_AllIssues()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<Issue> getAllIssues();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Endeavor#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Endeavor#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

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

} // Endeavor
