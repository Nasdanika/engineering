/**
 */
package org.nasdanika.engineering.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignable;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Connection;
import org.nasdanika.engineering.ConnectionSource;
import org.nasdanika.engineering.ConnectionTarget;
import org.nasdanika.engineering.Decision;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.Domain;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Event;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Interface;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssuePriority;
import org.nasdanika.engineering.IssueSeverity;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.engineering.Link;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.NamedElementReference;
import org.nasdanika.engineering.Note;
import org.nasdanika.engineering.Objective;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.ProductOrganization;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.TableOfContents;
import org.nasdanika.engineering.Topic;
import org.nasdanika.ncore.util.NcoreValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.engineering.EngineeringPackage
 * @generated
 */
public class EngineeringValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EngineeringValidator INSTANCE = new EngineeringValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.engineering";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NcoreValidator ncoreValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringValidator() {
		super();
		ncoreValidator = NcoreValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EngineeringPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EngineeringPackage.MODEL_ELEMENT:
				return validateModelElement((ModelElement)value, diagnostics, context);
			case EngineeringPackage.TABLE_OF_CONTENTS:
				return validateTableOfContents((TableOfContents)value, diagnostics, context);
			case EngineeringPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case EngineeringPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case EngineeringPackage.ALIGNABLE:
				return validateAlignable((Alignable)value, diagnostics, context);
			case EngineeringPackage.ENDEAVOR:
				return validateEndeavor((Endeavor)value, diagnostics, context);
			case EngineeringPackage.INCREMENT:
				return validateIncrement((Increment)value, diagnostics, context);
			case EngineeringPackage.ISSUE_CATEGORY:
				return validateIssueCategory((IssueCategory)value, diagnostics, context);
			case EngineeringPackage.ISSUE_STATUS:
				return validateIssueStatus((IssueStatus)value, diagnostics, context);
			case EngineeringPackage.ISSUE_PRIORITY:
				return validateIssuePriority((IssuePriority)value, diagnostics, context);
			case EngineeringPackage.ISSUE_SEVERITY:
				return validateIssueSeverity((IssueSeverity)value, diagnostics, context);
			case EngineeringPackage.ISSUE:
				return validateIssue((Issue)value, diagnostics, context);
			case EngineeringPackage.NOTE:
				return validateNote((Note)value, diagnostics, context);
			case EngineeringPackage.FORUM:
				return validateForum((Forum)value, diagnostics, context);
			case EngineeringPackage.ENGINEERED_ELEMENT:
				return validateEngineeredElement((EngineeredElement)value, diagnostics, context);
			case EngineeringPackage.DOCUMENT:
				return validateDocument((Document)value, diagnostics, context);
			case EngineeringPackage.PERSONA:
				return validatePersona((Persona)value, diagnostics, context);
			case EngineeringPackage.ENGINEER:
				return validateEngineer((Engineer)value, diagnostics, context);
			case EngineeringPackage.DOMAIN:
				return validateDomain((Domain)value, diagnostics, context);
			case EngineeringPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case EngineeringPackage.MODULE:
				return validateModule((org.nasdanika.engineering.Module)value, diagnostics, context);
			case EngineeringPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case EngineeringPackage.CAPABILITY:
				return validateCapability((Capability)value, diagnostics, context);
			case EngineeringPackage.ENGINEERED_CAPABILITY:
				return validateEngineeredCapability((EngineeredCapability)value, diagnostics, context);
			case EngineeringPackage.RELEASE:
				return validateRelease((Release)value, diagnostics, context);
			case EngineeringPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case EngineeringPackage.DIRECTORY:
				return validateDirectory((Directory)value, diagnostics, context);
			case EngineeringPackage.CAPACITY:
				return validateCapacity((Capacity)value, diagnostics, context);
			case EngineeringPackage.ALLOCATION:
				return validateAllocation((Allocation)value, diagnostics, context);
			case EngineeringPackage.AIM:
				return validateAim((Aim)value, diagnostics, context);
			case EngineeringPackage.PRINCIPLE:
				return validatePrinciple((Principle)value, diagnostics, context);
			case EngineeringPackage.ALIGNMENT:
				return validateAlignment((Alignment)value, diagnostics, context);
			case EngineeringPackage.GOAL:
				return validateGoal((Goal)value, diagnostics, context);
			case EngineeringPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case EngineeringPackage.TOPIC:
				return validateTopic((Topic)value, diagnostics, context);
			case EngineeringPackage.NAMED_ELEMENT_REFERENCE:
				return validateNamedElementReference((NamedElementReference)value, diagnostics, context);
			case EngineeringPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case EngineeringPackage.KEY_RESULT:
				return validateKeyResult((KeyResult)value, diagnostics, context);
			case EngineeringPackage.OBJECTIVE:
				return validateObjective((Objective)value, diagnostics, context);
			case EngineeringPackage.DECISION:
				return validateDecision((Decision)value, diagnostics, context);
			case EngineeringPackage.PRODUCT_ORGANIZATION:
				return validateProductOrganization((ProductOrganization)value, diagnostics, context);
			case EngineeringPackage.CONNECTION_SOURCE:
				return validateConnectionSource((ConnectionSource)value, diagnostics, context);
			case EngineeringPackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case EngineeringPackage.CONNECTION_TARGET:
				return validateConnectionTarget((ConnectionTarget)value, diagnostics, context);
			case EngineeringPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(modelElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the path constraint of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement_path(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "path", getObjectLabel(modelElement, context) },
						 new Object[] { modelElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableOfContents(TableOfContents tableOfContents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableOfContents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(event, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(event, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validateTemporal_bounds(event, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validateTemporal_offset(event, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignable(Alignable alignable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alignable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndeavor(Endeavor endeavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endeavor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(endeavor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the capacity constraint of '<em>Endeavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndeavor_capacity(Endeavor endeavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "capacity", getObjectLabel(endeavor, context) },
						 new Object[] { endeavor },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the children constraint of '<em>Endeavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndeavor_children(Endeavor endeavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "children", getObjectLabel(endeavor, context) },
						 new Object[] { endeavor },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncrement(Increment increment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(increment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(increment, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncrement_nesting(increment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nesting constraint of '<em>Increment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncrement_nesting(Increment increment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "nesting", getObjectLabel(increment, context) },
						 new Object[] { increment },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueCategory(IssueCategory issueCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(issueCategory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(issueCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(issueCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(issueCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(issueCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(issueCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(issueCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(issueCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(issueCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(issueCategory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueStatus(IssueStatus issueStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(issueStatus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(issueStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(issueStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(issueStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(issueStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(issueStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(issueStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(issueStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(issueStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(issueStatus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssuePriority(IssuePriority issuePriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(issuePriority, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(issuePriority, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(issuePriority, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(issuePriority, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(issuePriority, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(issuePriority, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(issuePriority, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(issuePriority, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(issuePriority, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(issuePriority, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverity(IssueSeverity issueSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(issueSeverity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(issueSeverity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(issueSeverity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(issueSeverity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(issueSeverity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(issueSeverity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(issueSeverity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(issueSeverity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(issueSeverity, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(issueSeverity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssue(Issue issue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(issue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(issue, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validateIssue_increment(issue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the increment constraint of '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssue_increment(Issue issue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "increment", getObjectLabel(issue, context) },
						 new Object[] { issue },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(note, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(note, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(note, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(note, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(note, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(note, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(note, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(note, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(note, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(note, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForum(Forum forum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(forum, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(forum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(forum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(forum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(forum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(forum, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(forum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeredElement(EngineeredElement engineeredElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(engineeredElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(engineeredElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(engineeredElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(engineeredElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(engineeredElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(engineeredElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(engineeredElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(engineeredElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(engineeredElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(engineeredElement, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(engineeredElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(engineeredElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the capacity constraint of '<em>Engineered Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeredElement_capacity(EngineeredElement engineeredElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "capacity", getObjectLabel(engineeredElement, context) },
						 new Object[] { engineeredElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocument(Document document, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(document, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(document, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(document, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(document, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(document, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersona(Persona persona, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(persona, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(persona, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(persona, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(persona, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(persona, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(persona, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(persona, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(persona, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(persona, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(persona, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(persona, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(persona, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineer(Engineer engineer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(engineer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(engineer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(engineer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(engineer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(engineer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(engineer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(engineer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(engineer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(engineer, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(engineer, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineer_start_end(engineer, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineer_capacity(engineer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the capacity constraint of '<em>Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineer_capacity(Engineer engineer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "capacity", getObjectLabel(engineer, context) },
						 new Object[] { engineer },
						 context));
			}
			return false;
		}
		return validateEngineeredElement_capacity(engineer, diagnostics, context);
	}

	/**
	 * Validates the start_end constraint of '<em>Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineer_start_end(Engineer engineer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "start_end", getObjectLabel(engineer, context) },
						 new Object[] { engineer },
						 context));
			}
			return false;
		}
		return ncoreValidator.validatePeriod_start_end(engineer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomain(Domain domain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(domain, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(domain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(organization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineer_start_end(organization, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineer_capacity(organization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule(org.nasdanika.engineering.Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(module, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(module, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(module, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(module, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(module, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(product, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(product, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(product, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(product, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(product, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapability(Capability capability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(capability, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(capability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(capability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(capability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(capability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(capability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(capability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(capability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(capability, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(capability, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(capability, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeredCapability(EngineeredCapability engineeredCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(engineeredCapability, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(engineeredCapability, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelease(Release release, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(release, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(release, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(release, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(release, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(release, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(release, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelease_increment(release, diagnostics, context);
		return result;
	}

	/**
	 * Validates the increment constraint of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelease_increment(Release release, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "increment", getObjectLabel(release, context) },
						 new Object[] { release },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(feature, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(feature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectory(Directory directory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(directory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(directory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(directory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(directory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(directory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(directory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(directory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(directory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(directory, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(directory, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(directory, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(directory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapacity(Capacity capacity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(capacity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(capacity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(capacity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(capacity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(capacity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(capacity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(capacity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(capacity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(capacity, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(capacity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(allocation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAim(Aim aim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aim, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aim, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(aim, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrinciple(Principle principle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(principle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(principle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(principle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(principle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(principle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(principle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(principle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(principle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(principle, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(principle, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignment(Alignment alignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alignment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(alignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(alignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(alignment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(goal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(goal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(message, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(message, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopic(Topic topic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(topic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(topic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(topic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(topic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(topic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(topic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(topic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(topic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(topic, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(topic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElementReference(NamedElementReference namedElementReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElementReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(namedElementReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(link, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(link, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyResult(KeyResult keyResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(keyResult, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(keyResult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(keyResult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(keyResult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(keyResult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(keyResult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(keyResult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(keyResult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(keyResult, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(keyResult, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjective(Objective objective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objective, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(objective, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecision(Decision decision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(decision, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(decision, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateIssue_increment(decision, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductOrganization(ProductOrganization productOrganization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productOrganization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(productOrganization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(productOrganization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(productOrganization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(productOrganization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(productOrganization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(productOrganization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(productOrganization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(productOrganization, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(productOrganization, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineer_start_end(productOrganization, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineer_capacity(productOrganization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionSource(ConnectionSource connectionSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(connection, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(connection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionTarget(ConnectionTarget connectionTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interface_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= ncoreValidator.validatePeriod_start_end(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(interface_, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EngineeringValidator
