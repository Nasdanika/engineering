/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.AllocationImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.AllocationImpl#getEngineer <em>Engineer</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.AllocationImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.AllocationImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.AllocationImpl#getFunds <em>Funds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationImpl extends ModelElementImpl implements Allocation {
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
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final double RATE_EDEFAULT = 0.0;

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
	public Increment getIncrement() {
		return (Increment)eDynamicGet(EngineeringPackage.ALLOCATION__INCREMENT, EngineeringPackage.Literals.ALLOCATION__INCREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment basicGetIncrement() {
		return (Increment)eDynamicGet(EngineeringPackage.ALLOCATION__INCREMENT, EngineeringPackage.Literals.ALLOCATION__INCREMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrement(Increment newIncrement) {
		eDynamicSet(EngineeringPackage.ALLOCATION__INCREMENT, EngineeringPackage.Literals.ALLOCATION__INCREMENT, newIncrement);
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
	public double getEffort() {
		return (Double)eDynamicGet(EngineeringPackage.ALLOCATION__EFFORT, EngineeringPackage.Literals.ALLOCATION__EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffort(double newEffort) {
		eDynamicSet(EngineeringPackage.ALLOCATION__EFFORT, EngineeringPackage.Literals.ALLOCATION__EFFORT, newEffort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRate() {
		return (Double)eDynamicGet(EngineeringPackage.ALLOCATION__RATE, EngineeringPackage.Literals.ALLOCATION__RATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRate(double newRate) {
		eDynamicSet(EngineeringPackage.ALLOCATION__RATE, EngineeringPackage.Literals.ALLOCATION__RATE, newRate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFunds() {
		return (Double)eDynamicGet(EngineeringPackage.ALLOCATION__FUNDS, EngineeringPackage.Literals.ALLOCATION__FUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunds(double newFunds) {
		eDynamicSet(EngineeringPackage.ALLOCATION__FUNDS, EngineeringPackage.Literals.ALLOCATION__FUNDS, newFunds);
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
			case EngineeringPackage.ALLOCATION__INCREMENT:
				if (resolve) return getIncrement();
				return basicGetIncrement();
			case EngineeringPackage.ALLOCATION__ENGINEER:
				if (resolve) return getEngineer();
				return basicGetEngineer();
			case EngineeringPackage.ALLOCATION__EFFORT:
				return getEffort();
			case EngineeringPackage.ALLOCATION__RATE:
				return getRate();
			case EngineeringPackage.ALLOCATION__FUNDS:
				return getFunds();
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
			case EngineeringPackage.ALLOCATION__INCREMENT:
				setIncrement((Increment)newValue);
				return;
			case EngineeringPackage.ALLOCATION__ENGINEER:
				setEngineer((Engineer)newValue);
				return;
			case EngineeringPackage.ALLOCATION__EFFORT:
				setEffort((Double)newValue);
				return;
			case EngineeringPackage.ALLOCATION__RATE:
				setRate((Double)newValue);
				return;
			case EngineeringPackage.ALLOCATION__FUNDS:
				setFunds((Double)newValue);
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
			case EngineeringPackage.ALLOCATION__INCREMENT:
				setIncrement((Increment)null);
				return;
			case EngineeringPackage.ALLOCATION__ENGINEER:
				setEngineer((Engineer)null);
				return;
			case EngineeringPackage.ALLOCATION__EFFORT:
				setEffort(EFFORT_EDEFAULT);
				return;
			case EngineeringPackage.ALLOCATION__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case EngineeringPackage.ALLOCATION__FUNDS:
				setFunds(FUNDS_EDEFAULT);
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
			case EngineeringPackage.ALLOCATION__INCREMENT:
				return basicGetIncrement() != null;
			case EngineeringPackage.ALLOCATION__ENGINEER:
				return basicGetEngineer() != null;
			case EngineeringPackage.ALLOCATION__EFFORT:
				return getEffort() != EFFORT_EDEFAULT;
			case EngineeringPackage.ALLOCATION__RATE:
				return getRate() != RATE_EDEFAULT;
			case EngineeringPackage.ALLOCATION__FUNDS:
				return getFunds() != FUNDS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //AllocationImpl
