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
import org.nasdanika.engineering.IssueCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.IssueCategoryImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueCategoryImpl#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueCategoryImpl extends NamedElementImpl implements IssueCategory {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ISSUE_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return (Double)eDynamicGet(EngineeringPackage.ISSUE_CATEGORY__WEIGHT, EngineeringPackage.Literals.ISSUE_CATEGORY__WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		eDynamicSet(EngineeringPackage.ISSUE_CATEGORY__WEIGHT, EngineeringPackage.Literals.ISSUE_CATEGORY__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getIssues() {
		return getReferrers(EngineeringPackage.Literals.ISSUE__CATEGORY);
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
			case EngineeringPackage.ISSUE_CATEGORY__ISSUES:
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
			case EngineeringPackage.ISSUE_CATEGORY__ISSUES:
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
			case EngineeringPackage.ISSUE_CATEGORY__WEIGHT:
				return getWeight();
			case EngineeringPackage.ISSUE_CATEGORY__ISSUES:
				return getIssues();
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
			case EngineeringPackage.ISSUE_CATEGORY__WEIGHT:
				setWeight((Double)newValue);
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
			case EngineeringPackage.ISSUE_CATEGORY__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case EngineeringPackage.ISSUE_CATEGORY__WEIGHT:
				return getWeight() != WEIGHT_EDEFAULT;
			case EngineeringPackage.ISSUE_CATEGORY__ISSUES:
				return !getIssues().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IssueCategoryImpl
