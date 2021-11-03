/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.diagram.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getSections <em>Sections</em>}</li>
 *   <li>{@link org.nasdanika.engineering.ModelElement#getRepresentations <em>Representations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika documentation-reference='doc/model-element.md'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='path'"
 * @generated
 */
public interface ModelElement extends org.nasdanika.ncore.ModelElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources associated with the element, e.g. documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Path()
	 * @model
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
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Of Contents</em>' containment reference.
	 * @see #setTableOfContents(TableOfContents)
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_TableOfContents()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	TableOfContents getTableOfContents();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.ModelElement#getTableOfContents <em>Table Of Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Of Contents</em>' containment reference.
	 * @see #getTableOfContents()
	 * @generated
	 */
	void setTableOfContents(TableOfContents value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sections for model element descriptions. In documents sections apply to the document content, i.e. document descriptions cannot have sections. Sections can be nested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Sections()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Document> getSections();

	/**
	 * Returns the value of the '<em><b>Representations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.diagram.Diagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pluggable representations of a model element, e.g. a component diagram for engineers and modules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representations</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getModelElement_Representations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Diagram> getRepresentations();

} // ModelElement
