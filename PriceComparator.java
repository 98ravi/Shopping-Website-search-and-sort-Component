package Set;

import java.util.Comparator;

public class PriceComparator implements Comparator<Project2> {

	@Override
	public int compare(Project2 o1, Project2 o2) {
	
		return (int)(o1.price-o2.price);
	}

}
