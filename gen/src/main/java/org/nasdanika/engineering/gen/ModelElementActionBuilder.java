package org.nasdanika.engineering.gen;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.function.BiConsumer;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.BiSupplier;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.diagram.Diagram;
import org.nasdanika.diagram.gen.Generator;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.html.emf.EObjectActionBuilder;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.app.SectionStyle;
import org.nasdanika.html.model.bootstrap.BootstrapFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.html.model.bootstrap.TableCell;
import org.nasdanika.html.model.bootstrap.TableRow;
import org.nasdanika.html.model.bootstrap.TableSection;
import org.nasdanika.html.model.html.HtmlFactory;
import org.nasdanika.ncore.util.NcoreUtil;

public class ModelElementActionBuilder<T extends ModelElement> extends EObjectActionBuilder<T> {
	
	/**
	 * Descriptions shorter than this value are put on the top of the tabs, longer
	 * ones end up in their own tab. 
	 */
	protected int descriptionTabLengthThreshold = 2500;

	public ModelElementActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) throws Exception {
		Action ret = super.buildAction(action, registry, resolveConsumer, progressMonitor);		
		T eObj = getTarget();
		URI uri = NcoreUtil.getUri(eObj);
		String id = uri == null ? eObj.getUuid() : uri.toString();
		String digest = Hex.encodeHexString(MessageDigest.getInstance("SHA-256").digest(id.getBytes(StandardCharsets.UTF_8)));
		ret.setId(digest);
		
		String description = eObj.getDescription();
		ret.setDescription(description);

		BiSupplier<EObject, String> cPath = NcoreUtil.containmentPath(eObj);
		if (cPath == null || Util.isBlank(cPath.getSecond())) {
			ret.setLocation("${base-uri}index.html");
		} else {
			ret.setLocation(cPath.getSecond() + "/index.html");
		}
		
		ret.setSectionStyle(SectionStyle.HEADER);
		return ret;
	}
	
	@Override
	protected Table createPropertiesTable(
			Action action,
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		Table propertiesTable = super.createPropertiesTable(action, context, progressMonitor);
		propertiesTable.getAttributes().put("style", createText("width:auto"));
		return propertiesTable;
	}
	
	@Override
	protected void resolve(Action action, org.nasdanika.html.emf.EObjectActionResolver.Context context,	ProgressMonitor progressMonitor) throws Exception {
		super.resolve(action, context, progressMonitor);
		
		// Adding documentation here so it appears under the properties table
		T semanticElement = getTarget();
		EList<EObject> documentation = semanticElement.getDocumentation();
		if (documentation.isEmpty()) {
			// Using description as documentation only if documentation is empty.
			String description = semanticElement.getDescription();
			addContent(action, description);
		} else {
			action.getContent().addAll(EcoreUtil.copyAll(documentation)); // TODO - wrap into a group in order to inject uri's properties, optionally save into its own resource.
		}		
		
		// Representations
		for (Diagram representation: semanticElement.getRepresentations()) {
			if (representation.getElements().isEmpty()) {
				populateRepresentation(representation, action, context, progressMonitor);
			}			
			Action representationAction;
			if (Util.isBlank(representation.getName())) {
				representationAction = action;
			} else {
				representationAction = AppFactory.eINSTANCE.createAction();
				representationAction.setText(representation.getName());
				action.getSections().add(representationAction); // TODO - support of navigation/navigation-modal - get from properties.
			}
			String rDescr = representation.getDescription();
			if (Util.isBlank(rDescr)) {
				addContent(representationAction, createGenerator().generate(representation));				
			} else {
				Table table = BootstrapFactory.eINSTANCE.createTable();
				action.getContent().add(table);
				table.setBordered(true);
				TableSection body = BootstrapFactory.eINSTANCE.createTableSection();
				table.setBody(body);
				table.getAttributes().put("style", createText("width:auto"));				
				
				TableRow diagramRow = BootstrapFactory.eINSTANCE.createTableRow();
				body.getRows().add(diagramRow);
				TableCell diagramCell = BootstrapFactory.eINSTANCE.createTableCell();
				diagramRow.getCells().add(diagramCell);				
				diagramCell.getContent().add(createText(createGenerator().generate(representation)));
				
				TableRow descriptionRow = BootstrapFactory.eINSTANCE.createTableRow();
				body.getRows().add(descriptionRow);
				TableCell descriptionCell = BootstrapFactory.eINSTANCE.createTableCell();
				descriptionRow.getCells().add(descriptionCell);				
				descriptionCell.getContent().add(createText(rDescr));								
			}
		}
		
	}
	
	/**
	 * Populates empty representations. An empty representation indicates that it has to be auto-populated. 
	 * Non-empty representations indicate that they were pre-populated, e.g. manually, and should not be auto-populated. 
	 * @param representation
	 */
	protected void populateRepresentation(
			Diagram representation, 
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) throws Exception {
		
	}
	
	@Override
	protected EObject renderValue(
			Action base, 
			ETypedElement typedElement, 
			Object value,
			org.nasdanika.html.emf.EObjectActionResolver.Context context, ProgressMonitor progressMonitor)
			throws Exception {

		if ((typedElement == EngineeringPackage.Literals.ENDEAVOR__COMPLETION || typedElement == EngineeringPackage.Literals.KEY_RESULT__COMPLETION) && value instanceof Double) {
			double completion = (Double) value;
			if (completion != Double.NaN && completion > 0.001) {
				int percentage = (int) (100.0 * completion);
				org.nasdanika.html.model.html.Tag progressBar = HtmlFactory.eINSTANCE.createTag();
				progressBar.setName("div");
				progressBar.getAttributes().put("class", createText("progress-bar"));
				progressBar.getAttributes().put("style", createText("width:" + percentage + "%"));
				progressBar.getContent().add(createText(percentage + "%"));
				
				org.nasdanika.html.model.html.Tag progress = HtmlFactory.eINSTANCE.createTag();
				progress.setName("div");
				progress.getAttributes().put("class", createText("progress"));
				progress.getContent().add(progressBar);
				return progress;
			}
			return null;
		}		
		
		return super.renderValue(base, typedElement, value, context, progressMonitor);
	}
	
	/**
	 * Creates a diagram {@link Generator}.
	 * @return
	 */
	protected Generator createGenerator() {
		return new Generator();
	}
	
}
