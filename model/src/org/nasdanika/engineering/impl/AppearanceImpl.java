/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.engineering.Appearance;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appearance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.AppearanceImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.AppearanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.AppearanceImpl#getMarkdownDescription <em>Markdown Description</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.AppearanceImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AppearanceImpl extends MinimalEObjectImpl.Container implements Appearance {
	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

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
	protected AppearanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.APPEARANCE;
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
	 * @generated
	 */
	@Override
	public String getIcon() {
		return (String)eDynamicGet(EngineeringPackage.APPEARANCE__ICON, EngineeringPackage.Literals.APPEARANCE__ICON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(String newIcon) {
		eDynamicSet(EngineeringPackage.APPEARANCE__ICON, EngineeringPackage.Literals.APPEARANCE__ICON, newIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(EngineeringPackage.APPEARANCE__DESCRIPTION, EngineeringPackage.Literals.APPEARANCE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(EngineeringPackage.APPEARANCE__DESCRIPTION, EngineeringPackage.Literals.APPEARANCE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarkdownDescription() {
		return (String)eDynamicGet(EngineeringPackage.APPEARANCE__MARKDOWN_DESCRIPTION, EngineeringPackage.Literals.APPEARANCE__MARKDOWN_DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkdownDescription(String newMarkdownDescription) {
		eDynamicSet(EngineeringPackage.APPEARANCE__MARKDOWN_DESCRIPTION, EngineeringPackage.Literals.APPEARANCE__MARKDOWN_DESCRIPTION, newMarkdownDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getRoles() {
		return (EList<String>)eDynamicGet(EngineeringPackage.APPEARANCE__ROLES, EngineeringPackage.Literals.APPEARANCE__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.APPEARANCE__ICON:
				return getIcon();
			case EngineeringPackage.APPEARANCE__DESCRIPTION:
				return getDescription();
			case EngineeringPackage.APPEARANCE__MARKDOWN_DESCRIPTION:
				return getMarkdownDescription();
			case EngineeringPackage.APPEARANCE__ROLES:
				return getRoles();
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
			case EngineeringPackage.APPEARANCE__ICON:
				setIcon((String)newValue);
				return;
			case EngineeringPackage.APPEARANCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EngineeringPackage.APPEARANCE__MARKDOWN_DESCRIPTION:
				setMarkdownDescription((String)newValue);
				return;
			case EngineeringPackage.APPEARANCE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends String>)newValue);
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
			case EngineeringPackage.APPEARANCE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case EngineeringPackage.APPEARANCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EngineeringPackage.APPEARANCE__MARKDOWN_DESCRIPTION:
				setMarkdownDescription(MARKDOWN_DESCRIPTION_EDEFAULT);
				return;
			case EngineeringPackage.APPEARANCE__ROLES:
				getRoles().clear();
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
			case EngineeringPackage.APPEARANCE__ICON:
				return ICON_EDEFAULT == null ? getIcon() != null : !ICON_EDEFAULT.equals(getIcon());
			case EngineeringPackage.APPEARANCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case EngineeringPackage.APPEARANCE__MARKDOWN_DESCRIPTION:
				return MARKDOWN_DESCRIPTION_EDEFAULT == null ? getMarkdownDescription() != null : !MARKDOWN_DESCRIPTION_EDEFAULT.equals(getMarkdownDescription());
			case EngineeringPackage.APPEARANCE__ROLES:
				return !getRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppearanceImpl
