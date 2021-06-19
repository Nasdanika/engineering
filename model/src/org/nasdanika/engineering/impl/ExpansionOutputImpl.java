/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ExpansionOutput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExpansionOutputImpl extends PseudoStateImpl implements ExpansionOutput {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.EXPANSION_OUTPUT;
	}
	
	@Override
	public String getType() {
		return "expansionOutput";
	}

} //ExpansionOutputImpl
