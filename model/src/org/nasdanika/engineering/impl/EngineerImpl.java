/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import java.util.function.Predicate;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
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
 * </ul>
 *
 * @generated
 */
public class EngineerImpl extends PersonaImpl implements Engineer {
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
	
	private boolean isOwner(EngineeredElement engineeredElement) {
		EList<Engineer> owners = engineeredElement.getOwners();
		if (!owners.isEmpty()) {
			return owners.contains(this);
		}
		EObject c = engineeredElement.eContainer();
		if (c == this) {
			return true;
		}
		if (c instanceof EngineeredElement) {
			return isOwner((EngineeredElement) c);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getAssignments() {
		Predicate<EObject> effectiveAssigneeSelector = new Predicate<EObject>() {

			@Override
			public boolean test(EObject eObj) {
				if (eObj instanceof Issue) {
					Issue issue = (Issue) eObj;
					if (issue.getAssignee() == EngineerImpl.this) {
						return true;
					}
					EObject c = issue.eContainer();
					if (c instanceof Issue) {
						return test(c);
					}
					if (c instanceof EngineeredElement) {						
						return isOwner((EngineeredElement) c);
					}
					if (c == EngineerImpl.this) {
						return true;
					}
				} 
				
				return false;
			}
			
		};
		
		return collect(effectiveAssigneeSelector);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ENGINEER__OWNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwns()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__EXPERTISE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpertise()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.ENGINEER__ISSUE_CATEGORIES:
				return ((InternalEList<?>)getIssueCategories()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEER__ISSUE_STATUSES:
				return ((InternalEList<?>)getIssueStatuses()).basicRemove(otherEnd, msgs);
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
		}
		return super.eIsSet(featureID);
	}
	
} //EngineerImpl
