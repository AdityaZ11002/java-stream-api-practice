package Day_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver_5 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Aman", "Rahul", "Akash", "Rohit", "Ankit");

        List<String> result = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

        System.out.println(result);
    }
}
