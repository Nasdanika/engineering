/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Start;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StartImpl extends PseudoStateImpl implements Start {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.START;
	}
	
	@Override
	public String getType() {
		return "[*]";
	}

} //StartImpl
