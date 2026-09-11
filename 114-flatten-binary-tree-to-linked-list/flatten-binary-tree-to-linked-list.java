class Solution {
    public void helper(TreeNode root,ArrayList<TreeNode> arr ){
        if(root == null) return;
        arr.add(root);
        helper(root.left,arr);
        helper(root.right,arr);
    }
    public void flatten(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return;
        ArrayList<TreeNode> arr = new ArrayList<>();
        helper(root,arr);
        for(int i = 1 ; i < arr.size() ; i++){
            TreeNode temp = arr.get(i-1);
            temp.left = null;
            temp.right = arr.get(i);
        }
    }
}