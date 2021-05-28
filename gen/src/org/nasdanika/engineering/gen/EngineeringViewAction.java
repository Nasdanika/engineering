package org.nasdanika.engineering.gen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.emf.ViewAction;

/**
 * Grouping action for {@link ModelElement}'s {@link ViewAction}'s. 
 * 
 * @author Pavel
 *
 */
public class EngineeringViewAction extends ActionImpl {
	
	private Collection<EObject> elements;

	public EngineeringViewAction(Collection<EObject> elements) {
		this.elements = elements;
		setText("Engineering");
		setSectionStyle(SectionStyle.DEFAULT);
	}
	
	@Override
	public List<Action> getChildren() {
		List<Action> children = new ArrayList<>(ViewAction.adaptToViewActionNonNull(elements));
		
		List<Issue> issues = new ArrayList<>();
		EcoreUtil.getAllContents(elements).forEachRemaining(e -> {
			if (e instanceof Issue) {
				issues.add((Issue) e);
			}
		});
		
		Action assignmentSection = ModelElementViewAction.endeavorsSection(
				issues, 
				"Issues", 
				"issues", 
				null,
				getActivator(),
				Collections.emptyList(),
				EngineeringPackage.Literals.NAMED_ELEMENT__NAME,
				EngineeringPackage.Literals.ISSUE__START,
				EngineeringPackage.Literals.ISSUE__END,
				EngineeringPackage.Literals.ISSUE__TARGET,
				EngineeringPackage.Literals.ENDEAVOR__ASSIGNEE,
				EngineeringPackage.Literals.ISSUE__STATUS,
				EngineeringPackage.Literals.ISSUE__CATEGORY,				
				EngineeringPackage.Literals.ISSUE__EFFORT,
				EngineeringPackage.Literals.ISSUE__COST,
				EngineeringPackage.Literals.ENDEAVOR__BENEFIT,
				EngineeringPackage.Literals.ISSUE__REMAINING_EFFORT,
				EngineeringPackage.Literals.ISSUE__REMAINING_COST,
				EngineeringPackage.Literals.ENDEAVOR__COMPLETION);
		
		if (assignmentSection != null) {
			children.add(assignmentSection);
		}
		
		return children;				
	}
	
	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		Fragment ret = viewGenerator.getHTMLFactory().fragment();
		ret.content(viewGenerator.processViewPart(ViewAction.listOfViewActionsSorted(elements, null, false, false, 1), progressMonitor));		
		return ret;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

}
