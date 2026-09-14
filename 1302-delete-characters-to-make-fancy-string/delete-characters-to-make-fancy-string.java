class Solution {
    public String makeFancyString(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(st.size() == 0 ||st.peek().equals(ch)){
                st.push(ch);
                if(st.size() > 2) st.pop();
            }   
            if(!st.peek().equals(ch)){
                while(!st.isEmpty()) sb.append(st.pop());
                st.push(ch);
            }
        }
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }
}