/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Feature#getRelease <em>Release</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Feature#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getFeature()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/feature.md'"
 * @generated
 */
public interface Feature extends EngineeredCapability {
	/**
	 * Returns the value of the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' reference.
	 * @see #setRelease(Release)
	 * @see org.nasdanika.engineering.EngineeringPackage#getFeature_Release()
	 * @model
	 * @generated
	 */
	Release getRelease();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Feature#getRelease <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(Release value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities using this feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getFeature_Activities()
	 * @model derived="true"
	 * @generated
	 */
	EList<Activity> getActivities();

} // Feature
