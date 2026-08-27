class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeros=0,ones=0;
        for(int x : students){
            if(x == 1) ones++;
            else zeros++;
        }
        for(int x : sandwiches){
            if(x ==0){
                if(zeros == 0) return ones;
                zeros--;
            }
            else{
                if(ones == 0) return zeros;
                ones--;
            }
        }
        return 0;
    }
}