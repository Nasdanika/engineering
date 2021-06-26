/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Fork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ForkImpl extends PseudoStateImpl implements Fork {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.FORK;
	}
	
	@Override
	public String getType() {
		return "fork";
	}

} //ForkImpl
