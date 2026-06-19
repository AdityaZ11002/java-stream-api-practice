package Day_4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Find the 3rd highest even number from given list of integers.
 */

public class Driver_1 {
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(11,44,55,77,88,22,54,75,84,25,36,96,75,82,10);
		
		Optional<Integer> result = number.stream().filter(s -> s % 2 == 0).sorted((a,b) -> b-a).skip(2).findFirst();
		
		System.out.println(result.get());
	}

}
