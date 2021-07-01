/**
 */
package org.nasdanika.engineering.flow.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.emf.DiagnosticHelper;
import org.nasdanika.engineering.flow.Activity;
import org.nasdanika.engineering.flow.Call;
import org.nasdanika.engineering.flow.Choice;
import org.nasdanika.engineering.flow.End;
import org.nasdanika.engineering.flow.EntryPoint;
import org.nasdanika.engineering.flow.ExitPoint;
import org.nasdanika.engineering.flow.ExpansionInput;
import org.nasdanika.engineering.flow.ExpansionOutput;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.flow.Fork;
import org.nasdanika.engineering.flow.InputPin;
import org.nasdanika.engineering.flow.Join;
import org.nasdanika.engineering.flow.Journey;
import org.nasdanika.engineering.flow.JourneyElement;
import org.nasdanika.engineering.flow.OutputPin;
import org.nasdanika.engineering.flow.PseudoState;
import org.nasdanika.engineering.flow.Service;
import org.nasdanika.engineering.flow.Start;
import org.nasdanika.engineering.flow.Transition;
import org.nasdanika.engineering.util.EngineeringValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.engineering.flow.FlowPackage
 * @generated
 */
public class FlowValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FlowValidator INSTANCE = new FlowValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.engineering.flow";

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
	protected EngineeringValidator engineeringValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowValidator() {
		super();
		engineeringValidator = EngineeringValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FlowPackage.eINSTANCE;
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
			case FlowPackage.JOURNEY_ELEMENT:
				return validateJourneyElement((JourneyElement)value, diagnostics, context);
			case FlowPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case FlowPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case FlowPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case FlowPackage.CALL:
				return validateCall((Call)value, diagnostics, context);
			case FlowPackage.JOURNEY:
				return validateJourney((Journey)value, diagnostics, context);
			case FlowPackage.PSEUDO_STATE:
				return validatePseudoState((PseudoState)value, diagnostics, context);
			case FlowPackage.CHOICE:
				return validateChoice((Choice)value, diagnostics, context);
			case FlowPackage.END:
				return validateEnd((End)value, diagnostics, context);
			case FlowPackage.ENTRY_POINT:
				return validateEntryPoint((EntryPoint)value, diagnostics, context);
			case FlowPackage.EXIT_POINT:
				return validateExitPoint((ExitPoint)value, diagnostics, context);
			case FlowPackage.EXPANSION_INPUT:
				return validateExpansionInput((ExpansionInput)value, diagnostics, context);
			case FlowPackage.EXPANSION_OUTPUT:
				return validateExpansionOutput((ExpansionOutput)value, diagnostics, context);
			case FlowPackage.FORK:
				return validateFork((Fork)value, diagnostics, context);
			case FlowPackage.INPUT_PIN:
				return validateInputPin((InputPin)value, diagnostics, context);
			case FlowPackage.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			case FlowPackage.OUTPUT_PIN:
				return validateOutputPin((OutputPin)value, diagnostics, context);
			case FlowPackage.START:
				return validateStart((Start)value, diagnostics, context);
			default:
				return true;
		}
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(journeyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(journeyElement, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(activity, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(activity, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(service, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_abstract(service, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(transition, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(call, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(journey, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourney_final(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourney_abstract(journey, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourney_elements(journey, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(pseudoState, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(pseudoState, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(choice, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(choice, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(end, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(end, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(entryPoint, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(exitPoint, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(expansionInput, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(expansionInput, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(expansionOutput, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(expansionOutput, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(fork, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(fork, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(inputPin, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(join, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(join, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(outputPin, diagnostics, context);
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
		if (result || diagnostics != null) result &= engineeringValidator.validateModelElement_path(start, diagnostics, context);
		if (result || diagnostics != null) result &= engineeringValidator.validateEngineeredElement_capacity(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_final(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_override(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppress(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateJourneyElement_suppressAndOverride(start, diagnostics, context);
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
			EList<Journey> journeyPath = ECollections.newBasicEList(journey.getContainmentJourneyPath());
			journeyPath.add(journey);
			validateJourneyElements(journeyPath, helper, context);
			return helper.isSuccess();
		}
		return true;		
	}	

	private void validateJourneyElements(EList<Journey> journeyPath, DiagnosticHelper helper, Map<Object, Object> context) {
		for (JourneyElement je: journeyPath.get(journeyPath.size() - 1).getAllElements()) {
			for (Transition transition: je.getAllOutputs(journeyPath)) {
				validateTransitionTarget(journeyPath, helper, je, transition, context);				
			}
			
			for (Call call: je.getAllCalls(journeyPath)) {
				validateTransitionTarget(journeyPath, helper, je, call, context);				
			}			
			
			if (je instanceof Journey) {
				EList<Journey> jjPath = ECollections.newBasicEList(journeyPath);
				jjPath.add((Journey) je);
				validateJourneyElements(jjPath, helper, context);
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
	private void validateTransitionTarget(EList<Journey> journeyPath, DiagnosticHelper helper, JourneyElement journeyElement, Transition transition, Map<Object, Object> context) {
		if (transition.getTarget(journeyPath) == null) {
			helper.error(journeyPath(journeyPath) + transition.eClass().getName() + " target of " + journeyElement.eClass().getName() + " '" + journeyElement.getName() + "' cannot be resolved: " + transition.getTarget());
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
					helper.error("Concrete service references an abstract activity", FlowPackage.Literals.SERVICE__TARGET);
				}
			}
			
			return helper.isSuccess();
		}
		return true;
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
				helper.error("Final journey cannot be extended", FlowPackage.Literals.JOURNEY__EXTENDS);
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
				helper.error("Final elements cannot be overriden", FlowPackage.Literals.JOURNEY_ELEMENT__OVERRIDES);
			}
			
			if (journeyElement.getModifiers().contains(JourneyElement.FINAL) && journeyElement.getModifiers().contains(JourneyElement.ABSTRACT)) {
				helper.error("Journey element is both final and abstract", FlowPackage.Literals.JOURNEY_ELEMENT__MODIFIERS);
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
				helper.error("Element with 'override' modifier must override an inherited element with the same path", FlowPackage.Literals.JOURNEY_ELEMENT__MODIFIERS);
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
				helper.error("Element with 'suppress' modifier must suppress an inherited element with the same path", FlowPackage.Literals.JOURNEY_ELEMENT__MODIFIERS);
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
			helper.error("'override' and 'suppress' modifiers are mutually exclusive", FlowPackage.Literals.JOURNEY_ELEMENT__MODIFIERS);
			return helper.isSuccess();
		}
		return true;
	}

} //FlowValidator
