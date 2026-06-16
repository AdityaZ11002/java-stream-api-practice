package Day_2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver_7 {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Delhi", "Bangalore", "Pune");

        List<Integer> result = cities.stream().map(city -> city.length()).collect(Collectors.toList());

        System.out.println(result);
    }
}
