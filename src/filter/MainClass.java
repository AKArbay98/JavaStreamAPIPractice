package filter;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<Integer> streamOne = Stream.of(73, 70, 91, 53, 16, 38, 25, 27, 59, 100);
		Stream<Integer> streamTwo = Stream.of(31, 22, 33, 17, 41, 14, 74, 18, 45, 90);

		streamOne.filter(n -> n % 2 == 0).forEach(System.out::println);
		streamTwo.filter(n -> n > 50).forEach(System.out::println);

		Stream<String> networkProtocols = Stream.of("ARP", "BGP", "DNS", "HTTP", "UDP");
		networkProtocols.filter(np -> np.contains("D")).forEach(System.out::print);
		;

	}

}
