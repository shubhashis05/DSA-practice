class Solution {
    public void helper(TreeNode root, TreeNode node){
        if(root == null) return ;
        if(root.val < node.val){
            helper(root.right,node);
        }
        else if(root.val > node.val){
            helper(root.left,node);
        }
        if(root.left == null || root.right == null){
            if(root.val>node.val){
               if(root.left == null){
                root.left = node;
                return;
               } 
            }
            else{
                if(root.right == null){
                    root.right = node;
                    return;
                } 
            }
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if(root == null) return node;
        helper(root,node);
        return root;
    }
}