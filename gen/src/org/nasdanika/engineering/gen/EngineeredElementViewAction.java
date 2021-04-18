package org.nasdanika.engineering.gen;

import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;

public class EngineeredElementViewAction<T extends EngineeredElement> extends NamedElementViewAction<T> {
	
	protected EngineeredElementViewAction(T value, Function<Resource, String> resourcePathResolver) {
		super(value, resourcePathResolver);
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		BootstrapFactory bootstrapFactory = viewGenerator.getBootstrapFactory();
		Fragment ret = bootstrapFactory.getHTMLFactory().fragment(super.generate(viewGenerator, progressMonitor));
		return ret;
	}
	
	@Override
	public List<Action> getChildren() {
		List<Action> children = super.getChildren();
		
		Action issuesSection = issuesSection(
				target.getIssues(), 
				"Issues", 
				"issues", 
				EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
				EngineeringPackage.Literals.ISSUE__STATUS,
				EngineeringPackage.Literals.ISSUE__CATEGORY,				
				EngineeringPackage.Literals.ISSUE__ASSIGNEE,				
				EngineeringPackage.Literals.ISSUE__EFFORT,
				EngineeringPackage.Literals.ISSUE__COST,
				EngineeringPackage.Literals.ISSUE__BENEFIT);
		
		if (issuesSection != null) {
			children.add(issuesSection);
		}
				
		return children;
	}
			
	@Override
	protected boolean isChildFeature(EReference ref) {
		if (ref == EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES) {
			return false;
		}
		return super.isChildFeature(ref);
	}
	

}
