package anymatch;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MainClass {

	public static void main(String[] args) {

		ArrayList<String> footballTeams = new ArrayList<String>();
		footballTeams.add("St.Pauli");
		footballTeams.add("FC Barcelona");
		footballTeams.add("Celtic");
		footballTeams.add("1860 Munich");
		footballTeams.add("1-Dnipro");
		footballTeams.add("1461 Trabzonspor");

		Predicate<String> predicateOne = x -> Character.isLetter(x.charAt(0));

		Predicate<String> predicateTwo = value -> value.startsWith("SK");

		boolean anyMatch = footballTeams.stream().anyMatch(predicateOne);
		System.out.println(anyMatch);

		boolean anyMatch2 = footballTeams.stream().anyMatch(predicateTwo);
		System.out.println(anyMatch2);
	}

}
