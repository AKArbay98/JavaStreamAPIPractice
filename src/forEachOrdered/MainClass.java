package forEachOrdered;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		List<String> electronicComponents = Arrays.asList("resistors", "capacitors", "diodes", "transistor");
		Stream<String> electronicComponentStreams = electronicComponents.stream();
		electronicComponentStreams.forEachOrdered(System.out::println);

	}

}
