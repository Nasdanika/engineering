/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Topic#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getTopic()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/topic.md'"
 * @generated
 */
public interface Topic extends Message {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Messages in this topic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getTopic_Messages()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Message> getMessages();

} // Topic
