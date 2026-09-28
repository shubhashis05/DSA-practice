class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 1) return new int[]{nums[0]};
        int[] pre = new int[nums.length];
        pre[0] = 1;
        pre[1] = nums[0];
        for(int i = 2 ; i < nums.length ; i++){
            pre[i] = pre[i-1]*nums[i-1];
        }
        int n = nums.length;
        int[] suf = new int[n];
        suf[n-1] = 1;
        suf[n-2] = nums[n-1];
        for(int i = n-3 ; i >= 0 ; i--){
            suf[i] = suf[i+1] * nums[i+1];
        }
        for(int i = 0 ; i < n ; i++)
            pre[i] = pre[i]*suf[i];
        return pre;
    }
}