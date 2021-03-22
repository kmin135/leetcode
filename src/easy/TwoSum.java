package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum
 *
 * 2 <= nums.length <= 10^3
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for(int i=0,size=nums.length;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        // something wrong!
        return null;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        System.out.println(Arrays.equals(new int[]{0,1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.equals(new int[]{1,2}, solution.twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.equals(new int[]{0,1}, solution.twoSum(new int[]{3,3}, 6)));
    }
}
