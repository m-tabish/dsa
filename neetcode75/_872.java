class _872 {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        push(root1, list1);
        push(root2, list2);

        if (list1.size() != list2.size())
            return false;
        return list1.equals(list2);
    }

    private void push(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        if (root.left == null && root.right == null)
            list.add(root.val);

        push(root.left, list);
        push(root.right, list);
        return;

    }


}
