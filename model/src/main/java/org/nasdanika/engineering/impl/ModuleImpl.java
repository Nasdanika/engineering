/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Connection;
import org.nasdanika.engineering.ConnectionSource;
import org.nasdanika.engineering.ConnectionTarget;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ModuleImpl#getOutboundConnections <em>Outbound Connections</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModuleImpl#getInboundConnections <em>Inbound Connections</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModuleImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModuleImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModuleImpl#getDependants <em>Dependants</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModuleImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends EngineeredElementImpl implements org.nasdanika.engineering.Module {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Connection> getOutboundConnections() {
		return (EList<Connection>)eDynamicGet(EngineeringPackage.MODULE__OUTBOUND_CONNECTIONS, EngineeringPackage.Literals.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS, true, true);
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.engineering.Module> getModules() {
		return (EList<org.nasdanika.engineering.Module>)eDynamicGet(EngineeringPackage.MODULE__MODULES, EngineeringPackage.Literals.MODULE__MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.engineering.Module> getDependencies() {
		return (EList<org.nasdanika.engineering.Module>)eDynamicGet(EngineeringPackage.MODULE__DEPENDENCIES, EngineeringPackage.Literals.MODULE__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<org.nasdanika.engineering.Module> getDependants() {
		return getOppositeReferrers(EngineeringPackage.Literals.MODULE__DEPENDANTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Interface> getInterfaces() {
		return (EList<Interface>)eDynamicGet(EngineeringPackage.MODULE__INTERFACES, EngineeringPackage.Literals.MODULE__INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.MODULE__OUTBOUND_CONNECTIONS:
				return ((InternalEList<?>)getOutboundConnections()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.MODULE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.MODULE__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.MODULE__OUTBOUND_CONNECTIONS:
				return getOutboundConnections();
			case EngineeringPackage.MODULE__INBOUND_CONNECTIONS:
				return getInboundConnections();
			case EngineeringPackage.MODULE__MODULES:
				return getModules();
			case EngineeringPackage.MODULE__DEPENDENCIES:
				return getDependencies();
			case EngineeringPackage.MODULE__DEPENDANTS:
				return getDependants();
			case EngineeringPackage.MODULE__INTERFACES:
				return getInterfaces();
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
			case EngineeringPackage.MODULE__OUTBOUND_CONNECTIONS:
				getOutboundConnections().clear();
				getOutboundConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case EngineeringPackage.MODULE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends org.nasdanika.engineering.Module>)newValue);
				return;
			case EngineeringPackage.MODULE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends org.nasdanika.engineering.Module>)newValue);
				return;
			case EngineeringPackage.MODULE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
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
			case EngineeringPackage.MODULE__OUTBOUND_CONNECTIONS:
				getOutboundConnections().clear();
				return;
			case EngineeringPackage.MODULE__MODULES:
				getModules().clear();
				return;
			case EngineeringPackage.MODULE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case EngineeringPackage.MODULE__INTERFACES:
				getInterfaces().clear();
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
			case EngineeringPackage.MODULE__OUTBOUND_CONNECTIONS:
				return !getOutboundConnections().isEmpty();
			case EngineeringPackage.MODULE__INBOUND_CONNECTIONS:
				return !getInboundConnections().isEmpty();
			case EngineeringPackage.MODULE__MODULES:
				return !getModules().isEmpty();
			case EngineeringPackage.MODULE__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case EngineeringPackage.MODULE__DEPENDANTS:
				return !getDependants().isEmpty();
			case EngineeringPackage.MODULE__INTERFACES:
				return !getInterfaces().isEmpty();
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
		if (baseClass == ConnectionSource.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.MODULE__OUTBOUND_CONNECTIONS: return EngineeringPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == ConnectionTarget.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.MODULE__INBOUND_CONNECTIONS: return EngineeringPackage.CONNECTION_TARGET__INBOUND_CONNECTIONS;
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
		if (baseClass == ConnectionSource.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS: return EngineeringPackage.MODULE__OUTBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == ConnectionTarget.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.CONNECTION_TARGET__INBOUND_CONNECTIONS: return EngineeringPackage.MODULE__INBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ModuleImpl
