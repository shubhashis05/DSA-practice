class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String bank = s+s;
        return bank.contains(goal);
    }
}