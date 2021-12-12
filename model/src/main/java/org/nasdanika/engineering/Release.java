/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.nasdanika.engineering.Release#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getRelease()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/release.md'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='increment'"
 * @generated
 */
public interface Release extends EngineeredCapability {
	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment for which this release is scheduled.
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.EngineeredCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineered capabilities planned for this release.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getRelease_Capabilities()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<EngineeredCapability> getCapabilities();

} // Release
