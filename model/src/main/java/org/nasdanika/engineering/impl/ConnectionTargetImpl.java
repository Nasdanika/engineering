/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.engineering.Connection;
import org.nasdanika.engineering.ConnectionTarget;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ConnectionTargetImpl#getInboundConnections <em>Inbound Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionTargetImpl extends MinimalEObjectImpl.Container implements ConnectionTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.CONNECTION_TARGET;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Connection> getInboundConnections() {
		return (EList<Connection>)eDynamicGet(EngineeringPackage.CONNECTION_TARGET__INBOUND_CONNECTIONS, EngineeringPackage.Literals.CONNECTION_TARGET__INBOUND_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.CONNECTION_TARGET__INBOUND_CONNECTIONS:
				return getInboundConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EngineeringPackage.CONNECTION_TARGET__INBOUND_CONNECTIONS:
				return !getInboundConnections().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionTargetImpl
