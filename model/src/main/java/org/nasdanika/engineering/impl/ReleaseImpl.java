/**
 */
package org.nasdanika.engineering.impl;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeringPackage;
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
 *   <li>{@link org.nasdanika.engineering.impl.ReleaseImpl#getCapabilities <em>Capabilities</em>}</li>
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<EngineeredCapability> getCapabilities() {
		return getOppositeReferrers(EngineeringPackage.Literals.RELEASE__CAPABILITIES);
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
			case EngineeringPackage.RELEASE__CAPABILITIES:
				return getCapabilities();
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
			case EngineeringPackage.RELEASE__CAPABILITIES:
				return !getCapabilities().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public double getCompletion() {
		double remaining = 0;
		double total = 0;
		for (EngineeredCapability capability: getCapabilities()) {
			double cc = capability.getCompletion();
			double ctc = capability.getTotalCost();
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
		for (EngineeredCapability capability: getCapabilities()) {
			ret += capability.getTotalCost();
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
		for (EngineeredCapability capability: getCapabilities()) {
			allIssues.addAll(capability.getAllIssues());
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
