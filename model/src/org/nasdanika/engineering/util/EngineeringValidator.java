/**
 */
package org.nasdanika.engineering.util;

import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.common.Adaptable;
import org.nasdanika.common.Context;
import org.nasdanika.emf.DiagnosticHelper;
import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Appearance;
import org.nasdanika.engineering.Artifact;
import org.nasdanika.engineering.Call;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringAppearance;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.FeatureAppearance;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.Journey;
import org.nasdanika.engineering.Link;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.NamedElementReference;
import org.nasdanika.engineering.Note;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.Topic;
import org.nasdanika.engineering.Transition;
import org.nasdanika.html.app.SectionStyle;

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringValidator() {
		super();
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
			case EngineeringPackage.ADAPTABLE:
				return validateAdaptable((Adaptable)value, diagnostics, context);
			case EngineeringPackage.MODEL_ELEMENT:
				return validateModelElement((ModelElement)value, diagnostics, context);
			case EngineeringPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case EngineeringPackage.ENDEAVOR:
				return validateEndeavor((Endeavor)value, diagnostics, context);
			case EngineeringPackage.INCREMENT:
				return validateIncrement((Increment)value, diagnostics, context);
			case EngineeringPackage.ISSUE_CATEGORY:
				return validateIssueCategory((IssueCategory)value, diagnostics, context);
			case EngineeringPackage.ISSUE_STATUS:
				return validateIssueStatus((IssueStatus)value, diagnostics, context);
			case EngineeringPackage.ISSUE:
				return validateIssue((Issue)value, diagnostics, context);
			case EngineeringPackage.NOTE:
				return validateNote((Note)value, diagnostics, context);
			case EngineeringPackage.ENGINEERED_ELEMENT:
				return validateEngineeredElement((EngineeredElement)value, diagnostics, context);
			case EngineeringPackage.PERSONA:
				return validatePersona((Persona)value, diagnostics, context);
			case EngineeringPackage.ENGINEER:
				return validateEngineer((Engineer)value, diagnostics, context);
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
			case EngineeringPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case EngineeringPackage.JOURNEY:
				return validateJourney((Journey)value, diagnostics, context);
			case EngineeringPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case EngineeringPackage.CALL:
				return validateCall((Call)value, diagnostics, context);
			case EngineeringPackage.ARTIFACT:
				return validateArtifact((Artifact)value, diagnostics, context);
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
			case EngineeringPackage.FORUM:
				return validateForum((Forum)value, diagnostics, context);
			case EngineeringPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case EngineeringPackage.TOPIC:
				return validateTopic((Topic)value, diagnostics, context);
			case EngineeringPackage.ENGINEERING_APPEARANCE:
				return validateEngineeringAppearance((EngineeringAppearance)value, diagnostics, context);
			case EngineeringPackage.APPEARANCE:
				return validateAppearance((Appearance)value, diagnostics, context);
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE:
				return validateModelElementAppearance((ModelElementAppearance)value, diagnostics, context);
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE_ENTRY:
				return validateModelElementAppearanceEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case EngineeringPackage.FEATURE_APPEARANCE_ENTRY:
				return validateFeatureAppearanceEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case EngineeringPackage.FEATURE_APPEARANCE:
				return validateFeatureAppearance((FeatureAppearance)value, diagnostics, context);
			case EngineeringPackage.DOCUMENT:
				return validateDocument((Document)value, diagnostics, context);
			case EngineeringPackage.NAMED_ELEMENT_REFERENCE:
				return validateNamedElementReference((NamedElementReference)value, diagnostics, context);
			case EngineeringPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case EngineeringPackage.SECTION_STYLE:
				return validateSectionStyle((SectionStyle)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdaptable(Adaptable adaptable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)adaptable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEndeavor_start_end(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(endeavor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the start_end constraint of '<em>Endeavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEndeavor_start_end(Endeavor endeavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, endeavor);
			Date start = endeavor.getStart();
			Date end = endeavor.getEnd();
			if (start != null && end != null && start.after(end)) {
				helper.error("Endeavor end date " + end + " is before the start date " + start, EngineeringPackage.Literals.ENDEAVOR__END);
			}
			
			// Past due
			if (end != null && endeavor.getCompletion() < 0.9999) {
				Context ctx = (Context) context.get(Context.class);
				if (ctx != null) {
					Date date = ctx.get(Date.class);
					if (date != null && date.after(end)) {
						helper.warning("Past due", EngineeringPackage.Literals.ENDEAVOR__END);
					}
				}
			}	
						
			// Issue - children, release, feature
			if (endeavor instanceof Issue) {
				Issue issue = (Issue) endeavor;
				EObject ic = issue.eContainer();
				if (ic instanceof Issue) {
					Issue ci = (Issue) ic;
					Date cStart = ci.getStart();
					if (start != null && cStart != null && cStart.after(start)) {
						helper.error("Issue start date " + start + " is before the parent issue start date " + cStart, EngineeringPackage.Literals.ENDEAVOR__START);						
					}
					Date cEnd = ci.getEnd();
					if (end != null && cEnd != null && cEnd.before(end)) {
						helper.error("Issue end date " + end + " is after the parent issue end date " + cEnd, EngineeringPackage.Literals.ENDEAVOR__END);						
					}
				}
				
				for (Release release: issue.getReleases()) {
					Date rStart = release.getStart();
					if (start != null && rStart != null && rStart.after(start)) {
						helper.error("Issue start date " + start + " is before the release start date " + rStart, EngineeringPackage.Literals.ENDEAVOR__START);						
					}
					Date rEnd = release.getEnd();
					if (end != null && rEnd != null && rEnd.before(end)) {
						helper.error("Issue end date " + end + " is after the release end date " + rEnd, EngineeringPackage.Literals.ENDEAVOR__END);						
					}					
				}
				
				for (Feature feature: issue.getContributesTo()) {
					Date fStart = feature.getStart();
					if (start != null && fStart != null && fStart.after(start)) {
						helper.error("Issue start date " + start + " is before the feature start date " + fStart, EngineeringPackage.Literals.ENDEAVOR__START);						
					}
					Date fEnd = feature.getEnd();
					if (end != null && fEnd != null && fEnd.before(end)) {
						helper.error("Issue end date " + end + " is after the feature end date " + fEnd, EngineeringPackage.Literals.ENDEAVOR__END);						
					}					
				}
			}
			
			// Feature - release
			if (endeavor instanceof Feature) {				
				for (Release release: ((Feature) endeavor).getReleases()) {
					Date rStart = release.getStart();
					if (start != null && rStart != null && rStart.after(start)) {
						helper.error("Feature start date " + start + " is before the release start date " + rStart, EngineeringPackage.Literals.ENDEAVOR__START);						
					}
					Date rEnd = release.getEnd();
					if (end != null && rEnd != null && rEnd.before(end)) {
						helper.error("Feature end date " + end + " is after the release end date " + rEnd, EngineeringPackage.Literals.ENDEAVOR__END);						
					}					
				}
			}			
			
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * Validates the capacity constraint of '<em>Endeavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEndeavor_capacity(Endeavor endeavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, endeavor);
			
			/*
			 * TODO - validate that endeavor is properly capacitized - engineers have enough capacity
			 * to work on this endeavor. Tolerance from context - error and warning levels.
			 */
			
			return helper.isSuccess();
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
		if (result || diagnostics != null) result &= validateEndeavor_start_end(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncrement_nesting(increment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nesting constraint of '<em>Increment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateIncrement_nesting(Increment increment, DiagnosticChain diagnostics, Map<Object, Object> context) {
//		if (diagnostics != null) {
//			// Test
//			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, increment);
//			helper.error("Test EObject error");
//			helper.error("Test Feature error", EngineeringPackage.Literals.INCREMENT__END);
//			return false;
//		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueCategory(IssueCategory issueCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issueCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueStatus(IssueStatus issueStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issueStatus, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEndeavor_start_end(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validateIssue_increment(issue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the increment constraint of '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateIssue_increment(Issue issue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {			
			Increment increment = issue.getIncrement();
			if (increment != null) {
				Date incStart = increment.getStart();
				Date issEnd = issue.getEnd();
				Date incEnd = increment.getEnd();
				DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, issue);
				if (issEnd != null && (incStart.after(issEnd) || incEnd.before(issEnd))) {
					helper.error("Issue end date " + issEnd + " is not within the increment " + incStart + " - " + incEnd, EngineeringPackage.Literals.ISSUE__INCREMENT);
					return helper.isSuccess();
				}
				return helper.isSuccess();
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(note, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(engineeredElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the capacity constraint of '<em>Engineered Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEngineeredElement_capacity(EngineeredElement engineeredElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, engineeredElement);
			
			/*
			 * TODO - validate for this engineered element that there is enough capacity to work on  issues assigned to engineers and scheduled for endeavors
			 * Tolerance from context.
			 */
			
			return helper.isSuccess();
		}
		return true;
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
		if (result || diagnostics != null) result &= validateEngineer_capacity(engineer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the capacity constraint of '<em>Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEngineer_capacity(Engineer engineer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, engineer);
			
			/*
			 * TODO - validate for this engineer that capacity and allocations match for endeavors. 
			 * Pro-rate if capacity is for increments and allocations are for releases/features.  
			 * Tolerance from context.
			 * Funds are cumulative or cumulative flag to Capacity.
			 */
			
			return validateEngineeredElement_capacity(engineer, diagnostics, context) && helper.isSuccess();
		}
		return validateEngineeredElement_capacity(engineer, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(product, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapability(Capability capability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capability, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEndeavor_start_end(engineeredCapability, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(engineeredCapability, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEndeavor_start_end(release, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(release, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelease_increment(release, diagnostics, context);
		return result;
	}

	/**
	 * Validates the increment constraint of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRelease_increment(Release release, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {			
			Increment increment = release.getIncrement();
			if (increment != null) {
				Date incStart = increment.getStart();
				Date relEnd = release.getEnd();
				Date incEnd = increment.getEnd();
				DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, release);
				if (relEnd != null && (incStart.after(relEnd) || incEnd.before(relEnd))) {
					helper.error("Release end date " + relEnd + " is not within the increment " + incStart + " - " + incEnd, EngineeringPackage.Literals.RELEASE__INCREMENT);
					return helper.isSuccess();
				}
				return helper.isSuccess();
			}
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
		if (result || diagnostics != null) result &= validateEndeavor_start_end(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(feature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(activity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJourney(Journey journey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(journey, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(journey, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCall(Call call, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(call, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(artifact, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(artifact, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(directory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapacity(Capacity capacity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capacity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAim(Aim aim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aim, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrinciple(Principle principle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(principle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignment(Alignment alignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForum(Forum forum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forum, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopic(Topic topic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeringAppearance(EngineeringAppearance engineeringAppearance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineeringAppearance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppearance(Appearance appearance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appearance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElementAppearance(ModelElementAppearance modelElementAppearance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelElementAppearance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElementAppearanceEntry(Map.Entry<?, ?> modelElementAppearanceEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)modelElementAppearanceEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureAppearanceEntry(Map.Entry<?, ?> featureAppearanceEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)featureAppearanceEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureAppearance(FeatureAppearance featureAppearance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureAppearance, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(document, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElementReference(NamedElementReference namedElementReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElementReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionStyle(SectionStyle sectionStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(message, diagnostics, context);
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
