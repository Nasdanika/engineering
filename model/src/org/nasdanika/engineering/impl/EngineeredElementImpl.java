/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineered Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getOwnerId <em>Owner Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EngineeredElementImpl extends NamedElementImpl implements EngineeredElement {
	/**
	 * The default value of the '{@link #getOwnerId() <em>Owner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerId()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineeredElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ENGINEERED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getIssues() {
		return (EList<Issue>)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT__ISSUES, EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Engineer getOwner() {
		String ownerId = getOwnerId();
		if (!Util.isBlank(ownerId)) {
			return findById(Engineer.class, ownerId);
		}

		EObject ec = eContainer();
		
		if (ec instanceof Engineer) {
			return (Engineer) ec;
		}
		
		if (ec instanceof EngineeredElement) {
			return ((EngineeredElement) ec).getOwner();
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetOwner() {
		return (Engineer)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT__OWNER, EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnerId() {
		return (String)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT__OWNER_ID, EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNER_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerId(String newOwnerId) {
		eDynamicSet(EngineeringPackage.ENGINEERED_ELEMENT__OWNER_ID, EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNER_ID, newOwnerId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ENGINEERED_ELEMENT__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.ENGINEERED_ELEMENT__ISSUES:
				return getIssues();
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNER_ID:
				return getOwnerId();
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
			case EngineeringPackage.ENGINEERED_ELEMENT__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNER_ID:
				setOwnerId((String)newValue);
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
			case EngineeringPackage.ENGINEERED_ELEMENT__ISSUES:
				getIssues().clear();
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNER_ID:
				setOwnerId(OWNER_ID_EDEFAULT);
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
			case EngineeringPackage.ENGINEERED_ELEMENT__ISSUES:
				return !getIssues().isEmpty();
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNER:
				return basicGetOwner() != null;
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNER_ID:
				return OWNER_ID_EDEFAULT == null ? getOwnerId() != null : !OWNER_ID_EDEFAULT.equals(getOwnerId());
		}
		return super.eIsSet(featureID);
	}

} //EngineeredElementImpl
