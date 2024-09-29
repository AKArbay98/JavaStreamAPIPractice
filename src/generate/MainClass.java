package generate;

import java.util.Random;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream.generate(new Random()::nextInt).limit(4).forEach(System.out::println);

	}

}
