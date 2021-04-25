package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
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
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}
		
	@Override
	public List<Action> getChildren() {
		List<Action> children = super.getChildren();
		
		Action assignmentSection = issuesSection(
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
		
		if (assignmentSection != null) {
			children.add(assignmentSection);
		}
		
		return children;
	}	
	
	@Override
	protected boolean isContentReference(EReference ref) {
		if (ref == EngineeringPackage.Literals.ENGINEER__ASSIGNMENTS) {
			return false;
		}
		
		return super.isContentReference(ref);
	}
	
	@Override
	protected Object contentReference(EReference ref, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (ref == EngineeringPackage.Literals.ENGINEER__INCREMENTS) {
			HTMLFactory htmlFactory = viewGenerator.getHTMLFactory();
			int headerLevel = viewGenerator.get(SectionStyle.HEADER_LEVEL, Integer.class, 3);
			Fragment ret = htmlFactory.fragment(htmlFactory.tag("h" + headerLevel, Util.nameToLabel(ref.getName())));
			Collection<Issue> scheduledIssues = new ArrayList<>();
			target.getIncrements().forEach(i -> collectAllIncrementIssues(i, scheduledIssues));
			Set<Object> statuses = EmfUtil.groupBy(scheduledIssues, EngineeringPackage.Literals.ISSUE__STATUS).keySet();
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
				sHeader.toHTMLElement().colspan(3);
				sHeader.text().alignment(Alignment.CENTER);
			}
			Row subHeader = table.header().headerRow().color(Color.INFO);
			for (@SuppressWarnings("unused") Object status: statuses) {
				subHeader.header("Issues");
				subHeader.header("Effort");
				subHeader.header("Cost");
			}
			
			for (Increment increment: target.getIncrements()) {
				incrementRow(increment, 0, statuses, table, viewGenerator, progressMonitor);
			}
			
			ret.content(table);
			return ret.toString();
		}
		// TODO Auto-generated method stub
		return super.contentReference(ref, viewGenerator, progressMonitor);
	}
	
	private void collectAllIncrementIssues(Increment increment, Collection<Issue> collector) {
		collector.addAll(increment.getIssues());
		increment.getChildren().forEach(c -> collectAllIncrementIssues(c, collector));
	}
	
	private void incrementRow(Increment increment, int depth, Set<Object> statuses, Table table, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {		
		Row row = table.row();
		ViewAction incrementAction = ViewAction.adaptToViewActionNonNull(increment);
		row.cell(viewGenerator.link(incrementAction).style().padding().left(depth + "em"));
		Map<Object, List<Issue>> groupedIssues = EmfUtil.groupBy(increment.getIssues(), EngineeringPackage.Literals.ISSUE__STATUS);		
		for (Object status: statuses) {
			List<Issue> statusIssues = groupedIssues.get(status);
			if (statusIssues == null || statusIssues.isEmpty()) {
				row.cell();
				row.cell();
				row.cell();
			} else {
				row.cell(statusIssues.size()).text().alignment(Alignment.RIGHT);
				double totalEffort = 0;
				double totalCost = 0;
				for (Issue si: statusIssues) {
					totalEffort += si.getEffort();
					totalCost += si.getCost();
				}
				row.cell(totalEffort).text().alignment(Alignment.RIGHT);
				row.cell(totalCost).text().alignment(Alignment.RIGHT);
			}
		}
		
		for (Increment c: increment.getChildren()) {
			incrementRow(c, depth + 1, statuses, table, viewGenerator, progressMonitor);
		}
	}

}
