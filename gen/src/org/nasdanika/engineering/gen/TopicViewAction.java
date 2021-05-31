package org.nasdanika.engineering.gen;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.Topic;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
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
	protected boolean isFeatureInRole(EStructuralFeature feature, FeatureRole role) {
		if (feature == EngineeringPackage.Literals.TOPIC__MESSAGES) {
			return false;
		}		
		return super.isFeatureInRole(feature, role);
	}
	
	@Override
	public boolean isInRole(String role) {
		return false;
	}
	
	@Override
	protected Object doGenerate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = (Fragment) super.doGenerate(viewGenerator, progressMonitor);
		for (Message message: getSemanticElement().getMessages()) {
			Card messageCard = viewGenerator.getBootstrapFactory().card();
			messageCard.getBody().toHTMLElement().content(getModelElementDescription(message));
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
	
}
