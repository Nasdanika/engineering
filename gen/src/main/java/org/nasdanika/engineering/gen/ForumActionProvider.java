package org.nasdanika.engineering.gen;

import org.nasdanika.common.Context;
import org.nasdanika.engineering.Forum;

public class ForumActionProvider<T extends Forum> extends NamedElementActionProvider<T> {
	
	public ForumActionProvider(T target, Context context) {
		super(target, context);		
	}
	
}
