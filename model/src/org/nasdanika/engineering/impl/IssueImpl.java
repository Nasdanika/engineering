/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
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
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getContributesTo <em>Contributes To</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#isDone <em>Done</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends EngineeredCapabilityImpl implements Issue {
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
	 * The default value of the '{@link #getBenefit() <em>Benefit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefit()
	 * @generated
	 * @ordered
	 */
	protected static final double BENEFIT_EDEFAULT = 0.0;

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
	public NotificationChain basicSetAssignee(Engineer newAssignee, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAssignee, EngineeringPackage.ISSUE__ASSIGNEE, msgs);
		return msgs;
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
	public NotificationChain basicSetIncrement(Increment newIncrement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newIncrement, EngineeringPackage.ISSUE__INCREMENT, msgs);
		return msgs;
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
	@Override
	public double getEffort() {
		return (Double)eDynamicGet(EngineeringPackage.ISSUE__EFFORT, EngineeringPackage.Literals.ISSUE__EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffort(double newEffort) {
		eDynamicSet(EngineeringPackage.ISSUE__EFFORT, EngineeringPackage.Literals.ISSUE__EFFORT, newEffort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCost() {
		return (Double)eDynamicGet(EngineeringPackage.ISSUE__COST, EngineeringPackage.Literals.ISSUE__COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(double newCost) {
		eDynamicSet(EngineeringPackage.ISSUE__COST, EngineeringPackage.Literals.ISSUE__COST, newCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBenefit() {
		return (Double)eDynamicGet(EngineeringPackage.ISSUE__BENEFIT, EngineeringPackage.Literals.ISSUE__BENEFIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBenefit(double newBenefit) {
		eDynamicSet(EngineeringPackage.ISSUE__BENEFIT, EngineeringPackage.Literals.ISSUE__BENEFIT, newBenefit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueCategory getCategory() {
		return (IssueCategory)eDynamicGet(EngineeringPackage.ISSUE__CATEGORY, EngineeringPackage.Literals.ISSUE__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueCategory basicGetCategory() {
		return (IssueCategory)eDynamicGet(EngineeringPackage.ISSUE__CATEGORY, EngineeringPackage.Literals.ISSUE__CATEGORY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(IssueCategory newCategory, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCategory, EngineeringPackage.ISSUE__CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(IssueCategory newCategory) {
		eDynamicSet(EngineeringPackage.ISSUE__CATEGORY, EngineeringPackage.Literals.ISSUE__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EngineeredElement getTarget() {
		EObject c = eContainer();
		if (c instanceof EngineeredElement) {
			return (EngineeredElement) c;
		}
		if (c instanceof Issue) {
			return ((Issue) c).getTarget();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeredElement basicGetTarget() {
		return (EngineeredElement)eDynamicGet(EngineeringPackage.ISSUE__TARGET, EngineeringPackage.Literals.ISSUE__TARGET, false, true);
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
			case EngineeringPackage.ISSUE__ASSIGNEE:
				Engineer assignee = basicGetAssignee();
				if (assignee != null)
					msgs = ((InternalEObject)assignee).eInverseRemove(this, EngineeringPackage.ENGINEER__ASSIGNMENTS, Engineer.class, msgs);
				return basicSetAssignee((Engineer)otherEnd, msgs);
			case EngineeringPackage.ISSUE__REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequirements()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ISSUE__INCREMENT:
				Increment increment = basicGetIncrement();
				if (increment != null)
					msgs = ((InternalEObject)increment).eInverseRemove(this, EngineeringPackage.INCREMENT__ISSUES, Increment.class, msgs);
				return basicSetIncrement((Increment)otherEnd, msgs);
			case EngineeringPackage.ISSUE__CATEGORY:
				IssueCategory category = basicGetCategory();
				if (category != null)
					msgs = ((InternalEObject)category).eInverseRemove(this, EngineeringPackage.ISSUE_CATEGORY__ISSUES, IssueCategory.class, msgs);
				return basicSetCategory((IssueCategory)otherEnd, msgs);
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
			case EngineeringPackage.ISSUE__ASSIGNEE:
				return basicSetAssignee(null, msgs);
			case EngineeringPackage.ISSUE__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__INCREMENT:
				return basicSetIncrement(null, msgs);
			case EngineeringPackage.ISSUE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__CATEGORY:
				return basicSetCategory(null, msgs);
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
			case EngineeringPackage.ISSUE__EFFORT:
				return getEffort();
			case EngineeringPackage.ISSUE__COST:
				return getCost();
			case EngineeringPackage.ISSUE__BENEFIT:
				return getBenefit();
			case EngineeringPackage.ISSUE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case EngineeringPackage.ISSUE__TARGET:
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
			case EngineeringPackage.ISSUE__EFFORT:
				setEffort((Double)newValue);
				return;
			case EngineeringPackage.ISSUE__COST:
				setCost((Double)newValue);
				return;
			case EngineeringPackage.ISSUE__BENEFIT:
				setBenefit((Double)newValue);
				return;
			case EngineeringPackage.ISSUE__CATEGORY:
				setCategory((IssueCategory)newValue);
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
			case EngineeringPackage.ISSUE__EFFORT:
				setEffort(EFFORT_EDEFAULT);
				return;
			case EngineeringPackage.ISSUE__COST:
				setCost(COST_EDEFAULT);
				return;
			case EngineeringPackage.ISSUE__BENEFIT:
				setBenefit(BENEFIT_EDEFAULT);
				return;
			case EngineeringPackage.ISSUE__CATEGORY:
				setCategory((IssueCategory)null);
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
			case EngineeringPackage.ISSUE__EFFORT:
				return getEffort() != EFFORT_EDEFAULT;
			case EngineeringPackage.ISSUE__COST:
				return getCost() != COST_EDEFAULT;
			case EngineeringPackage.ISSUE__BENEFIT:
				return getBenefit() != BENEFIT_EDEFAULT;
			case EngineeringPackage.ISSUE__CATEGORY:
				return basicGetCategory() != null;
			case EngineeringPackage.ISSUE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //IssueImpl
