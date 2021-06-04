/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.ModelElementAppearance#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getModelElementAppearance()
 * @model
 * @generated
 */
public interface ModelElementAppearance extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.engineering.FeatureAppearance},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' map.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElementAppearance_Features()
	 * @model mapType="org.nasdanika.engineering.FeatureAppearanceEntry&lt;org.eclipse.emf.ecore.EString, org.nasdanika.engineering.FeatureAppearance&gt;"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EMap<String, FeatureAppearance> getFeatures();

} // ModelElementAppearance
