class Solution {
    class triplets implements Comparable<triplets>{
        int d ;
        int x ;
        int y;
        triplets(int d , int x ,int y){
            this.d = d;
            this.x = x;
            this.y = y;
        }
        public int compareTo(triplets t){
            return this.d - t.d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<triplets> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < points.length ; i++){
            int x = points[i][0];
            int y = points[i][1];
            int d = x*x + y*y;
            pq.add(new triplets(d,x,y));
            if(pq.size() > k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for(int i = 0 ; i < k ; i++){
            triplets t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
    }
}