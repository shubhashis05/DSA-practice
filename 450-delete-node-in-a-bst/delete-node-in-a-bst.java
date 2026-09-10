
class Solution {
    public TreeNode predecessor(TreeNode root){
        TreeNode temp = root.left;
        while(temp.right != null) temp = temp.right;
        return temp;
    }
    public TreeNode parentOfPredecessor(TreeNode root, TreeNode predecessor){
        if(root.left == predecessor || root.right == predecessor) return root;
        TreeNode temp = root.left;
        while(temp.right.right != null) temp = temp.right;
        return temp;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if(root.val == key){
            // if it is leaf node
            if(root.left == null && root.right == null) return null;
            // if root have 1 child
            else if(root.left == null || root.right == null){
                if(root.left == null) return root.right;
                else return root.left;
            }
            // if root have two child
            else{
                TreeNode predecessor = predecessor(root);
                TreeNode parentOfPredecessor = parentOfPredecessor(root,predecessor);
                if(root == parentOfPredecessor){
                    predecessor.right = root.right;
                    return predecessor;
                }
                parentOfPredecessor.right = predecessor.left;
                predecessor.left= root.left;
                predecessor.right= root.right;
                return predecessor;
            }

        }
        else if(root.val > key){
            root.left = deleteNode(root.left,key);
        }
        else{
            root.right = deleteNode(root.right,key);
        }
        return root;
    }
}