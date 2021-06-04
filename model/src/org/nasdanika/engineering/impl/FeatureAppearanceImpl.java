/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.FeatureAppearance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Appearance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.FeatureAppearanceImpl#isCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureAppearanceImpl extends AppearanceImpl implements FeatureAppearance {
	/**
	 * The default value of the '{@link #isCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCategory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CATEGORY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureAppearanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.FEATURE_APPEARANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCategory() {
		return (Boolean)eDynamicGet(EngineeringPackage.FEATURE_APPEARANCE__CATEGORY, EngineeringPackage.Literals.FEATURE_APPEARANCE__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(boolean newCategory) {
		eDynamicSet(EngineeringPackage.FEATURE_APPEARANCE__CATEGORY, EngineeringPackage.Literals.FEATURE_APPEARANCE__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.FEATURE_APPEARANCE__CATEGORY:
				return isCategory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EngineeringPackage.FEATURE_APPEARANCE__CATEGORY:
				setCategory((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EngineeringPackage.FEATURE_APPEARANCE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EngineeringPackage.FEATURE_APPEARANCE__CATEGORY:
				return isCategory() != CATEGORY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //FeatureAppearanceImpl
