package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class EngineeredElementViewAction<T extends EngineeredElement> extends NamedElementViewAction<T> {
	
	protected EngineeredElementViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}
	
	@Override
	public List<Action> getChildren() {
		List<Action> children = super.getChildren();
		
		EList<Issue> issues = target.getIssues();
		Action issuesSection = issuesSection(
				issues, 
				"Issues", 
				"issues", 
				EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
				EngineeringPackage.Literals.ISSUE__STATUS,
				EngineeringPackage.Literals.ISSUE__CATEGORY,				
				EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
				EngineeringPackage.Literals.ISSUE__EFFORT,
				EngineeringPackage.Literals.ISSUE__COST,
				EngineeringPackage.Literals.ISSUE__BENEFIT);
		
		if (issuesSection != null) {
			children.add(issuesSection);
		}
		
		
		List<Issue> allIssues = new ArrayList<>();
		target.eAllContents().forEachRemaining(e -> {
			if (e instanceof Issue) {
				allIssues.add((Issue) e);
			}
		});
		
		if (!issues.equals(allIssues)) {
			Action allIssuesSection = ModelElementViewAction.issuesSection(
					allIssues, 
					"All Issues", 
					"all-issues", 
					null,
					getActivator(),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ISSUE__ASSIGNEE,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ISSUE__BENEFIT);
			
			if (allIssuesSection != null) {
				children.add(allIssuesSection);
			}
		}
				
		return children;
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNERS) {
			return role == FeatureRole.PROPERTY;
		}
		if (feature == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES) {
			return role == FeatureRole.ELEMENT_ACTIONS;
		}
		return super.isFeatureInRole(feature, role);
	}
			
	@Override
	public SectionStyle getSectionStyle() {
		return getSectionChildren().size() > 1 ? SectionStyle.TAB : super.getSectionStyle();
	}
	
}
