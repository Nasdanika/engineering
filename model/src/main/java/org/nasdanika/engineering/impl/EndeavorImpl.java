/**
 */
package org.nasdanika.engineering.impl;

import java.time.Duration;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.Alignable;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Objective;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.Temporal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endeavor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getAligns <em>Aligns</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getAllIssues <em>All Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getLinkedObjectives <em>Linked Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getAllObjectives <em>All Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getAffects <em>Affects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndeavorImpl extends ModelElementImpl implements Endeavor {
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
	 * The default value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPLETION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getBenefit() <em>Benefit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefit()
	 * @generated
	 * @ordered
	 */
	protected static final double BENEFIT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getTotalCost() <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_COST_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndeavorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ENDEAVOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(EngineeringPackage.ENDEAVOR__START, NcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, EngineeringPackage.ENDEAVOR__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(EngineeringPackage.ENDEAVOR__START, NcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(EngineeringPackage.ENDEAVOR__END, NcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, EngineeringPackage.ENDEAVOR__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(EngineeringPackage.ENDEAVOR__END, NcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(EngineeringPackage.ENDEAVOR__DURATION, NcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(EngineeringPackage.ENDEAVOR__DURATION, NcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Alignment> getAligns() {
		return (EList<Alignment>)eDynamicGet(EngineeringPackage.ENDEAVOR__ALIGNS, EngineeringPackage.Literals.ALIGNABLE__ALIGNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCompletion() {
		return (Double)eDynamicGet(EngineeringPackage.ENDEAVOR__COMPLETION, EngineeringPackage.Literals.ENDEAVOR__COMPLETION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBenefit() {
		return (Double)eDynamicGet(EngineeringPackage.ENDEAVOR__BENEFIT, EngineeringPackage.Literals.ENDEAVOR__BENEFIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBenefit(double newBenefit) {
		eDynamicSet(EngineeringPackage.ENDEAVOR__BENEFIT, EngineeringPackage.Literals.ENDEAVOR__BENEFIT, newBenefit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalCost() {
		return (Double)eDynamicGet(EngineeringPackage.ENDEAVOR__TOTAL_COST, EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Engineer getAssignee() {
		return (Engineer)eDynamicGet(EngineeringPackage.ENDEAVOR__ASSIGNEE, EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetAssignee() {
		return (Engineer)eDynamicGet(EngineeringPackage.ENDEAVOR__ASSIGNEE, EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(Engineer newAssignee) {
		eDynamicSet(EngineeringPackage.ENDEAVOR__ASSIGNEE, EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getAllIssues() {
		return (EList<Issue>)eDynamicGet(EngineeringPackage.ENDEAVOR__ALL_ISSUES, EngineeringPackage.Literals.ENDEAVOR__ALL_ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capacity> getCapacity() {
		return (EList<Capacity>)eDynamicGet(EngineeringPackage.ENDEAVOR__CAPACITY, EngineeringPackage.Literals.ENDEAVOR__CAPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Objective> getObjectives() {
		return (EList<Objective>)eDynamicGet(EngineeringPackage.ENDEAVOR__OBJECTIVES, EngineeringPackage.Literals.ENDEAVOR__OBJECTIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Objective> getLinkedObjectives() {
		return EmfUtil.getReferrers(this, EngineeringPackage.Literals.OBJECTIVE__ENDEAVOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Objective> getAllObjectives() {
		BasicEList<Objective> ret = ECollections.newBasicEList(getObjectives());
		ret.addAll(getLinkedObjectives());
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EngineeredElement> getAffects() {
		return (EList<EngineeredElement>)eDynamicGet(EngineeringPackage.ENDEAVOR__AFFECTS, EngineeringPackage.Literals.ENDEAVOR__AFFECTS, true, true);
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
			case EngineeringPackage.ENDEAVOR__CAPACITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapacity()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkedObjectives()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.ENDEAVOR__START:
				return basicSetStart(null, msgs);
			case EngineeringPackage.ENDEAVOR__END:
				return basicSetEnd(null, msgs);
			case EngineeringPackage.ENDEAVOR__ALIGNS:
				return ((InternalEList<?>)getAligns()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENDEAVOR__CAPACITY:
				return ((InternalEList<?>)getCapacity()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENDEAVOR__OBJECTIVES:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES:
				return ((InternalEList<?>)getLinkedObjectives()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.ENDEAVOR__START:
				return getStart();
			case EngineeringPackage.ENDEAVOR__END:
				return getEnd();
			case EngineeringPackage.ENDEAVOR__DURATION:
				return getDuration();
			case EngineeringPackage.ENDEAVOR__ALIGNS:
				return getAligns();
			case EngineeringPackage.ENDEAVOR__COMPLETION:
				return getCompletion();
			case EngineeringPackage.ENDEAVOR__BENEFIT:
				return getBenefit();
			case EngineeringPackage.ENDEAVOR__TOTAL_COST:
				return getTotalCost();
			case EngineeringPackage.ENDEAVOR__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case EngineeringPackage.ENDEAVOR__ALL_ISSUES:
				return getAllIssues();
			case EngineeringPackage.ENDEAVOR__CAPACITY:
				return getCapacity();
			case EngineeringPackage.ENDEAVOR__OBJECTIVES:
				return getObjectives();
			case EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES:
				return getLinkedObjectives();
			case EngineeringPackage.ENDEAVOR__ALL_OBJECTIVES:
				return getAllObjectives();
			case EngineeringPackage.ENDEAVOR__AFFECTS:
				return getAffects();
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
			case EngineeringPackage.ENDEAVOR__START:
				setStart((Temporal)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__END:
				setEnd((Temporal)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__DURATION:
				setDuration((Duration)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__ALIGNS:
				getAligns().clear();
				getAligns().addAll((Collection<? extends Alignment>)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__BENEFIT:
				setBenefit((Double)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__ASSIGNEE:
				setAssignee((Engineer)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES:
				getLinkedObjectives().clear();
				getLinkedObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__ALL_OBJECTIVES:
				getAllObjectives().clear();
				getAllObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__AFFECTS:
				getAffects().clear();
				getAffects().addAll((Collection<? extends EngineeredElement>)newValue);
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
			case EngineeringPackage.ENDEAVOR__START:
				setStart((Temporal)null);
				return;
			case EngineeringPackage.ENDEAVOR__END:
				setEnd((Temporal)null);
				return;
			case EngineeringPackage.ENDEAVOR__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case EngineeringPackage.ENDEAVOR__ALIGNS:
				getAligns().clear();
				return;
			case EngineeringPackage.ENDEAVOR__BENEFIT:
				setBenefit(BENEFIT_EDEFAULT);
				return;
			case EngineeringPackage.ENDEAVOR__ASSIGNEE:
				setAssignee((Engineer)null);
				return;
			case EngineeringPackage.ENDEAVOR__OBJECTIVES:
				getObjectives().clear();
				return;
			case EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES:
				getLinkedObjectives().clear();
				return;
			case EngineeringPackage.ENDEAVOR__ALL_OBJECTIVES:
				getAllObjectives().clear();
				return;
			case EngineeringPackage.ENDEAVOR__AFFECTS:
				getAffects().clear();
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
			case EngineeringPackage.ENDEAVOR__START:
				return getStart() != null;
			case EngineeringPackage.ENDEAVOR__END:
				return getEnd() != null;
			case EngineeringPackage.ENDEAVOR__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case EngineeringPackage.ENDEAVOR__ALIGNS:
				return !getAligns().isEmpty();
			case EngineeringPackage.ENDEAVOR__COMPLETION:
				return getCompletion() != COMPLETION_EDEFAULT;
			case EngineeringPackage.ENDEAVOR__BENEFIT:
				return getBenefit() != BENEFIT_EDEFAULT;
			case EngineeringPackage.ENDEAVOR__TOTAL_COST:
				return getTotalCost() != TOTAL_COST_EDEFAULT;
			case EngineeringPackage.ENDEAVOR__ASSIGNEE:
				return basicGetAssignee() != null;
			case EngineeringPackage.ENDEAVOR__ALL_ISSUES:
				return !getAllIssues().isEmpty();
			case EngineeringPackage.ENDEAVOR__CAPACITY:
				return !getCapacity().isEmpty();
			case EngineeringPackage.ENDEAVOR__OBJECTIVES:
				return !getObjectives().isEmpty();
			case EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES:
				return !getLinkedObjectives().isEmpty();
			case EngineeringPackage.ENDEAVOR__ALL_OBJECTIVES:
				return !getAllObjectives().isEmpty();
			case EngineeringPackage.ENDEAVOR__AFFECTS:
				return !getAffects().isEmpty();
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
				case EngineeringPackage.ENDEAVOR__START: return NcorePackage.PERIOD__START;
				case EngineeringPackage.ENDEAVOR__END: return NcorePackage.PERIOD__END;
				case EngineeringPackage.ENDEAVOR__DURATION: return NcorePackage.PERIOD__DURATION;
				default: return -1;
			}
		}
		if (baseClass == Alignable.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.ENDEAVOR__ALIGNS: return EngineeringPackage.ALIGNABLE__ALIGNS;
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
				case NcorePackage.PERIOD__START: return EngineeringPackage.ENDEAVOR__START;
				case NcorePackage.PERIOD__END: return EngineeringPackage.ENDEAVOR__END;
				case NcorePackage.PERIOD__DURATION: return EngineeringPackage.ENDEAVOR__DURATION;
				default: return -1;
			}
		}
		if (baseClass == Alignable.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.ALIGNABLE__ALIGNS: return EngineeringPackage.ENDEAVOR__ALIGNS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EndeavorImpl
