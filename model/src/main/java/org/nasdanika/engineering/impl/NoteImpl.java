/**
 */
package org.nasdanika.engineering.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.Note;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.NoteImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.NoteImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.NoteImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.NoteImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.NoteImpl#getRemainingEffort <em>Remaining Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.NoteImpl#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.NoteImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends ModelElementImpl implements Note {
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
	 * The default value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFORT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getRemainingEffort() <em>Remaining Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingEffort()
	 * @generated
	 * @ordered
	 */
	protected static final double REMAINING_EFFORT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getRemainingCost() <em>Remaining Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCost()
	 * @generated
	 * @ordered
	 */
	protected static final double REMAINING_COST_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Engineer getAuthor() {
		return (Engineer)eDynamicGet(EngineeringPackage.NOTE__AUTHOR, EngineeringPackage.Literals.NOTE__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetAuthor() {
		return (Engineer)eDynamicGet(EngineeringPackage.NOTE__AUTHOR, EngineeringPackage.Literals.NOTE__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(Engineer newAuthor) {
		eDynamicSet(EngineeringPackage.NOTE__AUTHOR, EngineeringPackage.Literals.NOTE__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(EngineeringPackage.NOTE__DATE, EngineeringPackage.Literals.NOTE__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(EngineeringPackage.NOTE__DATE, EngineeringPackage.Literals.NOTE__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEffort() {
		return (Double)eDynamicGet(EngineeringPackage.NOTE__EFFORT, EngineeringPackage.Literals.NOTE__EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffort(double newEffort) {
		eDynamicSet(EngineeringPackage.NOTE__EFFORT, EngineeringPackage.Literals.NOTE__EFFORT, newEffort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCost() {
		return (Double)eDynamicGet(EngineeringPackage.NOTE__COST, EngineeringPackage.Literals.NOTE__COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(double newCost) {
		eDynamicSet(EngineeringPackage.NOTE__COST, EngineeringPackage.Literals.NOTE__COST, newCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRemainingEffort() {
		return (Double)eDynamicGet(EngineeringPackage.NOTE__REMAINING_EFFORT, EngineeringPackage.Literals.NOTE__REMAINING_EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingEffort(double newRemainingEffort) {
		eDynamicSet(EngineeringPackage.NOTE__REMAINING_EFFORT, EngineeringPackage.Literals.NOTE__REMAINING_EFFORT, newRemainingEffort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRemainingCost() {
		return (Double)eDynamicGet(EngineeringPackage.NOTE__REMAINING_COST, EngineeringPackage.Literals.NOTE__REMAINING_COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingCost(double newRemainingCost) {
		eDynamicSet(EngineeringPackage.NOTE__REMAINING_COST, EngineeringPackage.Literals.NOTE__REMAINING_COST, newRemainingCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueStatus getStatus() {
		return (IssueStatus)eDynamicGet(EngineeringPackage.NOTE__STATUS, EngineeringPackage.Literals.NOTE__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueStatus basicGetStatus() {
		return (IssueStatus)eDynamicGet(EngineeringPackage.NOTE__STATUS, EngineeringPackage.Literals.NOTE__STATUS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(IssueStatus newStatus) {
		eDynamicSet(EngineeringPackage.NOTE__STATUS, EngineeringPackage.Literals.NOTE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.NOTE__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case EngineeringPackage.NOTE__DATE:
				return getDate();
			case EngineeringPackage.NOTE__EFFORT:
				return getEffort();
			case EngineeringPackage.NOTE__COST:
				return getCost();
			case EngineeringPackage.NOTE__REMAINING_EFFORT:
				return getRemainingEffort();
			case EngineeringPackage.NOTE__REMAINING_COST:
				return getRemainingCost();
			case EngineeringPackage.NOTE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
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
			case EngineeringPackage.NOTE__AUTHOR:
				setAuthor((Engineer)newValue);
				return;
			case EngineeringPackage.NOTE__DATE:
				setDate((Date)newValue);
				return;
			case EngineeringPackage.NOTE__EFFORT:
				setEffort((Double)newValue);
				return;
			case EngineeringPackage.NOTE__COST:
				setCost((Double)newValue);
				return;
			case EngineeringPackage.NOTE__REMAINING_EFFORT:
				setRemainingEffort((Double)newValue);
				return;
			case EngineeringPackage.NOTE__REMAINING_COST:
				setRemainingCost((Double)newValue);
				return;
			case EngineeringPackage.NOTE__STATUS:
				setStatus((IssueStatus)newValue);
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
			case EngineeringPackage.NOTE__AUTHOR:
				setAuthor((Engineer)null);
				return;
			case EngineeringPackage.NOTE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case EngineeringPackage.NOTE__EFFORT:
				setEffort(EFFORT_EDEFAULT);
				return;
			case EngineeringPackage.NOTE__COST:
				setCost(COST_EDEFAULT);
				return;
			case EngineeringPackage.NOTE__REMAINING_EFFORT:
				setRemainingEffort(REMAINING_EFFORT_EDEFAULT);
				return;
			case EngineeringPackage.NOTE__REMAINING_COST:
				setRemainingCost(REMAINING_COST_EDEFAULT);
				return;
			case EngineeringPackage.NOTE__STATUS:
				setStatus((IssueStatus)null);
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
			case EngineeringPackage.NOTE__AUTHOR:
				return basicGetAuthor() != null;
			case EngineeringPackage.NOTE__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case EngineeringPackage.NOTE__EFFORT:
				return getEffort() != EFFORT_EDEFAULT;
			case EngineeringPackage.NOTE__COST:
				return getCost() != COST_EDEFAULT;
			case EngineeringPackage.NOTE__REMAINING_EFFORT:
				return getRemainingEffort() != REMAINING_EFFORT_EDEFAULT;
			case EngineeringPackage.NOTE__REMAINING_COST:
				return getRemainingCost() != REMAINING_COST_EDEFAULT;
			case EngineeringPackage.NOTE__STATUS:
				return basicGetStatus() != null;
		}
		return super.eIsSet(featureID);
	}

} //NoteImpl
