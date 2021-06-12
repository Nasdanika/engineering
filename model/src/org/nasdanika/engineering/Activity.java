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
 *   <li>{@link org.nasdanika.engineering.Activity#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getDeliverables <em>Deliverables</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getCalls <em>Calls</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getActivity()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/activity.md'"
 * @generated
 */
public interface Activity extends EngineeredElement {
	/**
	 * Returns the value of the '<em><b>Personas</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Persona}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Persona#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas performing this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personas</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Personas()
	 * @see org.nasdanika.engineering.Persona#getActivities
	 * @model opposite="activities"
	 * @generated
	 */
	EList<Persona> getPersonas();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity outbound transitions to other activities.
	 * <!-- end-model-doc -->
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
	 * The list contents are of type {@link org.nasdanika.engineering.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input artifacts required to start working on this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Requirements()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Deliverables</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output artifacts of the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deliverables</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Deliverables()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getDeliverables();

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calls to other activities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Calls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Call> getCalls();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product features used by this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Features()
	 * @model
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Activity
