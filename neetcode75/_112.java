class Solution {
    int max = 0;

    public boolean hasPathSum(TreeNode root, int targetSum) {

        return check(root, targetSum, 0);

    }

    private boolean check(TreeNode root, int ts, int cs) {
        if (root == null)
            return false;

        cs += root.val;
        if (root.left == null && root.right == null) {
            return cs == ts;
        }

        return check(root.left, ts, cs) || check(root.right, ts, cs);

    }
}
