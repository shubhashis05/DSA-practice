class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int rem = k - nums[i];
            if (map.getOrDefault(rem, 0) == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            } else {
                int f = map.get(rem);
                map.put(rem, f - 1);
                count++;
            }
        }
        return count;
    }
}