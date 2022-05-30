/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.ProductOrganization;
import org.nasdanika.engineering.Release;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ProductOrganizationImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ProductOrganizationImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductOrganizationImpl extends OrganizationImpl implements ProductOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.PRODUCT_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Release> getReleases() {
		return (EList<Release>)eDynamicGet(EngineeringPackage.PRODUCT_ORGANIZATION__RELEASES, EngineeringPackage.Literals.PRODUCT_ORGANIZATION__RELEASES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getFeatures() {
		return (EList<Feature>)eDynamicGet(EngineeringPackage.PRODUCT_ORGANIZATION__FEATURES, EngineeringPackage.Literals.PRODUCT_ORGANIZATION__FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.PRODUCT_ORGANIZATION__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.PRODUCT_ORGANIZATION__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.PRODUCT_ORGANIZATION__RELEASES:
				return getReleases();
			case EngineeringPackage.PRODUCT_ORGANIZATION__FEATURES:
				return getFeatures();
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
			case EngineeringPackage.PRODUCT_ORGANIZATION__RELEASES:
				getReleases().clear();
				getReleases().addAll((Collection<? extends Release>)newValue);
				return;
			case EngineeringPackage.PRODUCT_ORGANIZATION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case EngineeringPackage.PRODUCT_ORGANIZATION__RELEASES:
				getReleases().clear();
				return;
			case EngineeringPackage.PRODUCT_ORGANIZATION__FEATURES:
				getFeatures().clear();
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
			case EngineeringPackage.PRODUCT_ORGANIZATION__RELEASES:
				return !getReleases().isEmpty();
			case EngineeringPackage.PRODUCT_ORGANIZATION__FEATURES:
				return !getFeatures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductOrganizationImpl
