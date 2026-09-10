class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i < arr.size() ; i++){
            int dif = Math.abs(arr.get(i-1)-arr.get(i));
            if(dif == 1) return 1;
            min = Math.min(dif,min); 
        }
        return min;
    }
}