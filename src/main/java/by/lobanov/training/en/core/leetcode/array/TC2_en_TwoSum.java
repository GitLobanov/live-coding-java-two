package by.lobanov.training.en.core.leetcode.array;

import java.util.Arrays;

/**
 * Difficulty: easy
 * <br>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <br>
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <br>
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */
public class TC2_en_TwoSum {

    public static void main(String[] args) {
        int [] arr = Arrays.stream("2,7,11,15".split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i) continue;
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }
}
