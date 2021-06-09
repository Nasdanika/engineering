/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Document#getSections <em>Sections</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Document#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Document#getMarkdownContent <em>Markdown Content</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Document#isTableOfContents <em>Table Of Contents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getDocument()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/document.md'"
 * @generated
 */
public interface Document extends EngineeredElement {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document sections which are also documents, i.e. sections can be nested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getDocument_Sections()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Document> getSections();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document/section content in HTML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getDocument_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Document#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document/section content in [Markdown](https://en.wikipedia.org/wiki/Markdown).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Markdown Content</em>' attribute.
	 * @see #setMarkdownContent(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getDocument_MarkdownContent()
	 * @model
	 * @generated
	 */
	String getMarkdownContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Document#getMarkdownContent <em>Markdown Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markdown Content</em>' attribute.
	 * @see #getMarkdownContent()
	 * @generated
	 */
	void setMarkdownContent(String value);

	/**
	 * Returns the value of the '<em><b>Table Of Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A table of contents is generated if this attribute is set to true. Table of contents placement can be customized via appearance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Of Contents</em>' attribute.
	 * @see #setTableOfContents(boolean)
	 * @see org.nasdanika.engineering.EngineeringPackage#getDocument_TableOfContents()
	 * @model
	 * @generated
	 */
	boolean isTableOfContents();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Document#isTableOfContents <em>Table Of Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Of Contents</em>' attribute.
	 * @see #isTableOfContents()
	 * @generated
	 */
	void setTableOfContents(boolean value);

} // Document
