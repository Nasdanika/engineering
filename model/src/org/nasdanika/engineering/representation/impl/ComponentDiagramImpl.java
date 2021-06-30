/**
 */
package org.nasdanika.engineering.representation.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.impl.NamedElementImpl;

import org.nasdanika.engineering.representation.ComponentDiagram;
import org.nasdanika.engineering.representation.RepresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.representation.impl.ComponentDiagramImpl#getDepthOut <em>Depth Out</em>}</li>
 *   <li>{@link org.nasdanika.engineering.representation.impl.ComponentDiagramImpl#getDepthIn <em>Depth In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDiagramImpl extends NamedElementImpl implements ComponentDiagram {
	/**
	 * The default value of the '{@link #getDepthOut() <em>Depth Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthOut()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_OUT_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getDepthIn() <em>Depth In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthIn()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_IN_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepresentationPackage.Literals.COMPONENT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDepthOut() {
		return (Integer)eDynamicGet(RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_OUT, RepresentationPackage.Literals.COMPONENT_DIAGRAM__DEPTH_OUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepthOut(int newDepthOut) {
		eDynamicSet(RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_OUT, RepresentationPackage.Literals.COMPONENT_DIAGRAM__DEPTH_OUT, newDepthOut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDepthIn() {
		return (Integer)eDynamicGet(RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_IN, RepresentationPackage.Literals.COMPONENT_DIAGRAM__DEPTH_IN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepthIn(int newDepthIn) {
		eDynamicSet(RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_IN, RepresentationPackage.Literals.COMPONENT_DIAGRAM__DEPTH_IN, newDepthIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_OUT:
				return getDepthOut();
			case RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_IN:
				return getDepthIn();
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
			case RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_OUT:
				setDepthOut((Integer)newValue);
				return;
			case RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_IN:
				setDepthIn((Integer)newValue);
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
			case RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_OUT:
				setDepthOut(DEPTH_OUT_EDEFAULT);
				return;
			case RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_IN:
				setDepthIn(DEPTH_IN_EDEFAULT);
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
			case RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_OUT:
				return getDepthOut() != DEPTH_OUT_EDEFAULT;
			case RepresentationPackage.COMPONENT_DIAGRAM__DEPTH_IN:
				return getDepthIn() != DEPTH_IN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ComponentDiagramImpl
