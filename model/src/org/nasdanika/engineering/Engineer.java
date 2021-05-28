/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Engineer#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getOwns <em>Owns</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getExpertise <em>Expertise</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getIncrements <em>Increments</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getServices <em>Services</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getIssueCategories <em>Issue Categories</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getIssueStatuses <em>Issue Statuses</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getRate <em>Rate</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getDesignations <em>Designations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/engineer.md' icon='fas fa-user'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='capacity'"
 * @generated
 */
public interface Engineer extends Persona {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.engineering.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.EngineeredElement}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.EngineeredElement#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Owns()
	 * @see org.nasdanika.engineering.EngineeredElement#getOwners
	 * @model opposite="owners" changeable="false" derived="true"
	 * @generated
	 */
	EList<EngineeredElement> getOwns();

	/**
	 * Returns the value of the '<em><b>Expertise</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.EngineeredElement}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.EngineeredElement#getExperts <em>Experts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expertise</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Expertise()
	 * @see org.nasdanika.engineering.EngineeredElement#getExperts
	 * @model opposite="experts" changeable="false" derived="true"
	 * @generated
	 */
	EList<EngineeredElement> getExpertise();

	/**
	 * Returns the value of the '<em><b>Increments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Increment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increments</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Increments()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Increment> getIncrements();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getServices();

	/**
	 * Returns the value of the '<em><b>Personas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personas</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Personas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Persona> getPersonas();

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Endeavor}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Endeavor#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Assignments()
	 * @see org.nasdanika.engineering.Endeavor#getAssignee
	 * @model opposite="assignee" changeable="false" derived="true"
	 * @generated
	 */
	EList<Endeavor> getAssignments();

	/**
	 * Returns the value of the '<em><b>Issue Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.IssueCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Categories</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_IssueCategories()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<IssueCategory> getIssueCategories();

	/**
	 * Returns the value of the '<em><b>Issue Statuses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.IssueStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Statuses</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_IssueStatuses()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<IssueStatus> getIssueStatuses();

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Rate()
	 * @model default="1"
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Engineer#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

	/**
	 * Returns the value of the '<em><b>Designations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Allocation}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Allocation#getEngineer <em>Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allocations of this [engineer](Engineer.html)'s [capacity](Capacity.html) to work on an [engineered element](EngineeredElement.hml) [issues](Issue.html) for a particular [endeavor](Endeavor.html) and [issue category](IssueCategory.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designations</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Designations()
	 * @see org.nasdanika.engineering.Allocation#getEngineer
	 * @model opposite="engineer" changeable="false" derived="true"
	 * @generated
	 */
	EList<Allocation> getDesignations();

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Capacity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineer's capacity for a particular [endeavor](Endeavor.html)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Capacity()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Capacity> getCapacity();

} // Engineer
