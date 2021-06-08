/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.TableOfContents;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Of Contents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.TableOfContentsImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TableOfContentsImpl#isTooltips <em>Tooltips</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableOfContentsImpl extends MinimalEObjectImpl.Container implements TableOfContents {
	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #isTooltips() <em>Tooltips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTooltips()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOOLTIPS_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableOfContentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.TABLE_OF_CONTENTS;
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
	public int getDepth() {
		return (Integer)eDynamicGet(EngineeringPackage.TABLE_OF_CONTENTS__DEPTH, EngineeringPackage.Literals.TABLE_OF_CONTENTS__DEPTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepth(int newDepth) {
		eDynamicSet(EngineeringPackage.TABLE_OF_CONTENTS__DEPTH, EngineeringPackage.Literals.TABLE_OF_CONTENTS__DEPTH, newDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTooltips() {
		return (Boolean)eDynamicGet(EngineeringPackage.TABLE_OF_CONTENTS__TOOLTIPS, EngineeringPackage.Literals.TABLE_OF_CONTENTS__TOOLTIPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTooltips(boolean newTooltips) {
		eDynamicSet(EngineeringPackage.TABLE_OF_CONTENTS__TOOLTIPS, EngineeringPackage.Literals.TABLE_OF_CONTENTS__TOOLTIPS, newTooltips);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.TABLE_OF_CONTENTS__DEPTH:
				return getDepth();
			case EngineeringPackage.TABLE_OF_CONTENTS__TOOLTIPS:
				return isTooltips();
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
			case EngineeringPackage.TABLE_OF_CONTENTS__DEPTH:
				setDepth((Integer)newValue);
				return;
			case EngineeringPackage.TABLE_OF_CONTENTS__TOOLTIPS:
				setTooltips((Boolean)newValue);
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
			case EngineeringPackage.TABLE_OF_CONTENTS__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case EngineeringPackage.TABLE_OF_CONTENTS__TOOLTIPS:
				setTooltips(TOOLTIPS_EDEFAULT);
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
			case EngineeringPackage.TABLE_OF_CONTENTS__DEPTH:
				return getDepth() != DEPTH_EDEFAULT;
			case EngineeringPackage.TABLE_OF_CONTENTS__TOOLTIPS:
				return isTooltips() != TOOLTIPS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TableOfContentsImpl
