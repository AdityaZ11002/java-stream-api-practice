package Day_1;

import java.util.ArrayList;
import java.util.Iterator;

// this type processing happen tell 'JAVA 7'

public class Driver1 {
	public static void main(String[] args) {

		ArrayList<String> products = new ArrayList<String>();
		// Storing the products
		products.add("apple");
		products.add("samsung");
		products.add("lg");
		products.add("sony");

		// now we need to process the products --> find the products which are starting
		// with 's'
		Iterator<String> itr = products.iterator();
		while (itr.hasNext()) {
			String product = (String) itr.next();
			// logic
			if (product.startsWith("s")) {
				System.out.println("products: " + product);
			}
		}

	}

}
