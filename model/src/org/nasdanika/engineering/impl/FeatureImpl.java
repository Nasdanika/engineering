/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.Temporal;
import org.nasdanika.engineering.flow.Activity;
import org.nasdanika.engineering.flow.FlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.FeatureImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.FeatureImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.FeatureImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.FeatureImpl#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends EngineeredCapabilityImpl implements Feature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Release> getReleases() {
		return (EList<Release>)eDynamicGet(EngineeringPackage.FEATURE__RELEASES, EngineeringPackage.Literals.FEATURE__RELEASES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(EngineeringPackage.FEATURE__ACTIVITIES, EngineeringPackage.Literals.FEATURE__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getIssues() {
		return getReferrers(EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Activity> getUses() {
		return getReferrers(FlowPackage.Literals.ACTIVITY__FEATURES);
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
			case EngineeringPackage.FEATURE__RELEASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReleases()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.FEATURE__ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIssues()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.FEATURE__USES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUses()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.FEATURE__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.FEATURE__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.FEATURE__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.FEATURE__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.FEATURE__RELEASES:
				return getReleases();
			case EngineeringPackage.FEATURE__ACTIVITIES:
				return getActivities();
			case EngineeringPackage.FEATURE__ISSUES:
				return getIssues();
			case EngineeringPackage.FEATURE__USES:
				return getUses();
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
			case EngineeringPackage.FEATURE__RELEASES:
				getReleases().clear();
				getReleases().addAll((Collection<? extends Release>)newValue);
				return;
			case EngineeringPackage.FEATURE__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
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
			case EngineeringPackage.FEATURE__RELEASES:
				getReleases().clear();
				return;
			case EngineeringPackage.FEATURE__ACTIVITIES:
				getActivities().clear();
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
			case EngineeringPackage.FEATURE__RELEASES:
				return !getReleases().isEmpty();
			case EngineeringPackage.FEATURE__ACTIVITIES:
				return !getActivities().isEmpty();
			case EngineeringPackage.FEATURE__ISSUES:
				return !getIssues().isEmpty();
			case EngineeringPackage.FEATURE__USES:
				return !getUses().isEmpty();
		}
		return super.eIsSet(featureID);
	}
		
	@Override
	public double getCompletion() {
		double remaining = 0;
		double total = 0;
		for (Issue issue: getIssues()) {
			double cc = issue.getCompletion();
			double ctc = issue.getTotalCost();
			total += ctc;
			if (Double.isFinite(cc)) {
				remaining += (1 - cc) * ctc; 
			}
		}
		return total == 0 ? Double.NaN : Math.max(0, total - remaining) / total;
	}
	
	@Override
	public double getTotalCost() {
		double ret = 0;
		for (Issue issue: getIssues()) {
			ret += issue.getTotalCost();
		}
		return ret;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getAllIssues() {
		Collection<Issue> allIssues = new HashSet<>();
		for (Issue issue: getIssues()) {
			allIssues.addAll(issue.getAllIssues());
		}
		return new BasicEList<>(allIssues);		
	}	
	
//	/**
//	 * Computes default end from children or increment if there are no children with set end.
//	 */
//	@Override
//	public Temporal getEnd() {
//		Temporal ret = super.getEnd();
//		if (ret == null) {
//			for (Issue child: getAllIssues()) {
//				Temporal cEnd = child.getEnd();
//				if (ret == null || (cEnd != null && ret.before(cEnd) == Boolean.TRUE)) {
//					ret = cEnd;
//				}
//			}
//		}
//		return ret;
//	}
//	
//	/**
//	 * Computes default end from children or increment if there are no children with set end.
//	 */
//	@Override
//	public Temporal getStart() {
//		Temporal ret = super.getStart();
//		if (ret == null) {
//			for (Issue child: getAllIssues()) {
//				Temporal cStart = child.getStart();
//				if (ret == null || (cStart != null && ret.after(cStart) == Boolean.TRUE)) {
//					ret = cStart;
//				}
//			}
//		}
//		return ret;
//	}
	
} //FeatureImpl
