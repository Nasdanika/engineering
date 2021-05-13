/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Endeavor;
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
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getRemainingEffort <em>Remaining Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IncrementImpl#getEnd <em>End</em>}</li>
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
	 * The default value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFORT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

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
	 * The default value of the '{@link #getRemainingEffort() <em>Remaining Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingEffort()
	 * @generated
	 * @ordered
	 */
	protected static final double REMAINING_EFFORT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getRemainingCost() <em>Remaining Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCost()
	 * @generated
	 * @ordered
	 */
	protected static final double REMAINING_COST_EDEFAULT = 0.0;

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
	public double getCompletion() {
		return (Double)eDynamicGet(EngineeringPackage.INCREMENT__COMPLETION, EngineeringPackage.Literals.ENDEAVOR__COMPLETION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEffort() {
		return (Double)eDynamicGet(EngineeringPackage.INCREMENT__EFFORT, EngineeringPackage.Literals.ENDEAVOR__EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffort(double newEffort) {
		eDynamicSet(EngineeringPackage.INCREMENT__EFFORT, EngineeringPackage.Literals.ENDEAVOR__EFFORT, newEffort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCost() {
		return (Double)eDynamicGet(EngineeringPackage.INCREMENT__COST, EngineeringPackage.Literals.ENDEAVOR__COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(double newCost) {
		eDynamicSet(EngineeringPackage.INCREMENT__COST, EngineeringPackage.Literals.ENDEAVOR__COST, newCost);
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
	@Override
	public double getRemainingEffort() {
		return (Double)eDynamicGet(EngineeringPackage.INCREMENT__REMAINING_EFFORT, EngineeringPackage.Literals.ENDEAVOR__REMAINING_EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRemainingCost() {
		return (Double)eDynamicGet(EngineeringPackage.INCREMENT__REMAINING_COST, EngineeringPackage.Literals.ENDEAVOR__REMAINING_COST, true, true);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
			case EngineeringPackage.INCREMENT__EFFORT:
				return getEffort();
			case EngineeringPackage.INCREMENT__COST:
				return getCost();
			case EngineeringPackage.INCREMENT__BENEFIT:
				return getBenefit();
			case EngineeringPackage.INCREMENT__REMAINING_EFFORT:
				return getRemainingEffort();
			case EngineeringPackage.INCREMENT__REMAINING_COST:
				return getRemainingCost();
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
			case EngineeringPackage.INCREMENT__EFFORT:
				setEffort((Double)newValue);
				return;
			case EngineeringPackage.INCREMENT__COST:
				setCost((Double)newValue);
				return;
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
			case EngineeringPackage.INCREMENT__EFFORT:
				setEffort(EFFORT_EDEFAULT);
				return;
			case EngineeringPackage.INCREMENT__COST:
				setCost(COST_EDEFAULT);
				return;
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
			case EngineeringPackage.INCREMENT__EFFORT:
				return getEffort() != EFFORT_EDEFAULT;
			case EngineeringPackage.INCREMENT__COST:
				return getCost() != COST_EDEFAULT;
			case EngineeringPackage.INCREMENT__BENEFIT:
				return getBenefit() != BENEFIT_EDEFAULT;
			case EngineeringPackage.INCREMENT__REMAINING_EFFORT:
				return getRemainingEffort() != REMAINING_EFFORT_EDEFAULT;
			case EngineeringPackage.INCREMENT__REMAINING_COST:
				return getRemainingCost() != REMAINING_COST_EDEFAULT;
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
				case EngineeringPackage.INCREMENT__EFFORT: return EngineeringPackage.ENDEAVOR__EFFORT;
				case EngineeringPackage.INCREMENT__COST: return EngineeringPackage.ENDEAVOR__COST;
				case EngineeringPackage.INCREMENT__BENEFIT: return EngineeringPackage.ENDEAVOR__BENEFIT;
				case EngineeringPackage.INCREMENT__REMAINING_EFFORT: return EngineeringPackage.ENDEAVOR__REMAINING_EFFORT;
				case EngineeringPackage.INCREMENT__REMAINING_COST: return EngineeringPackage.ENDEAVOR__REMAINING_COST;
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
				case EngineeringPackage.ENDEAVOR__EFFORT: return EngineeringPackage.INCREMENT__EFFORT;
				case EngineeringPackage.ENDEAVOR__COST: return EngineeringPackage.INCREMENT__COST;
				case EngineeringPackage.ENDEAVOR__BENEFIT: return EngineeringPackage.INCREMENT__BENEFIT;
				case EngineeringPackage.ENDEAVOR__REMAINING_EFFORT: return EngineeringPackage.INCREMENT__REMAINING_EFFORT;
				case EngineeringPackage.ENDEAVOR__REMAINING_COST: return EngineeringPackage.INCREMENT__REMAINING_COST;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IncrementImpl
