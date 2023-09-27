package Set;

import java.util.Comparator;

public class BrandNameComparator implements Comparator<Project2> {
	@Override
	public int compare(Project2 b1,Project2 b2)
	{
		return b1.brandname.compareTo(b2.brandname);
	}


}
