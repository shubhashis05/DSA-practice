class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2 ; i>=0 ; i--){
            prefixSum[i]=nums[i] + prefixSum[i+1];
        }
        int sum = 0 ;
        for(int i = 0 ; i < nums.length-1; i++){
            if(sum == prefixSum[i+1]) return i;
            sum+=nums[i];
        }
        if (sum == 0)
            return nums.length - 1;
        return -1;
    }
}