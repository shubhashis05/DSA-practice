class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        //if(len %2 != 0) return false;
        Stack<Character> st = new Stack();
        char ch;
        for(int i = 0 ; i< len ; i++){
            ch = s.charAt(i);
            if(ch == '(' || ch == '{' ||ch == '[')
                st.push(ch);
            else{
                if(st.size() == 0) return false;
                if(ch == '}'){
                    if(st.peek() == '{') st.pop();
                    else return false;
                }
                else if(ch == ')'){
                    if(st.peek() == '(') st.pop();
                    else return false;
                }
                else if(ch == ']'){
                    if(st.peek() == '[') st.pop();
                    else return false;
                }
            }
        }
        if(st.size() == 0) return true;
        return false;
    }
}