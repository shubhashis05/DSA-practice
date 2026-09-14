class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
            map.put(num,map.getOrDefault(num,0)+1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->
        {if(a[1]==b[1]) return b[0]-a[0];
        else return a[1]-b[1];}
        );
        for(int n : map.keySet())
            pq.add(new int[]{n,map.get(n)});
            
        int[] ans = new int[nums.length];
        int i =0;
        while(pq.size()>0){
            int[] temp = pq.remove();
            for(int j = 0 ; j < temp[1] ;j++)
                ans[i++] = temp[0];
        }
        return ans;
    }
}