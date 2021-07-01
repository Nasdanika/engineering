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
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.text.StringEscapeUtils;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
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
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.Appearance;
import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueStatus;
import org.nasdanika.engineering.MemberAppearance;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.engineering.NamedElement;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.TableOfContents;
import org.nasdanika.engineering.flow.Start;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.bootstrap.ActionGroup;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Card;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.RowContainer.Row.Cell;
import org.nasdanika.html.bootstrap.Size;
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
public class ModelElementViewActionImpl<T extends ModelElement> extends SimpleEObjectViewAction<T> implements ModelElementViewAction<T> {
	
	private String id;
	protected EngineeringViewActionAdapterFactory factory;
		
	protected ModelElementViewActionImpl(T target, EngineeringViewActionAdapterFactory factory) {
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
	protected Object generateHead(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = (Fragment) super.generateHead(viewGenerator, progressMonitor);
		TableOfContents toc = getSemanticElement().getTableOfContents();
		if (toc != null && !Util.isBlank(toc.getRole())) {
			switch (toc.getRole()) {
			case CONTENT_ROLE:
				ret.content(generateFragmentOfContents(viewGenerator, progressMonitor));
				break;
			case Action.Role.FLOAT_LEFT:
			case Action.Role.FLOAT_RIGHT:
				ret.content(generateTableOfContents(viewGenerator, progressMonitor));
			}
		}
		return ret;
	}
	
	protected Action createTableOfContentsAction() {
		TableOfContents toc = getSemanticElement().getTableOfContents();
		if (toc != null && (Action.Role.CONTENT_LEFT.equals(toc.getRole()) || Action.Role.CONTENT_RIGHT.equals(toc.getRole()))) {
			ActionImpl tocAction = new ModelElementFeatureViewAction<T, EStructuralFeature, ModelElementViewAction<T>>(getSemanticElement(), EngineeringPackage.Literals.MODEL_ELEMENT__TABLE_OF_CONTENTS) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					return ModelElementViewActionImpl.this.generateCardOfContents(viewGenerator, progressMonitor);
				}
				
				@Override
				public boolean isEmpty() {
					return false;
				}
				
				@Override
				public boolean isInRole(String role) {
					return !Util.isBlank(toc.getRole()) && toc.getRole().equals(role);
				}
				
			};
			
			tocAction.setActivator(ActionActivator.INLINE_ACTIVATOR);
			return tocAction;
		}
		return null;
	}

	@Override
	protected List<Action> collectChildren() {
		Action tocAction = createTableOfContentsAction();
		if (tocAction == null) {
			return super.collectChildren();
		}
		ArrayList<Action> children = new ArrayList<>();
		children.add(tocAction);
		children.addAll(super.collectChildren());
		return children;
	}
	
	@Override
	protected String getTargetDescription() {
		return getModelElementDescription(getSemanticElement());
	}
	
	protected Card generateCardOfContents(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		TableOfContents toc = getSemanticElement().getTableOfContents();
		if (toc == null) {
			return null;
		}
		
		List<Action> sectionChildren = getSectionChildren();
		if (sectionChildren.isEmpty()) {
			return null;
		}
		Card ret = viewGenerator.getBootstrapFactory().card();
		ret.margin().top(Breakpoint.DEFAULT, Size.S1);
		if (!Util.isBlank(toc.getHeader())) {
			ret.getHeader().toHTMLElement().content(toc.getHeader());
		}
		
		if (toc.getDepth() == 1) {
			ActionGroup actionGroup = viewGenerator.getBootstrapFactory().actionGroup(true);
			for (Action sc: sectionChildren) {
				viewGenerator.add(actionGroup, sc, false);
			}
			ret.toHTMLElement().content(actionGroup);
		} else {
			ret.getBody().toHTMLElement().content(sectionsList(this, viewGenerator, toc.getDepth()));
		}
		return ret;
	}
	
	/**
	 * Table with a header, if present, 
	 * @param viewGenerator
	 * @param progressMonitor
	 * @return
	 */
	protected Table generateTableOfContents(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		TableOfContents toc = getSemanticElement().getTableOfContents();
		if (toc == null) {
			return null;
		}
		
		List<Action> sectionChildren = getSectionChildren();
		if (sectionChildren.isEmpty()) {
			return null;
		}
		
		BootstrapFactory bootstrapFactory = viewGenerator.get(BootstrapFactory.class, BootstrapFactory.INSTANCE);
		Table ret = bootstrapFactory.table(); 
		ret.toHTMLElement().style().width( "auto").style("border-radius", "3px");
		if (Action.Role.FLOAT_LEFT.equals(toc.getRole())) {
			ret.margin().right(Breakpoint.DEFAULT, Size.S1);
			ret._float().left();
		} else if (Action.Role.FLOAT_RIGHT.equals(toc.getRole())) {
			ret.margin().left(Breakpoint.DEFAULT, Size.S1);
			ret._float().right();
		}

		ret.margin().top(Breakpoint.DEFAULT, Size.S1);
		ret.margin().bottom(Breakpoint.DEFAULT, Size.S1);
		
		ret.padding().all(Breakpoint.DEFAULT, Size.S1);
		
		ret.border(Color.SECONDARY);
		if (!Util.isBlank(toc.getHeader())) {
			ret.header().headerRow().header(toc.getHeader()).color(Color.SECONDARY); 			
		}
		
		if (toc.getDepth() == 1) {
			for (Action sc: sectionChildren) {
				ret.body().row(viewGenerator.link(sc));
			}
		} else {
			ret.body().row(sectionsList(this, viewGenerator, toc.getDepth()));
		}
		return ret;
	}
	
	/**
	 * Header and a list of contents.
	 * @param viewGenerator
	 * @param progressMonitor
	 * @return
	 */
	protected Fragment generateFragmentOfContents(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		TableOfContents toc = getSemanticElement().getTableOfContents();
		if (toc == null) {
			return null;
		}
		
		List<Action> sectionChildren = getSectionChildren();
		if (sectionChildren.isEmpty()) {
			return null;
		}
		
		HTMLFactory htmlFactory = viewGenerator.getHTMLFactory();
		Fragment ret = htmlFactory.fragment();
		if (!Util.isBlank(toc.getHeader())) {
			int headerLevel = viewGenerator.get(SectionStyle.HEADER_LEVEL, Integer.class, 3);
			ret.content(htmlFactory.tag("H"+headerLevel, toc.getHeader()));
		}
		
		ret.content(sectionsList(this, viewGenerator, toc.getDepth()));
		return ret;
	}
	
	protected static Tag sectionsList(Action action, ViewGenerator viewGenerator, int depth) {		
		List<Action> sectionChildren = action.getSectionChildren();
		if (sectionChildren.isEmpty()) {
			return null;
		}
		Tag ul = viewGenerator.getHTMLFactory().tag(TagName.ul);
		for (Action sc: sectionChildren) {
			Tag li = viewGenerator.getHTMLFactory().tag(TagName.li);
			ul.content(li);
			li.content(viewGenerator.link(sc));
			if (depth != 1) {
				Tag sl = sectionsList(sc, viewGenerator, depth - 1);
				if (sl != null) {
					li.content(sl);
				}
			}
		}
		return ul;
	}	
	
	/**
	 * Sorts features
	 */
	@Override
	protected List<ETypedElement> getMembers() {
		return super.getMembers().stream().sorted((Comparator<? super ETypedElement>) (a, b) -> memberLabelText(a).compareTo(memberLabelText(b))).collect(Collectors.toList());
	}
	
	/**
	 * To render descriptions for model elements without view actions.
	 * @param modelElement
	 * @return
	 */
	protected String getModelElementDescription(ModelElement modelElement) {
		StringBuilder ret = new StringBuilder();
		String description = modelElement.getDescription();
		Context context = getContext();
		if (!Util.isBlank(description)) {
			ret.append(context.interpolateToString(description));		
		}
		String markdownDescription = modelElement.getMarkdownDescription();
		if (!Util.isBlank(markdownDescription)) {
			String markdown = context.interpolateToString(markdownDescription);
			MarkdownHelper markdownHelper = context.computingContext().get(MarkdownHelper.class, MarkdownHelper.INSTANCE);
			ret.append("<div class=\"markdown-body\">").append(markdownHelper.markdownToHtml(markdown)).append("</div>");
		}
		return ret.toString();
	}
		
	@Override
	protected boolean isMemberInRole(ETypedElement member, MemberRole role) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		String memberKey = Util.camelToKebab(member.getName());
		if (appearance != null) {
			MemberAppearance memberAppearance = (member instanceof EStructuralFeature ? appearance.getFeatures() : appearance.getOperations()).get(memberKey);
			if (memberAppearance != null) {
				if (!memberAppearance.getRoles().isEmpty()) {
					return matchMemberRole(role, memberAppearance);
				}
			}
		}

		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
				MemberAppearance memberAppearance = (member instanceof EStructuralFeature ? classAppearance.getFeatures() : classAppearance.getOperations()).get(memberKey);
				if (memberAppearance != null) {
					if (!memberAppearance.getRoles().isEmpty()) {
						return matchMemberRole(role, memberAppearance);
					}
				}
			}
		}

		return super.isMemberInRole(member, role);
	}
	
	/**
	 * Role for member action
	 * @param role
	 * @return
	 */
	@Override
	protected boolean isMemberActionInRole(ETypedElement member, String role) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		String memberKey = Util.camelToKebab(member.getName());
		if (appearance != null) {
			MemberAppearance memberAppearance = (member instanceof EStructuralFeature ? appearance.getFeatures() : appearance.getOperations()).get(memberKey);
			if (memberAppearance != null) {
				if (!memberAppearance.getRoles().isEmpty()) {
					boolean hasMemberActions = false;
					for (String memberRole: memberAppearance.getRoles()) {
						if (memberRole.equals(SimpleEObjectViewAction.MemberRole.ACTIONS.LITERAL + "/" + role)) {
							return true;
						}
						if (memberRole.startsWith(SimpleEObjectViewAction.MemberRole.ACTIONS.LITERAL + "/")) {
							hasMemberActions = true;
						}
					}
					
					if (hasMemberActions) {
						return false;
					}
				}
			}
		}
		
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: getFactory().getAppearance(eClass)) {
				MemberAppearance memberAppearance = (member instanceof EStructuralFeature ? classAppearance.getFeatures() : classAppearance.getOperations()).get(memberKey);
				if (memberAppearance != null) {
					if (!memberAppearance.getRoles().isEmpty()) {
						boolean hasMemberActions = false;
						for (String operatoinRole: memberAppearance.getRoles()) {
							if (operatoinRole.equals(SimpleEObjectViewAction.MemberRole.ACTIONS.LITERAL + "/" + role)) {
								return true;
							}
							if (operatoinRole.startsWith(SimpleEObjectViewAction.MemberRole.ACTIONS.LITERAL + "/")) {
								hasMemberActions = true;
							}
						}
						
						if (hasMemberActions) {
							return false;
						}
					}
				}
			}
		}
		
		return false;
	}
		
	@Override
	public Label memberCategory(ETypedElement member) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			MemberAppearance memberAppearance = (member instanceof EStructuralFeature ? appearance.getFeatures() : appearance.getOperations()).get(Util.camelToKebab(member.getName()));
			if (memberAppearance != null) {
				Boolean categoryFlag = memberAppearance.getCategory();
				if (categoryFlag != null) {
					return categoryFlag ? super.memberCategory(member) : null;
				}
			}
		}
		
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
				MemberAppearance memberAppearance = (member instanceof EStructuralFeature ? classAppearance.getFeatures() : classAppearance.getOperations()).get(Util.camelToKebab(member.getName()));
				if (memberAppearance !=  null) {
					Boolean categoryFlag = memberAppearance.getCategory();
					if (categoryFlag != null) {
						return categoryFlag ? super.memberCategory(member) : null;
					}
				}
			}
		}

		return super.memberCategory(member);
	}

	protected static boolean matchMemberRole(MemberRole role, MemberAppearance memberAppearance) {
		for (String memberRole: memberAppearance.getRoles()) {
			if (role.LITERAL.equals(memberRole) || memberRole.startsWith(role.LITERAL + "/")) {
				return true;
			}
		}
		return false;
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
	
	protected static <E extends Endeavor> Table endeavorsTable(
			Collection<E> endeavors,
			Function<ETypedElement, ViewBuilder> headerBuilderProvider,			
			ViewGenerator viewGenerator, 
			ProgressMonitor progressMonitor,			
			ETypedElement... dataSources) {
		
		Function<E,ViewBuilder> rowBuilderProvider = endeavor -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				if ((endeavor instanceof Issue && ((Issue) endeavor).isAvailable()) || endeavor.getCompletion() > 0.9999) {
					((org.nasdanika.html.bootstrap.RowContainer.Row) target).color(Color.SUCCESS);
				}
				if (endeavor instanceof Issue && !((Issue) endeavor).isWorkable()) {
					((org.nasdanika.html.bootstrap.RowContainer.Row) target).color(Color.PRIMARY); // TODO - configurable.					
				}
			}
			
		};
		BiFunction<E, ETypedElement, ViewBuilder> cellBuilderProvider = (issue, dataSource) -> {
			if (dataSource == EngineeringPackage.Literals.NAMED_ELEMENT__NAME) {
				return (target, vg, pm) -> {
					((org.nasdanika.html.bootstrap.RowContainer.Row.Cell) target).toHTMLElement().content(vg.link(ViewAction.adaptToViewActionNonNull(issue)));
				};
			}
			if (dataSource == EngineeringPackage.Literals.ENDEAVOR__COMPLETION) {
				return (target, vg, pm) -> {
					double completion = issue.getCompletion();
					if (completion != Double.NaN && completion > 0.001) {
						((org.nasdanika.html.bootstrap.RowContainer.Row.Cell) target).toHTMLElement().content(viewGenerator.getBootstrapFactory().progressBar((int) (100 * completion)));
					}
				};
			}
			return null;
		};							
		
		return HtmlEmfUtil.table(
				endeavors, 
				headerBuilderProvider,
				rowBuilderProvider, 
				cellBuilderProvider, 
				viewGenerator, 
				progressMonitor, 
				dataSources);		
	}
		
	/**
	 * If issues collection is not empty creates an action with issues grouped into increments with 
	 * specified features in the issue table. 
	 * @param endeavors
	 * @param features
	 * @return
	 */
	public <E extends Endeavor> Action endeavorsAction(
			Collection<E> endeavors, 
			Function<ETypedElement, ViewBuilder> headerBuilderProvider,
			String text, 
			String id, 
			Collection<Diagnostic> diagnostic,
			Predicate<String> isInRolePredicate,			
			ETypedElement... dataSources) {
		
		return endeavorsAction(endeavors, headerBuilderProvider, text, id, getMarker(), getActivator(), diagnostic, isInRolePredicate, dataSources);
	}
	
	private static Increment rootIncrement(Increment increment) {
		if (increment != null) {
			EObject ic = increment.eContainer();
			if (ic instanceof Increment) {
				return rootIncrement((Increment) ic);
			}
		}
		return increment;
	}
	
	/**
	 * If issues collection is not empty creates an action with issues grouped into increments with 
	 * specified features in the issue table. 
	 * @param endeavors
	 * @param features
	 * @return
	 */
	public static <E extends Endeavor> Action endeavorsAction(
			Collection<E> endeavors, 
			Function<ETypedElement, ViewBuilder> headerBuilderProvider,			
			String text, 
			String id, 
			Marker marker, 
			ActionActivator activator,
			Collection<Diagnostic> diagnostic,
			Predicate<String> isInRolePredicate,
			ETypedElement... dataSources) {
		
		if (endeavors.isEmpty()) {
			return null;
		}
		
		Map<IncrementValueObject, List<E>> increments = Util.groupBy(endeavors, IncrementValueObject::from);
		boolean backlogOnly = increments.size() == 1 && increments.keySet().iterator().next() == null;
		
		ActionImpl endeavorsAction = new ActionImpl() {
			
			private Increment getIncrement(Endeavor endeavor) {
				if (endeavor instanceof Increment) {
					return (Increment) endeavor;
				}
				if (endeavor instanceof Issue) {
					return ((Issue) endeavor).getIncrement();
				}
				if (endeavor instanceof Release) {
					return ((Release) endeavor).getIncrement();
				}
				return null;
			}			
			
			@Override
			public boolean isEmpty() {
				return false;
			}
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Fragment ret = viewGenerator.getHTMLFactory().fragment();
				BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
				if (diagnostic != null) {
					for (Diagnostic diagnostic: diagnostic) {
						ret.content(bootstrapFactory.alert(HtmlEmfUtil.getSeverityColor(diagnostic.getSeverity()), StringEscapeUtils.escapeHtml4(diagnostic.getMessage())));
					}
				}
				
				List<Increment> rootIncrements = endeavors
						.stream()
						.map(this::getIncrement)
						.filter(Objects::nonNull)
						.map(ModelElementViewActionImpl::rootIncrement)
						.collect(Collectors.toSet())
						.stream()
						.sorted(INCREMENT_COMPARATOR)
						.collect(Collectors.toList());
				
				if (!rootIncrements.isEmpty()) {
					Function<Increment, Collection<Endeavor>> endeavorSource = in -> endeavors.stream().filter(e -> getIncrement(e) == in).collect(Collectors.toList());
					ret.content(IncrementViewAction.incrementsTable(rootIncrements, endeavorSource, false, viewGenerator, progressMonitor));
				}
				
				Collection<Issue> issues = new ArrayList<>();
				endeavors.forEach(e -> issues.addAll(e.getAllIssues()));				
				ret.content(issueStatusSummaryTable(issues, viewGenerator, progressMonitor));
				
				if (backlogOnly) {
					ret.content(endeavorsTable(
							endeavors, 
							headerBuilderProvider,
							viewGenerator, 
							progressMonitor, 
							dataSources));
				}
				return ret;
			};
			
			@Override
			public List<Action> getChildren() {
				return backlogOnly ? Collections.emptyList() : increments.keySet().stream().filter(Objects::nonNull).sorted().map(i -> incrementValueObjectAction(i, increments.get(i))).collect(Collectors.toList());
			}
			
			private Action incrementValueObjectAction(IncrementValueObject incrementValueObject, List<E> incrementEndeavors) {
				ActionImpl incrementSection = new ActionImpl() {
					
					@Override
					public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
						Fragment ret = viewGenerator.getHTMLFactory().fragment();
						
						Collection<Issue> issues = new ArrayList<>();
						incrementEndeavors.forEach(e -> issues.addAll(e.getAllIssues()));				
						ret.content(issueStatusSummaryTable(issues, viewGenerator, progressMonitor));
						
						ret.content(endeavorsTable(
								incrementEndeavors, 
								headerBuilderProvider,
								viewGenerator, 
								progressMonitor, 
								dataSources));
						
						return ret;
					}
					
				};
				
				incrementSection.getRoles().add(Action.Role.SECTION); 
				incrementSection.setText(Util.isBlank(incrementValueObject.getName()) ? "Backlog" : incrementValueObject.getName()); 			
				incrementSection.setActivator(new PathNavigationActionActivator(incrementSection, ((NavigationActionActivator) getActivator()).getUrl(null), "#" + id + "-" + incrementValueObject.hashCode(), marker));
				return incrementSection; 					
			}
			
			@Override
			public boolean isInRole(String role) {				
				return isInRolePredicate == null ? super.isInRole(role) : isInRolePredicate.test(role);
			}
		};
		
		endeavorsAction.getRoles().add(Action.Role.SECTION); 
		endeavorsAction.setSectionStyle(SectionStyle.DEFAULT);
		endeavorsAction.setText(text); 		
		if (endeavorsAction.isInRole(Action.Role.SECTION)) {
			endeavorsAction.setActivator(new PathNavigationActionActivator(endeavorsAction, ((NavigationActionActivator) activator).getUrl(null), "#" + id, marker));
		} else {
			endeavorsAction.setActivator(new PathNavigationActionActivator(endeavorsAction, ((NavigationActionActivator) activator).getUrl(null), id + ".html", marker));			
		}

		return endeavorsAction;
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
	
	protected boolean hasDiagnosticSummary() {
		Map<EObject, Diagnostic> diagnosticMap = factory.getDiagnosticMap();
		if (diagnosticMap == null || diagnosticMap.isEmpty()) {
			return false;
		}
		for (Entry<EObject, Diagnostic> de: diagnosticMap.entrySet()) {
			if (EcoreUtil.isAncestor(getSemanticElement(), de.getKey())) {
				if (matchSeverity(de.getValue())) {
					return true;
				}
			}
		}
		return false;		
	}
	
	protected int getDiagnosticSeverity() {
		Map<EObject, Diagnostic> diagnosticMap = factory.getDiagnosticMap();
		int ret = Diagnostic.OK;
		if (diagnosticMap == null || diagnosticMap.isEmpty()) {
			return ret;
		}
		for (Entry<EObject, Diagnostic> de: diagnosticMap.entrySet()) {
			if (EcoreUtil.isAncestor(getSemanticElement(), de.getKey())) {
				Diagnostic diagnostic = de.getValue();
				if (matchSeverity(diagnostic)) {
					int severity = diagnostic.getSeverity();
					if (severity == Diagnostic.ERROR) {
						return severity;
					}
					if (ret < severity) {
						ret = severity;
					}
				}
			}
		}
		return ret;		
	}	
	
	protected int getDiagnosticCount() {
		Map<EObject, Diagnostic> diagnosticMap = factory.getDiagnosticMap();
		int ret = 0;
		if (diagnosticMap == null || diagnosticMap.isEmpty()) {
			return 0;
		}
		for (Entry<EObject, Diagnostic> de: diagnosticMap.entrySet()) {
			if (EcoreUtil.isAncestor(getSemanticElement(), de.getKey())) {
				ret += getDiagnosticCount(de.getValue());
			}
		}
		return ret;		
	}	
	
	protected int getDiagnosticCount(Diagnostic diagnostic) {
		int ret = 0;
		if (matchSeverity(diagnostic)) {
			if (diagnostic.getChildren().isEmpty()) {
				++ret;
			} else for (Diagnostic child: diagnostic.getChildren()) {
				ret += getDiagnosticCount(child);
			}			
		}
		return ret;
	}
	
	@Override
	protected ActionImpl createDiagnosticSummaryAction() {
		ActionImpl ret = super.createDiagnosticSummaryAction();
		int severity = getDiagnosticSeverity();
		if (severity == Diagnostic.ERROR) {
			ret.setColor(Color.DANGER);
		} else if (severity == Diagnostic.WARNING) {
			ret.setColor(Color.WARNING);
		}
		
		int diagnosticCount = getDiagnosticCount();
		if (diagnosticCount > 0) {
			ret.setNotification(String.valueOf(diagnosticCount));
		}
		
		if (!hasDiagnosticSummary()) {
			ret.setActivator(null);
		}
		
		return ret;
	};
	
	@Override
	protected Object diagnosticSummary(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Map<EObject, Diagnostic> diagnosticMap = factory.getDiagnosticMap();
		if (diagnosticMap == null || diagnosticMap.isEmpty()) {
			return null;
		}
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table table = bootstrapFactory.table().bordered().striped();
		Row header = table.header().headerRow("Status", "Source", "Feature", "Message");
		header.color(Color.INFO);
		boolean hasDiagnostic = false;
		for (Entry<EObject, Diagnostic> de: diagnosticMap.entrySet()) {
			if (EcoreUtil.isAncestor(getSemanticElement(), de.getKey())) {
				if (diagnosticRow(de.getValue(), table, 0, viewGenerator)) {
					hasDiagnostic = true;
				}
			}
		}
		return hasDiagnostic ? "<h3>Diagnostic</h3>" + table : null;
	}
	
	protected boolean diagnosticRow(Diagnostic diagnostic, Table table, int depth, ViewGenerator viewGenerator) {
		if (matchSeverity(diagnostic)) {
			List<?> data = diagnostic.getData();
			if (diagnostic.getChildren().isEmpty()) {
				Color severityColor = HtmlEmfUtil.getSeverityColor(diagnostic.getSeverity());
				Row diagnosticRow = table.row().color(severityColor);
				Cell statusCell = diagnosticRow.header();
				statusCell.text().color(severityColor);
				switch (diagnostic.getSeverity()) {
				case Diagnostic.OK:
					statusCell.toHTMLElement().content("OK");
					break;
				case Diagnostic.CANCEL:
					statusCell.toHTMLElement().content("Cancel");
					break;
				case Diagnostic.ERROR:
					statusCell.toHTMLElement().content("Error");
					break;
				case Diagnostic.INFO:
					statusCell.toHTMLElement().content("Info");
					break;
				case Diagnostic.WARNING:
					statusCell.toHTMLElement().content("Warning");
					break;
				}
				
				Cell sourceCell = diagnosticRow.cell();
				//sourceCell.toHTMLElement().style().padding().left(depth + "em");
				if (data.size() > 0) {
					Object source = data.get(0);
					if (source instanceof EObject) {
						ViewAction<?> sva = EObjectAdaptable.adaptTo((EObject) source, ViewAction.class);
						sourceCell.toHTMLElement().content(sva == null ? source : viewGenerator.link(sva));
					} else {
						sourceCell.toHTMLElement().content(source);
					}
				}
				Cell featureCell = diagnosticRow.cell();
				if (data.size() > 1 && data.get(1) instanceof EStructuralFeature) {
					featureCell.toHTMLElement().content(viewGenerator.label(memberLabel((EStructuralFeature) data.get(1))));
				}			
				diagnosticRow.cell(StringEscapeUtils.escapeHtml4(diagnostic.getMessage()));
				
			}
			for (Diagnostic child: diagnostic.getChildren()) {
				diagnosticRow(child, table, depth + 1, viewGenerator);
			}			
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isInRole(String role) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			EList<String> roles = appearance.getRoles();
			if (!roles.isEmpty()) {
				return roles.contains(role);
			}
		}
		EObject container = getSemanticElement().eContainer();
		if (container instanceof ModelElement) {
			ModelElementAppearance cApp = ((ModelElement) container).getAppearance();
			if (cApp != null) {
				EReference containmentFeature = getSemanticElement().eContainmentFeature();
				if (containmentFeature != null) {
					MemberAppearance featureAppearance = cApp.getFeatures().get(Util.camelToKebab(containmentFeature.getName()));
					if (featureAppearance != null) {
						boolean specifiesElementActionsRoles = false;
						for (String featureRole: featureAppearance.getRoles()) {
							if (featureRole.equals(MemberRole.ELEMENTS.LITERAL + "/" + role) || featureRole.equals(MemberRole.ELEMENTS_SORTED.LITERAL + "/" + role)) {
								return true;
							}
							if (featureRole.startsWith(MemberRole.ELEMENTS.LITERAL + "/") || featureRole.startsWith(MemberRole.ELEMENTS_SORTED.LITERAL + "/")) {
								specifiesElementActionsRoles = true;
							}
							if (specifiesElementActionsRoles) {
								return false;
							}
						}
					}
				}
			}			
		}

		// Container-level defined role.
		if (container instanceof ModelElement) {
			for (EClass cClass: EmfUtil.lineage(container.eClass())) {
				for (ModelElementAppearance containerAppearance: factory.getAppearance(cClass)) {
					EReference containmentFeature = getSemanticElement().eContainmentFeature();
					if (containmentFeature != null) {
						MemberAppearance featureAppearance = containerAppearance.getFeatures().get(Util.camelToKebab(containmentFeature.getName()));
						if (featureAppearance != null) {
							boolean specifiesElementActionsRoles = false;
							for (String featureRole: featureAppearance.getRoles()) {
								if (featureRole.equals(MemberRole.ELEMENTS.LITERAL + "/" + role) || featureRole.equals(MemberRole.ELEMENTS_SORTED.LITERAL + "/" + role)) {
									return true;
								}
								if (featureRole.startsWith(MemberRole.ELEMENTS.LITERAL + "/") || featureRole.startsWith(MemberRole.ELEMENTS_SORTED.LITERAL + "/")) {
									specifiesElementActionsRoles = true;
								}
							}
							if (specifiesElementActionsRoles) {
								return false;
							}
						}
					}
				}
			}
		}
		
		// Own role.
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
				EList<String> roles = classAppearance.getRoles();
				if (!roles.isEmpty()) {
					return roles.contains(role);
				}				
			}
		}
		
		return super.isInRole(role);
	}
	
	@Override
	public EngineeringViewActionAdapterFactory getFactory() {
		return factory;
	}
	
	protected <F extends EStructuralFeature> ModelElementFeatureViewAction<T, F, ModelElementViewActionImpl<T>> createFeatureViewAction(F feature, ViewPart contentPart) {
		return new ModelElementFeatureViewAction<T, F, ModelElementViewActionImpl<T>>(this, feature) {
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				return contentPart == null ? null : contentPart.generate(viewGenerator, progressMonitor);
			}
			
			@Override
			public boolean isEmpty() {
				return contentPart == null;
			}
			
			@Override
			public boolean isInRole(String role) {
				return isMemberActionInRole(feature, role);
			}
			
		};
	}
	
	protected ModelElementOperationViewAction<T, ModelElementViewActionImpl<T>> createOperationViewAction(EOperation operation, ViewPart contentPart) {
		return new ModelElementOperationViewAction<T, ModelElementViewActionImpl<T>>(this, operation) {
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				return contentPart == null ? null : contentPart.generate(viewGenerator, progressMonitor);
			}
			
			@Override
			public boolean isEmpty() {
				return contentPart == null;
			}
			
			@Override
			public boolean isInRole(String role) {
				return isMemberActionInRole(operation, role);
			}
			
		};
	}
	
	protected Object generateResourcesTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
		table.header().headerRow("Resource", "Description").color(Color.INFO);
		for (NamedElement resource: getSemanticElement().getResources()) {
			table.body().row(
					viewGenerator.link(ViewAction.adaptToViewActionNonNull(resource)),
					getModelElementDescription(resource));
		}
		return table;
	}
	
	@Override
	protected Collection<Action> memberActions(ETypedElement member) {
		if (member == EngineeringPackage.Literals.MODEL_ELEMENT__RESOURCES) {
			if (getSemanticElement().getResources().isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateResourcesTable));
		}
		return super.memberActions(member);
	}
	
	@Override
	public SectionStyle getSectionStyle() {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			SectionStyle sectionStyle = appearance.getSectionStyle();
			if (sectionStyle != null) {
				return sectionStyle;
			}
		}
		
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
				SectionStyle sectionStyle = classAppearance.getSectionStyle();
				if (sectionStyle != null) {
					return sectionStyle;
				}
			}
		}
		return super.getSectionStyle();
	}
	
	public static Object progressBar(double completion, ViewGenerator viewGenerator) {
		if (completion != Double.NaN && completion > 0.001) {
			return viewGenerator.getBootstrapFactory().progressBar((int) (100 * completion));
		}
		return null;
	}
	
	@Override
	public String getIcon() {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			String icon = appearance.getIcon();
			if (!Util.isBlank(icon)) {
				return filterIcon(icon);
			}
		}
		
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
				String icon = classAppearance.getIcon();
				if (!Util.isBlank(icon)) {
					return filterIcon(icon);
				}
			}
		}
		
		return super.getIcon();
	}
	
	@Override
	public String getText() {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			String label = appearance.getLabel();
			if (!Util.isBlank(label)) {
				return label;
			}
		}
		
