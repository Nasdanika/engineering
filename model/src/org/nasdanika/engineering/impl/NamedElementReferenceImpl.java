/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.NamedElementReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.NamedElementReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedElementReferenceImpl extends NamedElementImpl implements NamedElementReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.NAMED_ELEMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getTarget() {
		return (NamedElement)eDynamicGet(EngineeringPackage.NAMED_ELEMENT_REFERENCE__TARGET, EngineeringPackage.Literals.NAMED_ELEMENT_REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetTarget() {
		return (NamedElement)eDynamicGet(EngineeringPackage.NAMED_ELEMENT_REFERENCE__TARGET, EngineeringPackage.Literals.NAMED_ELEMENT_REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(NamedElement newTarget) {
		eDynamicSet(EngineeringPackage.NAMED_ELEMENT_REFERENCE__TARGET, EngineeringPackage.Literals.NAMED_ELEMENT_REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.NAMED_ELEMENT_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EngineeringPackage.NAMED_ELEMENT_REFERENCE__TARGET:
				setTarget((NamedElement)newValue);
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
			case EngineeringPackage.NAMED_ELEMENT_REFERENCE__TARGET:
				setTarget((NamedElement)null);
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
			case EngineeringPackage.NAMED_ELEMENT_REFERENCE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //NamedElementReferenceImpl
