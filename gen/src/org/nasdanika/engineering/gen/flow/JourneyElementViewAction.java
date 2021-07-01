package org.nasdanika.engineering.gen.flow;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.text.WordUtils;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.Persona;
import org.nasdanika.engineering.flow.Call;
import org.nasdanika.engineering.flow.FlowPackage;
import org.nasdanika.engineering.flow.Journey;
import org.nasdanika.engineering.flow.JourneyElement;
import org.nasdanika.engineering.flow.PseudoState;
import org.nasdanika.engineering.flow.Start;
import org.nasdanika.engineering.flow.Transition;
import org.nasdanika.engineering.flow.impl.JourneyElementImpl;
import org.nasdanika.engineering.gen.EngineeredElementViewAction;
import org.nasdanika.engineering.gen.EngineeringViewActionAdapterFactory;
import org.nasdanika.engineering.gen.JourneyElementViewActionProvider;
import org.nasdanika.engineering.gen.ModelElementViewActionImpl;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.EOperationViewActionImpl;
import org.nasdanika.html.emf.ViewAction;

public class JourneyElementViewAction<T extends JourneyElement> extends EngineeredElementViewAction<T> {

	protected EList<Journey> journeyPath;

	protected JourneyElementViewAction(EList<Journey> journeyPath, T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
		this.journeyPath = journeyPath;		
	}
	
	@Override
	public Action getParent() {
		Action parent = super.getParent();
		if (!journeyPath.isEmpty()) {
			Journey semanticParent = journeyPath.get(journeyPath.size() - 1);
			JourneyElementViewActionProvider<?> jevap = EObjectAdaptable.adaptTo(semanticParent, JourneyElementViewActionProvider.class);
			if (jevap != null) {
				EList<Journey> semanticParentJourneyPath = ECollections.newBasicEList(journeyPath);
				semanticParentJourneyPath.remove(semanticParentJourneyPath.size() - 1);				
				parent = jevap.apply(semanticParentJourneyPath);
			}
		}
		
//		777 TODO
		EList<Persona> personas = getSemanticElement().getPersonas();
		if (personas.isEmpty()) {
			return parent;
		}
		StringBuilder idBuilder = new StringBuilder(parent.getId().toString()).append("-element-personas--");
		for (Action pva: adaptMemberElementsToViewActionsNonNull(FlowPackage.Literals.JOURNEY_ELEMENT__PERSONAS, personas)) {
			idBuilder.append(pva.getId()).append("-");
		}
		Action ret = parent.findById(idBuilder.toString());
		return ret == null ? parent : ret;
	}
	
	protected Table generateOutputsTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) { 
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table ret = bootstrapFactory.table().bordered().striped();
		ret.header().headerRow("Target", "Name", "Description", "Payload").color(Color.INFO); 
		for (Transition output: getSemanticElement().getAllOutputs(journeyPath)) {
			Row outputRow = ret.body().row();			
			ViewAction<?> targetAction = adaptTargetToViewAction(output); 
			outputRow.cell(targetAction == null ? bootstrapFactory.alert(Color.DANGER, "Unresolved output target: " + output.getTarget()) : viewGenerator.link(targetAction)); 
			outputRow.cell(StringEscapeUtils.escapeHtml4(output.getName())); 
			outputRow.cell(getModelElementDescription(output));
			outputRow.cell(listOfMemberElementsViewActions(FlowPackage.Literals.TRANSITION__PAYLOAD, output.getPayload(), null, true, false, 1));
		}
		return ret;
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
		return Objects.requireNonNull(tvap.apply(journeyPath));
	}
	
	protected JourneyElementViewAction<?> adaptTargetToViewAction(Transition transition) {
		JourneyElement target = transition.getTarget(journeyPath);
		return target == null ? null : adaptToViewAction(target);
	}

