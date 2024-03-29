/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Aim#getAlignments <em>Alignments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getAim()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/aim.md'"
 * @generated
 */
public interface Aim extends NamedElement, Alignable {
	/**
	 * Returns the value of the '<em><b>Alignments</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Alignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alignments to this aim. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignments</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getAim_Alignments()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="urn:org.nasdanika opposite='aim'"
	 * @generated
	 */
	EList<Alignment> getAlignments();

} // Aim
