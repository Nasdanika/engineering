/**
 */
package org.nasdanika.engineering.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.Note;
import org.nasdanika.engineering.Release;

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
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getContributesTo <em>Contributes To</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#isWorkable <em>Workable</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getRemainingEffort <em>Remaining Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getRemainingCost <em>Remaining Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends EngineeredCapabilityImpl implements Issue {
	/**
	 * The default value of the '{@link #isWorkable() <em>Workable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWorkable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WORKABLE_EDEFAULT = false;

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
	 * @generated NOT
	 */
	@Override
	public Engineer getAssignee() {
		if (!eIsSet(EngineeringPackage.ISSUE__ASSIGNEE)) {
			for (EObject ancestor = eContainer; ancestor != null; ancestor = ancestor.eContainer()) {
				if (ancestor instanceof Issue) {
					return ((Issue) ancestor).getAssignee();				
				}
				if (ancestor instanceof Engineer) {
					return (Engineer) ancestor;
				}
				if (ancestor instanceof EngineeredElement) {
					EList<Engineer> owners = ((EngineeredElement) ancestor).getOwners();
					if (!owners.isEmpty()) {
						return owners.get(0);
					}
				}
			}			
		}
		
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
	public EList<Capability> getRequires() {
		return (EList<Capability>)eDynamicGet(EngineeringPackage.ISSUE__REQUIRES, EngineeringPackage.Literals.ISSUE__REQUIRES, true, true);
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getContributesTo() {
		return (EList<Feature>)eDynamicGet(EngineeringPackage.ISSUE__CONTRIBUTES_TO, EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public IssueStatus getStatus() {
		if (!eIsSet(EngineeringPackage.Literals.ISSUE__STATUS)) {
			ArrayList<Note> nl = new ArrayList<>(getNotes());
			Collections.reverse(nl);
			for (Note note: nl) {
				if (note.eIsSet(EngineeringPackage.Literals.NOTE__STATUS)) {
					return note.getStatus();
				}
			}
			
			// The first available status in the hierarchy is the default.
			for (EObject ancestor = eContainer(); ancestor != null; ancestor = ancestor.eContainer()) {
				if (ancestor instanceof Engineer) {
					EList<IssueStatus> statuses = ((Engineer) ancestor).getIssueStatuses();
					if (!statuses.isEmpty()) {
						return statuses.get(0);
					}
				}
			}
		}
		return (IssueStatus)eDynamicGet(EngineeringPackage.ISSUE__STATUS, EngineeringPackage.Literals.ISSUE__STATUS, true, true);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueStatus basicGetStatus() {
		return (IssueStatus)eDynamicGet(EngineeringPackage.ISSUE__STATUS, EngineeringPackage.Literals.ISSUE__STATUS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(IssueStatus newStatus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStatus, EngineeringPackage.ISSUE__STATUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(IssueStatus newStatus) {
		eDynamicSet(EngineeringPackage.ISSUE__STATUS, EngineeringPackage.Literals.ISSUE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isWorkable() {
		for (Issue child: getChildren()) {
			if (!child.isAvailable()) {
				return false;
			}
		}
		for (Capability req: getRequires()) {
			if (!req.isAvailable()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Release> getReleases() {
		return (EList<Release>)eDynamicGet(EngineeringPackage.ISSUE__RELEASES, EngineeringPackage.Literals.ISSUE__RELEASES, true, true);
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
	 * @generated NOT
	 */
	@Override
	public double getRemainingEffort() {
		IssueStatus status = getStatus();
		if (status != null && status.isDone()) {
			return 0;
		}
		double ret = getEffort();
		for (Note note: getNotes()) {
			if (note.eIsSet(EngineeringPackage.Literals.NOTE__REMAINING_EFFORT)) {
				ret = note.getRemainingEffort();
			} else {
				ret -= note.getEffort();
			}
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getRemainingCost() {
		IssueStatus status = getStatus();
		if (status != null && status.isDone()) {
			return 0;
		}
		double ret = getCost();
		for (Note note: getNotes()) {
			if (note.eIsSet(EngineeringPackage.Literals.NOTE__REMAINING_COST)) {
				ret = note.getRemainingCost();
			} else {
				ret -= note.getCost();
			}
		}
		return ret;
	}
	
	@Override
	public double getCompletion() {
		IssueStatus status = getStatus();
		if (status != null && status.isDone()) {
			return 1;
		}
		double rate = getAssignee().getRate();
		double remaining = getRemainingCost() + rate * getRemainingEffort();
		double total = getCost() + rate * getEffort();
		for (Issue child: getChildren()) {
			double cc = child.getCompletion();
			double ctc = child.getTotalCost();
			total += ctc;
			if (Double.isFinite(cc)) {
				remaining += (1 - cc) * ctc; 
			}
		}
		return total == 0 ? Double.NaN : Math.max(0, total - remaining) / total;
	}
	
	@Override
	public double getTotalCost() {
		double ret = getCost() + getEffort() * getAssignee().getRate();
		for (Issue child: getChildren()) {
			ret += child.getTotalCost();
		}
		return ret;
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
			case EngineeringPackage.ISSUE__REQUIRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequires()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ISSUE__INCREMENT:
				Increment increment = basicGetIncrement();
				if (increment != null)
					msgs = ((InternalEObject)increment).eInverseRemove(this, EngineeringPackage.INCREMENT__ISSUES, Increment.class, msgs);
				return basicSetIncrement((Increment)otherEnd, msgs);
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributesTo()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ISSUE__CATEGORY:
				IssueCategory category = basicGetCategory();
				if (category != null)
					msgs = ((InternalEObject)category).eInverseRemove(this, EngineeringPackage.ISSUE_CATEGORY__ISSUES, IssueCategory.class, msgs);
				return basicSetCategory((IssueCategory)otherEnd, msgs);
			case EngineeringPackage.ISSUE__STATUS:
				IssueStatus status = basicGetStatus();
				if (status != null)
					msgs = ((InternalEObject)status).eInverseRemove(this, EngineeringPackage.ISSUE_STATUS__ISSUES, IssueStatus.class, msgs);
				return basicSetStatus((IssueStatus)otherEnd, msgs);
			case EngineeringPackage.ISSUE__RELEASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReleases()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.ISSUE__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__INCREMENT:
				return basicSetIncrement(null, msgs);
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				return ((InternalEList<?>)getContributesTo()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__CATEGORY:
				return basicSetCategory(null, msgs);
			case EngineeringPackage.ISSUE__STATUS:
				return basicSetStatus(null, msgs);
			case EngineeringPackage.ISSUE__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.ISSUE__REQUIRES:
				return getRequires();
			case EngineeringPackage.ISSUE__INCREMENT:
				if (resolve) return getIncrement();
				return basicGetIncrement();
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				return getContributesTo();
			case EngineeringPackage.ISSUE__NOTES:
				return getNotes();
			case EngineeringPackage.ISSUE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case EngineeringPackage.ISSUE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case EngineeringPackage.ISSUE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case EngineeringPackage.ISSUE__WORKABLE:
				return isWorkable();
			case EngineeringPackage.ISSUE__RELEASES:
				return getReleases();
			case EngineeringPackage.ISSUE__EFFORT:
				return getEffort();
			case EngineeringPackage.ISSUE__COST:
				return getCost();
			case EngineeringPackage.ISSUE__REMAINING_EFFORT:
				return getRemainingEffort();
			case EngineeringPackage.ISSUE__REMAINING_COST:
				return getRemainingCost();
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
			case EngineeringPackage.ISSUE__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Capability>)newValue);
				return;
			case EngineeringPackage.ISSUE__INCREMENT:
				setIncrement((Increment)newValue);
				return;
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				getContributesTo().clear();
				getContributesTo().addAll((Collection<? extends Feature>)newValue);
				return;
			case EngineeringPackage.ISSUE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Note>)newValue);
				return;
			case EngineeringPackage.ISSUE__CATEGORY:
				setCategory((IssueCategory)newValue);
				return;
			case EngineeringPackage.ISSUE__STATUS:
				setStatus((IssueStatus)newValue);
				return;
			case EngineeringPackage.ISSUE__RELEASES:
				getReleases().clear();
				getReleases().addAll((Collection<? extends Release>)newValue);
				return;
			case EngineeringPackage.ISSUE__EFFORT:
				setEffort((Double)newValue);
				return;
			case EngineeringPackage.ISSUE__COST:
				setCost((Double)newValue);
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
			case EngineeringPackage.ISSUE__REQUIRES:
				getRequires().clear();
				return;
			case EngineeringPackage.ISSUE__INCREMENT:
				setIncrement((Increment)null);
				return;
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				getContributesTo().clear();
				return;
			case EngineeringPackage.ISSUE__NOTES:
				getNotes().clear();
				return;
			case EngineeringPackage.ISSUE__CATEGORY:
				setCategory((IssueCategory)null);
				return;
			case EngineeringPackage.ISSUE__STATUS:
				setStatus((IssueStatus)null);
				return;
			case EngineeringPackage.ISSUE__RELEASES:
				getReleases().clear();
				return;
			case EngineeringPackage.ISSUE__EFFORT:
				setEffort(EFFORT_EDEFAULT);
				return;
			case EngineeringPackage.ISSUE__COST:
				setCost(COST_EDEFAULT);
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
			case EngineeringPackage.ISSUE__REQUIRES:
				return !getRequires().isEmpty();
			case EngineeringPackage.ISSUE__INCREMENT:
				return basicGetIncrement() != null;
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				return !getContributesTo().isEmpty();
			case EngineeringPackage.ISSUE__NOTES:
				return !getNotes().isEmpty();
			case EngineeringPackage.ISSUE__CATEGORY:
				return basicGetCategory() != null;
			case EngineeringPackage.ISSUE__TARGET:
				return basicGetTarget() != null;
			case EngineeringPackage.ISSUE__STATUS:
				return basicGetStatus() != null;
			case EngineeringPackage.ISSUE__WORKABLE:
				return isWorkable() != WORKABLE_EDEFAULT;
			case EngineeringPackage.ISSUE__RELEASES:
				return !getReleases().isEmpty();
			case EngineeringPackage.ISSUE__EFFORT:
				return getEffort() != EFFORT_EDEFAULT;
			case EngineeringPackage.ISSUE__COST:
				return getCost() != COST_EDEFAULT;
			case EngineeringPackage.ISSUE__REMAINING_EFFORT:
				return getRemainingEffort() != REMAINING_EFFORT_EDEFAULT;
			case EngineeringPackage.ISSUE__REMAINING_COST:
				return getRemainingCost() != REMAINING_COST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public boolean isAvailable() {
		IssueStatus status = getStatus();
		return status != null && status.isDone();
	}

} //IssueImpl
