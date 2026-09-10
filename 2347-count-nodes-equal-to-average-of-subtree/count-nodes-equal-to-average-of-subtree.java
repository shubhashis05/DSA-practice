class Solution {

    int ans = 0;

    public int[] helper(TreeNode root) {

        if(root == null)
            return new int[]{0, 0};

        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int sum = left[0] + right[0] + root.val;
        int count = left[1] + right[1] + 1;

        int avg = sum / count;

        if(avg == root.val)
            ans++;

        return new int[]{sum, count};
    }

    public int averageOfSubtree(TreeNode root) {

        helper(root);

        return ans;
    }
}