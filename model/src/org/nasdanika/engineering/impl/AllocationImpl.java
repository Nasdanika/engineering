/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.AllocationImpl#getEngineer <em>Engineer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationImpl extends CapacityImpl implements Allocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Engineer getEngineer() {
		return (Engineer)eDynamicGet(EngineeringPackage.ALLOCATION__ENGINEER, EngineeringPackage.Literals.ALLOCATION__ENGINEER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetEngineer() {
		return (Engineer)eDynamicGet(EngineeringPackage.ALLOCATION__ENGINEER, EngineeringPackage.Literals.ALLOCATION__ENGINEER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineer(Engineer newEngineer, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEngineer, EngineeringPackage.ALLOCATION__ENGINEER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineer(Engineer newEngineer) {
		eDynamicSet(EngineeringPackage.ALLOCATION__ENGINEER, EngineeringPackage.Literals.ALLOCATION__ENGINEER, newEngineer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ALLOCATION__ENGINEER:
				Engineer engineer = basicGetEngineer();
				if (engineer != null)
					msgs = ((InternalEObject)engineer).eInverseRemove(this, EngineeringPackage.ENGINEER__DESIGNATIONS, Engineer.class, msgs);
				return basicSetEngineer((Engineer)otherEnd, msgs);
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
			case EngineeringPackage.ALLOCATION__ENGINEER:
				return basicSetEngineer(null, msgs);
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
			case EngineeringPackage.ALLOCATION__ENGINEER:
				if (resolve) return getEngineer();
				return basicGetEngineer();
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
			case EngineeringPackage.ALLOCATION__ENGINEER:
				setEngineer((Engineer)newValue);
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
			case EngineeringPackage.ALLOCATION__ENGINEER:
				setEngineer((Engineer)null);
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
			case EngineeringPackage.ALLOCATION__ENGINEER:
				return basicGetEngineer() != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationImpl
