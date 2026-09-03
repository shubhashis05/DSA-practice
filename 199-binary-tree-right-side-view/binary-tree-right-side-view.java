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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<pair> q = new ArrayDeque<>();
        q.add(new pair(root,0));
        int prvLev = -1;
        while(!q.isEmpty()){
            pair p = q.remove();
            TreeNode temp = p.node;
            if(prvLev != p.level){
                ans.add(temp.val);
                prvLev = p.level;
            }
            else{
                ans.set(p.level,temp.val);
            }
            if(temp.left != null) q.add(new pair(temp.left,p.level+1));
            if(temp.right != null) q.add(new pair(temp.right,p.level+1));
        }
        return ans;
    }
}