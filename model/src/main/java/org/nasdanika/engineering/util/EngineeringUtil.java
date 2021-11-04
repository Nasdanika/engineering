package org.nasdanika.engineering.util;

import java.time.Duration;

import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.persistence.LoadTracker;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.Temporal;

public final class EngineeringUtil {

	private EngineeringUtil() {
		// Utility class
	}
	
	/**
	 * Computes end and duration from start and previously loaded things.
	 * @param period
	 * @param newStart
	 */
	public static void onStart(Period period, Temporal newStart) {
		if (newStart != null) {
			LoadTracker loadTracker = EObjectAdaptable.adaptTo(period, LoadTracker.class);
			if (loadTracker != null && loadTracker.isLoading(NcorePackage.Literals.PERIOD__START)) {
				if (loadTracker.isLoaded(NcorePackage.Literals.PERIOD__END)) {
					if (!loadTracker.isLoaded(NcorePackage.Literals.PERIOD__DURATION)) {
						period.setDuration(period.getEnd().minus(newStart));
					}
				} else if (loadTracker.isLoaded(NcorePackage.Literals.PERIOD__DURATION)) {
					period.setEnd(newStart.plus(period.getDuration()));
				}
			}
		}
	}
	
	public static void onEnd(Period period, Temporal newEnd) {
		if (newEnd != null) {
			LoadTracker loadTracker = EObjectAdaptable.adaptTo(period, LoadTracker.class);
			if (loadTracker != null && loadTracker.isLoading(NcorePackage.Literals.PERIOD__END)) {
				if (loadTracker.isLoaded(NcorePackage.Literals.PERIOD__START)) {
					if (!loadTracker.isLoaded(NcorePackage.Literals.PERIOD__DURATION)) {
						period.setDuration(newEnd.minus(period.getStart()));
					}
				} else if (loadTracker.isLoaded(NcorePackage.Literals.PERIOD__DURATION)) {
					period.setStart(newEnd.minus(period.getDuration()));
				}
			}
		}
	}
	
	public static void onDuration(Period period, Duration newDuration) {
		if (newDuration != null) {
			LoadTracker loadTracker = EObjectAdaptable.adaptTo(period, LoadTracker.class);
			if (loadTracker != null && loadTracker.isLoading(NcorePackage.Literals.PERIOD__DURATION)) {
				if (loadTracker.isLoaded(NcorePackage.Literals.PERIOD__START)) {
					if (!loadTracker.isLoaded(NcorePackage.Literals.PERIOD__END)) {
						period.setEnd(period.getStart().plus(newDuration));
					}
				} else if (loadTracker.isLoaded(NcorePackage.Literals.PERIOD__END)) {
					period.setStart(period.getEnd().minus(newDuration));
				}
			}
		}
	}

}
