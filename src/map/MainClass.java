package map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<String> currentOfWorld = Stream.of("Gulfstream", "Benguela", "Humbolt", "Labrador");

		List<String> collectOfCurrent = currentOfWorld.map(str -> str.toUpperCase()).collect(Collectors.toList());

		System.out.println(collectOfCurrent);

		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

		numbers.map(n -> n * n).forEach(System.out::println);

	}

}
