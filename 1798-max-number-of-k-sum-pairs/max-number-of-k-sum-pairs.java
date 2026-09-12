class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums){
            int rem = k - num;
            if(map.getOrDefault(num,0) == 0){
                int f = map.getOrDefault(rem,0);
                map.put(rem,f+1);
            }
            else{
                int f = map.getOrDefault(num,0);
                if(f>0){
                    count++;
                    map.put(num,f-1);
                }
            }
        }
        return count;
    }
}