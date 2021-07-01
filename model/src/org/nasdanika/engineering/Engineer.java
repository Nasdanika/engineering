/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.flow.Activity;

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
 *   <li>{@link org.nasdanika.engineering.Engineer#getIssuePriorities <em>Issue Priorities</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getIssueSeverities <em>Issue Severities</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getRate <em>Rate</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getDesignations <em>Designations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Engineer#getObjectives <em>Objectives</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/engineer.md' icon='fas fa-user'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='capacity'"
 * @generated
 */
public interface Engineer extends Persona {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modules ([products](Product.html)) are defined under engineer or [organization](Organization.html).
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Engineered elements owned by this engineer.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Engineered element which this engineer has experience with.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Increments are defined under engineer/[organization](Organization.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Increments</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Increments()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Increment> getIncrements();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.flow.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineer may perform shared activities (services) which can be parts of [persona](Persona.html) [journeys](Journey.html).
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Personas which this engineer/[organization](Organization.html) builds products for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personas</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Personas()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Persona> getPersonas();

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Endeavor}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Endeavor#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineer assignments.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Issue categories are defined under engineer/[organization](Organization.html).
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Issue statuses are defined under engineer/[organization](Organization.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Statuses</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_IssueStatuses()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<IssueStatus> getIssueStatuses();

	/**
	 * Returns the value of the '<em><b>Issue Priorities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.IssuePriority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue priorities are defined under engineer/[organization](Organization.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Priorities</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_IssuePriorities()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<IssuePriority> getIssuePriorities();

	/**
	 * Returns the value of the '<em><b>Issue Severities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.IssueSeverity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue severities are defined under engineer/[organization](Organization.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Severities</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_IssueSeverities()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<IssueSeverity> getIssueSeverities();

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default engineer rate. Can be customized in capacity.
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Persona}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Persona#getRepresentatives <em>Representatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas which this engineer represents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represents</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Represents()
	 * @see org.nasdanika.engineering.Persona#getRepresentatives
	 * @model opposite="representatives" changeable="false" derived="true"
	 * @generated
	 */
	EList<Persona> getRepresents();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Message}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Message#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Discussion messages authored by this engineer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Messages</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Messages()
	 * @see org.nasdanika.engineering.Message#getAuthor
	 * @model opposite="author" changeable="false" derived="true"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Objective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineer's objectives for a particular [endeavor](Endeavor.html)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineer_Objectives()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Objective> getObjectives();

} // Engineer
