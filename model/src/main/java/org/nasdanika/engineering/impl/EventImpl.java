/**
 */
package org.nasdanika.engineering.impl;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Event;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Temporal;

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
 *   <li>{@link org.nasdanika.engineering.impl.EventImpl#getDerivatives <em>Derivatives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EventImpl#getLowerBounds <em>Lower Bounds</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EventImpl#getUpperBounds <em>Upper Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends EngineeredElementImpl implements Event {
	/**
	 * The default value of the '{@link #getInstant() <em>Instant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstant()
	 * @generated
	 * @ordered
	 */
	protected static final Instant INSTANT_EDEFAULT = null;

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
	public Instant getInstant() {
		return (Instant)eDynamicGet(EngineeringPackage.EVENT__INSTANT, NcorePackage.Literals.TEMPORAL__INSTANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstant(Instant newInstant) {
		eDynamicSet(EngineeringPackage.EVENT__INSTANT, NcorePackage.Literals.TEMPORAL__INSTANT, newInstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getBase() {
		return (Temporal)eDynamicGet(EngineeringPackage.EVENT__BASE, NcorePackage.Literals.TEMPORAL__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal basicGetBase() {
		return (Temporal)eDynamicGet(EngineeringPackage.EVENT__BASE, NcorePackage.Literals.TEMPORAL__BASE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(Temporal newBase, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBase, EngineeringPackage.EVENT__BASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Temporal newBase) {
		eDynamicSet(EngineeringPackage.EVENT__BASE, NcorePackage.Literals.TEMPORAL__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getOffset() {
		return (Duration)eDynamicGet(EngineeringPackage.EVENT__OFFSET, NcorePackage.Literals.TEMPORAL__OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(Duration newOffset) {
		eDynamicSet(EngineeringPackage.EVENT__OFFSET, NcorePackage.Literals.TEMPORAL__OFFSET, newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Temporal> getDerivatives() {
		return getOppositeReferrers(NcorePackage.Literals.TEMPORAL__DERIVATIVES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Temporal> getLowerBounds() {
		return (EList<Temporal>)eDynamicGet(EngineeringPackage.EVENT__LOWER_BOUNDS, NcorePackage.Literals.TEMPORAL__LOWER_BOUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Temporal> getUpperBounds() {
		return (EList<Temporal>)eDynamicGet(EngineeringPackage.EVENT__UPPER_BOUNDS, NcorePackage.Literals.TEMPORAL__UPPER_BOUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean after(Temporal when) {
		return Event.super.after(when);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean before(Temporal when) {
		return Event.super.before(when);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean coincides(Temporal when) {
		return Event.super.coincides(when);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Temporal normalize() {
		return Event.super.normalize();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Duration minus(Temporal when) {
		return Event.super.minus(when);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Temporal minus(Duration offset) {
		return Event.super.minus(offset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Temporal plus(Duration offset) {
		return Event.super.plus(offset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Temporal copy() {
		return Event.super.copy();
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
			case EngineeringPackage.EVENT__BASE:
				Temporal base = basicGetBase();
				if (base != null)
					msgs = ((InternalEObject)base).eInverseRemove(this, NcorePackage.TEMPORAL__DERIVATIVES, Temporal.class, msgs);
				return basicSetBase((Temporal)otherEnd, msgs);
			case EngineeringPackage.EVENT__DERIVATIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDerivatives()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.EVENT__BASE:
				return basicSetBase(null, msgs);
			case EngineeringPackage.EVENT__DERIVATIVES:
				return ((InternalEList<?>)getDerivatives()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.EVENT__LOWER_BOUNDS:
				return ((InternalEList<?>)getLowerBounds()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.EVENT__UPPER_BOUNDS:
				return ((InternalEList<?>)getUpperBounds()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.EVENT__INSTANT:
				return getInstant();
			case EngineeringPackage.EVENT__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case EngineeringPackage.EVENT__OFFSET:
				return getOffset();
			case EngineeringPackage.EVENT__DERIVATIVES:
				return getDerivatives();
			case EngineeringPackage.EVENT__LOWER_BOUNDS:
				return getLowerBounds();
			case EngineeringPackage.EVENT__UPPER_BOUNDS:
				return getUpperBounds();
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
			case EngineeringPackage.EVENT__INSTANT:
				setInstant((Instant)newValue);
				return;
			case EngineeringPackage.EVENT__BASE:
				setBase((Temporal)newValue);
				return;
			case EngineeringPackage.EVENT__OFFSET:
				setOffset((Duration)newValue);
				return;
			case EngineeringPackage.EVENT__DERIVATIVES:
				getDerivatives().clear();
				getDerivatives().addAll((Collection<? extends Temporal>)newValue);
				return;
			case EngineeringPackage.EVENT__LOWER_BOUNDS:
				getLowerBounds().clear();
				getLowerBounds().addAll((Collection<? extends Temporal>)newValue);
				return;
			case EngineeringPackage.EVENT__UPPER_BOUNDS:
				getUpperBounds().clear();
				getUpperBounds().addAll((Collection<? extends Temporal>)newValue);
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
			case EngineeringPackage.EVENT__DERIVATIVES:
				getDerivatives().clear();
				return;
			case EngineeringPackage.EVENT__LOWER_BOUNDS:
				getLowerBounds().clear();
				return;
			case EngineeringPackage.EVENT__UPPER_BOUNDS:
				getUpperBounds().clear();
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
			case EngineeringPackage.EVENT__DERIVATIVES:
				return !getDerivatives().isEmpty();
			case EngineeringPackage.EVENT__LOWER_BOUNDS:
				return !getLowerBounds().isEmpty();
			case EngineeringPackage.EVENT__UPPER_BOUNDS:
				return !getUpperBounds().isEmpty();
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
				case EngineeringPackage.EVENT__INSTANT: return NcorePackage.TEMPORAL__INSTANT;
				case EngineeringPackage.EVENT__BASE: return NcorePackage.TEMPORAL__BASE;
				case EngineeringPackage.EVENT__OFFSET: return NcorePackage.TEMPORAL__OFFSET;
				case EngineeringPackage.EVENT__DERIVATIVES: return NcorePackage.TEMPORAL__DERIVATIVES;
				case EngineeringPackage.EVENT__LOWER_BOUNDS: return NcorePackage.TEMPORAL__LOWER_BOUNDS;
				case EngineeringPackage.EVENT__UPPER_BOUNDS: return NcorePackage.TEMPORAL__UPPER_BOUNDS;
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
				case NcorePackage.TEMPORAL__INSTANT: return EngineeringPackage.EVENT__INSTANT;
				case NcorePackage.TEMPORAL__BASE: return EngineeringPackage.EVENT__BASE;
				case NcorePackage.TEMPORAL__OFFSET: return EngineeringPackage.EVENT__OFFSET;
				case NcorePackage.TEMPORAL__DERIVATIVES: return EngineeringPackage.EVENT__DERIVATIVES;
				case NcorePackage.TEMPORAL__LOWER_BOUNDS: return EngineeringPackage.EVENT__LOWER_BOUNDS;
				case NcorePackage.TEMPORAL__UPPER_BOUNDS: return EngineeringPackage.EVENT__UPPER_BOUNDS;
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
				case NcorePackage.TEMPORAL___AFTER__TEMPORAL: return EngineeringPackage.EVENT___AFTER__TEMPORAL;
				case NcorePackage.TEMPORAL___BEFORE__TEMPORAL: return EngineeringPackage.EVENT___BEFORE__TEMPORAL;
				case NcorePackage.TEMPORAL___COINCIDES__TEMPORAL: return EngineeringPackage.EVENT___COINCIDES__TEMPORAL;
				case NcorePackage.TEMPORAL___NORMALIZE: return EngineeringPackage.EVENT___NORMALIZE;
				case NcorePackage.TEMPORAL___MINUS__TEMPORAL: return EngineeringPackage.EVENT___MINUS__TEMPORAL;
				case NcorePackage.TEMPORAL___MINUS__DURATION: return EngineeringPackage.EVENT___MINUS__DURATION;
				case NcorePackage.TEMPORAL___PLUS__DURATION: return EngineeringPackage.EVENT___PLUS__DURATION;
				case NcorePackage.TEMPORAL___COPY: return EngineeringPackage.EVENT___COPY;
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
			case EngineeringPackage.EVENT___MINUS__TEMPORAL:
				return minus((Temporal)arguments.get(0));
			case EngineeringPackage.EVENT___MINUS__DURATION:
				return minus((Duration)arguments.get(0));
			case EngineeringPackage.EVENT___PLUS__DURATION:
				return plus((Duration)arguments.get(0));
			case EngineeringPackage.EVENT___COPY:
				return copy();
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public String toString() {
		String name = getName();
		if (Util.isBlank(name)) {
			name = "";
		} else {
			name = name + " ";
		}
		
		Instant instant = getInstant();
		if (instant != null) {
			return name + new Date(instant.toEpochMilli());
		}
		
		Duration offset = getOffset();
		Temporal base = getBase();
		if ((offset == null || offset.equals(Duration.ZERO)) && base != null) {
			return name + "coincides with " + base;				
		}
		
		if (base != null) {
			return name + Temporal.formatDuration(offset.abs()) + (offset.isNegative() ? " before " : " after ") + base;
		}
		
		return getName();
	}
	

} //EventImpl
