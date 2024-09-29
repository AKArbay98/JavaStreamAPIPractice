package flatmaptolong;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class MainClass {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "2", "3", "4", "5");

		list.stream().flatMapToLong(num -> LongStream.of(Long.parseLong(num))).forEach(System.out::println);

	}

}
