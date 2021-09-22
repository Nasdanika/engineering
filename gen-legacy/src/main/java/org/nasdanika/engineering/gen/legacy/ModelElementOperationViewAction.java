package org.nasdanika.engineering.gen;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.engineering.MemberAppearance;
import org.nasdanika.engineering.ModelElement;
import org.nasdanika.engineering.ModelElementAppearance;
import org.nasdanika.html.emf.EOperationViewActionImpl;
import org.nasdanika.html.emf.SimpleEObjectViewAction;

/**
 * Handles appearance.
 * @author Pavel
 *
 * @param <T>
 * @param <F>
 * @param <V>
 */
public class ModelElementOperationViewAction<T extends ModelElement, V extends ModelElementViewAction<T>> extends EOperationViewActionImpl<T, V> {

	public ModelElementOperationViewAction(T semanticElement, EOperation operation) {
		super(semanticElement, operation);
	}

	public ModelElementOperationViewAction(V semanticElementViewAction, EOperation operation) {
		super(semanticElementViewAction, operation);
	}
	
	@Override
	public boolean isInRole(String role) {
		ModelElementAppearance appearance = getSemanticElement().getAppearance();
		if (appearance != null) {
			MemberAppearance operationAppearance = appearance.getOperations().get(Util.camelToKebab(getETypedElement().getName()));
			if (operationAppearance != null) {
				if (!operationAppearance.getRoles().isEmpty()) {
					boolean hasOperationActions = false;
					for (String operationRole: operationAppearance.getRoles()) {
						if (operationRole.equals(SimpleEObjectViewAction.MemberRole.ACTIONS.LITERAL + "/" + role)) {
							return true;
						}
						if (operationRole.startsWith(SimpleEObjectViewAction.MemberRole.ACTIONS.LITERAL + "/")) {
							hasOperationActions = true;
						}
					}
					
					if (hasOperationActions) {
						return false;
					}
				}
			}
		}
		
		for (EClass eClass: EmfUtil.lineage(getSemanticElement().eClass())) {
			for (ModelElementAppearance classAppearance: getSemanticElementViewAction().getFactory().getAppearance(eClass)) {
				MemberAppearance operationAppearance = classAppearance.getOperations().get(Util.camelToKebab(getETypedElement().getName()));
				if (operationAppearance != null) {
					if (!operationAppearance.getRoles().isEmpty()) {
						boolean hasOperationActions = false;
						for (String operatoinRole: operationAppearance.getRoles()) {
							if (operatoinRole.equals(SimpleEObjectViewAction.MemberRole.ACTIONS.LITERAL + "/" + role)) {
								return true;
							}
							if (operatoinRole.startsWith(SimpleEObjectViewAction.MemberRole.ACTIONS.LITERAL + "/")) {
								hasOperationActions = true;
							}
						}
						
						if (hasOperationActions) {
							return false;
						}
					}
				}
			}
		}

		return super.isInRole(role);
	}

}
