/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineered Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.EngineeredCapability#getReleases <em>Releases</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredCapability()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/engineered-capability.md'"
 * @generated
 */
public interface EngineeredCapability extends Capability, Endeavor {

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Release}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineered capability can be planned for zero or more releases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Releases</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getEngineeredCapability_Releases()
	 * @model annotation="urn:org.nasdanika opposite='capabilities'"
	 * @generated
	 */
	EList<Release> getReleases();
} // EngineeredCapability
