class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0 ; i < stones.length ; i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int y = pq.remove();
            int x = pq.remove();
            int dif = y-x;
            if(dif != 0) pq.add(dif);
        }
        if(pq.isEmpty()) return 0;
        return pq.peek();
    }
}