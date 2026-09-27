class Solution {
    public int largestAltitude(int[] gain) {
        int[] sum = new int[gain.length+1];
        sum[0] = 0;
        int max = 0;
        for(int i = 1 ; i< sum.length ; i++){
            sum[i] = sum[i-1] + gain[i-1];
            max = Math.max(sum[i],max);
        }
        return max;
    }
}