package Day_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver_1 {
	public static void main(String[] args) {
		// Find the city names which starts with B and city name length is more than 6

		List<String> input = Arrays.asList("Bangalore", "Chennai", "Hyderabad", "Ahmedabad", "Delhi", "Mysore");

		List<String> output = input.stream().filter(w -> w.startsWith("B") && w.length() > 5).map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(output);
	}
}
