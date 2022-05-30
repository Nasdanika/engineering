/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.ConnectionSource#getOutboundConnections <em>Outbound Connections</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getConnectionSource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ConnectionSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Outbound Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Connections</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getConnectionSource_OutboundConnections()
	 * @model containment="true" keys="path"
	 * @generated
	 */
	EList<Connection> getOutboundConnections();

} // ConnectionSource
