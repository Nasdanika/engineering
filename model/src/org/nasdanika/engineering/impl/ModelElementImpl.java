/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.ConfigurationException;
import org.nasdanika.common.persistence.Marked;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.TableOfContents;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getMarkdownDescription <em>Markdown Description</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getRepresentations <em>Representations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
	private static final String THIS_PATH = ":this";

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMarkdownDescription() <em>Markdown Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkdownDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKDOWN_DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getUri() {
		String path = getPath();
		if (!Util.isBlank(path) && path.indexOf(':') > 1) {
			// Treating as absolute URI
			return path;
		}
		if (!Util.isBlank(path) && path.startsWith("/")) {
			int idx = path.indexOf("/", 1);
			if (idx == -1) {
				return path.substring(1) + THIS_PATH;
			}
			return path.substring(1, idx) + ":" + path.substring(idx + 1);
		}
		
		EObject c = eContainer();
		if (c instanceof ModelElement) {
			String base = ((ModelElement) c).getUri();
			EReference eContainmentFeature = eContainmentFeature();			
			StringBuilder ret = new StringBuilder();
			if (base.endsWith(THIS_PATH)) {
				ret.append(base.substring(0, base.length() - THIS_PATH.length() + 1));
			} else {
				ret.append(base);
				ret.append("/");
			}
			ret.append(Util.camelToKebab(eContainmentFeature.getName()));
			if (eContainmentFeature.isMany()) {
				if (Util.isBlank(path)) {
					path = getDefaultPath();
				}
				ret.append("/").append(path);
			}
			
			return ret.toString();
		}
		
		return (Util.isBlank(path) ? "engineering" : path) + THIS_PATH;
	}
	
	protected String getDefaultPath() {
		return String.valueOf(((List<?>) eContainer().eGet(eContainmentFeature())).indexOf(this));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return (String)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__PATH, EngineeringPackage.Literals.MODEL_ELEMENT__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		eDynamicSet(EngineeringPackage.MODEL_ELEMENT__PATH, EngineeringPackage.Literals.MODEL_ELEMENT__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__DESCRIPTION, EngineeringPackage.Literals.MODEL_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(EngineeringPackage.MODEL_ELEMENT__DESCRIPTION, EngineeringPackage.Literals.MODEL_ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarkdownDescription() {
		return (String)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__MARKDOWN_DESCRIPTION, EngineeringPackage.Literals.MODEL_ELEMENT__MARKDOWN_DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkdownDescription(String newMarkdownDescription) {
		eDynamicSet(EngineeringPackage.MODEL_ELEMENT__MARKDOWN_DESCRIPTION, EngineeringPackage.Literals.MODEL_ELEMENT__MARKDOWN_DESCRIPTION, newMarkdownDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<NamedElement> getResources() {
		return (EList<NamedElement>)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__RESOURCES, EngineeringPackage.Literals.MODEL_ELEMENT__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelElementAppearance getAppearance() {
		return (ModelElementAppearance)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__APPEARANCE, EngineeringPackage.Literals.MODEL_ELEMENT__APPEARANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(ModelElementAppearance newAppearance, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAppearance, EngineeringPackage.MODEL_ELEMENT__APPEARANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppearance(ModelElementAppearance newAppearance) {
		eDynamicSet(EngineeringPackage.MODEL_ELEMENT__APPEARANCE, EngineeringPackage.Literals.MODEL_ELEMENT__APPEARANCE, newAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableOfContents getTableOfContents() {
		return (TableOfContents)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__TABLE_OF_CONTENTS, EngineeringPackage.Literals.MODEL_ELEMENT__TABLE_OF_CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableOfContents(TableOfContents newTableOfContents, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTableOfContents, EngineeringPackage.MODEL_ELEMENT__TABLE_OF_CONTENTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableOfContents(TableOfContents newTableOfContents) {
		eDynamicSet(EngineeringPackage.MODEL_ELEMENT__TABLE_OF_CONTENTS, EngineeringPackage.Literals.MODEL_ELEMENT__TABLE_OF_CONTENTS, newTableOfContents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Document> getSections() {
		return (EList<Document>)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__SECTIONS, EngineeringPackage.Literals.MODEL_ELEMENT__SECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<NamedElement> getRepresentations() {
		return (EList<NamedElement>)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__REPRESENTATIONS, EngineeringPackage.Literals.MODEL_ELEMENT__REPRESENTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.MODEL_ELEMENT__APPEARANCE:
				return basicSetAppearance(null, msgs);
			case EngineeringPackage.MODEL_ELEMENT__TABLE_OF_CONTENTS:
				return basicSetTableOfContents(null, msgs);
			case EngineeringPackage.MODEL_ELEMENT__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.MODEL_ELEMENT__REPRESENTATIONS:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.MODEL_ELEMENT__URI:
				return getUri();
			case EngineeringPackage.MODEL_ELEMENT__PATH:
				return getPath();
			case EngineeringPackage.MODEL_ELEMENT__DESCRIPTION:
				return getDescription();
			case EngineeringPackage.MODEL_ELEMENT__MARKDOWN_DESCRIPTION:
				return getMarkdownDescription();
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				return getResources();
			case EngineeringPackage.MODEL_ELEMENT__APPEARANCE:
				return getAppearance();
			case EngineeringPackage.MODEL_ELEMENT__TABLE_OF_CONTENTS:
				return getTableOfContents();
			case EngineeringPackage.MODEL_ELEMENT__SECTIONS:
				return getSections();
			case EngineeringPackage.MODEL_ELEMENT__REPRESENTATIONS:
				return getRepresentations();
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
			case EngineeringPackage.MODEL_ELEMENT__PATH:
				setPath((String)newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT__MARKDOWN_DESCRIPTION:
				setMarkdownDescription((String)newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT__APPEARANCE:
				setAppearance((ModelElementAppearance)newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT__TABLE_OF_CONTENTS:
				setTableOfContents((TableOfContents)newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Document>)newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT__REPRESENTATIONS:
				getRepresentations().clear();
				getRepresentations().addAll((Collection<? extends NamedElement>)newValue);
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
			case EngineeringPackage.MODEL_ELEMENT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case EngineeringPackage.MODEL_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EngineeringPackage.MODEL_ELEMENT__MARKDOWN_DESCRIPTION:
				setMarkdownDescription(MARKDOWN_DESCRIPTION_EDEFAULT);
				return;
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				getResources().clear();
				return;
			case EngineeringPackage.MODEL_ELEMENT__APPEARANCE:
				setAppearance((ModelElementAppearance)null);
				return;
			case EngineeringPackage.MODEL_ELEMENT__TABLE_OF_CONTENTS:
				setTableOfContents((TableOfContents)null);
				return;
			case EngineeringPackage.MODEL_ELEMENT__SECTIONS:
				getSections().clear();
				return;
			case EngineeringPackage.MODEL_ELEMENT__REPRESENTATIONS:
				getRepresentations().clear();
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
			case EngineeringPackage.MODEL_ELEMENT__URI:
				return URI_EDEFAULT == null ? getUri() != null : !URI_EDEFAULT.equals(getUri());
			case EngineeringPackage.MODEL_ELEMENT__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case EngineeringPackage.MODEL_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case EngineeringPackage.MODEL_ELEMENT__MARKDOWN_DESCRIPTION:
				return MARKDOWN_DESCRIPTION_EDEFAULT == null ? getMarkdownDescription() != null : !MARKDOWN_DESCRIPTION_EDEFAULT.equals(getMarkdownDescription());
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				return !getResources().isEmpty();
			case EngineeringPackage.MODEL_ELEMENT__APPEARANCE:
				return getAppearance() != null;
			case EngineeringPackage.MODEL_ELEMENT__TABLE_OF_CONTENTS:
				return getTableOfContents() != null;
			case EngineeringPackage.MODEL_ELEMENT__SECTIONS:
				return !getSections().isEmpty();
			case EngineeringPackage.MODEL_ELEMENT__REPRESENTATIONS:
				return !getRepresentations().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public <T> T adaptTo(Class<T> type) {
		return EObjectAdaptable.adaptTo(this, type);
	}
	
	protected <T extends ModelElement> EList<T> findByURI(Class<T> type, Collection<URI> uris) {
		EList<T> ret = new BasicInternalEList<>(type);
		uris.stream().map(uri -> findByURI(type, uri)).forEach(ret::add);
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends ModelElement> T findByURI(Class<T> type, URI uri) {
		Resource res = eResource(); 
		if (res != null) {
			ResourceSet rSet = res.getResourceSet();
			TreeIterator<?> cit = rSet == null ? res.getAllContents() : rSet. getAllContents();
			while (cit.hasNext()) {
				Object next = cit.next(); 
				if (type.isInstance(next) && uri.equals(((T) next).getUri())) {
					return (T) next;
				}
			}
		}
		throw new ConfigurationException("Could not find " + type.getName() + " with uri " + uri, EObjectAdaptable.adaptTo(this, Marked.class));
	}
	
	protected <T extends EObject> EList<T> getReferrers(EReference eReference) {
		return EmfUtil.getReferrers(this, eReference);
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends EObject> EList<T> collect(Predicate<EObject> selector) {
		EList<T> ret = new BasicInternalEList<>(EObject.class);
		Resource res = eResource(); 
		if (res != null) {
			ResourceSet rSet = res.getResourceSet();
			TreeIterator<?> cit = rSet == null ? res.getAllContents() : rSet. getAllContents();
			while (cit.hasNext()) {
				Object next = cit.next(); 
				if (next instanceof EObject && selector.test((EObject) next)) {
					ret.add((T) next);
				}
			}
		}
		return ret;
	}

	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder(super.toString()).append(" [");
		String path = getPath();
		if (!Util.isBlank(path)) {
			ret.append("path = ").append(path);
		}
		return ret.append("]").toString();
	}

} //ModelElementImpl
