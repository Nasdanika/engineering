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
import org.nasdanika.engineering.Artifact;
import org.nasdanika.engineering.Call;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ActivityImpl#getPersona <em>Persona</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ActivityImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ActivityImpl#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ActivityImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ActivityImpl#getDeliverables <em>Deliverables</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ActivityImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends EngineeredElementImpl implements Activity {
	/**
	 * The default value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Persona getPersona() {
		return (Persona)eDynamicGet(EngineeringPackage.ACTIVITY__PERSONA, EngineeringPackage.Literals.ACTIVITY__PERSONA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona basicGetPersona() {
		return (Persona)eDynamicGet(EngineeringPackage.ACTIVITY__PERSONA, EngineeringPackage.Literals.ACTIVITY__PERSONA, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersona(Persona newPersona) {
		eDynamicSet(EngineeringPackage.ACTIVITY__PERSONA, EngineeringPackage.Literals.ACTIVITY__PERSONA, newPersona);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getOutputs() {
		return (EList<Transition>)eDynamicGet(EngineeringPackage.ACTIVITY__OUTPUTS, EngineeringPackage.Literals.ACTIVITY__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivityType() {
		return (String)eDynamicGet(EngineeringPackage.ACTIVITY__ACTIVITY_TYPE, EngineeringPackage.Literals.ACTIVITY__ACTIVITY_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityType(String newActivityType) {
		eDynamicSet(EngineeringPackage.ACTIVITY__ACTIVITY_TYPE, EngineeringPackage.Literals.ACTIVITY__ACTIVITY_TYPE, newActivityType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getRequirements() {
		return (EList<Artifact>)eDynamicGet(EngineeringPackage.ACTIVITY__REQUIREMENTS, EngineeringPackage.Literals.ACTIVITY__REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getDeliverables() {
		return (EList<Artifact>)eDynamicGet(EngineeringPackage.ACTIVITY__DELIVERABLES, EngineeringPackage.Literals.ACTIVITY__DELIVERABLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getCalls() {
		return (EList<Call>)eDynamicGet(EngineeringPackage.ACTIVITY__CALLS, EngineeringPackage.Literals.ACTIVITY__CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ACTIVITY__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ACTIVITY__CALLS:
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
			case EngineeringPackage.ACTIVITY__PERSONA:
				if (resolve) return getPersona();
				return basicGetPersona();
			case EngineeringPackage.ACTIVITY__OUTPUTS:
				return getOutputs();
			case EngineeringPackage.ACTIVITY__ACTIVITY_TYPE:
				return getActivityType();
			case EngineeringPackage.ACTIVITY__REQUIREMENTS:
				return getRequirements();
			case EngineeringPackage.ACTIVITY__DELIVERABLES:
				return getDeliverables();
			case EngineeringPackage.ACTIVITY__CALLS:
				return getCalls();
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
			case EngineeringPackage.ACTIVITY__PERSONA:
				setPersona((Persona)newValue);
				return;
			case EngineeringPackage.ACTIVITY__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Transition>)newValue);
				return;
			case EngineeringPackage.ACTIVITY__ACTIVITY_TYPE:
				setActivityType((String)newValue);
				return;
			case EngineeringPackage.ACTIVITY__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Artifact>)newValue);
				return;
			case EngineeringPackage.ACTIVITY__DELIVERABLES:
				getDeliverables().clear();
				getDeliverables().addAll((Collection<? extends Artifact>)newValue);
				return;
			case EngineeringPackage.ACTIVITY__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends Call>)newValue);
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
			case EngineeringPackage.ACTIVITY__PERSONA:
				setPersona((Persona)null);
				return;
			case EngineeringPackage.ACTIVITY__OUTPUTS:
				getOutputs().clear();
				return;
			case EngineeringPackage.ACTIVITY__ACTIVITY_TYPE:
				setActivityType(ACTIVITY_TYPE_EDEFAULT);
				return;
			case EngineeringPackage.ACTIVITY__REQUIREMENTS:
				getRequirements().clear();
				return;
			case EngineeringPackage.ACTIVITY__DELIVERABLES:
				getDeliverables().clear();
				return;
			case EngineeringPackage.ACTIVITY__CALLS:
				getCalls().clear();
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
			case EngineeringPackage.ACTIVITY__PERSONA:
				return basicGetPersona() != null;
			case EngineeringPackage.ACTIVITY__OUTPUTS:
				return !getOutputs().isEmpty();
			case EngineeringPackage.ACTIVITY__ACTIVITY_TYPE:
				return ACTIVITY_TYPE_EDEFAULT == null ? getActivityType() != null : !ACTIVITY_TYPE_EDEFAULT.equals(getActivityType());
			case EngineeringPackage.ACTIVITY__REQUIREMENTS:
				return !getRequirements().isEmpty();
			case EngineeringPackage.ACTIVITY__DELIVERABLES:
				return !getDeliverables().isEmpty();
			case EngineeringPackage.ACTIVITY__CALLS:
				return !getCalls().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
