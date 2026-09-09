class Solution {
    public static TreeNode helper(int[] pre, int[] in,
                                  int lop, int hip,
                                  int loi, int hii) {

        if(lop > hip || loi > hii) return null;

        int nVal = pre[lop];
        int pos = 0;

        for(int i = loi; i <= hii; i++){
            if(in[i] == nVal){
                pos = i;
                break;
            }
        }

        // Number of nodes in left subtree
        int leftSize = pos - loi;

        TreeNode node = new TreeNode(nVal);

        // Left subtree
        node.left = helper(pre, in,
                           lop + 1,
                           lop + leftSize,
                           loi,
                           pos - 1);

        // Right subtree
        node.right = helper(pre, in,
                            lop + leftSize + 1,
                            hip,
                            pos + 1,
                            hii);

        return node;
    }

    public TreeNode bstFromPreorder(int[] preorder) {

        int n = preorder.length;

        int[] inorder = preorder.clone();
        Arrays.sort(inorder);

        TreeNode root = helper(preorder, inorder,
                               0, n - 1,
                               0, n - 1);

        return root;
    }
}