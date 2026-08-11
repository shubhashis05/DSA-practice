class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        int lse[] = new int[n];
        int rse[] = new int[n];
        Stack <Integer> st =  new Stack<>();
        lse[0] = 0;
        st.push(0);
        for(int i = 1 ; i< n ; i++){
            boolean flag = false;
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
                flag = true;
            }
            if(st.isEmpty()) lse[i] = 0;
            else if(flag) lse[i] = st.peek()+1;
            else lse[i] = i;
            st.push(i); 
        }
        st.clear();
        rse[n-1] = n-1;
        st.push(n-1);
        for(int i = n-2;i>=0;i--){
           boolean flag = false;
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
                flag = true;
            } 
            if(st.isEmpty()) rse[i] = n-1;
            else if(flag) rse[i] = st.peek()-1;
            else rse[i] = i;
            st.push(i);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            int value = arr[i] * (rse[i]-lse[i]+1);
            max = Math.max(value,max);
        }
        return max;
    }
}