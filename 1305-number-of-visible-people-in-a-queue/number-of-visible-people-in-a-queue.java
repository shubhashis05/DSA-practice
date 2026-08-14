class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        // st.push(0);
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                int indx = st.pop();
                ans[indx]++;
            }
            if(!st.isEmpty()){
                ans[st.peek()]++;
            }
            st.push(i);
        }
        return ans;
    }
}