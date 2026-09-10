class Solution {

    public void inorder(TreeNode root, int[] prev, int[] min) {
        if(root == null) return;

        inorder(root.left, prev, min);

        if(prev[0] != -1) {
            min[0] = Math.min(min[0], root.val - prev[0]);
        }

        prev[0] = root.val;

        inorder(root.right, prev, min);
    }

    public int minDiffInBST(TreeNode root) {
        int[] prev = {-1};
        int[] min = {Integer.MAX_VALUE};

        inorder(root, prev, min);

        return min[0];
    }
}