package org.nasdanika.engineering.gen;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.Document;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.ViewGenerator;

public class DocumentViewAction extends EngineeredElementViewAction<Document> {

	protected DocumentViewAction(Document value, EngineeringViewActionAdapterFactory factory) {
		super(value, factory);
	}
	
	protected Object generateTableOfContents(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		return "Table of contents...";
	}
	
	protected Object generateInfo(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		return super.generate(viewGenerator, progressMonitor);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		// TODO Auto-generated method stub
		return super.generate(viewGenerator, progressMonitor);
	}
	
	@Override
	protected Object doGenerate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		return "Document content here...";
	}
	
	@Override
	protected boolean isCacheContent() {
		return false;
	}
	
	@Override
	protected Collection<Action> featureActions(EStructuralFeature feature) {
		if (feature == EngineeringPackage.Literals.DOCUMENT__TABLE_OF_CONTENTS) {
			if (getSemanticElement().getTableOfContents() == null) {
				return Collections.emptyList(); 
			}
			ModelElementFeatureViewAction<Document, EStructuralFeature, ModelElementViewActionImpl<Document>> tocAction = createFeatureViewAction(feature, this::generateTableOfContents);
			tocAction.setActivator(ActionActivator.INLINE_ACTIVATOR);
			return Collections.singleton(tocAction);
		}
		return super.featureActions(feature);
	}
	
	@Override
	protected List<Action> collectChildren() {
		List<Action> ret = super.collectChildren();
		// TODO - info context action.
		return ret;
	}

}
