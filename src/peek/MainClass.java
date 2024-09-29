package peek;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<Integer> homeID = Stream.of(94, 435, 336, 115, 41, 360, 257, 59, 466);

		List<Integer> filteredHomeIDs = homeID.peek(n -> System.out.println("Before filtering: " + n))
				.filter(n -> (n % 2 == 0) && (n % 3 == 0)).collect(Collectors.toList());

		System.out.println("Filtered id's : " + filteredHomeIDs);

	}

}
