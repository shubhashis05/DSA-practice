class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long predSum = (n*(n+1))/2;
        long actualSum = 0;
        for(int num : nums)
           actualSum+=num;
        int ans = (int)(predSum-actualSum);
        return ans;
    }
}