class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];

            return b[0] - a[0];
        });
        for (int i = 0; i < arr.length; i++) {
            int dis = Math.abs(arr[i] - x);
            int[] temp = { dis, arr[i] };
            pq.add(temp);
            if (pq.size() > k)
                pq.remove();
        }
        List<Integer> ans = new ArrayList<>();
        while (pq.size() > 0) {
            int[] temp = pq.remove();
            ans.add(temp[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}