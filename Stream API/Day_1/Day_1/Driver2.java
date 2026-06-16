package Day_1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * => "stream()" is used to convert a Collection (List, Set, etc.) into a Stream for processing data using Stream API operations like filter(), map(), sorted(), and collect().
 * => "map()" is used to transform/convert each element of the stream into another form.
 * => (w -> w.toLowerCase()) (This is a Lambda Expression.) --> 'w' = each element coming from the stream.
 *                                                              '->' = "goes to" or "do this operation".
 *                                                              'w.toLowerCase()' = convert that element to uppercase.
 * => Common Stream methods := map() -> Transforms each element.
 *                            filter() -> Filters elements based on a condition.
 *                            sorted() -> Sorts elements.
 *                            distinct() -> Removes duplicates.
 *                            limit() -> Takes the first n elements.
 *                            skip() -> Skips the first n elements.
 *                            forEach() -> Performs an action on each element.
 *                            collect() -> Converts a stream back to a collection.
 *                            count() -> Counts elements.
 *                            findFirst() -> Returns the first element.
 *                            anyMatch() -> Checks if any element matches a condition. (stream.anyMatch(s -> s.startsWith("H"));).
 *                            allMatch() -> Checks if all elements match a condition. (stream.allMatch(s -> s.length() > 2);).
 *                            noneMatch() -> Checks if no element matches a condition. (stream.noneMatch(s -> s.isEmpty());).
 * => Intermediate Operations --> These operations prepare or modify data but do not produce a final result. Examples: map(),filter(),sorted(),distinct(),limit(),skip().     " stream.filter(...).map(...); "  
 * => Terminal Operations --> These operations produce the final result and trigger the stream processing.   Examples: forEach(),collect(),count(),findFirst(),reduce(),anyMatch(),allMatch().     " stream.filter(...).map(...).collect(Collectors.toList()); ". 
 * => s -> s.toUpperCase() (lambda expression) ==  String::toUpperCase (method reference).  when to used ->Use method reference when no extra argument is required. AND ->Use lambda expression when you need to pass custom values like "R", "A", etc.
 * => .forEach(x -> System.out.println(x)) == .forEach(System.out::println)         
 */


public class Driver2 {
	public static void main(String[] args) {

		List<String> brand = Arrays.asList("samsung", "lg", "sony", "apple", "nokia", "micromax", "realme"); // Collection

		System.out.println("Brand: " + brand);

		// process the collection - Task --> convert all the brand to upper case

		// 1 - convert the collection(list) to stream object
		Stream<String> stream = brand.stream();

		// 2 - Apply proessing logic (intermediate and terminal)
		Stream<String> upperCaseStream = stream.map(word -> word.toUpperCase());

		// 3. collect the result / terminal the stream
		List<String> processBrand = upperCaseStream.collect(Collectors.toList());
		System.out.println("Processed: " + processBrand);

	}

}
