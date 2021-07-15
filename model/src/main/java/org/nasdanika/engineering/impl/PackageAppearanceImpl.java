/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.engineering.PackageAppearance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appearance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.PackageAppearanceImpl#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.PackageAppearanceImpl#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageAppearanceImpl extends MinimalEObjectImpl.Container implements PackageAppearance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageAppearanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.PACKAGE_APPEARANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, ModelElementAppearance> getModelElements() {
		return (EMap<String, ModelElementAppearance>)eDynamicGet(EngineeringPackage.PACKAGE_APPEARANCE__MODEL_ELEMENTS, EngineeringPackage.Literals.PACKAGE_APPEARANCE__MODEL_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, PackageAppearance> getSubPackages() {
		return (EMap<String, PackageAppearance>)eDynamicGet(EngineeringPackage.PACKAGE_APPEARANCE__SUB_PACKAGES, EngineeringPackage.Literals.PACKAGE_APPEARANCE__SUB_PACKAGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.PACKAGE_APPEARANCE__MODEL_ELEMENTS:
				return ((InternalEList<?>)getModelElements()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.PACKAGE_APPEARANCE__SUB_PACKAGES:
				return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.PACKAGE_APPEARANCE__MODEL_ELEMENTS:
				if (coreType) return getModelElements();
				else return getModelElements().map();
			case EngineeringPackage.PACKAGE_APPEARANCE__SUB_PACKAGES:
				if (coreType) return getSubPackages();
				else return getSubPackages().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EngineeringPackage.PACKAGE_APPEARANCE__MODEL_ELEMENTS:
				((EStructuralFeature.Setting)getModelElements()).set(newValue);
				return;
			case EngineeringPackage.PACKAGE_APPEARANCE__SUB_PACKAGES:
				((EStructuralFeature.Setting)getSubPackages()).set(newValue);
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
			case EngineeringPackage.PACKAGE_APPEARANCE__MODEL_ELEMENTS:
				getModelElements().clear();
				return;
			case EngineeringPackage.PACKAGE_APPEARANCE__SUB_PACKAGES:
				getSubPackages().clear();
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
			case EngineeringPackage.PACKAGE_APPEARANCE__MODEL_ELEMENTS:
				return !getModelElements().isEmpty();
			case EngineeringPackage.PACKAGE_APPEARANCE__SUB_PACKAGES:
				return !getSubPackages().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageAppearanceImpl
