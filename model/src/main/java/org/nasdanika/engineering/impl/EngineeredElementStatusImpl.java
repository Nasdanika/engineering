/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.diagram.Connection;
import org.nasdanika.diagram.DiagramElement;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeredElementStatus;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineered Element Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementStatusImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementStatusImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementStatusImpl#getElementStyle <em>Element Style</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.EngineeredElementStatusImpl#getConnectionStyle <em>Connection Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineeredElementStatusImpl extends NamedElementImpl implements EngineeredElementStatus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineeredElementStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EngineeredElementStatus> getChildren() {
		return (EList<EngineeredElementStatus>)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CHILDREN, EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<EngineeredElement> getElements() {
		return getOppositeReferrers(EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS__ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramElement getElementStyle() {
		return (DiagramElement)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE, EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementStyle(DiagramElement newElementStyle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newElementStyle, EngineeringPackage.ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementStyle(DiagramElement newElementStyle) {
		eDynamicSet(EngineeringPackage.ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE, EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE, newElementStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection getConnectionStyle() {
		return (Connection)eDynamicGet(EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE, EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionStyle(Connection newConnectionStyle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newConnectionStyle, EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionStyle(Connection newConnectionStyle) {
		eDynamicSet(EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE, EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE, newConnectionStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE:
				return basicSetElementStyle(null, msgs);
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE:
				return basicSetConnectionStyle(null, msgs);
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
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CHILDREN:
				return getChildren();
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__ELEMENTS:
				return getElements();
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE:
				return getElementStyle();
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE:
				return getConnectionStyle();
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
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends EngineeredElementStatus>)newValue);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE:
				setElementStyle((DiagramElement)newValue);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE:
				setConnectionStyle((Connection)newValue);
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
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CHILDREN:
				getChildren().clear();
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE:
				setElementStyle((DiagramElement)null);
				return;
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE:
				setConnectionStyle((Connection)null);
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
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CHILDREN:
				return !getChildren().isEmpty();
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__ELEMENTS:
				return !getElements().isEmpty();
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__ELEMENT_STYLE:
				return getElementStyle() != null;
			case EngineeringPackage.ENGINEERED_ELEMENT_STATUS__CONNECTION_STYLE:
				return getConnectionStyle() != null;
		}
		return super.eIsSet(featureID);
	}

} //EngineeredElementStatusImpl
