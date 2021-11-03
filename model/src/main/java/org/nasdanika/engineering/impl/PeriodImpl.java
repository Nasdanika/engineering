/**
 */
package org.nasdanika.engineering.impl;

import java.time.Duration;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.persistence.LoadTracker;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Period;
import org.nasdanika.ncore.Temporal;
import org.nasdanika.ncore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.PeriodImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.PeriodImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.PeriodImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodImpl extends ModelElementImpl implements Period {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(EngineeringPackage.PERIOD__START, EngineeringPackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, EngineeringPackage.PERIOD__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(EngineeringPackage.PERIOD__START, EngineeringPackage.Literals.PERIOD__START, newStart);
		onStart(this, newStart);
	}

	/**
	 * Computes end and duration from start and previously loaded things.
	 * @param period
	 * @param newStart
	 */
	protected static void onStart(Period period, Temporal newStart) {
		if (newStart != null) {
			LoadTracker loadTracker = EObjectAdaptable.adaptTo(period, LoadTracker.class);
			if (loadTracker != null && loadTracker.isLoading(EngineeringPackage.Literals.PERIOD__START)) {
				if (loadTracker.isLoaded(EngineeringPackage.Literals.PERIOD__END)) {
					if (!loadTracker.isLoaded(EngineeringPackage.Literals.PERIOD__DURATION)) {
						period.setDuration(period.getEnd().minus(newStart));
					}
				} else if (loadTracker.isLoaded(EngineeringPackage.Literals.PERIOD__DURATION)) {
					period.setEnd(newStart.plus(period.getDuration()));
				}
			}
		}
	}
	
	protected static void onEnd(Period period, Temporal newEnd) {
		if (newEnd != null) {
			LoadTracker loadTracker = EObjectAdaptable.adaptTo(period, LoadTracker.class);
			if (loadTracker != null && loadTracker.isLoading(EngineeringPackage.Literals.PERIOD__END)) {
				if (loadTracker.isLoaded(EngineeringPackage.Literals.PERIOD__START)) {
					if (!loadTracker.isLoaded(EngineeringPackage.Literals.PERIOD__DURATION)) {
						period.setDuration(newEnd.minus(period.getStart()));
					}
				} else if (loadTracker.isLoaded(EngineeringPackage.Literals.PERIOD__DURATION)) {
					period.setStart(newEnd.minus(period.getDuration()));
				}
			}
		}
	}
	
	protected static void onDuration(Period period, Duration newDuration) {
		if (newDuration != null) {
			LoadTracker loadTracker = EObjectAdaptable.adaptTo(period, LoadTracker.class);
			if (loadTracker != null && loadTracker.isLoading(EngineeringPackage.Literals.PERIOD__DURATION)) {
				if (loadTracker.isLoaded(EngineeringPackage.Literals.PERIOD__START)) {
					if (!loadTracker.isLoaded(EngineeringPackage.Literals.PERIOD__END)) {
						period.setEnd(period.getStart().plus(newDuration));
					}
				} else if (loadTracker.isLoaded(EngineeringPackage.Literals.PERIOD__END)) {
					period.setStart(period.getEnd().minus(newDuration));
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(EngineeringPackage.PERIOD__END, EngineeringPackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, EngineeringPackage.PERIOD__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(EngineeringPackage.PERIOD__END, EngineeringPackage.Literals.PERIOD__END, newEnd);
		onEnd(this, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(EngineeringPackage.PERIOD__DURATION, EngineeringPackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(EngineeringPackage.PERIOD__DURATION, EngineeringPackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.PERIOD__START:
				return basicSetStart(null, msgs);
			case EngineeringPackage.PERIOD__END:
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
			case EngineeringPackage.PERIOD__START:
				return getStart();
			case EngineeringPackage.PERIOD__END:
				return getEnd();
			case EngineeringPackage.PERIOD__DURATION:
				return getDuration();
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
			case EngineeringPackage.PERIOD__START:
				setStart((Temporal)newValue);
				return;
			case EngineeringPackage.PERIOD__END:
				setEnd((Temporal)newValue);
				return;
			case EngineeringPackage.PERIOD__DURATION:
				setDuration((Duration)newValue);
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
			case EngineeringPackage.PERIOD__START:
				setStart((Temporal)null);
				return;
			case EngineeringPackage.PERIOD__END:
				setEnd((Temporal)null);
				return;
			case EngineeringPackage.PERIOD__DURATION:
				setDuration(DURATION_EDEFAULT);
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
			case EngineeringPackage.PERIOD__START:
				return getStart() != null;
			case EngineeringPackage.PERIOD__END:
				return getEnd() != null;
			case EngineeringPackage.PERIOD__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
		}
		return super.eIsSet(featureID);
	}

} //PeriodImpl
