package flatmaptoint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MainClass {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "2", "3", "4", "5");

		list.stream().flatMapToInt(num -> IntStream.of(Integer.parseInt(num))).forEach(System.out::println);

	}

}
