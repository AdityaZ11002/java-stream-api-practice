package Day_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver_10 {

    public static void main(String[] args) {

        List<List<String>> input = Arrays.asList(
                Arrays.asList("A","B"),
                Arrays.asList("C","D"),
                Arrays.asList("E","F"));

        List<String> output = input.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

        System.out.println(output);
    }
}
