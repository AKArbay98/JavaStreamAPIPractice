package empty;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<Integer> emptyStream = Stream.empty();

		emptyStream.forEach(System.out::print);

	}

}
