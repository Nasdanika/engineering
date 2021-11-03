/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
import org.nasdanika.diagram.Diagram;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.emf.persistence.FeatureCache;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ModelElement;
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
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getRepresentations <em>Representations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends org.nasdanika.ncore.impl.ModelElementImpl implements ModelElement {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;
	private static final String THIS_PATH = ":this";

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

	protected String getDefaultPath() {
		return String.valueOf(((List<?>) eContainer().eGet(eContainmentFeature())).indexOf(this));
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__DOCUMENTATION, EngineeringPackage.Literals.MODEL_ELEMENT__DOCUMENTATION, true, true);
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
	public EList<Diagram> getRepresentations() {
		return (EList<Diagram>)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__REPRESENTATIONS, EngineeringPackage.Literals.MODEL_ELEMENT__REPRESENTATIONS, true, true);
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
			case EngineeringPackage.MODEL_ELEMENT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.MODEL_ELEMENT__PATH:
				return getPath();
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				return getResources();
			case EngineeringPackage.MODEL_ELEMENT__DOCUMENTATION:
				return getDocumentation();
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
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
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
				getRepresentations().addAll((Collection<? extends Diagram>)newValue);
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
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				getResources().clear();
				return;
			case EngineeringPackage.MODEL_ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
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
			case EngineeringPackage.MODEL_ELEMENT__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				return !getResources().isEmpty();
			case EngineeringPackage.MODEL_ELEMENT__DOCUMENTATION:
				return !getDocumentation().isEmpty();
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
	
//	protected <T extends ModelElement> EList<T> findByURI(Class<T> type, Collection<URI> uris) {
//		EList<T> ret = new BasicInternalEList<>(type);
//		uris.stream().map(uri -> findByURI(type, uri)).forEach(ret::add);
//		return ret;
//	}
//	
//	@SuppressWarnings("unchecked")
//	protected <T extends ModelElement> T findByURI(Class<T> type, URI uri) {
//		Resource res = eResource(); 
//		if (res != null) {
//			ResourceSet rSet = res.getResourceSet();
//			TreeIterator<?> cit = rSet == null ? res.getAllContents() : rSet. getAllContents();
//			while (cit.hasNext()) {
//				Object next = cit.next(); 
//				if (type.isInstance(next) && uri.toString().equals(((T) next).getUri())) {
//					return (T) next;
//				}
//			}
//		}
//		throw new ConfigurationException("Could not find " + type.getName() + " with uri " + uri, EObjectAdaptable.adaptTo(this, Marked.class));
//	}

	/**
	 * Get and caches a list of all objects in the resource set which point to this 
	 * object with the provided {@link EReference}'s opposite.
	 * @param <T>
	 * @param eReference
	 * @return
	 */
	protected <T extends EObject> EList<T> getOppositeReferrers(EReference reference, EReference opposite) {
		return FeatureCache.get(this, Objects.requireNonNull(reference, "Reference is null"), (target, ref) -> getReferrers(Objects.requireNonNull(opposite, "Opposite is null")), true);
	}

	/**
	 * Get and caches a list of all objects in the resource set which point to this 
	 * object with the provided {@link EReference}'s opposite.
	 * @param <T>
	 * @param eReference
	 * @return
	 */
	protected <T extends EObject> EList<T> getOppositeReferrers(EReference eReference) {
		return getOppositeReferrers(eReference, Objects.requireNonNull(eReference.getEOpposite(), "No opposite for " + eReference));
	}
	
	/**
	 * Traverses the resource set and finds all objects referring this one via the provided reference. 
	 * @param <T>
	 * @param eReference
	 * @return
	 */
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
