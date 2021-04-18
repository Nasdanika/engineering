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
 *   <li>{@link org.nasdanika.engineering.Engineer#getIncrements <em>Increments</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getServices <em>Services</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getIssueCategories <em>Issue Categories</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getIssueStatuses <em>Issue Statuses</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika documentation-reference='../doc/engineer.md'"
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
	 * The list contents are of type {@link org.nasdanika.engineering.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Owns()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<org.nasdanika.engineering.Module> getOwns();

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
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Assignments()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<Issue> getAssignments();

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

} // Engineer
