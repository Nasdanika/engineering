/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Note;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getIncrementId <em>Increment Id</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getContributesTo <em>Contributes To</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#isDone <em>Done</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends CapabilityImpl implements Issue {
	/**
	 * The default value of the '{@link #getIncrementId() <em>Increment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementId()
	 * @generated
	 * @ordered
	 */
	protected static final String INCREMENT_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDone() <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DONE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getChildren() {
		return (EList<Issue>)eDynamicGet(EngineeringPackage.ISSUE__CHILDREN, EngineeringPackage.Literals.ISSUE__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Engineer getAssignee() {
		return (Engineer)eDynamicGet(EngineeringPackage.ISSUE__ASSIGNEE, EngineeringPackage.Literals.ISSUE__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetAssignee() {
		return (Engineer)eDynamicGet(EngineeringPackage.ISSUE__ASSIGNEE, EngineeringPackage.Literals.ISSUE__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(Engineer newAssignee) {
		eDynamicSet(EngineeringPackage.ISSUE__ASSIGNEE, EngineeringPackage.Literals.ISSUE__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getRequirements() {
		return (EList<Capability>)eDynamicGet(EngineeringPackage.ISSUE__REQUIREMENTS, EngineeringPackage.Literals.ISSUE__REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncrementId() {
		return (String)eDynamicGet(EngineeringPackage.ISSUE__INCREMENT_ID, EngineeringPackage.Literals.ISSUE__INCREMENT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrementId(String newIncrementId) {
		eDynamicSet(EngineeringPackage.ISSUE__INCREMENT_ID, EngineeringPackage.Literals.ISSUE__INCREMENT_ID, newIncrementId);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Increment getIncrement() {
		return (Increment)eDynamicGet(EngineeringPackage.ISSUE__INCREMENT, EngineeringPackage.Literals.ISSUE__INCREMENT, true, true);
	}

	//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	@Override
//	public Increment getIncrement() {
//		String incrementId = getIncrementId();
//		if (Util.isBlank(incrementId)) {
//			return null;
//		}
//		Resource res = eResource(); 
//		if (res != null) {
//			ResourceSet rSet = res.getResourceSet();
//			TreeIterator<?> cit = rSet == null ? res.getAllContents() : rSet. getAllContents();
//			while (cit.hasNext()) {
//				Object next = cit.next(); 
//				if (next instanceof Increment && ((Increment) next).getId().equals(incrementId)) {
//					return (Increment) next;
//				}
//			}
//		}
//		throw new ConfigurationException("Increment not found: " + incrementId, EObjectAdaptable.adaptTo(this, Marked.class));
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment basicGetIncrement() {
		return (Increment)eDynamicGet(EngineeringPackage.ISSUE__INCREMENT, EngineeringPackage.Literals.ISSUE__INCREMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrement(Increment newIncrement) {
		eDynamicSet(EngineeringPackage.ISSUE__INCREMENT, EngineeringPackage.Literals.ISSUE__INCREMENT, newIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getContributesTo() {
		return (Feature)eDynamicGet(EngineeringPackage.ISSUE__CONTRIBUTES_TO, EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetContributesTo() {
		return (Feature)eDynamicGet(EngineeringPackage.ISSUE__CONTRIBUTES_TO, EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContributesTo(Feature newContributesTo) {
		eDynamicSet(EngineeringPackage.ISSUE__CONTRIBUTES_TO, EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO, newContributesTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return (String)eDynamicGet(EngineeringPackage.ISSUE__STATUS, EngineeringPackage.Literals.ISSUE__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		eDynamicSet(EngineeringPackage.ISSUE__STATUS, EngineeringPackage.Literals.ISSUE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDone() {
		return (Boolean)eDynamicGet(EngineeringPackage.ISSUE__DONE, EngineeringPackage.Literals.ISSUE__DONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDone(boolean newDone) {
		eDynamicSet(EngineeringPackage.ISSUE__DONE, EngineeringPackage.Literals.ISSUE__DONE, newDone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Note> getNotes() {
		return (EList<Note>)eDynamicGet(EngineeringPackage.ISSUE__NOTES, EngineeringPackage.Literals.ISSUE__NOTES, true, true);
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
			case EngineeringPackage.ISSUE__REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequirements()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.ISSUE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.ISSUE__CHILDREN:
				return getChildren();
			case EngineeringPackage.ISSUE__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case EngineeringPackage.ISSUE__REQUIREMENTS:
				return getRequirements();
			case EngineeringPackage.ISSUE__INCREMENT_ID:
				return getIncrementId();
			case EngineeringPackage.ISSUE__INCREMENT:
				if (resolve) return getIncrement();
				return basicGetIncrement();
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				if (resolve) return getContributesTo();
				return basicGetContributesTo();
			case EngineeringPackage.ISSUE__STATUS:
				return getStatus();
			case EngineeringPackage.ISSUE__DONE:
				return isDone();
			case EngineeringPackage.ISSUE__NOTES:
				return getNotes();
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
			case EngineeringPackage.ISSUE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Issue>)newValue);
				return;
			case EngineeringPackage.ISSUE__ASSIGNEE:
				setAssignee((Engineer)newValue);
				return;
			case EngineeringPackage.ISSUE__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Capability>)newValue);
				return;
			case EngineeringPackage.ISSUE__INCREMENT_ID:
				setIncrementId((String)newValue);
				return;
			case EngineeringPackage.ISSUE__INCREMENT:
				setIncrement((Increment)newValue);
				return;
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				setContributesTo((Feature)newValue);
				return;
			case EngineeringPackage.ISSUE__STATUS:
				setStatus((String)newValue);
				return;
			case EngineeringPackage.ISSUE__DONE:
				setDone((Boolean)newValue);
				return;
			case EngineeringPackage.ISSUE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Note>)newValue);
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
			case EngineeringPackage.ISSUE__CHILDREN:
				getChildren().clear();
				return;
			case EngineeringPackage.ISSUE__ASSIGNEE:
				setAssignee((Engineer)null);
				return;
			case EngineeringPackage.ISSUE__REQUIREMENTS:
				getRequirements().clear();
				return;
			case EngineeringPackage.ISSUE__INCREMENT_ID:
				setIncrementId(INCREMENT_ID_EDEFAULT);
				return;
			case EngineeringPackage.ISSUE__INCREMENT:
				setIncrement((Increment)null);
				return;
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				setContributesTo((Feature)null);
				return;
			case EngineeringPackage.ISSUE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case EngineeringPackage.ISSUE__DONE:
				setDone(DONE_EDEFAULT);
				return;
			case EngineeringPackage.ISSUE__NOTES:
				getNotes().clear();
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
			case EngineeringPackage.ISSUE__CHILDREN:
				return !getChildren().isEmpty();
			case EngineeringPackage.ISSUE__ASSIGNEE:
				return basicGetAssignee() != null;
			case EngineeringPackage.ISSUE__REQUIREMENTS:
				return !getRequirements().isEmpty();
			case EngineeringPackage.ISSUE__INCREMENT_ID:
				return INCREMENT_ID_EDEFAULT == null ? getIncrementId() != null : !INCREMENT_ID_EDEFAULT.equals(getIncrementId());
			case EngineeringPackage.ISSUE__INCREMENT:
				return basicGetIncrement() != null;
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				return basicGetContributesTo() != null;
			case EngineeringPackage.ISSUE__STATUS:
				return STATUS_EDEFAULT == null ? getStatus() != null : !STATUS_EDEFAULT.equals(getStatus());
			case EngineeringPackage.ISSUE__DONE:
				return isDone() != DONE_EDEFAULT;
			case EngineeringPackage.ISSUE__NOTES:
				return !getNotes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IssueImpl
