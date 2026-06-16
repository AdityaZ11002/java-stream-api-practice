package Day_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Driver_4 {

	public static void main(String[] args) {

		List<List<String>> input = Arrays.asList(
				Arrays.asList("Agra", "Bengaluru", "Chennai", "Delhi", "Faridabad", "Ernakulam"),
				Arrays.asList("Chennai", "Faridabad", "Guwahati", "Hyderabad", "Indore", "Jaipur", "Kolkata"));

		HashSet<String> set = new HashSet<String>();

		List<String> output = input.stream().flatMap(i -> i.stream()).filter(element -> !set.add(element)).collect(Collectors.toList());

		System.out.println(output);
	}
}
