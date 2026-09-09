class Solution {
    public int[] array(ArrayList<Integer> list){
        int[] arr = new int[list.size()];
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = list.get(i);
        return arr;
    }
    public TreeNode helper(int[] pre){
        if(pre.length == 0) return null;
        int x = pre[0];
        TreeNode root = new TreeNode(x);
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> hi = new ArrayList<>();
        for(int i = 1 ; i < pre.length ; i++){
            if(pre[i]>x) hi.add(pre[i]);
            else low.add(pre[i]);
        }
        root.left = helper(array(low));
        root.right = helper(array(hi));
        return root;
    }
    public TreeNode bstFromPreorder(int[] pre) {
        TreeNode root = helper(pre);
        return root;
    }
}