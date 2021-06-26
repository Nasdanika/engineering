/**
 */
package org.nasdanika.engineering.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.Call;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Journey;
import org.nasdanika.engineering.JourneyElement;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.Transition;
import org.nasdanika.html.app.impl.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.engineering.impl.JourneyElementImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.JourneyElementImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.JourneyElementImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.JourneyElementImpl#getDeliverables <em>Deliverables</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.JourneyElementImpl#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.JourneyElementImpl#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.JourneyElementImpl#getOverridenBy <em>Overriden By</em>}</li>
 *   <li>{@link org.nasdanika.engineering.impl.JourneyElementImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyElementImpl extends EngineeredElementImpl implements JourneyElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringPackage.Literals.JOURNEY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getOutputs() {
		return (EList<Transition>)eDynamicGet(EngineeringPackage.JOURNEY_ELEMENT__OUTPUTS, EngineeringPackage.Literals.JOURNEY_ELEMENT__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getCalls() {
		return (EList<Call>)eDynamicGet(EngineeringPackage.JOURNEY_ELEMENT__CALLS, EngineeringPackage.Literals.JOURNEY_ELEMENT__CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<NamedElement> getRequirements() {
		return (EList<NamedElement>)eDynamicGet(EngineeringPackage.JOURNEY_ELEMENT__REQUIREMENTS, EngineeringPackage.Literals.JOURNEY_ELEMENT__REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<NamedElement> getDeliverables() {
		return (EList<NamedElement>)eDynamicGet(EngineeringPackage.JOURNEY_ELEMENT__DELIVERABLES, EngineeringPackage.Literals.JOURNEY_ELEMENT__DELIVERABLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getPersonas() {
		return (EList<Persona>)eDynamicGet(EngineeringPackage.JOURNEY_ELEMENT__PERSONAS, EngineeringPackage.Literals.JOURNEY_ELEMENT__PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JourneyElement getOverrides() {
		String path = getPath();
		if (!Util.isBlank(path)) {
			EObject c = eContainer();
			if (c instanceof Journey) {
				Journey base = ((Journey) c).getExtends();
				if (base != null) {
					for (JourneyElement be: base.getAllElements()) {
						if (path.equals(be.getPath())) {
							return be;
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyElement basicGetOverrides() {
		return (JourneyElement)eDynamicGet(EngineeringPackage.JOURNEY_ELEMENT__OVERRIDES, EngineeringPackage.Literals.JOURNEY_ELEMENT__OVERRIDES, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverrides(JourneyElement newOverrides, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOverrides, EngineeringPackage.JOURNEY_ELEMENT__OVERRIDES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<JourneyElement> getOverridenBy() {
		return getReferrers(EngineeringPackage.Literals.JOURNEY_ELEMENT__OVERRIDES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getModifiers() {
		return (EList<String>)eDynamicGet(EngineeringPackage.JOURNEY_ELEMENT__MODIFIERS, EngineeringPackage.Literals.JOURNEY_ELEMENT__MODIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Transition> getInputs(EList<Journey> journeyPath) {
		EList<Transition> ret = new BasicInternalEList<>(EObject.class);
		traverseAllElements(journeyPath, (jp, je) -> {
			for (Transition output: je.getOutputs()) {
				if (output.getTarget(jp) == this) {
					ret.add(output);
				}
			}			
		});
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Call> getInvocations(EList<Journey> journeyPath) {
		EList<Call> ret = new BasicInternalEList<>(EObject.class);
		traverseAllElements(journeyPath, (jp, je) -> {
			for (Call call: je.getCalls()) {
				if (call.getTarget(jp) == this) {
					ret.add(call);
				}
			}			
		});
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Transition> getAllInputs(EList<Journey> journeyPath) {
		EList<Transition> ret = new BasicInternalEList<>(EObject.class);
		traverseAllElements(journeyPath, (jp, je) -> {
			for (Transition output: je.getAllOutputs(jp)) {
				if (output.getTarget(jp) == this) {
					ret.add(output);
				}
			}			
		});
		return ret;
	}
	
	/**
	 * For each journey in the journey path traverses all elements recursively and passes the journey and journey element to {@link BiConsumer}.
	 * @param journeyPath
	 * @param consumer
	 */
	public static void traverseAllElements(EList<Journey> journeyPath, BiConsumer<EList<Journey>,JourneyElement> consumer) {
		EList<Journey> subPath = ECollections.newBasicEList();
		for (Journey journey: journeyPath) {
			traverseAllElements(journey, subPath, consumer);
			subPath.add(journey);
		}		
	}
	
	private static void traverseAllElements(Journey journey, EList<Journey> journeyPath, BiConsumer<EList<Journey>,JourneyElement> consumer) {
		EList<Journey> subPath = ECollections.newBasicEList(journeyPath);
		subPath.add(journey);
		for (JourneyElement je: journey.getAllElements()) {
			consumer.accept(subPath, je);
			if (je instanceof Journey) {
				traverseAllElements((Journey) je, subPath, consumer);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Call> getAllInvocations(EList<Journey> journeyPath) {
		EList<Call> ret = new BasicInternalEList<>(EObject.class);
		traverseAllElements(journeyPath, (jp, je) -> {
			for (Call call: je.getAllCalls(jp)) {
				if (call.getTarget(jp) == this) {
					ret.add(call);
				}
			}			
		});
		return ret;
	}
	
	/**
	 * Transition key is a path prefixed with p- or target prefixed with t-,
	 * if path is blank. If t is blank, which is an error, null is returned.
	 * @param transition
	 * @return
	 */
	private static String transitionKey(Transition transition) {
		String path = transition.getPath();
		if (Util.isBlank(path)) {
			String target = transition.getTarget();
			return Util.isBlank(target) ? null : "t-" + target;
		}
		return "p-" + path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Transition> getAllOutputs(EList<Journey> journeyPath) {
		if (getModifiers().contains(SUPPRESS)) {
			return ECollections.emptyEList();
		}
		EList<Transition> ret = ECollections.newBasicEList();
		Map<String,Transition> outputsTable = new LinkedHashMap<>();
		JourneyElement overrides = getOverrides(); 
		if (overrides != null) {
			for (Transition output: overrides.getAllOutputs(journeyPath)) {
				String outputKey = transitionKey(output); 
				if (Util.isBlank(outputKey)) {
					ret.add(output);
				} else {
					outputsTable.put(outputKey, output);
				}
			}
		}
		for (Transition output: getOutputs()) {
			String outputKey = transitionKey(output);
			JourneyElement target = output.getTarget(journeyPath);
			if (Util.isBlank(outputKey)) { 
				ret.add(output);
			} else if (output.isSuppress() || target == null || target.getModifiers().contains(SUPPRESS)) { 
				outputsTable.remove(outputKey) ;
			} else {
				outputsTable.put(outputKey, output);
			}
		}
		ret.addAll(outputsTable.values());
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Call> getAllCalls(EList<Journey> journeyPath) {
		if (getModifiers().contains(SUPPRESS)) {
			return ECollections.emptyEList();
		}
		EList<Call> ret = ECollections.newBasicEList();
		Map<String,Call> callsTable = new LinkedHashMap<>();
		JourneyElement overrides = getOverrides(); 
		if (overrides != null) {
			for (Call call: overrides.getAllCalls(journeyPath)) {
				String callKey = transitionKey(call); 
				if (Util.isBlank(callKey)) { 
					ret.add(call);
				} else {
					callsTable.put(callKey, call);
				}
			}
		}
		for (Call call: getCalls()) {
			String callKey = transitionKey(call); 
			JourneyElement target = call.getTarget(journeyPath);
			if (Util.isBlank(callKey)) { 
				ret.add(call);
			} else if (call.isSuppress() || target == null || target.getModifiers().contains(SUPPRESS)) {
				callsTable.remove(callKey);
			} else {
				callsTable.put(callKey, call);
			}
		}
		ret.addAll(callsTable.values()); 
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean overrides(JourneyElement journeyElement) {
		JourneyElement overrides = getOverrides();
		return overrides != null && (overrides == journeyElement || overrides.overrides(journeyElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.JOURNEY_ELEMENT__PERSONAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersonas()).basicAdd(otherEnd, msgs);
			case EngineeringPackage.JOURNEY_ELEMENT__OVERRIDES:
				JourneyElement overrides = basicGetOverrides();
				if (overrides != null)
					msgs = ((InternalEObject)overrides).eInverseRemove(this, EngineeringPackage.JOURNEY_ELEMENT__OVERRIDEN_BY, JourneyElement.class, msgs);
				return basicSetOverrides((JourneyElement)otherEnd, msgs);
			case EngineeringPackage.JOURNEY_ELEMENT__OVERRIDEN_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOverridenBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringPackage.JOURNEY_ELEMENT__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.JOURNEY_ELEMENT__CALLS:
				return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.JOURNEY_ELEMENT__PERSONAS:
				return ((InternalEList<?>)getPersonas()).basicRemove(otherEnd, msgs);
			case EngineeringPackage.JOURNEY_ELEMENT__OVERRIDES:
				return basicSetOverrides(null, msgs);
			case EngineeringPackage.JOURNEY_ELEMENT__OVERRIDEN_BY:
				return ((InternalEList<?>)getOverridenBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringPackage.JOURNEY_ELEMENT__OUTPUTS:
				return getOutputs();
			case EngineeringPackage.JOURNEY_ELEMENT__CALLS:
				return getCalls();
			case EngineeringPackage.JOURNEY_ELEMENT__REQUIREMENTS:
				return getRequirements();
			case EngineeringPackage.JOURNEY_ELEMENT__DELIVERABLES:
				return getDeliverables();
			case EngineeringPackage.JOURNEY_ELEMENT__PERSONAS:
				return getPersonas();
			case EngineeringPackage.JOURNEY_ELEMENT__OVERRIDES:
				if (resolve) return getOverrides();
				return basicGetOverrides();
			case EngineeringPackage.JOURNEY_ELEMENT__OVERRIDEN_BY:
				return getOverridenBy();
			case EngineeringPackage.JOURNEY_ELEMENT__MODIFIERS:
				return getModifiers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EngineeringPackage.JOURNEY_ELEMENT__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Transition>)newValue);
				return;
			case EngineeringPackage.JOURNEY_ELEMENT__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case EngineeringPackage.JOURNEY_ELEMENT__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case EngineeringPackage.JOURNEY_ELEMENT__DELIVERABLES:
				getDeliverables().clear();
				getDeliverables().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case EngineeringPackage.JOURNEY_ELEMENT__PERSONAS:
				getPersonas().clear();
				getPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case EngineeringPackage.JOURNEY_ELEMENT__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EngineeringPackage.JOURNEY_ELEMENT__OUTPUTS:
				getOutputs().clear();
				return;
			case EngineeringPackage.JOURNEY_ELEMENT__CALLS:
				getCalls().clear();
				return;
			case EngineeringPackage.JOURNEY_ELEMENT__REQUIREMENTS:
				getRequirements().clear();
				return;
			case EngineeringPackage.JOURNEY_ELEMENT__DELIVERABLES:
				getDeliverables().clear();
				return;
			case EngineeringPackage.JOURNEY_ELEMENT__PERSONAS:
				getPersonas().clear();
				return;
			case EngineeringPackage.JOURNEY_ELEMENT__MODIFIERS:
				getModifiers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EngineeringPackage.JOURNEY_ELEMENT__OUTPUTS:
				return !getOutputs().isEmpty();
			case EngineeringPackage.JOURNEY_ELEMENT__CALLS:
				return !getCalls().isEmpty();
			case EngineeringPackage.JOURNEY_ELEMENT__REQUIREMENTS:
				return !getRequirements().isEmpty();
			case EngineeringPackage.JOURNEY_ELEMENT__DELIVERABLES:
				return !getDeliverables().isEmpty();
			case EngineeringPackage.JOURNEY_ELEMENT__PERSONAS:
				return !getPersonas().isEmpty();
			case EngineeringPackage.JOURNEY_ELEMENT__OVERRIDES:
				return basicGetOverrides() != null;
			case EngineeringPackage.JOURNEY_ELEMENT__OVERRIDEN_BY:
				return !getOverridenBy().isEmpty();
			case EngineeringPackage.JOURNEY_ELEMENT__MODIFIERS:
				return !getModifiers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EngineeringPackage.JOURNEY_ELEMENT___GET_INPUTS__ELIST:
				return getInputs((EList<Journey>)arguments.get(0));
			case EngineeringPackage.JOURNEY_ELEMENT___GET_INVOCATIONS__ELIST:
				return getInvocations((EList<Journey>)arguments.get(0));
			case EngineeringPackage.JOURNEY_ELEMENT___GET_ALL_INPUTS__ELIST:
				return getAllInputs((EList<Journey>)arguments.get(0));
			case EngineeringPackage.JOURNEY_ELEMENT___GET_ALL_INVOCATIONS__ELIST:
				return getAllInvocations((EList<Journey>)arguments.get(0));
			case EngineeringPackage.JOURNEY_ELEMENT___GET_ALL_OUTPUTS__ELIST:
				return getAllOutputs((EList<Journey>)arguments.get(0));
			case EngineeringPackage.JOURNEY_ELEMENT___GET_ALL_CALLS__ELIST:
				return getAllCalls((EList<Journey>)arguments.get(0));
			case EngineeringPackage.JOURNEY_ELEMENT___OVERRIDES__JOURNEYELEMENT:
				return overrides((JourneyElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/**
	 * Inheriting name if blank
	 */
	@Override
	public String getName() {
		String name = super.getName();
		if (Util.isBlank(name)) {
			JourneyElement overrides = getOverrides();
			if (overrides != null) {
				return overrides.getName();
			}
		}
		return name;
	}

} //JourneyElementImpl
