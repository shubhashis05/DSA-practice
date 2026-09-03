class Solution {
    class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 1));

        while (!q.isEmpty()) {
            Pair p = q.remove();
            TreeNode node = p.node;

            // First leaf found = minimum depth
            if (node.left == null && node.right == null) {
                return p.level;
            }

            if (node.left != null)
                q.add(new Pair(node.left, p.level + 1));

            if (node.right != null)
                q.add(new Pair(node.right, p.level + 1));
        }

        return 0;
    }
}