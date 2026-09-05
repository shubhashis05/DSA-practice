class Solution {
    public int level(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    class pair{
        TreeNode node;
        int level;
        pair(TreeNode node,int level){
            this.node = node;
            this.level = level;
        }
    } 
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        int n = level(root);
        for(int i = 0 ; i< n ;i++){
            ans.add(new ArrayList<>());
        }
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p = q.remove();
            TreeNode temp = p.node;
            ans.get(p.level).add(temp.val);
            if(temp.left != null) q.add(new pair(temp.left,p.level+1));
            if(temp.right != null) q.add(new pair(temp.right,p.level+1));
        }
        return ans;
    }
}