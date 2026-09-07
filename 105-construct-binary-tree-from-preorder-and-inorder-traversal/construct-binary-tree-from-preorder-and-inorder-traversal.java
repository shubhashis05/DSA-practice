class Solution {
    public TreeNode helper(int[] p, int[] i,int lop,int hip,int loi,int hii){
        if(hip<=lop ) return null;
        TreeNode root = new TreeNode(p[lop]);
        int pos=0;
        for(int x = loi; x<hii ; x++){
            if(p[lop] == i[x]){
                 pos = x;
                 break;
            }
        }
         // Number of nodes in left subtree
        int leftSize = pos - loi;

        // Left subtree
        root.left = helper(
            p, i,lop + 1,lop + 1 + leftSize,loi,pos
        );

        // Right subtree
        root.right = helper(
            p, i,lop + 1 + leftSize,hip,pos + 1,hii
        );

        return root;
    }
    public TreeNode buildTree(int[] p, int[] i) {
        int plen = p.length;
        int ilen = i.length;
        TreeNode root = helper(p,i,0,plen,0,ilen);
        return root;
    }
}