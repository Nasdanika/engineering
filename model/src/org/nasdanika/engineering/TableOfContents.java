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
 *   <li>{@link org.nasdanika.engineering.TableOfContents#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.nasdanika.engineering.TableOfContents#isTooltips <em>Tooltips</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getTableOfContents()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/table-of-contents.md'"
 * @generated
 */
public interface TableOfContents extends EObject {
	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTableOfContents_Depth()
	 * @model default="-1"
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
	 * Returns the value of the '<em><b>Tooltips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltips</em>' attribute.
	 * @see #setTooltips(boolean)
	 * @see org.nasdanika.engineering.EngineeringPackage#getTableOfContents_Tooltips()
	 * @model
	 * @generated
	 */
	boolean isTooltips();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.TableOfContents#isTooltips <em>Tooltips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltips</em>' attribute.
	 * @see #isTooltips()
	 * @generated
	 */
	void setTooltips(boolean value);

} // TableOfContents
