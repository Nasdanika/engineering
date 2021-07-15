/**
 */
package org.nasdanika.engineering.impl;

import java.time.Duration;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Alignable;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Objective;
import org.nasdanika.engineering.Period;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.Temporal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Increment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getAligns <em>Aligns</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getAllIssues <em>All Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getLinkedObjectives <em>Linked Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getAllObjectives <em>All Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getReleases <em>Releases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncrementImpl extends NamedElementImpl implements Increment {
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
	protected IncrementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.INCREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Alignment> getAligns() {
		return (EList<Alignment>)eDynamicGet(EngineeringPackage.INCREMENT__ALIGNS, EngineeringPackage.Literals.ALIGNABLE__ALIGNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBenefit() {
		return (Double)eDynamicGet(EngineeringPackage.INCREMENT__BENEFIT, EngineeringPackage.Literals.ENDEAVOR__BENEFIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBenefit(double newBenefit) {
		eDynamicSet(EngineeringPackage.INCREMENT__BENEFIT, EngineeringPackage.Literals.ENDEAVOR__BENEFIT, newBenefit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Increment> getChildren() {
		return (EList<Increment>)eDynamicGet(EngineeringPackage.INCREMENT__CHILDREN, EngineeringPackage.Literals.INCREMENT__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(EngineeringPackage.INCREMENT__START, EngineeringPackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, EngineeringPackage.INCREMENT__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(EngineeringPackage.INCREMENT__START, EngineeringPackage.Literals.PERIOD__START, newStart);
		PeriodImpl.onStart(this, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(EngineeringPackage.INCREMENT__END, EngineeringPackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, EngineeringPackage.INCREMENT__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(EngineeringPackage.INCREMENT__END, EngineeringPackage.Literals.PERIOD__END, newEnd);
		PeriodImpl.onEnd(this, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(EngineeringPackage.INCREMENT__DURATION, EngineeringPackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(EngineeringPackage.INCREMENT__DURATION, EngineeringPackage.Literals.PERIOD__DURATION, newDuration);
		PeriodImpl.onDuration(this, newDuration);
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
			case EngineeringPackage.INCREMENT__ASSIGNEE:
				Engineer assignee = basicGetAssignee();
				if (assignee != null)
					msgs = ((InternalEObject)assignee).eInverseRemove(this, EngineeringPackage.ENGINEER__ASSIGNMENTS, Engineer.class, msgs);
				return basicSetAssignee((Engineer)otherEnd, msgs);
			case EngineeringPackage.INCREMENT__CAPACITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapacity()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__LINKED_OBJECTIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkedObjectives()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIssues()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__RELEASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReleases()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getIssues() {
		return getOppositeReferrers(EngineeringPackage.Literals.INCREMENT__ISSUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Release> getReleases() {
		return getOppositeReferrers(EngineeringPackage.Literals.INCREMENT__RELEASES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Capacity> getCapacity() {
		return getOppositeReferrers(EngineeringPackage.Literals.ENDEAVOR__CAPACITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Objective> getObjectives() {
		return (EList<Objective>)eDynamicGet(EngineeringPackage.INCREMENT__OBJECTIVES, EngineeringPackage.Literals.ENDEAVOR__OBJECTIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Objective> getLinkedObjectives() {
		return getOppositeReferrers(EngineeringPackage.Literals.ENDEAVOR__LINKED_OBJECTIVES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Objective> getAllObjectives() {
		EList<Objective> ret = ECollections.newBasicEList(getObjectives());
		ret.addAll(getLinkedObjectives());
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getAllIssues() {
		Collection<Issue> allIssues = new HashSet<>();
		allIssues.addAll(getIssues());
		for (Release release: getReleases()) {
			for (Issue ri: release.getAllIssues()) {
				if (ri.getIncrement() == null) {
					allIssues.add(ri);
				}
			}
		}
		return new BasicEList<>(allIssues);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.INCREMENT__START:
				return basicSetStart(null, msgs);
			case EngineeringPackage.INCREMENT__END:
				return basicSetEnd(null, msgs);
			case EngineeringPackage.INCREMENT__ALIGNS:
				return ((InternalEList<?>)getAligns()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__ASSIGNEE:
				return basicSetAssignee(null, msgs);
			case EngineeringPackage.INCREMENT__CAPACITY:
				return ((InternalEList<?>)getCapacity()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__OBJECTIVES:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__LINKED_OBJECTIVES:
				return ((InternalEList<?>)getLinkedObjectives()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.INCREMENT__START:
				return getStart();
			case EngineeringPackage.INCREMENT__END:
				return getEnd();
			case EngineeringPackage.INCREMENT__DURATION:
				return getDuration();
			case EngineeringPackage.INCREMENT__ALIGNS:
				return getAligns();
			case EngineeringPackage.INCREMENT__COMPLETION:
				return getCompletion();
			case EngineeringPackage.INCREMENT__BENEFIT:
				return getBenefit();
			case EngineeringPackage.INCREMENT__TOTAL_COST:
				return getTotalCost();
			case EngineeringPackage.INCREMENT__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case EngineeringPackage.INCREMENT__ALL_ISSUES:
				return getAllIssues();
			case EngineeringPackage.INCREMENT__CAPACITY:
				return getCapacity();
			case EngineeringPackage.INCREMENT__OBJECTIVES:
				return getObjectives();
			case EngineeringPackage.INCREMENT__LINKED_OBJECTIVES:
				return getLinkedObjectives();
			case EngineeringPackage.INCREMENT__ALL_OBJECTIVES:
				return getAllObjectives();
			case EngineeringPackage.INCREMENT__CHILDREN:
				return getChildren();
			case EngineeringPackage.INCREMENT__ISSUES:
				return getIssues();
			case EngineeringPackage.INCREMENT__RELEASES:
				return getReleases();
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
			case EngineeringPackage.INCREMENT__START:
				setStart((Temporal)newValue);
				return;
			case EngineeringPackage.INCREMENT__END:
				setEnd((Temporal)newValue);
				return;
			case EngineeringPackage.INCREMENT__DURATION:
				setDuration((Duration)newValue);
				return;
			case EngineeringPackage.INCREMENT__ALIGNS:
				getAligns().clear();
				getAligns().addAll((Collection<? extends Alignment>)newValue);
				return;
			case EngineeringPackage.INCREMENT__BENEFIT:
				setBenefit((Double)newValue);
				return;
			case EngineeringPackage.INCREMENT__ASSIGNEE:
				setAssignee((Engineer)newValue);
				return;
			case EngineeringPackage.INCREMENT__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case EngineeringPackage.INCREMENT__LINKED_OBJECTIVES:
				getLinkedObjectives().clear();
				getLinkedObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case EngineeringPackage.INCREMENT__ALL_OBJECTIVES:
				getAllObjectives().clear();
				getAllObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case EngineeringPackage.INCREMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Increment>)newValue);
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
			case EngineeringPackage.INCREMENT__START:
				setStart((Temporal)null);
				return;
			case EngineeringPackage.INCREMENT__END:
				setEnd((Temporal)null);
				return;
			case EngineeringPackage.INCREMENT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case EngineeringPackage.INCREMENT__ALIGNS:
				getAligns().clear();
				return;
			case EngineeringPackage.INCREMENT__BENEFIT:
				setBenefit(BENEFIT_EDEFAULT);
				return;
			case EngineeringPackage.INCREMENT__ASSIGNEE:
				setAssignee((Engineer)null);
				return;
			case EngineeringPackage.INCREMENT__OBJECTIVES:
				getObjectives().clear();
				return;
			case EngineeringPackage.INCREMENT__LINKED_OBJECTIVES:
				getLinkedObjectives().clear();
				return;
			case EngineeringPackage.INCREMENT__ALL_OBJECTIVES:
				getAllObjectives().clear();
				return;
			case EngineeringPackage.INCREMENT__CHILDREN:
				getChildren().clear();
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
			case EngineeringPackage.INCREMENT__START:
				return getStart() != null;
			case EngineeringPackage.INCREMENT__END:
				return getEnd() != null;
			case EngineeringPackage.INCREMENT__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case EngineeringPackage.INCREMENT__ALIGNS:
				return !getAligns().isEmpty();
			case EngineeringPackage.INCREMENT__COMPLETION:
				return getCompletion() != COMPLETION_EDEFAULT;
			case EngineeringPackage.INCREMENT__BENEFIT:
				return getBenefit() != BENEFIT_EDEFAULT;
			case EngineeringPackage.INCREMENT__TOTAL_COST:
				return getTotalCost() != TOTAL_COST_EDEFAULT;
			case EngineeringPackage.INCREMENT__ASSIGNEE:
				return basicGetAssignee() != null;
			case EngineeringPackage.INCREMENT__ALL_ISSUES:
				return !getAllIssues().isEmpty();
			case EngineeringPackage.INCREMENT__CAPACITY:
				return !getCapacity().isEmpty();
			case EngineeringPackage.INCREMENT__OBJECTIVES:
				return !getObjectives().isEmpty();
			case EngineeringPackage.INCREMENT__LINKED_OBJECTIVES:
				return !getLinkedObjectives().isEmpty();
			case EngineeringPackage.INCREMENT__ALL_OBJECTIVES:
				return !getAllObjectives().isEmpty();
			case EngineeringPackage.INCREMENT__CHILDREN:
				return !getChildren().isEmpty();
			case EngineeringPackage.INCREMENT__ISSUES:
				return !getIssues().isEmpty();
			case EngineeringPackage.INCREMENT__RELEASES:
				return !getReleases().isEmpty();
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
				case EngineeringPackage.INCREMENT__START: return EngineeringPackage.PERIOD__START;
				case EngineeringPackage.INCREMENT__END: return EngineeringPackage.PERIOD__END;
				case EngineeringPackage.INCREMENT__DURATION: return EngineeringPackage.PERIOD__DURATION;
				default: return -1;
			}
		}
		if (baseClass == Alignable.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.INCREMENT__ALIGNS: return EngineeringPackage.ALIGNABLE__ALIGNS;
				default: return -1;
			}
		}
		if (baseClass == Endeavor.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.INCREMENT__COMPLETION: return EngineeringPackage.ENDEAVOR__COMPLETION;
				case EngineeringPackage.INCREMENT__BENEFIT: return EngineeringPackage.ENDEAVOR__BENEFIT;
				case EngineeringPackage.INCREMENT__TOTAL_COST: return EngineeringPackage.ENDEAVOR__TOTAL_COST;
				case EngineeringPackage.INCREMENT__ASSIGNEE: return EngineeringPackage.ENDEAVOR__ASSIGNEE;
				case EngineeringPackage.INCREMENT__ALL_ISSUES: return EngineeringPackage.ENDEAVOR__ALL_ISSUES;
				case EngineeringPackage.INCREMENT__CAPACITY: return EngineeringPackage.ENDEAVOR__CAPACITY;
				case EngineeringPackage.INCREMENT__OBJECTIVES: return EngineeringPackage.ENDEAVOR__OBJECTIVES;
				case EngineeringPackage.INCREMENT__LINKED_OBJECTIVES: return EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES;
				case EngineeringPackage.INCREMENT__ALL_OBJECTIVES: return EngineeringPackage.ENDEAVOR__ALL_OBJECTIVES;
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
				case EngineeringPackage.PERIOD__START: return EngineeringPackage.INCREMENT__START;
				case EngineeringPackage.PERIOD__END: return EngineeringPackage.INCREMENT__END;
				case EngineeringPackage.PERIOD__DURATION: return EngineeringPackage.INCREMENT__DURATION;
				default: return -1;
			}
		}
		if (baseClass == Alignable.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.ALIGNABLE__ALIGNS: return EngineeringPackage.INCREMENT__ALIGNS;
				default: return -1;
			}
		}
		if (baseClass == Endeavor.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.ENDEAVOR__COMPLETION: return EngineeringPackage.INCREMENT__COMPLETION;
				case EngineeringPackage.ENDEAVOR__BENEFIT: return EngineeringPackage.INCREMENT__BENEFIT;
				case EngineeringPackage.ENDEAVOR__TOTAL_COST: return EngineeringPackage.INCREMENT__TOTAL_COST;
				case EngineeringPackage.ENDEAVOR__ASSIGNEE: return EngineeringPackage.INCREMENT__ASSIGNEE;
				case EngineeringPackage.ENDEAVOR__ALL_ISSUES: return EngineeringPackage.INCREMENT__ALL_ISSUES;
				case EngineeringPackage.ENDEAVOR__CAPACITY: return EngineeringPackage.INCREMENT__CAPACITY;
				case EngineeringPackage.ENDEAVOR__OBJECTIVES: return EngineeringPackage.INCREMENT__OBJECTIVES;
				case EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES: return EngineeringPackage.INCREMENT__LINKED_OBJECTIVES;
				case EngineeringPackage.ENDEAVOR__ALL_OBJECTIVES: return EngineeringPackage.INCREMENT__ALL_OBJECTIVES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	@Override
	/**
	 * @generated NOT
	 */
	public double getCompletion() {
		double remaining = 0;
		double total = 0;
		for (Issue issue: getIssues()) {
			double cc = issue.getCompletion();
			double ctc = issue.getTotalCost();
			total += ctc;
			if (Double.isFinite(cc)) {
				remaining += (1 - cc) * ctc; 
			}
		}
		for (Release release: getReleases()) {
			double cc = release.getCompletion();
			double ctc = release.getTotalCost();
			total += ctc;
			if (Double.isFinite(cc)) {
				remaining += (1 - cc) * ctc; 
			}
		}
		for (Increment child: getChildren()) {
			double cc = child.getCompletion();
			double ctc = child.getTotalCost();
			total += ctc;
			if (Double.isFinite(cc)) {
				remaining += (1 - cc) * ctc; 
			}
		}
		return total == 0 ? Double.NaN : Math.max(0, total - remaining) / total;
	}
	
	@Override
	/**
	 * @generated NOT
	 */
	public double getTotalCost() {
		double ret = 0;
		for (Issue issue: getIssues()) {
			ret += issue.getTotalCost();
		}
		for (Release release: getReleases()) {
			ret += release.getTotalCost();
		}
		for (Increment child: getChildren()) {
			ret += child.getTotalCost();
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Engineer getAssignee() {
		if (!eIsSet(EngineeringPackage.ENDEAVOR__ASSIGNEE)) {
			for (EObject ancestor = eContainer; ancestor != null; ancestor = ancestor.eContainer()) {
				if (ancestor instanceof Issue) {
					return ((Issue) ancestor).getAssignee();				
				}
				if (ancestor instanceof Engineer) {
					return (Engineer) ancestor;
				}
				if (ancestor instanceof EngineeredElement) {
					EList<Engineer> owners = ((EngineeredElement) ancestor).getOwners();
					if (!owners.isEmpty()) {
						return owners.get(0);
					}
				}
			}			
		}
		
		return (Engineer)eDynamicGet(EngineeringPackage.INCREMENT__ASSIGNEE, EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetAssignee() {
		return (Engineer)eDynamicGet(EngineeringPackage.INCREMENT__ASSIGNEE, EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignee(Engineer newAssignee, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAssignee, EngineeringPackage.INCREMENT__ASSIGNEE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(Engineer newAssignee) {
		eDynamicSet(EngineeringPackage.INCREMENT__ASSIGNEE, EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE, newAssignee);
	}

} //IncrementImpl
