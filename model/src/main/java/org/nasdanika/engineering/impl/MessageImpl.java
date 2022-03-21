/**
 */
package org.nasdanika.engineering.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.MessageImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.MessageImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends NamedElementImpl implements Message {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(EngineeringPackage.MESSAGE__DATE, EngineeringPackage.Literals.MESSAGE__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(EngineeringPackage.MESSAGE__DATE, EngineeringPackage.Literals.MESSAGE__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Engineer getAuthor() {
		return (Engineer)eDynamicGet(EngineeringPackage.MESSAGE__AUTHOR, EngineeringPackage.Literals.MESSAGE__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetAuthor() {
		return (Engineer)eDynamicGet(EngineeringPackage.MESSAGE__AUTHOR, EngineeringPackage.Literals.MESSAGE__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(Engineer newAuthor) {
		eDynamicSet(EngineeringPackage.MESSAGE__AUTHOR, EngineeringPackage.Literals.MESSAGE__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.MESSAGE__DATE:
				return getDate();
			case EngineeringPackage.MESSAGE__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
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
			case EngineeringPackage.MESSAGE__DATE:
				setDate((Date)newValue);
				return;
			case EngineeringPackage.MESSAGE__AUTHOR:
				setAuthor((Engineer)newValue);
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
			case EngineeringPackage.MESSAGE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case EngineeringPackage.MESSAGE__AUTHOR:
				setAuthor((Engineer)null);
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
			case EngineeringPackage.MESSAGE__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case EngineeringPackage.MESSAGE__AUTHOR:
				return basicGetAuthor() != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageImpl
