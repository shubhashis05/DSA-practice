class Solution {
    public int binarySearch(int target , int[] nums){
        int lo = 0 ; 
        int hi = nums.length -1;
        int pos = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target) return mid+1;
            else if(nums[mid] > target) hi = mid-1;
            else{
                pos = mid;
                lo = mid +1;
            }
        }
        if(nums[0] > target) return 0;
        return pos+1;
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        int[] ans = new int[queries.length];
        for(int i = 0 ; i < queries.length ; i++){
            int target = queries[i];
            ans[i] = binarySearch(target,nums);
        }
        return ans;
    }
}