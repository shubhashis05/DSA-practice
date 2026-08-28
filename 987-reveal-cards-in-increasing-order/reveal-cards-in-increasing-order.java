class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0 ; i < deck.length ; i++){
            q.add(i);
        }
        int j =0;
        int[] ans = new int[deck.length];
        while(!q.isEmpty()){
            int temp = q.poll();
            ans[temp] = deck[j++];
            if(!q.isEmpty()) q.add(q.poll());
        }
        return ans;
    }
}