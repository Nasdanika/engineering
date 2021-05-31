/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.AlignmentImpl#getAim <em>Aim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlignmentImpl extends ModelElementImpl implements Alignment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ALIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aim getAim() {
		return (Aim)eDynamicGet(EngineeringPackage.ALIGNMENT__AIM, EngineeringPackage.Literals.ALIGNMENT__AIM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aim basicGetAim() {
		return (Aim)eDynamicGet(EngineeringPackage.ALIGNMENT__AIM, EngineeringPackage.Literals.ALIGNMENT__AIM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAim(Aim newAim, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAim, EngineeringPackage.ALIGNMENT__AIM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAim(Aim newAim) {
		eDynamicSet(EngineeringPackage.ALIGNMENT__AIM, EngineeringPackage.Literals.ALIGNMENT__AIM, newAim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ALIGNMENT__AIM:
				Aim aim = basicGetAim();
				if (aim != null)
					msgs = ((InternalEObject)aim).eInverseRemove(this, EngineeringPackage.AIM__ALIGNMENTS, Aim.class, msgs);
				return basicSetAim((Aim)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ALIGNMENT__AIM:
				return basicSetAim(null, msgs);
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
			case EngineeringPackage.ALIGNMENT__AIM:
				if (resolve) return getAim();
				return basicGetAim();
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
			case EngineeringPackage.ALIGNMENT__AIM:
				setAim((Aim)newValue);
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
			case EngineeringPackage.ALIGNMENT__AIM:
				setAim((Aim)null);
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
			case EngineeringPackage.ALIGNMENT__AIM:
				return basicGetAim() != null;
		}
		return super.eIsSet(featureID);
	}

} //AlignmentImpl
