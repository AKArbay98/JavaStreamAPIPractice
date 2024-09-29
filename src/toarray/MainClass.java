package toarray;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int[] array = stream.mapToInt(x -> x).toArray();
		for (int i : array) {
			System.out.println(i);
		}

	}

}
