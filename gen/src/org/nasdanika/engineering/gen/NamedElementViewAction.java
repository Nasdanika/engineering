package org.nasdanika.engineering.gen;

import org.apache.commons.text.StringEscapeUtils;
import org.nasdanika.engineering.NamedElement;

/**
 * Base class for Core ViewAction adapters.
 * @author Pavel
 *
 * @param <T>
 */
public class NamedElementViewAction<T extends NamedElement> extends ModelElementViewAction<T> {
			
	protected NamedElementViewAction(T target) {
		super(target);		
	}
	
	@Override
	public String getText() {
		return StringEscapeUtils.escapeHtml4(target.getName());
	}
	
}
