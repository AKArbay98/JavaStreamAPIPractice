package builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream.Builder<String> builder = Stream.builder();
		Stream<String> stream = builder.add("Türkiye").add("Istanbul").add("Beyoğlu").add("Gümüşsuyu").build();

		List<String> list = stream.map(String::toLowerCase).collect(Collectors.toList());

		System.out.println(list);

	}

}
