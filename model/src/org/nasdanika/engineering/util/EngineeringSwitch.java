/**
 */
package org.nasdanika.engineering.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;

import org.nasdanika.engineering.Activity;
import org.nasdanika.engineering.Artifact;
import org.nasdanika.engineering.Call;
import org.nasdanika.engineering.Capability;
import org.nasdanika.engineering.Directory;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.engineering.EngineeringPackage
 * @generated
 */
public class EngineeringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EngineeringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringSwitch() {
		if (modelPackage == null) {
			modelPackage = EngineeringPackage.eINSTANCE;
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
			case EngineeringPackage.ADAPTABLE: {
				Adaptable adaptable = (Adaptable)theEObject;
				T result = caseAdaptable(adaptable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = caseAdaptable(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseModelElement(namedElement);
				if (result == null) result = caseAdaptable(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.INCREMENT: {
				Increment increment = (Increment)theEObject;
				T result = caseIncrement(increment);
				if (result == null) result = caseNamedElement(increment);
				if (result == null) result = caseModelElement(increment);
				if (result == null) result = caseAdaptable(increment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ISSUE_CATEGORY: {
				IssueCategory issueCategory = (IssueCategory)theEObject;
				T result = caseIssueCategory(issueCategory);
				if (result == null) result = caseNamedElement(issueCategory);
				if (result == null) result = caseModelElement(issueCategory);
				if (result == null) result = caseAdaptable(issueCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ISSUE_STATUS: {
				IssueStatus issueStatus = (IssueStatus)theEObject;
				T result = caseIssueStatus(issueStatus);
				if (result == null) result = caseNamedElement(issueStatus);
				if (result == null) result = caseModelElement(issueStatus);
				if (result == null) result = caseAdaptable(issueStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ISSUE: {
				Issue issue = (Issue)theEObject;
				T result = caseIssue(issue);
				if (result == null) result = caseEngineeredCapability(issue);
				if (result == null) result = caseCapability(issue);
				if (result == null) result = caseNamedElement(issue);
				if (result == null) result = caseModelElement(issue);
				if (result == null) result = caseAdaptable(issue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.NOTE: {
				Note note = (Note)theEObject;
				T result = caseNote(note);
				if (result == null) result = caseModelElement(note);
				if (result == null) result = caseAdaptable(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ENGINEERED_ELEMENT: {
				EngineeredElement engineeredElement = (EngineeredElement)theEObject;
				T result = caseEngineeredElement(engineeredElement);
				if (result == null) result = caseNamedElement(engineeredElement);
				if (result == null) result = caseModelElement(engineeredElement);
				if (result == null) result = caseAdaptable(engineeredElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.PERSONA: {
				Persona persona = (Persona)theEObject;
				T result = casePersona(persona);
				if (result == null) result = caseEngineeredElement(persona);
				if (result == null) result = caseNamedElement(persona);
				if (result == null) result = caseModelElement(persona);
				if (result == null) result = caseAdaptable(persona);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ENGINEER: {
				Engineer engineer = (Engineer)theEObject;
				T result = caseEngineer(engineer);
				if (result == null) result = casePersona(engineer);
				if (result == null) result = caseEngineeredElement(engineer);
				if (result == null) result = caseNamedElement(engineer);
				if (result == null) result = caseModelElement(engineer);
				if (result == null) result = caseAdaptable(engineer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseEngineer(organization);
				if (result == null) result = casePersona(organization);
				if (result == null) result = caseEngineeredElement(organization);
				if (result == null) result = caseNamedElement(organization);
				if (result == null) result = caseModelElement(organization);
				if (result == null) result = caseAdaptable(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.MODULE: {
				org.nasdanika.engineering.Module module = (org.nasdanika.engineering.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseEngineeredElement(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = caseModelElement(module);
				if (result == null) result = caseAdaptable(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseModule(product);
				if (result == null) result = caseEngineeredElement(product);
				if (result == null) result = caseNamedElement(product);
				if (result == null) result = caseModelElement(product);
				if (result == null) result = caseAdaptable(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseNamedElement(capability);
				if (result == null) result = caseModelElement(capability);
				if (result == null) result = caseAdaptable(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ENGINEERED_CAPABILITY: {
				EngineeredCapability engineeredCapability = (EngineeredCapability)theEObject;
				T result = caseEngineeredCapability(engineeredCapability);
				if (result == null) result = caseCapability(engineeredCapability);
				if (result == null) result = caseNamedElement(engineeredCapability);
				if (result == null) result = caseModelElement(engineeredCapability);
				if (result == null) result = caseAdaptable(engineeredCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.RELEASE: {
				Release release = (Release)theEObject;
				T result = caseRelease(release);
				if (result == null) result = caseEngineeredCapability(release);
				if (result == null) result = caseCapability(release);
				if (result == null) result = caseNamedElement(release);
				if (result == null) result = caseModelElement(release);
				if (result == null) result = caseAdaptable(release);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseEngineeredCapability(feature);
				if (result == null) result = caseCapability(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = caseModelElement(feature);
				if (result == null) result = caseAdaptable(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseEngineeredElement(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = caseModelElement(activity);
				if (result == null) result = caseAdaptable(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.JOURNEY: {
				Journey journey = (Journey)theEObject;
				T result = caseJourney(journey);
				if (result == null) result = caseActivity(journey);
				if (result == null) result = caseEngineeredElement(journey);
				if (result == null) result = caseNamedElement(journey);
				if (result == null) result = caseModelElement(journey);
				if (result == null) result = caseAdaptable(journey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseTransition(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseEngineeredElement(artifact);
				if (result == null) result = caseNamedElement(artifact);
				if (result == null) result = caseModelElement(artifact);
				if (result == null) result = caseAdaptable(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.DIRECTORY: {
				Directory directory = (Directory)theEObject;
				T result = caseDirectory(directory);
				if (result == null) result = caseNamedElement(directory);
				if (result == null) result = caseModelElement(directory);
				if (result == null) result = caseAdaptable(directory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persona</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersona(Persona object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineer(Engineer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(org.nasdanika.engineering.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineered Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineered Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeredCapability(EngineeredCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Increment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Increment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrement(Increment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueCategory(IssueCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueStatus(IssueStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelease(Release object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssue(Issue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectory(Directory object) {
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

} //EngineeringSwitch
