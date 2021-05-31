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
 *   <li>{@link org.nasdanika.engineering.Persona#getGoals <em>Goals</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Persona#getRepresentatives <em>Representatives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Persona#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Persona#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getPersona()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/persona.md' icon='far fa-user'"
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

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getPersona_Goals()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Representatives</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Engineer}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Engineer#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representatives</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getPersona_Representatives()
	 * @see org.nasdanika.engineering.Engineer#getRepresents
	 * @model opposite="represents"
	 * @generated
	 */
	EList<Engineer> getRepresentatives();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Persona}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Persona#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getPersona_Extends()
	 * @see org.nasdanika.engineering.Persona#getExtensions
	 * @model opposite="extensions"
	 * @generated
	 */
	EList<Persona> getExtends();

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Persona}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Persona#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getPersona_Extensions()
	 * @see org.nasdanika.engineering.Persona#getExtends
	 * @model opposite="extends" changeable="false" derived="true"
	 * @generated
	 */
	EList<Persona> getExtensions();
} // Persona
