package easy;

/**
 * https://leetcode.com/problems/valid-mountain-array
 * O(n)
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;

        boolean increaseFlag = false;
        boolean decreaseFlag = false;

        for(int i=1;i<arr.length;i++) {
            if(arr[i-1] < arr[i]) {
                // false if increase after decrease
                if(decreaseFlag) return false;
                increaseFlag = true;
            } else if(arr[i-1] > arr[i]) {
                // false if decrease before increase
                if(!increaseFlag) return false;
                decreaseFlag = true;
            } else {
                // always false if equals
                return false;
            }
        }

        return increaseFlag && decreaseFlag;
    }
}
