package nonematch;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<String> radioactiveElements = Stream.of("uranium", "radium", "radon", "polonium");
		boolean noneMatch = radioactiveElements.noneMatch(r -> r.startsWith("r"));
		System.out.println(noneMatch);

	}

}
