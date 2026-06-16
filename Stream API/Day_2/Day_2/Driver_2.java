package Day_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * flatmap is used to convert 2d array into 1d array
 * forEach is used to print 
 */

public class Driver_2
{
    public static void main(String[] args)
    {
        // Find the city names which starts with B and city name length is more then 6

        List<List<String>> input = Arrays.asList(
                Arrays.asList("Bangalore", "Chennai"),
                Arrays.asList("Hyderabad", "Ahmedabad", "Delhi"),
                Arrays.asList("Banaras"));

        System.out.println(" 2d " + input);

        List<String> flattenList = input.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

        System.out.println("1d " + flattenList);
        
        flattenList.stream().filter(w -> w.startsWith("B") && w.length() > 5).forEach(word -> System.out.println(word));
        
        
    }
}
