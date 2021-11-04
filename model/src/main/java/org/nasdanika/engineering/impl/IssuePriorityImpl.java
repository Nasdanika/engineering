/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssuePriority;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Priority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.IssuePriorityImpl#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssuePriorityImpl extends NamedElementImpl implements IssuePriority {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssuePriorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ISSUE_PRIORITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Issue> getIssues() {
		return getOppositeReferrers(EngineeringPackage.Literals.ISSUE_PRIORITY__ISSUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.ISSUE_PRIORITY__ISSUES:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EngineeringPackage.ISSUE_PRIORITY__ISSUES:
				return !getIssues().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IssuePriorityImpl
