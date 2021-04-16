/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Release;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.FeatureImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.FeatureImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends EngineeredCapabilityImpl implements Feature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Release getRelease() {
		return (Release)eDynamicGet(EngineeringPackage.FEATURE__RELEASE, EngineeringPackage.Literals.FEATURE__RELEASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release basicGetRelease() {
		return (Release)eDynamicGet(EngineeringPackage.FEATURE__RELEASE, EngineeringPackage.Literals.FEATURE__RELEASE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelease(Release newRelease) {
		eDynamicSet(EngineeringPackage.FEATURE__RELEASE, EngineeringPackage.Literals.FEATURE__RELEASE, newRelease);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(EngineeringPackage.FEATURE__ACTIVITIES, EngineeringPackage.Literals.FEATURE__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.FEATURE__RELEASE:
				if (resolve) return getRelease();
				return basicGetRelease();
			case EngineeringPackage.FEATURE__ACTIVITIES:
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
			case EngineeringPackage.FEATURE__RELEASE:
				setRelease((Release)newValue);
				return;
			case EngineeringPackage.FEATURE__ACTIVITIES:
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
			case EngineeringPackage.FEATURE__RELEASE:
				setRelease((Release)null);
				return;
			case EngineeringPackage.FEATURE__ACTIVITIES:
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
			case EngineeringPackage.FEATURE__RELEASE:
				return basicGetRelease() != null;
			case EngineeringPackage.FEATURE__ACTIVITIES:
				return !getActivities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
