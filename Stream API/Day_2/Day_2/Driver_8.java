package Day_2;

import java.util.Arrays;
import java.util.List;

public class Driver_8 {

    public static void main(String[] args) {

        List<String> names =Arrays.asList("Rahul","Aman","Rohit","Akash");

        names.stream().sorted().forEach(System.out::println);
    }
}
