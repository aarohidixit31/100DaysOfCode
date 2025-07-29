package solidprinciple;

import java.util.ArrayList;

public class Length {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Aarohi");
		names.add("Aadhya");
		names.add("Sadhya");
		names.add("Sahil");
		names.add("Ansh");

		names.stream().filter(i -> i.length() > 5).forEach(i -> System.out.println(i));
	}
}
