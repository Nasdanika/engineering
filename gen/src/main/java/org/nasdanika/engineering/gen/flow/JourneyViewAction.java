package org.nasdanika.engineering.gen.flow;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.flow.Activity;
import org.nasdanika.engineering.flow.Call;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.flow.Journey;
import org.nasdanika.engineering.flow.JourneyElement;
import org.nasdanika.engineering.flow.Service;
import org.nasdanika.engineering.flow.Start;
import org.nasdanika.engineering.flow.Transition;
import org.nasdanika.engineering.gen.EngineeringViewActionAdapterFactory;
import org.nasdanika.engineering.gen.JourneyElementViewActionProvider;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.NavigationActionActivator;

public class JourneyViewAction extends ActivityViewAction<Journey> {

	/**
	 * Journey path plus this view's journey.
	 */
	private EList<Journey> elementsJourneyPath;

	public JourneyViewAction(EList<Journey> journeyPath, Journey value, EngineeringViewActionAdapterFactory factory) {
		super(journeyPath, value, factory);
		elementsJourneyPath = ECollections.newBasicEList(journeyPath);
		elementsJourneyPath.add(value);
	}
	
	@Override
	protected Collection<EObject> referenceValue(EReference reference) { 
		if (reference == FlowPackage.Literals.JOURNEY__ALL_ELEMENTS) {
			Predicate<EObject> predicate = je -> !Util.isBlank(((JourneyElement) je).getName()) && (je instanceof Activity || je instanceof Service);
			return super.referenceValue(reference).stream().filter(predicate).collect(Collectors.toList());
		}
		return super.referenceValue(reference);
	}
	
	@Override
	protected Collection<Action> childrenActions(ETypedElement member) {
		if (member == FlowPackage.Literals.JOURNEY__ALL_ELEMENTS) {
			Collection<EObject> referenceValue = referenceValue((EReference) member);
			if (referenceValue == null) {
				return Collections.emptyList();
			}
			return referenceValue.stream().map(e -> adaptToViewAction((JourneyElement) e)).collect(Collectors.toList());
		}
		return super.childrenActions(member);
	}
	
	/**
	 * Adapts via JourneyElementViewActionProvider
	 * @param <J>
	 * @param <V>
	 * @param journeyElement
	 */
	protected JourneyElementViewAction<?> adaptToViewAction(JourneyElement journeyElement) {
		@SuppressWarnings("unchecked")
		JourneyElementViewActionProvider<JourneyElementViewAction<?>> tvap = Objects.requireNonNull(EObjectAdaptable.adaptTo(journeyElement, JourneyElementViewActionProvider.class));
		return Objects.requireNonNull(tvap.apply(elementsJourneyPath));
	}

	@Override
	protected String generatePlantUMLText() {
		Collection<JourneyElement> accumulator = new HashSet<>();
		StringBuilder ret = new StringBuilder(generateJourneyElementsText(getSemanticElement(), ((NavigationActionActivator) getActivator()).getUrl(null), accumulator));

		for (JourneyElement journeyElement: accumulator) {
			EList<Transition> outputs = journeyElement.getAllOutputs(elementsJourneyPath); 
			for (Transition output: outputs) {
				JourneyElement targetElement = output.getTarget(elementsJourneyPath);
				if (targetElement != null && accumulator.contains(targetElement) && !siblings(journeyElement, targetElement)) { 
					ret
						.append(diagramId(journeyElement))
						.append(" --> ")
						.append(diagramId(targetElement));
					
					if (!Util.isBlank(output.getName())) {
						ret.append(" : ") .append(output.getName());
					}
					ret.append(System.lineSeparator());
				}
			}
			
			for (Call call: journeyElement.getAllCalls(elementsJourneyPath)) {
				JourneyElement targetElement = call.getTarget(elementsJourneyPath);
				if (targetElement != null && accumulator.contains(targetElement) && !siblings(journeyElement, targetElement)) { 
					ret
						.append(diagramId(journeyElement))
						.append(" -left[#black]-> ")
						.append(diagramId(targetElement));
					
					if (!Util.isBlank(call.getName())) {
						ret.append(" : ").append(call.getName());
					}
					ret.append(System.lineSeparator());
				}
			}
		}
		return ret.toString();
	}

	private static boolean siblings(JourneyElement a, JourneyElement b) {
		EObject ac = a.eContainer();
		EObject bc = b.eContainer();
		if (ac == bc) {
			return true;
		}
		return ac instanceof Journey && bc instanceof Journey && (isSameOrExtension((Journey) ac, (Journey) bc) || isSameOrExtension((Journey) bc, (Journey) ac));
	}
	
