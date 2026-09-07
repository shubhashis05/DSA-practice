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
    public void helper(TreeNode root , int k , ArrayList<Integer> arr){
        if(root == null) return ;
        helper(root.left , k , arr);
        arr.add(root.val);
        if(arr.size() == k) return ;
        helper(root.right , k , arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root,k,arr);
        return arr.get(k-1);
    }
}