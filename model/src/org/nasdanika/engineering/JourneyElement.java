/**
 */
package org.nasdanika.engineering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.JourneyElement#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.engineering.JourneyElement#getCalls <em>Calls</em>}</li>
 *   <li>{@link org.nasdanika.engineering.JourneyElement#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.JourneyElement#getDeliverables <em>Deliverables</em>}</li>
 *   <li>{@link org.nasdanika.engineering.JourneyElement#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.engineering.JourneyElement#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link org.nasdanika.engineering.JourneyElement#getOverridenBy <em>Overriden By</em>}</li>
 *   <li>{@link org.nasdanika.engineering.JourneyElement#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.engineering.EngineeringPackage#getJourneyElement()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/journey-element.md'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='final override suppress suppressAndOverride'"
 * @generated
 */
public interface JourneyElement extends EngineeredElement {

	public static final String ABSTRACT = "abstract";
	public static final String EXPLICIT_END = "explicit-end";
	public static final String EXPLICIT_START = "explicit-start";
	public static final String FINAL = "final";
	public static final String OPTIONAL = "optional";
	public static final String OVERRIDE = "override";
	public static final String PARITTION = "partition";
	public static final String SUPPRESS = "suppress";
	public static final String VERTICAL = "vertical";
	
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity outbound transitions to other activities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourneyElement_Outputs()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Transition> getOutputs();

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calls to other activities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourneyElement_Calls()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Call> getCalls();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input artifacts required to start working on this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourneyElement_Requirements()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Deliverables</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output artifacts of the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deliverables</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourneyElement_Deliverables()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getDeliverables();

	/**
	 * Returns the value of the '<em><b>Personas</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.Persona}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.Persona#getJourneyElements <em>Journey Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas performing this journey element if it is an activity. Applies to all journey elements in order to group them into persona partitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personas</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourneyElement_Personas()
	 * @see org.nasdanika.engineering.Persona#getJourneyElements
	 * @model opposite="journeyElements"
	 * @generated
	 */
	EList<Persona> getPersonas();

	/**
	 * Returns the value of the '<em><b>Overrides</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.JourneyElement#getOverridenBy <em>Overriden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A journey element which is overriden by this element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overrides</em>' reference.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourneyElement_Overrides()
	 * @see org.nasdanika.engineering.JourneyElement#getOverridenBy
	 * @model opposite="overridenBy" changeable="false" derived="true"
	 * @generated
	 */
	JourneyElement getOverrides();

	/**
	 * Returns the value of the '<em><b>Overriden By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.engineering.JourneyElement}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.engineering.JourneyElement#getOverrides <em>Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements of the extension journeys which override this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overriden By</em>' reference list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourneyElement_OverridenBy()
	 * @see org.nasdanika.engineering.JourneyElement#getOverrides
	 * @model opposite="overrides" changeable="false" derived="true"
	 * @generated
	 */
	EList<JourneyElement> getOverridenBy();

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of boolean flags:
	 * 
	 * * ``abstract`` - Specifies that this journey element is abstract. For journeys it means that they contain abstract elements and must be extended to become concrete. If a journey contains abstract elements and does not have abstract modifier, it is diagnosed as an error. If concrete journeys extend abstract journeys they must override (implement) all abstract elements.
	 * * ``explicit-end`` - Applies to [journeys](Journey.html). Specifies that the [end](End.html) [pseudo-state](PseudoState.html) shall not be inferred by finding journey elements with no outputs. End will either be explicitly specified or the diagram will not have an end pseudo-state.
	 * * ``explicit-start`` - Applies to journeys. Specifies that the [start](Start.html) pseudo-state shall not be inferred by finding journey elements with no inputs. Start will either be explicitly specified or the diagram will not have a start pseudo-state.
	 * * ``final`` - Specifies that this journey element cannot be overriden in journeys extending this journey. Overriding a final elemen will be diagnosed as an error. For example, in an organization some processes can be defined as journeys at higher levels of the orgnization and extended at lower levels. ``final`` modifier allows to specify what can be extended and what cannot. Specifying a top-level journey as final indicates that it cannot have extensions.
	 * * ``optional`` - Specifies that this journey element is optional. Optional elements have different apperance on diagrams.
	 * * ``override`` - Specifies that this journey element overrides an element in one of extended journeys. If this modifier is present and overrides reference is null, then it results in a diagnostic error.
	 * * ``partition`` - Applies to journeys and specifies that the journey shall be rendered as a partition on a digarm.
	 * * ``suppress`` - Specifies that this element supprresses its overriden element, i.e. removes it from the list of journey elements.
	 * * ``vertical`` - Specifies that journey element direction top-down instead of the default left-to-right.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see org.nasdanika.engineering.EngineeringPackage#getJourneyElement_Modifiers()
	 * @model
	 * @generated
	 */
	EList<String> getModifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitions which have this journey element as its target in a given journey path. 
	 * @param journeyPath Journey nesting path to resolve transitions target elements. May be different from the containment path in the case of nested journeys of extended journeys.
	 * <!-- end-model-doc -->
	 * @model journeyPathRequired="true" journeyPathMany="true"
	 * @generated
	 */
	EList<Transition> getInputs(EList<Journey> journeyPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calls which have this journey element as its target in a given journey path. 
	 * @param journeyPath Journey nesting path to resolve calls target elements. May be different from the containment path in the case of nested journeys of extended journeys.
	 * <!-- end-model-doc -->
	 * @model journeyPathRequired="true" journeyPathMany="true"
	 * @generated
	 */
	EList<Call> getInvocations(EList<Journey> journeyPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opposite to all outputs, i.e. all inbound transitions, in a given journey path.
	 * @param journeyPath Journey nesting path to resolve transitions target elements. May be different from the containment path in the case of nested journeys of extended journeys.
	 * <!-- end-model-doc -->
	 * @model journeyPathRequired="true" journeyPathMany="true"
	 * @generated
	 */
	EList<Transition> getAllInputs(EList<Journey> journeyPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opposite to all calls, i.e. all incoming calls, in a given journey path.
	 * @param journeyPath Journey nesting path to resolve calls target elements. May be different from the containment path in the case of nested journeys of extended journeys.
	 * <!-- end-model-doc -->
	 * @model journeyPathRequired="true" journeyPathMany="true"
	 * @generated
	 */
	EList<Call> getAllInvocations(EList<Journey> journeyPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Includes own outputs and outputs inherited from the base journey of the containing journey. This element outputs override inherited outputs with the same path.
	 * @param journeyPath Journey nesting path to resolve transitions target elements. May be different from the containment path in the case of nested journeys of extended journeys.
	 * <!-- end-model-doc -->
	 * @model journeyPathRequired="true" journeyPathMany="true"
	 * @generated
	 */
	EList<Transition> getAllOutputs(EList<Journey> journeyPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Includes own calls and calls inherited from the base journey of the containing journey. This element calls override inherited calls with the same path.
	 * @param journeyPath Journey nesting path to resolve calls target elements. May be different from the containment path in the case of nested journeys of extended journeys.
	 * <!-- end-model-doc -->
	 * @model journeyPathRequired="true" journeyPathMany="true"
	 * @generated
	 */
	EList<Call> getAllCalls(EList<Journey> journeyPath);

} // JourneyElement
