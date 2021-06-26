/**
 */
package org.nasdanika.engineering.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
import org.nasdanika.engineering.IssuePriority;
import org.nasdanika.engineering.IssueSeverity;
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
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getContributesTo <em>Contributes To</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#isWorkable <em>Workable</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getRemainingEffort <em>Remaining Effort</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.IssueImpl#getSeverity <em>Severity</em>}</li>
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getRequires() {
		return (EList<Capability>)eDynamicGet(EngineeringPackage.ISSUE__REQUIRES, EngineeringPackage.Literals.ISSUE__REQUIRES, true, true);
	}

	/**
	 * Issue increment. If not set defaults to release's increment or feature release increment. 
	 * @generated NOT
	 */
	@Override
	public Increment getIncrement() {
		Increment ret = (Increment)eDynamicGet(EngineeringPackage.ISSUE__INCREMENT, EngineeringPackage.Literals.ISSUE__INCREMENT, true, true);
		if (ret == null) {
			Date end = getEnd();
			if (end != null) {
				// Computing increment from the end date if the end data is set and the increment is not.
				for (EObject ancestor = eContainer(); ancestor != null; ancestor = ancestor.eContainer()) {
					if (ancestor instanceof Engineer) {
						Increment increment = findIncrement(getEnd(), ((Engineer) ancestor).getIncrements());
						if (increment != null) {
							return increment;
						}
					}
				}
			}
			for (Release release: getReleases()) {
				if (release.eIsSet(EngineeringPackage.Literals.RELEASE__INCREMENT)) {
					return release.getIncrement();
				}
			}
			for (Feature feature: getContributesTo()) {
				for (Release release: feature.getReleases()) {
					if (release.eIsSet(EngineeringPackage.Literals.RELEASE__INCREMENT)) {
						return release.getIncrement();
					}
				}
			}
		}
		return ret;
	}
	
	private static Increment findIncrement(Date date, Collection<Increment> increments) {
		for (Increment increment: increments) {
			Date start = increment.getStart();
			Date end = increment.getEnd();
			if ((start.equals(date) || start.before(date)) && (end.equals(date) || end.after(date))) {
				Increment ci = findIncrement(date, increment.getChildren());
				return ci == null ? increment : ci;
			}
		}
		return null;
	}

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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssuePriority getPriority() {
		return (IssuePriority)eDynamicGet(EngineeringPackage.ISSUE__PRIORITY, EngineeringPackage.Literals.ISSUE__PRIORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuePriority basicGetPriority() {
		return (IssuePriority)eDynamicGet(EngineeringPackage.ISSUE__PRIORITY, EngineeringPackage.Literals.ISSUE__PRIORITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(IssuePriority newPriority, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPriority, EngineeringPackage.ISSUE__PRIORITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(IssuePriority newPriority) {
		eDynamicSet(EngineeringPackage.ISSUE__PRIORITY, EngineeringPackage.Literals.ISSUE__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueSeverity getSeverity() {
		return (IssueSeverity)eDynamicGet(EngineeringPackage.ISSUE__SEVERITY, EngineeringPackage.Literals.ISSUE__SEVERITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverity basicGetSeverity() {
		return (IssueSeverity)eDynamicGet(EngineeringPackage.ISSUE__SEVERITY, EngineeringPackage.Literals.ISSUE__SEVERITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(IssueSeverity newSeverity, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSeverity, EngineeringPackage.ISSUE__SEVERITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(IssueSeverity newSeverity) {
		eDynamicSet(EngineeringPackage.ISSUE__SEVERITY, EngineeringPackage.Literals.ISSUE__SEVERITY, newSeverity);
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<IssueCategory> getCategories() {
		return (EList<IssueCategory>)eDynamicGet(EngineeringPackage.ISSUE__CATEGORIES, EngineeringPackage.Literals.ISSUE__CATEGORIES, true, true);
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
			case EngineeringPackage.ISSUE__REQUIRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequires()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ISSUE__INCREMENT:
				Increment increment = basicGetIncrement();
				if (increment != null)
					msgs = ((InternalEObject)increment).eInverseRemove(this, EngineeringPackage.INCREMENT__ISSUES, Increment.class, msgs);
				return basicSetIncrement((Increment)otherEnd, msgs);
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributesTo()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ISSUE__CATEGORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategories()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ISSUE__STATUS:
				IssueStatus status = basicGetStatus();
				if (status != null)
					msgs = ((InternalEObject)status).eInverseRemove(this, EngineeringPackage.ISSUE_STATUS__ISSUES, IssueStatus.class, msgs);
				return basicSetStatus((IssueStatus)otherEnd, msgs);
			case EngineeringPackage.ISSUE__RELEASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReleases()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.ISSUE__PRIORITY:
				IssuePriority priority = basicGetPriority();
				if (priority != null)
					msgs = ((InternalEObject)priority).eInverseRemove(this, EngineeringPackage.ISSUE_PRIORITY__ISSUES, IssuePriority.class, msgs);
				return basicSetPriority((IssuePriority)otherEnd, msgs);
			case EngineeringPackage.ISSUE__SEVERITY:
				IssueSeverity severity = basicGetSeverity();
				if (severity != null)
					msgs = ((InternalEObject)severity).eInverseRemove(this, EngineeringPackage.ISSUE_SEVERITY__ISSUES, IssueSeverity.class, msgs);
				return basicSetSeverity((IssueSeverity)otherEnd, msgs);
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
			case EngineeringPackage.ISSUE__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__INCREMENT:
				return basicSetIncrement(null, msgs);
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				return ((InternalEList<?>)getContributesTo()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__STATUS:
				return basicSetStatus(null, msgs);
			case EngineeringPackage.ISSUE__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.ISSUE__PRIORITY:
				return basicSetPriority(null, msgs);
			case EngineeringPackage.ISSUE__SEVERITY:
				return basicSetSeverity(null, msgs);
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
			case EngineeringPackage.ISSUE__REQUIRES:
				return getRequires();
			case EngineeringPackage.ISSUE__INCREMENT:
				if (resolve) return getIncrement();
				return basicGetIncrement();
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				return getContributesTo();
			case EngineeringPackage.ISSUE__NOTES:
				return getNotes();
			case EngineeringPackage.ISSUE__CATEGORIES:
				return getCategories();
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
			case EngineeringPackage.ISSUE__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case EngineeringPackage.ISSUE__SEVERITY:
				if (resolve) return getSeverity();
				return basicGetSeverity();
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
			case EngineeringPackage.ISSUE__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends IssueCategory>)newValue);
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
			case EngineeringPackage.ISSUE__PRIORITY:
				setPriority((IssuePriority)newValue);
				return;
			case EngineeringPackage.ISSUE__SEVERITY:
				setSeverity((IssueSeverity)newValue);
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
			case EngineeringPackage.ISSUE__CATEGORIES:
				getCategories().clear();
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
			case EngineeringPackage.ISSUE__PRIORITY:
				setPriority((IssuePriority)null);
				return;
			case EngineeringPackage.ISSUE__SEVERITY:
				setSeverity((IssueSeverity)null);
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
			case EngineeringPackage.ISSUE__REQUIRES:
				return !getRequires().isEmpty();
			case EngineeringPackage.ISSUE__INCREMENT:
				return basicGetIncrement() != null;
			case EngineeringPackage.ISSUE__CONTRIBUTES_TO:
				return !getContributesTo().isEmpty();
			case EngineeringPackage.ISSUE__NOTES:
				return !getNotes().isEmpty();
			case EngineeringPackage.ISSUE__CATEGORIES:
				return !getCategories().isEmpty();
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
			case EngineeringPackage.ISSUE__PRIORITY:
				return basicGetPriority() != null;
			case EngineeringPackage.ISSUE__SEVERITY:
				return basicGetSeverity() != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public boolean isAvailable() {
		IssueStatus status = getStatus();
		return status != null && status.isDone();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getAllIssues() {
		Collection<Issue> allIssues = new HashSet<>();
		allIssues.add(this);
		for (Issue issue: getChildren()) {
			allIssues.addAll(issue.getAllIssues());
		}
		return new BasicEList<>(allIssues);		
	}
	
	/**
	 * Computes default end from children or increment if there are no children with set end.
	 */
	@Override
	public Date getEnd() {
		Date ret = super.getEnd();
		if (ret == null) {
			for (Issue child: getChildren()) {
				Date cEnd = child.getEnd();
				if (ret == null || (cEnd != null && ret.before(cEnd))) {
					ret = cEnd;
				}
			}
		}
		return ret;
	}
	
	/**
	 * Computes default end from children or increment if there are no children with set end.
	 */
	@Override
	public Date getStart() {
		Date ret = super.getStart();
		if (ret == null) {
			for (Issue child: getChildren()) {
				Date cStart = child.getStart();
				if (ret == null || (cStart != null && ret.after(cStart))) {
					ret = cStart;
				}
			}
		}
		return ret;
	}

} //IssueImpl
