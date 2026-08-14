class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        // Array-based stack
        int[] stack = new int[n];
        int top = -1;

        for (int i = n - 1; i >= 0; i--) {

            // Every shorter person can be seen
            while (top >= 0 && arr[i] > arr[stack[top]]) {
                ans[i]++;
                top--;
            }

            // First taller/equal person can also be seen
            if (top >= 0) {
                ans[i]++;
            }

            // Push current index
            stack[++top] = i;
        }

        return ans;
    }
}