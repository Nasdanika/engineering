/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Organization#getEngineers <em>Engineers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getOrganization()
 * @model annotation="urn:org.nasdanika icon='far fa-building' documentation-reference='doc/organization.md'"
 * @generated
 */
public interface Organization extends Engineer {
	/**
	 * Returns the value of the '<em><b>Engineers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Engineer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Members of this organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineers</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getOrganization_Engineers()
	 * @model containment="true" keys="path"
	 *        annotation="urn:org.nasdanika icon='fas fa-users'"
	 * @generated
	 */
	EList<Engineer> getEngineers();

} // Organization
