/**
 */
package org.nasdanika.engineering;

import org.nasdanika.diagram.Diagram;
import org.nasdanika.exec.Call;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Representation#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getRepresentation()
 * @model
 * @generated
 */
public interface Representation extends Diagram {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference.
	 * @see #setGenerator(Call)
	 * @see org.nasdanika.engineering.EngineeringPackage#getRepresentation_Generator()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	Call getGenerator();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Representation#getGenerator <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' containment reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Call value);

} // Representation
