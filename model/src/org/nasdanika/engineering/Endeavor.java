/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endeavor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Endeavor#getTotalCost <em>Total Cost</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Endeavor extends EObject {
	/**
	 * Returns the value of the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Completion()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	double getCompletion();

	/**
	 * Returns the value of the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit</em>' attribute.
	 * @see #setBenefit(double)
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_Benefit()
	 * @model
	 * @generated
	 */
	double getBenefit();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Endeavor#getBenefit <em>Benefit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit</em>' attribute.
	 * @see #getBenefit()
	 * @generated
	 */
	void setBenefit(double value);

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cost</em>' attribute.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEndeavor_TotalCost()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	double getTotalCost();

} // Endeavor
