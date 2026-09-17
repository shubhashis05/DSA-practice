class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int i = 0 , j=0;
        int k = 0 ;
        while(j<nums.length){
            if(nums[i] == nums[j]) j++;
            else{
                nums[k++] = nums[j-1];
                i = j;
                j++;
            }
        }
        nums[k++] = nums[i];
        return k;
    }
}