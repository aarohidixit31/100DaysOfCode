package solidprinciple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of names, print only the names that start with the letter "S".

public class StartLetter {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Aarohi");
		names.add("Aadhya");
		names.add("Sadhya");
		names.add("Sahil");
		// Normal Approach
//		for (String name : names) {
//			if (!names.isEmpty() && name.charAt(0) == 'S')
//				System.out.println(name);
//		}

		// Functional Programming
		List<String> name1 = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
		System.out.println(name1);
	}
}
