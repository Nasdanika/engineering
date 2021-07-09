/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
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
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Objective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineered Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getAligns <em>Aligns</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getAllIssues <em>All Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getLinkedObjectives <em>Linked Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getAllObjectives <em>All Objectives</em>}</li>
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
	public EList<Objective> getObjectives() {
		return (EList<Objective>)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__OBJECTIVES, EngineeringPackage.Literals.ENDEAVOR__OBJECTIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Objective> getLinkedObjectives() {
		return getReferrers(EngineeringPackage.Literals.OBJECTIVE__ENDEAVOR);
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Alignment> getAligns() {
		return (EList<Alignment>)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__ALIGNS, EngineeringPackage.Literals.ALIGNABLE__ALIGNS, true, true);
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__LINKED_OBJECTIVES:
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALIGNS:
				return ((InternalEList<?>)getAligns()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE:
				return basicSetAssignee(null, msgs);
			case EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY:
				return ((InternalEList<?>)getCapacity()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEERED_CAPABILITY__OBJECTIVES:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEERED_CAPABILITY__LINKED_OBJECTIVES:
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALIGNS:
				return getAligns();
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY:
				return getCapacity();
			case EngineeringPackage.ENGINEERED_CAPABILITY__OBJECTIVES:
				return getObjectives();
			case EngineeringPackage.ENGINEERED_CAPABILITY__LINKED_OBJECTIVES:
				return getLinkedObjectives();
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALL_OBJECTIVES:
				return getAllObjectives();
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALIGNS:
				getAligns().clear();
				getAligns().addAll((Collection<? extends Alignment>)newValue);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT:
				setBenefit((Double)newValue);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE:
				setAssignee((Engineer)newValue);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__LINKED_OBJECTIVES:
				getLinkedObjectives().clear();
				getLinkedObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALL_OBJECTIVES:
				getAllObjectives().clear();
				getAllObjectives().addAll((Collection<? extends Objective>)newValue);
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALIGNS:
				getAligns().clear();
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT:
				setBenefit(BENEFIT_EDEFAULT);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE:
				setAssignee((Engineer)null);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__OBJECTIVES:
				getObjectives().clear();
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__LINKED_OBJECTIVES:
				getLinkedObjectives().clear();
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALL_OBJECTIVES:
				getAllObjectives().clear();
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALIGNS:
				return !getAligns().isEmpty();
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY:
				return !getCapacity().isEmpty();
			case EngineeringPackage.ENGINEERED_CAPABILITY__OBJECTIVES:
				return !getObjectives().isEmpty();
			case EngineeringPackage.ENGINEERED_CAPABILITY__LINKED_OBJECTIVES:
				return !getLinkedObjectives().isEmpty();
			case EngineeringPackage.ENGINEERED_CAPABILITY__ALL_OBJECTIVES:
				return !getAllObjectives().isEmpty();
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
		if (baseClass == Alignable.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.ENGINEERED_CAPABILITY__ALIGNS: return EngineeringPackage.ALIGNABLE__ALIGNS;
				default: return -1;
			}
		}
		if (baseClass == Endeavor.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.ENGINEERED_CAPABILITY__COMPLETION: return EngineeringPackage.ENDEAVOR__COMPLETION;
				case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT: return EngineeringPackage.ENDEAVOR__BENEFIT;
				case EngineeringPackage.ENGINEERED_CAPABILITY__TOTAL_COST: return EngineeringPackage.ENDEAVOR__TOTAL_COST;
				case EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE: return EngineeringPackage.ENDEAVOR__ASSIGNEE;
				case EngineeringPackage.ENGINEERED_CAPABILITY__ALL_ISSUES: return EngineeringPackage.ENDEAVOR__ALL_ISSUES;
				case EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY: return EngineeringPackage.ENDEAVOR__CAPACITY;
				case EngineeringPackage.ENGINEERED_CAPABILITY__OBJECTIVES: return EngineeringPackage.ENDEAVOR__OBJECTIVES;
				case EngineeringPackage.ENGINEERED_CAPABILITY__LINKED_OBJECTIVES: return EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES;
				case EngineeringPackage.ENGINEERED_CAPABILITY__ALL_OBJECTIVES: return EngineeringPackage.ENDEAVOR__ALL_OBJECTIVES;
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
		if (baseClass == Alignable.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.ALIGNABLE__ALIGNS: return EngineeringPackage.ENGINEERED_CAPABILITY__ALIGNS;
				default: return -1;
			}
		}
		if (baseClass == Endeavor.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.ENDEAVOR__COMPLETION: return EngineeringPackage.ENGINEERED_CAPABILITY__COMPLETION;
				case EngineeringPackage.ENDEAVOR__BENEFIT: return EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT;
				case EngineeringPackage.ENDEAVOR__TOTAL_COST: return EngineeringPackage.ENGINEERED_CAPABILITY__TOTAL_COST;
				case EngineeringPackage.ENDEAVOR__ASSIGNEE: return EngineeringPackage.ENGINEERED_CAPABILITY__ASSIGNEE;
				case EngineeringPackage.ENDEAVOR__ALL_ISSUES: return EngineeringPackage.ENGINEERED_CAPABILITY__ALL_ISSUES;
				case EngineeringPackage.ENDEAVOR__CAPACITY: return EngineeringPackage.ENGINEERED_CAPABILITY__CAPACITY;
				case EngineeringPackage.ENDEAVOR__OBJECTIVES: return EngineeringPackage.ENGINEERED_CAPABILITY__OBJECTIVES;
				case EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES: return EngineeringPackage.ENGINEERED_CAPABILITY__LINKED_OBJECTIVES;
				case EngineeringPackage.ENDEAVOR__ALL_OBJECTIVES: return EngineeringPackage.ENGINEERED_CAPABILITY__ALL_OBJECTIVES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EngineeredCapabilityImpl
