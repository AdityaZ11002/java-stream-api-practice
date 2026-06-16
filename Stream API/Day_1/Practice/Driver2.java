package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(10,50,80,70,140,90,10,30,110,60,80,40,130,100,150,120,20);
		
		List<Integer> result = number.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(result);
	}

}
