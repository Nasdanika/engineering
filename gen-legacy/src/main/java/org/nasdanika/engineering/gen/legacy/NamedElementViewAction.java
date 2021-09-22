package org.nasdanika.engineering.gen;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.text.StringEscapeUtils;
import org.nasdanika.common.Util;
import org.nasdanika.common.persistence.ConfigurationException;
import org.nasdanika.common.persistence.Marked;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.engineering.NamedElement;

/**
 * Base class for Core ViewAction adapters.
 * @author Pavel
 *
 * @param <T>
 */
public class NamedElementViewAction<T extends NamedElement> extends ModelElementViewActionImpl<T> {
			
	protected NamedElementViewAction(T target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}
	
	@Override
	public String getText() {
		return StringEscapeUtils.escapeHtml4(getSemanticElement().getName());
	}
	
	@Override
	protected String getDefaultPath() {
		String name = getSemanticElement().getName();
		if (!Util.isBlank(name)) {
			int idx = ((List<?>) getSemanticElement().eContainer().eGet(getSemanticElement().eContainmentFeature())).stream().filter(e -> e instanceof NamedElement && name.equals(((NamedElement) e).getName())).collect(Collectors.toList()).indexOf(getSemanticElement());
			try {
				String digest = Hex.encodeHexString(MessageDigest.getInstance("SHA-256").digest(name.getBytes(StandardCharsets.UTF_8)));
				return idx == 0 ? digest : (digest + "-" + idx);
			} catch (NoSuchAlgorithmException e) {
				throw new ConfigurationException("Cannot encode name: " + 3, e, EObjectAdaptable.adaptTo(getSemanticElement(), Marked.class));
			}
		}
		return super.getDefaultPath();
	}
	
}
