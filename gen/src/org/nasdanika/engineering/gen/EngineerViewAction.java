package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.Capacity;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Feature;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.Release;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.RowContainer;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.EStructuralFeatureViewActionImpl;
import org.nasdanika.html.emf.ViewAction;
import org.nasdanika.html.emf.ViewActionImpl;

public class EngineerViewAction<T extends Engineer> extends PersonaViewAction<T> {
		
	public EngineerViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS) {
			EStructuralFeatureViewActionImpl<T, EStructuralFeature> assignmentsAction = new EStructuralFeatureViewActionImpl<T, EStructuralFeature>(getSemanticElement(), feature);
			assignmentsAction.getRoles().add(Action.Role.SECTION);
			
			ViewBuilder productHeaderBuilder = new ViewBuilder() {

				@Override
				public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					((RowContainer.Row.Cell) target).toHTMLElement().content("Product");
				}
				
			};
			
			assignmentsAction.getChildren().add(endeavorsSection(
					getSemanticElement().getAssignments().stream().filter(e -> e instanceof Release && !e.getAllIssues().isEmpty()).collect(Collectors.toList()), 
					e -> e == EcorePackage.Literals.EOBJECT___ECONTAINER ? productHeaderBuilder : null,
					"Releases", 
					"assignments-releases", 
					getFeatureDiagnostic(feature),
					EcorePackage.Literals.EOBJECT___ECONTAINER,
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST,					
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));			
			
			assignmentsAction.getChildren().add(endeavorsSection(
					getSemanticElement().getAssignments().stream().filter(e -> e instanceof Feature && !e.getAllIssues().isEmpty()).collect(Collectors.toList()), 
					null,
					"Features", 
					"assignments-features", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST,					
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));			
			
			assignmentsAction.getChildren().add(endeavorsSection(
					getSemanticElement().getAssignments().stream().filter(e -> e instanceof Increment && !e.getAllIssues().isEmpty()).collect(Collectors.toList()), 
					null,
					"Increments", 
					"assignments-increments", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST,					
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));			
			
			assignmentsAction.getChildren().add(endeavorsSection(
					getSemanticElement().getAssignments().stream().filter(e -> e instanceof Issue).collect(Collectors.toList()), 
					null,
					"Issues", 
					"assignments-issues", 
					getFeatureDiagnostic(feature),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ENDEAVOR__START,
					EngineeringPackage.Literals.ENDEAVOR__END,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
					EngineeringPackage.Literals.ISSUE__REMAINING_COST,
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));			
			
			assignmentsAction.setSectionStyle(assignmentsAction.getSectionChildren().size() > 1 ? SectionStyle.CARD_PILL : SectionStyle.DEFAULT);
			return assignmentsAction.getSectionChildren().isEmpty() ? Collections.emptyList() : Collections.singleton(assignmentsAction);
		}
		
		// Single action for capacity and designations on which list by endeavor capacity and designations.
		
		if (feature == EngineeringPackage.Literals.ENGINEER__CAPACITY) {
			// TODO
			return Collections.emptyList();
		}
		
		if (feature == EngineeringPackage.Literals.ENGINEER__DESIGNATIONS) {
			// TODO
			return Collections.emptyList();
		}

		return super.featureActions(feature);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS) {
			return role == FeatureRole.FEATURE_ACTIONS;
		}
		if (feature == EngineeringPackage.Literals.ENGINEER__INCREMENTS) {
			return role == FeatureRole.ELEMENT_ACTIONS || role == FeatureRole.CONTENT;
		}
		if (feature == EngineeringPackage.Literals.ENGINEER__CAPACITY) {
			return false;
		}
		if (feature == EngineeringPackage.Literals.ENGINEER__DESIGNATIONS) {
			return false;
		}
		if (feature == EngineeringPackage.Literals.ENGINEER__PERSONAS) {
			return role == FeatureRole.FEATURE_ACTIONS || role == FeatureRole.ELEMENT_ACTIONS;
		}
		if (feature == EngineeringPackage.Literals.ENGINEER__REPRESENTS) {
			return role == FeatureRole.PROPERTY;
		}
		
		return super.isFeatureInRole(feature, role);
	}
		
	@Override
	protected Object featureContent(EStructuralFeature feature, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (feature == EngineeringPackage.Literals.ENGINEER__INCREMENTS) {
			Collection<Issue> scheduledIssues = new ArrayList<>();
			getSemanticElement().getIncrements().forEach(i -> collectAllIncrementIssues(i, scheduledIssues));
			if (scheduledIssues.isEmpty()) {
				return null;
			}
			HTMLFactory htmlFactory = viewGenerator.getHTMLFactory();
			int headerLevel = viewGenerator.get(SectionStyle.HEADER_LEVEL, Integer.class, 3);
			Fragment ret = htmlFactory.fragment(htmlFactory.tag("h" + headerLevel, Util.nameToLabel(feature.getName())));
			Function<Increment, Collection<Issue>> issueSource = in -> scheduledIssues.stream().filter(is -> is.getIncrement() == in).collect(Collectors.toList());
			ret.content(IncrementViewAction.incrementsTable(getSemanticElement().getIncrements(), issueSource, true, viewGenerator, progressMonitor));
			return ret.toString();
		}
		return super.featureContent(feature, viewGenerator, progressMonitor);
	}
	
	private void collectAllIncrementIssues(Increment increment, Collection<Issue> collector) {
		collector.addAll(increment.getIssues());
		increment.getChildren().forEach(c -> collectAllIncrementIssues(c, collector));
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> ret = super.collectChildren();
		ret.addAll(capacityAction());		
		return ret;
	}
	
	private static Date getEnd(Endeavor endeavor) {
		Date ret = endeavor.getEnd();
		if (ret == null) {
			if (endeavor instanceof Feature) {
				for (Release release: ((Feature) endeavor).getReleases()) {
					ret = getEnd(release);
					if (ret != null) {
						return ret;
					}
				}
			}
			
			if (endeavor instanceof Issue) {			
				Issue issue = (Issue) endeavor;
				Increment increment = issue.getIncrement();
				if (increment != null) {
					ret = increment.getEnd();
					if (ret != null) {
						return ret;
					}
				}
				for (Release release: issue.getReleases()) {
					ret = getEnd(release);
					if (ret != null) {
						return ret;
					}
				}
			}
	
			if (endeavor instanceof Release) {
				Increment increment = ((Release) endeavor).getIncrement();
				if (increment != null) {
					ret = increment.getEnd();
					if (ret != null) {
						return ret;
					}
				}
			}
		}
		return ret;
	}
	
	@Override
	public boolean isInRole(String role) {
		return super.isInRole(role);
	}
	
	protected Collection<Action> capacityAction() {
		// Capacity action with endeavors grouping and capacity, designations, and issues for each endeavor.
		
		Map<Endeavor, List<Capacity>> capacityGroupedByEndeavor = EmfUtil.groupBy(getSemanticElement().getCapacity(), EngineeringPackage.Literals.CAPACITY__ENDEAVOR);
		Map<Endeavor, List<Allocation>> designationsGroupedByEndeavor = EmfUtil.groupBy(getSemanticElement().getDesignations(), EngineeringPackage.Literals.CAPACITY__ENDEAVOR);
		Set<Endeavor> endeavors = new HashSet<>(capacityGroupedByEndeavor.keySet());
		endeavors.addAll(designationsGroupedByEndeavor.keySet());
		if (endeavors.isEmpty()) {
			return Collections.emptyList();
		}

		List<Endeavor> sortedEndeavors = new ArrayList<>(endeavors);
		sortedEndeavors.sort((a,b) -> {
			if (a == b) {
				return 0;
			}
			if (a == null) {
				return -1;
			}
			if (b == null) {
				return 1;
			}
			
			Date aEnd = getEnd(a);
			Date bEnd = getEnd(b);
			if (aEnd == null && bEnd != null) {
				return 1;
			}
			if (bEnd == null && aEnd != null) {
				return -1;
			}
			
			if (aEnd != null && bEnd != null) {
				return aEnd.compareTo(bEnd);
			}
						
			if (!(a instanceof NamedElement) || Util.isBlank(((NamedElement) a).getName())) {
				return -1;
			}
			
			if (!(b instanceof NamedElement) || Util.isBlank(((NamedElement) b).getName())) {
				return 1;
			}
			
			return ((NamedElement) a).getName().compareTo(((NamedElement) b).getName());
		});
		
		List<Issue> assignments = getSemanticElement().getAssignments().stream().filter(e -> e instanceof Issue).map(e -> (Issue) e).collect(Collectors.toList());
		
		ViewActionImpl<Engineer> capacitySection = new ViewActionImpl<Engineer>(getSemanticElement()) {
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Fragment ret = viewGenerator.getHTMLFactory().fragment();				
				BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
				for (Endeavor endeavor: sortedEndeavors) {
					ret.content(TagName.h4.create(endeavor == null ? "Undefined" : viewGenerator.link(ViewAction.adaptToViewActionNonNull(endeavor))));
					List<Capacity> ec = capacityGroupedByEndeavor.get(endeavor);
					if (ec != null && !ec.isEmpty()) {
						ret.content(TagName.h5.create("Capacity"));
						Table table = bootstrapFactory.table().bordered().striped();
						table.header().headerRow("Effort", "Rate", "Funds").color(Color.INFO);
						for (Capacity ece: ec) {
							table.body().row(
									ece.getEffort(),
									ece.getRate(),
									ece.getFunds()
							);
						}					
						ret.content(table);
					}
					List<Allocation> ea = designationsGroupedByEndeavor.get(endeavor);
					if (ea != null && !ea.isEmpty()) {
						ret.content(TagName.h5.create("Designations"));
						Table table = bootstrapFactory.table().bordered().striped();
						table.header().headerRow("Target", "Category", "Effort", "Rate", "Funds").color(Color.INFO);
						for (Allocation eae: ea) {
							Tag categoriesTag;
							EList<IssueCategory> category = eae.getCategory();
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
									viewGenerator.link(ViewAction.adaptToViewActionNonNull(eae.eContainer())),
									categoriesTag,
									eae.getEffort(),
									eae.getRate(),
									eae.getFunds()
							);
						}
						ret.content(table);
					}
					
					List<Issue> ei = assignments.stream().filter(i -> {
						if (endeavor instanceof Increment) {
							return i.getIncrement() == endeavor;
						}
						if (endeavor instanceof Feature) {
							return i.getContributesTo().contains(endeavor);
						}
						if (endeavor instanceof Release) {
							if (i.getReleases().contains(endeavor)) {
								return true;
							}
							for (Feature feature: ((Release) endeavor).getFeatures()) {
								if (i.getContributesTo().contains(feature)) {
									return true;
								}
							}
						}
						return false;
					}).collect(Collectors.toList());
					if (ei != null && !ei.isEmpty()) {
						ret.content(endeavorsTable(
								ei, 
								null, 
								viewGenerator, 
								progressMonitor, 
								EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
								EngineeringPackage.Literals.ENDEAVOR__START,
								EngineeringPackage.Literals.ENDEAVOR__END,
								EngineeringPackage.Literals.ISSUE__TARGET,
								EngineeringPackage.Literals.ISSUE__STATUS,
								EngineeringPackage.Literals.ISSUE__CATEGORY,				
								EngineeringPackage.Literals.ISSUE__EFFORT,
								EngineeringPackage.Literals.ISSUE__COST,
								EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
								EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
								EngineeringPackage.Literals.ISSUE__REMAINING_COST,
								EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
					}
				}
				
				return ret;
			}				
			
		};
		capacitySection.getRoles().add(Action.Role.SECTION);
		capacitySection.setText("Capacity");
		return Collections.singleton(capacitySection);		
	}	
	
}
