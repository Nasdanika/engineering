package org.nasdanika.engineering.gen;

import org.nasdanika.engineering.Message;

/**
 * @author Pavel
 *
 */
public class MessageViewAction<T extends Message> extends NamedElementViewAction<T> {
			
	public MessageViewAction(T target, EngineeringViewActionAdapterFactory factory) {
		super(target, factory);		
	}	
	
}
