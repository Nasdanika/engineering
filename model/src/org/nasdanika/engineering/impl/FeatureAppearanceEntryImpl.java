/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.FeatureAppearance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Appearance Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.FeatureAppearanceEntryImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.FeatureAppearanceEntryImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureAppearanceEntryImpl extends MinimalEObjectImpl.Container implements BasicEMap.Entry<String,FeatureAppearance> {
	/**
	 * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureAppearanceEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.FEATURE_APPEARANCE_ENTRY;
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
	public String getTypedKey() {
		return (String)eDynamicGet(EngineeringPackage.FEATURE_APPEARANCE_ENTRY__KEY, EngineeringPackage.Literals.FEATURE_APPEARANCE_ENTRY__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedKey(String newKey) {
		eDynamicSet(EngineeringPackage.FEATURE_APPEARANCE_ENTRY__KEY, EngineeringPackage.Literals.FEATURE_APPEARANCE_ENTRY__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureAppearance getTypedValue() {
		return (FeatureAppearance)eDynamicGet(EngineeringPackage.FEATURE_APPEARANCE_ENTRY__VALUE, EngineeringPackage.Literals.FEATURE_APPEARANCE_ENTRY__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedValue(FeatureAppearance newValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newValue, EngineeringPackage.FEATURE_APPEARANCE_ENTRY__VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedValue(FeatureAppearance newValue) {
		eDynamicSet(EngineeringPackage.FEATURE_APPEARANCE_ENTRY__VALUE, EngineeringPackage.Literals.FEATURE_APPEARANCE_ENTRY__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY__VALUE:
				return basicSetTypedValue(null, msgs);
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
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY__KEY:
				return getTypedKey();
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY__VALUE:
				return getTypedValue();
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
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY__KEY:
				setTypedKey((String)newValue);
				return;
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY__VALUE:
				setTypedValue((FeatureAppearance)newValue);
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
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY__KEY:
				setTypedKey(KEY_EDEFAULT);
				return;
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY__VALUE:
				setTypedValue((FeatureAppearance)null);
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
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY__KEY:
				return KEY_EDEFAULT == null ? getTypedKey() != null : !KEY_EDEFAULT.equals(getTypedKey());
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY__VALUE:
				return getTypedValue() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureAppearance getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureAppearance setValue(FeatureAppearance value) {
		FeatureAppearance oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, FeatureAppearance> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<String, FeatureAppearance>)container.eGet(eContainmentFeature());
	}

} //FeatureAppearanceEntryImpl
