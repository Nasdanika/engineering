/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Capability#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Capability#isAvailable <em>Available</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Required By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Issue#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues requiring this capability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required By</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getCapability_RequiredBy()
	 * @see org.nasdanika.engineering.Issue#getRequires
	 * @model opposite="requires" changeable="false" derived="true"
	 * @generated
	 */
	EList<Issue> getRequiredBy();

	/**
	 * Returns the value of the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available</em>' attribute.
	 * @see #setAvailable(boolean)
	 * @see org.nasdanika.engineering.EngineeringPackage#getCapability_Available()
	 * @model
	 * @generated
	 */
	boolean isAvailable();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Capability#isAvailable <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' attribute.
	 * @see #isAvailable()
	 * @generated
	 */
	void setAvailable(boolean value);
} // Capability
