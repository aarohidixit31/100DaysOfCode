package solidprinciple;

import java.util.ArrayList;
import java.util.Objects;

public class FilterNull {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(null);
		nums.stream().filter(Objects::nonNull).forEach(i -> System.out.println(i));
	}
}
