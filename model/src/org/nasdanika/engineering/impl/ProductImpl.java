/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.Release;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ProductImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ProductImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ProductImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends ModuleImpl implements Product {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Release> getReleases() {
		return (EList<Release>)eDynamicGet(EngineeringPackage.PRODUCT__RELEASES, EngineeringPackage.Literals.PRODUCT__RELEASES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getFeatures() {
		return (EList<Feature>)eDynamicGet(EngineeringPackage.PRODUCT__FEATURES, EngineeringPackage.Literals.PRODUCT__FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(EngineeringPackage.PRODUCT__ACTIVITIES, EngineeringPackage.Literals.PRODUCT__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.PRODUCT__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.PRODUCT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.PRODUCT__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.PRODUCT__RELEASES:
				return getReleases();
			case EngineeringPackage.PRODUCT__FEATURES:
				return getFeatures();
			case EngineeringPackage.PRODUCT__ACTIVITIES:
				return getActivities();
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
			case EngineeringPackage.PRODUCT__RELEASES:
				getReleases().clear();
				getReleases().addAll((Collection<? extends Release>)newValue);
				return;
			case EngineeringPackage.PRODUCT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case EngineeringPackage.PRODUCT__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
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
			case EngineeringPackage.PRODUCT__RELEASES:
				getReleases().clear();
				return;
			case EngineeringPackage.PRODUCT__FEATURES:
				getFeatures().clear();
				return;
			case EngineeringPackage.PRODUCT__ACTIVITIES:
				getActivities().clear();
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
			case EngineeringPackage.PRODUCT__RELEASES:
				return !getReleases().isEmpty();
			case EngineeringPackage.PRODUCT__FEATURES:
				return !getFeatures().isEmpty();
			case EngineeringPackage.PRODUCT__ACTIVITIES:
				return !getActivities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl
