/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.CapacityImpl#getEndeavor <em>Endeavor</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.CapacityImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.CapacityImpl#getFunds <em>Funds</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.CapacityImpl#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapacityImpl extends ModelElementImpl implements Capacity {
	/**
	 * The default value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFORT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getFunds() <em>Funds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunds()
	 * @generated
	 * @ordered
	 */
	protected static final double FUNDS_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final double RATE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.CAPACITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Endeavor getEndeavor() {
		return (Endeavor)eDynamicGet(EngineeringPackage.CAPACITY__ENDEAVOR, EngineeringPackage.Literals.CAPACITY__ENDEAVOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endeavor basicGetEndeavor() {
		return (Endeavor)eDynamicGet(EngineeringPackage.CAPACITY__ENDEAVOR, EngineeringPackage.Literals.CAPACITY__ENDEAVOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndeavor(Endeavor newEndeavor, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEndeavor, EngineeringPackage.CAPACITY__ENDEAVOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndeavor(Endeavor newEndeavor) {
		eDynamicSet(EngineeringPackage.CAPACITY__ENDEAVOR, EngineeringPackage.Literals.CAPACITY__ENDEAVOR, newEndeavor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEffort() {
		return (Double)eDynamicGet(EngineeringPackage.CAPACITY__EFFORT, EngineeringPackage.Literals.CAPACITY__EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffort(double newEffort) {
		eDynamicSet(EngineeringPackage.CAPACITY__EFFORT, EngineeringPackage.Literals.CAPACITY__EFFORT, newEffort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFunds() {
		return (Double)eDynamicGet(EngineeringPackage.CAPACITY__FUNDS, EngineeringPackage.Literals.CAPACITY__FUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunds(double newFunds) {
		eDynamicSet(EngineeringPackage.CAPACITY__FUNDS, EngineeringPackage.Literals.CAPACITY__FUNDS, newFunds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRate() {
		return (Double)eDynamicGet(EngineeringPackage.CAPACITY__RATE, EngineeringPackage.Literals.CAPACITY__RATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRate(double newRate) {
		eDynamicSet(EngineeringPackage.CAPACITY__RATE, EngineeringPackage.Literals.CAPACITY__RATE, newRate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.CAPACITY__ENDEAVOR:
				Endeavor endeavor = basicGetEndeavor();
				if (endeavor != null)
					msgs = ((InternalEObject)endeavor).eInverseRemove(this, EngineeringPackage.ENDEAVOR__CAPACITY, Endeavor.class, msgs);
				return basicSetEndeavor((Endeavor)otherEnd, msgs);
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
			case EngineeringPackage.CAPACITY__ENDEAVOR:
				return basicSetEndeavor(null, msgs);
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
			case EngineeringPackage.CAPACITY__ENDEAVOR:
				if (resolve) return getEndeavor();
				return basicGetEndeavor();
			case EngineeringPackage.CAPACITY__EFFORT:
				return getEffort();
			case EngineeringPackage.CAPACITY__FUNDS:
				return getFunds();
			case EngineeringPackage.CAPACITY__RATE:
				return getRate();
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
			case EngineeringPackage.CAPACITY__ENDEAVOR:
				setEndeavor((Endeavor)newValue);
				return;
			case EngineeringPackage.CAPACITY__EFFORT:
				setEffort((Double)newValue);
				return;
			case EngineeringPackage.CAPACITY__FUNDS:
				setFunds((Double)newValue);
				return;
			case EngineeringPackage.CAPACITY__RATE:
				setRate((Double)newValue);
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
			case EngineeringPackage.CAPACITY__ENDEAVOR:
				setEndeavor((Endeavor)null);
				return;
			case EngineeringPackage.CAPACITY__EFFORT:
				setEffort(EFFORT_EDEFAULT);
				return;
			case EngineeringPackage.CAPACITY__FUNDS:
				setFunds(FUNDS_EDEFAULT);
				return;
			case EngineeringPackage.CAPACITY__RATE:
				setRate(RATE_EDEFAULT);
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
			case EngineeringPackage.CAPACITY__ENDEAVOR:
				return basicGetEndeavor() != null;
			case EngineeringPackage.CAPACITY__EFFORT:
				return getEffort() != EFFORT_EDEFAULT;
			case EngineeringPackage.CAPACITY__FUNDS:
				return getFunds() != FUNDS_EDEFAULT;
			case EngineeringPackage.CAPACITY__RATE:
				return getRate() != RATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CapacityImpl
