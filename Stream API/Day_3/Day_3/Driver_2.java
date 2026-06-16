package Day_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver_2 {

	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(900, 15000, 12000, 13000, 10000, 13000);
		
		
		// the 2nd Lowest salary
		
		Optional<Integer> highest = input.stream().distinct().sorted((a,b) -> a-b).skip(1).findFirst();
		System.out.println(highest.get());
		
		
		// the 2nd Highest salary
		
		Optional<Integer> lowest = input.stream().distinct().sorted((a,b) -> b-a).skip(1).findFirst();
		System.out.println(lowest.get());
		
		
		

	}

}
