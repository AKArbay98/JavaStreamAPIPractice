package sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		List<String> redFruits = Arrays.asList("red apple", "cherry", "cranberries", "red grapefruit", "pomegranate",
				"raspberry", "watermelon");

		Stream<String> streamRedFruits = redFruits.stream();

		List<String> collectRedFruits = streamRedFruits.sorted().collect(Collectors.toList());

		System.out.println(collectRedFruits);

		Stream<Double> moisturePercent = Stream.of(47.0, 47.9, 54.0, 41.0, 50.0, 55.0, 57.0, 34.0, 43.0);
		List<Double> collectMoisturePercent = moisturePercent.sorted().collect(Collectors.toList());
		System.out.println(collectMoisturePercent);

		List<String> words = Arrays.asList("banana", "apple", "cherry", "date");
		Stream<String> sortedStream = words.stream().sorted(Comparator.comparing(String::length).reversed());
		sortedStream.forEach(System.out::println);

	}

}
