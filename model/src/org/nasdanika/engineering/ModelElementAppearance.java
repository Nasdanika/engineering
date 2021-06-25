/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.ModelElementAppearance#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElementAppearance#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElementAppearance#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getModelElementAppearance()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/model-element-appearance.md'"
 * @generated
 */
public interface ModelElementAppearance extends Appearance {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.engineering.MemberAppearance},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping of feature names in kebab case to feature appearance.
	 * E.g. for ``issueCategories`` feature mapping specification will look like:
	 * 
	 * ```yaml
	 * features:
	 *     issue-categories:
	 *         roles: context
	 * ```
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' map.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElementAppearance_Features()
	 * @model mapType="org.nasdanika.engineering.MemberAppearanceEntry&lt;org.eclipse.emf.ecore.EString, org.nasdanika.engineering.MemberAppearance&gt;"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EMap<String, MemberAppearance> getFeatures();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.engineering.MemberAppearance},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping of operation names in kebab case to operation appearance.
	 * E.g. for ``allInvocations`` operation mapping specification will look like:
	 * 
	 * ```yaml
	 * operations:
	 *     all-invocations:
	 *         roles: context
	 * ```
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operations</em>' map.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElementAppearance_Operations()
	 * @model mapType="org.nasdanika.engineering.MemberAppearanceEntry&lt;org.eclipse.emf.ecore.EString, org.nasdanika.engineering.MemberAppearance&gt;"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EMap<String, MemberAppearance> getOperations();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.engineering.Appearance},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping of UI action names.
	 * E.g. for ``diagnostic-summary`` action mapping specification will look like:
	 * 
	 * ```yaml
	 * actions:
	 *     diagnostic-summary:
	 *         roles: context
	 * ```
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actions</em>' map.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElementAppearance_Actions()
	 * @model mapType="org.nasdanika.engineering.AppearanceEntry&lt;org.eclipse.emf.ecore.EString, org.nasdanika.engineering.Appearance&gt;"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EMap<String, Appearance> getActions();

} // ModelElementAppearance
