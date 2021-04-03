/**
 */
package org.nasdanika.engineering;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Note#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Note#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Note#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Note#getEffort <em>Effort</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Engineer)
	 * @see org.nasdanika.engineering.EngineeringPackage#getNote_Author()
	 * @model
	 * @generated
	 */
	Engineer getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Note#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Engineer value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' reference.
	 * @see #setIncrement(Increment)
	 * @see org.nasdanika.engineering.EngineeringPackage#getNote_Increment()
	 * @model
	 * @generated
	 */
	Increment getIncrement();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Note#getIncrement <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Increment value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.engineering.EngineeringPackage#getNote_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Note#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effort</em>' attribute.
	 * @see #setEffort(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getNote_Effort()
	 * @model
	 * @generated
	 */
	double getEffort();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Note#getEffort <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort</em>' attribute.
	 * @see #getEffort()
	 * @generated
	 */
	void setEffort(double value);

} // Note
