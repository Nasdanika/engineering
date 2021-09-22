package org.nasdanika.engineering.gen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Forum;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.Topic;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Table;
import org.nasdanika.html.emf.ViewAction;

/**
 * @author Pavel
 *
 */
public class ForumViewAction<T extends Forum> extends NamedElementViewAction<T> {
			
	public ForumViewAction(T target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}	
	
	protected Object generateDiscussion(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = viewGenerator.getHTMLFactory().fragment();
		EList<Forum> forums = getSemanticElement().getDiscussion();
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
		EList<Topic> topics = getSemanticElement().getTopics();
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
	
	@Override
	protected Object doGenerate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (getSemanticElement() instanceof EngineeredElement) {
			// Do not show discussion - it would be shown in the discussion feature action.
			return super.doGenerate(viewGenerator, progressMonitor);
		}
		Fragment ret = (Fragment) super.doGenerate(viewGenerator, progressMonitor);
		ret.content(generateDiscussion(viewGenerator, progressMonitor));
		return ret;
	}
	
	@Override
	public Action getParent() {
		Action parent = super.getParent();
		if (!(getSemanticElement() instanceof EngineeredElement) && getSemanticElement().eContainer() instanceof EngineeredElement && getSemanticElement().eContainmentFeature() == EngineeringPackage.Literals.FORUM__DISCUSSION) {
			// Forum contained in an engieered element - parent should be a feature action.
			Action discussionAction = parent.find(a -> a instanceof ModelElementFeatureViewAction && ((ModelElementFeatureViewAction<?,?,?>) a).getETypedElement() == EngineeringPackage.Literals.FORUM__DISCUSSION);
			if (discussionAction != null) {
				return discussionAction;
			}
		}
		return parent;
	}
	
}
