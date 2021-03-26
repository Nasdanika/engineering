/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Module#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getModule()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika documentation-reference='../doc/module.md'"
 * @generated
 */
public interface Module extends EngineeredElement {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModule_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModules();

} // Module
