/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Directory#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getDirectory()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/directory.md'"
 * @generated
 */
public interface Directory extends EngineeredElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Directory elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getDirectory_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElement> getElements();

} // Directory
