/**
 */
package org.nasdanika.engineering.util;

import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.common.Adaptable;
import org.nasdanika.common.Context;
import org.nasdanika.emf.DiagnosticHelper;
import org.nasdanika.engineering.Aim;
import org.nasdanika.engineering.Alignable;
import org.nasdanika.engineering.Alignment;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Appearance;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Decision;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringFactory;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Event;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Goal;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssuePriority;
import org.nasdanika.engineering.IssueSeverity;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.KeyResult;
import org.nasdanika.engineering.Link;
import org.nasdanika.engineering.MemberAppearance;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.NamedElementReference;
import org.nasdanika.engineering.Note;
import org.nasdanika.engineering.Objective;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.PackageAppearance;
import org.nasdanika.engineering.Period;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.TableOfContents;
import org.nasdanika.engineering.Temporal;
import org.nasdanika.engineering.Topic;
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
			case EngineeringPackage.TABLE_OF_CONTENTS:
				return validateTableOfContents((TableOfContents)value, diagnostics, context);
			case EngineeringPackage.TEMPORAL:
				return validateTemporal((Temporal)value, diagnostics, context);
			case EngineeringPackage.PERIOD:
				return validatePeriod((Period)value, diagnostics, context);
			case EngineeringPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case EngineeringPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
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
			case EngineeringPackage.ENGINEERED_ELEMENT:
				return validateEngineeredElement((EngineeredElement)value, diagnostics, context);
			case EngineeringPackage.DOCUMENT:
				return validateDocument((Document)value, diagnostics, context);
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
			case EngineeringPackage.PACKAGE_APPEARANCE:
				return validatePackageAppearance((PackageAppearance)value, diagnostics, context);
			case EngineeringPackage.PACKAGE_APPEARANCE_ENTRY:
				return validatePackageAppearanceEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case EngineeringPackage.APPEARANCE:
				return validateAppearance((Appearance)value, diagnostics, context);
			case EngineeringPackage.APPEARANCE_ENTRY:
				return validateAppearanceEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE:
				return validateModelElementAppearance((ModelElementAppearance)value, diagnostics, context);
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE_ENTRY:
				return validateModelElementAppearanceEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case EngineeringPackage.MEMBER_APPEARANCE_ENTRY:
				return validateMemberAppearanceEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case EngineeringPackage.MEMBER_APPEARANCE:
				return validateMemberAppearance((MemberAppearance)value, diagnostics, context);
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
			case EngineeringPackage.DURATION:
				return validateDuration((Duration)value, diagnostics, context);
			case EngineeringPackage.INSTANT:
				return validateInstant((Instant)value, diagnostics, context);
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
	public boolean validateTableOfContents(TableOfContents tableOfContents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableOfContents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporal(Temporal temporal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(temporal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemporal_bounds(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemporal_offset(temporal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the bounds constraint of '<em>Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTemporal_bounds(Temporal temporal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, temporal);
			Temporal nt = temporal.normalize();
			for (Temporal lowerBound: temporal.getLowerBounds()) {
				Temporal nlb = lowerBound.normalize();
				if (lowerBound.after(temporal) == Boolean.TRUE) {
					helper.error("Lower bound " + nlb + " is after the temporal " + nt, EngineeringPackage.Literals.TEMPORAL__LOWER_BOUNDS);					
				}
				for (Temporal upperBound: temporal.getUpperBounds()) {
					if (lowerBound.after(upperBound) == Boolean.TRUE) {
						helper.error("Lower bound " + nlb + " is after upper bound" + upperBound.normalize(), EngineeringPackage.Literals.TEMPORAL__LOWER_BOUNDS);					
					}					
				}
			}
			for (Temporal upperBound: temporal.getUpperBounds()) {
				if (temporal.after(upperBound) == Boolean.TRUE) {
					helper.error("Upper bound " + upperBound.normalize() + " is before the temporal " + nt, EngineeringPackage.Literals.TEMPORAL__UPPER_BOUNDS);					
				}
			}
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * Validates the duration_without_base constraint of '<em>Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTemporal_offset(Temporal temporal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && temporal.getOffset() != null && temporal.getBase() == null && temporal.getInstant() == null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, temporal);
			helper.error("Offset without base or instant", EngineeringPackage.Literals.TEMPORAL__OFFSET);					
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriod(Period period, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(period, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(period, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(period, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(period, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(period, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(period, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(period, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(period, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(period, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_path(period, diagnostics, context);
		if (result || diagnostics != null) result &= validatePeriod_start_end(period, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= validateTemporal_bounds(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemporal_offset(event, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateModelElement_path(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validatePeriod_start_end(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(endeavor, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(endeavor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the start_end constraint of '<em>Endeavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePeriod_start_end(Period period, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, period);
			Temporal expectedEnd = period.getStart();
			Duration duration = period.getDuration();
			if (duration != null && expectedEnd != null) {
				expectedEnd = expectedEnd.plus(duration);
			}
			Temporal end = period.getEnd();
			if (expectedEnd != null && end != null && expectedEnd.after(end) == Boolean.TRUE) {
				helper.error("Period expected end " + expectedEnd.normalize() + " is after the end " + end.normalize(), EngineeringPackage.Literals.PERIOD__END);
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
	 * Validates the children constraint of '<em>Endeavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEndeavor_children(Endeavor period, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, period);
			Temporal start = period.getStart();
			Temporal end = period.getEnd();
			
			// Past due
			if (end != null && period.getCompletion() < 0.9999) {
				Context ctx = (Context) context.get(Context.class);
				if (ctx != null) {
					Date date = ctx.get(Date.class);					
					if (date != null) {
						Temporal ctxTemporal = EngineeringFactory.eINSTANCE.createTemporal();
						ctxTemporal.setInstant(date.toInstant());
						if (ctxTemporal.after(end) == Boolean.TRUE) {
							helper.warning("Past due", EngineeringPackage.Literals.PERIOD__END);
						}
					}
				}
			}	
						
			// Issue - children, release, feature
			if (period instanceof Issue) {
				Issue issue = (Issue) period;
				EObject ic = issue.eContainer();
				if (ic instanceof Issue) {
					Issue ci = (Issue) ic;
					Temporal cStart = ci.getStart();
					if (start != null && cStart != null && cStart.after(start) == Boolean.TRUE) {
						helper.error("Issue start " + start + " is before the parent issue date " + cStart, EngineeringPackage.Literals.PERIOD__START);						
					}
					Temporal cEnd = ci.getEnd();
					if (end != null && cEnd != null && cEnd.before(end) == Boolean.TRUE) {
						helper.error("Issue end " + end + " is after the parent issue end " + cEnd, EngineeringPackage.Literals.PERIOD__END);						
					}
				}
				
				for (Release release: issue.getReleases()) {
					Temporal rStart = release.getStart();
					if (start != null && rStart != null && rStart.after(start) == Boolean.TRUE) {
						helper.error("Issue start " + start + " is before the release start " + rStart, EngineeringPackage.Literals.PERIOD__START);						
					}
					Temporal rEnd = release.getEnd();
					if (end != null && rEnd != null && rEnd.before(end) == Boolean.TRUE) {
						helper.error("Issue end " + end + " is after the release end " + rEnd, EngineeringPackage.Literals.PERIOD__END);						
					}					
				}
				
				for (Feature feature: issue.getContributesTo()) {
					Temporal fStart = feature.getStart();
					if (start != null && fStart != null && fStart.after(start) == Boolean.TRUE) {
						helper.error("Issue start " + start + " is before the feature start " + fStart, EngineeringPackage.Literals.PERIOD__START);						
					}
					Temporal fEnd = feature.getEnd();
					if (end != null && fEnd != null && fEnd.before(end) == Boolean.TRUE) {
						helper.error("Issue end " + end + " is after the feature end " + fEnd, EngineeringPackage.Literals.PERIOD__END);						
					}					
				}
			}
			
			// Feature - release
			if (period instanceof Feature) {				
				for (Release release: ((Feature) period).getReleases()) {
					Temporal rStart = release.getStart();
					if (start != null && rStart != null && rStart.after(start) == Boolean.TRUE) {
						helper.error("Feature start " + start + " is before the release start " + rStart, EngineeringPackage.Literals.PERIOD__START);						
					}
					Temporal rEnd = release.getEnd();
					if (end != null && rEnd != null && rEnd.before(end) == Boolean.TRUE) {
						helper.error("Feature end " + end + " is after the release end " + rEnd, EngineeringPackage.Literals.PERIOD__END);						
					}					
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(increment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(increment, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(issue, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(issue, diagnostics, context);
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
				Temporal incStart = increment.getStart();
				Temporal issEnd = issue.getEnd();
				Temporal incEnd = increment.getEnd();
				DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, issue);
				if (issEnd != null && (incStart.after(issEnd) == Boolean.TRUE || incEnd.before(issEnd) == Boolean.TRUE)) {
					helper.error("Issue end " + issEnd + " is not within the increment " + incStart + " - " + incEnd, EngineeringPackage.Literals.ISSUE__INCREMENT);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(engineeredElement, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(persona, diagnostics, context);
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
	 * Validates the start_end constraint of '<em>Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEngineer_start_end(Engineer engineer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, engineer);
		if (diagnostics != null) {			
			Temporal start = engineer.getStart();
			Temporal end = engineer.getEnd();
			EObject ec = engineer.eContainer();
			if ((start != null || end != null) && ec instanceof Organization) {
				Organization org = (Organization) ec;
				Temporal oStart = org.getStart();
				Temporal normalizedStart = start == null ? null : start.normalize();
				Temporal normalizedEnd = end == null ? null : end.normalize();
				if (oStart != null) {
					Temporal normalizedOrgStart = oStart.normalize();
					if (oStart.after(start) == Boolean.TRUE) {
						helper.error("Engineer start " + normalizedStart + " is before the containing organization start " + normalizedOrgStart, EngineeringPackage.Literals.PERIOD__START);
					}
					if (oStart.after(end) == Boolean.TRUE) {
						helper.error("Engineer end " + normalizedEnd + " is before the containing organization start " + normalizedOrgStart, EngineeringPackage.Literals.PERIOD__END);
					}
				}
				Temporal oEnd = org.getEnd();
				if (oEnd != null) {
					Temporal normalizedOrgEnd = oEnd.normalize();
					if (oEnd.before(start) == Boolean.TRUE) {
						helper.error("Engineer start " + normalizedStart + " is after the containing organization end " + normalizedOrgEnd, EngineeringPackage.Literals.PERIOD__START);
					}
					if (oEnd.before(end) == Boolean.TRUE) {
						helper.error("Engineer end " + normalizedEnd + " is after the containing organization end " + normalizedOrgEnd, EngineeringPackage.Literals.PERIOD__END);
					}
				}				
			}
		}

		return validatePeriod_start_end(engineer, diagnostics, context) && helper.isSuccess();
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(module, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(product, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(capability, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(engineeredCapability, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(release, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_capacity(release, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndeavor_children(release, diagnostics, context);
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
				Temporal incStart = increment.getStart();
				Temporal relEnd = release.getEnd();
				Temporal incEnd = increment.getEnd();
				DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, release);
				if (relEnd != null && (incStart.after(relEnd) == Boolean.TRUE || incEnd.before(relEnd) == Boolean.TRUE)) {
					helper.error("Release end " + relEnd + " is not within the increment " + incStart + " - " + incEnd, EngineeringPackage.Literals.RELEASE__INCREMENT);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(feature, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(directory, diagnostics, context);
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
	public boolean validatePackageAppearance(PackageAppearance packageAppearance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageAppearance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageAppearanceEntry(Map.Entry<?, ?> packageAppearanceEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)packageAppearanceEntry, diagnostics, context);
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
	public boolean validateAppearanceEntry(Map.Entry<?, ?> appearanceEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)appearanceEntry, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(document, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePeriod_start_end(decision, diagnostics, context);
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
	public boolean validateDuration(Duration duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstant(Instant instant, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
