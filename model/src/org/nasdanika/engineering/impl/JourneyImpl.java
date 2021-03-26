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
import org.nasdanika.engineering.Journey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.JourneyImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.JourneyImpl#isPartition <em>Partition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyImpl extends ActivityImpl implements Journey {
	/**
	 * The default value of the '{@link #isPartition() <em>Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARTITION_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.JOURNEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(EngineeringPackage.JOURNEY__ACTIVITIES, EngineeringPackage.Literals.JOURNEY__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPartition() {
		return (Boolean)eDynamicGet(EngineeringPackage.JOURNEY__PARTITION, EngineeringPackage.Literals.JOURNEY__PARTITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartition(boolean newPartition) {
		eDynamicSet(EngineeringPackage.JOURNEY__PARTITION, EngineeringPackage.Literals.JOURNEY__PARTITION, newPartition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.JOURNEY__ACTIVITIES:
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
			case EngineeringPackage.JOURNEY__ACTIVITIES:
				return getActivities();
			case EngineeringPackage.JOURNEY__PARTITION:
				return isPartition();
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
			case EngineeringPackage.JOURNEY__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case EngineeringPackage.JOURNEY__PARTITION:
				setPartition((Boolean)newValue);
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
			case EngineeringPackage.JOURNEY__ACTIVITIES:
				getActivities().clear();
				return;
			case EngineeringPackage.JOURNEY__PARTITION:
				setPartition(PARTITION_EDEFAULT);
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
			case EngineeringPackage.JOURNEY__ACTIVITIES:
				return !getActivities().isEmpty();
			case EngineeringPackage.JOURNEY__PARTITION:
				return isPartition() != PARTITION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //JourneyImpl
