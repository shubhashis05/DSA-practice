class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);

            if (map1.containsKey(sch) && map1.get(sch) != tch) {
                return false;
            }

            if (map2.containsKey(tch) && map2.get(tch) != sch) {
                return false;
            }

            map1.put(sch, tch);
            map2.put(tch, sch);
        }

        return true;
    }
}