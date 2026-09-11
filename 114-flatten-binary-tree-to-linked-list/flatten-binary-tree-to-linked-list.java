class Solution {
    public TreeNode helper(TreeNode root){
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;
        TreeNode leftSubTree = root.left;
        TreeNode rightSubTree = root.right;
        root.left = null ; root.right = null;
        root.right = helper(leftSubTree);
        TreeNode temp= root;
        while(temp.right != null){
            temp = temp.right;
        }
        temp.right = helper(rightSubTree);
        return root;
    }
    public void flatten(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return;
        helper(root);
    }
}