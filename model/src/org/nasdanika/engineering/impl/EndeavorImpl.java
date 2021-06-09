/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import java.util.Date;

import org.apache.pdfbox.pdmodel.PDPageTree;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Objective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endeavor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getAllIssues <em>All Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getLinkedObjectives <em>Linked Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EndeavorImpl#getAllObjectives <em>All Objectives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndeavorImpl extends MinimalEObjectImpl.Container implements Endeavor {
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
	protected int eStaticFeatureCount() {
		return 0;
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
	public NotificationChain basicSetAssignee(Engineer newAssignee, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAssignee, EngineeringPackage.ENDEAVOR__ASSIGNEE, msgs);
		return msgs;
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
	@Override
	public Date getStart() {
		return (Date)eDynamicGet(EngineeringPackage.ENDEAVOR__START, EngineeringPackage.Literals.ENDEAVOR__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Date newStart) {
		eDynamicSet(EngineeringPackage.ENDEAVOR__START, EngineeringPackage.Literals.ENDEAVOR__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEnd() {
		return (Date)eDynamicGet(EngineeringPackage.ENDEAVOR__END, EngineeringPackage.Literals.ENDEAVOR__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Date newEnd) {
		eDynamicSet(EngineeringPackage.ENDEAVOR__END, EngineeringPackage.Literals.ENDEAVOR__END, newEnd);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ENDEAVOR__ASSIGNEE:
				Engineer assignee = basicGetAssignee();
				if (assignee != null)
					msgs = ((InternalEObject)assignee).eInverseRemove(this, EngineeringPackage.ENGINEER__ASSIGNMENTS, Engineer.class, msgs);
				return basicSetAssignee((Engineer)otherEnd, msgs);
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
			case EngineeringPackage.ENDEAVOR__ASSIGNEE:
				return basicSetAssignee(null, msgs);
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
			case EngineeringPackage.ENDEAVOR__START:
				return getStart();
			case EngineeringPackage.ENDEAVOR__END:
				return getEnd();
			case EngineeringPackage.ENDEAVOR__CAPACITY:
				return getCapacity();
			case EngineeringPackage.ENDEAVOR__OBJECTIVES:
				return getObjectives();
			case EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES:
				return getLinkedObjectives();
			case EngineeringPackage.ENDEAVOR__ALL_OBJECTIVES:
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
			case EngineeringPackage.ENDEAVOR__BENEFIT:
				setBenefit((Double)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__ASSIGNEE:
				setAssignee((Engineer)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__START:
				setStart((Date)newValue);
				return;
			case EngineeringPackage.ENDEAVOR__END:
				setEnd((Date)newValue);
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
			case EngineeringPackage.ENDEAVOR__BENEFIT:
				setBenefit(BENEFIT_EDEFAULT);
				return;
			case EngineeringPackage.ENDEAVOR__ASSIGNEE:
				setAssignee((Engineer)null);
				return;
			case EngineeringPackage.ENDEAVOR__START:
				setStart(START_EDEFAULT);
				return;
			case EngineeringPackage.ENDEAVOR__END:
				setEnd(END_EDEFAULT);
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
			case EngineeringPackage.ENDEAVOR__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case EngineeringPackage.ENDEAVOR__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case EngineeringPackage.ENDEAVOR__CAPACITY:
				return !getCapacity().isEmpty();
			case EngineeringPackage.ENDEAVOR__OBJECTIVES:
				return !getObjectives().isEmpty();
			case EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES:
				return !getLinkedObjectives().isEmpty();
			case EngineeringPackage.ENDEAVOR__ALL_OBJECTIVES:
				return !getAllObjectives().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EndeavorImpl
