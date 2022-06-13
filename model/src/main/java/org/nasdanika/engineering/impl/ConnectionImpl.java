/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.Connection;
import org.nasdanika.engineering.ConnectionTarget;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ConnectionImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ConnectionImpl#getTargetOperations <em>Target Operations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ConnectionImpl#getSourceOperations <em>Source Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends EngineeredElementImpl implements Connection {
	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionTarget getTarget() {
		return (ConnectionTarget)eDynamicGet(EngineeringPackage.CONNECTION__TARGET, EngineeringPackage.Literals.CONNECTION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTarget basicGetTarget() {
		return (ConnectionTarget)eDynamicGet(EngineeringPackage.CONNECTION__TARGET, EngineeringPackage.Literals.CONNECTION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ConnectionTarget newTarget) {
		eDynamicSet(EngineeringPackage.CONNECTION__TARGET, EngineeringPackage.Literals.CONNECTION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBidirectional() {
		return (Boolean)eDynamicGet(EngineeringPackage.CONNECTION__BIDIRECTIONAL, EngineeringPackage.Literals.CONNECTION__BIDIRECTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBidirectional(boolean newBidirectional) {
		eDynamicSet(EngineeringPackage.CONNECTION__BIDIRECTIONAL, EngineeringPackage.Literals.CONNECTION__BIDIRECTIONAL, newBidirectional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Operation> getTargetOperations() {
		return (EList<Operation>)eDynamicGet(EngineeringPackage.CONNECTION__TARGET_OPERATIONS, EngineeringPackage.Literals.CONNECTION__TARGET_OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Operation> getSourceOperations() {
		return (EList<Operation>)eDynamicGet(EngineeringPackage.CONNECTION__SOURCE_OPERATIONS, EngineeringPackage.Literals.CONNECTION__SOURCE_OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.CONNECTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case EngineeringPackage.CONNECTION__BIDIRECTIONAL:
				return isBidirectional();
			case EngineeringPackage.CONNECTION__TARGET_OPERATIONS:
				return getTargetOperations();
			case EngineeringPackage.CONNECTION__SOURCE_OPERATIONS:
				return getSourceOperations();
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
			case EngineeringPackage.CONNECTION__TARGET:
				setTarget((ConnectionTarget)newValue);
				return;
			case EngineeringPackage.CONNECTION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
			case EngineeringPackage.CONNECTION__TARGET_OPERATIONS:
				getTargetOperations().clear();
				getTargetOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case EngineeringPackage.CONNECTION__SOURCE_OPERATIONS:
				getSourceOperations().clear();
				getSourceOperations().addAll((Collection<? extends Operation>)newValue);
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
			case EngineeringPackage.CONNECTION__TARGET:
				setTarget((ConnectionTarget)null);
				return;
			case EngineeringPackage.CONNECTION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
			case EngineeringPackage.CONNECTION__TARGET_OPERATIONS:
				getTargetOperations().clear();
				return;
			case EngineeringPackage.CONNECTION__SOURCE_OPERATIONS:
				getSourceOperations().clear();
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
			case EngineeringPackage.CONNECTION__TARGET:
				return basicGetTarget() != null;
			case EngineeringPackage.CONNECTION__BIDIRECTIONAL:
				return isBidirectional() != BIDIRECTIONAL_EDEFAULT;
			case EngineeringPackage.CONNECTION__TARGET_OPERATIONS:
				return !getTargetOperations().isEmpty();
			case EngineeringPackage.CONNECTION__SOURCE_OPERATIONS:
				return !getSourceOperations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
