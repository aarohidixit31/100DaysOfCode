
import java.util.Arrays;
import java.util.Map;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
    System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{1,2,3,4,4,5,5,6,6},12)));
    }

    // public static int[] twoSum(int[] nums, int target) {
    // int[] ans = new int[2];
    // for (int i = 0; i <nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // ans[0] = i;
    // ans[1] = j;
    // break;
    // }
    // }
    // }
    // return ans;
    // }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
