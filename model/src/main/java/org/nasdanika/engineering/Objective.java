/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Objective#getEndeavor <em>Endeavor</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Objective#getKeyResults <em>Key Results</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Objective#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Objective#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Objective#getLinkedObjectives <em>Linked Objectives</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Objective#getSubObjectives <em>Sub Objectives</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getObjective()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/objective.md'"
 * @generated
 */
public interface Objective extends KeyResult {
	/**
	 * Returns the value of the '<em><b>Endeavor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Endeavor#getLinkedObjectives <em>Linked Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Endeavor for which containing [engineer](Engineer.html) has this objective for. E.g. "Achieve XYZ in Q2". Objectives can also be contained in endeavors directly. In this case they are assumed to be objectives of the assignee.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endeavor</em>' reference.
	 * @see #setEndeavor(Endeavor)
	 * @see org.nasdanika.engineering.EngineeringPackage#getObjective_Endeavor()
	 * @see org.nasdanika.engineering.Endeavor#getLinkedObjectives
	 * @model opposite="linkedObjectives"
	 * @generated
	 */
	Endeavor getEndeavor();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Objective#getEndeavor <em>Endeavor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endeavor</em>' reference.
	 * @see #getEndeavor()
	 * @generated
	 */
	void setEndeavor(Endeavor value);

	/**
	 * Returns the value of the '<em><b>Key Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.KeyResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key results for this objective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Results</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getObjective_KeyResults()
	 * @model containment="true" keys="path"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<KeyResult> getKeyResults();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Objective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-objectives of this objective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getObjective_Children()
	 * @model containment="true" keys="path"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Objective> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objective can be linked to a parent objective it is not already a child of objective, i.e. is contained by an [engineer](Engineer.html) or [endeavor](Endeavor.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Objective)
	 * @see org.nasdanika.engineering.EngineeringPackage#getObjective_Parent()
	 * @model
	 * @generated
	 */
	Objective getParent();

	/**
	 * Sets the value of the '{@link org.nasdanika.engineering.Objective#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Objective value);

	/**
	 * Returns the value of the '<em><b>Linked Objectives</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Objective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objectives linked to this one via the ``parent`` reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linked Objectives</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getObjective_LinkedObjectives()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="urn:org.nasdanika opposite='parent'"
	 * @generated
	 */
	EList<Objective> getLinkedObjectives();

	/**
	 * Returns the value of the '<em><b>Sub Objectives</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Objective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A union of children and linked objectives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Objectives</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getObjective_SubObjectives()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<Objective> getSubObjectives();

} // Objective
