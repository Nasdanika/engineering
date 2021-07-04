/**
 */
package org.nasdanika.engineering;

import java.time.Duration;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Temporal#getInstant <em>Instant</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Temporal#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Temporal#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Temporal#getDerivatives <em>Derivatives</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getTemporal()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/temporal.md'"
 * @generated
 */
public interface Temporal extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Instant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute point on the time-line. E.g. ``2021/07/04``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instant</em>' attribute.
	 * @see #setInstant(Date)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTemporal_Instant()
	 * @model annotation="urn:org.nasdanika default-feature='true' exclusive-with='base offset'"
	 * @generated
	 */
	Date getInstant();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Temporal#getInstant <em>Instant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instant</em>' attribute.
	 * @see #getInstant()
	 * @generated
	 */
	void setInstant(Date value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Temporal#getDerivatives <em>Derivatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base of this temporal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Temporal)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTemporal_Base()
	 * @see org.nasdanika.engineering.Temporal#getDerivatives
	 * @model opposite="derivatives"
	 *        annotation="urn:org.nasdanika exclusive-with='instant'"
	 * @generated
	 */
	Temporal getBase();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Temporal#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Temporal value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time offset from the base in [ISO-8601 durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) format. 
	 * 
	 * Examples:
	 * 
	 * * ``P1H`` for one hour later.
	 * * ``-P20D`` or ``P-20D`` for 20 days before. Can be null (zero), e.g. if one [period](Period.html) starts right after another period ends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(Duration)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTemporal_Offset()
	 * @model dataType="org.nasdanika.engineering.Duration"
	 * @generated
	 */
	Duration getOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Temporal#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Duration value);

	/**
	 * Returns the value of the '<em><b>Derivatives</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Temporal}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Temporal#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporals which are based on this temporal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivatives</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getTemporal_Derivatives()
	 * @see org.nasdanika.engineering.Temporal#getBase
	 * @model opposite="base" derived="true"
	 * @generated
	 */
	EList<Temporal> getDerivatives();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tests if this temporal is after the specified temporal. Returns null if unknown, e.g. two unrelated events.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated NOT
	 */
	default Boolean after(Temporal when) {
		if (when == null) {
			return false;
		}
		Temporal nWhen = when.normalize();
		Date whenInstant = nWhen.getInstant();
		
		Temporal nThis = normalize();
		Date thisInstant = nThis.getInstant();
		if (whenInstant != null) {
			if (thisInstant == null) {
				return null;
			}
			return thisInstant.after(whenInstant);
		}
		if (nWhen.getBase() == nThis.getBase()) {
			Duration whenOffset = nWhen.getOffset();
			Duration thisOffset = nThis.getOffset();
			
			if (whenOffset == null) {
				whenOffset = Duration.ZERO;
			}
			if (thisOffset == null) {
				thisOffset = Duration.ZERO;
			}
			return thisOffset.compareTo(whenOffset) > 0;
		}
		return null;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tests if this temporal is before the specified temporal. Returns null if unknown, e.g. two unrelated events.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated NOT
	 */
	default Boolean before(Temporal when) {
		if (when == null) {
			return false;
		}
		return when.after(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tests if this temporal occurs at the same point on the time-line as the specified temporal. Returns null if unknown, e.g. two unrelated events.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated NOT
	 */
	default Boolean coincides(Temporal when) {
		if (when == null) {
			return false;
		}
		Temporal nWhen = when.normalize();
		Date whenInstant = nWhen.getInstant();
		
		Temporal nThis = normalize();
		Date thisInstant = nThis.getInstant();
		if (whenInstant != null) {
			if (thisInstant == null) {
				return null;
			}
			return thisInstant.equals(whenInstant);
		}
		if (nWhen.getBase() == nThis.getBase()) {
			Duration whenOffset = nWhen.getOffset();
			Duration thisOffset = nThis.getOffset();
			
			if (whenOffset == null) {
				whenOffset = Duration.ZERO;
			}
			if (thisOffset == null) {
				thisOffset = Duration.ZERO;
			}
			return thisOffset.compareTo(whenOffset) == 0;
		}
		return null;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a normalized instance of this temporal not contained in the model. Normalization walks through the temporal chain to the root temporal. If that root temporal is instant/absolute then the normalized instance would be instant/absolute. Otherwise the normalized instance would contain the root temporal as its base and offset would be the sum of all offsets.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated NOT
	 */
	default Temporal normalize() {
		Temporal base = getBase();
		if (base == null) {
			return this;
		}
		Temporal superBase = base.getBase();
		if (superBase == null) {
			Date bInstant = base.getInstant();
			if (bInstant == null) {			
				return this;
			}
			Duration offset = getOffset();
			if (offset == null || offset.equals(Duration.ZERO)) {
				return base;
			}
			Temporal ret;
			if (this instanceof Event) {
				ret = EngineeringFactory.eINSTANCE.createEvent();
				((Event) ret).setName(((Event) this).getName());
			} else {
				ret = EngineeringFactory.eINSTANCE.createTemporal();
			}
			ret.setInstant(new Date(bInstant.toInstant().plus(offset).toEpochMilli()));	
			return ret;
		}
		Temporal nBase = base.normalize();
		Duration offset = getOffset();
		if (offset == null || offset.equals(Duration.ZERO)) {
			return nBase;
		}
		Temporal ret;
		if (this instanceof Event) {
			ret = EngineeringFactory.eINSTANCE.createEvent();
			((Event) ret).setName(((Event) this).getName());
		} else {
			ret = EngineeringFactory.eINSTANCE.createTemporal();
		}
		Date nInstant = nBase.getInstant();
		if (nInstant == null) {
			ret.setBase(nBase.getBase());
			Duration nOffset = nBase.getOffset();
			ret.setOffset(nOffset == null ? offset : offset.plus(nOffset));
		} else {
			ret.setInstant(new Date(nInstant.toInstant().plus(offset).toEpochMilli()));
		}
		return ret;		
	}
	
	static String formatDuration(Duration duration) {
		if (duration == null || duration.equals(Duration.ZERO)) {
			return "Zero";
		}
		
		StringBuilder ret = new StringBuilder();
		long days = duration.toDays();
		if (days != 0) {
			ret.append(days).append(" days");
		}
		long hours = duration.toHoursPart();
		if (hours != 0) {
			if (ret.length() > 0) {
				ret.append(" ");
			}
			ret.append(hours).append(" hours");			
		}		
		long minutes = duration.toMinutesPart();
		if (minutes != 0) {
			if (ret.length() > 0) {
				ret.append(" ");
			}	
			ret.append(minutes).append(" minutes");
		}
		long seconds = duration.toSecondsPart();
		if (seconds != 0) {
			if (ret.length() > 0) {
				ret.append(" ");
			}			
			ret.append(seconds).append(" seconds");
		}
		long nanos = duration.toNanosPart();
		if (nanos != 0) {
			if (ret.length() > 0) {
				ret.append(" ");
			}			
			ret.append(nanos).append(" nanoseconds");
		}
		
		return ret.toString();
	}	

} // Temporal
