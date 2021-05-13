package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Release;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;

public class IncrementViewAction extends NamedElementViewAction<Increment> {
	
	protected IncrementViewAction(Increment value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	public Label getCategory() {
		if (getSemanticElement().eContainmentFeature() == EngineeringPackage.Literals.INCREMENT__CHILDREN) {
			return null;
		}
		return super.getCategory();
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.INCREMENT__ISSUES) {
			return false;
		}
		if (feature == EngineeringPackage.Literals.INCREMENT__RELEASES) {
			return false;
		}
		if (feature == EngineeringPackage.Literals.INCREMENT__CHILDREN) {
			return role == FeatureRole.ELEMENT_ACTIONS;
		}
		
		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> children = super.collectChildren();
		
		EList<Release> releases = getSemanticElement().getReleases();
		if (!releases.isEmpty()) {
			ActionImpl releasesSection = new ActionImpl() {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) { 
					BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
					Table ret = bootstrapFactory.table().bordered();
					ret.header().headerRow("Product", "Release").color(Color.INFO);
					
					for (Release release: releases) {						
						Row releaseRow = ret.body().row(
							viewGenerator.link(EObjectAdaptable.adaptTo(release.eContainer(), ViewAction.class)),
							viewGenerator.link(EObjectAdaptable.adaptTo(release, ViewAction.class)));
						if (release.isAvailable()) {
							releaseRow.color(Color.SUCCESS);
						}
					}
					return ret;
				};
				
			};
			
			releasesSection.getRoles().add(Action.Role.SECTION); 
			releasesSection.setText("Releases"); 			
			releasesSection.setActivator(new PathNavigationActionActivator(releasesSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#releases", getMarker()));
			children.add(releasesSection);			
		}
		
		EList<Issue> issues = getSemanticElement().getIssues();
		if (!issues.isEmpty()) {
			ActionImpl issuesSection = new ActionImpl() {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) { 
					Fragment ret = viewGenerator.getHTMLFactory().fragment();
					
					ret.content(issueStatusSummaryTable(issues, viewGenerator, progressMonitor));
					
					ret.content(issuesTable(
							issues, 
							viewGenerator, 
							progressMonitor, 
							EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
							EngineeringPackage.Literals.ISSUE__STATUS,
							EngineeringPackage.Literals.ISSUE__TARGET,
							EngineeringPackage.Literals.ISSUE__CATEGORY,				
							EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
							EngineeringPackage.Literals.ENDEAVOR__EFFORT,
							EngineeringPackage.Literals.ENDEAVOR__COST,
							EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
							EngineeringPackage.Literals.ENDEAVOR__REMAINING_EFFORT,
							EngineeringPackage.Literals.ENDEAVOR__REMAINING_COST,
							EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
					
					return ret;
				};
				
				@Override
				public List<Action> getChildren() {
					return ViewAction.adaptToViewActionNonNull(issues);
				}
			};
			
			issuesSection.getRoles().add(Action.Role.SECTION); 
			issuesSection.setText("Issues"); 			
			issuesSection.setActivator(new PathNavigationActionActivator(issuesSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#issues", getMarker()));
			children.add(issuesSection);			
		}
		
		return children;
	}

}
