/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.FeatureAppearance#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getFeatureAppearance()
 * @model
 * @generated
 */
public interface FeatureAppearance extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getFeatureAppearance_Roles()
	 * @model
	 * @generated
	 */
	EList<String> getRoles();

} // FeatureAppearance
