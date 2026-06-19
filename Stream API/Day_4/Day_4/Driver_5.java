package Day_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver_5 {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Bangalore", "Delhi", "Pune", "Chennai", "Hyderabad");
		List<String> list2 = Arrays.asList("Delhi", "Noida", "Mysore", "Delhi");
		
		
		// Combine the both list
		
		Stream.concat(list1.stream(), list2.stream()).distinct().forEach(s -> System.out.println(s));
		
		List<String> res = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
		System.out.println(res);
		
		
		//find the max lenght string from the list
		
		Optional<String> opt = Stream.concat(list1.stream(), list2.stream()).max(Comparator.comparingInt(v -> v.length()));
		System.out.println(opt.get());
		
		

	}

}
