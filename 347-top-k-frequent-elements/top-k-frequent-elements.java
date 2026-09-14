class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->
        a[1]-b[1]
        );
        for(int num : map.keySet()){
            pq.add(new int[]{num,map.get(num)});
            if(pq.size()>k) pq.remove();
        }
        int i =0;
        while(i<k){
            int[] temp = pq.remove();
            ans[i++]=temp[0];
        }
        return ans;
    }
}