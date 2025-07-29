package solidprinciple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, print the square of each number.

public class Square {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);

		// Normal Approach
//		for (int num : nums) {
//			int numSq = num * num;
//			System.out.println(numSq);
//		}

		// Functional Programming
		List<Integer> num1 = nums.stream().map(num -> (num * num)).collect(Collectors.toList());
		System.out.println(num1);

	}
}
