package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.EStructuralFeatureViewActionImpl;
import org.nasdanika.html.emf.ViewAction;

public class IssueCategoryViewAction extends NamedElementViewAction<IssueCategory> {
		
	public IssueCategoryViewAction(IssueCategory value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ISSUE_CATEGORY__ISSUES) {
			return Collections.singleton(endeavorsSection(
					getSemanticElement().getIssues(), 
					null,
					"Issues", 
					"Issues", 
					getFeatureDiagnostic(feature),					
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
					EngineeringPackage.Literals.ISSUE__REMAINING_COST,
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
		}
		if (feature == EngineeringPackage.Literals.ISSUE_CATEGORY__ALLOCATIONS) {
			EList<Allocation> allocations = getSemanticElement().getAllocations();
			if (allocations.isEmpty()) {
				return Collections.emptyList();
			}
			EStructuralFeatureViewActionImpl<IssueCategory, EStructuralFeature> allocationsSection = new EStructuralFeatureViewActionImpl<IssueCategory, EStructuralFeature>(getSemanticElement(), feature) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
					Table table = bootstrapFactory.table().bordered().striped();
					table.header().headerRow("Endeavor", "Engineer", "Target", "Effort", "Rate", "Funds").color(Color.INFO);
					for (Allocation allocation: allocations) {
						table.body().row(
								viewGenerator.link(ViewAction.adaptToViewActionNonNull(allocation.getEndeavor())),
								viewGenerator.link(ViewAction.adaptToViewActionNonNull(allocation.getEngineer())),
								viewGenerator.link(ViewAction.adaptToViewActionNonNull(allocation.eContainer())),
								allocation.getEffort(),
								allocation.getRate(),
								allocation.getFunds()
						);
					}					
					return table;
				}				
				
			};
			allocationsSection.getRoles().add(Action.Role.SECTION);
			return Collections.singleton(allocationsSection);
		}

		return super.featureActions(feature);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.ISSUE_CATEGORY__ISSUES) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		if (feature == EngineeringPackage.Literals.ISSUE_CATEGORY__ALLOCATIONS) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}

		return super.isFeatureInRole(feature, role);
	}
	
}
