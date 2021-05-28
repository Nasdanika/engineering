/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.Persona;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getOwns <em>Owns</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getExpertise <em>Expertise</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getIncrements <em>Increments</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getIssueCategories <em>Issue Categories</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getIssueStatuses <em>Issue Statuses</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getDesignations <em>Designations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineerImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineerImpl extends PersonaImpl implements Engineer {
	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final double RATE_EDEFAULT = 1.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ENGINEER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.engineering.Module> getModules() {
		return (EList<org.nasdanika.engineering.Module>)eDynamicGet(EngineeringPackage.ENGINEER__MODULES, EngineeringPackage.Literals.ENGINEER__MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<EngineeredElement> getOwns() {
		return getReferrers(EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<EngineeredElement> getExpertise() {
		return getReferrers(EngineeringPackage.Literals.ENGINEERED_ELEMENT__EXPERTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Increment> getIncrements() {
		return (EList<Increment>)eDynamicGet(EngineeringPackage.ENGINEER__INCREMENTS, EngineeringPackage.Literals.ENGINEER__INCREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getServices() {
		return (EList<Activity>)eDynamicGet(EngineeringPackage.ENGINEER__SERVICES, EngineeringPackage.Literals.ENGINEER__SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getPersonas() {
		return (EList<Persona>)eDynamicGet(EngineeringPackage.ENGINEER__PERSONAS, EngineeringPackage.Literals.ENGINEER__PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Endeavor> getAssignments() {
		return getReferrers(EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IssueCategory> getIssueCategories() {
		return (EList<IssueCategory>)eDynamicGet(EngineeringPackage.ENGINEER__ISSUE_CATEGORIES, EngineeringPackage.Literals.ENGINEER__ISSUE_CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IssueStatus> getIssueStatuses() {
		return (EList<IssueStatus>)eDynamicGet(EngineeringPackage.ENGINEER__ISSUE_STATUSES, EngineeringPackage.Literals.ENGINEER__ISSUE_STATUSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRate() {
		return (Double)eDynamicGet(EngineeringPackage.ENGINEER__RATE, EngineeringPackage.Literals.ENGINEER__RATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRate(double newRate) {
		eDynamicSet(EngineeringPackage.ENGINEER__RATE, EngineeringPackage.Literals.ENGINEER__RATE, newRate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Allocation> getDesignations() {
		return getReferrers(EngineeringPackage.Literals.ALLOCATION__ENGINEER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capacity> getCapacity() {
		return (EList<Capacity>)eDynamicGet(EngineeringPackage.ENGINEER__CAPACITY, EngineeringPackage.Literals.ENGINEER__CAPACITY, true, true);
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
			case EngineeringPackage.ENGINEER__OWNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwns()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__EXPERTISE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpertise()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__ASSIGNMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignments()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__DESIGNATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

//	@Override
//	public EList<Engineer> getOwners() {
//		EList<Engineer> owners = super.getOwners();
//		return owners.isEmpty() ? ECollections.singletonEList(this) : owners;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ENGINEER__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__OWNS:
				return ((InternalEList<?>)getOwns()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__EXPERTISE:
				return ((InternalEList<?>)getExpertise()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__INCREMENTS:
				return ((InternalEList<?>)getIncrements()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__PERSONAS:
				return ((InternalEList<?>)getPersonas()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__ASSIGNMENTS:
				return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__ISSUE_CATEGORIES:
				return ((InternalEList<?>)getIssueCategories()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__ISSUE_STATUSES:
				return ((InternalEList<?>)getIssueStatuses()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__DESIGNATIONS:
				return ((InternalEList<?>)getDesignations()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__CAPACITY:
				return ((InternalEList<?>)getCapacity()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.ENGINEER__MODULES:
				return getModules();
			case EngineeringPackage.ENGINEER__OWNS:
				return getOwns();
			case EngineeringPackage.ENGINEER__EXPERTISE:
				return getExpertise();
			case EngineeringPackage.ENGINEER__INCREMENTS:
				return getIncrements();
			case EngineeringPackage.ENGINEER__SERVICES:
				return getServices();
			case EngineeringPackage.ENGINEER__PERSONAS:
				return getPersonas();
			case EngineeringPackage.ENGINEER__ASSIGNMENTS:
				return getAssignments();
			case EngineeringPackage.ENGINEER__ISSUE_CATEGORIES:
				return getIssueCategories();
			case EngineeringPackage.ENGINEER__ISSUE_STATUSES:
				return getIssueStatuses();
			case EngineeringPackage.ENGINEER__RATE:
				return getRate();
			case EngineeringPackage.ENGINEER__DESIGNATIONS:
				return getDesignations();
			case EngineeringPackage.ENGINEER__CAPACITY:
				return getCapacity();
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
			case EngineeringPackage.ENGINEER__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends org.nasdanika.engineering.Module>)newValue);
				return;
			case EngineeringPackage.ENGINEER__INCREMENTS:
				getIncrements().clear();
				getIncrements().addAll((Collection<? extends Increment>)newValue);
				return;
			case EngineeringPackage.ENGINEER__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Activity>)newValue);
				return;
			case EngineeringPackage.ENGINEER__PERSONAS:
				getPersonas().clear();
				getPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case EngineeringPackage.ENGINEER__ISSUE_CATEGORIES:
				getIssueCategories().clear();
				getIssueCategories().addAll((Collection<? extends IssueCategory>)newValue);
				return;
			case EngineeringPackage.ENGINEER__ISSUE_STATUSES:
				getIssueStatuses().clear();
				getIssueStatuses().addAll((Collection<? extends IssueStatus>)newValue);
				return;
			case EngineeringPackage.ENGINEER__RATE:
				setRate((Double)newValue);
				return;
			case EngineeringPackage.ENGINEER__CAPACITY:
				getCapacity().clear();
				getCapacity().addAll((Collection<? extends Capacity>)newValue);
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
			case EngineeringPackage.ENGINEER__MODULES:
				getModules().clear();
				return;
			case EngineeringPackage.ENGINEER__INCREMENTS:
				getIncrements().clear();
				return;
			case EngineeringPackage.ENGINEER__SERVICES:
				getServices().clear();
				return;
			case EngineeringPackage.ENGINEER__PERSONAS:
				getPersonas().clear();
				return;
			case EngineeringPackage.ENGINEER__ISSUE_CATEGORIES:
				getIssueCategories().clear();
				return;
			case EngineeringPackage.ENGINEER__ISSUE_STATUSES:
				getIssueStatuses().clear();
				return;
			case EngineeringPackage.ENGINEER__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case EngineeringPackage.ENGINEER__CAPACITY:
				getCapacity().clear();
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
			case EngineeringPackage.ENGINEER__MODULES:
				return !getModules().isEmpty();
			case EngineeringPackage.ENGINEER__OWNS:
				return !getOwns().isEmpty();
			case EngineeringPackage.ENGINEER__EXPERTISE:
				return !getExpertise().isEmpty();
			case EngineeringPackage.ENGINEER__INCREMENTS:
				return !getIncrements().isEmpty();
			case EngineeringPackage.ENGINEER__SERVICES:
				return !getServices().isEmpty();
			case EngineeringPackage.ENGINEER__PERSONAS:
				return !getPersonas().isEmpty();
			case EngineeringPackage.ENGINEER__ASSIGNMENTS:
				return !getAssignments().isEmpty();
			case EngineeringPackage.ENGINEER__ISSUE_CATEGORIES:
				return !getIssueCategories().isEmpty();
			case EngineeringPackage.ENGINEER__ISSUE_STATUSES:
				return !getIssueStatuses().isEmpty();
			case EngineeringPackage.ENGINEER__RATE:
				return getRate() != RATE_EDEFAULT;
			case EngineeringPackage.ENGINEER__DESIGNATIONS:
				return !getDesignations().isEmpty();
			case EngineeringPackage.ENGINEER__CAPACITY:
				return !getCapacity().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
} //EngineerImpl
