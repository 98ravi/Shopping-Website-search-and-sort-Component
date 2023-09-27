package Set;

import java.util.Comparator;

public class ColorComparator implements Comparator<Project2> {

	@Override
	public int compare(Project2 q1, Project2 q2) {
		
		return q1.color.compareToIgnoreCase(q2.color);
	}

}
