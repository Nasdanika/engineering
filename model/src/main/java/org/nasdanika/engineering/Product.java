/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.journey.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Product#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Product#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Product#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getProduct()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/product.md' type-code='d'"
 * @generated
 */
public interface Product extends org.nasdanika.engineering.Module {
	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Release}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product releases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getProduct_Releases()
	 * @model containment="true"
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
	 * Product features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getProduct_Features()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.journey.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities/[journeys](Journey.html) which demonstrate how to use the product and its features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getProduct_Activities()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Activity> getActivities();

} // Product
