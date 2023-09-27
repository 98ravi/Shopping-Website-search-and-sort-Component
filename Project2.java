package Set;

public class Project2 {
	String brandname;
	String clothname;
	String color;
	String size;
	double price;

	Project2() {

	}

	Project2(String brandname,String clothname, String color, String size, double price) {

		this.brandname = brandname;
		this.clothname = clothname;
		this.color = color;
		this.size = size;
		this.price = price;
	}

	public String toString() {
		return "  Brandname is: " + brandname +"Clothname is: "+clothname+ " Color: " + color + "Size is: " + size + " Price is :" + price;
	}

	public double getPrice() {
		return this.price;
	}

}
