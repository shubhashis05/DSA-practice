class Solution {
    public String predictPartyVictory(String s) {
        int n = s.length();
        if(n == 1){
            if(s.charAt(0) == 'R') return "Radiant";
            return "Dire";
        }
        Queue<Integer> r = new ArrayDeque<>();
        Queue<Integer> d = new ArrayDeque<>();
        int i = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'R') r.add(i);
            else d.add(i);
            i++;
        }
        while(!r.isEmpty() && !d.isEmpty()){
            int rPos = r.poll();
            int dPos = d.poll();
            if(rPos<dPos){
                r.add(i++);
            }
            else{
                d.add(i++);
            }
        }
        if(r.isEmpty()) return "Dire";
        return "Radiant";
    }
}