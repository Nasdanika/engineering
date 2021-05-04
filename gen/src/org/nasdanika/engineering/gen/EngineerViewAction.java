package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.RowContainer.Row.Cell;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.bootstrap.Text.Alignment;
import org.nasdanika.html.emf.ViewAction;

public class EngineerViewAction<T extends Engineer> extends PersonaViewAction<T> {
		
	public EngineerViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	@Override
	protected Action featureAction(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS) {
			return issuesSection(
					target.getAssignments(), 
					"Assignments", 
					"assignments", 
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__CATEGORY,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ISSUE__BENEFIT);
		}

		return super.featureAction(feature);
	}
	
	@Override
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS) {
			return role == FeatureRole.FEATURE_ACTION;
		}
		if (feature == EngineeringPackage.Literals.ENGINEER__INCREMENTS) {
			return role == FeatureRole.ELEMENT_ACTIONS || role == FeatureRole.CONTENT;
		}
		
		return super.isFeatureInRole(feature, role);
	}
		
	@Override
	protected Object featureContent(EStructuralFeature feature, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (feature == EngineeringPackage.Literals.ENGINEER__INCREMENTS) {
			HTMLFactory htmlFactory = viewGenerator.getHTMLFactory();
			int headerLevel = viewGenerator.get(SectionStyle.HEADER_LEVEL, Integer.class, 3);
			Fragment ret = htmlFactory.fragment(htmlFactory.tag("h" + headerLevel, Util.nameToLabel(feature.getName())));
			Collection<Issue> scheduledIssues = new ArrayList<>();
			target.getIncrements().forEach(i -> collectAllIncrementIssues(i, scheduledIssues));
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
			header.color(Color.INFO);
			for (Object status: statuses) {
				Cell sHeader;
				if (status == null) {
					sHeader = header.header("Blank");
				} else {
					ViewAction statusAction = ViewAction.adaptToViewActionNonNull((EObject) status);
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
			
			for (Increment increment: target.getIncrements()) {
				incrementRow(increment, 0, statuses, table, viewGenerator, progressMonitor);
			}
			
			ret.content(table);
			return ret.toString();
		}
		// TODO Auto-generated method stub
		return super.featureContent(feature, viewGenerator, progressMonitor);
	}
	
	private void collectAllIncrementIssues(Increment increment, Collection<Issue> collector) {
		collector.addAll(increment.getIssues());
		increment.getChildren().forEach(c -> collectAllIncrementIssues(c, collector));
	}
	
	private void incrementRow(Increment increment, int depth, Collection<IssueStatus> statuses, Table table, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {		
		Row row = table.row();
		ViewAction incrementAction = ViewAction.adaptToViewActionNonNull(increment);
		row.cell(viewGenerator.link(incrementAction).style().padding().left(depth + "em"));
		Map<IssueStatus, List<Issue>> groupedIssues = EmfUtil.groupBy(increment.getIssues(), EngineeringPackage.Literals.ISSUE__STATUS);		
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
		
		for (Increment c: increment.getChildren()) {
			incrementRow(c, depth + 1, statuses, table, viewGenerator, progressMonitor);
		}
	}

}
