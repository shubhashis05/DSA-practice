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
    public boolean isExists(TreeNode root ,TreeNode temp){
        if(root == null) return false;
        if(root == temp) return true;
        if(isExists(root.left , temp))return true;
        if(isExists(root.right , temp))return true;
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q) return root;
        boolean leftTreeP = isExists(root.left,p);
        boolean leftTreeQ = isExists(root.left,q);
        if(leftTreeP==true && leftTreeQ== true ) return lowestCommonAncestor(root.left,p,q);
        if(leftTreeP==false && leftTreeQ== false ) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}