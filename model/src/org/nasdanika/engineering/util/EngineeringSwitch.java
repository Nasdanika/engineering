/**
 */
package org.nasdanika.engineering.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;

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
import org.nasdanika.engineering.PackageAppearance;
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
import org.nasdanika.engineering.IssuePriority;
import org.nasdanika.engineering.IssueSeverity;
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
import org.nasdanika.engineering.TableOfContents;
import org.nasdanika.engineering.Topic;
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
			case EngineeringPackage.TABLE_OF_CONTENTS: {
				TableOfContents tableOfContents = (TableOfContents)theEObject;
				T result = caseTableOfContents(tableOfContents);
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
			case EngineeringPackage.ENDEAVOR: {
				Endeavor endeavor = (Endeavor)theEObject;
				T result = caseEndeavor(endeavor);
				if (result == null) result = caseAlignable(endeavor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.INCREMENT: {
				Increment increment = (Increment)theEObject;
				T result = caseIncrement(increment);
				if (result == null) result = caseNamedElement(increment);
				if (result == null) result = caseEndeavor(increment);
				if (result == null) result = caseModelElement(increment);
				if (result == null) result = caseAlignable(increment);
				if (result == null) result = caseAdaptable(increment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ISSUE_CATEGORY: {
				IssueCategory issueCategory = (IssueCategory)theEObject;
				T result = caseIssueCategory(issueCategory);
				if (result == null) result = caseAim(issueCategory);
				if (result == null) result = caseNamedElement(issueCategory);
				if (result == null) result = caseAlignable(issueCategory);
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
			case EngineeringPackage.ISSUE_PRIORITY: {
				IssuePriority issuePriority = (IssuePriority)theEObject;
				T result = caseIssuePriority(issuePriority);
				if (result == null) result = caseNamedElement(issuePriority);
				if (result == null) result = caseModelElement(issuePriority);
				if (result == null) result = caseAdaptable(issuePriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ISSUE_SEVERITY: {
				IssueSeverity issueSeverity = (IssueSeverity)theEObject;
				T result = caseIssueSeverity(issueSeverity);
				if (result == null) result = caseNamedElement(issueSeverity);
				if (result == null) result = caseModelElement(issueSeverity);
				if (result == null) result = caseAdaptable(issueSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ISSUE: {
				Issue issue = (Issue)theEObject;
				T result = caseIssue(issue);
				if (result == null) result = caseEngineeredCapability(issue);
				if (result == null) result = caseCapability(issue);
				if (result == null) result = caseEndeavor(issue);
				if (result == null) result = caseNamedElement(issue);
				if (result == null) result = caseAlignable(issue);
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
				if (result == null) result = caseForum(engineeredElement);
				if (result == null) result = caseNamedElement(engineeredElement);
				if (result == null) result = caseModelElement(engineeredElement);
				if (result == null) result = caseAdaptable(engineeredElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseEngineeredElement(document);
				if (result == null) result = caseForum(document);
				if (result == null) result = caseNamedElement(document);
				if (result == null) result = caseModelElement(document);
				if (result == null) result = caseAdaptable(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.PERSONA: {
				Persona persona = (Persona)theEObject;
				T result = casePersona(persona);
				if (result == null) result = caseEngineeredElement(persona);
				if (result == null) result = caseForum(persona);
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
				if (result == null) result = caseForum(engineer);
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
				if (result == null) result = caseForum(organization);
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
				if (result == null) result = caseForum(module);
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
				if (result == null) result = caseForum(product);
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
				if (result == null) result = caseEndeavor(engineeredCapability);
				if (result == null) result = caseNamedElement(engineeredCapability);
				if (result == null) result = caseAlignable(engineeredCapability);
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
				if (result == null) result = caseEndeavor(release);
				if (result == null) result = caseNamedElement(release);
				if (result == null) result = caseAlignable(release);
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
				if (result == null) result = caseEndeavor(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = caseAlignable(feature);
				if (result == null) result = caseModelElement(feature);
				if (result == null) result = caseAdaptable(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.DIRECTORY: {
				Directory directory = (Directory)theEObject;
				T result = caseDirectory(directory);
				if (result == null) result = caseEngineeredElement(directory);
				if (result == null) result = caseForum(directory);
				if (result == null) result = caseNamedElement(directory);
				if (result == null) result = caseModelElement(directory);
				if (result == null) result = caseAdaptable(directory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.CAPACITY: {
				Capacity capacity = (Capacity)theEObject;
				T result = caseCapacity(capacity);
				if (result == null) result = caseModelElement(capacity);
				if (result == null) result = caseAdaptable(capacity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ALLOCATION: {
				Allocation allocation = (Allocation)theEObject;
				T result = caseAllocation(allocation);
				if (result == null) result = caseCapacity(allocation);
				if (result == null) result = caseModelElement(allocation);
				if (result == null) result = caseAdaptable(allocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ALIGNABLE: {
				Alignable alignable = (Alignable)theEObject;
				T result = caseAlignable(alignable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.AIM: {
				Aim aim = (Aim)theEObject;
				T result = caseAim(aim);
				if (result == null) result = caseNamedElement(aim);
				if (result == null) result = caseAlignable(aim);
				if (result == null) result = caseModelElement(aim);
				if (result == null) result = caseAdaptable(aim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.PRINCIPLE: {
				Principle principle = (Principle)theEObject;
				T result = casePrinciple(principle);
				if (result == null) result = caseAim(principle);
				if (result == null) result = caseNamedElement(principle);
				if (result == null) result = caseAlignable(principle);
				if (result == null) result = caseModelElement(principle);
				if (result == null) result = caseAdaptable(principle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ALIGNMENT: {
				Alignment alignment = (Alignment)theEObject;
				T result = caseAlignment(alignment);
				if (result == null) result = caseModelElement(alignment);
				if (result == null) result = caseAdaptable(alignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseAim(goal);
				if (result == null) result = caseNamedElement(goal);
				if (result == null) result = caseAlignable(goal);
				if (result == null) result = caseModelElement(goal);
				if (result == null) result = caseAdaptable(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.FORUM: {
				Forum forum = (Forum)theEObject;
				T result = caseForum(forum);
				if (result == null) result = caseNamedElement(forum);
				if (result == null) result = caseModelElement(forum);
				if (result == null) result = caseAdaptable(forum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseNamedElement(message);
				if (result == null) result = caseModelElement(message);
				if (result == null) result = caseAdaptable(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.TOPIC: {
				Topic topic = (Topic)theEObject;
				T result = caseTopic(topic);
				if (result == null) result = caseMessage(topic);
				if (result == null) result = caseNamedElement(topic);
				if (result == null) result = caseModelElement(topic);
				if (result == null) result = caseAdaptable(topic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.PACKAGE_APPEARANCE: {
				PackageAppearance packageAppearance = (PackageAppearance)theEObject;
				T result = casePackageAppearance(packageAppearance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.PACKAGE_APPEARANCE_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, PackageAppearance> packageAppearanceEntry = (Map.Entry<String, PackageAppearance>)theEObject;
				T result = casePackageAppearanceEntry(packageAppearanceEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.APPEARANCE: {
				Appearance appearance = (Appearance)theEObject;
				T result = caseAppearance(appearance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.APPEARANCE_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Appearance> appearanceEntry = (Map.Entry<String, Appearance>)theEObject;
				T result = caseAppearanceEntry(appearanceEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE: {
				ModelElementAppearance modelElementAppearance = (ModelElementAppearance)theEObject;
				T result = caseModelElementAppearance(modelElementAppearance);
				if (result == null) result = caseAppearance(modelElementAppearance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.MODEL_ELEMENT_APPEARANCE_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, ModelElementAppearance> modelElementAppearanceEntry = (Map.Entry<String, ModelElementAppearance>)theEObject;
				T result = caseModelElementAppearanceEntry(modelElementAppearanceEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.MEMBER_APPEARANCE_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, MemberAppearance> memberAppearanceEntry = (Map.Entry<String, MemberAppearance>)theEObject;
				T result = caseMemberAppearanceEntry(memberAppearanceEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.MEMBER_APPEARANCE: {
				MemberAppearance memberAppearance = (MemberAppearance)theEObject;
				T result = caseMemberAppearance(memberAppearance);
				if (result == null) result = caseAppearance(memberAppearance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.NAMED_ELEMENT_REFERENCE: {
				NamedElementReference namedElementReference = (NamedElementReference)theEObject;
				T result = caseNamedElementReference(namedElementReference);
				if (result == null) result = caseNamedElement(namedElementReference);
				if (result == null) result = caseModelElement(namedElementReference);
				if (result == null) result = caseAdaptable(namedElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseNamedElement(link);
				if (result == null) result = caseModelElement(link);
				if (result == null) result = caseAdaptable(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.KEY_RESULT: {
				KeyResult keyResult = (KeyResult)theEObject;
				T result = caseKeyResult(keyResult);
				if (result == null) result = caseAim(keyResult);
				if (result == null) result = caseNamedElement(keyResult);
				if (result == null) result = caseAlignable(keyResult);
				if (result == null) result = caseModelElement(keyResult);
				if (result == null) result = caseAdaptable(keyResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.OBJECTIVE: {
				Objective objective = (Objective)theEObject;
				T result = caseObjective(objective);
				if (result == null) result = caseKeyResult(objective);
				if (result == null) result = caseAim(objective);
				if (result == null) result = caseNamedElement(objective);
				if (result == null) result = caseAlignable(objective);
				if (result == null) result = caseModelElement(objective);
				if (result == null) result = caseAdaptable(objective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseIssue(decision);
				if (result == null) result = caseAim(decision);
				if (result == null) result = caseEngineeredCapability(decision);
				if (result == null) result = caseCapability(decision);
				if (result == null) result = caseEndeavor(decision);
				if (result == null) result = caseNamedElement(decision);
				if (result == null) result = caseAlignable(decision);
				if (result == null) result = caseModelElement(decision);
				if (result == null) result = caseAdaptable(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.JOURNEY_ELEMENT: {
				JourneyElement journeyElement = (JourneyElement)theEObject;
				T result = caseJourneyElement(journeyElement);
				if (result == null) result = caseEngineeredElement(journeyElement);
				if (result == null) result = caseForum(journeyElement);
				if (result == null) result = caseNamedElement(journeyElement);
				if (result == null) result = caseModelElement(journeyElement);
				if (result == null) result = caseAdaptable(journeyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseJourneyElement(activity);
				if (result == null) result = caseEngineeredElement(activity);
				if (result == null) result = caseForum(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = caseModelElement(activity);
				if (result == null) result = caseAdaptable(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseJourneyElement(service);
				if (result == null) result = caseEngineeredElement(service);
				if (result == null) result = caseForum(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = caseModelElement(service);
				if (result == null) result = caseAdaptable(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = caseModelElement(transition);
				if (result == null) result = caseAdaptable(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseTransition(call);
				if (result == null) result = caseNamedElement(call);
				if (result == null) result = caseModelElement(call);
				if (result == null) result = caseAdaptable(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.JOURNEY: {
				Journey journey = (Journey)theEObject;
				T result = caseJourney(journey);
				if (result == null) result = caseActivity(journey);
				if (result == null) result = caseJourneyElement(journey);
				if (result == null) result = caseEngineeredElement(journey);
				if (result == null) result = caseForum(journey);
				if (result == null) result = caseNamedElement(journey);
				if (result == null) result = caseModelElement(journey);
				if (result == null) result = caseAdaptable(journey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.PSEUDO_STATE: {
				PseudoState pseudoState = (PseudoState)theEObject;
				T result = casePseudoState(pseudoState);
				if (result == null) result = caseJourneyElement(pseudoState);
				if (result == null) result = caseEngineeredElement(pseudoState);
				if (result == null) result = caseForum(pseudoState);
				if (result == null) result = caseNamedElement(pseudoState);
				if (result == null) result = caseModelElement(pseudoState);
				if (result == null) result = caseAdaptable(pseudoState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = casePseudoState(choice);
				if (result == null) result = caseJourneyElement(choice);
				if (result == null) result = caseEngineeredElement(choice);
				if (result == null) result = caseForum(choice);
				if (result == null) result = caseNamedElement(choice);
				if (result == null) result = caseModelElement(choice);
				if (result == null) result = caseAdaptable(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = casePseudoState(end);
				if (result == null) result = caseJourneyElement(end);
				if (result == null) result = caseEngineeredElement(end);
				if (result == null) result = caseForum(end);
				if (result == null) result = caseNamedElement(end);
				if (result == null) result = caseModelElement(end);
				if (result == null) result = caseAdaptable(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.ENTRY_POINT: {
				EntryPoint entryPoint = (EntryPoint)theEObject;
				T result = caseEntryPoint(entryPoint);
				if (result == null) result = casePseudoState(entryPoint);
				if (result == null) result = caseJourneyElement(entryPoint);
				if (result == null) result = caseEngineeredElement(entryPoint);
				if (result == null) result = caseForum(entryPoint);
				if (result == null) result = caseNamedElement(entryPoint);
				if (result == null) result = caseModelElement(entryPoint);
				if (result == null) result = caseAdaptable(entryPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.EXIT_POINT: {
				ExitPoint exitPoint = (ExitPoint)theEObject;
				T result = caseExitPoint(exitPoint);
				if (result == null) result = casePseudoState(exitPoint);
				if (result == null) result = caseJourneyElement(exitPoint);
				if (result == null) result = caseEngineeredElement(exitPoint);
				if (result == null) result = caseForum(exitPoint);
				if (result == null) result = caseNamedElement(exitPoint);
				if (result == null) result = caseModelElement(exitPoint);
				if (result == null) result = caseAdaptable(exitPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.EXPANSION_INPUT: {
				ExpansionInput expansionInput = (ExpansionInput)theEObject;
				T result = caseExpansionInput(expansionInput);
				if (result == null) result = casePseudoState(expansionInput);
				if (result == null) result = caseJourneyElement(expansionInput);
				if (result == null) result = caseEngineeredElement(expansionInput);
				if (result == null) result = caseForum(expansionInput);
				if (result == null) result = caseNamedElement(expansionInput);
				if (result == null) result = caseModelElement(expansionInput);
				if (result == null) result = caseAdaptable(expansionInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.EXPANSION_OUTPUT: {
				ExpansionOutput expansionOutput = (ExpansionOutput)theEObject;
				T result = caseExpansionOutput(expansionOutput);
				if (result == null) result = casePseudoState(expansionOutput);
				if (result == null) result = caseJourneyElement(expansionOutput);
				if (result == null) result = caseEngineeredElement(expansionOutput);
				if (result == null) result = caseForum(expansionOutput);
				if (result == null) result = caseNamedElement(expansionOutput);
				if (result == null) result = caseModelElement(expansionOutput);
				if (result == null) result = caseAdaptable(expansionOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.FORK: {
				Fork fork = (Fork)theEObject;
				T result = caseFork(fork);
				if (result == null) result = casePseudoState(fork);
				if (result == null) result = caseJourneyElement(fork);
				if (result == null) result = caseEngineeredElement(fork);
				if (result == null) result = caseForum(fork);
				if (result == null) result = caseNamedElement(fork);
				if (result == null) result = caseModelElement(fork);
				if (result == null) result = caseAdaptable(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.INPUT_PIN: {
				InputPin inputPin = (InputPin)theEObject;
				T result = caseInputPin(inputPin);
				if (result == null) result = casePseudoState(inputPin);
				if (result == null) result = caseJourneyElement(inputPin);
				if (result == null) result = caseEngineeredElement(inputPin);
				if (result == null) result = caseForum(inputPin);
				if (result == null) result = caseNamedElement(inputPin);
				if (result == null) result = caseModelElement(inputPin);
				if (result == null) result = caseAdaptable(inputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = casePseudoState(join);
				if (result == null) result = caseJourneyElement(join);
				if (result == null) result = caseEngineeredElement(join);
				if (result == null) result = caseForum(join);
				if (result == null) result = caseNamedElement(join);
				if (result == null) result = caseModelElement(join);
				if (result == null) result = caseAdaptable(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.OUTPUT_PIN: {
				OutputPin outputPin = (OutputPin)theEObject;
				T result = caseOutputPin(outputPin);
				if (result == null) result = casePseudoState(outputPin);
				if (result == null) result = caseJourneyElement(outputPin);
				if (result == null) result = caseEngineeredElement(outputPin);
				if (result == null) result = caseForum(outputPin);
				if (result == null) result = caseNamedElement(outputPin);
				if (result == null) result = caseModelElement(outputPin);
				if (result == null) result = caseAdaptable(outputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = casePseudoState(start);
				if (result == null) result = caseJourneyElement(start);
				if (result == null) result = caseEngineeredElement(start);
				if (result == null) result = caseForum(start);
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
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfContents(TableOfContents object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Endeavor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endeavor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndeavor(Endeavor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Issue Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssuePriority(IssuePriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueSeverity(IssueSeverity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capacity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapacity(Capacity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocation(Allocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alignable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alignable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignable(Alignable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAim(Aim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Principle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Principle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrinciple(Principle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignment(Alignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopic(Topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Appearance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageAppearance(PackageAppearance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Appearance Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Appearance Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageAppearanceEntry(Map.Entry<String, PackageAppearance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appearance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppearance(Appearance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appearance Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appearance Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppearanceEntry(Map.Entry<String, Appearance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Appearance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementAppearance(ModelElementAppearance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Appearance Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Appearance Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementAppearanceEntry(Map.Entry<String, ModelElementAppearance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Appearance Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Appearance Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberAppearanceEntry(Map.Entry<String, MemberAppearance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Appearance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberAppearance(MemberAppearance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElementReference(NamedElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyResult(KeyResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjective(Objective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
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
