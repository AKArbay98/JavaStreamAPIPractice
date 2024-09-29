package maptodouble;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class MainClass {

	public static void main(String[] args) {

		List<Double> lvActivePower = Arrays.asList(380.047790527343, 453.76919555664, 306.376586914062,
				419.645904541015, 380.650695800781, 402.391998291015);

		ToDoubleFunction<Double> multiplyByTwo = e -> e * 2;

		lvActivePower.stream().mapToDouble(multiplyByTwo).forEach(System.out::println);

	}

}
