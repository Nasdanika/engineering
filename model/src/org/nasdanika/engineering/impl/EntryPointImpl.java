/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.EntryPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EntryPointImpl extends PseudoStateImpl implements EntryPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.ENTRY_POINT;
	}
	
	@Override
	public String getType() {
		return "entryPoint";
	}

} //EntryPointImpl
