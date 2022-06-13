/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.engineering.Call;
import org.nasdanika.engineering.Connection;
import org.nasdanika.engineering.ConnectionTarget;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.OperationImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.OperationImpl#getInvocations <em>Invocations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.OperationImpl#getExportedBy <em>Exported By</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.OperationImpl#getUsedBy <em>Used By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends EngineeredElementImpl implements Operation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getCalls() {
		return (EList<Call>)eDynamicGet(EngineeringPackage.OPERATION__CALLS, EngineeringPackage.Literals.OPERATION__CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Call> getInvocations() {
		return getOppositeReferrers(EngineeringPackage.Literals.OPERATION__INVOCATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConnectionTarget> getExportedBy() {
		return getOppositeReferrers(EngineeringPackage.Literals.OPERATION__EXPORTED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Connection> getUsedBy() {
		EList<Connection> usedBy = ECollections.newBasicEList(getReferrers(EngineeringPackage.Literals.CONNECTION__TARGET_OPERATIONS));
		for (EObject so: getReferrers(EngineeringPackage.Literals.CONNECTION__SOURCE_OPERATIONS)) {
			if (!usedBy.contains(so)) {
				usedBy.add((Connection) so);
			}
		}
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.OPERATION__CALLS:
				return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.OPERATION__CALLS:
				return getCalls();
			case EngineeringPackage.OPERATION__INVOCATIONS:
				return getInvocations();
			case EngineeringPackage.OPERATION__EXPORTED_BY:
				return getExportedBy();
			case EngineeringPackage.OPERATION__USED_BY:
				return getUsedBy();
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
			case EngineeringPackage.OPERATION__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case EngineeringPackage.OPERATION__INVOCATIONS:
				getInvocations().clear();
				getInvocations().addAll((Collection<? extends Call>)newValue);
				return;
			case EngineeringPackage.OPERATION__EXPORTED_BY:
				getExportedBy().clear();
				getExportedBy().addAll((Collection<? extends ConnectionTarget>)newValue);
				return;
			case EngineeringPackage.OPERATION__USED_BY:
				getUsedBy().clear();
				getUsedBy().addAll((Collection<? extends Connection>)newValue);
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
			case EngineeringPackage.OPERATION__CALLS:
				getCalls().clear();
				return;
			case EngineeringPackage.OPERATION__INVOCATIONS:
				getInvocations().clear();
				return;
			case EngineeringPackage.OPERATION__EXPORTED_BY:
				getExportedBy().clear();
				return;
			case EngineeringPackage.OPERATION__USED_BY:
				getUsedBy().clear();
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
			case EngineeringPackage.OPERATION__CALLS:
				return !getCalls().isEmpty();
			case EngineeringPackage.OPERATION__INVOCATIONS:
				return !getInvocations().isEmpty();
			case EngineeringPackage.OPERATION__EXPORTED_BY:
				return !getExportedBy().isEmpty();
			case EngineeringPackage.OPERATION__USED_BY:
				return !getUsedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
