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
import org.nasdanika.emf.DiagnosticHelper;
import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Artifact;
import org.nasdanika.engineering.Call;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Directory;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredCapability;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.Journey;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.Note;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.Transition;

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
		return validate_EveryDefaultConstraint(engineeredElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersona(Persona persona, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(persona, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineer(Engineer engineer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule(org.nasdanika.engineering.Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(module, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(product, diagnostics, context);
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
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJourney(Journey journey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(journey, diagnostics, context);
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
		return validate_EveryDefaultConstraint(artifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectory(Directory directory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directory, diagnostics, context);
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
