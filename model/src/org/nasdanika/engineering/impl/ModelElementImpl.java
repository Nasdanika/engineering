/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ModelElementImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	public String getId() {
		StringBuilder ret = new StringBuilder(eClass().getName()).append("-");
		EObject c = eContainer();
		String cId = c instanceof ModelElement ? ((ModelElement) c).getId() : null;
		if (!Util.isBlank(cId)) {			
			ret.append(cId.substring(cId.indexOf("-") + 1));
		}
		String path = getPath();		
		EReference eContainmentFeature = eContainmentFeature();
		if (c != null && eContainmentFeature != null) {
			if (!ret.toString().endsWith("-")) {
				ret.append("-");
			}
			ret.append(eContainmentFeature().getName());
			if (Util.isBlank(path)) {
				if (eContainmentFeature.isMany()) {
					ret.append("-").append(((List<?>) c.eGet(eContainmentFeature)).indexOf(this));
				}
			}
		}
		if (!Util.isBlank(path)) {
			if (ret.length() > 0 && !ret.toString().endsWith("-")) {
				ret.append("-");
			}

			ret.append(path);
		}
		return ret.toString();
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
			case EngineeringPackage.MODEL_ELEMENT__ID:
				return getId();
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
			case EngineeringPackage.MODEL_ELEMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
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
	
	protected <T extends ModelElement> EList<T> findById(Class<T> type, Collection<String> ids) {
		EList<T> ret = new BasicInternalEList<>(type);
		ids.stream().map(id -> findById(type, id)).forEach(ret::add);
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends ModelElement> T findById(Class<T> type, String id) {
		Resource res = eResource(); 
		if (res != null) {
			ResourceSet rSet = res.getResourceSet();
			TreeIterator<?> cit = rSet == null ? res.getAllContents() : rSet. getAllContents();
			while (cit.hasNext()) {
				Object next = cit.next(); 
				if (type.isInstance(next) && id.equals(((T) next).getId())) {
					return (T) next;
				}
			}
		}
		throw new ConfigurationException("Could not find " + type.getName() + " with id " + id, EObjectAdaptable.adaptTo(this, Marked.class));
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

} //ModelElementImpl
