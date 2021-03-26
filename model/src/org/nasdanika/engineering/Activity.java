/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Activity#getPersona <em>Persona</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getDeliverables <em>Deliverables</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getActivity()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/activity.md'"
 * @generated
 */
public interface Activity extends EngineeredElement {
	/**
	 * Returns the value of the '<em><b>Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona</em>' reference.
	 * @see #setPersona(Persona)
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Persona()
	 * @model
	 * @generated
	 */
	Persona getPersona();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Activity#getPersona <em>Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persona</em>' reference.
	 * @see #getPersona()
	 * @generated
	 */
	void setPersona(Persona value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOutputs();

	/**
	 * Returns the value of the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pseudo-activity (stereo)type. One of:
	 * 
	 * * choice
	 * * fork
	 * * join
	 * * entryPoint
	 * * exitPoint
	 * * inputPin
	 * * outputPin
	 * * expansionInput
	 * * expansionOutput
	 * * end
	 * 
	 * Pseudo-activities name is not shown on the diagram, they are not clickable, and they are not listed as journey children.
	 * 
	 * See [PlantUML State Diagram](https://plantuml.com/state-diagram) for more details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Type</em>' attribute.
	 * @see #setActivityType(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_ActivityType()
	 * @model
	 * @generated
	 */
	String getActivityType();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Activity#getActivityType <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Type</em>' attribute.
	 * @see #getActivityType()
	 * @generated
	 */
	void setActivityType(String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Requirements()
	 * @model
	 * @generated
	 */
	EList<Artifact> getRequirements();

	/**
	 * Returns the value of the '<em><b>Deliverables</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverables</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Deliverables()
	 * @model
	 * @generated
	 */
	EList<Artifact> getDeliverables();

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Calls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Call> getCalls();

} // Activity