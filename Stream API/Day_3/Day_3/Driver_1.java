package Day_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
* => "stream()" is used to convert a Collection (List, Set, etc.) into a Stream for processing data using Stream API operations like filter(), map(), sorted(), and collect().
* => "map()" is used to transform/convert each element of the stream into another form.
* => (w -> w.toLowerCase()) (This is a Lambda Expression.) --> 'w' = each element coming from the stream.
*                                                              '->' = "goes to" or "do this operation".
*                                                              'w.toLowerCase()' = convert that element to uppercase.
* => Common Stream methods := Intermidiate Methos :-
*                            map() -> Transforms each element.
*                            filter() -> Filters elements based on a condition.
*                            sorted() -> Sorts elements.
*                            distinct() -> Removes duplicates.
*                            limit() -> Takes the first n elements.
*                            skip() -> Skips the first n elements.
*                            Terminal Method :-
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

public class Driver_1 {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(10, 50, 80, 70, 140, 90, 10, 30, 110, 60, 80, 40, 130, 100, 150, 120, 20);
		
		// removing dublicate as well as sorting

		List<Integer> result = num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(result);
		
		
		
		// "Sorting" from higher to lower
		num.stream().sorted((a,b) -> b-a).forEach(number -> System.out.print(number + " "));

		
		System.out.println();
		
		
		// Skip 2 element
		num.stream().skip(2).forEach(number -> System.out.print(number + " "));
		
		
		System.out.println();
		
		
		//Print first element
		 Optional<Integer> firstElement = num.stream().findFirst();
		System.out.println(firstElement.get());
		
		
		
	}

}
