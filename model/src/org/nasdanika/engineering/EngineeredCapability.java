/**
 */
package org.nasdanika.engineering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineered Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.EngineeredCapability#getCompletion <em>Completion</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredCapability()
 * @model
 * @generated
 */
public interface EngineeredCapability extends Capability {

	/**
	 * Returns the value of the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredCapability_Completion()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	double getCompletion();
} // EngineeredCapability
