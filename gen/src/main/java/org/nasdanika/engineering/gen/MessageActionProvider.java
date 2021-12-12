package org.nasdanika.engineering.gen;

import java.util.List;

import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Message;

public class MessageActionProvider<T extends Message> extends NamedElementActionProvider<T> {
	
	public MessageActionProvider(T target, Context context) {
		super(target, context);		
	}
	
	@Override
	protected List<ETypedElement> getProperties() {
		List<ETypedElement> properties = super.getProperties();
		properties.add(EngineeringPackage.Literals.MESSAGE__AUTHOR);
		properties.add(EngineeringPackage.Literals.MESSAGE__DATE);
		return properties;
	}
	
}
