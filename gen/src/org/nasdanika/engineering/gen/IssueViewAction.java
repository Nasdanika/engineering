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
import org.nasdanika.html.emf.EStructuralFeatureViewActionImpl;
import org.nasdanika.html.emf.HtmlEmfUtil;

public class IssueViewAction extends EngineeredCapabilityViewAction<Issue> {
	
	protected IssueViewAction(Issue value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	public boolean isInRole(String role) {
		if (getSemanticElement().eContainmentFeature() == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES) {
			return false; // Anonymous actions - rendered in a table.
		}
		if (getSemanticElement().eContainmentFeature() == EngineeringPackage.Literals.ISSUE__CHILDREN) {
			return false; // Anonymous actions - rendered in a table.
		}
		return super.isInRole(role);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.ISSUE__RELEASES) {
			return role == FeatureRole.PROPERTY;
		}
		if (feature == EngineeringPackage.Literals.ISSUE__CONTRIBUTES_TO) {
			return role == FeatureRole.PROPERTY;
		}
		if (feature == EngineeringPackage.Literals.ISSUE__CHILDREN) {
			return role == FeatureRole.FEATURE_ACTIONS || role == FeatureRole.ELEMENT_ACTIONS;
		}
		if (feature == EngineeringPackage.Literals.ISSUE__NOTES) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ISSUE__CHILDREN) {
			return Collections.singleton(endeavorsSection(
					getSemanticElement().getChildren(), 
					"Children", 
					"children", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
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
			EStructuralFeatureViewActionImpl<Issue, EStructuralFeature> notesAction = new EStructuralFeatureViewActionImpl<Issue, EStructuralFeature>(getSemanticElement(), feature) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					Fragment ret = viewGenerator.getHTMLFactory().fragment();
					for (Diagnostic diagnostic: getFeatureDiagnostic(feature)) {
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
				
			};
			notesAction.getRoles().add(Action.Role.SECTION);
			notesAction.setText(featureLabelText(feature));
			notesAction.setIcon(featureIcon(feature));
			notesAction.setDescription(featureDescription(feature));
			return Collections.singleton(notesAction);
		}
		return super.featureActions(feature);
	}

}
