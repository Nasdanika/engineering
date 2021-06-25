package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.Context;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.TableOfContents;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.MutableAction;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.app.impl.PathNavigationActionActivator;
import org.nasdanika.html.emf.EStructuralFeatureViewAction;
import org.nasdanika.html.emf.ViewAction;

public class DocumentViewAction extends EngineeredElementViewAction<Document> {

	protected DocumentViewAction(Document value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	protected Object generateInfo(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		return super.doGenerate(viewGenerator, progressMonitor);
	}
	
	@Override
	protected Object doGenerate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = viewGenerator.getHTMLFactory().fragment();
		TableOfContents toc = getSemanticElement().getTableOfContents();
		if (toc != null && !Util.isBlank(toc.getRole())) {
			switch (toc.getRole()) {
			case "content":
				ret.content(generateFragmentOfContents(viewGenerator, progressMonitor));
				break;
			case Action.Role.FLOAT_LEFT:
			case Action.Role.FLOAT_RIGHT:
				ret.content(generateTableOfContents(viewGenerator, progressMonitor));
				break;
			}
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

	/**
	 * Suppressing table of contents in description.
	 */
	@Override
	protected Object generateHead(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		return null;
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> inheritedChildren = super.collectChildren();
		
		List<Action> ret = new ArrayList<>();
		
		Predicate<Action> documentChildrenPredicate = c -> {
			if (c instanceof EStructuralFeatureViewAction) {
				EStructuralFeatureViewAction<?, ?> sfa = (EStructuralFeatureViewAction<?, ?>) c;
				EStructuralFeature feature = sfa.getETypedElement();
				return feature == EngineeringPackage.Literals.FORUM__DISCUSSION	
						|| feature == EngineeringPackage.Literals.MODEL_ELEMENT__SECTIONS 
						|| feature == EngineeringPackage.Literals.MODEL_ELEMENT__TABLE_OF_CONTENTS;				
			} 
			
			if (c instanceof ViewAction) {
				return DocumentViewAction.this.getSemanticElement().getSections().contains(((ViewAction<?>) c).getSemanticElement());
			}
			
			return false;
		}; 
		
		inheritedChildren.stream().filter(documentChildrenPredicate).forEach(ret::add);
		
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
		
		inheritedChildren.stream().filter(documentChildrenPredicate.negate()).forEach(action -> {
			if (action.isInRole(Action.Role.SECTION)) {
				infoAction.getChildren().add(action);				
			} else if (action instanceof MutableAction) {
				infoAction.getChildren().add(action);
				((MutableAction) action).setParent(infoAction);
			}
		});
		
		infoAction.setText("Info");
		infoAction.getRoles().add(Action.Role.CONTEXT);
		infoAction.setParent(this);
		infoAction.setActivator(new PathNavigationActionActivator(infoAction, ((NavigationActionActivator) getActivator()).getUrl(null), sectionPath(this) + "info.html", getMarker()));
		ret.add(infoAction);
		
		return ret;
	}

}
