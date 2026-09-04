class Solution {
    public int level(TreeNode root,int[] ans){
        if(root == null) return 0;
        int right = level(root.right,ans);
        int left = level(root.left,ans);
        int dia = right+left;
        ans[0] = Math.max(dia,ans[0]);
        return 1+Math.max(right,left);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans ={0};
        level(root,ans);
        return ans[0];        
    }
}