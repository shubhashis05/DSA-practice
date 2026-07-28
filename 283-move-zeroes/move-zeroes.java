class Solution {
    public void moveZeroes(int[] arr) {
        int i = 0 , j = 0 ,n =arr.length ;
        if( n <= 1) return;
        while(i < n){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
        for(int k = j ; k < n ; k++) arr[k] = 0;
    }
}