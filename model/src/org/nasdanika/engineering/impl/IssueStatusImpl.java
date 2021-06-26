/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.IssueStatusImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueStatusImpl#isDone <em>Done</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueStatusImpl extends NamedElementImpl implements IssueStatus {
	/**
	 * The default value of the '{@link #isDone() <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DONE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ISSUE_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getIssues() {
		return getReferrers(EngineeringPackage.Literals.ISSUE__STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDone() {
		return (Boolean)eDynamicGet(EngineeringPackage.ISSUE_STATUS__DONE, EngineeringPackage.Literals.ISSUE_STATUS__DONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDone(boolean newDone) {
		eDynamicSet(EngineeringPackage.ISSUE_STATUS__DONE, EngineeringPackage.Literals.ISSUE_STATUS__DONE, newDone);
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
			case EngineeringPackage.ISSUE_STATUS__ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIssues()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.ISSUE_STATUS__ISSUES:
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
			case EngineeringPackage.ISSUE_STATUS__ISSUES:
				return getIssues();
			case EngineeringPackage.ISSUE_STATUS__DONE:
				return isDone();
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
			case EngineeringPackage.ISSUE_STATUS__DONE:
				setDone((Boolean)newValue);
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
			case EngineeringPackage.ISSUE_STATUS__DONE:
				setDone(DONE_EDEFAULT);
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
			case EngineeringPackage.ISSUE_STATUS__ISSUES:
				return !getIssues().isEmpty();
			case EngineeringPackage.ISSUE_STATUS__DONE:
				return isDone() != DONE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //IssueStatusImpl
