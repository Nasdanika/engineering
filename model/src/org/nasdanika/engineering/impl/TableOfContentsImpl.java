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
 *   <li>{@link org.nasdanika.engineering.impl.TableOfContentsImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TableOfContentsImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.TableOfContentsImpl#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableOfContentsImpl extends MinimalEObjectImpl.Container implements TableOfContents {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

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
	public String getRole() {
		return (String)eDynamicGet(EngineeringPackage.TABLE_OF_CONTENTS__ROLE, EngineeringPackage.Literals.TABLE_OF_CONTENTS__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		eDynamicSet(EngineeringPackage.TABLE_OF_CONTENTS__ROLE, EngineeringPackage.Literals.TABLE_OF_CONTENTS__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeader() {
		return (String)eDynamicGet(EngineeringPackage.TABLE_OF_CONTENTS__HEADER, EngineeringPackage.Literals.TABLE_OF_CONTENTS__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(String newHeader) {
		eDynamicSet(EngineeringPackage.TABLE_OF_CONTENTS__HEADER, EngineeringPackage.Literals.TABLE_OF_CONTENTS__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.TABLE_OF_CONTENTS__ROLE:
				return getRole();
			case EngineeringPackage.TABLE_OF_CONTENTS__DEPTH:
				return getDepth();
			case EngineeringPackage.TABLE_OF_CONTENTS__HEADER:
				return getHeader();
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
			case EngineeringPackage.TABLE_OF_CONTENTS__ROLE:
				setRole((String)newValue);
				return;
			case EngineeringPackage.TABLE_OF_CONTENTS__DEPTH:
				setDepth((Integer)newValue);
				return;
			case EngineeringPackage.TABLE_OF_CONTENTS__HEADER:
				setHeader((String)newValue);
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
			case EngineeringPackage.TABLE_OF_CONTENTS__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case EngineeringPackage.TABLE_OF_CONTENTS__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case EngineeringPackage.TABLE_OF_CONTENTS__HEADER:
				setHeader(HEADER_EDEFAULT);
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
			case EngineeringPackage.TABLE_OF_CONTENTS__ROLE:
				return ROLE_EDEFAULT == null ? getRole() != null : !ROLE_EDEFAULT.equals(getRole());
			case EngineeringPackage.TABLE_OF_CONTENTS__DEPTH:
				return getDepth() != DEPTH_EDEFAULT;
			case EngineeringPackage.TABLE_OF_CONTENTS__HEADER:
				return HEADER_EDEFAULT == null ? getHeader() != null : !HEADER_EDEFAULT.equals(getHeader());
		}
		return super.eIsSet(featureID);
	}

} //TableOfContentsImpl
