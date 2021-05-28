/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Release;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Increment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getAllIssues <em>All Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getReleases <em>Releases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncrementImpl extends NamedElementImpl implements Increment {
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
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

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
	public Date getStart() {
		return (Date)eDynamicGet(EngineeringPackage.INCREMENT__START, EngineeringPackage.Literals.ENDEAVOR__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Date newStart) {
		eDynamicSet(EngineeringPackage.INCREMENT__START, EngineeringPackage.Literals.ENDEAVOR__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEnd() {
		return (Date)eDynamicGet(EngineeringPackage.INCREMENT__END, EngineeringPackage.Literals.ENDEAVOR__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Date newEnd) {
		eDynamicSet(EngineeringPackage.INCREMENT__END, EngineeringPackage.Literals.ENDEAVOR__END, newEnd);
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
		return getReferrers(EngineeringPackage.Literals.ISSUE__INCREMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Release> getReleases() {
		return getReferrers(EngineeringPackage.Literals.RELEASE__INCREMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Capacity> getCapacity() {
		return getReferrers(EngineeringPackage.Literals.CAPACITY__ENDEAVOR);
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
			case EngineeringPackage.INCREMENT__ASSIGNEE:
				return basicSetAssignee(null, msgs);
			case EngineeringPackage.INCREMENT__CAPACITY:
				return ((InternalEList<?>)getCapacity()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.INCREMENT__START:
				return getStart();
			case EngineeringPackage.INCREMENT__END:
				return getEnd();
			case EngineeringPackage.INCREMENT__CAPACITY:
				return getCapacity();
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
			case EngineeringPackage.INCREMENT__BENEFIT:
				setBenefit((Double)newValue);
				return;
			case EngineeringPackage.INCREMENT__ASSIGNEE:
				setAssignee((Engineer)newValue);
				return;
			case EngineeringPackage.INCREMENT__START:
				setStart((Date)newValue);
				return;
			case EngineeringPackage.INCREMENT__END:
				setEnd((Date)newValue);
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
			case EngineeringPackage.INCREMENT__BENEFIT:
				setBenefit(BENEFIT_EDEFAULT);
				return;
			case EngineeringPackage.INCREMENT__ASSIGNEE:
				setAssignee((Engineer)null);
				return;
			case EngineeringPackage.INCREMENT__START:
				setStart(START_EDEFAULT);
				return;
			case EngineeringPackage.INCREMENT__END:
				setEnd(END_EDEFAULT);
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
			case EngineeringPackage.INCREMENT__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case EngineeringPackage.INCREMENT__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case EngineeringPackage.INCREMENT__CAPACITY:
				return !getCapacity().isEmpty();
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
		if (baseClass == Endeavor.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.INCREMENT__COMPLETION: return EngineeringPackage.ENDEAVOR__COMPLETION;
				case EngineeringPackage.INCREMENT__BENEFIT: return EngineeringPackage.ENDEAVOR__BENEFIT;
				case EngineeringPackage.INCREMENT__TOTAL_COST: return EngineeringPackage.ENDEAVOR__TOTAL_COST;
				case EngineeringPackage.INCREMENT__ASSIGNEE: return EngineeringPackage.ENDEAVOR__ASSIGNEE;
				case EngineeringPackage.INCREMENT__ALL_ISSUES: return EngineeringPackage.ENDEAVOR__ALL_ISSUES;
				case EngineeringPackage.INCREMENT__START: return EngineeringPackage.ENDEAVOR__START;
				case EngineeringPackage.INCREMENT__END: return EngineeringPackage.ENDEAVOR__END;
				case EngineeringPackage.INCREMENT__CAPACITY: return EngineeringPackage.ENDEAVOR__CAPACITY;
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
		if (baseClass == Endeavor.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.ENDEAVOR__COMPLETION: return EngineeringPackage.INCREMENT__COMPLETION;
				case EngineeringPackage.ENDEAVOR__BENEFIT: return EngineeringPackage.INCREMENT__BENEFIT;
				case EngineeringPackage.ENDEAVOR__TOTAL_COST: return EngineeringPackage.INCREMENT__TOTAL_COST;
				case EngineeringPackage.ENDEAVOR__ASSIGNEE: return EngineeringPackage.INCREMENT__ASSIGNEE;
				case EngineeringPackage.ENDEAVOR__ALL_ISSUES: return EngineeringPackage.INCREMENT__ALL_ISSUES;
				case EngineeringPackage.ENDEAVOR__START: return EngineeringPackage.INCREMENT__START;
				case EngineeringPackage.ENDEAVOR__END: return EngineeringPackage.INCREMENT__END;
				case EngineeringPackage.ENDEAVOR__CAPACITY: return EngineeringPackage.INCREMENT__CAPACITY;
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
