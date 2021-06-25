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
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Principle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineered Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getOwners <em>Owners</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getExperts <em>Experts</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getPrinciples <em>Principles</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getAllIssues <em>All Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EngineeredElementImpl extends ForumImpl implements EngineeredElement {
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
	@SuppressWarnings("unchecked")
	public EList<Engineer> getOwners() {
		EList<Engineer> ret = (EList<Engineer>)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT__OWNERS, EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNERS, true, true);
		if (ret.isEmpty()) {
			for (EObject ancestor = eContainer; ancestor != null; ancestor = ancestor.eContainer()) {
				if (ancestor instanceof Engineer) {
					return ECollections.singletonEList((Engineer) ancestor);
				}
				if (ancestor instanceof EngineeredElement) {
					return ((EngineeredElement) ancestor).getOwners();
				}
			}
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Engineer> getExperts() {
		return (EList<Engineer>)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT__EXPERTS, EngineeringPackage.Literals.ENGINEERED_ELEMENT__EXPERTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Allocation> getAllocations() {
		return (EList<Allocation>)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT__ALLOCATIONS, EngineeringPackage.Literals.ENGINEERED_ELEMENT__ALLOCATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Principle> getPrinciples() {
		return (EList<Principle>)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT__PRINCIPLES, EngineeringPackage.Literals.ENGINEERED_ELEMENT__PRINCIPLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getAllIssues() {
		EList<Issue> allIssues = ECollections.newBasicEList();
		eAllContents().forEachRemaining(e -> {
			if (e instanceof Issue) {
				allIssues.add((Issue) e);
			}
		});
		return allIssues;
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
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwners()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ENGINEERED_ELEMENT__EXPERTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExperts()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.ENGINEERED_ELEMENT__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNERS:
				return ((InternalEList<?>)getOwners()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEERED_ELEMENT__EXPERTS:
				return ((InternalEList<?>)getExperts()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEERED_ELEMENT__ALLOCATIONS:
				return ((InternalEList<?>)getAllocations()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEERED_ELEMENT__PRINCIPLES:
				return ((InternalEList<?>)getPrinciples()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNERS:
				return getOwners();
			case EngineeringPackage.ENGINEERED_ELEMENT__EXPERTS:
				return getExperts();
			case EngineeringPackage.ENGINEERED_ELEMENT__ALLOCATIONS:
				return getAllocations();
			case EngineeringPackage.ENGINEERED_ELEMENT__PRINCIPLES:
				return getPrinciples();
			case EngineeringPackage.ENGINEERED_ELEMENT__ALL_ISSUES:
				return getAllIssues();
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
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNERS:
				getOwners().clear();
				getOwners().addAll((Collection<? extends Engineer>)newValue);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__EXPERTS:
				getExperts().clear();
				getExperts().addAll((Collection<? extends Engineer>)newValue);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__ALLOCATIONS:
				getAllocations().clear();
				getAllocations().addAll((Collection<? extends Allocation>)newValue);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__PRINCIPLES:
				getPrinciples().clear();
				getPrinciples().addAll((Collection<? extends Principle>)newValue);
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
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNERS:
				getOwners().clear();
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__EXPERTS:
				getExperts().clear();
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__ALLOCATIONS:
				getAllocations().clear();
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__PRINCIPLES:
				getPrinciples().clear();
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
			case EngineeringPackage.ENGINEERED_ELEMENT__OWNERS:
				return !getOwners().isEmpty();
			case EngineeringPackage.ENGINEERED_ELEMENT__EXPERTS:
				return !getExperts().isEmpty();
			case EngineeringPackage.ENGINEERED_ELEMENT__ALLOCATIONS:
				return !getAllocations().isEmpty();
			case EngineeringPackage.ENGINEERED_ELEMENT__PRINCIPLES:
				return !getPrinciples().isEmpty();
			case EngineeringPackage.ENGINEERED_ELEMENT__ALL_ISSUES:
				return !getAllIssues().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EngineeredElementImpl
