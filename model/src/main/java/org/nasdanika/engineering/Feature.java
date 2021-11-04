/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.journey.Activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.Feature#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Feature#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Feature#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Feature#getUses <em>Uses</em>}</li>
 *   <li>{@link org.nasdanika.engineering.Feature#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getFeature()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/feature.md'"
 * @generated
 */
public interface Feature extends EngineeredCapability {
	/**
	 * Returns the value of the '<em><b>Releases</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Release}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Release#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Releases for which this feature is planned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Releases</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getFeature_Releases()
	 * @see org.nasdanika.engineering.Release#getFeatures
	 * @model opposite="features"
	 * @generated
	 */
	EList<Release> getReleases();

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.journey.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities exemplifying use of the feature. These activities may be [journeys](Journey.html) and may be referenced from journeys.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getFeature_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues contributing to this feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issues</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getFeature_Issues()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.journey.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities using this feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getFeature_Uses()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<Activity> getUses();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Features can be organized into a hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getFeature_Children()
	 * @model containment="true" keys="path"
	 * @generated
	 */
	EList<Feature> getChildren();

} // Feature
