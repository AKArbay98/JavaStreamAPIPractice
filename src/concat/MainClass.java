package concat;

import java.util.List;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Stream<String> country = Stream.of("Türkiye");
		List<String> listCountry = country.toList();
		System.out.println("List Country: " + listCountry);

		Stream<String> city = Stream.of("Istanbul");
		List<String> listCity = city.toList();
		System.out.println("List City: " + listCity);

		Stream<String> district = Stream.of("Şişli");
		List<String> listDistrict = district.toList();
		System.out.println("List District: " + listDistrict);

		Stream<String> neighbourhood = Stream.of("Bomonti");
		List<String> listNeighbourhood = neighbourhood.toList();
		System.out.println("List Neighbourhood: " + listNeighbourhood);

		List<String> listConcatCountryAndCity = Stream.concat(listCountry.stream(), listCity.stream()).toList();
		System.out.println("List Country and City: " + listConcatCountryAndCity);

		List<String> listConcatCountryCityAndDistrict = Stream
				.concat(Stream.concat(listCountry.stream(), listCity.stream()), listDistrict.stream()).toList();
		System.out.println("List Country, City and District: " + listConcatCountryCityAndDistrict);

		List<String> listAll = Stream
				.concat(Stream.concat(Stream.concat(listCountry.stream(), listCity.stream()), listDistrict.stream()),
						listNeighbourhood.stream())
				.toList();
		System.out.println("List All: " + listAll);

	}

}
