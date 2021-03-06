package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.Objective;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.RowContainer;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.RowContainer.Row.Cell;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.bootstrap.Text.Alignment;
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
	protected Object doGenerate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = (Fragment) super.doGenerate(viewGenerator, progressMonitor);
		ret.content(incrementsTable(getSemanticElement().getChildren(), increment -> increment.getAllIssues(), true, viewGenerator, progressMonitor));
		return ret;
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> children = super.collectChildren();
		
		EList<Issue> issues = getSemanticElement().getIssues();
		if (!issues.isEmpty()) {
			ActionImpl issuesSection = new ActionImpl() {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) { 
					Fragment ret = viewGenerator.getHTMLFactory().fragment();
					
					ret.content(issueStatusSummaryTable(issues, viewGenerator, progressMonitor));
					
					ret.content(endeavorsTable(
							issues, 
							null,
							viewGenerator, 
							progressMonitor, 
							EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
							EngineeringPackage.Literals.PERIOD__START,
							EngineeringPackage.Literals.PERIOD__END,
							EngineeringPackage.Literals.ISSUE__STATUS,
							EngineeringPackage.Literals.ISSUE__PRIORITY,
							EngineeringPackage.Literals.ISSUE__SEVERITY,
							EngineeringPackage.Literals.ISSUE__TARGET,
							EngineeringPackage.Literals.ISSUE__CATEGORIES,				
							EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE,				
							EngineeringPackage.Literals.ISSUE__EFFORT,
							EngineeringPackage.Literals.ISSUE__COST,
							EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
							EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
							EngineeringPackage.Literals.ISSUE__REMAINING_COST,
							EngineeringPackage.Literals.ENDEAVOR__COMPLETION));
					
					return ret;
				};
				
				@Override
				public List<Action> getChildren() {
					return adaptMemberElementsToViewActionsNonNull(EngineeringPackage.Literals.INCREMENT__ISSUES, issues);
				}
			};
			
			issuesSection.getRoles().add(Action.Role.SECTION); 
			issuesSection.setText("Issues"); 			
			issuesSection.setActivator(new PathNavigationActionActivator(issuesSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#issues", getMarker()));
			children.add(issuesSection);			
		}
		
		return children;
	}

	@Override
	protected Object memberValue(ETypedElement member, Object value, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (member == EngineeringPackage.Literals.ENDEAVOR__COMPLETION) {
			double completion = getSemanticElement().getCompletion();
			if (completion != Double.NaN && completion > 0.001) {
				return viewGenerator.getBootstrapFactory().progressBar((int) (100 * completion));
			}			
		}
		return super.memberValue(member, value, viewGenerator, progressMonitor);
	}
	
	public static <E extends Endeavor> Table incrementsTable(
			Collection<Increment> increments, 
			java.util.function.Function<Increment, Collection<E>> endeavorSource, 
			boolean showEmptyIncrements, 
			ViewGenerator viewGenerator, 
			ProgressMonitor progressMonitor) {
		
		if (increments.isEmpty()) {
			return null;
		}
		Collection<Issue> scheduledIssues = new ArrayList<>();
		increments.forEach(i -> collectAllIncrementIssues(i, endeavorSource, scheduledIssues));
		List<IssueStatus> statuses = new ArrayList<>(EmfUtil.<IssueStatus, Issue>groupBy(scheduledIssues, EngineeringPackage.Literals.ISSUE__STATUS).keySet());
		statuses.sort((as,bs) -> {
			if (as == bs) {
				return 0;
			}
			if (as == null) {
				return -1;
			}
			if (bs == null) {
				return 1;
			}
			int asi = ((List<?>) as.eContainer().eGet(as.eContainmentFeature())).indexOf(as);
			int bsi = ((List<?>) as.eContainer().eGet(as.eContainmentFeature())).indexOf(bs);
			if (asi != bsi) {
				return asi - bsi;
			}
			return as.getName().compareTo(bs.getName());
		});
		
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table table = bootstrapFactory.table().bordered().striped();
		Row header = table.header().headerRow();
		header.header("Increment").toHTMLElement().rowspan(2);
		header.header("Completion").toHTMLElement().rowspan(2);
		header.color(Color.INFO);
		for (Object status: statuses) {
			Cell sHeader;
			if (status == null) {
				sHeader = header.header("Blank");
			} else {
				ViewAction<?> statusAction = ViewAction.adaptToViewActionNonNull((EObject) status);
				sHeader = header.header(viewGenerator.link(statusAction));
			}
			sHeader.toHTMLElement().colspan(4);
			sHeader.text().alignment(Alignment.CENTER);
		}
		Row subHeader = table.header().headerRow().color(Color.INFO);
		for (@SuppressWarnings("unused") Object status: statuses) {
			subHeader.header("Issues");
			subHeader.header("Effort");
			subHeader.header("Cost");
			subHeader.header("Benefit");
		}
		
		for (Increment increment: increments) {
			incrementRow(increment, 0, statuses, table, endeavorSource, showEmptyIncrements, viewGenerator, progressMonitor);
		}
		
		return table;
	}
	
	private static <E extends Endeavor> void collectAllIncrementIssues(
			Increment increment, 
			java.util.function.Function<Increment, Collection<E>> endeavorSource,
			Collection<Issue> collector) {
		for (Endeavor endeavor: endeavorSource.apply(increment)) {
			collector.addAll(endeavor.getAllIssues());
		}
		increment.getChildren().forEach(c -> collectAllIncrementIssues(c, endeavorSource, collector));
	}
	
	private static <E extends Endeavor> void incrementRow(
			Increment increment, 
			int depth, 
			Collection<IssueStatus> statuses, 
			Table table,
			java.util.function.Function<Increment, Collection<E>> endeavorSource,
			boolean showEmptyIncrements,
			ViewGenerator viewGenerator, 
			ProgressMonitor progressMonitor) {
		Collection<Issue> allIncrementIssues = new ArrayList<>();
		collectAllIncrementIssues(increment, endeavorSource, allIncrementIssues);
		if (!allIncrementIssues.isEmpty() || showEmptyIncrements) {
			Row row = table.row();
			ViewAction<?> incrementAction = ViewAction.adaptToViewActionNonNull(increment);
			row.cell(viewGenerator.link(incrementAction).style().padding().left(depth + "em"));
			
			// Completion cell
			double remaining = 0;
			double total = 0;
			for (Issue issue: allIncrementIssues) {
				double cc = issue.getCompletion();
				double ctc = issue.getTotalCost();
				total += ctc;
				if (Double.isFinite(cc)) {
					remaining += (1 - cc) * ctc; 
				}
			}
			Cell completionCell = row.cell();
			if (total > 0) {
				double completion = Math.max(0, total - remaining) / total;
				if (completion != Double.NaN && completion > 0.001) {
					completionCell.toHTMLElement().content(viewGenerator.getBootstrapFactory().progressBar((int) (100 * completion)));
				}			
			}
			
			Collection<Issue> incrementIssues = new ArrayList<>();
			for (Endeavor endeavor: endeavorSource.apply(increment)) {
				incrementIssues.addAll(endeavor.getAllIssues());
			}			
			Map<IssueStatus, List<Issue>> groupedIssues = EmfUtil.groupBy(incrementIssues, EngineeringPackage.Literals.ISSUE__STATUS);				
			for (IssueStatus status: statuses) {
				List<Issue> statusIssues = groupedIssues.get(status);
				if (statusIssues == null || statusIssues.isEmpty()) {
					row.cell();
					row.cell();
					row.cell();
					row.cell();
				} else {
					row.cell(statusIssues.size()).text().alignment(Alignment.RIGHT);
					double totalEffort = 0;
					double totalCost = 0;
					double totalBenefit = 0;
					for (Issue si: statusIssues) {
						totalEffort += si.getEffort();
						totalCost += si.getCost();
						totalBenefit += si.getBenefit();
					}
					row.cell(totalEffort).text().alignment(Alignment.RIGHT);
					row.cell(totalCost).text().alignment(Alignment.RIGHT);
					row.cell(totalBenefit).text().alignment(Alignment.RIGHT);
				}
			}
		}
		
		for (Increment c: increment.getChildren()) {
			incrementRow(c, depth + 1, statuses, table, endeavorSource, showEmptyIncrements, viewGenerator, progressMonitor);
		}
	}
	
	@Override
	protected Collection<Action> memberActions(ETypedElement member) {
		if (member == EngineeringPackage.Literals.ENDEAVOR__CAPACITY) {
			return EngineeredCapabilityViewAction.endeavorCapacityFeatureActions(getSemanticElement());
		}
		if (member == EngineeringPackage.Literals.INCREMENT__RELEASES) {
			ViewBuilder productHeaderBuilder = new ViewBuilder() {

				@Override
				public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					((RowContainer.Row.Cell) target).toHTMLElement().content("Product");
				}
				
			};
			
			return Collections.singleton(endeavorsAction(
					getSemanticElement().getReleases(), 
					e -> e == EcorePackage.Literals.EOBJECT___ECONTAINER ? productHeaderBuilder : null,
					"Releases", 
					"releases", 
					getFeatureDiagnostic((EStructuralFeature) member),
					role -> isMemberActionInRole(member, role),
					EcorePackage.Literals.EOBJECT___ECONTAINER,					
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.PERIOD__START,
					EngineeringPackage.Literals.PERIOD__END,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ENDEAVOR__TOTAL_COST,					
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION));			
			
		}
		if (member == EngineeringPackage.Literals.ENDEAVOR__OBJECTIVES) {
			if (getSemanticElement().getObjectives().isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateObjectivesTable));			
		}
		if (member == EngineeringPackage.Literals.ENDEAVOR__LINKED_OBJECTIVES) {
			if (getSemanticElement().getLinkedObjectives().isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateLinkedObjectivesTable));			
		}
		if (member == EngineeringPackage.Literals.ENDEAVOR__ALL_OBJECTIVES) {
			if (getSemanticElement().getAllObjectives().isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateAllObjectivesTable));			
		}
		return super.memberActions(member);
	}
	
	protected Object generateObjectivesTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Objective", "Completion").color(Color.INFO);
		for (Objective objective: getSemanticElement().getObjectives()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(objective)),
					progressBar(objective.getCompletion(), viewGenerator));
		}
		return table;
	}				
	
	protected Object generateLinkedObjectivesTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Objective", "Completion").color(Color.INFO);
		for (Objective objective: getSemanticElement().getLinkedObjectives()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(objective)),
					progressBar(objective.getCompletion(), viewGenerator));
		}
		return table;
	}				
	
	protected Object generateAllObjectivesTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Objective", "Completion").color(Color.INFO);
		for (Objective objective: getSemanticElement().getAllObjectives()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(objective)),
					progressBar(objective.getCompletion(), viewGenerator));
		}
		return table;
	}				

}
