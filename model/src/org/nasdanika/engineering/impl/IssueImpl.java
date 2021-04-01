/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Release;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getPlannedFor <em>Planned For</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getContributesTo <em>Contributes To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends NamedElementImpl implements Issue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getChildren() {
		return (EList<Issue>)eDynamicGet(EngineeringPackage.ISSUE__CHILDREN, EngineeringPackage.Literals.ISSUE__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Engineer getAssignee() {
		return (Engineer)eDynamicGet(EngineeringPackage.ISSUE__ASSIGNEE, EngineeringPackage.Literals.ISSUE__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetAssignee() {
		return (Engineer)eDynamicGet(EngineeringPackage.ISSUE__ASSIGNEE, EngineeringPackage.Literals.ISSUE__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(Engineer newAssignee) {
		eDynamicSet(EngineeringPackage.ISSUE__ASSIGNEE, EngineeringPackage.Literals.ISSUE__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Release> getDependencies() {
		return (EList<Release>)eDynamicGet(EngineeringPackage.ISSUE__DEPENDENCIES, EngineeringPackage.Literals.ISSUE__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Release getPlannedFor() {
		return (Release)eDynamicGet(EngineeringPackage.ISSUE__PLANNED_FOR, EngineeringPackage.Literals.ISSUE__PLANNED_FOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release basicGetPlannedFor() {
		return (Release)eDynamicGet(EngineeringPackage.ISSUE__PLANNED_FOR, EngineeringPackage.Literals.ISSUE__PLANNED_FOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedFor(Release newPlannedFor) {
		eDynamicSet(EngineeringPackage.ISSUE__PLANNED_FOR, EngineeringPackage.Literals.ISSUE__PLANNED_FOR, newPlannedFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getContributesTo() {
		return (Feature)eDynamicGet(EngineeringPackage.ISSUE__CONTRIBUTES_TO, EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetContributesTo() {
		return (Feature)eDynamicGet(EngineeringPackage.ISSUE__CONTRIBUTES_TO, EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContributesTo(Feature newContributesTo) {
		eDynamicSet(EngineeringPackage.ISSUE__CONTRIBUTES_TO, EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO, newContributesTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ISSUE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.ISSUE__CHILDREN:
				return getChildren();
			case EngineeringPackage.ISSUE__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case EngineeringPackage.ISSUE__DEPENDENCIES:
				return getDependencies();
			case EngineeringPackage.ISSUE__PLANNED_FOR:
				if (resolve) return getPlannedFor();
				return basicGetPlannedFor();
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				if (resolve) return getContributesTo();
				return basicGetContributesTo();
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
			case EngineeringPackage.ISSUE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Issue>)newValue);
				return;
			case EngineeringPackage.ISSUE__ASSIGNEE:
				setAssignee((Engineer)newValue);
				return;
			case EngineeringPackage.ISSUE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Release>)newValue);
				return;
			case EngineeringPackage.ISSUE__PLANNED_FOR:
				setPlannedFor((Release)newValue);
				return;
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				setContributesTo((Feature)newValue);
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
			case EngineeringPackage.ISSUE__CHILDREN:
				getChildren().clear();
				return;
			case EngineeringPackage.ISSUE__ASSIGNEE:
				setAssignee((Engineer)null);
				return;
			case EngineeringPackage.ISSUE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case EngineeringPackage.ISSUE__PLANNED_FOR:
				setPlannedFor((Release)null);
				return;
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				setContributesTo((Feature)null);
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
			case EngineeringPackage.ISSUE__CHILDREN:
				return !getChildren().isEmpty();
			case EngineeringPackage.ISSUE__ASSIGNEE:
				return basicGetAssignee() != null;
			case EngineeringPackage.ISSUE__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case EngineeringPackage.ISSUE__PLANNED_FOR:
				return basicGetPlannedFor() != null;
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				return basicGetContributesTo() != null;
		}
		return super.eIsSet(featureID);
	}

} //IssueImpl
