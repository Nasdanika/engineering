/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.KeyResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.KeyResultImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.KeyResultImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.KeyResultImpl#getInitiatives <em>Initiatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyResultImpl extends AimImpl implements KeyResult {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 1.0;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.KEY_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return (Double)eDynamicGet(EngineeringPackage.KEY_RESULT__WEIGHT, EngineeringPackage.Literals.KEY_RESULT__WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		eDynamicSet(EngineeringPackage.KEY_RESULT__WEIGHT, EngineeringPackage.Literals.KEY_RESULT__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
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
			if (aContainer instanceof KeyResult) {
				double aWeight = alignment.getWeight();
				weightTotal += aWeight;
				completionTotal += aWeight * ((KeyResult) aContainer).getCompletion();
			}
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
	public EList<Issue> getInitiatives() {
		return (EList<Issue>)eDynamicGet(EngineeringPackage.KEY_RESULT__INITIATIVES, EngineeringPackage.Literals.KEY_RESULT__INITIATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.KEY_RESULT__INITIATIVES:
				return ((InternalEList<?>)getInitiatives()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.KEY_RESULT__WEIGHT:
				return getWeight();
			case EngineeringPackage.KEY_RESULT__COMPLETION:
				return getCompletion();
			case EngineeringPackage.KEY_RESULT__INITIATIVES:
				return getInitiatives();
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
			case EngineeringPackage.KEY_RESULT__WEIGHT:
				setWeight((Double)newValue);
				return;
			case EngineeringPackage.KEY_RESULT__INITIATIVES:
				getInitiatives().clear();
				getInitiatives().addAll((Collection<? extends Issue>)newValue);
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
			case EngineeringPackage.KEY_RESULT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case EngineeringPackage.KEY_RESULT__INITIATIVES:
				getInitiatives().clear();
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
			case EngineeringPackage.KEY_RESULT__WEIGHT:
				return getWeight() != WEIGHT_EDEFAULT;
			case EngineeringPackage.KEY_RESULT__COMPLETION:
				return getCompletion() != COMPLETION_EDEFAULT;
			case EngineeringPackage.KEY_RESULT__INITIATIVES:
				return !getInitiatives().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KeyResultImpl
