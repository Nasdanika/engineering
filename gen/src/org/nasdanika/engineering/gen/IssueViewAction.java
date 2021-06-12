package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;
import java.util.function.BiFunction;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Note;
import org.nasdanika.html.Container;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapElement;
import org.nasdanika.html.emf.HtmlEmfUtil;

public class IssueViewAction extends EngineeredCapabilityViewAction<Issue> {
	
	protected IssueViewAction(Issue value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	protected Object generateNotes(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = viewGenerator.getHTMLFactory().fragment();
		for (Diagnostic diagnostic: getFeatureDiagnostic(EngineeringPackage.Literals.ISSUE__NOTES)) {
			viewGenerator.getBootstrapFactory().alert(HtmlEmfUtil.getSeverityColor(diagnostic.getSeverity()), diagnostic.getMessage());
		}
		
		BiFunction<Note, ETypedElement, ViewBuilder> cellBuilderProvider = (note, dataSource) -> {
			if (dataSource == EngineeringPackage.Literals.MODEL_ELEMENT__DESCRIPTION) {
				return (target, vg, pm) -> {
					((Container<?>) ((BootstrapElement<?,?>) target).toHTMLElement()).content(getModelElementDescription(note));
				};
			}
			return null;
		};
		
		ret.content(HtmlEmfUtil.table(
				getSemanticElement().getNotes(), 
				null,
				null, 
				cellBuilderProvider, 
				viewGenerator, 
				progressMonitor, 
				EngineeringPackage.Literals.MODEL_ELEMENT__DESCRIPTION,
				EngineeringPackage.Literals.NOTE__DATE,
				EngineeringPackage.Literals.NOTE__AUTHOR,
				EngineeringPackage.Literals.NOTE__STATUS,
				EngineeringPackage.Literals.NOTE__EFFORT,
				EngineeringPackage.Literals.NOTE__COST,
				EngineeringPackage.Literals.NOTE__REMAINING_EFFORT,
				EngineeringPackage.Literals.NOTE__REMAINING_COST));
		
		return ret;
	}	
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ISSUE__CHILDREN) {
			return Collections.singleton(endeavorsSection(
					getSemanticElement().getChildren(), 
					null,
					"Children", 
					"children", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORIES,				
					EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
					EngineeringPackage.Literals.ISSUE__REMAINING_COST,
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
		}
		if (feature == EngineeringPackage.Literals.ISSUE__NOTES) {
			if (getSemanticElement().getNotes().isEmpty()) {
				return Collections.emptyList();
			}
			ModelElementFeatureViewAction<Issue, EStructuralFeature, ModelElementViewActionImpl<Issue>> notesAction = createFeatureViewAction(feature, this::generateNotes);
			return Collections.singleton(notesAction);
		}
		return super.featureActions(feature);
	}

}
