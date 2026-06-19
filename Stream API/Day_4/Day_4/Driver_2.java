package Day_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver_2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		// Sum of Number
		
		Integer sum = list.stream().reduce(0, (a,b) -> a+b);		
		System.out.println("Sum of number: " + sum);
		
		
		// Sum of odd Number
		
		Integer sumOddNumber = list.stream().filter(n -> n % 2 != 0).reduce(0, (a,b) -> a+b);	
		System.out.println("Sum of odd Number: " + sumOddNumber);
		
		
		// Find the minimum
		
		Optional<Integer> min = list.stream().min((a,b) -> a-b);
		System.out.println(min.get());
		
		
		// Find the max
		
		Optional<Integer> max = list.stream().max((a,b) -> a-b);
		System.out.println(max.get());
	

	}

}