	private static boolean isSameOrExtension(Journey extended, Journey extension) {
		if (extended == extension) {
			return true;
		}
		Journey ee = extension.getExtends();
		if (ee == null) {
			return false;
		}
		return isSameOrExtension(extended, ee);
	}

	protected String generateJourneyElementsText(Journey journey, String base, Collection<JourneyElement> accumulator) { 
		StringBuilder ret = new StringBuilder();
		EList<JourneyElement> journeyElements = journey.getAllElements(); 
		accumulator.addAll(journeyElements);
		Collection<JourneyElement> initialElements = new HashSet<>(journeyElements); 
		EList<Persona> journeyPersonas = journey.getPersonas();
		Map<List<Persona>, List<JourneyElement>> personaElements = EmfUtil.groupBy(journeyElements, FlowPackage.Literals.JOURNEY_ELEMENT__PERSONAS);
		for (Entry<List<Persona>, List<JourneyElement>> pe: personaElements.entrySet()) { 
			List<Persona> personas = pe.getKey();
			boolean isPersonasPartition = personas != null && !personas.isEmpty() && !personas.equals(journeyPersonas);
			if (isPersonasPartition) {
				// Personas partition
				ret.append(personasPartitionStart(personas, base));
			}
			
			for (JourneyElement journeyElement: pe.getValue()) {
				 if (journeyElement == null || journeyElement instanceof Start) { 
					 continue;
				 }
				 
				 if (journeyElement instanceof Journey && journeyElement.getModifiers().contains(JourneyElement.PARITTION)) {
						String jeName = journeyElement.getName();
						if (!Util.isBlank(jeName)) {
							 ret
							 	.append("\"")
							 	.append(wrap(jeName))
							 	.append("\" as ");
						}
						ret
							.append(diagramId(journeyElement))
							.append(" #FEFECE ");

						ret.append(styleBorder(journeyElement));

						ret
							.append(" {")
							.append(System.lineSeparator())
							.append(generateJourneyElementsText((Journey) journeyElement, base, accumulator))
							.append("}")
							.append(System.lineSeparator());
				 } else {			
					 ret.append(journeyElementState(journeyElement, base, false));
				 }
				 ret.append(System.lineSeparator());
			}
			if (isPersonasPartition) {
				ret.append("}").append(System.lineSeparator());
			}
		}

		Collection<JourneyElement> finalElements = new HashSet<>(); 
		for (JourneyElement journeyElement: journeyElements) {
			EList<Transition> outputs = journeyElement.getAllOutputs(elementsJourneyPath);
			if (outputs.isEmpty() && journeyElement.getAllInvocations(elementsJourneyPath).isEmpty()) { 
				finalElements.add(journeyElement);
			}
			for (Transition output: outputs) {
				JourneyElement targetElement = output.getTarget(elementsJourneyPath);
				if (targetElement != null && journeyElements.contains(targetElement)) { 
					initialElements.remove(targetElement); 
					ret	
						.append(diagramId(journeyElement))
						.append(" --> ")
						.append(diagramId(targetElement));
					String outputName = output.getName();
					if (!Util.isBlank(outputName)) {
						ret.append(" : ").append(outputName);
					}
					ret.append(System.lineSeparator());
				}
			}
			for (Call call: journeyElement.getAllCalls(elementsJourneyPath)) {
				JourneyElement targetElement = call.getTarget(elementsJourneyPath); 
				if (targetElement != null && journeyElements.contains(targetElement)) { 
					initialElements.remove(targetElement); 
					ret.append(diagramId(journeyElement))
					.append(" -right[#black]-> ")
					.append(diagramId(targetElement));
					String callName = call.getName();
					if (!Util.isBlank(callName)) {
						ret.append(" : ").append(callName);
					}
					ret.append(System.lineSeparator());
				}
			}
		}
	
		if (!journey.getModifiers().contains(JourneyElement.EXPLICIT_START)) {
			for (JourneyElement initialElement: initialElements) {
				ret.append(" [*] --> ").append(diagramId(initialElement)).append(System.lineSeparator());
			}
		}
		if (!journey.getModifiers().contains(JourneyElement.EXPLICIT_END)) {
			for (JourneyElement finalElement: finalElements) {
				ret.append(diagramId(finalElement)).append(" --> [*]").append(System.lineSeparator());
			}
		}
		return ret.toString();
	}
	
}
