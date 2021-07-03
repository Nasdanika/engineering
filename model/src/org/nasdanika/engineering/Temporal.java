/**
 */
package org.nasdanika.engineering;

import java.time.Duration;
import java.util.Date;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base of this temporal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Temporal)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTemporal_Base()
	 * @model annotation="urn:org.nasdanika exclusive-with='instant'"
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

} // Temporal
