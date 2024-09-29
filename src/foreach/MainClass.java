package foreach;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<String> monkeySpecies = Stream.of("Monkey", "Gorilla", "Bonobo");

		monkeySpecies.forEach(System.out::print);

	}

}
