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
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Release;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.ReleaseImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ReleaseImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.ReleaseImpl#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseImpl extends EngineeredCapabilityImpl implements Release {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.RELEASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Increment getIncrement() {
		return (Increment)eDynamicGet(EngineeringPackage.RELEASE__INCREMENT, EngineeringPackage.Literals.RELEASE__INCREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment basicGetIncrement() {
		return (Increment)eDynamicGet(EngineeringPackage.RELEASE__INCREMENT, EngineeringPackage.Literals.RELEASE__INCREMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrement(Increment newIncrement) {
		eDynamicSet(EngineeringPackage.RELEASE__INCREMENT, EngineeringPackage.Literals.RELEASE__INCREMENT, newIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getIssues() {
		return getOppositeReferrers(EngineeringPackage.Literals.RELEASE__ISSUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getFeatures() {
		return getOppositeReferrers(EngineeringPackage.Literals.RELEASE__FEATURES);
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
			case EngineeringPackage.RELEASE__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.RELEASE__ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIssues()).basicAdd(otherEnd, msgs);
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
			case EngineeringPackage.RELEASE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.RELEASE__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
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
			case EngineeringPackage.RELEASE__INCREMENT:
				if (resolve) return getIncrement();
				return basicGetIncrement();
			case EngineeringPackage.RELEASE__FEATURES:
				return getFeatures();
			case EngineeringPackage.RELEASE__ISSUES:
				return getIssues();
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
			case EngineeringPackage.RELEASE__INCREMENT:
				setIncrement((Increment)newValue);
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
			case EngineeringPackage.RELEASE__INCREMENT:
				setIncrement((Increment)null);
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
			case EngineeringPackage.RELEASE__INCREMENT:
				return basicGetIncrement() != null;
			case EngineeringPackage.RELEASE__FEATURES:
				return !getFeatures().isEmpty();
			case EngineeringPackage.RELEASE__ISSUES:
				return !getIssues().isEmpty();
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
		for (Feature feature: getFeatures()) {
			double cc = feature.getCompletion();
			double ctc = feature.getTotalCost();
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
		for (Feature feature: getFeatures()) {
			ret += feature.getTotalCost();
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
		for (Feature feature: getFeatures()) {
			for (Issue fi: feature.getAllIssues()) {
				allIssues.add(fi);
			}					
		}
		return new BasicEList<>(allIssues);		
	}
//		
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
	
} //ReleaseImpl