//		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
//			for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
//				String label = classAppearance.getLabel();
//				if (!Util.isBlank(label)) {
//					return label;
//				}
//			}
//		}
		return super.getText();
	}
	
	public static final String NONE = "none";
	
	/**
	 * This method returns null if icon is none
	 * @param icon
	 * @return
	 */
	protected String filterIcon(String icon) {
		return NONE.equals(icon) ? null : icon;
	}
	
	@Override
	public String memberIcon(ETypedElement member) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		String memberKey = Util.camelToKebab(member.getName());
		if (appearance != null) {
			MemberAppearance memberAppearance = (member instanceof EStructuralFeature ? appearance.getFeatures() : appearance.getOperations()).get(memberKey);
			if (memberAppearance != null) {
				String icon = memberAppearance.getIcon();
				if (!Util.isBlank(icon)) {
					return filterIcon(icon);
				}
			}
		}
				
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
				MemberAppearance memberAppearance = (member instanceof EStructuralFeature ? classAppearance.getFeatures() : classAppearance.getOperations()).get(memberKey);
				if (memberAppearance !=  null) {
					String icon = memberAppearance.getIcon();
					if (!Util.isBlank(icon)) {
						return filterIcon(icon);
					}
				}
			}
		}
			
		// Lineage of member type
		EClassifier memberType = member.getEType();
		if (memberType instanceof EClass) {
			for (EClass eClass: EmfUtil.lineage((EClass) memberType)) {
				for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
					String icon = classAppearance.getIcon();
					if (!Util.isBlank(icon)) {
						return filterIcon(icon);
					}
				}
			}
		}

		return super.memberIcon(member);
	}
	
	@Override
	public String memberLabelText(ETypedElement member) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		String memberKey = Util.camelToKebab(member.getName());
		if (appearance != null) {
			MemberAppearance memberAppearance = (member instanceof EStructuralFeature ? appearance.getFeatures() : appearance.getOperations()).get(memberKey);
			if (memberAppearance != null) {
				String label = memberAppearance.getLabel();
				if (!Util.isBlank(label)) {
					return label;
				}
			}
		}
				
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
				MemberAppearance memberAppearance = (member instanceof EStructuralFeature ? classAppearance.getFeatures() : classAppearance.getOperations()).get(memberKey);
				if (memberAppearance !=  null) {
					String label = memberAppearance.getLabel();
					if (!Util.isBlank(label)) {
						return label;
					}
				}
			}
		}
		
		// Lineage of member type
		EClassifier memberType = member.getEType();
		if (memberType instanceof EClass) {
			for (EClass eClass: EmfUtil.lineage((EClass) memberType)) {
				for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
					String label = classAppearance.getLabel();
					if (!Util.isBlank(label)) {
						return label;
					}
				}
			}
		}

		return super.memberLabelText(member);
	}		
	
	protected String diagramDescription(ModelElement modelElement) {
		String description = getModelElementDescription(modelElement);
		if (Util.isBlank(description)) {
			return "";
		}
		String tooltip = Util.firstPlainTextSentence(description, 30, 100);
		return Util.isBlank(tooltip) ? "" : "{" + tooltip + "}";
	}

	// --- UI actions customization.
	
	/**
	 * Role for member action
	 * @param role
	 * @return
	 */
	@Override
	protected boolean isActionInRole(String action, String role, String... defaultRoles) {		
		if (DIAGNOSTIC_SUMMARY_ACTION.equals(action) && !hasDiagnosticSummary()) {
			return false;
		}		
		
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			Appearance actionAppearance = appearance.getActions().get(action);
			if (actionAppearance != null) {
				if (!actionAppearance.getRoles().isEmpty()) {
					boolean hasActionRoles = false;
					for (String actionRole: actionAppearance.getRoles()) {
						if (actionRole.equals(role)) {
							return true;
						}
						hasActionRoles = true;
					}
					
					if (hasActionRoles) {
						return false;
					}
				}
			}
		}
		
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: getFactory().getAppearance(eClass)) {
				Appearance actionAppearance = classAppearance.getActions().get(action);
				if (actionAppearance != null) {
					if (!actionAppearance.getRoles().isEmpty()) {
						boolean hasActionRoles = false;
						for (String actionRole: actionAppearance.getRoles()) {
							if (actionRole.equals(role)) {
								return true;
							}
							hasActionRoles = true;
						}
						
						if (hasActionRoles) {
							return false;
						}
					}
				}
			}
		}
		
		return super.isActionInRole(action, role, defaultRoles);
	}
	
	@Override
	protected String actionIcon(String action, String defaultValue) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			Appearance actionAppearance = appearance.getActions().get(action);
			if (actionAppearance != null) {
				String icon = actionAppearance.getIcon();
				if (!Util.isBlank(icon)) {
					return filterIcon(icon);
				}
			}
		}
				
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
				Appearance actionAppearance = classAppearance.getActions().get(action);
				if (actionAppearance !=  null) {
					String icon = actionAppearance.getIcon();
					if (!Util.isBlank(icon)) {
						return filterIcon(icon);
					}
				}
			}
		}

		return super.actionIcon(action, defaultValue);
	}

	@Override
	protected String actionText(String action, String defaultValue) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			Appearance actionAppearance = appearance.getActions().get(action);
			if (actionAppearance != null) {
				String label = actionAppearance.getLabel();
				if (!Util.isBlank(label)) {
					return label;
				}
			}
		}
				
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: factory.getAppearance(eClass)) {
				Appearance actionAppearance = classAppearance.getActions().get(action);
				if (actionAppearance !=  null) {
					String label = actionAppearance.getLabel();
					if (!Util.isBlank(label)) {
						return label;
					}
				}
			}
		}

		return super.actionText(action, defaultValue);
	}

	@Override
	public String memberDescription(ETypedElement member) {
		return Util.isBlank(getContext().getString(SimpleEObjectViewAction.DOC_URI)) ? null : super.memberDescription(member);
	}

	@Override
	public String getDescription() {
		return Util.isBlank(getContext().getString(SimpleEObjectViewAction.DOC_URI)) ? null : super.getDescription();
	}
		
	protected static String diagramId(ModelElement modelElement) { 
		if (modelElement instanceof Start) { 
			return "[*]";
		}
		try {
			return Hex.encodeHexString(MessageDigest.getInstance("SHA-256").digest(modelElement.getUri().getBytes(StandardCharsets.UTF_8))); 
		} catch (NoSuchAlgorithmException e) { 
			throw new NasdanikaException(e);
		}
	}
				
}
