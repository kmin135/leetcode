package easy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {
    // nums is sorted array
    public int removeDuplicates(int[] nums) {
        int newIdx = 0;
        for(int i=0,lastIdx=nums.length - 1;i<nums.length;i++) {
            if(i == lastIdx || nums[i] != nums[i+1]) {
                nums[newIdx++] = nums[i];
            }
        }
        return newIdx;
    }
}
