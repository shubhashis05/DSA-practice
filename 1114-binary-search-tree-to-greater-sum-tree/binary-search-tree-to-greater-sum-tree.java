class Solution {
        public void helper(TreeNode root, int[] x) {
            if (root == null)
                return;
            helper(root.right, x);
            root.val = x[0] + root.val;
            x[0] = root.val;
            helper(root.left, x);
        }

        public TreeNode bstToGst(TreeNode root) {
            int[] arr = {0};
            helper(root, arr);
            return root;
        }
}