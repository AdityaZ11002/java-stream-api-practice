package Day_2;

import java.util.Arrays;
import java.util.List;

public class Driver_9 {

    public static void main(String[] args) {

        List<Integer> nums =Arrays.asList(1,2,3,2,4,3,5);

        nums.stream().distinct().forEach(System.out::println);
    }
}
