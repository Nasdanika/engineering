/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignable;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.AimImpl#getAligns <em>Aligns</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.AimImpl#getAlignments <em>Alignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AimImpl extends NamedElementImpl implements Aim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.AIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Alignment> getAlignments() {
		return getReferrers(EngineeringPackage.Literals.ALIGNMENT__AIM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Alignment> getAligns() {
		return (EList<Alignment>)eDynamicGet(EngineeringPackage.AIM__ALIGNS, EngineeringPackage.Literals.ALIGNABLE__ALIGNS, true, true);
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
			case EngineeringPackage.AIM__ALIGNMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlignments()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.AIM__ALIGNS:
				return ((InternalEList<?>)getAligns()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.AIM__ALIGNMENTS:
				return ((InternalEList<?>)getAlignments()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.AIM__ALIGNS:
				return getAligns();
			case EngineeringPackage.AIM__ALIGNMENTS:
				return getAlignments();
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
			case EngineeringPackage.AIM__ALIGNS:
				getAligns().clear();
				getAligns().addAll((Collection<? extends Alignment>)newValue);
				return;
			case EngineeringPackage.AIM__ALIGNMENTS:
				getAlignments().clear();
				getAlignments().addAll((Collection<? extends Alignment>)newValue);
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
			case EngineeringPackage.AIM__ALIGNS:
				getAligns().clear();
				return;
			case EngineeringPackage.AIM__ALIGNMENTS:
				getAlignments().clear();
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
			case EngineeringPackage.AIM__ALIGNS:
				return !getAligns().isEmpty();
			case EngineeringPackage.AIM__ALIGNMENTS:
				return !getAlignments().isEmpty();
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
				case EngineeringPackage.AIM__ALIGNS: return EngineeringPackage.ALIGNABLE__ALIGNS;
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
				case EngineeringPackage.ALIGNABLE__ALIGNS: return EngineeringPackage.AIM__ALIGNS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AimImpl
