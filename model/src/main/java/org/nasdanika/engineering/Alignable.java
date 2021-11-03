/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alignable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Alignable#getAligns <em>Aligns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getAlignable()
 * @model interface="true" abstract="true"
 *        annotation="urn:org.nasdanika documentation-reference='doc/alignable.md'"
 * @generated
 */
public interface Alignable extends EObject {
	/**
	 * Returns the value of the '<em><b>Aligns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Alignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aims to which this alignable aligns. E.g. a module level principle may align to organization pirinciples.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aligns</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getAlignable_Aligns()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Alignment> getAligns();

} // Alignable
