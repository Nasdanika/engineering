package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
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
		
		Action issuesSection = issuesSection(
				target.getIssues(), 
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
		
		
		List<Issue> issues = new ArrayList<>();
		target.eAllContents().forEachRemaining(e -> {
			if (e instanceof Issue) {
				issues.add((Issue) e);
			}
		});
		
		Action allIssuesSection = ModelElementViewAction.issuesSection(
				issues, 
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
				
		return children;
	}
	
	@Override
	protected boolean isPropertyFeature(EStructuralFeature sf) {
		return sf == EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNERS || super.isPropertyFeature(sf);
	}
	
	@Override
	protected boolean isContentReference(EReference ref) {
		if (ref == EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNERS) {
			return false;
		}
		if (ref == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES) {
			return false;
		}
		
		return super.isContentReference(ref);
	}
	
	@Override
	public SectionStyle getSectionStyle() {
		return SectionStyle.TAB;
	}
	
}
