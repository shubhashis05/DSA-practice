class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = s.length() - 1 ; i >=0 ; i--){
            char ch = s.charAt(i);
            if(ch!=' '){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    while(!st.isEmpty())
                        sb.append(st.pop());
                    sb.append(' ');
                }
            }
        }
        if(st.isEmpty()){
            int i = sb.length()-1;
            while(true){
                char ch = sb.charAt(i);
                if(ch == ' ') sb.deleteCharAt(i);
                else break;
                i--;
            }
        }
        else{
            while(!st.isEmpty())
                sb.append(st.pop());
        }
        return sb.toString();
    }
}