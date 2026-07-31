class Solution {
public int findMaxConsecutiveOnes(int[] arr) {
int max = 0;
int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1) {
            count++;              // increase streak
            max = Math.max(max, count);
        } else {
            count = 0;            // reset streak
        }
    }

    return max;
}
}
