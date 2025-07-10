/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class _103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean changeDir = false;
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, false, ans, 0);
        return ans;
    }

    private void dfs(TreeNode root, boolean changeDir, List<List<Integer>> ans, int level) {
        if (root == null) {
            return;
        }
        if (ans.size() == level) {
            ans.add(new ArrayList<>());
        }
        if (level % 2 != 0) {
            ans.get(level).addFirst(root.val);

        } else {
            ans.get(level).addLast(root.val);
        }
        dfs(root.left, changeDir, ans, level + 1);
        dfs(root.right, changeDir, ans, level + 1);
    }

}
