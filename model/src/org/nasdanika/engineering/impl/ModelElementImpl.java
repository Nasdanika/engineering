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
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.NamedElement;

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
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
	private static final String THIS_AUTHORITY = "://this";

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
		if (!Util.isBlank(path) && path.startsWith("/")) {
			return path.substring(1) + THIS_AUTHORITY;			
		}
		
		EObject c = eContainer();
		if (c instanceof ModelElement) {
			String base = ((ModelElement) c).getUri();
			EReference eContainmentFeature = eContainmentFeature();			
			StringBuilder ret = new StringBuilder();
			if (base.endsWith(THIS_AUTHORITY)) {
				ret.append(base.substring(0, base.length() - THIS_AUTHORITY.length() + 2));
			} else {
				ret.append(base);
			}
			ret.append("/").append(Util.camelToKebab(eContainmentFeature.getName()));
			if (eContainmentFeature.isMany()) {
				if (Util.isBlank(path)) {
					path = String.valueOf(((List<?>) c.eGet(eContainmentFeature)).indexOf(this));
				}
				ret.append("/").append(path);
			}
			
			return ret.toString();
		}
		
		return (Util.isBlank(path) ? "engineering" : path) + THIS_AUTHORITY;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getActions() {
		return (EList<EObject>)eDynamicGet(EngineeringPackage.MODEL_ELEMENT__ACTIONS, EngineeringPackage.Literals.MODEL_ELEMENT__ACTIONS, true, true);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.MODEL_ELEMENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.MODEL_ELEMENT__ACTIONS:
				return getActions();
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				return getResources();
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
			case EngineeringPackage.MODEL_ELEMENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends EObject>)newValue);
				return;
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends NamedElement>)newValue);
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
			case EngineeringPackage.MODEL_ELEMENT__ACTIONS:
				getActions().clear();
				return;
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				getResources().clear();
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
			case EngineeringPackage.MODEL_ELEMENT__ACTIONS:
				return !getActions().isEmpty();
			case EngineeringPackage.MODEL_ELEMENT__RESOURCES:
				return !getResources().isEmpty();
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
	
	@SuppressWarnings("unchecked")
	protected <T extends EObject> EList<T> getReferrers(EReference eReference) {
		EList<T> ret = new BasicInternalEList<>(EObject.class);
		Resource res = eResource(); 
		if (res != null) {
			ResourceSet rSet = res.getResourceSet();
			TreeIterator<?> cit = rSet == null ? res.getAllContents() : rSet. getAllContents();
			while (cit.hasNext()) {
				Object next = cit.next(); 
				if (eReference.getEContainingClass().isInstance(next)) {
					Object value = ((EObject) next).eGet(eReference);
					if (eReference.isMany()) {
						if (((Collection<?>) value).contains(this)) {
							ret.add((T) next);
						}
					} else if (value == this) {
						ret.add((T) next);
					}					
				}
			}
		}
		return ret;
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
	

} //ModelElementImpl
