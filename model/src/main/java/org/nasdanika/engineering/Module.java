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
 *   <li>{@link org.nasdanika.engineering.Module#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Module#getDependants <em>Dependants</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Module#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getModule()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/module.md'"
 * @generated
 */
public interface Module extends EngineeredElement, ConnectionSource, ConnectionTarget {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-modules of this module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModule_Modules()
	 * @model containment="true" keys="path"
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modules which this module depends on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModule_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Module> getDependencies();

	/**
	 * Returns the value of the '<em><b>Dependants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived opposite to dependencies - modules which depend on this module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependants</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModule_Dependants()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="urn:org.nasdanika opposite='dependencies'"
	 * @generated
	 */
	EList<Module> getDependants();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModule_Interfaces()
	 * @model containment="true" keys="path"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Interface> getInterfaces();

} // Module
