class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 0 , j = 0 , k = 0 ;
        while(k<arr.length){
            if(arr[j] == arr[k]){
                k++;
            }
            else{
                arr[i]= arr[j];
                j = k;
                i++;
            }
        }
        arr[i]=arr[j];
        return i+1;
    }
}