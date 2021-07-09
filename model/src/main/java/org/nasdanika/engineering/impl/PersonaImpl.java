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
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.flow.JourneyElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.PersonaImpl#getJourneyElements <em>Journey Elements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.PersonaImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.PersonaImpl#getRepresentatives <em>Representatives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.PersonaImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.PersonaImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends EngineeredElementImpl implements Persona {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<JourneyElement> getJourneyElements() {
		return getReferrers(FlowPackage.Literals.JOURNEY_ELEMENT__PERSONAS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Goal> getGoals() {
		return (EList<Goal>)eDynamicGet(EngineeringPackage.PERSONA__GOALS, EngineeringPackage.Literals.PERSONA__GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Engineer> getRepresentatives() {
		return (EList<Engineer>)eDynamicGet(EngineeringPackage.PERSONA__REPRESENTATIVES, EngineeringPackage.Literals.PERSONA__REPRESENTATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getExtends() {
		return (EList<Persona>)eDynamicGet(EngineeringPackage.PERSONA__EXTENDS, EngineeringPackage.Literals.PERSONA__EXTENDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Persona> getExtensions() {
		return getReferrers(EngineeringPackage.Literals.PERSONA__EXTENDS);
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
			case EngineeringPackage.PERSONA__JOURNEY_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJourneyElements()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.PERSONA__REPRESENTATIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRepresentatives()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.PERSONA__EXTENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtends()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.PERSONA__EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.PERSONA__JOURNEY_ELEMENTS:
				return ((InternalEList<?>)getJourneyElements()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.PERSONA__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.PERSONA__REPRESENTATIVES:
				return ((InternalEList<?>)getRepresentatives()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.PERSONA__EXTENDS:
				return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.PERSONA__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.PERSONA__JOURNEY_ELEMENTS:
				return getJourneyElements();
			case EngineeringPackage.PERSONA__GOALS:
				return getGoals();
			case EngineeringPackage.PERSONA__REPRESENTATIVES:
				return getRepresentatives();
			case EngineeringPackage.PERSONA__EXTENDS:
				return getExtends();
			case EngineeringPackage.PERSONA__EXTENSIONS:
				return getExtensions();
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
			case EngineeringPackage.PERSONA__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case EngineeringPackage.PERSONA__REPRESENTATIVES:
				getRepresentatives().clear();
				getRepresentatives().addAll((Collection<? extends Engineer>)newValue);
				return;
			case EngineeringPackage.PERSONA__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends Persona>)newValue);
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
			case EngineeringPackage.PERSONA__GOALS:
				getGoals().clear();
				return;
			case EngineeringPackage.PERSONA__REPRESENTATIVES:
				getRepresentatives().clear();
				return;
			case EngineeringPackage.PERSONA__EXTENDS:
				getExtends().clear();
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
			case EngineeringPackage.PERSONA__JOURNEY_ELEMENTS:
				return !getJourneyElements().isEmpty();
			case EngineeringPackage.PERSONA__GOALS:
				return !getGoals().isEmpty();
			case EngineeringPackage.PERSONA__REPRESENTATIVES:
				return !getRepresentatives().isEmpty();
			case EngineeringPackage.PERSONA__EXTENDS:
				return !getExtends().isEmpty();
			case EngineeringPackage.PERSONA__EXTENSIONS:
				return !getExtensions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonaImpl
