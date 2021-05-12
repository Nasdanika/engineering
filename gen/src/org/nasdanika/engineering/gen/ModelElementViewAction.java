package org.nasdanika.engineering.gen;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.text.StringEscapeUtils;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.Context;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.Marker;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.bootstrap.Text.Alignment;
import org.nasdanika.html.emf.HtmlEmfUtil;
import org.nasdanika.html.emf.SimpleEObjectViewAction;
import org.nasdanika.html.emf.ViewAction;

/**
 * Base class for Core ViewAction adapters.
 * @author Pavel
 *
 * @param <T>
 */
public class ModelElementViewAction<T extends ModelElement> extends SimpleEObjectViewAction<T> {
	
	private String id;
	protected EngineeringViewActionAdapterFactory factory;
		
	protected ModelElementViewAction(T target, EngineeringViewActionAdapterFactory factory) {
		super(target);		
		this.factory = factory;
		try {
			id = Hex.encodeHexString(MessageDigest.getInstance("SHA-256").digest(target.getUri().getBytes(StandardCharsets.UTF_8)));
		} catch (NoSuchAlgorithmException e) {
			throw new NasdanikaException(e);
		}
	}
	
	@Override
	protected String resolveResourcePath(Resource resource) {
		return factory.resolveResourcePath(resource);
	}
	
	@Override
	protected String getTargetPath() {
		return getSemanticElement().getPath();
	}
	
