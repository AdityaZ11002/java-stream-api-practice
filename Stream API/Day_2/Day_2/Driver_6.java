package Day_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver_6 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "aman", "rahul", "rohit");

        List<String> result = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(result);
    }
}