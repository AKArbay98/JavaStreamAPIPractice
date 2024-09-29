package collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		ArrayList<String> lakeOfUSA = new ArrayList<>();

		lakeOfUSA.add("Lake Superior");
		lakeOfUSA.add("Lake Huron");
		lakeOfUSA.add("Lake Michigan");
		lakeOfUSA.add("Lake Erie");
		lakeOfUSA.add("Lake Ontario");

		Stream<String> streamOfLakeUSA = lakeOfUSA.stream();

		List<String> upperCaseLakeOfUSA = streamOfLakeUSA.map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(upperCaseLakeOfUSA);

	}

}
