/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.engineering.Appearance;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.MemberAppearance;
import org.nasdanika.engineering.ModelElementAppearance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element Appearance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementAppearanceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementAppearanceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementAppearanceImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelElementAppearanceImpl extends AppearanceImpl implements ModelElementAppearance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementAppearanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.MODEL_ELEMENT_APPEARANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, MemberAppearance> getFeatures() {
		return (EMap<String, MemberAppearance>)eDynamicGet(EngineeringPackage.MODEL_ELEMENT_APPEARANCE__FEATURES, EngineeringPackage.Literals.MODEL_ELEMENT_APPEARANCE__FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, MemberAppearance> getOperations() {
		return (EMap<String, MemberAppearance>)eDynamicGet(EngineeringPackage.MODEL_ELEMENT_APPEARANCE__OPERATIONS, EngineeringPackage.Literals.MODEL_ELEMENT_APPEARANCE__OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, Appearance> getActions() {
		return (EMap<String, Appearance>)eDynamicGet(EngineeringPackage.MODEL_ELEMENT_APPEARANCE__ACTIONS, EngineeringPackage.Literals.MODEL_ELEMENT_APPEARANCE__ACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__FEATURES:
				if (coreType) return getFeatures();
				else return getFeatures().map();
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__OPERATIONS:
				if (coreType) return getOperations();
				else return getOperations().map();
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__ACTIONS:
				if (coreType) return getActions();
				else return getActions().map();
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
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__FEATURES:
				((EStructuralFeature.Setting)getFeatures()).set(newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__OPERATIONS:
				((EStructuralFeature.Setting)getOperations()).set(newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__ACTIONS:
				((EStructuralFeature.Setting)getActions()).set(newValue);
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
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__FEATURES:
				getFeatures().clear();
				return;
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__OPERATIONS:
				getOperations().clear();
				return;
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__ACTIONS:
				getActions().clear();
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
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__FEATURES:
				return !getFeatures().isEmpty();
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__OPERATIONS:
				return !getOperations().isEmpty();
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE__ACTIONS:
				return !getActions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementAppearanceImpl
