package count;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<String> speciesOfMushroom = Stream.of("Portobello", "Enoki", "Oyster", "Maitake", "Hedgehog", "Crimini");
		long countOfSpeciesOfMushroom = speciesOfMushroom.count();
		System.out.println(countOfSpeciesOfMushroom);

	}

}
