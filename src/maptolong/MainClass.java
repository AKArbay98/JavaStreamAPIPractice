package maptolong;

import java.util.function.ToLongFunction;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<Long> birthDate = Stream.of(11L, 3L, 1998L);

		ToLongFunction<Long> multiplyByFour = e -> e * 4;

		birthDate.mapToLong(multiplyByFour).forEach(System.out::println);

	}

}
