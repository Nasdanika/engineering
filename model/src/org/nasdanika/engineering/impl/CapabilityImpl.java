/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.CapabilityImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.CapabilityImpl#isAvailable <em>Available</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends NamedElementImpl implements Capability {
	/**
	 * The default value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABLE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getRequiredBy() {
		return getReferrers(EngineeringPackage.Literals.ISSUE__REQUIRES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAvailable() {
		return (Boolean)eDynamicGet(EngineeringPackage.CAPABILITY__AVAILABLE, EngineeringPackage.Literals.CAPABILITY__AVAILABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailable(boolean newAvailable) {
		eDynamicSet(EngineeringPackage.CAPABILITY__AVAILABLE, EngineeringPackage.Literals.CAPABILITY__AVAILABLE, newAvailable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.CAPABILITY__REQUIRED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredBy()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.CAPABILITY__REQUIRED_BY:
				return ((InternalEList<?>)getRequiredBy()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.CAPABILITY__REQUIRED_BY:
				return getRequiredBy();
			case EngineeringPackage.CAPABILITY__AVAILABLE:
				return isAvailable();
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
			case EngineeringPackage.CAPABILITY__AVAILABLE:
				setAvailable((Boolean)newValue);
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
			case EngineeringPackage.CAPABILITY__AVAILABLE:
				setAvailable(AVAILABLE_EDEFAULT);
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
			case EngineeringPackage.CAPABILITY__REQUIRED_BY:
				return !getRequiredBy().isEmpty();
			case EngineeringPackage.CAPABILITY__AVAILABLE:
				return isAvailable() != AVAILABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
