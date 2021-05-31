/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineered Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.EngineeredCapability#getAligns <em>Aligns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredCapability()
 * @model
 * @generated
 */
public interface EngineeredCapability extends Capability, Endeavor {

	/**
	 * Returns the value of the '<em><b>Aligns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Alignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aligns</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredCapability_Aligns()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Alignment> getAligns();
} // EngineeredCapability
