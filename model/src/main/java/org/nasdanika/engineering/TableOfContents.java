/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Of Contents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.TableOfContents#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.engineering.TableOfContents#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.nasdanika.engineering.TableOfContents#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getTableOfContents()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/table-of-contents.md'"
 * @generated
 */
public interface TableOfContents extends EObject {
	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Table of contents depth. Zero (default) means unlimited depth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTableOfContents_Depth()
	 * @model
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.TableOfContents#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Table of contents role defines where it is positioned on the page. 
	 * See [Appearance](Appearance.html) for details regarding page parts.
	 * One of the following:
	 * 
	 * * ``content`` - in the content panel, before the document/section text.
	 * * ``content-left`` - Left content panel.
	 * * ``content-right`` - Right content panel.
	 * * ``float-left`` - Floats to the left. Diferent from ``content-left`` which takes the entire column.
	 * * ``float-right`` - Floats to the right. Different from ``content-right`` which takes the entire column.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTableOfContents_Role()
	 * @model annotation="urn:org.nasdanika default-feature='true'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.TableOfContents#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Table of contents header, e.g. ``Contents``. No header by default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTableOfContents_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.TableOfContents#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

} // TableOfContents
