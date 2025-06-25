import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class _226
 {
    private void invert(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invert(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