	@Override
	protected String getTargetDescription() {
		StringBuilder ret = new StringBuilder();
		String description = getSemanticElement().getDescription();
		Context context = getContext();
		if (!Util.isBlank(description)) {
			ret.append(context.interpolateToString(description));		
		}
		String markdownDescription = getSemanticElement().getMarkdownDescription();
		if (!Util.isBlank(markdownDescription)) {
			String markdown = context.interpolateToString(markdownDescription);
			MarkdownHelper markdownHelper = context.computingContext().get(MarkdownHelper.class, MarkdownHelper.INSTANCE);
			ret.append(markdownHelper.markdownToHtml(markdown));
		}
		return ret.toString();
	}
				
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.MODEL_ELEMENT__DESCRIPTION) {
			return false;
		}
		if (feature == EngineeringPackage.Literals.MODEL_ELEMENT__MARKDOWN_DESCRIPTION) {
			return false;
		}
		if (feature == EngineeringPackage.Literals.MODEL_ELEMENT__PATH) {
			return false;
		}
		if (feature == EngineeringPackage.Literals.NAMED_ELEMENT__NAME) {
			return false;
		}
		if (feature == EngineeringPackage.Literals.MODEL_ELEMENT__ACTIONS) {
			return false;
		}

		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> children = super.collectChildren();
		children.addAll(HtmlEmfUtil.adaptToActionNonNull(getSemanticElement().getActions()));
		return children;
	}

	@Override
	public Action getParent() {
		EObject eContainer = getSemanticElement().eContainer();
		if (eContainer == null) {
			return factory.getParent();
		}
		return super.getParent();
	}

	@Override
	public Object getId() {
		return id;
	}
	
	protected static final Comparator<Increment> INCREMENT_COMPARATOR = (a,b) -> {
		if (a == b) {
			return 0;
		}
		
		if (a == null) {
			return 1;
		}
		
		if (b == null) {
			return -1;
		}
		
		if (EcoreUtil.isAncestor(a, b)) {
			return -1;
		}
		
		if (EcoreUtil.isAncestor(b, a)) {
			return 1;
		}
		
		Date aStart = a.getStart();
		Date bStart = b.getStart();
		
		if (Objects.equals(aStart, bStart)) {
			return containmentPath(a).compareTo(containmentPath(b));
		}

		if (aStart == null) {
			return 1;
		}
		
		if (bStart == null) {
			return -1;
		}
		
		return aStart.before(bStart) ? -1 : 1;
	};
	
	protected static String containmentPath(EObject obj) {
		if (obj == null) {
			return null;
		}
		EObject eContainer = obj.eContainer();
		String cPath = containmentPath(eContainer);
		if (cPath == null) {
			return "";
		}
		EReference eContainmentFeature = obj.eContainmentFeature();
		String ret = cPath + "/" +	eContainmentFeature.getName();
		return eContainmentFeature.isMany() ? ret + (((List<?>) eContainer.eGet(eContainmentFeature)).indexOf(obj)) : ret;
	}
	
	protected static Table issuesTable(
			Collection<Issue> issues,
			ViewGenerator viewGenerator, 
			ProgressMonitor progressMonitor,
			EStructuralFeature... features) {
		
		Function<Issue,ViewBuilder> rowBuilderProvider = issue -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				if (issue.isAvailable()) {
					((org.nasdanika.html.bootstrap.RowContainer.Row) target).color(Color.SUCCESS);
				}
				if (!issue.isWorkable()) {
					((org.nasdanika.html.bootstrap.RowContainer.Row) target).color(Color.PRIMARY); // TODO - configurable.					
				}
			}
			
		};
		BiFunction<Issue, ETypedElement, ViewBuilder> cellBuilderProvider = (issue, dataSource) -> {
			if (dataSource == EngineeringPackage.Literals.NAMED_ELEMENT__NAME) {
				return (target, vg, pm) -> {
					((org.nasdanika.html.bootstrap.RowContainer.Row.Cell) target).toHTMLElement().content(vg.link(ViewAction.adaptToViewActionNonNull(issue)));
				};
			}
			return null;
		};							
		
		return HtmlEmfUtil.table(
				issues, 
				rowBuilderProvider, 
				cellBuilderProvider, 
				viewGenerator, 
				progressMonitor, 
				features);		
	}
		
	/**
	 * If issues collection is not empty creates a section action with issues grouped into increments with 
	 * specified features in the issue table. 
	 * @param issues
	 * @param features
	 * @return
	 */
	public Action issuesSection(
			Collection<Issue> issues, 
			String text, 
			String id, 
			Collection<Diagnostic> diagnostic,
			EStructuralFeature... features) {
		
		return issuesSection(issues, text, id, getMarker(), getActivator(), diagnostic, features);
	}
	
	/**
	 * If issues collection is not empty creates a section action with issues grouped into increments with 
	 * specified features in the issue table. 
	 * @param issues
	 * @param features
	 * @return
	 */
	public static Action issuesSection(
			Collection<Issue> issues, 
			String text, 
			String id, 
			Marker marker, 
			ActionActivator activator,
			Collection<Diagnostic> diagnostic,
			EStructuralFeature... features) {
		
		if (issues.isEmpty()) {
			return null;
		}
		
		Map<IncrementValueObject, List<Issue>> increments = Util.groupBy(issues, IncrementValueObject::new);
		boolean backlogOnly = increments.size() == 1 && increments.keySet().iterator().next() == null;
		
		ActionImpl issuesSection = new ActionImpl() {
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Fragment ret = viewGenerator.getHTMLFactory().fragment();
				BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
				if (diagnostic != null) {
					for (Diagnostic diagnostic: diagnostic) {
						ret.content(bootstrapFactory.alert(HtmlEmfUtil.getSeverityColor(diagnostic.getSeverity()), StringEscapeUtils.escapeHtml4(diagnostic.getMessage())));
					}
				}
				
				ret.content(issueStatusSummaryTable(issues, viewGenerator, progressMonitor));
				
				if (backlogOnly) {
					ret.content(issuesTable(
							issues, 
							viewGenerator, 
							progressMonitor, 
							features));
				}
				return ret;
			};
			
			@Override
			public List<Action> getChildren() {
				return backlogOnly ? Collections.emptyList() : increments.keySet().stream().sorted().map(i -> incrementValueObjectAction(i, increments.get(i))).collect(Collectors.toList());
			}
			
			private Action incrementValueObjectAction(IncrementValueObject incrementValueObject, List<Issue> incrementIssues) {
				ActionImpl incrementSection = new ActionImpl() {
					
					@Override
					public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
						Fragment ret = viewGenerator.getHTMLFactory().fragment();
						
						ret.content(issueStatusSummaryTable(incrementIssues, viewGenerator, progressMonitor));
						
						ret.content(issuesTable(
								incrementIssues, 
								viewGenerator, 
								progressMonitor, 
								features));
						
						return ret;
					}
					
				};
				
				incrementSection.getRoles().add(Action.Role.SECTION); 
				incrementSection.setText(Util.isBlank(incrementValueObject.getName()) ? "Backlog" : incrementValueObject.getName()); 			
				incrementSection.setActivator(new PathNavigationActionActivator(incrementSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#" + id + "-" + incrementValueObject.hashCode(), marker));
				return incrementSection; 					
			}
		};
		
		issuesSection.getRoles().add(Action.Role.SECTION); 
		issuesSection.setSectionStyle(SectionStyle.DEFAULT);
		issuesSection.setText(text); 			
		issuesSection.setActivator(new PathNavigationActionActivator(issuesSection, ((NavigationActionActivator) activator).getUrl(null), "#" + id, marker));

		return issuesSection;
	}
	
	public static Object issueStatusSummaryTable(Collection<Issue> issues, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (issues.isEmpty()) {
			return null;
		}
		Map<Object, List<Issue>> groupedIssues = EmfUtil.groupBy(issues, EngineeringPackage.Literals.ISSUE__STATUS);
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table table = bootstrapFactory.table().bordered().striped();
		table.header().headerRow("Status", "Issues", "Effort", "Cost", "Benefit").color(Color.INFO);
		List<Entry<Object, List<Issue>>> entryList = new ArrayList<>(groupedIssues.entrySet());
		entryList.sort((a,b) -> {
			IssueStatus as = (IssueStatus) a.getKey();
			IssueStatus bs = (IssueStatus) b.getKey();
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
		for (Entry<Object, List<Issue>> se: entryList) {
			Row sRow = table.row();
			if (se.getKey() == null) {
				sRow.cell("Blank");
			} else {
				ViewAction<?> statusAction = ViewAction.adaptToViewActionNonNull((EObject) se.getKey());
				sRow.cell(viewGenerator.link(statusAction));
			}
			List<Issue> statusIssues = se.getValue();
			if (statusIssues == null || statusIssues.isEmpty()) {
				sRow.cell();
				sRow.cell();
				sRow.cell();
				sRow.cell();
			} else {
				sRow.cell(statusIssues.size()).text().alignment(Alignment.RIGHT);
				double totalEffort = 0;
				double totalCost = 0;
				double totalBenefit = 0;
				for (Issue si: statusIssues) {
					totalEffort += si.getEffort();
					totalCost += si.getCost();
					totalBenefit += si.getBenefit();
				}
				sRow.cell(totalEffort).text().alignment(Alignment.RIGHT);
				sRow.cell(totalCost).text().alignment(Alignment.RIGHT);
				sRow.cell(totalBenefit).text().alignment(Alignment.RIGHT);
			}
			
		}
		return table;
	}
	
	// TODO - totals table, % completed - shared method for engineers, increments, releases, ... - in ModelElementView...
	// Generic table - takes a list of EObjects, BiConsumer of element and table row, BiFunction of element and feature to extract value, and var-arg of str features 

	@Override
	public Collection<Diagnostic> getDiagnostic() {		
		Collection<Diagnostic> ret = new ArrayList<>();
		Map<EObject, Diagnostic> diagnosticMap = factory.getDiagnosticMap();
		if (diagnosticMap != null) {
			for (Diagnostic diagnostic: diagnosticMap.values()) {
				collectDiagnostic(getSemanticElement(), diagnostic, ret);
			}
		}
		return ret;
	}

	@Override
	public Collection<Diagnostic> getFeatureDiagnostic(EStructuralFeature feature) {
		Collection<Diagnostic> ret = new ArrayList<>();
		Map<EObject, Diagnostic> diagnosticMap = factory.getDiagnosticMap();
		if (diagnosticMap != null) {
			for (Diagnostic diagnostic: diagnosticMap.values()) {
				collectFeatureDiagnostic(getSemanticElement(), feature, diagnostic, ret);
			}
		}
		return ret;
	}
		
	private static void collectDiagnostic(EObject eObject, Diagnostic diagnostic, Collection<Diagnostic> collector) {
		List<?> data = diagnostic.getData();
		if (data.size() == 1 && data.get(0) == eObject && matchSeverity(diagnostic) && diagnostic.getChildren().isEmpty()) {
			collector.add(diagnostic);
		}
		for (Diagnostic child: diagnostic.getChildren()) {
			collectDiagnostic(eObject, child, collector);
		}
	}
	
	private static void collectFeatureDiagnostic(EObject eObject, EStructuralFeature feature, Diagnostic diagnostic, Collection<Diagnostic> collector) {
		List<?> data = diagnostic.getData();
		if (data.size() > 1 && data.get(0) == eObject && data.get(1) == feature && matchSeverity(diagnostic) && diagnostic.getChildren().isEmpty()) {
			collector.add(diagnostic);
		}
		for (Diagnostic child: diagnostic.getChildren()) {
			collectFeatureDiagnostic(eObject, feature, child, collector);
		}
	}

	protected static boolean matchSeverity(Diagnostic diagnostic) {
		return diagnostic.getSeverity() == Diagnostic.ERROR ||diagnostic.getSeverity() == Diagnostic.WARNING;
	}
		
}
