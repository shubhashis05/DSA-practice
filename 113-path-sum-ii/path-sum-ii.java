class Solution {
    public void helper(TreeNode root, int t,List<Integer> temp,List<List<Integer>> ans){
        if(root == null) return ;
        List<Integer> tempCopy = new ArrayList<>(temp);
        tempCopy.add(root.val);
        if(root.val == t && root.left == null && root.right == null){
            ans.add(tempCopy);
             return; // No need to check children for leaf node
        }
        helper(root.left, t-root.val, tempCopy , ans);
        helper(root.right, t-root.val, tempCopy , ans);
    }
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, t, temp , ans);
        return ans;
    }
}