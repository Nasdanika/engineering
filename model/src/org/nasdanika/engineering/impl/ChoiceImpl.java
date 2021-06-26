/**
 */
package org.nasdanika.engineering.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.engineering.Choice;
import org.nasdanika.engineering.EngineeringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChoiceImpl extends PseudoStateImpl implements Choice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.CHOICE;
	}
	
	@Override
	public String getType() {
		return "choice";
	}

} //ChoiceImpl
