package org.nasdanika.engineering.gen.representation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.Module;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.Organization;
import org.nasdanika.engineering.Product;
import org.nasdanika.engineering.gen.EngineeringViewActionAdapterFactory;
import org.nasdanika.engineering.gen.NamedElementViewAction;
import org.nasdanika.engineering.representation.ComponentDiagram;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.emf.ViewAction;

public class ComponentDiagramViewAction extends NamedElementViewAction<ComponentDiagram> {

	public ComponentDiagramViewAction(ComponentDiagram value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Object generateHead(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = (Fragment) super.generateHead(viewGenerator, progressMonitor);
		ret.content(generateDiagram());
		return ret;
	}

	protected Object generateDiagram() {
		EObject semanticContainer = getSemanticElement().eContainer();
		String base = ((NavigationActionActivator) ViewAction.adaptToViewActionNonNull(semanticContainer).getActivator()).getUrl(null);
		String spec = "";
		if (semanticContainer instanceof Engineer) {
			spec = generateEngineerDiagramSpec((Engineer) semanticContainer, base);
		} else if (semanticContainer instanceof org.nasdanika.engineering.Module) {
			spec = generateModuleDiagramSpec((org.nasdanika.engineering.Module) semanticContainer, base);			
		}
		if (Util.isBlank(spec)) {
			return "";
		}
		try {
			StringBuilder sb = new StringBuilder("hide empty description").append(System.lineSeparator()); 
			sb.append(spec);
			return getContext().get(DiagramGenerator.class).generateUmlDiagram(sb.toString());
		} catch (Exception e) {
			throw new NasdanikaException(e);
		}
	}
	
	/**
	 * Diagram containing all products and modules for this engineer including nested engineers for organizations.
	 * @param engineer
	 * @return
	 */
	protected String generateEngineerDiagramSpec(Engineer engineer, String base) {
		Set<ModelElement> accumulator = new HashSet<>();
		StringBuilder ret = new StringBuilder(generateEngineerDiagramSpecNoConnections(engineer, base, accumulator));
		for (ModelElement e: accumulator) {
			if (e instanceof org.nasdanika.engineering.Module) {
				for (Module dep: ((org.nasdanika.engineering.Module) e).getDependencies()) {
					if (accumulator.contains(dep)) {
						ret.append(diagramId(e)).append(" ..> ").append(diagramId(dep)).append(System.lineSeparator());
					}
				}
			}
		}
		return ret.toString();
	}
	
	private static boolean isComposite(Engineer engineer) {
		if (!engineer.getModules().isEmpty()) {
			return true;		
		}
		
		if (engineer instanceof Organization) {
			for (Engineer se: ((Organization) engineer).getEngineers()) {
				if (isComposite(se)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Generates spec without connections. Collects diagram elements to the accumulator to add connections later.
	 * @param engineer
	 * @param accumulator
	 * @return
	 */
	protected String generateEngineerDiagramSpecNoConnections(Engineer engineer, String base, Set<ModelElement> accumulator) {
		if (accumulator.add(engineer) && isComposite(engineer)) {
			StringBuilder sb = new StringBuilder(System.lineSeparator())
					.append("package ")
					.append(diagramElementDeclaration(engineer, true, base));
			
			sb.append(" {").append(System.lineSeparator());
			for (org.nasdanika.engineering.Module module: engineer.getModules()) {
				sb.append(generateModuleDiagramSpecNoConnections(module, base, null, accumulator));
			}
			
			if (engineer instanceof Organization) {
				for (Engineer orgEng: ((Organization) engineer).getEngineers()) {
					sb.append(generateEngineerDiagramSpecNoConnections(orgEng, base, accumulator));
				}
			}
			
			sb.append("}");			
			return sb.append(System.lineSeparator()).toString();
		}
		return "";
	}
		
	protected String generateModuleDiagramSpec(org.nasdanika.engineering.Module module, String base) {
		Set<org.nasdanika.engineering.Module> accumulator = new HashSet<>();
		StringBuilder ret = new StringBuilder(generateModuleDiagramSpecNoConnections(module, base, null, accumulator));
		for (org.nasdanika.engineering.Module dep: module.getDependants()) {
			ret.append(generateModuleDiagramSpecNoConnections(dep, base, module, accumulator));
		}
		for (org.nasdanika.engineering.Module dep: module.getDependencies()) {
			ret.append(generateModuleDiagramSpecNoConnections(dep, base, module, accumulator));
		}
		for (org.nasdanika.engineering.Module e: accumulator) {
			for (Module dep: e.getDependencies()) {
				if (accumulator.contains(dep)) {
					ret.append(diagramId(e)).append(" ..> ").append(diagramId(dep)).append(System.lineSeparator());
				}
			}
		}
		return ret.toString();
	}	
	
	protected String generateModuleDiagramSpecNoConnections(org.nasdanika.engineering.Module module, String base, org.nasdanika.engineering.Module contextModule, Set<? super org.nasdanika.engineering.Module> accumulator) {
		if (accumulator.add(module)) {
			boolean composite = !module.getModules().isEmpty();
			StringBuilder sb = new StringBuilder(System.lineSeparator())
					.append(module instanceof Product ? "node " : "component ")
					.append(diagramElementDeclaration(module, composite, base));
			
			if (contextModule != null && contextModule != module) {
				sb.append(" #DDDDDD");
			}
			
			if (composite) {
				sb.append(" {").append(System.lineSeparator());
				for (org.nasdanika.engineering.Module subModule: module.getModules()) {
					sb.append(generateModuleDiagramSpecNoConnections(subModule, base, contextModule, accumulator));
				}
				
				sb.append("}");			
			}
			return sb.append(System.lineSeparator()).toString();
		}
		return "";
	}	
	
	/**
	 * Generates a diagram element declaration - name, link. Does not include diagram element type, e.g. node or component.
	 * @param element Diagram element
	 * @param nameLink if true link to the element is generated for the name - shall be used if there are nested elements. If false, the link is generated for the entire element.
	 * @param base Base URL for relative links.
	 * @return
	 */
	protected String diagramElementDeclaration(NamedElement element, boolean nameLink, String base) {
		StringBuilder ret = new StringBuilder("\"");
		String eRef = ((NavigationActionActivator) ViewAction.adaptToViewActionNonNull(element).getActivator()).getUrl(base);
		String eDescr = diagramDescription(element);
		if ((Util.isBlank(eRef) && Util.isBlank(eDescr)) || !nameLink) {
			ret.append(element.getName());
		} else {
			ret
				.append("[[")
				.append(eRef)
				.append(eDescr)
				.append(" ")
				.append(element.getName())
				.append("]]");
		}
		
		ret.append("\" as ").append(diagramId(element));
		
		if (!(Util.isBlank(eRef) && Util.isBlank(eDescr)) && !nameLink) {
			ret
				.append(" [[")
				.append(eRef)
				.append(eDescr)
				.append("]]");
		}
		
		return ret.toString();
	}
	
}
