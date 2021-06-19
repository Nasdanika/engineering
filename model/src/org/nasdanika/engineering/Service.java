/**
 */
package org.nasdanika.engineering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Service#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getService()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/service.md'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='abstract'"
 * @generated
 */
public interface Service extends JourneyElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Activity#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target activity of the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Activity)
	 * @see org.nasdanika.engineering.EngineeringPackage#getService_Target()
	 * @see org.nasdanika.engineering.Activity#getServices
	 * @model opposite="services" required="true"
	 * @generated
	 */
	Activity getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Service#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Activity value);

} // Service
