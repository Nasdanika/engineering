/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.Connection;
import org.nasdanika.engineering.ConnectionTarget;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.InterfaceImpl#getInboundConnections <em>Inbound Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends EngineeredElementImpl implements Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Connection> getInboundConnections() {
		return getOppositeReferrers(EngineeringPackage.Literals.CONNECTION_TARGET__INBOUND_CONNECTIONS);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.INTERFACE__INBOUND_CONNECTIONS:
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
			case EngineeringPackage.INTERFACE__INBOUND_CONNECTIONS:
				return !getInboundConnections().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConnectionTarget.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.INTERFACE__INBOUND_CONNECTIONS: return EngineeringPackage.CONNECTION_TARGET__INBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ConnectionTarget.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.CONNECTION_TARGET__INBOUND_CONNECTIONS: return EngineeringPackage.INTERFACE__INBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InterfaceImpl
