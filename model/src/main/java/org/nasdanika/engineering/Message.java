/**
 */
package org.nasdanika.engineering;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Message#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Message#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getMessage()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/message.md'"
 * @generated
 */
public interface Message extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/time when this message was posted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.engineering.EngineeringPackage#getMessage_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Message#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message author.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Engineer)
	 * @see org.nasdanika.engineering.EngineeringPackage#getMessage_Author()
	 * @model annotation="urn:org.nasdanika opposite='messages'"
	 * @generated
	 */
	Engineer getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Message#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Engineer value);

} // Message
