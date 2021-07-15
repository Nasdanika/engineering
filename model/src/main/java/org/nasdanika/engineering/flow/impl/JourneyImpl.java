/**
 */
package org.nasdanika.engineering.flow.impl;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.flow.Journey;
import org.nasdanika.engineering.flow.JourneyElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.flow.impl.JourneyImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.flow.impl.JourneyImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.nasdanika.engineering.flow.impl.JourneyImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.nasdanika.engineering.flow.impl.JourneyImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.nasdanika.engineering.flow.impl.JourneyImpl#getAllElements <em>All Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyImpl extends ActivityImpl implements Journey {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.JOURNEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<JourneyElement> getElements() {
		return (EList<JourneyElement>)eDynamicGet(FlowPackage.JOURNEY__ELEMENTS, FlowPackage.Literals.JOURNEY__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Journey getExtends() {
		return (Journey)eDynamicGet(FlowPackage.JOURNEY__EXTENDS, FlowPackage.Literals.JOURNEY__EXTENDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journey basicGetExtends() {
		return (Journey)eDynamicGet(FlowPackage.JOURNEY__EXTENDS, FlowPackage.Literals.JOURNEY__EXTENDS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(Journey newExtends, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExtends, FlowPackage.JOURNEY__EXTENDS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtends(Journey newExtends) {
		eDynamicSet(FlowPackage.JOURNEY__EXTENDS, FlowPackage.Literals.JOURNEY__EXTENDS, newExtends);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Journey> getExtensions() {
		return getOppositeReferrers(FlowPackage.Literals.JOURNEY__EXTENSIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Journey getRoot() {
		Journey base = getExtends();
		if (base == null) {
			return null;
		}
		Journey baseRoot = base.getRoot();
		return baseRoot == null ? base : baseRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journey basicGetRoot() {
		return (Journey)eDynamicGet(FlowPackage.JOURNEY__ROOT, FlowPackage.Literals.JOURNEY__ROOT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<JourneyElement> getAllElements() {
		Map<String,JourneyElement> elementTable = new LinkedHashMap<>();
		Journey base = getExtends(); 
		if (base != null) {
			for (JourneyElement je: base.getAllElements()) { 
				elementTable.put(je.getPath(), je);
			}
		}
		for (JourneyElement je: getElements()) { 
			if (je.getModifiers().contains(JourneyElement.SUPPRESS)) {
				elementTable.remove(je.getPath());
			} else {
				elementTable.put(je.getPath(), je);
			}
		}
		return ECollections.newBasicEList(elementTable.values());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.JOURNEY__EXTENDS:
				Journey extends_ = basicGetExtends();
				if (extends_ != null)
					msgs = ((InternalEObject)extends_).eInverseRemove(this, FlowPackage.JOURNEY__EXTENSIONS, Journey.class, msgs);
				return basicSetExtends((Journey)otherEnd, msgs);
			case FlowPackage.JOURNEY__EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.JOURNEY__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case FlowPackage.JOURNEY__EXTENDS:
				return basicSetExtends(null, msgs);
			case FlowPackage.JOURNEY__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.JOURNEY__ELEMENTS:
				return getElements();
			case FlowPackage.JOURNEY__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case FlowPackage.JOURNEY__EXTENSIONS:
				return getExtensions();
			case FlowPackage.JOURNEY__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case FlowPackage.JOURNEY__ALL_ELEMENTS:
				return getAllElements();
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
			case FlowPackage.JOURNEY__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends JourneyElement>)newValue);
				return;
			case FlowPackage.JOURNEY__EXTENDS:
				setExtends((Journey)newValue);
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
			case FlowPackage.JOURNEY__ELEMENTS:
				getElements().clear();
				return;
			case FlowPackage.JOURNEY__EXTENDS:
				setExtends((Journey)null);
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
			case FlowPackage.JOURNEY__ELEMENTS:
				return !getElements().isEmpty();
			case FlowPackage.JOURNEY__EXTENDS:
				return basicGetExtends() != null;
			case FlowPackage.JOURNEY__EXTENSIONS:
				return !getExtensions().isEmpty();
			case FlowPackage.JOURNEY__ROOT:
				return basicGetRoot() != null;
			case FlowPackage.JOURNEY__ALL_ELEMENTS:
				return !getAllElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JourneyImpl
