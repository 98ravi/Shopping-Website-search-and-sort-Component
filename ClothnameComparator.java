package Set;

import java.util.Comparator;

public class ClothnameComparator implements Comparator<Project2> {

	@Override
	public int compare(Project2 c1, Project2 c2) {
		
		return c1.clothname.compareTo(c2.clothname);
	}

}
