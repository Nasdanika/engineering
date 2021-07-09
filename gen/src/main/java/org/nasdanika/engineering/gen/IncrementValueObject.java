package org.nasdanika.engineering.gen;

import java.util.Objects;

import org.nasdanika.engineering.Endeavor;
import org.nasdanika.engineering.Increment;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Release;
import org.nasdanika.engineering.Temporal;

public class IncrementValueObject implements Comparable<IncrementValueObject> {
	
	private Temporal start;
	private Temporal end;
	private String name;
	
	public IncrementValueObject(Increment increment) {
		if (increment != null) {
			start = increment.getStart();
			end = increment.getEnd();
			name = increment.getName();
		}
	}
	
	public IncrementValueObject(Issue issue) {
		this(issue.getIncrement());
	}
	
	public IncrementValueObject(Release release) {
		this(release.getIncrement());
	}

	public Temporal getStart() {
		return start;
	}

	public Temporal getEnd() {
		return end;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((end == null) ? 0 : end.toString().hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((start == null) ? 0 : start.toString().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IncrementValueObject other = (IncrementValueObject) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.coincides(other.end))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.coincides(other.start))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(IncrementValueObject o) {
		if (o == this) {
			return 0;
		}
		
		if (o == null) {
			return -1;
		}

		Temporal oEnd = o.getEnd();
		if (end != oEnd && !(end != null && end.coincides(oEnd))) {
			if (end == null) {
				return 1;
			}
			if (oEnd == null) {
				return -1;
			}
			if (end.before(oEnd)) {
				return -1;
			}
			if (end.after(oEnd)) {
				return 1;
			}
		}
		
		Temporal oStart = o.getStart();
		if (start != oStart && !(start != null && start.coincides(oStart))) {
			if (start == null) {
				return 1;
			}
			if (oStart == null) {
				return -1;
			}
			if (start.before(oStart)) {
				return -1;
			}
			if (start.after(oStart)) {
				return 1;
			}
		}
		
		String oName = o.getName();
		if (Objects.equals(oName, name)) {
			return 0;
		}
		
		if (name == null) {
			return 1;
		}
		
		if (oName == null) {
			return -1;
		}

		return name.compareTo(oName);
	}	
	
	public static IncrementValueObject from(Endeavor endeavor) {
		if (endeavor instanceof Increment) {
			return new IncrementValueObject((Increment) endeavor);
		}
		if (endeavor instanceof Issue) {
			return new IncrementValueObject((Issue) endeavor);
		}
		if (endeavor instanceof Release) {
			return new IncrementValueObject((Release) endeavor);
		}
		return null;
	}

}
