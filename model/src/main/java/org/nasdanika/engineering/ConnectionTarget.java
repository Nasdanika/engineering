/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.ConnectionTarget#getInboundConnections <em>Inbound Connections</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getConnectionTarget()
 * @model
 * @generated
 */
public interface ConnectionTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Inbound Connections</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Connections</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getConnectionTarget_InboundConnections()
	 * @model changeable="false" derived="true"
	 * @generated NOT
	 */
	EList<Connection> getInboundConnections();

} // ConnectionTarget
