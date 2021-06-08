/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.TableOfContents;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.DocumentImpl#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.DocumentImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.DocumentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.DocumentImpl#getMarkdownContent <em>Markdown Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends EngineeredElementImpl implements Document {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMarkdownContent() <em>Markdown Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkdownContent()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKDOWN_CONTENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableOfContents getTableOfContents() {
		return (TableOfContents)eDynamicGet(EngineeringPackage.DOCUMENT__TABLE_OF_CONTENTS, EngineeringPackage.Literals.DOCUMENT__TABLE_OF_CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableOfContents(TableOfContents newTableOfContents, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTableOfContents, EngineeringPackage.DOCUMENT__TABLE_OF_CONTENTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableOfContents(TableOfContents newTableOfContents) {
		eDynamicSet(EngineeringPackage.DOCUMENT__TABLE_OF_CONTENTS, EngineeringPackage.Literals.DOCUMENT__TABLE_OF_CONTENTS, newTableOfContents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Document> getSections() {
		return (EList<Document>)eDynamicGet(EngineeringPackage.DOCUMENT__SECTIONS, EngineeringPackage.Literals.DOCUMENT__SECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return (String)eDynamicGet(EngineeringPackage.DOCUMENT__CONTENT, EngineeringPackage.Literals.DOCUMENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		eDynamicSet(EngineeringPackage.DOCUMENT__CONTENT, EngineeringPackage.Literals.DOCUMENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarkdownContent() {
		return (String)eDynamicGet(EngineeringPackage.DOCUMENT__MARKDOWN_CONTENT, EngineeringPackage.Literals.DOCUMENT__MARKDOWN_CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkdownContent(String newMarkdownContent) {
		eDynamicSet(EngineeringPackage.DOCUMENT__MARKDOWN_CONTENT, EngineeringPackage.Literals.DOCUMENT__MARKDOWN_CONTENT, newMarkdownContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.DOCUMENT__TABLE_OF_CONTENTS:
				return basicSetTableOfContents(null, msgs);
			case EngineeringPackage.DOCUMENT__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.DOCUMENT__TABLE_OF_CONTENTS:
				return getTableOfContents();
			case EngineeringPackage.DOCUMENT__SECTIONS:
				return getSections();
			case EngineeringPackage.DOCUMENT__CONTENT:
				return getContent();
			case EngineeringPackage.DOCUMENT__MARKDOWN_CONTENT:
				return getMarkdownContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EngineeringPackage.DOCUMENT__TABLE_OF_CONTENTS:
				setTableOfContents((TableOfContents)newValue);
				return;
			case EngineeringPackage.DOCUMENT__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Document>)newValue);
				return;
			case EngineeringPackage.DOCUMENT__CONTENT:
				setContent((String)newValue);
				return;
			case EngineeringPackage.DOCUMENT__MARKDOWN_CONTENT:
				setMarkdownContent((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EngineeringPackage.DOCUMENT__TABLE_OF_CONTENTS:
				setTableOfContents((TableOfContents)null);
				return;
			case EngineeringPackage.DOCUMENT__SECTIONS:
				getSections().clear();
				return;
			case EngineeringPackage.DOCUMENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case EngineeringPackage.DOCUMENT__MARKDOWN_CONTENT:
				setMarkdownContent(MARKDOWN_CONTENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EngineeringPackage.DOCUMENT__TABLE_OF_CONTENTS:
				return getTableOfContents() != null;
			case EngineeringPackage.DOCUMENT__SECTIONS:
				return !getSections().isEmpty();
			case EngineeringPackage.DOCUMENT__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case EngineeringPackage.DOCUMENT__MARKDOWN_CONTENT:
				return MARKDOWN_CONTENT_EDEFAULT == null ? getMarkdownContent() != null : !MARKDOWN_CONTENT_EDEFAULT.equals(getMarkdownContent());
		}
		return super.eIsSet(featureID);
	}

} //DocumentImpl
