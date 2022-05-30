/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An organization has some properties of a product - features and releases. E.g. an IT department may be a product organization delivering value to its larger organization as features organized into releases. In this regard a feature is an organizational capability.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.ProductOrganization#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ProductOrganization#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getProductOrganization()
 * @model
 * @generated
 */
public interface ProductOrganization extends Organization {
	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Release}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product organization releases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getProductOrganization_Releases()
	 * @model containment="true" keys="path"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Release> getReleases();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product organization features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getProductOrganization_Features()
	 * @model containment="true" keys="path"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // ProductOrganization
