/**
 */
package org.nasdanika.engineering.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineered Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getAllIssues <em>All Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineeredCapabilityImpl extends CapabilityImpl implements EngineeredCapability {
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
	protected EngineeredCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ENGINEERED_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCompletion() {
		return (Double)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__COMPLETION, EngineeringPackage.Literals.ENDEAVOR__COMPLETION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBenefit() {
		return (Double)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT, EngineeringPackage.Literals.ENDEAVOR__BENEFIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBenefit(double newBenefit) {
		eDynamicSet(EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT, EngineeringPackage.Literals.ENDEAVOR__BENEFIT, newBenefit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalCost() {
		return (Double)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__TOTAL_COST, EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Engineer getAssignee() {
		if (!eIsSet(EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE)) {
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
		
		return (Engineer)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE, EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE, true, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetAssignee() {
		return (Engineer)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE, EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignee(Engineer newAssignee, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAssignee, EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(Engineer newAssignee) {
		eDynamicSet(EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE, EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getAllIssues() {
		return (EList<Issue>)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__ALL_ISSUES, EngineeringPackage.Literals.ENDEAVOR__ALL_ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStart() {
		return (Date)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__START, EngineeringPackage.Literals.ENDEAVOR__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Date newStart) {
		eDynamicSet(EngineeringPackage.ENGINEERED_CAPABILITY__START, EngineeringPackage.Literals.ENDEAVOR__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEnd() {
		return (Date)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__END, EngineeringPackage.Literals.ENDEAVOR__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Date newEnd) {
		eDynamicSet(EngineeringPackage.ENGINEERED_CAPABILITY__END, EngineeringPackage.Literals.ENDEAVOR__END, newEnd);
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE:
				Engineer assignee = basicGetAssignee();
				if (assignee != null)
					msgs = ((InternalEObject)assignee).eInverseRemove(this, EngineeringPackage.ENGINEER__ASSIGNMENTS, Engineer.class, msgs);
				return basicSetAssignee((Engineer)otherEnd, msgs);
			case EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapacity()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE:
				return basicSetAssignee(null, msgs);
			case EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY:
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__COMPLETION:
				return getCompletion();
			case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT:
				return getBenefit();
			case EngineeringPackage.ENGINEERED_CAPABILITY__TOTAL_COST:
				return getTotalCost();
			case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALL_ISSUES:
				return getAllIssues();
			case EngineeringPackage.ENGINEERED_CAPABILITY__START:
				return getStart();
			case EngineeringPackage.ENGINEERED_CAPABILITY__END:
				return getEnd();
			case EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY:
				return getCapacity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT:
				setBenefit((Double)newValue);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE:
				setAssignee((Engineer)newValue);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__START:
				setStart((Date)newValue);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__END:
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT:
				setBenefit(BENEFIT_EDEFAULT);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE:
				setAssignee((Engineer)null);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__START:
				setStart(START_EDEFAULT);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__END:
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__COMPLETION:
				return getCompletion() != COMPLETION_EDEFAULT;
			case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT:
				return getBenefit() != BENEFIT_EDEFAULT;
			case EngineeringPackage.ENGINEERED_CAPABILITY__TOTAL_COST:
				return getTotalCost() != TOTAL_COST_EDEFAULT;
			case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE:
				return basicGetAssignee() != null;
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALL_ISSUES:
				return !getAllIssues().isEmpty();
			case EngineeringPackage.ENGINEERED_CAPABILITY__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case EngineeringPackage.ENGINEERED_CAPABILITY__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY:
				return !getCapacity().isEmpty();
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
				case EngineeringPackage.ENGINEERED_CAPABILITY__COMPLETION: return EngineeringPackage.ENDEAVOR__COMPLETION;
				case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT: return EngineeringPackage.ENDEAVOR__BENEFIT;
				case EngineeringPackage.ENGINEERED_CAPABILITY__TOTAL_COST: return EngineeringPackage.ENDEAVOR__TOTAL_COST;
				case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE: return EngineeringPackage.ENDEAVOR__ASSIGNEE;
				case EngineeringPackage.ENGINEERED_CAPABILITY__ALL_ISSUES: return EngineeringPackage.ENDEAVOR__ALL_ISSUES;
				case EngineeringPackage.ENGINEERED_CAPABILITY__START: return EngineeringPackage.ENDEAVOR__START;
				case EngineeringPackage.ENGINEERED_CAPABILITY__END: return EngineeringPackage.ENDEAVOR__END;
				case EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY: return EngineeringPackage.ENDEAVOR__CAPACITY;
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
				case EngineeringPackage.ENDEAVOR__COMPLETION: return EngineeringPackage.ENGINEERED_CAPABILITY__COMPLETION;
				case EngineeringPackage.ENDEAVOR__BENEFIT: return EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT;
				case EngineeringPackage.ENDEAVOR__TOTAL_COST: return EngineeringPackage.ENGINEERED_CAPABILITY__TOTAL_COST;
				case EngineeringPackage.ENDEAVOR__ASSIGNEE: return EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE;
				case EngineeringPackage.ENDEAVOR__ALL_ISSUES: return EngineeringPackage.ENGINEERED_CAPABILITY__ALL_ISSUES;
				case EngineeringPackage.ENDEAVOR__START: return EngineeringPackage.ENGINEERED_CAPABILITY__START;
				case EngineeringPackage.ENDEAVOR__END: return EngineeringPackage.ENGINEERED_CAPABILITY__END;
				case EngineeringPackage.ENDEAVOR__CAPACITY: return EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EngineeredCapabilityImpl
