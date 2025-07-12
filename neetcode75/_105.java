import java.util.HashMap;
import javax.swing.tree.TreeNode;

class _105 {
    private int preorderIndex = 0;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        preorderIndex = 0;
        TreeNode root = build(preorder, inorder, 0, inorder.length - 1);
        return root;
    }

    private TreeNode build(int[] preorder, int[] inorder, int start, int end) {
        if (start > end)
            return null;
        int rootVal = preorder[preorderIndex++];


        int mid = map.get(rootVal);
        root.left = build(preorder, inorder, start, mid - 1);
        root.right = build(preorder, inorder, mid + 1, end);

        return root;

    }
}
