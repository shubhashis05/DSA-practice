class Solution {
    public void helper(TreeNode root,ArrayList<Integer> arr){
        if(root == null) return;
        helper(root.left,arr);
        arr.add(root.val);
        if (arr.size()>=2){
            if(arr.get(arr.size() - 2) >= arr.get(arr.size() - 1)) return;
        }
        helper(root.right,arr);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root,arr);
        for(int i = 1; i < arr.size(); i++){ if(arr.get(i - 1) >= arr.get(i)){ return false; } }
        return true;
    }
}