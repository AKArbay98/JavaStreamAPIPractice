package maptoint;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class MainClass {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(10, 12, 14, 16);

		ToIntFunction<Integer> multiplyByThree = e -> e * 3;

		integerList.stream().mapToInt(multiplyByThree).forEach(System.out::println);

	}

}
