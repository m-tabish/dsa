
// bfs

class _111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;

        while (!q.isEmpty()) {
            int level = q.size();

            for (int i = 0; i < level; i++) {
                TreeNode node = q.poll();
                if (node.left == null && node.right == null)
                    return depth;

                if (node.left == null) {
                    q.offer(node.right);
                }
                if (node.right == null) {
                    q.offer(node.left);
                }

                depth++;

            }
        }

        return depth;

    }
}

/*
 * dfs
 * 
 * 
 * class Solution { public int minDepth(TreeNode root) { return dfs(root); }
 * 
 * private int dfs(TreeNode root){
 * 
 * if(root == null) return 0;
 * 
 * if(root.left == null){ return 1+dfs(root.right); }
 * 
 * if(root.right == null){ return 1+dfs(root.left); } return 1+Math.min(dfs(root.left)
 * ,dfs(root.right)); } }
 * 
 */
