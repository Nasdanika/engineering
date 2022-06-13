/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Operation is something that its containing engineered element "can do".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Operation#getCalls <em>Calls</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Operation#getInvocations <em>Invocations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Operation#getExportedBy <em>Exported By</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Operation#getUsedBy <em>Used By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EngineeredElement {
	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calls to other operations from this operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getOperation_Calls()
	 * @model containment="true" keys="path" transient="true" derived="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Call> getCalls();

	/**
	 * Returns the value of the '<em><b>Invocations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calls of this operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invocations</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getOperation_Invocations()
	 * @model
	 * @generated
	 */
	EList<Call> getInvocations();

	/**
	 * Returns the value of the '<em><b>Exported By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.ConnectionTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calls of this operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exported By</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getOperation_ExportedBy()
	 * @model annotation="urn:org.nasdanika opposite='exports'"
	 * @generated
	 */
	EList<ConnectionTarget> getExportedBy();

	/**
	 * Returns the value of the '<em><b>Used By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connections using this operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used By</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getOperation_UsedBy()
	 * @model
	 * @generated
	 */
	EList<Connection> getUsedBy();

} // Operation
