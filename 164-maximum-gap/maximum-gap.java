class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length == 1) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
        }
        int max = 0;
        int prev = pq.remove();
        while(!pq.isEmpty()){
            int current = pq.remove();
            max = Math.max(max,current - prev);
            prev = current;
        }
        return max;
    }
}