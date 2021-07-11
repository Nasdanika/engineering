package org.nasdanika.engineering.tests;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Before;
import org.nasdanika.common.Context;
import org.nasdanika.emf.persistence.EObjectLoader;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.representation.RepresentationPackage;
import org.nasdanika.html.app.factories.ComposedLoader;

/**
 * Common methods for testing
 * @author Pavel
 *
 */
public class TestBase {

/* Packages, classes, features, operations to test
engineering
	representation
		ComponentDiagram
			depthOut
			depthIn
	flow
		JourneyElement
			outputs
			calls
			requirements
			deliverables
			personas
			overrides
			overridenBy
			modifiers
			getInputs()
			getInvocations()
			getAllInputs()
			getAllInvocations()
			getAllOutputs()
			getAllCalls()
			overrides()
		Activity
			features
			services
		Service
			target
		Transition
			payload
			suppress
			target
			lag
			getTarget()
		Call
			response
		Journey
			elements
			extends
			extensions
			root
			allElements
		PseudoState
			type
		Choice
		End
		EntryPoint
		ExitPoint
		ExpansionInput
		ExpansionOutput
		Fork
		InputPin
		Join
		OutputPin
		Start
	Adaptable
	ModelElement
		uri
		path
		description
		markdownDescription
		resources
		appearance
		tableOfContents
		sections
		representations
	TableOfContents
		role
		depth
		header
	Duration
	Instant
	Temporal
		instant
		base
		offset
		derivatives
		lowerBounds
		upperBounds
		after()
		before()
		coincides()
		normalize()
		minus()
		minus()
		plus()
	Period
		start
		end
		duration
	NamedElement
		name
	Event
	Endeavor
		completion
		benefit
		totalCost
		assignee
		allIssues
		capacity
		objectives
		linkedObjectives
		allObjectives
	Increment
		children
		issues
		releases
	IssueCategory
		weight
		issues
		cumulative
		allocations
	IssueStatus
		issues
		done
	IssuePriority
		issues
	IssueSeverity
		issues
	Issue
		children
		requires
		increment
		contributesTo
		notes
		categories
		target
		status
		workable
		releases
		effort
		cost
		remainingEffort
		remainingCost
		priority
		severity
	Note
		author
		date
		effort
		cost
		remainingEffort
		remainingCost
		status
	EngineeredElement
		issues
		owners
		experts
		allocations
		principles
		allIssues
	Document
		content
		markdownContent
	Persona
		journeyElements
		goals
		representatives
		extends
		extensions
	Engineer
		modules
		owns
		expertise
		increments
		services
		personas
		assignments
		issueCategories
		issueStatuses
		issuePriorities
		issueSeverities
		rate
		designations
		capacity
		represents
		messages
		objectives
	Organization
		engineers
	Module
		modules
		dependencies
		dependants
	Product
		releases
		features
		activities
	Capability
		requiredBy
		available
	EngineeredCapability
	Release
		increment
		features
		issues
	Feature
		releases
		activities
		issues
		uses
	Directory
		elements
	Capacity
		endeavor
		effort
		funds
		rate
	Allocation
		engineer
		category
	Alignable
		aligns
	Aim
		alignments
	Principle
		children
	Alignment
		aim
		weight
	Goal
		children
	Forum
		discussion
		topics
	Message
		date
		author
	Topic
		messages
	PackageAppearance
		modelElements
		subPackages
	PackageAppearanceEntry
		key
		value
	Appearance
		label
		icon
		description
		markdownDescription
		roles
		sectionStyle
	AppearanceEntry
		key
		value
	ModelElementAppearance
		features
		operations
		actions
	ModelElementAppearanceEntry
		key
		value
	MemberAppearanceEntry
		key
		value
	MemberAppearance
		category
	SectionStyle
	NamedElementReference
		target
	Link
		target
	KeyResult
		weight
		completion
		initiatives
	Objective
		endeavor
		keyResults
		children
		parent
		linkedObjectives
		subObjectives
	Decision
		effectiveStart
		effectiveEnd
		supercedes
		supercededBy
		resolution
 */
	

}
