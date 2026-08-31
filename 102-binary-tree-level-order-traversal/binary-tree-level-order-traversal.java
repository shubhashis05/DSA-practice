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
    static class pair{
        TreeNode node;
        int level;
        pair(TreeNode node , int level){
            this.node = node;
            this.level = level;
        }
    }
    public int level(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public void helper(TreeNode root ,  List<List<Integer>> ans){
        Queue<pair> q = new ArrayDeque<>();
        if(root != null) q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p = q.remove();
            TreeNode temp = p.node;
            int level = p.level;
            ans.get(level).add(temp.val);
            if(temp.left != null) q.add(new pair(temp.left,level+1));
            if(temp.right != null) q.add(new pair(temp.right,level+1));
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        int n = level(root);
        for(int i = 0 ; i < n ; i++){
            List<Integer> temp = new ArrayList<>();
            ans.add(temp);
        }
        helper(root,ans);
        return ans;
    }
}