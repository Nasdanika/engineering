/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Persona#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getPersona()
 * @model
 * @generated
 */
public interface Persona extends EngineeredElement {

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Activity}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Activity#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getPersona_Activities()
	 * @see org.nasdanika.engineering.Activity#getPersonas
	 * @model opposite="personas" changeable="false" derived="true"
	 * @generated
	 */
	EList<Activity> getActivities();
} // Persona
