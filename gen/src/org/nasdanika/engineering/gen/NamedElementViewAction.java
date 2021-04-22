package org.nasdanika.engineering.gen;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.text.StringEscapeUtils;
import org.eclipse.emf.ecore.resource.Resource;
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
public class NamedElementViewAction<T extends NamedElement> extends ModelElementViewAction<T> {
			
	protected NamedElementViewAction(T target, Function<Resource, String> resourcePathResolver) {
		super(target, resourcePathResolver);		
	}
	
	@Override
	public String getText() {
		return StringEscapeUtils.escapeHtml4(target.getName());
	}
	
	@Override
	protected String getDefaultPath() {
		String name = target.getName();
		if (!Util.isBlank(name)) {
			int idx = ((List<?>) target.eContainer().eGet(target.eContainmentFeature())).stream().filter(e -> e instanceof NamedElement && name.equals(((NamedElement) e).getName())).collect(Collectors.toList()).indexOf(target);
			try {
				String digest = Hex.encodeHexString(MessageDigest.getInstance("SHA-256").digest(name.getBytes(StandardCharsets.UTF_8)));
				return idx == 0 ? digest : (digest + "-" + idx);
			} catch (NoSuchAlgorithmException e) {
				throw new ConfigurationException("Cannot encode name: " + 3, e, EObjectAdaptable.adaptTo(target, Marked.class));
			}
		}
		return super.getDefaultPath();
	}
	
}
