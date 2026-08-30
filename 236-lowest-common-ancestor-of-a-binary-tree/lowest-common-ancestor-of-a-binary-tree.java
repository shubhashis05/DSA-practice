/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isexits(TreeNode root,TreeNode x){
        if(root == null) return false;
        if(root == x) return true;
        return isexits(root.left , x) || isexits(root.right,x);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p == root || q == root) return root;
        boolean leftp = isexits(root.left,p);
        boolean leftq = isexits(root.left,q);
        if(leftp && leftq) return lowestCommonAncestor(root.left,p,q);
        if(!leftp && !leftq) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}