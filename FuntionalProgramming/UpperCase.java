package solidprinciple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add(null);
		fruits.add("Banana");
		fruits.add("Strawberry");

//		ArrayList<String> upperFruits = new ArrayList<String>();
//		for (String name : fruits) {
//			if (name != null) {
//				String fruit = name.toUpperCase();
//				upperFruits.add(fruit);
//				String fruit1;
//			}
//		}
//		System.out.println(upperFruits);

		List<String> upperFruits1 = fruits.stream().filter(name -> name != null).map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(upperFruits1);

	}

}