/**
 */
package org.nasdanika.engineering.impl;

import java.time.Duration;
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
import org.nasdanika.engineering.Period;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Temporal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineered Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementImpl#getDuration <em>Duration</em>}</li>
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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

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
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT__START, EngineeringPackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, EngineeringPackage.ENGINEERED_ELEMENT__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(EngineeringPackage.ENGINEERED_ELEMENT__START, EngineeringPackage.Literals.PERIOD__START, newStart);
		PeriodImpl.onStart(this, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT__END, EngineeringPackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, EngineeringPackage.ENGINEERED_ELEMENT__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(EngineeringPackage.ENGINEERED_ELEMENT__END, EngineeringPackage.Literals.PERIOD__END, newEnd);
		PeriodImpl.onEnd(this, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT__DURATION, EngineeringPackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(EngineeringPackage.ENGINEERED_ELEMENT__DURATION, EngineeringPackage.Literals.PERIOD__DURATION, newDuration);
		PeriodImpl.onDuration(this, newDuration);
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
			case EngineeringPackage.ENGINEERED_ELEMENT__START:
				return basicSetStart(null, msgs);
			case EngineeringPackage.ENGINEERED_ELEMENT__END:
				return basicSetEnd(null, msgs);
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
			case EngineeringPackage.ENGINEERED_ELEMENT__START:
				return getStart();
			case EngineeringPackage.ENGINEERED_ELEMENT__END:
				return getEnd();
			case EngineeringPackage.ENGINEERED_ELEMENT__DURATION:
				return getDuration();
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
			case EngineeringPackage.ENGINEERED_ELEMENT__START:
				setStart((Temporal)newValue);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__END:
				setEnd((Temporal)newValue);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__DURATION:
				setDuration((Duration)newValue);
				return;
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
			case EngineeringPackage.ENGINEERED_ELEMENT__START:
				setStart((Temporal)null);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__END:
				setEnd((Temporal)null);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
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
			case EngineeringPackage.ENGINEERED_ELEMENT__START:
				return getStart() != null;
			case EngineeringPackage.ENGINEERED_ELEMENT__END:
				return getEnd() != null;
			case EngineeringPackage.ENGINEERED_ELEMENT__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Period.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.ENGINEERED_ELEMENT__START: return EngineeringPackage.PERIOD__START;
				case EngineeringPackage.ENGINEERED_ELEMENT__END: return EngineeringPackage.PERIOD__END;
				case EngineeringPackage.ENGINEERED_ELEMENT__DURATION: return EngineeringPackage.PERIOD__DURATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Period.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.PERIOD__START: return EngineeringPackage.ENGINEERED_ELEMENT__START;
				case EngineeringPackage.PERIOD__END: return EngineeringPackage.ENGINEERED_ELEMENT__END;
				case EngineeringPackage.PERIOD__DURATION: return EngineeringPackage.ENGINEERED_ELEMENT__DURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EngineeredElementImpl
