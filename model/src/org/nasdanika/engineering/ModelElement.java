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
 *   <li>{@link org.nasdanika.engineering.ModelElement#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getActions <em>Actions</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement()
 * @model abstract="true" superTypes="org.nasdanika.engineering.Adaptable"
 *        annotation="urn:org.nasdanika documentation-reference='../doc/model-element.md'"
 * @generated
 */
public interface ModelElement extends EObject, Adaptable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element's unique ID. Derived from element type and containment path (parent ID).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Id()
	 * @model id="true" changeable="false" derived="true"
	 * @generated
	 */
	String getId();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element's path to form full element URL. Shall be unique in the containing collection. If blank, derived from element's position in the collection or from the local ID. For named elements can be derived from element name.
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
	 * Description in markdown.
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
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElement> getResources();

} // ModelElement
