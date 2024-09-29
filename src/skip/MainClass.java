package skip;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<Integer> sequence = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> collectSequence = sequence.skip(5).collect(Collectors.toList());
		System.out.println(collectSequence);

	}

}
