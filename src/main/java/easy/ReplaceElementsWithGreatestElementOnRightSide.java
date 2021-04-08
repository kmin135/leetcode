package easy;

/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    /*
     내 첫번째 풀이
     0부터 순회하면서 구간최대값을 갱신하면서 발견한 최대값 인덱스에 도달하기 전까지는
     구간최대값을 사용하므로 대부분의 경우 O(n^2) 보다는 빠르다.
     하지만 내림차순 정렬된 arr이 들어오면 O(n^2) 다.
     그리고 코드가 더럽다.
     */
    public int[] replaceElements(int[] arr) {
        int maxIndex = 0;
        for(int i=0;i<arr.length-1;i++) {
            if(i == maxIndex) {
                arr[i] = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[maxIndex] < arr[j]) {
                        maxIndex = j;
                    }
                }
            }
            arr[i] = arr[maxIndex];
        }
        arr[arr.length-1] = -1;
        return arr;
    }

    /*
    다른 유저 답안 중 O(n) 에 로직도 간결한 답이 있어 퍼옴.
    거꾸로 순회하는 아이디어도 좋고
    A[i]로 첫번째 파라미터를 먼저 넘기고
    A[i] = mx 할당문을 두번째 파라미터로 넘기며 라인수를 줄이는 기교도 멋지다.
     */
    public int[] replaceElements2(int[] A) {
        for (int i = A.length - 1, mx = -1; i >= 0; --i)
            mx = Math.max(A[i], A[i] = mx);
        return A;
    }
}
