package solidprinciple;

import java.util.ArrayList;

//Print only the numbers greater than 10 from a given list of integers.

public class GreaterThanTen {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(21);
		numList.add(10);
		numList.add(32);
		numList.add(4);
		numList.add(51);
		numList.add(16);

		numList.stream().filter(i -> i > 10).forEach(i -> System.out.println(i));
	}
}
