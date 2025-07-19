
class Solution {
    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);

        return count;
    }

    private int[] dfs(TreeNode root) {
        if (root == null)
            return new int[] {0, 0}; // {sum , count of nodes};

        int[] leftPair = dfs(root.left);
        int[] rightPair = dfs(root.right);

        int sum = leftPair[0] + rightPair[0] + root.val;
        int countNodes = leftPair[1] + rightPair[1] + 1;

        if (sum / countNodes == root.val)
            count++;
        return new int[] {sum, countNodes};

    }
}
