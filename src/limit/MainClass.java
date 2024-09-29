package limit;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.limit(3).forEach(System.out::print);

	}

}
