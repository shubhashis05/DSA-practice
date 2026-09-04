class Solution {
    public int level(TreeNode root,boolean[] ans){
        if(root == null) return 0;
        int left = level(root.left,ans);
        int right = level(root.right,ans);
        int diff = Math.abs(left-right);
        if(diff > 1) ans[0]=false;
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        boolean[] ans = {true};
        level(root,ans);
        return ans[0];
    }
}