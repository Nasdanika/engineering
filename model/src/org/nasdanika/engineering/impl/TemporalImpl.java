/**
 */
package org.nasdanika.engineering.impl;

import java.time.Duration;
import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Temporal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.TemporalImpl#getInstant <em>Instant</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TemporalImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TemporalImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalImpl extends ModelElementImpl implements Temporal {
	/**
	 * The default value of the '{@link #getInstant() <em>Instant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstant()
	 * @generated
	 * @ordered
	 */
	protected static final Date INSTANT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Duration OFFSET_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.TEMPORAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getInstant() {
		return (Date)eDynamicGet(EngineeringPackage.TEMPORAL__INSTANT, EngineeringPackage.Literals.TEMPORAL__INSTANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstant(Date newInstant) {
		eDynamicSet(EngineeringPackage.TEMPORAL__INSTANT, EngineeringPackage.Literals.TEMPORAL__INSTANT, newInstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getBase() {
		return (Temporal)eDynamicGet(EngineeringPackage.TEMPORAL__BASE, EngineeringPackage.Literals.TEMPORAL__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal basicGetBase() {
		return (Temporal)eDynamicGet(EngineeringPackage.TEMPORAL__BASE, EngineeringPackage.Literals.TEMPORAL__BASE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Temporal newBase) {
		eDynamicSet(EngineeringPackage.TEMPORAL__BASE, EngineeringPackage.Literals.TEMPORAL__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getOffset() {
		return (Duration)eDynamicGet(EngineeringPackage.TEMPORAL__OFFSET, EngineeringPackage.Literals.TEMPORAL__OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(Duration newOffset) {
		eDynamicSet(EngineeringPackage.TEMPORAL__OFFSET, EngineeringPackage.Literals.TEMPORAL__OFFSET, newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.TEMPORAL__INSTANT:
				return getInstant();
			case EngineeringPackage.TEMPORAL__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case EngineeringPackage.TEMPORAL__OFFSET:
				return getOffset();
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
			case EngineeringPackage.TEMPORAL__INSTANT:
				setInstant((Date)newValue);
				return;
			case EngineeringPackage.TEMPORAL__BASE:
				setBase((Temporal)newValue);
				return;
			case EngineeringPackage.TEMPORAL__OFFSET:
				setOffset((Duration)newValue);
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
			case EngineeringPackage.TEMPORAL__INSTANT:
				setInstant(INSTANT_EDEFAULT);
				return;
			case EngineeringPackage.TEMPORAL__BASE:
				setBase((Temporal)null);
				return;
			case EngineeringPackage.TEMPORAL__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case EngineeringPackage.TEMPORAL__INSTANT:
				return INSTANT_EDEFAULT == null ? getInstant() != null : !INSTANT_EDEFAULT.equals(getInstant());
			case EngineeringPackage.TEMPORAL__BASE:
				return basicGetBase() != null;
			case EngineeringPackage.TEMPORAL__OFFSET:
				return OFFSET_EDEFAULT == null ? getOffset() != null : !OFFSET_EDEFAULT.equals(getOffset());
		}
		return super.eIsSet(featureID);
	}

} //TemporalImpl
