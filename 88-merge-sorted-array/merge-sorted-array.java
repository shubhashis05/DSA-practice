class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int[] ans = new int[arr1.length];
        int i = 0 , j = 0,k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;k++;
            }
            else{
                ans[k]=arr2[j];
                j++;k++;
            }
        }
        while(i<m){
            ans[k]=arr1[i];
            k++;i++;
        }
        while(j<n){
            ans[k]=arr2[j];
            k++;j++;
        }
        for( i = 0 ; i < m+n ;i++)
            arr1[i] = ans[i];
    }
}