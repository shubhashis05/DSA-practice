class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(char ch : s.toCharArray())
            smap.put(ch,smap.getOrDefault(ch,0)+1);
        for(char ch : t.toCharArray())
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        if(smap.size() != tmap.size()) return false;
        for(char ch : smap.keySet()){
            if(!tmap.containsKey(ch)) return false;
            else{
                int s_length = smap.get(ch);
                int t_length = tmap.get(ch);
                if(s_length != t_length) return false;
            }
        } return true;
    }
}