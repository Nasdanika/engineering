/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineered Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.EngineeredElement#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.EngineeredElement#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika documentation-reference='../doc/engineered-element.md'"
 * @generated
 */
public interface EngineeredElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Issues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Engineer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredElement_Owner()
	 * @model
	 * @generated
	 */
	EList<Engineer> getOwner();

} // EngineeredElement
