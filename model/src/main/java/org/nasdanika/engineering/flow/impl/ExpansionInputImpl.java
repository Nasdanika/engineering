/**
 */
package org.nasdanika.engineering.flow.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.flow.ExpansionInput;
import org.nasdanika.engineering.flow.FlowPackage;

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
		return FlowPackage.Literals.EXPANSION_INPUT;
	}
	
	@Override
	public String getType() {
		return "expansionInput";
	}

} //ExpansionInputImpl
