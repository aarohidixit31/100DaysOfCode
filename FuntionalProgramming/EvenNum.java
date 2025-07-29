package solidprinciple;

import java.util.ArrayList;

//From a list of numbers, print only the even numbers.

public class EvenNum {
	public static void main(String[] agrs) {
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(2);
		numList.add(10);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		numList.add(6);

//		for (int num : numList) {
//			if (num % 2 == 0) {
//				System.out.println(num);
//			}
//		}
		numList.stream().filter(i -> i != null).forEach(i -> {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		});
	}
}
