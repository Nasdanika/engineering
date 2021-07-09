package org.nasdanika.engineering.gen;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.flow.Journey;
import org.nasdanika.engineering.gen.flow.JourneyElementViewAction;

/**
 * An interface to adapt to for journey elements
 * @author Pavel
 *
 */
public interface JourneyElementViewActionProvider<T extends JourneyElementViewAction<?>> extends Function<EList<Journey>, T> {

}
