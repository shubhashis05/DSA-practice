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
        int level = 0;
        pair(TreeNode node , int level){
            this.node = node;
            this.level = level;
        }
    }
    public int level(TreeNode root){
        if(root == null) return 0;
        return 1+ Math.max(level(root.left) , level(root.right));
    }
    public static void helper(TreeNode root , List<List<Integer>> ans){
        if(root == null) return ;
        Queue<pair> q = new ArrayDeque<>();
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p = q.remove();
            TreeNode temp = p.node;
            ans.get(p.level).add(temp.val);
            if(temp.left != null) q.add(new pair(temp.left, p.level+1));
            if(temp.right != null) q.add(new pair(temp.right, p.level+1));
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int n = level(root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
            ans.add(new ArrayList<>()); 
        helper(root,ans);
         // Reverse odd levels
        for (int i = 1; i < n; i += 2) {
            Collections.reverse(ans.get(i));
        }
        return ans;
    }
}