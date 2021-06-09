package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.Context;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.app.viewparts.AdaptiveNavigationPanelViewPart;
import org.nasdanika.html.app.viewparts.AdaptiveNavigationPanelViewPart.Style;
import org.nasdanika.html.bootstrap.Card;

public class DocumentViewAction extends EngineeredElementViewAction<Document> {

	private ModelElementFeatureViewAction<Document, EAttribute, ModelElementViewActionImpl<Document>> tocAction;

	protected DocumentViewAction(Document value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
		tocAction = createFeatureViewAction(EngineeringPackage.Literals.DOCUMENT__TABLE_OF_CONTENTS, this::generatePanelOfContents);
		tocAction.setActivator(ActionActivator.INLINE_ACTIVATOR);
	}
	
	protected Object generatePanelOfContents(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		List<Action> sectionChildren = getSectionChildren();
		if (sectionChildren.isEmpty()) {
			return null;
		}
		Card ret = viewGenerator.getBootstrapFactory().card();
		ret.getHeader().toHTMLElement().content("Contents");
		AdaptiveNavigationPanelViewPart contentsPanel = new AdaptiveNavigationPanelViewPart(sectionChildren, this, Action.Role.SECTION, Style.AUTO);
		ret.getBody().toHTMLElement().content(contentsPanel.generate(viewGenerator, progressMonitor));
		return ret;
	}
	
	protected Object generateInfo(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		return super.doGenerate(viewGenerator, progressMonitor);
	}
	
	@Override
	protected Object doGenerate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = viewGenerator.getHTMLFactory().fragment();
		if (getSemanticElement().isTableOfContents() && tocAction.isInRole(Action.Role.SECTION) && !getSectionChildren().isEmpty()) {
			ret.content(generatePanelOfContents(viewGenerator, progressMonitor));
		}
		String content = getSemanticElement().getContent();
		Context context = getContext();
		if (!Util.isBlank(content)) {
			ret.content(context.interpolateToString(content));		
		}
		String markdownContent = getSemanticElement().getMarkdownContent();
		if (!Util.isBlank(markdownContent)) {
			String markdown = context.interpolateToString(markdownContent);
			MarkdownHelper markdownHelper = context.computingContext().get(MarkdownHelper.class, MarkdownHelper.INSTANCE);
			ret.content(viewGenerator.getHTMLFactory().div(markdownHelper.markdownToHtml(markdown)).addClass("markdown-body"));
		}
		return ret;
	}
	
	@Override
	protected boolean isCacheContent() {
		return false;
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.DOCUMENT__TABLE_OF_CONTENTS) {
			if (!getSemanticElement().isTableOfContents() || tocAction.isInRole(Action.Role.SECTION)) { // Section is a special case.
				return Collections.emptyList(); 
			}
			return Collections.singleton(tocAction);
		}
		return super.featureActions(feature);
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> ret = super.collectChildren();
		
		ActionImpl infoAction = new ActionImpl() {
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				return generateInfo(viewGenerator, progressMonitor);
			}
			
			@Override
			public boolean isEmpty() {
				return false;
			}
			
		};
		
		infoAction.setText("Info");
		infoAction.getRoles().add(Action.Role.CONTEXT);
		infoAction.setParent(this);
		infoAction.setActivator(new PathNavigationActionActivator(infoAction, ((NavigationActionActivator) getActivator()).getUrl(null), sectionPath(this) + "info.html", getMarker()));
		ret.add(infoAction);
		
		return ret;
	}

}
