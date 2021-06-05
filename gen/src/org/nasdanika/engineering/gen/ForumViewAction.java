package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.Topic;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;
import org.nasdanika.html.emf.ViewActionImpl;

/**
 * @author Pavel
 *
 */
public class ForumViewAction<T extends Forum> extends NamedElementViewAction<T> {
			
	public ForumViewAction(T target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}	
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> children = super.collectChildren();
		
		EList<Topic> topics = getSemanticElement().getTopics();
		EList<Forum> forums = getSemanticElement().getDiscussion();
		if (!topics.isEmpty() || !forums.isEmpty()) {
			ViewActionImpl<EObject> discussionAction = new ViewActionImpl<EObject>(getSemanticElement()) {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					Fragment ret = viewGenerator.getHTMLFactory().fragment();
					if (!forums.isEmpty()) {
						Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
						table.header().headerRow("Forum", "Messages", "Topics", "Sub-forums").color(Color.INFO);					
						for (Forum forum: forums) {
							int messages = 0;
							int topics = 0;
							int subForums = 0;
							TreeIterator<EObject> fit = forum.eAllContents();
							while (fit.hasNext()) {
								EObject next = fit.next();
								if (next instanceof Topic) {
									++topics;
								} else if (next instanceof Message) {
									++messages;
								} else if (next instanceof Forum) {
									++subForums;
								}
							}
							table.body().row(
									viewGenerator.link(ViewAction.adaptToViewActionNonNull(forum)),
									messages,
									topics,
									subForums);
						}
						ret.content(table);
					}
					if (!topics.isEmpty()) {
						Table table = viewGenerator.getBootstrapFactory().table().bordered().striped();
						table.header().headerRow("Topic", "Messages").color(Color.INFO);					
						for (Topic topic: topics) {
							table.body().row(
									viewGenerator.link(ViewAction.adaptToViewActionNonNull(topic)),
									topic.getMessages().size());
						}
						ret.content(table);
					}
					return ret;
				}				
				
			};
			discussionAction.getRoles().add(Action.Role.CONTEXT); // TODO - from discussion feature
			discussionAction.setActivator(new PathNavigationActionActivator(discussionAction, ((NavigationActionActivator) getActivator()).getUrl(null), "discussion", getMarker()));
			discussionAction.setText("Discussion");			
			children.add(discussionAction);			
		}
				
		return children;
	}
	
	@Override
	public boolean isInRole(String role) {
		return false;
	}
	
}
