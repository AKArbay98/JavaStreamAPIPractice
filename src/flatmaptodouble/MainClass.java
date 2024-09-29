package flatmaptodouble;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<double[]> arraysStream = Stream.of(new double[] { 4.1, 2.7 }, new double[] { 3.2, 4.9 });

		DoubleStream doubleStream = arraysStream.flatMapToDouble(DoubleStream::of);

		double sum = doubleStream.sum();
		System.out.println("Sum of all double values: " + sum);

	}

}
