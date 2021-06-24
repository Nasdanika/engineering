/**
 */
package org.nasdanika.engineering.util;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.common.Adaptable;
import org.nasdanika.common.Context;
import org.nasdanika.emf.DiagnosticHelper;
import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignable;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Appearance;
import org.nasdanika.engineering.Call;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Choice;
import org.nasdanika.engineering.Decision;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.End;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringAppearance;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.EntryPoint;
import org.nasdanika.engineering.ExitPoint;
import org.nasdanika.engineering.ExpansionInput;
import org.nasdanika.engineering.ExpansionOutput;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.MemberAppearance;
import org.nasdanika.engineering.Fork;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.InputPin;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.Join;
import org.nasdanika.engineering.Journey;
import org.nasdanika.engineering.JourneyElement;
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.engineering.Link;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.NamedElementReference;
import org.nasdanika.engineering.Note;
import org.nasdanika.engineering.Objective;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.OutputPin;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.PseudoState;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.Service;
import org.nasdanika.engineering.Start;
import org.nasdanika.engineering.Topic;
import org.nasdanika.engineering.Transition;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.impl.Util;

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
			case EngineeringPackage.DIRECTORY:
				return validateDirectory((Directory)value, diagnostics, context);
			case EngineeringPackage.CAPACITY:
				return validateCapacity((Capacity)value, diagnostics, context);
			case EngineeringPackage.ALLOCATION:
				return validateAllocation((Allocation)value, diagnostics, context);
			case EngineeringPackage.ALIGNABLE:
				return validateAlignable((Alignable)value, diagnostics, context);
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
			case EngineeringPackage.MEMBER_APPEARANCE_ENTRY:
				return validateMemberAppearanceEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case EngineeringPackage.MEMBER_APPEARANCE:
				return validateMemberAppearance((MemberAppearance)value, diagnostics, context);
			case EngineeringPackage.DOCUMENT:
				return validateDocument((Document)value, diagnostics, context);
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
			case EngineeringPackage.JOURNEY_ELEMENT:
				return validateJourneyElement((JourneyElement)value, diagnostics, context);
			case EngineeringPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case EngineeringPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case EngineeringPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case EngineeringPackage.CALL:
				return validateCall((Call)value, diagnostics, context);
			case EngineeringPackage.JOURNEY:
				return validateJourney((Journey)value, diagnostics, context);
			case EngineeringPackage.PSEUDO_STATE:
				return validatePseudoState((PseudoState)value, diagnostics, context);
			case EngineeringPackage.CHOICE:
				return validateChoice((Choice)value, diagnostics, context);
			case EngineeringPackage.END:
				return validateEnd((End)value, diagnostics, context);
			case EngineeringPackage.ENTRY_POINT:
				return validateEntryPoint((EntryPoint)value, diagnostics, context);
			case EngineeringPackage.EXIT_POINT:
				return validateExitPoint((ExitPoint)value, diagnostics, context);
			case EngineeringPackage.EXPANSION_INPUT:
				return validateExpansionInput((ExpansionInput)value, diagnostics, context);
			case EngineeringPackage.EXPANSION_OUTPUT:
				return validateExpansionOutput((ExpansionOutput)value, diagnostics, context);
			case EngineeringPackage.FORK:
				return validateFork((Fork)value, diagnostics, context);
			case EngineeringPackage.INPUT_PIN:
				return validateInputPin((InputPin)value, diagnostics, context);
			case EngineeringPackage.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			case EngineeringPackage.OUTPUT_PIN:
				return validateOutputPin((OutputPin)value, diagnostics, context);
			case EngineeringPackage.START:
				return validateStart((Start)value, diagnostics, context);
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
	 * @generated NOT
	 */
	public boolean validateModelElement_path(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			String path = modelElement.getPath();
			if (!Util.isBlank(path)) {
				EReference cf = modelElement.eContainmentFeature();
				if (cf != null && cf.isMany()) {
					EObject c = modelElement.eContainer();
					if (c != null) {
						Object cfv = c.eGet(cf);
						if (cfv instanceof Collection) {
							DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, modelElement);
							for (Object e: (Collection<?>) cfv) {
								if (e != modelElement && e instanceof ModelElement && path.equals(((ModelElement) e).getPath())) {
									helper.error("Duplicate path in the containing collection: " + path);									
								}
							}
							return helper.isSuccess();
						}
					}
				}
			}
		}
		return true;
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
		if (result || diagnostics != null) result &= validateModelElement_path(increment, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateModelElement_path(persona, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateModelElement_path(organization, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateModelElement_path(release, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateModelElement_path(feature, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateModelElement_path(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(activity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_abstract(service, diagnostics, context);
		return result;
	}

	/**
	 * Validates the abstract constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateService_abstract(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, service);
			if (!service.getModifiers().contains(JourneyElement.ABSTRACT)) {
				Activity target = service.getTarget();
				if (target != null && target.getModifiers().contains(JourneyElement.ABSTRACT)) {
					helper.error("Concrete service references an abstract activity", EngineeringPackage.Literals.SERVICE__TARGET);
				}
			}
			
			return helper.isSuccess();
		}
		return true;
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
		if (result || diagnostics != null) result &= validateModelElement_path(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourney_final(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourney_abstract(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourney_elements(journey, diagnostics, context);
		return result;
	}

	/**
	 * Validates the final constraint of '<em>Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateJourney_final(Journey journey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, journey);
			Journey base = journey.getExtends();
			if (base != null && base.getModifiers().contains(JourneyElement.FINAL)) {
				helper.error("Final journey cannot be extended", EngineeringPackage.Literals.JOURNEY__EXTENDS);
			}
			
			return validateJourneyElement_final(journey, diagnostics, context) && helper.isSuccess();
		}
		return validateJourneyElement_final(journey, diagnostics, context);
	}

	/**
	 * Validates the abstract constraint of '<em>Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateJourney_abstract(Journey journey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && !journey.getModifiers().contains(JourneyElement.ABSTRACT)) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, journey);
			for (JourneyElement je: journey.getAllElements()) {
				if (je.getModifiers().contains(JourneyElement.ABSTRACT)) {
					helper.error("Abstract element in a concrete journey: " + je.getUri());
				}
			}
			
			return helper.isSuccess();
		}
		return true;
	}
	
	/**
	 * 
	 * @param journey
	 * @param diagnostics
	 * @param context
	 * @generated NOT
	 * @return
	 */
	public boolean validateJourney_elements(Journey journey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, journey);
			EList<Journey> journeyPath = ECollections.singletonEList(journey);
			validateJourneyElements(journeyPath, helper, context);
			return helper.isSuccess();
		}
		return true;		
	}	

	private void validateJourneyElements(EList<Journey> journeyPath, DiagnosticHelper helper, Map<Object, Object> context) {
		for (JourneyElement je: journeyPath.get(journeyPath.size() - 1).getAllElements()) {
			if (je instanceof Journey) {
				EList<Journey> jjPath = ECollections.newBasicEList(journeyPath);
				jjPath.add((Journey) je);
				validateJourneyElements(jjPath, helper, context);
			} else if (je instanceof Transition) {
				validateTransitionTarget(journeyPath, helper, (Transition) je, context);
			} else if (je instanceof End) {
				validateEndNoOutputs(journeyPath, helper, (End) je, context);
				validateEndNoCalls(journeyPath, helper, (End) je, context);
			} else if (je instanceof Start) {
				validateStartNoInputs(journeyPath, helper, (Start) je, context);
				validateStartNoInvocations(journeyPath, helper, (Start) je, context);
			} else if (je instanceof Fork) {
				validateForkMultipleBranches(journeyPath, helper, (Fork) je, context);
			} else if (je instanceof Join) {
				validateJoinMultipleBranches(journeyPath, helper, (Join) je, context);
			} else if (je instanceof Choice) {
				validateChoiceMultipleChoices(journeyPath, helper, (Choice) je, context);
			} 
		}	
	}
	
	/**
	 * String representation of the journey path excluding the first journey.
	 * @param journeyPath
	 * @return
	 */
	public static String journeyPath(EList<Journey> journeyPath) {
		if (journeyPath.size() < 2) {
			return "";		
		}
		
		StringBuilder ret = new StringBuilder("[");
		for (int i = 1; i < journeyPath.size(); ++i) {
			if (i > 1) {
				ret.append("/");
			}
			ret.append(journeyPath.get(i).getPath());
		}
		ret.append("] ");
		return ret.toString();
	}
	
	/**
	 * Validates the multipleChoices constraint of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void validateChoiceMultipleChoices(EList<Journey> journeyPath, DiagnosticHelper helper, Choice choice, Map<Object, Object> context) {
		if (choice.getAllOutputs(journeyPath).size() + choice.getAllCalls(journeyPath).size() < 2) {
			helper.warning(journeyPath(journeyPath) + "There should be multiple choices");
		}
	}
	

	/**
	 * Validates the target constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void validateTransitionTarget(EList<Journey> journeyPath, DiagnosticHelper helper, Transition transition, Map<Object, Object> context) {
		if (transition.getTarget(journeyPath) == null) {
			helper.error(journeyPath(journeyPath) + "Transition target cannot be resolved: " + transition.getTarget());
		}
	}
	
	/**
	 * Validates the noOutputs constraint of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void validateEndNoOutputs(EList<Journey> journeyPath, DiagnosticHelper helper, End end, Map<Object, Object> context) {
		if (!end.getAllOutputs(journeyPath).isEmpty()) {
			helper.error(journeyPath(journeyPath) + "End cannot have outputs");
		}
	}

	/**
	 * Validates the noCalls constraint of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void validateEndNoCalls(EList<Journey> journeyPath, DiagnosticHelper helper, End end, Map<Object, Object> context) {
		if (!end.getAllCalls(journeyPath).isEmpty()) {
			helper.error(journeyPath(journeyPath) + "End cannot have calls");
		}
	}

	/**
	 * Validates the multipleBranches constraint of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void validateForkMultipleBranches(EList<Journey> journeyPath, DiagnosticHelper helper, Fork fork, Map<Object, Object> context) {
		if (fork.getAllOutputs(journeyPath).size() + fork.getAllCalls(journeyPath).size() < 2) {
			helper.warning(journeyPath(journeyPath) + "There should be multiple branches");
		}
	}

	/**
	 * Validates the noInputs constraint of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void validateStartNoInputs(EList<Journey> journeyPath, DiagnosticHelper helper, Start start, Map<Object, Object> context) {
		if (!start.getAllInputs(journeyPath).isEmpty()) {
			helper.error(journeyPath(journeyPath) + "Start cannot have inputs");
		}
	}

	/**
	 * Validates the noInvocations constraint of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void validateStartNoInvocations(EList<Journey> journeyPath, DiagnosticHelper helper, Start start, Map<Object, Object> context) {
		if (!start.getAllInvocations(journeyPath).isEmpty()) {
			helper.error(journeyPath(journeyPath) + "Start cannot have invocations");
		}
	}

	/**
	 * Validates the multipleBranches constraint of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void validateJoinMultipleBranches(EList<Journey> journeyPath, DiagnosticHelper helper, Join join, Map<Object, Object> context) {
		if (join.getAllInputs(journeyPath).size() + join.getAllInvocations(journeyPath).size() < 2) {
			helper.warning(journeyPath(journeyPath) + "There should be multiple branches to merge");
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudoState(PseudoState pseudoState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pseudoState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(pseudoState, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoice(Choice choice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(choice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(choice, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(choice, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnd(End end, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(end, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(end, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(end, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(end, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(end, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(end, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(end, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(end, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPoint(EntryPoint entryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entryPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(entryPoint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPoint(ExitPoint exitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(exitPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(exitPoint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionInput(ExpansionInput expansionInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expansionInput, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(expansionInput, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionOutput(ExpansionOutput expansionOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expansionOutput, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(expansionOutput, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fork, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(fork, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin(InputPin inputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputPin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(inputPin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoin(Join join, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(join, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(join, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPin(OutputPin outputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outputPin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(outputPin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(start, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(start, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(transition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCall(Call call, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(call, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(call, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(call, diagnostics, context);
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
	public boolean validateAlignable(Alignable alignable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alignable, diagnostics, context);
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
	public boolean validateMemberAppearanceEntry(Map.Entry<?, ?> memberAppearanceEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)memberAppearanceEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberAppearance(MemberAppearance memberAppearance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memberAppearance, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(document, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEndeavor_start_end(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateIssue_increment(decision, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJourneyElement(JourneyElement journeyElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(journeyElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateEngineeredElement_capacity(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(journeyElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the final constraint of '<em>Journey Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateJourneyElement_final(JourneyElement journeyElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, journeyElement);
			JourneyElement overrides = journeyElement.getOverrides();
			if (overrides != null && overrides.getModifiers().contains(JourneyElement.FINAL)) {
				helper.error("Final elements cannot be overriden", EngineeringPackage.Literals.JOURNEY_ELEMENT__OVERRIDES);
			}
			
			if (journeyElement.getModifiers().contains(JourneyElement.FINAL) && journeyElement.getModifiers().contains(JourneyElement.ABSTRACT)) {
				helper.error("Journey element is both final and abstract", EngineeringPackage.Literals.JOURNEY_ELEMENT__MODIFIERS);
			}
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * Validates the override constraint of '<em>Journey Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateJourneyElement_override(JourneyElement journeyElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && journeyElement.getModifiers().contains(JourneyElement.OVERRIDE)) {
			JourneyElement overrides = journeyElement.getOverrides();
			if (overrides == null) {
				DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, journeyElement);
				helper.error("Element with 'override' modifier must override an inherited element with the same path", EngineeringPackage.Literals.JOURNEY_ELEMENT__MODIFIERS);
				return helper.isSuccess();
			}
		}
		return true;
	}

	/**
	 * Validates the suppress constraint of '<em>Journey Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateJourneyElement_suppress(JourneyElement journeyElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && journeyElement.getModifiers().contains(JourneyElement.SUPPRESS)) {
			JourneyElement overrides = journeyElement.getOverrides();
			if (overrides == null) {
				DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, journeyElement);
				helper.error("Element with 'suppress' modifier must suppress an inherited element with the same path", EngineeringPackage.Literals.JOURNEY_ELEMENT__MODIFIERS);
				return helper.isSuccess();
			}
		}
		return true;
	}

	/**
	 * Validates the suppressAndOverride constraint of '<em>Journey Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateJourneyElement_suppressAndOverride(JourneyElement journeyElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && journeyElement.getModifiers().contains(JourneyElement.SUPPRESS) && journeyElement.getModifiers().contains(JourneyElement.OVERRIDE)) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, journeyElement);
			helper.error("'override' and 'suppress' modifiers are mutually exclusive", EngineeringPackage.Literals.JOURNEY_ELEMENT__MODIFIERS);
			return helper.isSuccess();
		}
		return true;
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
