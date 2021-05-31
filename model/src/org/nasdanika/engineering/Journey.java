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
 *   <li>{@link org.nasdanika.engineering.Journey#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Journey#isPartition <em>Partition</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getJourney()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/journey.md'"
 * @generated
 */
public interface Journey extends Activity {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Journey activities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourney_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, journey is visualized as a composite state on its parent journey diagram. If false, it is visualized as a simple state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partition</em>' attribute.
	 * @see #setPartition(boolean)
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourney_Partition()
	 * @model
	 * @generated
	 */
	boolean isPartition();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Journey#isPartition <em>Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition</em>' attribute.
	 * @see #isPartition()
	 * @generated
	 */
	void setPartition(boolean value);

} // Journey
