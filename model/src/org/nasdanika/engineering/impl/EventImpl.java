/**
 */
package org.nasdanika.engineering.impl;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Event;
import org.nasdanika.engineering.Temporal;
import org.nasdanika.html.app.impl.Util;

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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Temporal> getDerivatives() {
		return (EList<Temporal>)eDynamicGet(EngineeringPackage.EVENT__DERIVATIVES, EngineeringPackage.Literals.TEMPORAL__DERIVATIVES, true, true);
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.EVENT__BASE:
				Temporal base = basicGetBase();
				if (base != null)
					msgs = ((InternalEObject)base).eInverseRemove(this, EngineeringPackage.TEMPORAL__DERIVATIVES, Temporal.class, msgs);
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
				setInstant((Date)newValue);
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
				case EngineeringPackage.EVENT__DERIVATIVES: return EngineeringPackage.TEMPORAL__DERIVATIVES;
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
				case EngineeringPackage.TEMPORAL__DERIVATIVES: return EngineeringPackage.EVENT__DERIVATIVES;
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
	
	@Override
	public String toString() {
		String name = getName();
		if (Util.isBlank(name)) {
			name = "";
		} else {
			name = name + " ";
		}
		
		Date instant = getInstant();
		if (instant != null) {
			return name + instant;
		}
		
		Duration offset = getOffset();
		Temporal base = getBase();
		if ((offset == null || offset.equals(Duration.ZERO)) && base != null) {
			return name + " coincides with " + base;				
		}
		
		if (base != null) {
			return name + Temporal.formatDuration(offset.abs()) + (offset.isNegative() ? " before " : " after ") + base;
		}
		
		return getName();
	}
	

} //EventImpl
