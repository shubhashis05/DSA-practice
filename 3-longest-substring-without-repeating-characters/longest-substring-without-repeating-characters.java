class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character , Integer> map = new HashMap<>();
        int max = 0;
        int i = 0 , j = 0;
        while(j<n){
            char ch = s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
                int size = map.size();
                max = Math.max(size,max);
                j++;
            }
            else{
                map.clear();
                i++;
                j = i ;
            }
        }
        return max;
    }
}
