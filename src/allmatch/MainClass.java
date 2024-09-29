package allmatch;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<String> extinctAnimals = Stream.of("Golden toad", "Dodo", "Quagga", "Dire wolf", "Baiji");
		boolean allMatch = extinctAnimals.allMatch((value) -> value.contains("o"));
		System.out.println(allMatch);

	}

}
