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
 *   <li>{@link org.nasdanika.engineering.Activity#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Activity#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getActivity()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/activity.md'"
 * @generated
 */
public interface Activity extends JourneyElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Feature}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Feature#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product features used by this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Features()
	 * @see org.nasdanika.engineering.Feature#getUses
	 * @model opposite="uses"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Service}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Service#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived opposite to Service target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getActivity_Services()
	 * @see org.nasdanika.engineering.Service#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	EList<Service> getServices();

} // Activity
