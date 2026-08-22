class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(st.isEmpty() || !st.peek().equals(c)) st.push(c);
            else st.pop();
        }
        StringBuilder ans = new StringBuilder();
        for(char c : st)
            ans.append(c);
        return ans.toString();
    }
}