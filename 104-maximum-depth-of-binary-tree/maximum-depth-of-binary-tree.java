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
    class pair{
        TreeNode node;
        int level;
        pair(TreeNode node,int level){
            this.node = node;
            this.level = level;
        }
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        Queue<pair> q = new LinkedList<>();
        int lev = 1;
        int max = 1;
        q.add(new pair(root,1));
        while(!q.isEmpty()){
            pair p = q.remove();
            TreeNode temp = p.node;
            max = Math.max(max,p.level);
            if(temp.left != null) q.add(new pair(temp.left,p.level+1));
            if(temp.right != null) q.add(new pair(temp.right,p.level+1));
        }
        return max;
    }
    public int maxDepth(TreeNode root) {
        int max = helper(root);
        return max;
    }
}