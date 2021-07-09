/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Severity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.IssueSeverity#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getIssueSeverity()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/issue-severity.md'"
 * @generated
 */
public interface IssueSeverity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Issue#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues in this severity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issues</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getIssueSeverity_Issues()
	 * @see org.nasdanika.engineering.Issue#getSeverity
	 * @model opposite="severity" changeable="false" derived="true"
	 * @generated
	 */
	EList<Issue> getIssues();

} // IssueSeverity
