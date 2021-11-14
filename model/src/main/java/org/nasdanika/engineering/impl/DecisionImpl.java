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
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Decision;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.DecisionImpl#getAlignments <em>Alignments</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.DecisionImpl#getEffectiveStart <em>Effective Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.DecisionImpl#getEffectiveEnd <em>Effective End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.DecisionImpl#getSupercedes <em>Supercedes</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.DecisionImpl#getSupercededBy <em>Superceded By</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.DecisionImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionImpl extends IssueImpl implements Decision {
	/**
	 * The default value of the '{@link #getEffectiveStart() <em>Effective Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date EFFECTIVE_START_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEffectiveEnd() <em>Effective End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date EFFECTIVE_END_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Alignment> getAlignments() {
		return (EList<Alignment>)eDynamicGet(EngineeringPackage.DECISION__ALIGNMENTS, EngineeringPackage.Literals.AIM__ALIGNMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEffectiveStart() {
		return (Date)eDynamicGet(EngineeringPackage.DECISION__EFFECTIVE_START, EngineeringPackage.Literals.DECISION__EFFECTIVE_START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveStart(Date newEffectiveStart) {
		eDynamicSet(EngineeringPackage.DECISION__EFFECTIVE_START, EngineeringPackage.Literals.DECISION__EFFECTIVE_START, newEffectiveStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEffectiveEnd() {
		return (Date)eDynamicGet(EngineeringPackage.DECISION__EFFECTIVE_END, EngineeringPackage.Literals.DECISION__EFFECTIVE_END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveEnd(Date newEffectiveEnd) {
		eDynamicSet(EngineeringPackage.DECISION__EFFECTIVE_END, EngineeringPackage.Literals.DECISION__EFFECTIVE_END, newEffectiveEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Decision> getSupercedes() {
		return (EList<Decision>)eDynamicGet(EngineeringPackage.DECISION__SUPERCEDES, EngineeringPackage.Literals.DECISION__SUPERCEDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Decision> getSupercededBy() {
		return (EList<Decision>)eDynamicGet(EngineeringPackage.DECISION__SUPERCEDED_BY, EngineeringPackage.Literals.DECISION__SUPERCEDED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResolution() {
		return (String)eDynamicGet(EngineeringPackage.DECISION__RESOLUTION, EngineeringPackage.Literals.DECISION__RESOLUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(String newResolution) {
		eDynamicSet(EngineeringPackage.DECISION__RESOLUTION, EngineeringPackage.Literals.DECISION__RESOLUTION, newResolution);
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
			case EngineeringPackage.DECISION__SUPERCEDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupercedes()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.DECISION__SUPERCEDED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupercededBy()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.DECISION__SUPERCEDES:
				return ((InternalEList<?>)getSupercedes()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.DECISION__SUPERCEDED_BY:
				return ((InternalEList<?>)getSupercededBy()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.DECISION__ALIGNMENTS:
				return getAlignments();
			case EngineeringPackage.DECISION__EFFECTIVE_START:
				return getEffectiveStart();
			case EngineeringPackage.DECISION__EFFECTIVE_END:
				return getEffectiveEnd();
			case EngineeringPackage.DECISION__SUPERCEDES:
				return getSupercedes();
			case EngineeringPackage.DECISION__SUPERCEDED_BY:
				return getSupercededBy();
			case EngineeringPackage.DECISION__RESOLUTION:
				return getResolution();
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
			case EngineeringPackage.DECISION__EFFECTIVE_START:
				setEffectiveStart((Date)newValue);
				return;
			case EngineeringPackage.DECISION__EFFECTIVE_END:
				setEffectiveEnd((Date)newValue);
				return;
			case EngineeringPackage.DECISION__SUPERCEDES:
				getSupercedes().clear();
				getSupercedes().addAll((Collection<? extends Decision>)newValue);
				return;
			case EngineeringPackage.DECISION__RESOLUTION:
				setResolution((String)newValue);
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
			case EngineeringPackage.DECISION__EFFECTIVE_START:
				setEffectiveStart(EFFECTIVE_START_EDEFAULT);
				return;
			case EngineeringPackage.DECISION__EFFECTIVE_END:
				setEffectiveEnd(EFFECTIVE_END_EDEFAULT);
				return;
			case EngineeringPackage.DECISION__SUPERCEDES:
				getSupercedes().clear();
				return;
			case EngineeringPackage.DECISION__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
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
			case EngineeringPackage.DECISION__ALIGNMENTS:
				return !getAlignments().isEmpty();
			case EngineeringPackage.DECISION__EFFECTIVE_START:
				return EFFECTIVE_START_EDEFAULT == null ? getEffectiveStart() != null : !EFFECTIVE_START_EDEFAULT.equals(getEffectiveStart());
			case EngineeringPackage.DECISION__EFFECTIVE_END:
				return EFFECTIVE_END_EDEFAULT == null ? getEffectiveEnd() != null : !EFFECTIVE_END_EDEFAULT.equals(getEffectiveEnd());
			case EngineeringPackage.DECISION__SUPERCEDES:
				return !getSupercedes().isEmpty();
			case EngineeringPackage.DECISION__SUPERCEDED_BY:
				return !getSupercededBy().isEmpty();
			case EngineeringPackage.DECISION__RESOLUTION:
				return RESOLUTION_EDEFAULT == null ? getResolution() != null : !RESOLUTION_EDEFAULT.equals(getResolution());
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
		if (baseClass == Aim.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.DECISION__ALIGNMENTS: return EngineeringPackage.AIM__ALIGNMENTS;
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
		if (baseClass == Aim.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.AIM__ALIGNMENTS: return EngineeringPackage.DECISION__ALIGNMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DecisionImpl
