class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr)
            map.put(ele,map.getOrDefault(ele,0)+1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->
            a[1]-b[1]);
        for(int i : map.keySet()){
            pq.add(new int[]{i,map.get(i)});
            if(pq.size()>k) pq.remove();
        }
        int[] ans = new int[k];
        int i = 0;
        while(!pq.isEmpty())
            ans[i++] = pq.remove()[0];
        return ans;
    }
}