//	protected String targetNotFoundMessage(Transition transition) {
//		return "Target '" + transition.getTarget() + "' not found in journey path " + EngineeringValidator.journeyPath(journeyPath) + " at " + getMarker();
//	}
	
	protected Table generateCallsTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) { 
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table ret = bootstrapFactory.table().bordered().striped();
		ret.header().headerRow("Target", "Name", "Description", "Request", "Response").color(Color.INFO); 
		for (Call call: getSemanticElement().getAllCalls(journeyPath)) {
			Row callRow = ret.body().row();
			ViewAction<?> targetAction = adaptTargetToViewAction(call); 
			callRow.cell(targetAction == null ? bootstrapFactory.alert(Color.DANGER, "Unresolved call target: " + call.getTarget()) : viewGenerator.link(targetAction)); 
			callRow.cell(StringEscapeUtils.escapeHtml4(call.getName())); 
			callRow.cell(getModelElementDescription(call));
			callRow.cell(listOfMemberElementsViewActions(FlowPackage.Literals.TRANSITION__PAYLOAD, call.getPayload(), null, true, false, 1));
			callRow.cell(listOfMemberElementsViewActions(FlowPackage.Literals.CALL__RESPONSE, call.getResponse(), null, true, false, 1));
		}
		return ret;
	}
	
	protected Table generateInputsTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) { 
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table ret = bootstrapFactory.table().bordered().striped();
		ret.header().headerRow("Source", "Name", "Description", "Payload").color(Color.INFO); 
		for (Transition input: getSemanticElement().getAllInputs(journeyPath)) {
			Row inputRow = ret.body().row();
			JourneyElement baseSource = (JourneyElement) input.eContainer();
			JourneyElement[] realSource = { baseSource };
			JourneyElementImpl.traverseAllElements(journeyPath, (jp, je) -> {
				if (je.overrides(realSource[0])) {
					realSource[0] = je;
				}
			});
			ViewAction<?> targetAction = adaptToViewAction(realSource[0]); 
			inputRow.cell(viewGenerator.link(targetAction)); 
			inputRow.cell(StringEscapeUtils.escapeHtml4(input.getName())); 
			inputRow.cell(getModelElementDescription(input));
			inputRow.cell(listOfMemberElementsViewActions(FlowPackage.Literals.TRANSITION__PAYLOAD, input.getPayload(), null, true, false, 1));
		}
		return ret;
	}
	
	protected Table generateInvocationsTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) { 
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table ret = bootstrapFactory.table().bordered().striped();
		ret.header().headerRow("Source", "Name", "Description", "Request", "Response").color(Color.INFO); 
		for (Call call: getSemanticElement().getAllInvocations(journeyPath)) {
			Row outputRow = ret.body().row();
			JourneyElement baseSource = (JourneyElement) call.eContainer();
			JourneyElement[] realSource = { baseSource };
			JourneyElementImpl.traverseAllElements(journeyPath, (jp, je) -> {
				if (je.overrides(realSource[0])) {
					realSource[0] = je;
				}
			});
			ViewAction<?> targetAction = adaptToViewAction(realSource[0]); 
			outputRow.cell(viewGenerator.link(targetAction)); 
			outputRow.cell(StringEscapeUtils.escapeHtml4(call.getName())); 
			outputRow.cell(getModelElementDescription(call));
			outputRow.cell(listOfMemberElementsViewActions(FlowPackage.Literals.TRANSITION__PAYLOAD, call.getPayload(), null, true, false, 1));
			outputRow.cell(listOfMemberElementsViewActions(FlowPackage.Literals.CALL__RESPONSE, call.getResponse(), null, true, false, 1));
		}
		return ret;
	}

	@Override
	protected Collection<Action> memberActions(ETypedElement member) {
		 if (member == FlowPackage.Literals.JOURNEY_ELEMENT___GET_ALL_OUTPUTS__ELIST) {		
			 List<Transition> outputs = getSemanticElement().getAllOutputs(journeyPath);
			 if (outputs.isEmpty()) {
				 return Collections.emptyList() ;
			 }
			 
			 EOperationViewActionImpl<T, ModelElementViewActionImpl<T>> outputsSection = createOperationViewAction((EOperation) member, this::generateOutputsTable);			 
			 outputsSection.setActivator(new PathNavigationActionActivator(outputsSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#outputs", getMarker()));
			 return Collections.singleton(outputsSection);
		 }
		 
		 if (member == FlowPackage.Literals.JOURNEY_ELEMENT___GET_ALL_CALLS__ELIST) {		
			 List<Call> calls = getSemanticElement().getAllCalls(journeyPath);
			 if (calls.isEmpty()) {
				 return Collections.emptyList() ;
			 }
			 
			 EOperationViewActionImpl<T, ModelElementViewActionImpl<T>> outputsSection = createOperationViewAction((EOperation) member, this::generateCallsTable);			 
			 outputsSection.setActivator(new PathNavigationActionActivator(outputsSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#calls", getMarker()));
			 return Collections.singleton(outputsSection);
		 }
		 
		 if (member == FlowPackage.Literals.JOURNEY_ELEMENT___GET_ALL_INPUTS__ELIST) {		
			 List<Transition> inputs = getSemanticElement().getAllInputs(journeyPath);
			 if (inputs.isEmpty()) {
				 return Collections.emptyList() ;
			 }
			 
			 EOperationViewActionImpl<T, ModelElementViewActionImpl<T>> outputsSection = createOperationViewAction((EOperation) member, this::generateInputsTable);			 
			 outputsSection.setActivator(new PathNavigationActionActivator(outputsSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#inputs", getMarker()));
			 return Collections.singleton(outputsSection);
		 }
		 
		 if (member == FlowPackage.Literals.JOURNEY_ELEMENT___GET_ALL_INVOCATIONS__ELIST) {		
			 List<Call> invocations = getSemanticElement().getAllInvocations(journeyPath);
			 if (invocations.isEmpty()) {
				 return Collections.emptyList() ;
			 }
			 
			 EOperationViewActionImpl<T, ModelElementViewActionImpl<T>> outputsSection = createOperationViewAction((EOperation) member, this::generateInvocationsTable);			 
			 outputsSection.setActivator(new PathNavigationActionActivator(outputsSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#invocations", getMarker()));
			 return Collections.singleton(outputsSection);
		 }
		 
		 return super.memberActions(member);
	}
	
	@Override
	protected Object generateHead(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = (Fragment) super.generateHead(viewGenerator, progressMonitor);
		ret.content(generateDiagram());
		return ret;
	}

	protected Object generateDiagram() {
		String spec = generatePlantUMLText(); 
		if (Util.isBlank(spec)) {
			return "";
		}
		try {
			StringBuilder sb = new StringBuilder("hide empty description").append(System.lineSeparator()); 
			if (!getSemanticElement().getModifiers().contains(JourneyElement.VERTICAL)) {
				sb.append("left to right direction").append(System.lineSeparator());
			}
			sb.append(spec);
			return getContext().get(DiagramGenerator.class).generateUmlDiagram(sb.toString());
		} catch (Exception e) {
			throw new NasdanikaException(e);
		}
	}

	protected String generatePlantUMLText() {
		StringBuilder ret = new StringBuilder();
		if (getSemanticElement().eContainer() instanceof Journey) {
			String base = ((NavigationActionActivator) getActivator()).getUrl(null);
			Collection<JourneyElement> diagramElements = new HashSet<>();
			collectRelatedElements(getSemanticElement(), diagramElements);
			EList<Persona> semanticElementPersonas = getSemanticElement().getPersonas();
			Map<List<Persona>, List<JourneyElement>> personaElements = EmfUtil.groupBy(diagramElements, FlowPackage.Literals.JOURNEY_ELEMENT__PERSONAS);
			for (Entry<List<Persona>, List<JourneyElement>> pe: personaElements.entrySet()) { 
				List<Persona> personas = pe.getKey();
				boolean isPersonasPartition = personas != null && !personas.isEmpty() && !personas.equals(semanticElementPersonas);
				if (isPersonasPartition) {
					ret.append(personasPartitionStart(personas, base));
				}
				
				for (JourneyElement journeyElement: pe.getValue()) {
					 if (journeyElement == null || journeyElement instanceof Start) { 
						 continue;
					 }
				
					ret.append(journeyElementState(journeyElement, base, journeyElement != getSemanticElement()));
				}
				if (isPersonasPartition) {
					ret.append("}").append(System.lineSeparator());
				}
			}
	
			for (JourneyElement diagramElement: diagramElements) { 
				for (Transition output: diagramElement.getAllOutputs(journeyPath)) {
					JourneyElement targetElement = output.getTarget(journeyPath); 
					if (targetElement != null && diagramElements.contains(targetElement)) {
						 ret.append(diagramId(diagramElement))
						 .append(" --> ")
						 .append(diagramId(targetElement));
						 
						 if (!Util.isBlank(output.getName())) {
							 ret.append(" : ").append(output.getName());
						 }
						 ret.append(System.lineSeparator());
					}
				}
			
				for (Call call: diagramElement.getAllCalls(journeyPath)) {
					JourneyElement targetElement = call.getTarget(journeyPath); 
					if (targetElement != null && diagramElements.contains(targetElement)) { 
						ret
							.append (diagramId(diagramElement))
							.append(" -right[#black]-> ")
							.append(diagramId(targetElement));
						if (!Util.isBlank(call.getName())) {
							ret.append(" : ") .append(call.getName());
						}
						ret.append(System.lineSeparator());
					}
				}
			}
		}
		return ret.toString();
	}

	protected String journeyElementState(JourneyElement journeyElement, String base, boolean isSurroundingElement) {
		StringBuilder ret = new StringBuilder("state ");
		String jeName = journeyElement.getName();
		if (!Util.isBlank(jeName)) {
			 ret
			 	.append("\"")
			 	.append(wrap(jeName))
			 	.append("\" as ");
		}
		ret.append(diagramId(journeyElement));

		if (journeyElement instanceof PseudoState) {
			ret.append("<<").append(((PseudoState) journeyElement).getType()).append(">>");
		} else {
			String ref = ((NavigationActionActivator) adaptToViewAction(journeyElement).getActivator()).getUrl(base); 
			String refAndDescription = ref + diagramDescription(journeyElement); 
			if (!Util.isBlank(refAndDescription)) {
				ret.append(" [[").append(refAndDescription).append("]]");
			}
		}
		if (isSurroundingElement) {
			ret.append(" #DDDDDD");
		}
		ret.append(styleBorder(journeyElement));
		ret.append(System.lineSeparator());
		return ret.toString();
	}

	protected String styleBorder(JourneyElement journeyElement) {
		StringBuilder ret = new StringBuilder();
		if (journeyElement.getModifiers().contains(JourneyElement.ABSTRACT)) {
			ret.append(" ##[dashed]");
			if (journeyElement.getModifiers().contains(JourneyElement.OPTIONAL)) {
				ret.append("grey");			
			}
		} else if (journeyElement.getModifiers().contains(JourneyElement.FINAL)) {
			ret.append(" ##[bold]");
			if (journeyElement.getModifiers().contains(JourneyElement.OPTIONAL)) {
				ret.append("grey");			
			}
		} else if (journeyElement.getModifiers().contains(JourneyElement.OPTIONAL)) {
			ret.append(" ##grey");			
		}
		return ret.toString();
	}

	protected String personasPartitionStart(List<Persona> personas, String base) {
		StringBuilder ret = new StringBuilder("state ");
		
		Iterator<Persona> pit = personas.iterator();
		while (pit.hasNext()) {
			Persona persona = pit.next();
			String pRef = ((NavigationActionActivator) ViewAction.adaptToViewActionNonNull(persona).getActivator()).getUrl(base);
			String pDescr = diagramDescription(persona);
			if (Util.isBlank(pRef) && Util.isBlank(pDescr)) {
				ret.append(persona.getName());
			} else {
				ret
					.append("[[")
					.append(pRef)
					.append(pDescr)
					.append(" ")
					.append(persona.getName())
					.append("]]");
			}
			if (pit.hasNext()) {
				ret.append(", ");
			}
		}
		
		ret
			.append("\" as ")
			.append(diagramId(personas))
			.append(" #E0E0FF ##blue")
			.append(" {")
			.append(System.lineSeparator());
		
		return ret.toString();
	}
	
	protected static String wrap(String name) {
		int initialLineWidth = 20;
		if (Util.isBlank(name) || name.length() < initialLineWidth) { 
			return name;
		}
		int widthIncrementPerLine = 2;
		double lines = quadraticRoot(widthIncrementPerLine, initialLineWidth - widthIncrementPerLine, -name.length()); 
		return WordUtils.wrap(name, initialLineWidth + (int) (widthIncrementPerLine * Math.ceil(lines)), "\\n", false);
	}
	
	private static double quadraticRoot(double a, double b, double c) { 
		return (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);
	}
	
	private JourneyElement resolve(JourneyElement journeyElement) {
		String jePath = journeyElement.getPath();
		if (journeyPath.isEmpty() || Util.isBlank(jePath)) {
			return journeyElement;
		}
		Journey lastJourney = journeyPath.get(journeyPath.size() - 1);
		for (JourneyElement lje: lastJourney.getAllElements()) {
			if (jePath.equals(lje.getPath())) {
				return lje;
			}
		}
		return journeyElement;
	}

	private void collectRelatedElements(JourneyElement journeyElement, Collection<JourneyElement> accumulator) { 
		if (journeyElement != null && accumulator.add(journeyElement)) {
			for (Transition input: journeyElement.getAllInputs(journeyPath)) {
				JourneyElement target = (JourneyElement) input.eContainer(); 
				if (target instanceof PseudoState) {
					collectRelatedElements(target, accumulator);
				} else {					
					accumulator.add(resolve(target));
				}
			}

			for (Transition output: journeyElement.getAllOutputs(journeyPath)) {
				JourneyElement target = output.getTarget(journeyPath); 
				if (target instanceof PseudoState) {
					collectRelatedElements(target, accumulator);
				} else if (target != null) {
					accumulator.add(target);
				}
			}

			for (Call invocation: journeyElement.getAllInvocations(journeyPath)) {
				JourneyElement target = (JourneyElement) invocation.eContainer(); 
				if (target instanceof PseudoState) {
					collectRelatedElements(target, accumulator);
				} else if (target != null) {
					accumulator.add(resolve(target));
				}
			}

			for (Call call: journeyElement.getAllCalls(journeyPath)) {
				JourneyElement target = call.getTarget(journeyPath); 
				if (target instanceof PseudoState) {
					collectRelatedElements(target, accumulator);
				} else if (target != null) {
					accumulator.add(target);
				}
			}
		}
	}

	static String diagramId(List<? extends ModelElement> modelElements) {
		StringBuilder sb = new StringBuilder();
		for (ModelElement me: modelElements) {
			if (sb.length() > 0) {
				sb.append("-");
			}
			sb.append(diagramId(me));
		}

		return sb.toString();
	}

}
