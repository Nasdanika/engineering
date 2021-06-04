/**
 */
package org.nasdanika.engineering;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.FeatureAppearance#isCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getFeatureAppearance()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/feature-appearance.md'"
 * @generated
 */
public interface FeatureAppearance extends Appearance {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false feature element actions are not categorized, i.e. in the navigation tree they would appear as container children without an intermediary feature category node. It can be useful if the containing element has navigation children only of one type or they can be distinguished by an icon and as such a feature category is not necessary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(boolean)
	 * @see org.nasdanika.engineering.EngineeringPackage#getFeatureAppearance_Category()
	 * @model
	 * @generated
	 */
	boolean isCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.FeatureAppearance#isCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #isCategory()
	 * @generated
	 */
	void setCategory(boolean value);

} // FeatureAppearance
