/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Forum#getDiscussion <em>Discussion</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Forum#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getForum()
 * @model
 * @generated
 */
public interface Forum extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Discussion</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Forum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getForum_Discussion()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Forum> getDiscussion();

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getForum_Topics()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Topic> getTopics();

} // Forum
