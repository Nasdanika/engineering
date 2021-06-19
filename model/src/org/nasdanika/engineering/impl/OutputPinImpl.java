/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.OutputPin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OutputPinImpl extends PseudoStateImpl implements OutputPin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.OUTPUT_PIN;
	}
	
	@Override
	public String getType() {
		return "outputPin";
	}

} //OutputPinImpl
