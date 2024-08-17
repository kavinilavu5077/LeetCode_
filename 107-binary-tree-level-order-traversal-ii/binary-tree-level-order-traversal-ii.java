

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            int q_size = q.size();
            List<Integer> li = new ArrayList<>();
            
            for (int i = 0; i < q_size; i++) {
                TreeNode temp = q.poll();
                li.add(temp.val);
                
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            
            list.add(li);
        }
        
        // Reverse the list to get bottom-up order
        Collections.reverse(list);
        
        return list;
    }
}
