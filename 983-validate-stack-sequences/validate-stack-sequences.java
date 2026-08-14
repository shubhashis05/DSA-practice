class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int n = pushed.length;
        int i = 0, j = 0;

        while (i < n) {
            st.push(pushed[i]);
            while (!st.isEmpty() && st.peek().equals(popped[j])) {
                st.pop();
                j++;
            }
            i++;
        }

        while (j < n) {
            int val = st.pop();
            if (val != popped[j]) return false;
            j++;
        }

        return true;
    }
}