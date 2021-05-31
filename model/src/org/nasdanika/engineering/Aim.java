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
 *   <li>{@link org.nasdanika.engineering.Aim#getAligns <em>Aligns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getAim()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/aim.md'"
 * @generated
 */
public interface Aim extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Alignments</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Alignment}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Alignment#getAim <em>Aim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alignments to this aim. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignments</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getAim_Alignments()
	 * @see org.nasdanika.engineering.Alignment#getAim
	 * @model opposite="aim" derived="true"
	 * @generated
	 */
	EList<Alignment> getAlignments();

	/**
	 * Returns the value of the '<em><b>Aligns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Alignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Higher level aims to which this aim aligns. E.g. a module level principle may align to organization pirinciples.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aligns</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getAim_Aligns()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Alignment> getAligns();

} // Aim
