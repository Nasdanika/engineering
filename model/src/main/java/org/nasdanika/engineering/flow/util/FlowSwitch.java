/**
 */
package org.nasdanika.engineering.flow.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;

import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.NamedElement;

import org.nasdanika.engineering.Period;
import org.nasdanika.engineering.flow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.engineering.flow.FlowPackage
 * @generated
 */
public class FlowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSwitch() {
		if (modelPackage == null) {
			modelPackage = FlowPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FlowPackage.JOURNEY_ELEMENT: {
				JourneyElement journeyElement = (JourneyElement)theEObject;
				T result = caseJourneyElement(journeyElement);
				if (result == null) result = caseEngineeredElement(journeyElement);
				if (result == null) result = caseForum(journeyElement);
				if (result == null) result = casePeriod(journeyElement);
				if (result == null) result = caseNamedElement(journeyElement);
				if (result == null) result = caseModelElement(journeyElement);
				if (result == null) result = caseAdaptable(journeyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseJourneyElement(activity);
				if (result == null) result = caseEngineeredElement(activity);
				if (result == null) result = caseForum(activity);
				if (result == null) result = casePeriod(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = caseModelElement(activity);
				if (result == null) result = caseAdaptable(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseJourneyElement(service);
				if (result == null) result = caseEngineeredElement(service);
				if (result == null) result = caseForum(service);
				if (result == null) result = casePeriod(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = caseModelElement(service);
				if (result == null) result = caseAdaptable(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = caseModelElement(transition);
				if (result == null) result = caseAdaptable(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseTransition(call);
				if (result == null) result = caseNamedElement(call);
				if (result == null) result = caseModelElement(call);
				if (result == null) result = caseAdaptable(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.JOURNEY: {
				Journey journey = (Journey)theEObject;
				T result = caseJourney(journey);
				if (result == null) result = caseActivity(journey);
				if (result == null) result = caseJourneyElement(journey);
				if (result == null) result = caseEngineeredElement(journey);
				if (result == null) result = caseForum(journey);
				if (result == null) result = casePeriod(journey);
				if (result == null) result = caseNamedElement(journey);
				if (result == null) result = caseModelElement(journey);
				if (result == null) result = caseAdaptable(journey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PSEUDO_STATE: {
				PseudoState pseudoState = (PseudoState)theEObject;
				T result = casePseudoState(pseudoState);
				if (result == null) result = caseJourneyElement(pseudoState);
				if (result == null) result = caseEngineeredElement(pseudoState);
				if (result == null) result = caseForum(pseudoState);
				if (result == null) result = casePeriod(pseudoState);
				if (result == null) result = caseNamedElement(pseudoState);
				if (result == null) result = caseModelElement(pseudoState);
				if (result == null) result = caseAdaptable(pseudoState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = casePseudoState(choice);
				if (result == null) result = caseJourneyElement(choice);
				if (result == null) result = caseEngineeredElement(choice);
				if (result == null) result = caseForum(choice);
				if (result == null) result = casePeriod(choice);
				if (result == null) result = caseNamedElement(choice);
				if (result == null) result = caseModelElement(choice);
				if (result == null) result = caseAdaptable(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = casePseudoState(end);
				if (result == null) result = caseJourneyElement(end);
				if (result == null) result = caseEngineeredElement(end);
				if (result == null) result = caseForum(end);
				if (result == null) result = casePeriod(end);
				if (result == null) result = caseNamedElement(end);
				if (result == null) result = caseModelElement(end);
				if (result == null) result = caseAdaptable(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ENTRY_POINT: {
				EntryPoint entryPoint = (EntryPoint)theEObject;
				T result = caseEntryPoint(entryPoint);
				if (result == null) result = casePseudoState(entryPoint);
				if (result == null) result = caseJourneyElement(entryPoint);
				if (result == null) result = caseEngineeredElement(entryPoint);
				if (result == null) result = caseForum(entryPoint);
				if (result == null) result = casePeriod(entryPoint);
				if (result == null) result = caseNamedElement(entryPoint);
				if (result == null) result = caseModelElement(entryPoint);
				if (result == null) result = caseAdaptable(entryPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.EXIT_POINT: {
				ExitPoint exitPoint = (ExitPoint)theEObject;
				T result = caseExitPoint(exitPoint);
				if (result == null) result = casePseudoState(exitPoint);
				if (result == null) result = caseJourneyElement(exitPoint);
				if (result == null) result = caseEngineeredElement(exitPoint);
				if (result == null) result = caseForum(exitPoint);
				if (result == null) result = casePeriod(exitPoint);
				if (result == null) result = caseNamedElement(exitPoint);
				if (result == null) result = caseModelElement(exitPoint);
				if (result == null) result = caseAdaptable(exitPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.EXPANSION_INPUT: {
				ExpansionInput expansionInput = (ExpansionInput)theEObject;
				T result = caseExpansionInput(expansionInput);
				if (result == null) result = casePseudoState(expansionInput);
				if (result == null) result = caseJourneyElement(expansionInput);
				if (result == null) result = caseEngineeredElement(expansionInput);
				if (result == null) result = caseForum(expansionInput);
				if (result == null) result = casePeriod(expansionInput);
				if (result == null) result = caseNamedElement(expansionInput);
				if (result == null) result = caseModelElement(expansionInput);
				if (result == null) result = caseAdaptable(expansionInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.EXPANSION_OUTPUT: {
				ExpansionOutput expansionOutput = (ExpansionOutput)theEObject;
				T result = caseExpansionOutput(expansionOutput);
				if (result == null) result = casePseudoState(expansionOutput);
				if (result == null) result = caseJourneyElement(expansionOutput);
				if (result == null) result = caseEngineeredElement(expansionOutput);
				if (result == null) result = caseForum(expansionOutput);
				if (result == null) result = casePeriod(expansionOutput);
				if (result == null) result = caseNamedElement(expansionOutput);
				if (result == null) result = caseModelElement(expansionOutput);
				if (result == null) result = caseAdaptable(expansionOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FORK: {
				Fork fork = (Fork)theEObject;
				T result = caseFork(fork);
				if (result == null) result = casePseudoState(fork);
				if (result == null) result = caseJourneyElement(fork);
				if (result == null) result = caseEngineeredElement(fork);
				if (result == null) result = caseForum(fork);
				if (result == null) result = casePeriod(fork);
				if (result == null) result = caseNamedElement(fork);
				if (result == null) result = caseModelElement(fork);
				if (result == null) result = caseAdaptable(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.INPUT_PIN: {
				InputPin inputPin = (InputPin)theEObject;
				T result = caseInputPin(inputPin);
				if (result == null) result = casePseudoState(inputPin);
				if (result == null) result = caseJourneyElement(inputPin);
				if (result == null) result = caseEngineeredElement(inputPin);
				if (result == null) result = caseForum(inputPin);
				if (result == null) result = casePeriod(inputPin);
				if (result == null) result = caseNamedElement(inputPin);
				if (result == null) result = caseModelElement(inputPin);
				if (result == null) result = caseAdaptable(inputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = casePseudoState(join);
				if (result == null) result = caseJourneyElement(join);
				if (result == null) result = caseEngineeredElement(join);
				if (result == null) result = caseForum(join);
				if (result == null) result = casePeriod(join);
				if (result == null) result = caseNamedElement(join);
				if (result == null) result = caseModelElement(join);
				if (result == null) result = caseAdaptable(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.OUTPUT_PIN: {
				OutputPin outputPin = (OutputPin)theEObject;
				T result = caseOutputPin(outputPin);
				if (result == null) result = casePseudoState(outputPin);
				if (result == null) result = caseJourneyElement(outputPin);
				if (result == null) result = caseEngineeredElement(outputPin);
				if (result == null) result = caseForum(outputPin);
				if (result == null) result = casePeriod(outputPin);
				if (result == null) result = caseNamedElement(outputPin);
				if (result == null) result = caseModelElement(outputPin);
				if (result == null) result = caseAdaptable(outputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = casePseudoState(start);
				if (result == null) result = caseJourneyElement(start);
				if (result == null) result = caseEngineeredElement(start);
				if (result == null) result = caseForum(start);
				if (result == null) result = casePeriod(start);
				if (result == null) result = caseNamedElement(start);
				if (result == null) result = caseModelElement(start);
				if (result == null) result = caseAdaptable(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journey Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journey Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJourneyElement(JourneyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJourney(Journey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudo State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudo State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudoState(PseudoState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPoint(EntryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitPoint(ExitPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionInput(ExpansionInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionOutput(ExpansionOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFork(Fork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPin(InputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPin(OutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForum(Forum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineered Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineered Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeredElement(EngineeredElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FlowSwitch
