/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Connection#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Connection#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Connection#getTargetOperations <em>Target Operations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Connection#getSourceOperations <em>Source Operations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EngineeredElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ConnectionTarget)
	 * @see org.nasdanika.engineering.EngineeringPackage#getConnection_Target()
	 * @model
	 * @generated
	 */
	ConnectionTarget getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ConnectionTarget value);

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see org.nasdanika.engineering.EngineeringPackage#getConnection_Bidirectional()
	 * @model
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Connection#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Operations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target operations used by this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Operations</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getConnection_TargetOperations()
	 * @model
	 * @generated
	 */
	EList<Operation> getTargetOperations();

	/**
	 * Returns the value of the '<em><b>Source Operations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source operations used by this connection if it is bi-directional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Operations</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getConnection_SourceOperations()
	 * @model
	 * @generated
	 */
	EList<Operation> getSourceOperations();

} // Connection
