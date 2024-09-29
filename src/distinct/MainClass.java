package distinct;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<String> birds = Stream.of("duck", "duck", "duck", "chicken", "goose", "chicken", "penguin");
		Stream<String> distinctBirds = birds.distinct();
		distinctBirds.forEach(System.out::print);

	}

}
