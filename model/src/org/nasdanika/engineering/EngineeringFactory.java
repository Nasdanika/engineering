/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.engineering.EngineeringPackage
 * @generated
 */
public interface EngineeringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EngineeringFactory eINSTANCE = org.nasdanika.engineering.impl.EngineeringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persona</em>'.
	 * @generated
	 */
	Persona createPersona();

	/**
	 * Returns a new object of class '<em>Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engineer</em>'.
	 * @generated
	 */
	Engineer createEngineer();

	/**
	 * Returns a new object of class '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization</em>'.
	 * @generated
	 */
	Organization createOrganization();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Engineered Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engineered Capability</em>'.
	 * @generated
	 */
	EngineeredCapability createEngineeredCapability();

	/**
	 * Returns a new object of class '<em>Increment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Increment</em>'.
	 * @generated
	 */
	Increment createIncrement();

	/**
	 * Returns a new object of class '<em>Issue Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Category</em>'.
	 * @generated
	 */
	IssueCategory createIssueCategory();

	/**
	 * Returns a new object of class '<em>Issue Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Status</em>'.
	 * @generated
	 */
	IssueStatus createIssueStatus();

	/**
	 * Returns a new object of class '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release</em>'.
	 * @generated
	 */
	Release createRelease();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journey</em>'.
	 * @generated
	 */
	Journey createJourney();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call</em>'.
	 * @generated
	 */
	Call createCall();

	/**
	 * Returns a new object of class '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue</em>'.
	 * @generated
	 */
	Issue createIssue();

	/**
	 * Returns a new object of class '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note</em>'.
	 * @generated
	 */
	Note createNote();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	Artifact createArtifact();

	/**
	 * Returns a new object of class '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directory</em>'.
	 * @generated
	 */
	Directory createDirectory();

	/**
	 * Returns a new object of class '<em>Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capacity</em>'.
	 * @generated
	 */
	Capacity createCapacity();

	/**
	 * Returns a new object of class '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation</em>'.
	 * @generated
	 */
	Allocation createAllocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EngineeringPackage getEngineeringPackage();

} //EngineeringFactory
