package org.nasdanika.engineering.gen.tests;

import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.CommandFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.DiagnosticException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Status;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.ObjectLoader;
import org.nasdanika.common.persistence.SourceResolver;
import org.nasdanika.common.persistence.SourceResolver.Link;
import org.nasdanika.emf.persistence.EObjectLoader;
import org.nasdanika.engineering.gen.GenerateSiteConsumerFactory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.factories.BootstrapContainerApplicationSupplierFactory;
import org.nasdanika.html.app.factories.ComposedLoader;
import org.nasdanika.html.emf.SimpleEObjectViewAction;
import org.nasdanika.html.model.app.AppPackage;

/**
 * Base class for tests
 * @author Pavel
 *
 */
public class TestEngineeringGenBase {
	
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
	
	
	/**
	 * For resolving resource locations to their source locations on GitHub.
	 */
	private static final String TEST_RESOURCES_PREFIX = "engineering/gen/target/test-classes/";

	/**
	 * Generates a given model to a given output location in ../docs/tests/gen.
	 * Gets index.html in the output. Returns output directory. 
	 * @throws Exception
	 */
	protected File generate(URL modelURL, String output) throws Exception {
		return generate(modelURL, output, new PrintStreamProgressMonitor());
	}
	
	/**
	 * Generates a given model to a given output location in ../docs/tests/gen.
	 * Gets index.html in the output. Returns output directory. 
	 * @throws Exception
	 */
	protected File generate(URL modelURL, String output, ProgressMonitor progressMonitor) throws Exception {
		// This loader is needed to load the application template (dark-fluid.yml) and the site template (site.yml).
		ObjectLoader loader = new EObjectLoader(new ComposedLoader(), null, AppPackage.eINSTANCE);
		
		// Outputs to console, send to file if desired.	
		
		// Application template
		String resourceName = "org/nasdanika/html/app/templates/cerulean/dark-fluid.yml";
		BootstrapContainerApplicationSupplierFactory applicationSupplierFactory = (BootstrapContainerApplicationSupplierFactory) loader.loadYaml(getClass().getClassLoader().getResource(resourceName), progressMonitor);
		
		// Loading the model from demo.yml resource which references other resources.
		URI modelURI = URI.createURI(modelURL.toString());
		File outputDir = new File("../docs/tests/gen/" + output);
		GenerateSiteConsumerFactory consumerFactory = new GenerateSiteConsumerFactory(
				Collections.singleton(modelURI), 
				applicationSupplierFactory, 
				outputDir) {
			
//			@Override
//			protected MutableContext forkContext(Context context, ProgressMonitor progressMonitor) {
//				MutableContext ret = super.forkContext(context, progressMonitor);
//
//				MarkdownHelper markdownHelper = new MarkdownHelper() {
//					
//					@Override
//					protected DiagramGenerator getDiagramGenerator() {
//						return context.get(DiagramGenerator.class, DiagramGenerator.INSTANCE);
//					}
//					
//				};
//				ret.register(MarkdownHelper.class, markdownHelper);
//				
//				return ret;
//			}
			
		};
		
		Object actionFactory = loader.loadYaml(getClass().getResource("site.yml"), progressMonitor);
		SupplierFactory<Action> asf = Util.<Action>asSupplierFactory(actionFactory);		
		
		CommandFactory commandFactory = asf.then(consumerFactory); 
		
		// Creating a context. Put more interpolation tokens as needed
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		context.put(Context.BASE_URI_PROPERTY, "random://" + UUID.randomUUID() + "/" + UUID.randomUUID() + "/");
		context.put(SimpleEObjectViewAction.DOC_URI, "https://docs.nasdanika.org/engineering/engineering/");
		context.register(Date.class, new Date());

		// Resolver of resource URI to source location for creation of location links in properties tables.
		URI uri = URI.createFileURI(new File(".").getCanonicalPath());
		SourceResolver sourceResolver = marker -> {
			if (marker != null && !Util.isBlank(marker.getLocation())) { 
				try {
					File locationFile = new File(new java.net.URI(marker.getLocation()));
					URI locationURI = URI.createFileURI(locationFile.getCanonicalPath());
					URI relativeLocationURI = locationURI.deresolve(uri, true, true, true); 
					String relativeLocationString = relativeLocationURI.toString();
					return new Link() {
	
						@Override
						public String getLocation() {
							if (relativeLocationString.startsWith(TEST_RESOURCES_PREFIX)) {
								return "https://github.com/Nasdanika/engineering/blob/main/gen/src/test/resources/" + relativeLocationString.substring(TEST_RESOURCES_PREFIX.length()) + "#L" + marker.getLine();
							}
							return marker.getLocation();
						}
						
						@Override
						public String getText() {
							String path = relativeLocationString;
							if (path.startsWith(TEST_RESOURCES_PREFIX)) {
								path = "src/test/resources/" + relativeLocationString.substring(TEST_RESOURCES_PREFIX.length());										
							}
							return path + " " + marker.getLine() + ":" + marker.getColumn();
						}
						
					};
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			return null;
		};
		
		context.register(SourceResolver.class, sourceResolver);
		
		// Diagnosing loaded resources. 
		try {
			Diagnostic diagnostic = Util.call(commandFactory.create(context), progressMonitor);
			if (diagnostic.getStatus() == Status.WARNING || diagnostic.getStatus() == Status.ERROR) {
				System.err.println("***********************");
				System.err.println("*      Diagnostic     *");
				System.err.println("***********************");
				diagnostic.dump(System.err, 4, Status.ERROR, Status.WARNING);
			}
			return outputDir;
		} catch (DiagnosticException e) {
			System.err.println("******************************");
			System.err.println("*      Diagnostic failed     *");
			System.err.println("******************************");
			e.getDiagnostic().dump(System.err, 4, Status.FAIL);
			throw e;
		}
	}

}
