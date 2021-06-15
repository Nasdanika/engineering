/**
 */
package org.nasdanika.engineering;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Decision#getEffectiveStart <em>Effective Start</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Decision#getEffectiveEnd <em>Effective End</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Decision#getSupercedes <em>Supercedes</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Decision#getSupercededBy <em>Superceded By</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Decision#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getDecision()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/decision.md'"
 * @generated
 */
public interface Decision extends Issue, Aim {
	/**
	 * Returns the value of the '<em><b>Effective Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when this decision goes into effect once it is available (done). If not set, decision goes into effect once it is in a done status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Start</em>' attribute.
	 * @see #setEffectiveStart(Date)
	 * @see org.nasdanika.engineering.EngineeringPackage#getDecision_EffectiveStart()
	 * @model
	 * @generated
	 */
	Date getEffectiveStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Decision#getEffectiveStart <em>Effective Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Start</em>' attribute.
	 * @see #getEffectiveStart()
	 * @generated
	 */
	void setEffectiveStart(Date value);

	/**
	 * Returns the value of the '<em><b>Effective End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when decision stops being in effect if it was in effect before. If not set, the decision is effective indefinitely if it is in a done status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective End</em>' attribute.
	 * @see #setEffectiveEnd(Date)
	 * @see org.nasdanika.engineering.EngineeringPackage#getDecision_EffectiveEnd()
	 * @model
	 * @generated
	 */
	Date getEffectiveEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Decision#getEffectiveEnd <em>Effective End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective End</em>' attribute.
	 * @see #getEffectiveEnd()
	 * @generated
	 */
	void setEffectiveEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Supercedes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Decision}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Decision#getSupercededBy <em>Superceded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decisions which this decision supercedes once (if ever) it goes into effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supercedes</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getDecision_Supercedes()
	 * @see org.nasdanika.engineering.Decision#getSupercededBy
	 * @model opposite="supercededBy"
	 * @generated
	 */
	EList<Decision> getSupercedes();

	/**
	 * Returns the value of the '<em><b>Superceded By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Decision}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Decision#getSupercedes <em>Supercedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decisions which (will) supercede this decision when (if ever) they are effective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Superceded By</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getDecision_SupercededBy()
	 * @see org.nasdanika.engineering.Decision#getSupercedes
	 * @model opposite="supercedes" changeable="false" derived="true"
	 * @generated
	 */
	EList<Decision> getSupercededBy();

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation of what has been decided (decision process outcome).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getDecision_Resolution()
	 * @model
	 * @generated
	 */
	String getResolution();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Decision#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(String value);

} // Decision
