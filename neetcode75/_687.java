import javax.swing.tree.TreeNode;

class _687 {
    int maxPath = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null)
            return 0;

        check(root);
        return maxPath;
    }

    private int check(TreeNode root) {
        if (root == null)
            return 0;

        int left = check(root.left);
        int right = check(root.right);

        int leftPath = 0, rightPath = 0;
        if (root.left != null && root.left.val == root.val)
            leftPath = 1 + left;
        if (root.right != null && root.right.val == root.val)
            rightPath = 1 + right;

        maxPath = Math.max(maxPath, leftPath + rightPath);
        return Math.max(leftPath, rightPath);
    }
}
