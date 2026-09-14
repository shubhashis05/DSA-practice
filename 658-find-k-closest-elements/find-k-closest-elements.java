class Solution {

    class Pair {
        int distance;
        int value;

        Pair(int distance, int value) {
            this.distance = distance;
            this.value = value;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {

            if (a.distance == b.distance)
                return b.value - a.value;

            return b.distance - a.distance;
        });

        for (int i = 0; i < arr.length; i++) {

            int distance = Math.abs(arr[i] - x);

            pq.add(new Pair(distance, arr[i]));

            if (pq.size() > k)
                pq.remove();
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            Pair p = pq.remove();
            ans.add(p.value);
        }

        Collections.sort(ans);

        return ans;
    }
}