package org.nasdanika.engineering.gen;

import java.util.function.Function;

import org.apache.commons.text.StringEscapeUtils;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.engineering.NamedElement;

/**
 * Base class for Core ViewAction adapters.
 * @author Pavel
 *
 * @param <T>
 */
public class NamedElementViewAction<T extends NamedElement> extends ModelElementViewAction<T> {
			
	protected NamedElementViewAction(T target, Function<Resource, String> resourcePathResolver) {
		super(target, resourcePathResolver);		
	}
	
	@Override
	public String getText() {
		return StringEscapeUtils.escapeHtml4(target.getName());
	}
	
}
