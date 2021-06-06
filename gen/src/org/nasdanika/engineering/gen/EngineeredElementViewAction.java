package org.nasdanika.engineering.gen;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.Principle;
import org.nasdanika.html.OrderedListType;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.app.viewparts.ListOfActionsViewPart;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;

public class EngineeredElementViewAction<T extends EngineeredElement> extends ForumViewAction<T> {
	
	protected EngineeredElementViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> children = super.collectChildren();
		
		EList<Issue> issues = getSemanticElement().getIssues();
		Action issuesSection = endeavorsSection(
				issues, 
				null,
				"Issues", 
				"issues", 
				getFeatureDiagnostic(EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES),
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
				EngineeringPackage.Literals.ENDEAVOR__COMPLETION);
		
		if (issuesSection != null) {
			children.add(issuesSection);
		}		
		
		List<Issue> allIssues = new ArrayList<>();
		getSemanticElement().eAllContents().forEachRemaining(e -> {
			if (e instanceof Issue) {
				allIssues.add((Issue) e);
			}
		});
		
		if (!issues.equals(allIssues)) {
			Action allIssuesSection = ModelElementViewActionImpl.endeavorsSection(
					allIssues, 
					null,
					"All Issues", 
					"all-issues", 
					null,
					getActivator(),
					Collections.emptyList(),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
					EngineeringPackage.Literals.ISSUE__REMAINING_COST,
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION);
			
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
		if (feature == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ALLOCATIONS) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		if (feature == EngineeringPackage.Literals.ENGINEERED_ELEMENT__PRINCIPLES) {
			return role == FeatureRole.FEATURE_ACTIONS || role == FeatureRole.ELEMENT_ACTIONS;
		}		
		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ALLOCATIONS) {
			EList<Allocation> allocations = getSemanticElement().getAllocations();
			if (allocations.isEmpty()) {
				return Collections.emptyList();
			}
			ModelElementFeatureViewAction<T, EStructuralFeature, EngineeredElementViewAction<T>> allocationsSection = new ModelElementFeatureViewAction<T, EStructuralFeature, EngineeredElementViewAction<T>>(this, feature) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
					Table table = bootstrapFactory.table().bordered().striped();
					table.header().headerRow("Endeavor", "Engineer", "Category", "Effort", "Rate", "Funds").color(Color.INFO);
					for (Allocation allocation: allocations) {
						Tag categoriesTag;
						EList<IssueCategory> category = allocation.getCategory();
						if (category.isEmpty()) {
							categoriesTag = TagName.span.create();
						} else if (category.size() == 1) {
							categoriesTag = viewGenerator.link(ViewAction.adaptToViewActionNonNull(category.get(0)));							
						} else {
							categoriesTag = viewGenerator.getHTMLFactory().tag(TagName.ul);
							for (Action ca: ViewAction.adaptToViewActionsNonNull(category)) {
								categoriesTag.content(TagName.li.create(viewGenerator.link(ca)));
							}
						}
						table.body().row(
								viewGenerator.link(ViewAction.adaptToViewActionNonNull(allocation.getEndeavor())),
								viewGenerator.link(ViewAction.adaptToViewActionNonNull(allocation.getEngineer())),
								categoriesTag,
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
		
		if (feature == EngineeringPackage.Literals.ENGINEERED_ELEMENT__PRINCIPLES) {
			EList<Principle> principles = getSemanticElement().getPrinciples();
			if (principles.isEmpty()) {
				return Collections.emptyList();
			}
			ModelElementFeatureViewAction<T, EStructuralFeature, EngineeredElementViewAction<T>> principlesSection = new ModelElementFeatureViewAction<T, EStructuralFeature, EngineeredElementViewAction<T>>(this, feature) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					ListOfActionsViewPart listOfPrinciples = new ListOfActionsViewPart(ViewAction.adaptToViewActionsNonNull(principles), null, true, 10, OrderedListType.ROTATE) {
						@Override
						protected Collection<Entry<Label, List<Action>>> getGroupedActions(ViewGenerator viewGenerator, Action currentAction) {
							if (currentAction instanceof ViewAction) {
								EObject se = ((ViewAction<?>) currentAction).getSemanticElement();
								if (se instanceof Principle) {
									return Collections.singleton(new AbstractMap.SimpleEntry<Label, List<Action>>(null, ViewAction.adaptToViewActionsNonNull(((Principle) se).getChildren())));
								}
							}
							return super.getGroupedActions(viewGenerator, currentAction);
						}
					};
					return viewGenerator.processViewPart(listOfPrinciples, progressMonitor);
				}
				
			};
			
			principlesSection.getRoles().add(Action.Role.SECTION); 
			principlesSection.setSectionStyle(SectionStyle.DEFAULT);
			principlesSection.setActivator(new PathNavigationActionActivator(principlesSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#feature-" + feature.getName(), getMarker()));
			return Collections.singleton(principlesSection);
		}

		return super.featureActions(feature);
	}

	@Override
	public boolean isInRole(String role) {
		return Action.Role.NAVIGATION.equals(role);
	}
		
}
