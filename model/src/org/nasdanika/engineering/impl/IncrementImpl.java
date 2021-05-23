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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
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
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getAllIssues <em>All Issues</em>}</li>
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
		return (Date)eDynamicGet(EngineeringPackage.INCREMENT__START, EngineeringPackage.Literals.INCREMENT__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Date newStart) {
		eDynamicSet(EngineeringPackage.INCREMENT__START, EngineeringPackage.Literals.INCREMENT__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEnd() {
		return (Date)eDynamicGet(EngineeringPackage.INCREMENT__END, EngineeringPackage.Literals.INCREMENT__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Date newEnd) {
		eDynamicSet(EngineeringPackage.INCREMENT__END, EngineeringPackage.Literals.INCREMENT__END, newEnd);
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
			case EngineeringPackage.INCREMENT__ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIssues()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__RELEASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReleases()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__CAPACITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapacity()).basicAdd(otherEnd, msgs);
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capacity> getCapacity() {
		return (EList<Capacity>)eDynamicGet(EngineeringPackage.INCREMENT__CAPACITY, EngineeringPackage.Literals.INCREMENT__CAPACITY, true, true);
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
			for (Issue ri: release.getIssues()) {
				if (ri.getIncrement() == null) {
					allIssues.add(ri);
				}
			}
			for (Feature feature: release.getFeatures()) {
				for (Issue fi: feature.getIssues()) {
					if (fi.getIncrement() == null) {
						allIssues.add(fi);
					}
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
			case EngineeringPackage.INCREMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.INCREMENT__CAPACITY:
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
			case EngineeringPackage.INCREMENT__COMPLETION:
				return getCompletion();
			case EngineeringPackage.INCREMENT__BENEFIT:
				return getBenefit();
			case EngineeringPackage.INCREMENT__TOTAL_COST:
				return getTotalCost();
			case EngineeringPackage.INCREMENT__CHILDREN:
				return getChildren();
			case EngineeringPackage.INCREMENT__START:
				return getStart();
			case EngineeringPackage.INCREMENT__END:
				return getEnd();
			case EngineeringPackage.INCREMENT__ISSUES:
				return getIssues();
			case EngineeringPackage.INCREMENT__RELEASES:
				return getReleases();
			case EngineeringPackage.INCREMENT__CAPACITY:
				return getCapacity();
			case EngineeringPackage.INCREMENT__ALL_ISSUES:
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
			case EngineeringPackage.INCREMENT__BENEFIT:
				setBenefit((Double)newValue);
				return;
			case EngineeringPackage.INCREMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Increment>)newValue);
				return;
			case EngineeringPackage.INCREMENT__START:
				setStart((Date)newValue);
				return;
			case EngineeringPackage.INCREMENT__END:
				setEnd((Date)newValue);
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
			case EngineeringPackage.INCREMENT__CHILDREN:
				getChildren().clear();
				return;
			case EngineeringPackage.INCREMENT__START:
				setStart(START_EDEFAULT);
				return;
			case EngineeringPackage.INCREMENT__END:
				setEnd(END_EDEFAULT);
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
			case EngineeringPackage.INCREMENT__CHILDREN:
				return !getChildren().isEmpty();
			case EngineeringPackage.INCREMENT__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case EngineeringPackage.INCREMENT__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case EngineeringPackage.INCREMENT__ISSUES:
				return !getIssues().isEmpty();
			case EngineeringPackage.INCREMENT__RELEASES:
				return !getReleases().isEmpty();
			case EngineeringPackage.INCREMENT__CAPACITY:
				return !getCapacity().isEmpty();
			case EngineeringPackage.INCREMENT__ALL_ISSUES:
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
		if (baseClass == Endeavor.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.INCREMENT__COMPLETION: return EngineeringPackage.ENDEAVOR__COMPLETION;
				case EngineeringPackage.INCREMENT__BENEFIT: return EngineeringPackage.ENDEAVOR__BENEFIT;
				case EngineeringPackage.INCREMENT__TOTAL_COST: return EngineeringPackage.ENDEAVOR__TOTAL_COST;
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

} //IncrementImpl
