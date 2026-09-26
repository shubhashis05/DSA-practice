class Solution {
    public void reverse(int pos1 , int pos2 , int[] arr){
        while(pos1<pos2){
            int temp = arr[pos2];
            arr[pos2] = arr[pos1];
            arr[pos1] = temp;
            pos1++;
            pos2--;
        }
    }
    public void rotate(int[] arr, int k) {
        k = k % arr.length;
        if(k == 0) return;
        reverse(arr.length-k,arr.length-1,arr);
        reverse(0,arr.length-k-1,arr);
        reverse(0,arr.length-1,arr);
    }
}