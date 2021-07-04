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
import org.nasdanika.engineering.NamedElement;
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
 *   <li>{@link org.nasdanika.engineering.impl.TemporalImpl#getDerivatives <em>Derivatives</em>}</li>
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
	public NotificationChain basicSetBase(Temporal newBase, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBase, EngineeringPackage.TEMPORAL__BASE, msgs);
		return msgs;
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
	 * @generated NOT
	 */
	@Override
	public EList<Temporal> getDerivatives() {
		return getReferrers(EngineeringPackage.Literals.TEMPORAL__BASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean after(Temporal when) {
		return Temporal.super.after(when);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean before(Temporal when) {
		return Temporal.super.before(when);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean coincides(Temporal when) {
		return Temporal.super.coincides(when);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Temporal normalize() {
		return Temporal.super.normalize();
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
			case EngineeringPackage.TEMPORAL__BASE:
				Temporal base = basicGetBase();
				if (base != null)
					msgs = ((InternalEObject)base).eInverseRemove(this, EngineeringPackage.TEMPORAL__DERIVATIVES, Temporal.class, msgs);
				return basicSetBase((Temporal)otherEnd, msgs);
			case EngineeringPackage.TEMPORAL__DERIVATIVES:
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
			case EngineeringPackage.TEMPORAL__BASE:
				return basicSetBase(null, msgs);
			case EngineeringPackage.TEMPORAL__DERIVATIVES:
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
			case EngineeringPackage.TEMPORAL__INSTANT:
				return getInstant();
			case EngineeringPackage.TEMPORAL__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case EngineeringPackage.TEMPORAL__OFFSET:
				return getOffset();
			case EngineeringPackage.TEMPORAL__DERIVATIVES:
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
			case EngineeringPackage.TEMPORAL__INSTANT:
				setInstant((Date)newValue);
				return;
			case EngineeringPackage.TEMPORAL__BASE:
				setBase((Temporal)newValue);
				return;
			case EngineeringPackage.TEMPORAL__OFFSET:
				setOffset((Duration)newValue);
				return;
			case EngineeringPackage.TEMPORAL__DERIVATIVES:
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
			case EngineeringPackage.TEMPORAL__INSTANT:
				setInstant(INSTANT_EDEFAULT);
				return;
			case EngineeringPackage.TEMPORAL__BASE:
				setBase((Temporal)null);
				return;
			case EngineeringPackage.TEMPORAL__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case EngineeringPackage.TEMPORAL__DERIVATIVES:
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
			case EngineeringPackage.TEMPORAL__INSTANT:
				return INSTANT_EDEFAULT == null ? getInstant() != null : !INSTANT_EDEFAULT.equals(getInstant());
			case EngineeringPackage.TEMPORAL__BASE:
				return basicGetBase() != null;
			case EngineeringPackage.TEMPORAL__OFFSET:
				return OFFSET_EDEFAULT == null ? getOffset() != null : !OFFSET_EDEFAULT.equals(getOffset());
			case EngineeringPackage.TEMPORAL__DERIVATIVES:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EngineeringPackage.TEMPORAL___AFTER__TEMPORAL:
				return after((Temporal)arguments.get(0));
			case EngineeringPackage.TEMPORAL___BEFORE__TEMPORAL:
				return before((Temporal)arguments.get(0));
			case EngineeringPackage.TEMPORAL___COINCIDES__TEMPORAL:
				return coincides((Temporal)arguments.get(0));
			case EngineeringPackage.TEMPORAL___NORMALIZE:
				return normalize();
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public String toString() {
		Date instant = getInstant();
		if (instant != null) {
			return instant.toString();
		}
		
		Duration offset = getOffset();
		Temporal base = getBase();
		if ((offset == null || offset.equals(Duration.ZERO)) && base != null) {
			return "Coincides with " + base;
		}
		
		if (base != null) {
			String baseStr = base instanceof NamedElement ? ((NamedElement) base).getName() : base.toString();			
			return Temporal.formatDuration(offset.abs()) + (offset.isNegative() ? " before " : " after ") + baseStr;
		}
		
		return super.toString();
	}

} //TemporalImpl
