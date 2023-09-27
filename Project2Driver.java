package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Project2Driver {

	public static void main(String[] args) {
		List<Project2> l1 = new ArrayList<Project2>();

		l1.add(new Project2("Arrow", "Shirt", "Black", "42", 2000));
		l1.add(new Project2("LF", "Shirt", "Green", "40", 1500));
		l1.add(new Project2("levis", "Shirt", "Yellow", "38", 500));
		l1.add(new Project2("denim", "Shirt", "red", "42", 1800));
		l1.add(new Project2("adidas", "Shirt", "cyan", "40", 2300));

		l1.add(new Project2("Arrow", "Tshirt", "Black", "42", 2000));
		l1.add(new Project2("LF", "Tshirt", "Green", "42", 1500));
		l1.add(new Project2("levis", "Tshirt", "Yellow", "38", 500));
		l1.add(new Project2("denim", "Tshirt", "red", "42", 1800));
		l1.add(new Project2("adidas", "Tshirt", "cyan", "40", 2300));
		
		
		l1.add(new Project2("Arrow", "jeans", "Black", "42", 2000));
		l1.add(new Project2("LF", "jeans", "Green", "40", 1500));
		l1.add(new Project2("levis", "jeans", "Yellow", "38", 500));
		l1.add(new Project2("wrangler", "jeans", "red", "32", 1800));
		l1.add(new Project2("wrangler", "jeans", "blue", "32", 1800));
		l1.add(new Project2("wrangler", "jeans", "red", "32", 1800));
		l1.add(new Project2("wrangler", "jeans", "red", "42", 1800));
		l1.add(new Project2("adidas", "jeans", "cyan", "40", 2300));
		
		System.out.println("====access all the clothes\n");
		for(Project2 x:l1)
		{
			System.out.println(x);
		}
		System.out.println("====access all the shirts with price>=1800======\n");
		for(Project2 x:l1)
		{
			if(x.getPrice()>=1800 && x.toString().contains("Shirt"))
			{
				System.out.println(x);
			}
		}
		System.out.println("====access all the tshirt of green color and size 42======\n");
		for(Project2 x:l1)
		{
			if( x.toString().contains("Tshirt")&&x.toString().contains("Green")&&x.toString().contains("42"))
			{
				System.out.println(x);
			}
		}
		
		System.out.println("====access all the jeans with brandname wrangler size 32 color blue and price <=3000======\n");
		for(Project2 x:l1)
		{
			if(x.getPrice()<=3000&& x.toString().contains("jeans")&&x.toString().contains("blue")&&x.toString().contains("32"))
			{
				System.out.println(x);
			}
		}
		System.out.println("====sorting on the basis of brandname\n");
		
		Collections.sort(l1, new BrandNameComparator());
		for(Project2 x:l1 )
		{
			System.out.println(x);
		}
		System.out.println("====sorting on the basis of clothname\n");
		
		Collections.sort(l1, new ClothnameComparator());
		for(Project2 x:l1 )
		{
			System.out.println(x);
		}
		System.out.println("====sorting on the basis of color\n");
		
		Collections.sort(l1, new ColorComparator());
		for(Project2 x:l1 )
		{
			System.out.println(x);
		}
		System.out.println("====sorting on the basis of price\n");
		
		Collections.sort(l1, new PriceComparator());
		for(Project2 x:l1 )
		{
			System.out.println(x);
		}
		System.out.println("====sorting on the basis of price\n");
		
		Collections.sort(l1, new SizeComparator());
		for(Project2 x:l1 )
		{
			System.out.println(x);
		}
		
		
		
		
	}

}
