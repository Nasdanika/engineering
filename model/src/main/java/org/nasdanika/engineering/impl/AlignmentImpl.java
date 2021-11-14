/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.AlignmentImpl#getAim <em>Aim</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.AlignmentImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlignmentImpl extends ModelElementImpl implements Alignment {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ALIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aim getAim() {
		return (Aim)eDynamicGet(EngineeringPackage.ALIGNMENT__AIM, EngineeringPackage.Literals.ALIGNMENT__AIM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aim basicGetAim() {
		return (Aim)eDynamicGet(EngineeringPackage.ALIGNMENT__AIM, EngineeringPackage.Literals.ALIGNMENT__AIM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAim(Aim newAim) {
		eDynamicSet(EngineeringPackage.ALIGNMENT__AIM, EngineeringPackage.Literals.ALIGNMENT__AIM, newAim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return (Double)eDynamicGet(EngineeringPackage.ALIGNMENT__WEIGHT, EngineeringPackage.Literals.ALIGNMENT__WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		eDynamicSet(EngineeringPackage.ALIGNMENT__WEIGHT, EngineeringPackage.Literals.ALIGNMENT__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.ALIGNMENT__AIM:
				if (resolve) return getAim();
				return basicGetAim();
			case EngineeringPackage.ALIGNMENT__WEIGHT:
				return getWeight();
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
			case EngineeringPackage.ALIGNMENT__AIM:
				setAim((Aim)newValue);
				return;
			case EngineeringPackage.ALIGNMENT__WEIGHT:
				setWeight((Double)newValue);
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
			case EngineeringPackage.ALIGNMENT__AIM:
				setAim((Aim)null);
				return;
			case EngineeringPackage.ALIGNMENT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case EngineeringPackage.ALIGNMENT__AIM:
				return basicGetAim() != null;
			case EngineeringPackage.ALIGNMENT__WEIGHT:
				return getWeight() != WEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //AlignmentImpl
