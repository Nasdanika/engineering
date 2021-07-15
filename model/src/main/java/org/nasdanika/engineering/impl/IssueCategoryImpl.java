/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Allocation;
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
 *   <li>{@link org.nasdanika.engineering.impl.IssueCategoryImpl#isCumulative <em>Cumulative</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueCategoryImpl#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueCategoryImpl extends AimImpl implements IssueCategory {
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
	 * The default value of the '{@link #isCumulative() <em>Cumulative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCumulative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUMULATIVE_EDEFAULT = false;

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
		return getOppositeReferrers(EngineeringPackage.Literals.ISSUE_CATEGORY__ISSUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCumulative() {
		return (Boolean)eDynamicGet(EngineeringPackage.ISSUE_CATEGORY__CUMULATIVE, EngineeringPackage.Literals.ISSUE_CATEGORY__CUMULATIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCumulative(boolean newCumulative) {
		eDynamicSet(EngineeringPackage.ISSUE_CATEGORY__CUMULATIVE, EngineeringPackage.Literals.ISSUE_CATEGORY__CUMULATIVE, newCumulative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Allocation> getAllocations() {
		return getOppositeReferrers(EngineeringPackage.Literals.ISSUE_CATEGORY__ALLOCATIONS);
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
			case EngineeringPackage.ISSUE_CATEGORY__ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocations()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.ISSUE_CATEGORY__ALLOCATIONS:
				return ((InternalEList<?>)getAllocations()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.ISSUE_CATEGORY__CUMULATIVE:
				return isCumulative();
			case EngineeringPackage.ISSUE_CATEGORY__ALLOCATIONS:
				return getAllocations();
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
			case EngineeringPackage.ISSUE_CATEGORY__CUMULATIVE:
				setCumulative((Boolean)newValue);
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
			case EngineeringPackage.ISSUE_CATEGORY__CUMULATIVE:
				setCumulative(CUMULATIVE_EDEFAULT);
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
			case EngineeringPackage.ISSUE_CATEGORY__CUMULATIVE:
				return isCumulative() != CUMULATIVE_EDEFAULT;
			case EngineeringPackage.ISSUE_CATEGORY__ALLOCATIONS:
				return !getAllocations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IssueCategoryImpl
