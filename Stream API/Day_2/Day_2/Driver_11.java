package Day_2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver_11 {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Delhi","Mumbai","Mysore","Pune");

        Optional<String> city = cities.stream().filter(c -> c.startsWith("M")).findFirst();

        System.out.println(city.get());
    }
}
