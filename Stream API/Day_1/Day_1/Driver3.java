package Day_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver3 {
	public static void main(String[] args) {
		List<String> brand = Arrays.asList("samsung", "lg", "sony", "bosch", "apple", "nokia", "micromax", "realme"); // Collection

		List<String> processedBrands = brand.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());

		List<String> processedBrandsStartWithS = brand.stream().filter(b -> b.startsWith("s")).collect(Collectors.toList());

		// Task : from a given list can you find the brand starting with 's' and convert those to upper case
		List<String> processedBrandsResult = brand.stream().filter(b -> b.startsWith("s")).map(word -> word.toUpperCase()).collect(Collectors.toList());

		System.out.println("processed : " + processedBrands);

		System.out.println("processed : " + processedBrandsStartWithS);
		
		System.out.println("processed : " + processedBrandsResult);
		
		
		List<Integer> list = Arrays.asList(2, 4, 5, 63, 2, 24, 6, 778, 4, 4356, 7, 6, 5); // collection
		// Multiply list number with 10 and filter >100
		List<Integer> output = list.stream().map(n -> n * 10).filter(n -> n>100).collect(Collectors.toList());
		
		System.out.println(output);
	}
}
