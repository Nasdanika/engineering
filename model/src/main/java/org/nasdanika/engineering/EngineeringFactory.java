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
	 * Returns a new object of class '<em>Table Of Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Of Contents</em>'.
	 * @generated
	 */
	TableOfContents createTableOfContents();

	/**
	 * Returns a new object of class '<em>Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal</em>'.
	 * @generated
	 */
	Temporal createTemporal();

	/**
	 * Returns a new object of class '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period</em>'.
	 * @generated
	 */
	Period createPeriod();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Endeavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endeavor</em>'.
	 * @generated
	 */
	Endeavor createEndeavor();

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
	 * Returns a new object of class '<em>Issue Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Priority</em>'.
	 * @generated
	 */
	IssuePriority createIssuePriority();

	/**
	 * Returns a new object of class '<em>Issue Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Severity</em>'.
	 * @generated
	 */
	IssueSeverity createIssueSeverity();

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
	 * Returns a new object of class '<em>Aim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aim</em>'.
	 * @generated
	 */
	Aim createAim();

	/**
	 * Returns a new object of class '<em>Principle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Principle</em>'.
	 * @generated
	 */
	Principle createPrinciple();

	/**
	 * Returns a new object of class '<em>Alignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alignment</em>'.
	 * @generated
	 */
	Alignment createAlignment();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Forum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forum</em>'.
	 * @generated
	 */
	Forum createForum();

	/**
	 * Returns a new object of class '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic</em>'.
	 * @generated
	 */
	Topic createTopic();

	/**
	 * Returns a new object of class '<em>Package Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Appearance</em>'.
	 * @generated
	 */
	PackageAppearance createPackageAppearance();

	/**
	 * Returns a new object of class '<em>Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appearance</em>'.
	 * @generated
	 */
	Appearance createAppearance();

	/**
	 * Returns a new object of class '<em>Model Element Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Appearance</em>'.
	 * @generated
	 */
	ModelElementAppearance createModelElementAppearance();

	/**
	 * Returns a new object of class '<em>Member Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Appearance</em>'.
	 * @generated
	 */
	MemberAppearance createMemberAppearance();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Named Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element Reference</em>'.
	 * @generated
	 */
	NamedElementReference createNamedElementReference();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Key Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Result</em>'.
	 * @generated
	 */
	KeyResult createKeyResult();

	/**
	 * Returns a new object of class '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective</em>'.
	 * @generated
	 */
	Objective createObjective();

	/**
	 * Returns a new object of class '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision</em>'.
	 * @generated
	 */
	Decision createDecision();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EngineeringPackage getEngineeringPackage();

} //EngineeringFactory
