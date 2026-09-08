class Solution {
    public int sum(TreeNode root) {
        if (root == null)
            return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public void helper(TreeNode root, int[] totalSum) {
        if (root == null)
            return;
        helper(root.left, totalSum);
        int temp = root.val;
        root.val = totalSum[0];
        totalSum[0] -= temp;
        helper(root.right, totalSum);
    }

    public TreeNode convertBST(TreeNode root) {
        int totalSum = sum(root);
        helper(root, new int[] { totalSum });
        return root;
    }
}