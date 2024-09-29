package of;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<String> greenEnergy = Stream.of("Wind", "Hydoelectric", "Solar");
		List<String> collectGreenEnergy = greenEnergy.collect(Collectors.toList());
		System.out.println(collectGreenEnergy);

		Stream<Double> windSpeed = Stream.of(5.31133604049682, 5.67216682434082, 5.21603679656982, 5.65967416763305,
				5.57794094085693, 5.60405206680297, 5.79300785064697);
		windSpeed.forEach(System.out::println);

	}

}
