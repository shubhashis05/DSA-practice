class Solution {
    public int bestClosingTime(String customers) {
        int[] no = new int[customers.length()+1];
        no[0] = 0;
        for(int i = 1 ; i < no.length ; i++){
            char ch = customers.charAt(i-1);
            if(ch == 'N') no[i] = no[i-1]+1;
            else no[i] = no[i-1];
        }
        int[] yes = new int[customers.length()+1];
        yes[yes.length-1] = 0;
        int len = customers.length()-1;
        for(int i = yes.length -2 ; i>=0 ;i--){
            char ch = customers.charAt(len--);
            if(ch == 'Y') yes[i] = yes[i+1] +1;
            else yes[i] = yes[i+1];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < yes.length ; i++){
            yes[i] = yes[i]+no[i];
            min = Math.min(min,yes[i]);
        }
        for(int i =0  ; i < yes.length ; i ++){
            if(min == yes[i]) return i;
        }
        return -1;
    }
}