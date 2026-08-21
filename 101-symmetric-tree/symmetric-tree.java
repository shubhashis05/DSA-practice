/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isMirror(TreeNode p ,TreeNode q){
        if(p == null && q == null) return true;
        if(p == null && q != null) return false;
        if(p != null && q == null) return false;

        if(p.val != q.val) return false;
        if(isMirror(p.right,q.left) == false) return false;
        if(isMirror(p.left,q.right) == false) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.right , root.left);
    }
}