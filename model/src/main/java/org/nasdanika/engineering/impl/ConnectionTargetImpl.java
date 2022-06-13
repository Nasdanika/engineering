/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.engineering.Connection;
import org.nasdanika.engineering.ConnectionTarget;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ConnectionTargetImpl#getInboundConnections <em>Inbound Connections</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ConnectionTargetImpl#getExports <em>Exports</em>}</li>
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Operation> getExports() {
		return (EList<Operation>)eDynamicGet(EngineeringPackage.CONNECTION_TARGET__EXPORTS, EngineeringPackage.Literals.CONNECTION_TARGET__EXPORTS, true, true);
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
			case EngineeringPackage.CONNECTION_TARGET__EXPORTS:
				return getExports();
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
			case EngineeringPackage.CONNECTION_TARGET__EXPORTS:
				getExports().clear();
				getExports().addAll((Collection<? extends Operation>)newValue);
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
			case EngineeringPackage.CONNECTION_TARGET__EXPORTS:
				getExports().clear();
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
			case EngineeringPackage.CONNECTION_TARGET__INBOUND_CONNECTIONS:
				return !getInboundConnections().isEmpty();
			case EngineeringPackage.CONNECTION_TARGET__EXPORTS:
				return !getExports().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionTargetImpl
