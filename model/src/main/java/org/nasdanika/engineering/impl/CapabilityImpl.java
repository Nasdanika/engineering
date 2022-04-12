/**
 */
package org.nasdanika.engineering.impl;

import java.time.Duration;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.Temporal;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.CapabilityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.CapabilityImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.CapabilityImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.CapabilityImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.CapabilityImpl#isAvailable <em>Available</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends NamedElementImpl implements Capability {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABLE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(EngineeringPackage.CAPABILITY__START, NcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, EngineeringPackage.CAPABILITY__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(EngineeringPackage.CAPABILITY__START, NcorePackage.Literals.PERIOD__START, newStart);
		NcoreUtil.onStart(this, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(EngineeringPackage.CAPABILITY__END, NcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, EngineeringPackage.CAPABILITY__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(EngineeringPackage.CAPABILITY__END, NcorePackage.Literals.PERIOD__END, newEnd);
		NcoreUtil.onEnd(this, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(EngineeringPackage.CAPABILITY__DURATION, NcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(EngineeringPackage.CAPABILITY__DURATION, NcorePackage.Literals.PERIOD__DURATION, newDuration);
		NcoreUtil.onDuration(this, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getRequiredBy() {
		return getOppositeReferrers(EngineeringPackage.Literals.CAPABILITY__REQUIRED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAvailable() {
		return (Boolean)eDynamicGet(EngineeringPackage.CAPABILITY__AVAILABLE, EngineeringPackage.Literals.CAPABILITY__AVAILABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailable(boolean newAvailable) {
		eDynamicSet(EngineeringPackage.CAPABILITY__AVAILABLE, EngineeringPackage.Literals.CAPABILITY__AVAILABLE, newAvailable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.CAPABILITY__START:
				return basicSetStart(null, msgs);
			case EngineeringPackage.CAPABILITY__END:
				return basicSetEnd(null, msgs);
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
			case EngineeringPackage.CAPABILITY__START:
				return getStart();
			case EngineeringPackage.CAPABILITY__END:
				return getEnd();
			case EngineeringPackage.CAPABILITY__DURATION:
				return getDuration();
			case EngineeringPackage.CAPABILITY__REQUIRED_BY:
				return getRequiredBy();
			case EngineeringPackage.CAPABILITY__AVAILABLE:
				return isAvailable();
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
			case EngineeringPackage.CAPABILITY__START:
				setStart((Temporal)newValue);
				return;
			case EngineeringPackage.CAPABILITY__END:
				setEnd((Temporal)newValue);
				return;
			case EngineeringPackage.CAPABILITY__DURATION:
				setDuration((Duration)newValue);
				return;
			case EngineeringPackage.CAPABILITY__AVAILABLE:
				setAvailable((Boolean)newValue);
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
			case EngineeringPackage.CAPABILITY__START:
				setStart((Temporal)null);
				return;
			case EngineeringPackage.CAPABILITY__END:
				setEnd((Temporal)null);
				return;
			case EngineeringPackage.CAPABILITY__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case EngineeringPackage.CAPABILITY__AVAILABLE:
				setAvailable(AVAILABLE_EDEFAULT);
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
			case EngineeringPackage.CAPABILITY__START:
				return getStart() != null;
			case EngineeringPackage.CAPABILITY__END:
				return getEnd() != null;
			case EngineeringPackage.CAPABILITY__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case EngineeringPackage.CAPABILITY__REQUIRED_BY:
				return !getRequiredBy().isEmpty();
			case EngineeringPackage.CAPABILITY__AVAILABLE:
				return isAvailable() != AVAILABLE_EDEFAULT;
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
		if (baseClass == Period.class) {
			switch (derivedFeatureID) {
				case EngineeringPackage.CAPABILITY__START: return NcorePackage.PERIOD__START;
				case EngineeringPackage.CAPABILITY__END: return NcorePackage.PERIOD__END;
				case EngineeringPackage.CAPABILITY__DURATION: return NcorePackage.PERIOD__DURATION;
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
		if (baseClass == Period.class) {
			switch (baseFeatureID) {
				case NcorePackage.PERIOD__START: return EngineeringPackage.CAPABILITY__START;
				case NcorePackage.PERIOD__END: return EngineeringPackage.CAPABILITY__END;
				case NcorePackage.PERIOD__DURATION: return EngineeringPackage.CAPABILITY__DURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CapabilityImpl
