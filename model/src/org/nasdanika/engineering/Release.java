/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Release#getIncrement <em>Increment</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getRelease()
 * @model annotation="urn:org.nasdanika documentation-reference='../doc/release.md'"
 * @generated
 */
public interface Release extends EObject {
	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' reference.
	 * @see #setIncrement(Increment)
	 * @see org.nasdanika.engineering.EngineeringPackage#getRelease_Increment()
	 * @model
	 * @generated
	 */
	Increment getIncrement();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Release#getIncrement <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Increment value);

} // Release
