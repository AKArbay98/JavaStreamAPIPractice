package reduce;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		// 2 tane daha var reduce

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		int sum = numbers.stream().reduce(0, (accumulator, element) -> accumulator + element);

		System.out.println("Sum: " + sum);

	}

}
