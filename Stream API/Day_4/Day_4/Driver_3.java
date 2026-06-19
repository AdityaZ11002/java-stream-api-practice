package Day_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Bangalore", "Pune", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");
		
		// group the cities by the length
		
		Map<Object, List<String>> res = list.stream().collect(Collectors.groupingBy(g -> g.length()));
		System.out.println(res);
		
		
		// group the cities by the length and whose length is more than 6
		
		Map<Object, List<String>> ress = list.stream().filter(w -> w.length()>6).collect(Collectors.groupingBy(g -> g.length()));
		System.out.println(ress);
		
		
		// count the cities whose length is more than 6
		
		Long resss = list.stream().filter(w -> w.length()>6).collect(Collectors.counting());
		System.out.println(resss);
		
		
		// seperate/partition the cities whose length is more than 6
		
		Map<Boolean, List<String>> output = list.stream().collect(Collectors.partitioningBy(p -> p.length()>6));
		System.out.println(output);
		

	}

}
