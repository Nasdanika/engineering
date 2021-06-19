/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ExitPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExitPointImpl extends PseudoStateImpl implements ExitPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.EXIT_POINT;
	}
	
	@Override
	public String getType() {
		return "exitPoint";
	}

} //ExitPointImpl
