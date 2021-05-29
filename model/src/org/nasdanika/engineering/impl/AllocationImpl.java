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
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.IssueCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.AllocationImpl#getEngineer <em>Engineer</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.AllocationImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationImpl extends CapacityImpl implements Allocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Engineer getEngineer() {
		if (!eIsSet(EngineeringPackage.Literals.ALLOCATION__ENGINEER)) {
			EObject c = eContainer();
			if (c instanceof EngineeredElement) {
				EList<Engineer> owners = ((EngineeredElement) c).getOwners();
				if (!owners.isEmpty()) {
					return owners.get(0);
				}
			}
		}
		return (Engineer)eDynamicGet(EngineeringPackage.ALLOCATION__ENGINEER, EngineeringPackage.Literals.ALLOCATION__ENGINEER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetEngineer() {
		return (Engineer)eDynamicGet(EngineeringPackage.ALLOCATION__ENGINEER, EngineeringPackage.Literals.ALLOCATION__ENGINEER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineer(Engineer newEngineer, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEngineer, EngineeringPackage.ALLOCATION__ENGINEER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineer(Engineer newEngineer) {
		eDynamicSet(EngineeringPackage.ALLOCATION__ENGINEER, EngineeringPackage.Literals.ALLOCATION__ENGINEER, newEngineer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IssueCategory> getCategory() {
		return (EList<IssueCategory>)eDynamicGet(EngineeringPackage.ALLOCATION__CATEGORY, EngineeringPackage.Literals.ALLOCATION__CATEGORY, true, true);
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
			case EngineeringPackage.ALLOCATION__ENGINEER:
				Engineer engineer = basicGetEngineer();
				if (engineer != null)
					msgs = ((InternalEObject)engineer).eInverseRemove(this, EngineeringPackage.ENGINEER__DESIGNATIONS, Engineer.class, msgs);
				return basicSetEngineer((Engineer)otherEnd, msgs);
			case EngineeringPackage.ALLOCATION__CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.ALLOCATION__ENGINEER:
				return basicSetEngineer(null, msgs);
			case EngineeringPackage.ALLOCATION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.ALLOCATION__ENGINEER:
				if (resolve) return getEngineer();
				return basicGetEngineer();
			case EngineeringPackage.ALLOCATION__CATEGORY:
				return getCategory();
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
			case EngineeringPackage.ALLOCATION__ENGINEER:
				setEngineer((Engineer)newValue);
				return;
			case EngineeringPackage.ALLOCATION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends IssueCategory>)newValue);
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
			case EngineeringPackage.ALLOCATION__ENGINEER:
				setEngineer((Engineer)null);
				return;
			case EngineeringPackage.ALLOCATION__CATEGORY:
				getCategory().clear();
				return;
		}
		super.eUnset(featureID);
	}
	
	@Override
	public double getRate() {
		double rate = super.getRate();
		if (rate == 0) {
			Engineer engineer = getEngineer();
			if (engineer != null) {
				return engineer.getRate();
			}
		}
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EngineeringPackage.ALLOCATION__ENGINEER:
				return basicGetEngineer() != null;
			case EngineeringPackage.ALLOCATION__CATEGORY:
				return !getCategory().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocationImpl
