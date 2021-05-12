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
 *   <li>{@link org.nasdanika.engineering.Note#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Note#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Note#getCost <em>Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Note#getRemainingEffort <em>Remaining Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Note#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Note#getStatus <em>Status</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getNote_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Note#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Remaining Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Effort</em>' attribute.
	 * @see #setRemainingEffort(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getNote_RemainingEffort()
	 * @model
	 * @generated
	 */
	double getRemainingEffort();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Note#getRemainingEffort <em>Remaining Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Effort</em>' attribute.
	 * @see #getRemainingEffort()
	 * @generated
	 */
	void setRemainingEffort(double value);

	/**
	 * Returns the value of the '<em><b>Remaining Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Cost</em>' attribute.
	 * @see #setRemainingCost(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getNote_RemainingCost()
	 * @model
	 * @generated
	 */
	double getRemainingCost();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Note#getRemainingCost <em>Remaining Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Cost</em>' attribute.
	 * @see #getRemainingCost()
	 * @generated
	 */
	void setRemainingCost(double value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(IssueStatus)
	 * @see org.nasdanika.engineering.EngineeringPackage#getNote_Status()
	 * @model annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	IssueStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Note#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IssueStatus value);

} // Note
