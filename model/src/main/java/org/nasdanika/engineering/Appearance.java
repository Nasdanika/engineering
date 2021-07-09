/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.html.app.SectionStyle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Appearance#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Appearance#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Appearance#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Appearance#getMarkdownDescription <em>Markdown Description</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Appearance#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Appearance#getSectionStyle <em>Section Style</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getAppearance()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/appearance.md'"
 * @generated
 */
public interface Appearance extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Custom text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAppearance_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Appearance#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Icon - image URL if contains slash (``/``). CSS class otherwise, e.g. ``fas fa-user``.  ``none`` to suppress the icon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAppearance_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Appearance#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in HTML to show in the context help modal dialog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAppearance_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Appearance#getDescription <em>Description</em>}' attribute.
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
	 * Description  in [Markdown](https://en.wikipedia.org/wiki/Markdown) to show in the context help modal dialog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Markdown Description</em>' attribute.
	 * @see #setMarkdownDescription(String)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAppearance_MarkdownDescription()
	 * @model
	 * @generated
	 */
	String getMarkdownDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Appearance#getMarkdownDescription <em>Markdown Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markdown Description</em>' attribute.
	 * @see #getMarkdownDescription()
	 * @generated
	 */
	void setMarkdownDescription(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles of the containing element. 
	 * 
	 * Action role for model elements. One of:
	 * 
	 * * ``navigation`` - Navigation actions are shown in the navigation panel as a list or as a tree. 
	 * * ``context`` - Context actions are shown as a tree context menu and as a button toolbar in the content panel.
	 * * ``section`` - Section actions are shown as sections in the content panel. 
	 * * ``content-right`` - Content right actions are shown in an adaptive navigation panel to the right of the action content.
	 * * ``content-left`` - Content left actions are shown in an adaptive  navigation panel to the left of the action content.
	 * 
	 * For members (features and operations) and actions - member/action role. One of:
	 * 
	 * * ``actions`` - Child actions for a member, e.g. a section with a table of an action list.
	 * * ``content`` - Feature value or operation result is shown in the content. 
	 * * ``elements`` - Child action for each feature or operation result element
	 * * ``elements-sorted`` - Child actions for member elements sorted by text
	 * * ``head`` - Feature value or operation result is shown in the content head - above description and sections. 
	 * * ``property`` - Member value/result is shown in the properties table.
	 * 
	 * Action member roles (``acitons``, ``elements``, and ``elements-sorted``) may be followed by a slash (``/``) and then action role.
	 * For example: ``actions/context``.
	 * 
	 * Use ``none`` role to hide feature or model element.
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' attribute list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getAppearance_Roles()
	 * @model
	 * @generated
	 */
	EList<String> getRoles();

	/**
	 * Returns the value of the '<em><b>Section Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Style</em>' attribute.
	 * @see #setSectionStyle(SectionStyle)
	 * @see org.nasdanika.engineering.EngineeringPackage#getAppearance_SectionStyle()
	 * @model dataType="org.nasdanika.engineering.SectionStyle"
	 * @generated
	 */
	SectionStyle getSectionStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Appearance#getSectionStyle <em>Section Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Style</em>' attribute.
	 * @see #getSectionStyle()
	 * @generated
	 */
	void setSectionStyle(SectionStyle value);

} // Appearance
