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
    public int level(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public void nthLevel(TreeNode root , int i , int level ,List<Integer> temp){
        if(root == null) return;
        if(i == level){
            temp.add(root.val);
            return;
        }
        if(i>level){
            nthLevel(root.left,i,level+1,temp);
            nthLevel(root.right,i,level+1,temp);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        int n = level(root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            List<Integer> temp = new ArrayList<>();
            nthLevel(root,i,0,temp);
            ans.add(temp);
        }
        return ans;
    }
}