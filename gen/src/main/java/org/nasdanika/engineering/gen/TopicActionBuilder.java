package org.nasdanika.engineering.gen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Message;
import org.nasdanika.engineering.Topic;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.bootstrap.Appearance;
import org.nasdanika.html.model.bootstrap.BootstrapElement;
import org.nasdanika.html.model.bootstrap.BootstrapFactory;
import org.nasdanika.html.model.bootstrap.Card;
import org.nasdanika.html.model.bootstrap.Spacing;

public class TopicActionBuilder extends MessageActionBuilder<Topic> {
	
	public TopicActionBuilder(Topic target, Context context) {
		super(target, context);		
	}
		
	@Override
	protected void resolve(
			Action action, 
			org.nasdanika.html.emf.EObjectActionResolver.Context context,
			ProgressMonitor progressMonitor) {
		super.resolve(action, context, progressMonitor);
		
		for (Message message: getTarget().getMessages()) {
			Card messageCard = BootstrapFactory.eINSTANCE.createCard();
			Appearance appearance = BootstrapFactory.eINSTANCE.createAppearance();
			messageCard.setAppearance(appearance);
			Spacing mTop = BootstrapFactory.eINSTANCE.createSpacing();
			mTop.setY(true);
			mTop.setSize(Size.S1);
			appearance.getMargin().add(mTop);
			
			if (!Util.isBlank(message.getName())) {
				BootstrapElement header = BootstrapFactory.eINSTANCE.createBootstrapElement();
				header.getContent().add(createText(message.getName()));
				messageCard.setHeader(header);
			}

			BootstrapElement body = BootstrapFactory.eINSTANCE.createBootstrapElement();
			messageCard.setBody(body);
			
			if (!Util.isBlank(message.getDescription())) {
				body.getContent().add(createText(message.getDescription()));
			}
			
			for (EObject documentation: message.getDocumentation()) {
				body.getContent().add(EcoreUtil.copy(documentation));
			}
			
			Engineer author = message.getAuthor();
			if (author != null || message.getDate() != null) {
				BootstrapElement footer = BootstrapFactory.eINSTANCE.createBootstrapElement();
				if (author != null) {
					footer.getContent().add(renderValue(action, EngineeringPackage.Literals.MESSAGE__AUTHOR, author, context, progressMonitor));
				}
				if (message.getDate() != null) {
					if (author != null) {
						footer.getContent().add(createText(", "));
					}
					footer.getContent().add(renderValue(action, EngineeringPackage.Literals.MESSAGE__DATE, message.getDate(), context, progressMonitor));
				}
				messageCard.setFooter(footer);
			}
			
			
			action.getContent().add(messageCard);
		}
		
	}
	
}
