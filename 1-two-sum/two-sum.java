class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = {-1,-1};
        for(int i = 0; i < nums.length ; i++){
            int remain = target-nums[i];
            if(map.size() == 0 || !map.containsKey(nums[i]))
                map.put(remain,i);
            else{
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}