/**
 */
package org.nasdanika.engineering;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Document#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Document#getMarkdownContent <em>Markdown Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getDocument()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/document.md'"
 * @generated
 */
public interface Document extends EngineeredElement {
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

} // Document
