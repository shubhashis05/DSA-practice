class Solution {
    public int pivotIndex(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            arr[i] = arr[i-1]+nums[i];
        }
        for(int i = 0 ; i < arr.length ; i++){
            int leftSum =0;
            if(i>0) leftSum = arr[i-1];
            int rightSum = arr[arr.length-1] - (leftSum+nums[i]);
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}