/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ExpansionInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExpansionInputImpl extends PseudoStateImpl implements ExpansionInput {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.EXPANSION_INPUT;
	}
	
	@Override
	public String getType() {
		return "expansionInput";
	}

} //ExpansionInputImpl
