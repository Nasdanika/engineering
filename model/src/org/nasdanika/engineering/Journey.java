/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Journey#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Journey#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Journey#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Journey#getRoot <em>Root</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Journey#getAllElements <em>All Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getJourney()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/journey.md'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='final abstract'"
 * @generated
 */
public interface Journey extends Activity {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.JourneyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements of this journey.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourney_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<JourneyElement> getElements();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Journey#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Journey can  extend another journey and inherit its elements. Inherited elements can be overriden or suppressed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Journey)
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourney_Extends()
	 * @see org.nasdanika.engineering.Journey#getExtensions
	 * @model opposite="extensions"
	 * @generated
	 */
	Journey getExtends();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Journey#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Journey value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Journey}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Journey#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Journeys extending this journey.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extensions</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourney_Extensions()
	 * @see org.nasdanika.engineering.Journey#getExtends
	 * @model opposite="extends" changeable="false" derived="true"
	 * @generated
	 */
	EList<Journey> getExtensions();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root of this journey inheritance hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourney_Root()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	Journey getRoot();

	/**
	 * Returns the value of the '<em><b>All Elements</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.JourneyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Own and inherited elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Elements</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourney_AllElements()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<JourneyElement> getAllElements();

} // Journey
