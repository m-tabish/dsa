
class _106 {
    int postidx = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        postidx = postorder.length - 1;
        TreeNode root = dfs(inorder, postorder, 0, postorder.length - 1);

        return root;
    }

    private TreeNode dfs(int[] inorder, int[] postorder, int start, int end) {
        if (start > end)
            return null;

        int rootVal = postorder[postidx--];
        int mid = map.get(rootVal);
        TreeNode root = new TreeNode(rootVal);

        root.right = dfs(inorder, postorder, mid + 1, end);
        root.left = dfs(inorder, postorder, start, mid - 1);
        return root;

    }
}
