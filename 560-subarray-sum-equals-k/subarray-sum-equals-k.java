class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        for(int num : arr){
            if(num == k) count++;
            int rem  = num-k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }
}