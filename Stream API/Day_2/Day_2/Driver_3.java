package Day_2;



import java.util.Arrays;
import java.util.List;

public class Driver_3 {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2, 4, 5, 69, 120, 75, 42, 12, 89, 90, 23, 3);

        num.stream().filter(i -> i % 2 == 0).map(i -> i * 10).forEach(i -> System.out.println(i));
    }
}
