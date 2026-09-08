class Solution {
    static int totalSum;
    public int sum(TreeNode root){
        if(root == null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        int temp = root.val;
        root.val = totalSum;
        totalSum -= temp;
        helper(root.right);
    }
    public TreeNode bstToGst(TreeNode root) {
        totalSum = sum(root);
        helper(root);
        return root;
    }
}