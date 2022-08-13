package org.nasdanika.engineering.gen;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Topic;
import org.nasdanika.html.bootstrap.Text.Alignment;
import org.nasdanika.html.emf.ColumnBuilder;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.bootstrap.Appearance;
import org.nasdanika.html.model.bootstrap.BootstrapFactory;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.html.model.bootstrap.TableCell;
import org.nasdanika.html.model.bootstrap.Text;

public class ForumActionBuilder<T extends Forum> extends NamedElementActionBuilder<T> {
	
	public ForumActionBuilder(T target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject, Action> registry,
			Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer,
			ProgressMonitor progressMonitor) {
		
		action = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		EList<Action> groupAnonymous = action.getAnonymous();
		for (Forum forum: getTarget().getDiscussion()) {
			groupAnonymous.add(createChildAction(forum, registry, resolveConsumer, progressMonitor));
		}		
		for (Topic topic: getTarget().getTopics()) {
			groupAnonymous.add(createChildAction(topic, registry, resolveConsumer, progressMonitor));
		}		
		
		return action;
	}
		
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {
		super.resolve(action, context, progressMonitor);
		
		T forum = getTarget();
		
		// Rendering topics and sub-forums under discussion action if it is present (EngineeredElement) or under this action (Forum) 
		String discussionActionUUID = action.getUuid() + "-discussion";
		Action discussionAction = action.getNavigation().stream()
				.filter(Action.class::isInstance)					
				.map(Action.class::cast)
				.filter(a -> discussionActionUUID.equals(a.getUuid()))
				.findFirst()
				.orElse(action);

		EList<Forum> forums = forum.getDiscussion();
		if (!forums.isEmpty()) {
			Action forumsAction = AppFactory.eINSTANCE.createAction();
			forumsAction.setText("Forums");
			discussionAction.getSections().add(forumsAction);
			
			ColumnBuilder<Forum> topicsColumnBuilder = new ColumnBuilder<Forum>() {

				@Override
				public void buildHeader(
						TableCell header, 
						Action base, 
						ETypedElement typedElement,
						org.nasdanika.html.emf.EObjectActionResolver.Context context, 
						ProgressMonitor progressMonitor) {

					header.getContent().add(createText("Topics"));
				}

				@Override
				public void buildCell(
						Forum rowElement, 
						TableCell cell, 
						Action base, 
						ETypedElement typedElement,
						org.nasdanika.html.emf.EObjectActionResolver.Context context, 
						ProgressMonitor progressMonitor) {

					cell.getContent().add(createText(String.valueOf(rowElement.getTopics().size())));
					Appearance cellAppearance = cell.getAppearance();
					if (cellAppearance == null) {
						cellAppearance = BootstrapFactory.eINSTANCE.createAppearance();
						cell.setAppearance(cellAppearance);
					}
					Text textAppearance = cellAppearance.getText();
					if (textAppearance == null) {
						textAppearance = BootstrapFactory.eINSTANCE.createText();
						cellAppearance.setText(textAppearance);
					}
					textAppearance.setAlignment(Alignment.CENTER);
				}
			};
			
			Table forumsTable = buildTable(
					forums, 
					action, 
					EngineeringPackage.Literals.FORUM__DISCUSSION, 
					context, 
					progressMonitor,
					createColumnBuilder("Forum"),
					topicsColumnBuilder
					// last activity
					);
			
			forumsAction.getContent().add(forumsTable);
		}
		
		EList<Topic> topics = forum.getTopics();
		if (!topics.isEmpty()) {
			Action topicsAction = AppFactory.eINSTANCE.createAction();
			topicsAction.setText("Topics");
			discussionAction.getSections().add(topicsAction);
			
			ColumnBuilder<Topic> messagesColumnBuilder = new ColumnBuilder<Topic>() {

				@Override
				public void buildHeader(
						TableCell header, 
						Action base, 
						ETypedElement typedElement,
						org.nasdanika.html.emf.EObjectActionResolver.Context context, 
						ProgressMonitor progressMonitor) {

					header.getContent().add(createText("Messages"));
				}

				@Override
				public void buildCell(
						Topic rowElement, 
						TableCell cell, 
						Action base, 
						ETypedElement typedElement,
						org.nasdanika.html.emf.EObjectActionResolver.Context context, 
						ProgressMonitor progressMonitor) {

					cell.getContent().add(createText(String.valueOf(rowElement.getMessages().size())));
					Appearance cellAppearance = cell.getAppearance();
					if (cellAppearance == null) {
						cellAppearance = BootstrapFactory.eINSTANCE.createAppearance();
						cell.setAppearance(cellAppearance);
					}
					Text textAppearance = cellAppearance.getText();
					if (textAppearance == null) {
						textAppearance = BootstrapFactory.eINSTANCE.createText();
						cellAppearance.setText(textAppearance);
					}
					textAppearance.setAlignment(Alignment.CENTER);
				}
			};
			
			Table topicsTable = buildTable(
					topics, 
					action, 
					EngineeringPackage.Literals.FORUM__TOPICS, 
					context, 
					progressMonitor,
					createColumnBuilder("Topic"),
					messagesColumnBuilder
					// last activity
					);
			
			topicsAction.getContent().add(topicsTable);
		}
		
	}
	
}
