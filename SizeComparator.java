package Set;

import java.util.Comparator;

public class SizeComparator implements Comparator<Project2> {

	@Override
	public int compare(Project2 o1, Project2 o2) {
		
		return o1.size.compareTo(o2.size);
	}

}
