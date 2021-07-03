package org.nasdanika.engineering.gen;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.Topic;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.Card;
import org.nasdanika.html.emf.ViewAction;

/**
 * @author Pavel
 *
 */
public class TopicViewAction extends MessageViewAction<Topic> {
			
	public TopicViewAction(Topic target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}	
	
	@Override
	protected Object doGenerate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = (Fragment) super.doGenerate(viewGenerator, progressMonitor);
		for (Message message: getSemanticElement().getMessages()) {
			Card messageCard = viewGenerator.getBootstrapFactory().card();
			messageCard.getBody().toHTMLElement().content(getModelElementDescription(message, getContext()));
			messageCard.getHeader().toHTMLElement().content(TagName.h5.create(message.getName()));
			Tag footer = messageCard.getFooter().toHTMLElement();
			if (message.getDate() != null) {
				footer.content(message.getDate());
			}
			Engineer author = message.getAuthor();
			if (author != null) {
				footer.content(" by ", viewGenerator.link(ViewAction.adaptToViewActionNonNull(author)));
				int mc = author.getMessages().size();
				if (mc > 0) {
					footer.content(" (", mc, ")");
				}
			}
			ret.content(messageCard);			
		}
		return ret;
	}
	
	@Override
	public Action getParent() {
		Action parent = super.getParent();
		if (getSemanticElement().eContainer() instanceof EngineeredElement) {
			// Forum contained in an engieered element - parent should be a feature action.
			Action discussionAction = parent.find(a -> a instanceof ModelElementFeatureViewAction && ((ModelElementFeatureViewAction<?,?,?>) a).getETypedElement() == EngineeringPackage.Literals.FORUM__DISCUSSION);
			if (discussionAction != null) {
				return discussionAction;
			}
		}
		return parent;
	}
	
	
}
