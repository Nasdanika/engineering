/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.Artifact;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TransitionImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TransitionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.TRANSITION;
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
	@Override
	public Activity getTarget() {
		return (Activity)eDynamicGet(EngineeringPackage.TRANSITION__TARGET, EngineeringPackage.Literals.TRANSITION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTarget() {
		return (Activity)eDynamicGet(EngineeringPackage.TRANSITION__TARGET, EngineeringPackage.Literals.TRANSITION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Activity newTarget) {
		eDynamicSet(EngineeringPackage.TRANSITION__TARGET, EngineeringPackage.Literals.TRANSITION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getPayload() {
		return (EList<Artifact>)eDynamicGet(EngineeringPackage.TRANSITION__PAYLOAD, EngineeringPackage.Literals.TRANSITION__PAYLOAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(EngineeringPackage.TRANSITION__NAME, EngineeringPackage.Literals.TRANSITION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(EngineeringPackage.TRANSITION__NAME, EngineeringPackage.Literals.TRANSITION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(EngineeringPackage.TRANSITION__DESCRIPTION, EngineeringPackage.Literals.TRANSITION__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(EngineeringPackage.TRANSITION__DESCRIPTION, EngineeringPackage.Literals.TRANSITION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case EngineeringPackage.TRANSITION__PAYLOAD:
				return getPayload();
			case EngineeringPackage.TRANSITION__NAME:
				return getName();
			case EngineeringPackage.TRANSITION__DESCRIPTION:
				return getDescription();
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
			case EngineeringPackage.TRANSITION__TARGET:
				setTarget((Activity)newValue);
				return;
			case EngineeringPackage.TRANSITION__PAYLOAD:
				getPayload().clear();
				getPayload().addAll((Collection<? extends Artifact>)newValue);
				return;
			case EngineeringPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case EngineeringPackage.TRANSITION__DESCRIPTION:
				setDescription((String)newValue);
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
			case EngineeringPackage.TRANSITION__TARGET:
				setTarget((Activity)null);
				return;
			case EngineeringPackage.TRANSITION__PAYLOAD:
				getPayload().clear();
				return;
			case EngineeringPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EngineeringPackage.TRANSITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case EngineeringPackage.TRANSITION__TARGET:
				return basicGetTarget() != null;
			case EngineeringPackage.TRANSITION__PAYLOAD:
				return !getPayload().isEmpty();
			case EngineeringPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EngineeringPackage.TRANSITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
