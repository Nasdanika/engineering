/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.nasdanika.common.Adaptable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getUri <em>Uri</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getMarkdownDescription <em>Markdown Description</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getActions <em>Actions</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getAppearance <em>Appearance</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement()
 * @model abstract="true" superTypes="org.nasdanika.engineering.Adaptable"
 *        annotation="urn:org.nasdanika documentation-reference='doc/model-element.md'"
 * @generated
 */
public interface ModelElement extends EObject, Adaptable {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element's URI is derived from ``path``, container URI, and containment reference. URI is used for cross-referencing of elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Uri()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element's path to form full element URI and URL. Shall be unique in the containing collection. If blank, derived from element's position in the collection. For named elements is derived from element name.
	 * Element URL is formed by adding ``.html`` extension to the path if the model element's EClass doesn't have containment references and as such the element may not have children, and by adding ``/index.html`` otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Path()
	 * @model annotation="urn:org.nasdanika load-key='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.ModelElement#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in HTML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.ModelElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Markdown Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in [Markdown](https://en.wikipedia.org/wiki/Markdown).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Markdown Description</em>' attribute.
	 * @see #setMarkdownDescription(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_MarkdownDescription()
	 * @model
	 * @generated
	 */
	String getMarkdownDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.ModelElement#getMarkdownDescription <em>Markdown Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markdown Description</em>' attribute.
	 * @see #getMarkdownDescription()
	 * @generated
	 */
	void setMarkdownDescription(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTML actions to be mounted under the element action in generated site.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getActions();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources associated with the element, e.g. documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElement> getResources();

	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference.
	 * @see #setAppearance(ModelElementAppearance)
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Appearance()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	ModelElementAppearance getAppearance();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.ModelElement#getAppearance <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' containment reference.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(ModelElementAppearance value);

} // ModelElement
