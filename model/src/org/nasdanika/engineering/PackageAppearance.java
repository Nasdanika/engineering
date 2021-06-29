/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.EngineeringAppearance#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeringAppearance()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/engineering-appearance.md'"
 * @generated
 */
public interface EngineeringAppearance extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.engineering.ModelElementAppearance},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping of model element EClass names in kebab case to model element appearance.
	 * E.g. for ``IssueStatus`` appearance specification will look like:
	 * 
	 * ```yaml
	 * model-elements:
	 *     issue-status:
	 *         roles: context
	 * ```
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Elements</em>' map.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeringAppearance_ModelElements()
	 * @model mapType="org.nasdanika.engineering.ModelElementAppearanceEntry&lt;org.eclipse.emf.ecore.EString, org.nasdanika.engineering.ModelElementAppearance&gt;"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EMap<String, ModelElementAppearance> getModelElements();

} // EngineeringAppearance
