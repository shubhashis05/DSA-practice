class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int target = nums.length/3;
        List<Integer> ans = new ArrayList<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) > target) ans.add(key);
        }
        return ans;
    }
}