package easy;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cur = 0;
        for(int i=0,len=nums.length;i<len;i++) {
            if(nums[i] == 1) {
                cur++;
            } else {
                cur = 0;
            }

            if(cur > max) {
                max = cur;
            }
        }
        return max;
    }
}
