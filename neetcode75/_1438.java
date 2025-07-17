 
class _1438 {

    public int goodNodes(TreeNode root) {
        if (root == null)
            return 0;

        return dfs(root, Integer.MIN_VALUE);

    }

    private int dfs(TreeNode root, int maxValue) {
        if (root == null)
            return 0;

        maxValue = Math.max(maxValue, root.val);

        return dfs(root.left, maxValue) + dfs(root.right, maxValue)
                + (root.val >= maxValue ? 1 : 0);

    }
}
