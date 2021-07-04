package org.nasdanika.engineering.gen;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Allocation;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.IssueCategory;
import org.nasdanika.engineering.Principle;
import org.nasdanika.engineering.Topic;
import org.nasdanika.html.OrderedListType;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Label;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.viewparts.ListOfActionsViewPart;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;

public class EngineeredElementViewAction<T extends EngineeredElement> extends ForumViewAction<T> {
	
	protected EngineeredElementViewAction(T value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
		
	protected Object generateAllocationsTable(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Table table = bootstrapFactory.table().bordered().striped();
		table.header().headerRow("Endeavor", "Engineer", "Category", "Effort", "Rate", "Funds").color(Color.INFO);
		for (Allocation allocation: getSemanticElement().getAllocations()) {
			Tag categoriesTag;
			IssueCategory category = allocation.getCategory();
			if (category == null) {
				categoriesTag = TagName.span.create();
			} else {
				categoriesTag = viewGenerator.link(ViewAction.adaptToViewActionNonNull(category));							
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
	
	protected Object generateListOfPrinciples(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		ListOfActionsViewPart listOfPrinciples = new ListOfActionsViewPart(adaptMemberElementsToViewActionsNonNull(EngineeringPackage.Literals.ENGINEERED_ELEMENT__PRINCIPLES, getSemanticElement().getPrinciples()), null, true, 10, OrderedListType.ROTATE) {
			@Override
			protected Collection<Entry<Label, List<Action>>> getGroupedActions(ViewGenerator viewGenerator, Action currentAction) {
				if (currentAction instanceof ViewAction) {
					EObject se = ((ViewAction<?>) currentAction).getSemanticElement();
					if (se instanceof Principle) {
						return Collections.singleton(new AbstractMap.SimpleEntry<Label, List<Action>>(null, adaptMemberElementsToViewActionsNonNull(EngineeringPackage.Literals.ENGINEERED_ELEMENT__PRINCIPLES, ((Principle) se).getChildren())));
					}
				}
				return super.getGroupedActions(viewGenerator, currentAction);
			}
		};
		return viewGenerator.processViewPart(listOfPrinciples, progressMonitor);
	}
	
	@Override
	protected Collection<Action> memberActions(ETypedElement member) {
		if (member == EngineeringPackage.Literals.FORUM__DISCUSSION) {
			EList<Topic> topics = getSemanticElement().getTopics();
			EList<Forum> forums = getSemanticElement().getDiscussion();
			if (topics.isEmpty() && forums.isEmpty()) {
				return Collections.emptyList();
			}
			
			ModelElementFeatureViewAction<T, EReference, ModelElementViewActionImpl<T>> discussionAction = new ModelElementFeatureViewAction<T, EReference, ModelElementViewActionImpl<T>>(this, (EReference) member) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					return generateDiscussion(viewGenerator, progressMonitor);
				}
				
				@Override
				public boolean isEmpty() {
					return false;
				}
				
				@Override
				public List<Action> getChildren() {
					List<Action> children = new ArrayList<>();
					children.addAll(adaptMemberElementsToViewActionsNonNull(EngineeringPackage.Literals.FORUM__DISCUSSION, forums));
					children.addAll(adaptMemberElementsToViewActionsNonNull(EngineeringPackage.Literals.FORUM__TOPICS, topics));
					return children;
				}
				
			};
			
			return Collections.singleton(discussionAction);			
		}
		
		if (member == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ALLOCATIONS) {
			EList<Allocation> allocations = getSemanticElement().getAllocations();
			if (allocations.isEmpty()) {
				return Collections.emptyList();
			}
			return Collections.singleton(createFeatureViewAction((EStructuralFeature) member, this::generateAllocationsTable));
		}
		
		if (member == EngineeringPackage.Literals.ENGINEERED_ELEMENT__PRINCIPLES) {
			EList<Principle> principles = getSemanticElement().getPrinciples();
			if (principles.isEmpty()) {
				return Collections.emptyList();
			}
			ModelElementFeatureViewAction<T, EStructuralFeature, ModelElementViewActionImpl<T>> principlesSection = createFeatureViewAction((EStructuralFeature) member, this::generateListOfPrinciples);
			
			principlesSection.setSectionStyle(SectionStyle.DEFAULT);
			return Collections.singleton(principlesSection);
		}
		
		if (member == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES) {
			EList<Issue> issues = getSemanticElement().getIssues();
			if (issues.isEmpty()) {
				return Collections.emptyList();
			}
			Action issuesAction = endeavorsAction(
					issues, 
					null,
					"Issues", 
					"issues", 
					getFeatureDiagnostic((EStructuralFeature) member),
					role -> isMemberActionInRole(member, role),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.PERIOD__START,
					EngineeringPackage.Literals.PERIOD__END,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__PRIORITY,
					EngineeringPackage.Literals.ISSUE__SEVERITY,
					EngineeringPackage.Literals.ISSUE__CATEGORIES,				
					EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
					EngineeringPackage.Literals.ISSUE__REMAINING_COST,
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION);
			
			return Collections.singleton(issuesAction);
		}
		
		if (member == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ALL_ISSUES) {
			EList<Issue> issues = getSemanticElement().getIssues();
			EList<Issue> allIssues = getSemanticElement().getAllIssues();
			if (allIssues.isEmpty() || allIssues.equals(issues)) {
				return Collections.emptyList();
			}
			Action allIssuesAction = ModelElementViewActionImpl.endeavorsAction(
					allIssues, 
					null,
					"All Issues", 
					"all-issues", 
					null,
					getActivator(),
					Collections.emptyList(),
					role -> isMemberActionInRole(member, role),
					EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
					EngineeringPackage.Literals.PERIOD__START,
					EngineeringPackage.Literals.PERIOD__END,
					EngineeringPackage.Literals.ISSUE__TARGET,
					EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE,
					EngineeringPackage.Literals.ISSUE__STATUS,
					EngineeringPackage.Literals.ISSUE__PRIORITY,
					EngineeringPackage.Literals.ISSUE__SEVERITY,
					EngineeringPackage.Literals.ISSUE__CATEGORIES,				
					EngineeringPackage.Literals.ISSUE__EFFORT,
					EngineeringPackage.Literals.ISSUE__COST,
					EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
					EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
					EngineeringPackage.Literals.ISSUE__REMAINING_COST,
					EngineeringPackage.Literals.ENDEAVOR__COMPLETION);
			
			return Collections.singleton(allIssuesAction);
		}


		return super.memberActions(member);
	}

}
