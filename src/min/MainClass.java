package min;

import java.util.Optional;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<Integer> randomNumbers = Stream.of(42, 14, 59, 88, 57, 80, 37, 35, 91, 10);
		Optional<Integer> min = randomNumbers.min(Integer::compare);
		System.out.println(min);

	}

}