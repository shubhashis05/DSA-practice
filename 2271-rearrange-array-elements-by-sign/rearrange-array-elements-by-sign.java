class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int x = 0 , j = 1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]>0){
                ans[x] = arr[i];
                x+=2;
            }
            else{
                ans[j] =arr[i];
                j+=2;
            }
        }
        return ans;
    }
}