class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : nums1) set1.add(num);
        for(int num : nums2){
            if(set1.contains(num)){
                ans.add(num);
                set1.remove(num);
            }
        }
        int[] ansArray = new int[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++) ansArray[i] = ans.get(i);
        return ansArray;
    }
}