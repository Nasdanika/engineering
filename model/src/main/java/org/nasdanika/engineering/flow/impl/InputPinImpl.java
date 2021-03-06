/**
 */
package org.nasdanika.engineering.flow.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.flow.InputPin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InputPinImpl extends PseudoStateImpl implements InputPin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.INPUT_PIN;
	}
	
	@Override
	public String getType() {
		return "inputPin";
	}

} //InputPinImpl
