/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineered Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getRemainingEffort <em>Remaining Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredCapabilityImpl#getRemainingCost <em>Remaining Cost</em>}</li>
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
	public double getEffort() {
		return (Double)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__EFFORT, EngineeringPackage.Literals.ENDEAVOR__EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffort(double newEffort) {
		eDynamicSet(EngineeringPackage.ENGINEERED_CAPABILITY__EFFORT, EngineeringPackage.Literals.ENDEAVOR__EFFORT, newEffort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCost() {
		return (Double)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__COST, EngineeringPackage.Literals.ENDEAVOR__COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(double newCost) {
		eDynamicSet(EngineeringPackage.ENGINEERED_CAPABILITY__COST, EngineeringPackage.Literals.ENDEAVOR__COST, newCost);
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
	public double getRemainingEffort() {
		return (Double)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__REMAINING_EFFORT, EngineeringPackage.Literals.ENDEAVOR__REMAINING_EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRemainingCost() {
		return (Double)eDynamicGet(EngineeringPackage.ENGINEERED_CAPABILITY__REMAINING_COST, EngineeringPackage.Literals.ENDEAVOR__REMAINING_COST, true, true);
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__EFFORT:
				return getEffort();
			case EngineeringPackage.ENGINEERED_CAPABILITY__COST:
				return getCost();
			case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT:
				return getBenefit();
			case EngineeringPackage.ENGINEERED_CAPABILITY__REMAINING_EFFORT:
				return getRemainingEffort();
			case EngineeringPackage.ENGINEERED_CAPABILITY__REMAINING_COST:
				return getRemainingCost();
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__EFFORT:
				setEffort((Double)newValue);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__COST:
				setCost((Double)newValue);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT:
				setBenefit((Double)newValue);
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__EFFORT:
				setEffort(EFFORT_EDEFAULT);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__COST:
				setCost(COST_EDEFAULT);
				return;
			case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT:
				setBenefit(BENEFIT_EDEFAULT);
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
			case EngineeringPackage.ENGINEERED_CAPABILITY__EFFORT:
				return getEffort() != EFFORT_EDEFAULT;
			case EngineeringPackage.ENGINEERED_CAPABILITY__COST:
				return getCost() != COST_EDEFAULT;
			case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT:
				return getBenefit() != BENEFIT_EDEFAULT;
			case EngineeringPackage.ENGINEERED_CAPABILITY__REMAINING_EFFORT:
				return getRemainingEffort() != REMAINING_EFFORT_EDEFAULT;
			case EngineeringPackage.ENGINEERED_CAPABILITY__REMAINING_COST:
				return getRemainingCost() != REMAINING_COST_EDEFAULT;
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
				case EngineeringPackage.ENGINEERED_CAPABILITY__EFFORT: return EngineeringPackage.ENDEAVOR__EFFORT;
				case EngineeringPackage.ENGINEERED_CAPABILITY__COST: return EngineeringPackage.ENDEAVOR__COST;
				case EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT: return EngineeringPackage.ENDEAVOR__BENEFIT;
				case EngineeringPackage.ENGINEERED_CAPABILITY__REMAINING_EFFORT: return EngineeringPackage.ENDEAVOR__REMAINING_EFFORT;
				case EngineeringPackage.ENGINEERED_CAPABILITY__REMAINING_COST: return EngineeringPackage.ENDEAVOR__REMAINING_COST;
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
				case EngineeringPackage.ENDEAVOR__EFFORT: return EngineeringPackage.ENGINEERED_CAPABILITY__EFFORT;
				case EngineeringPackage.ENDEAVOR__COST: return EngineeringPackage.ENGINEERED_CAPABILITY__COST;
				case EngineeringPackage.ENDEAVOR__BENEFIT: return EngineeringPackage.ENGINEERED_CAPABILITY__BENEFIT;
				case EngineeringPackage.ENDEAVOR__REMAINING_EFFORT: return EngineeringPackage.ENGINEERED_CAPABILITY__REMAINING_EFFORT;
				case EngineeringPackage.ENDEAVOR__REMAINING_COST: return EngineeringPackage.ENGINEERED_CAPABILITY__REMAINING_COST;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EngineeredCapabilityImpl
