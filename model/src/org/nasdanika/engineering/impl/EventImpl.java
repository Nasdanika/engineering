/**
 */
package org.nasdanika.engineering.impl;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Event;
import org.nasdanika.engineering.Temporal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EventImpl#getInstant <em>Instant</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EventImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EventImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends NamedElementImpl implements Event {
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
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getInstant() {
		return (Date)eDynamicGet(EngineeringPackage.EVENT__INSTANT, EngineeringPackage.Literals.TEMPORAL__INSTANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstant(Date newInstant) {
		eDynamicSet(EngineeringPackage.EVENT__INSTANT, EngineeringPackage.Literals.TEMPORAL__INSTANT, newInstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getBase() {
		return (Temporal)eDynamicGet(EngineeringPackage.EVENT__BASE, EngineeringPackage.Literals.TEMPORAL__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal basicGetBase() {
		return (Temporal)eDynamicGet(EngineeringPackage.EVENT__BASE, EngineeringPackage.Literals.TEMPORAL__BASE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Temporal newBase) {
		eDynamicSet(EngineeringPackage.EVENT__BASE, EngineeringPackage.Literals.TEMPORAL__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getOffset() {
		return (Duration)eDynamicGet(EngineeringPackage.EVENT__OFFSET, EngineeringPackage.Literals.TEMPORAL__OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(Duration newOffset) {
		eDynamicSet(EngineeringPackage.EVENT__OFFSET, EngineeringPackage.Literals.TEMPORAL__OFFSET, newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean after(Temporal when) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean before(Temporal when) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean coincides(Temporal when) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal normalize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.EVENT__INSTANT:
				return getInstant();
			case EngineeringPackage.EVENT__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case EngineeringPackage.EVENT__OFFSET:
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
			case EngineeringPackage.EVENT__INSTANT:
				setInstant((Date)newValue);
				return;
			case EngineeringPackage.EVENT__BASE:
				setBase((Temporal)newValue);
				return;
			case EngineeringPackage.EVENT__OFFSET:
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
			case EngineeringPackage.EVENT__INSTANT:
				setInstant(INSTANT_EDEFAULT);
				return;
			case EngineeringPackage.EVENT__BASE:
				setBase((Temporal)null);
				return;
			case EngineeringPackage.EVENT__OFFSET:
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
			case EngineeringPackage.EVENT__INSTANT:
				return INSTANT_EDEFAULT == null ? getInstant() != null : !INSTANT_EDEFAULT.equals(getInstant());
			case EngineeringPackage.EVENT__BASE:
				return basicGetBase() != null;
			case EngineeringPackage.EVENT__OFFSET:
				return OFFSET_EDEFAULT == null ? getOffset() != null : !OFFSET_EDEFAULT.equals(getOffset());
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
		if (baseClass == Temporal.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.EVENT__INSTANT: return EngineeringPackage.TEMPORAL__INSTANT;
				case EngineeringPackage.EVENT__BASE: return EngineeringPackage.TEMPORAL__BASE;
				case EngineeringPackage.EVENT__OFFSET: return EngineeringPackage.TEMPORAL__OFFSET;
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
		if (baseClass == Temporal.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.TEMPORAL__INSTANT: return EngineeringPackage.EVENT__INSTANT;
				case EngineeringPackage.TEMPORAL__BASE: return EngineeringPackage.EVENT__BASE;
				case EngineeringPackage.TEMPORAL__OFFSET: return EngineeringPackage.EVENT__OFFSET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Temporal.class) {
			switch (baseOperationID) {
				case EngineeringPackage.TEMPORAL___AFTER__TEMPORAL: return EngineeringPackage.EVENT___AFTER__TEMPORAL;
				case EngineeringPackage.TEMPORAL___BEFORE__TEMPORAL: return EngineeringPackage.EVENT___BEFORE__TEMPORAL;
				case EngineeringPackage.TEMPORAL___COINCIDES__TEMPORAL: return EngineeringPackage.EVENT___COINCIDES__TEMPORAL;
				case EngineeringPackage.TEMPORAL___NORMALIZE: return EngineeringPackage.EVENT___NORMALIZE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EngineeringPackage.EVENT___AFTER__TEMPORAL:
				return after((Temporal)arguments.get(0));
			case EngineeringPackage.EVENT___BEFORE__TEMPORAL:
				return before((Temporal)arguments.get(0));
			case EngineeringPackage.EVENT___COINCIDES__TEMPORAL:
				return coincides((Temporal)arguments.get(0));
			case EngineeringPackage.EVENT___NORMALIZE:
				return normalize();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EventImpl
