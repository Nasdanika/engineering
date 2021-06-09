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
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.engineering.Objective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ObjectiveImpl#getEndeavor <em>Endeavor</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ObjectiveImpl#getKeyResults <em>Key Results</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ObjectiveImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ObjectiveImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ObjectiveImpl#getLinkedObjectives <em>Linked Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ObjectiveImpl#getSubObjectives <em>Sub Objectives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveImpl extends KeyResultImpl implements Objective {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Endeavor getEndeavor() {
		return (Endeavor)eDynamicGet(EngineeringPackage.OBJECTIVE__ENDEAVOR, EngineeringPackage.Literals.OBJECTIVE__ENDEAVOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endeavor basicGetEndeavor() {
		return (Endeavor)eDynamicGet(EngineeringPackage.OBJECTIVE__ENDEAVOR, EngineeringPackage.Literals.OBJECTIVE__ENDEAVOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndeavor(Endeavor newEndeavor, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEndeavor, EngineeringPackage.OBJECTIVE__ENDEAVOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndeavor(Endeavor newEndeavor) {
		eDynamicSet(EngineeringPackage.OBJECTIVE__ENDEAVOR, EngineeringPackage.Literals.OBJECTIVE__ENDEAVOR, newEndeavor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyResult> getKeyResults() {
		return (EList<KeyResult>)eDynamicGet(EngineeringPackage.OBJECTIVE__KEY_RESULTS, EngineeringPackage.Literals.OBJECTIVE__KEY_RESULTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Objective> getChildren() {
		return (EList<Objective>)eDynamicGet(EngineeringPackage.OBJECTIVE__CHILDREN, EngineeringPackage.Literals.OBJECTIVE__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objective getParent() {
		return (Objective)eDynamicGet(EngineeringPackage.OBJECTIVE__PARENT, EngineeringPackage.Literals.OBJECTIVE__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective basicGetParent() {
		return (Objective)eDynamicGet(EngineeringPackage.OBJECTIVE__PARENT, EngineeringPackage.Literals.OBJECTIVE__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Objective newParent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newParent, EngineeringPackage.OBJECTIVE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Objective newParent) {
		eDynamicSet(EngineeringPackage.OBJECTIVE__PARENT, EngineeringPackage.Literals.OBJECTIVE__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Objective> getLinkedObjectives() {
		return getReferrers(EngineeringPackage.Literals.OBJECTIVE__PARENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Objective> getSubObjectives() {
		EList<Objective> ret = ECollections.newBasicEList(getChildren());
		ret.addAll(getLinkedObjectives());
		return ret;
	}
	
	@Override
	public double getCompletion() {
		double weightTotal = 0;
		double completionTotal = 0;
		for (Alignment alignment: getAlignments()) {
			EObject aContainer = alignment.eContainer();
			if (aContainer instanceof Endeavor) {
				double aWeight = alignment.getWeight();
				weightTotal += aWeight;
				completionTotal += aWeight * ((Endeavor) aContainer).getCompletion();
			}
		}
		for (KeyResult keyResult: getKeyResults()) {
			double krWeight = keyResult.getWeight();
			weightTotal += krWeight;
			completionTotal += krWeight * keyResult.getCompletion();
		}
		for (Objective subObjective: getSubObjectives()) {
			double soWeight = subObjective.getWeight();
			weightTotal += soWeight;
			completionTotal += soWeight * subObjective.getCompletion();
		}		
		
		return weightTotal == 0 ? 0 : completionTotal / weightTotal;
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
			case EngineeringPackage.OBJECTIVE__ENDEAVOR:
				Endeavor endeavor = basicGetEndeavor();
				if (endeavor != null)
					msgs = ((InternalEObject)endeavor).eInverseRemove(this, EngineeringPackage.ENDEAVOR__LINKED_OBJECTIVES, Endeavor.class, msgs);
				return basicSetEndeavor((Endeavor)otherEnd, msgs);
			case EngineeringPackage.OBJECTIVE__PARENT:
				Objective parent = basicGetParent();
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, EngineeringPackage.OBJECTIVE__LINKED_OBJECTIVES, Objective.class, msgs);
				return basicSetParent((Objective)otherEnd, msgs);
			case EngineeringPackage.OBJECTIVE__LINKED_OBJECTIVES:
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
			case EngineeringPackage.OBJECTIVE__ENDEAVOR:
				return basicSetEndeavor(null, msgs);
			case EngineeringPackage.OBJECTIVE__KEY_RESULTS:
				return ((InternalEList<?>)getKeyResults()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.OBJECTIVE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.OBJECTIVE__PARENT:
				return basicSetParent(null, msgs);
			case EngineeringPackage.OBJECTIVE__LINKED_OBJECTIVES:
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
			case EngineeringPackage.OBJECTIVE__ENDEAVOR:
				if (resolve) return getEndeavor();
				return basicGetEndeavor();
			case EngineeringPackage.OBJECTIVE__KEY_RESULTS:
				return getKeyResults();
			case EngineeringPackage.OBJECTIVE__CHILDREN:
				return getChildren();
			case EngineeringPackage.OBJECTIVE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case EngineeringPackage.OBJECTIVE__LINKED_OBJECTIVES:
				return getLinkedObjectives();
			case EngineeringPackage.OBJECTIVE__SUB_OBJECTIVES:
				return getSubObjectives();
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
			case EngineeringPackage.OBJECTIVE__ENDEAVOR:
				setEndeavor((Endeavor)newValue);
				return;
			case EngineeringPackage.OBJECTIVE__KEY_RESULTS:
				getKeyResults().clear();
				getKeyResults().addAll((Collection<? extends KeyResult>)newValue);
				return;
			case EngineeringPackage.OBJECTIVE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Objective>)newValue);
				return;
			case EngineeringPackage.OBJECTIVE__PARENT:
				setParent((Objective)newValue);
				return;
			case EngineeringPackage.OBJECTIVE__LINKED_OBJECTIVES:
				getLinkedObjectives().clear();
				getLinkedObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case EngineeringPackage.OBJECTIVE__SUB_OBJECTIVES:
				getSubObjectives().clear();
				getSubObjectives().addAll((Collection<? extends Objective>)newValue);
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
			case EngineeringPackage.OBJECTIVE__ENDEAVOR:
				setEndeavor((Endeavor)null);
				return;
			case EngineeringPackage.OBJECTIVE__KEY_RESULTS:
				getKeyResults().clear();
				return;
			case EngineeringPackage.OBJECTIVE__CHILDREN:
				getChildren().clear();
				return;
			case EngineeringPackage.OBJECTIVE__PARENT:
				setParent((Objective)null);
				return;
			case EngineeringPackage.OBJECTIVE__LINKED_OBJECTIVES:
				getLinkedObjectives().clear();
				return;
			case EngineeringPackage.OBJECTIVE__SUB_OBJECTIVES:
				getSubObjectives().clear();
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
			case EngineeringPackage.OBJECTIVE__ENDEAVOR:
				return basicGetEndeavor() != null;
			case EngineeringPackage.OBJECTIVE__KEY_RESULTS:
				return !getKeyResults().isEmpty();
			case EngineeringPackage.OBJECTIVE__CHILDREN:
				return !getChildren().isEmpty();
			case EngineeringPackage.OBJECTIVE__PARENT:
				return basicGetParent() != null;
			case EngineeringPackage.OBJECTIVE__LINKED_OBJECTIVES:
				return !getLinkedObjectives().isEmpty();
			case EngineeringPackage.OBJECTIVE__SUB_OBJECTIVES:
				return !getSubObjectives().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectiveImpl
