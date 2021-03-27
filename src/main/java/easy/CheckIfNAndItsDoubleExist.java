package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 */
public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                int absBig = abs(arr[i]) > abs(arr[j]) ? arr[i] : arr[j];
                int absSmall = abs(arr[i]) > abs(arr[j]) ? arr[j] : arr[i];

                if(absBig == absSmall * 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private int abs(int integer) {
        return integer >= 0 ? integer : -integer;
    }

    // set 을 사용한 풀이
    public boolean checkIfExist2(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int val : arr) {
            if (seen.contains(2 * val) || val % 2 == 0 && seen.contains(val / 2))
                return true;
            seen.add(val);
        }
        return false;
    }
}
