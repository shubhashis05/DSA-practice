class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        int tempMax = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            tempMax = Math.max(tempMax,nums[i]);
            ans[i] = (long) tempMax + nums[i];
            if(i!=0){
                ans[i] = ans[i] + ans[i-1]; 
            }
        }
        return ans;
    }
}