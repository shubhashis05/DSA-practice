class Solution {
    public int helper(int[] arr , int n , int[] dp ){
        if(n >=arr.length) return 0;
        if(dp[n] != -1) return dp[n];
        int take = arr[n] + helper(arr,n+2,dp);
        int skip = helper(arr,n+1,dp);
        return dp[n] = Math.max(take,skip);
    } 
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
}